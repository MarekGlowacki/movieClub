package online.javafun.movieclub.web;

import online.javafun.movieclub.domain.rating.RatingService;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RatingController {
    private final RatingService ratingService;

    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @PostMapping("/rate-movie")
    public String addMovieRating(@RequestParam long movieId,
                                 @RequestParam int rating,
                                 @RequestHeader String referer,
                                 Authentication authentication) {
        String currentUserEmail = authentication.getName();
        ratingService.addOrUpdateRating(currentUserEmail, movieId, rating);
        return "redirect:" + referer;
    }
}
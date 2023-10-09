package online.javafun.movieclub.web;
import online.javafun.movieclub.domain.movie.MovieService;
import online.javafun.movieclub.domain.movie.dto.MovieDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    private final MovieService movieService;

    public HomeController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<MovieDto> promotedMovies = movieService.findAllPromotedMovies();
        model.addAttribute("heading", "Promoted movies");
        model.addAttribute("description", "Movies we recommend");
        model.addAttribute("movies", promotedMovies);
        return "movie-listing";
    }
}
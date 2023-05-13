package online.javafun.movieclub.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "file")
public class FileStorageProperties {

    private String directory = "/home/user/uploads";

    public String getUploadDir() {
        return directory;
    }

    public void setUploadDir(String directory) {
        this.directory = directory;
    }
}

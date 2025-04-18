package com.graduationproject.asem.Images;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.graduationproject.asem.Advertisement.Advertisement;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String url;
    @ManyToOne
    @JoinColumn(name = "advertisement_id")
    @JsonIgnore
    private Advertisement advertisement;

    public Image() {
    }

    public Image(UUID id, String url, Advertisement advertisement) {
        this.id = id;
        this.url = url;
        this.advertisement = advertisement;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Advertisement getAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(Advertisement advertisement) {
        this.advertisement = advertisement;
    }
}
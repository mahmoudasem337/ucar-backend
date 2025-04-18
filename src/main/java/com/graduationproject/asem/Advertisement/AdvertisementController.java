package com.graduationproject.asem.Advertisement;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/advertisements")
public class AdvertisementController {

    private final AdvertisementService advertisementService;
    public AdvertisementController(AdvertisementService advertisementService) {
        this.advertisementService = advertisementService;
    }

    @PostMapping
    public void addAdvertisement( AdvertisementRequest advertisementRequest) {
        advertisementService.addAdvertisement(advertisementRequest);
    }

    @GetMapping
    public List<AdvertisementResponse> getAllAdvertisements() {
        return advertisementService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteAdvertisement(@PathVariable Long id){
    advertisementService.DeleteAdvertisement(id);
    }

    @GetMapping("/{id}")
    public Optional<AdvertisementResponse> getAdvertisement(@PathVariable Long id){
        return advertisementService.getAdvertisementById(id);
    }

    @PutMapping
    public void updateAdvertisement(@RequestBody AdvertisementUpdateDto advertisementUpdateDto) {
        advertisementService.updateAdvertisement(advertisementUpdateDto);
    }
}

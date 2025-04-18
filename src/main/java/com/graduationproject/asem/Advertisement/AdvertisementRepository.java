package com.graduationproject.asem.Advertisement;

import com.graduationproject.asem.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AdvertisementRepository extends JpaRepository<Advertisement,Long> {
    List<Advertisement>findAllByOwner(User owner);
    Optional<Advertisement> findById(Long id);

}

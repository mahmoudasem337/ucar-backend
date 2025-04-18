package com.graduationproject.asem.Advertisement;
import com.graduationproject.asem.Images.Image;
import com.graduationproject.asem.User.User;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table
public class Advertisement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advertisementid;
    @ManyToOne
    @JoinColumn(name = "ownerid" , referencedColumnName = "id")
    private User owner;
    private String ownerlocation;
    private String ownerphonenumber;
    private String cardescription;
    private BigDecimal carprice;
    private String carmodel;
    private String carmake;
    private int carproductionyear;
    private String carbodytype;
    private String carfueltype;
    private String cartransmissiontype;
    private String carcolor;
    private BigDecimal enginecapacity;
    private BigDecimal kilometers;
    private LocalDateTime CreatedAt;
    @OneToMany(mappedBy = "advertisement", cascade = CascadeType.ALL, orphanRemoval = true)

    private List<Image> images;

    public Advertisement() {
    }

    public Advertisement(Long advertisementid, User owner, String ownerlocation, String ownerphonenumber, String cardescription, BigDecimal carprice, String carmodel, String carmake, int carproductionyear, String carbodytype, String carfueltype, String cartransmissiontype, String carcolor, BigDecimal enginecapacity, BigDecimal kilometers, LocalDateTime createdAt, List<Image> images) {
        this.advertisementid = advertisementid;
        this.owner = owner;
        this.ownerlocation = ownerlocation;
        this.ownerphonenumber = ownerphonenumber;
        this.cardescription = cardescription;
        this.carprice = carprice;
        this.carmodel = carmodel;
        this.carmake = carmake;
        this.carproductionyear = carproductionyear;
        this.carbodytype = carbodytype;
        this.carfueltype = carfueltype;
        this.cartransmissiontype = cartransmissiontype;
        this.carcolor = carcolor;
        this.enginecapacity = enginecapacity;
        this.kilometers = kilometers;
        CreatedAt = createdAt;
        this.images = images;
    }

    public Long getAdvertisementid() {
        return advertisementid;
    }

    public void setAdvertisementid(Long advertisementid) {
        this.advertisementid = advertisementid;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String getOwnerlocation() {
        return ownerlocation;
    }

    public void setOwnerlocation(String ownerlocation) {
        this.ownerlocation = ownerlocation;
    }

    public String getOwnerphonenumber() {
        return ownerphonenumber;
    }

    public void setOwnerphonenumber(String ownerphonenumber) {
        this.ownerphonenumber = ownerphonenumber;
    }

    public String getCardescription() {
        return cardescription;
    }

    public void setCardescription(String cardescription) {
        this.cardescription = cardescription;
    }

    public BigDecimal getCarprice() {
        return carprice;
    }

    public void setCarprice(BigDecimal carprice) {
        this.carprice = carprice;
    }

    public String getCarmodel() {
        return carmodel;
    }

    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel;
    }

    public String getCarmake() {
        return carmake;
    }

    public void setCarmake(String carmake) {
        this.carmake = carmake;
    }

    public int getCarproductionyear() {
        return carproductionyear;
    }

    public void setCarproductionyear(int carproductionyear) {
        this.carproductionyear = carproductionyear;
    }

    public String getCarbodytype() {
        return carbodytype;
    }

    public void setCarbodytype(String carbodytype) {
        this.carbodytype = carbodytype;
    }

    public String getCartransmissiontype() {
        return cartransmissiontype;
    }

    public void setCartransmissiontype(String cartransmissiontype) {
        this.cartransmissiontype = cartransmissiontype;
    }

    public String getCarfueltype() {
        return carfueltype;
    }

    public void setCarfueltype(String carfueltype) {
        this.carfueltype = carfueltype;
    }

    public String getCarcolor() {
        return carcolor;
    }

    public void setCarcolor(String carcolor) {
        this.carcolor = carcolor;
    }

    public BigDecimal getEnginecapacity() {
        return enginecapacity;
    }

    public void setEnginecapacity(BigDecimal enginecapacity) {
        this.enginecapacity = enginecapacity;
    }

    public BigDecimal getKilometers() {
        return kilometers;
    }

    public void setKilometers(BigDecimal kilometers) {
        this.kilometers = kilometers;
    }

    public LocalDateTime getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        CreatedAt = createdAt;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }
}

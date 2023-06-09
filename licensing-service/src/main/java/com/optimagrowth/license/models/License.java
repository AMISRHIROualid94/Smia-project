package com.optimagrowth.license.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.hateoas.RepresentationModel;

@Setter
@Getter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "licenses")
public class License extends RepresentationModel<License> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "license_id",nullable = false)
    private Long licenseId;
    private String description;
    @Column(name = "organization_id")
    private Long organizationId;

    @Column(name = "product_name",nullable = false)
    private String productName;

    @Column(name = "license_type",nullable = false)
    private String licenseType;

    @Column(name = "comment")
    private String comment;

    @Transient
    private String organizationName;
    @Transient
    private String contactName;
    @Transient
    private String contactPhone;
    @Transient
    private String contactEmail;

    public License withComment(String comment){
        this.setComment(comment);
        return this;
    }
}

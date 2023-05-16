package com.examly.springapp.Model;
import javax.persistence.*;

@Entity
@Table(name = "addoninfo")

public class AddonModel{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "addon_id")
    private int addonId;

    @Column(name = "addon_name")
    private String addonName;

    @Column(name = "addon_description")
    private String addonDescription;
    
    @Column(name = "AddAddon_price")
    private String AddAddonPrice;
}

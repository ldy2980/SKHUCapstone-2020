package com.skhu.capstone2020.Model;

import com.google.gson.annotations.SerializedName;

public class Address {
    @SerializedName("address_name")
    private String address_name;

    @SerializedName("region_1depth_name")
    private String region_1depth_name;

    @SerializedName("region_2depth_name")
    private String region_2depth_name;

    @SerializedName("region_3depth_name")
    private String region_3depth_name;

    @SerializedName("mountain_yn")
    private String mountain_yn;

    @SerializedName("main_address_no")
    private String main_address_no;

    @SerializedName("sub_address_no")
    private String sub_address_no;

    public Address() {
    }

    public Address(String address_name, String region_1depth_name,
                   String region_2depth_name, String region_3depth_name,
                   String mountain_yn, String main_address_no,
                   String sub_address_no) {
        this.address_name = address_name;
        this.region_1depth_name = region_1depth_name;
        this.region_2depth_name = region_2depth_name;
        this.region_3depth_name = region_3depth_name;
        this.mountain_yn = mountain_yn;
        this.main_address_no = main_address_no;
        this.sub_address_no = sub_address_no;
    }

    public String getAddress_name() {
        return address_name;
    }

    public void setAddress_name(String address_name) {
        this.address_name = address_name;
    }

    public String getRegion_1depth_name() {
        return region_1depth_name;
    }

    public void setRegion_1depth_name(String region_1depth_name) {
        this.region_1depth_name = region_1depth_name;
    }

    public String getRegion_2depth_name() {
        return region_2depth_name;
    }

    public void setRegion_2depth_name(String region_2depth_name) {
        this.region_2depth_name = region_2depth_name;
    }

    public String getRegion_3depth_name() {
        return region_3depth_name;
    }

    public void setRegion_3depth_name(String region_3depth_name) {
        this.region_3depth_name = region_3depth_name;
    }

    public String getMountain_yn() {
        return mountain_yn;
    }

    public void setMountain_yn(String mountain_yn) {
        this.mountain_yn = mountain_yn;
    }

    public String getMain_address_no() {
        return main_address_no;
    }

    public void setMain_address_no(String main_address_no) {
        this.main_address_no = main_address_no;
    }

    public String getSub_address_no() {
        return sub_address_no;
    }

    public void setSub_address_no(String sub_address_no) {
        this.sub_address_no = sub_address_no;
    }
}

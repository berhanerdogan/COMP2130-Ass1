package org.example;

public class Address {
    private String streetInfo;
    private String city;
    private String postalCode;
    private String province;
    private String country;

    public Address(String streetInfo, String city, String postalCode, String province, String country) {
        this.streetInfo = streetInfo;
        this.city = city;
        this.postalCode = postalCode;
        this.province = province;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetInfo='" + streetInfo + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public String getStreetInfo() {
        return streetInfo;
    }

    public void setStreetInfo(String streetInfo) {
        this.streetInfo = streetInfo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void addNewAddress(Address address) {

    }
}




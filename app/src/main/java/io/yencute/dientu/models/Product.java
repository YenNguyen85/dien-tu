package io.yencute.dientu.models;

import java.util.Objects;

public class Product {
    private String ten;
    private Double gia;

    public Product() {}

    public Product(String ten, Double gia){
        this.ten = ten;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(ten, product.ten) &&
                Objects.equals(gia, product.gia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ten, gia);
    }

    @Override
    public String toString() {
        return "Product{" +
                "ten='" + ten + '\'' +
                ", gia=" + gia +
                '}';
    }
}

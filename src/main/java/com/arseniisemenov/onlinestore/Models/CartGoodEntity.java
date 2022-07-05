package com.arseniisemenov.onlinestore.Models;

import javax.persistence.*;

@Entity
@Table(name = "cart_good", schema = "public", catalog = "online-store")
public class CartGoodEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "cart_id")
    private Integer cartId;
    @Basic
    @Column(name = "good_id")
    private Integer goodId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CartGoodEntity that = (CartGoodEntity) o;

        if (id != that.id) return false;
        if (cartId != null ? !cartId.equals(that.cartId) : that.cartId != null) return false;
        if (goodId != null ? !goodId.equals(that.goodId) : that.goodId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (cartId != null ? cartId.hashCode() : 0);
        result = 31 * result + (goodId != null ? goodId.hashCode() : 0);
        return result;
    }
}

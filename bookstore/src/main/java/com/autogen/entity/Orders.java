package com.autogen.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author xyx
 * @since 2019-11-16
 */
public class Orders extends Model<Orders> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ordernum", type = IdType.AUTO)
    private String ordernum;
    private Float price;
    private Integer number;
    private Integer status;
    @TableField("customerId")
    private String customerId;


    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    protected Serializable pkVal() {
        return this.ordernum;
    }

    @Override
    public String toString() {
        return "Orders{" +
        ", ordernum=" + ordernum +
        ", price=" + price +
        ", number=" + number +
        ", status=" + status +
        ", customerId=" + customerId +
        "}";
    }
}

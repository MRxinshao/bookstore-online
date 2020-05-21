package com.autogen.entity;

import java.util.Date;
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
public class Ordernum extends Model<Ordernum> {

    private static final long serialVersionUID = 1L;

    private Date prefix;
    private Integer num;


    public Date getPrefix() {
        return prefix;
    }

    public void setPrefix(Date prefix) {
        this.prefix = prefix;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "Ordernum{" +
        ", prefix=" + prefix +
        ", num=" + num +
        "}";
    }
}

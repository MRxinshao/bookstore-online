package com.autogen.entity;

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
public class UserRole extends Model<UserRole> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "u_id", type = IdType.AUTO)
    private String uId;
    private String rId;


    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getrId() {
        return rId;
    }

    public void setrId(String rId) {
        this.rId = rId;
    }

    @Override
    protected Serializable pkVal() {
        return this.uId;
    }

    @Override
    public String toString() {
        return "UserRole{" +
        ", uId=" + uId +
        ", rId=" + rId +
        "}";
    }
}

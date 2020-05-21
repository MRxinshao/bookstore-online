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
public class RoleFunction extends Model<RoleFunction> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "r_id", type = IdType.AUTO)
    private String rId;
    private String fId;


    public String getrId() {
        return rId;
    }

    public void setrId(String rId) {
        this.rId = rId;
    }

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId;
    }

    @Override
    protected Serializable pkVal() {
        return this.rId;
    }

    @Override
    public String toString() {
        return "RoleFunction{" +
        ", rId=" + rId +
        ", fId=" + fId +
        "}";
    }
}

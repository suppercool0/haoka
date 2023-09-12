package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 haoka_order
 * 
 * @author ruoyi
 * @date 2023-09-12
 */
public class HaokaOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 订单id */
    private Long orderId;

    /** 手机号 */
    @Excel(name = "手机号")
    private Long mobile;

    /** 价格 */
    @Excel(name = "价格")
    private BigDecimal price;

    /** 地址 */
    @Excel(name = "地址")
    private String address;

    /** 接收手机号 */
    @Excel(name = "接收手机号")
    private Long receivePhoneNumber;

    /** 推广人 */
    @Excel(name = "推广人")
    private Long userId;

    /** 订单状态 */
    @Excel(name = "订单状态")
    private Integer status;

    public void setOrderId(Long orderId) 
    {
        this.orderId = orderId;
    }

    public Long getOrderId() 
    {
        return orderId;
    }
    public void setMobile(Long mobile) 
    {
        this.mobile = mobile;
    }

    public Long getMobile() 
    {
        return mobile;
    }
    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setreceivePhoneNumber(Long receivePhoneNumber) 
    {
        this.receivePhoneNumber = receivePhoneNumber;
    }

    public Long getreceivePhoneNumber() 
    {
        return receivePhoneNumber;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("orderId", getOrderId())
            .append("mobile", getMobile())
            .append("price", getPrice())
            .append("address", getAddress())
            .append("receivePhoneNumber", getreceivePhoneNumber())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("userId", getUserId())
            .append("status", getStatus())
            .toString();
    }
}

package com.cold.common.core.domain.entity;

import com.cold.common.annotation.Excel;
import com.cold.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 产品对象 sys_product
 *
 * @author EasyArch_Ayuan
 * @date 2021-01-19
 */
public class SysProduct extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 库存序号
     */
    private Long productId;

    /**
     * 库存名称
     */
    @Excel(name = "库存名称")
    private String productName;

    /**
     * 库存重量
     */
    @Excel(name = "库存重量")
    private Long weight;

    /**
     * 库存类型
     */
    @Excel(name = "库存类型")
    private String type;

    /**
     * 库存状态
     */
    @Excel(name = "库存状态")
    private Long status;

    /**
     * 部门序号
     */
    @Excel(name = "部门序号")
    private Long deptId;

    /**
     * 部门名称
     */
    @Excel(name = "部门名称")
    private String deptName;

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public Long getWeight() {
        return weight;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStatus() {
        return status;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("productId", getProductId())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .append("productName", getProductName())
                .append("weight", getWeight())
                .append("type", getType())
                .append("status", getStatus())
                .append("deptId", getDeptId())
                .append("deptName", getDeptName())
                .append("createBy", getCreateBy())
                .append("updateBy", getUpdateBy())
                .toString();
    }
}

package com.cold.system.service;


import com.cold.common.core.domain.entity.SysProduct;

import java.util.List;

/**
 * 产品Service接口
 *
 * @author EasyArch_Ayuan
 * @date 2021-01-19
 */
public interface ISysProductService {
    /**
     * 查询产品
     *
     * @param productId 产品ID
     * @return 产品
     */
    public SysProduct selectSysProductById(Long productId);

    /**
     * 查询产品列表
     *
     * @param sysProduct 产品
     * @return 产品集合
     */
    public List<SysProduct> selectSysProductList(SysProduct sysProduct);

    /**
     * 新增产品
     *
     * @param sysProduct 产品
     * @return 结果
     */
    public int insertSysProduct(SysProduct sysProduct);

    /**
     * 修改产品
     *
     * @param sysProduct 产品
     * @return 结果
     */
    public int updateSysProduct(SysProduct sysProduct);

    /**
     * 批量删除产品
     *
     * @param productIds 需要删除的产品ID
     * @return 结果
     */
    public int deleteSysProductByIds(Long[] productIds);

    /**
     * 删除产品信息
     *
     * @param productId 产品ID
     * @return 结果
     */
    public int deleteSysProductById(Long productId);
}

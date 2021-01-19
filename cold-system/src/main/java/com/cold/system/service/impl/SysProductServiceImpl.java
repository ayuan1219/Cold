package com.cold.system.service.impl;

import com.cold.common.core.domain.entity.SysProduct;
import com.cold.common.utils.DateUtils;
import com.cold.system.mapper.SysProductMapper;
import com.cold.system.service.ISysProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 产品Service业务层处理
 *
 * @author EasyArch_Ayuan
 * @date 2021-01-19
 */
@Service
public class SysProductServiceImpl implements ISysProductService {
    @Autowired
    private SysProductMapper sysProductMapper;

    /**
     * 查询产品
     *
     * @param productId 产品ID
     * @return 产品
     */
    @Override
    public SysProduct selectSysProductById(Long productId) {
        return sysProductMapper.selectSysProductById(productId);
    }

    /**
     * 查询产品列表
     *
     * @param sysProduct 产品
     * @return 产品
     */
    @Override
    public List<SysProduct> selectSysProductList(SysProduct sysProduct) {
        return sysProductMapper.selectSysProductList(sysProduct);
    }

    /**
     * 新增产品
     *
     * @param sysProduct 产品
     * @return 结果
     */
    @Override
    public int insertSysProduct(SysProduct sysProduct) {
        sysProduct.setCreateTime(DateUtils.getNowDate());
        return sysProductMapper.insertSysProduct(sysProduct);
    }

    /**
     * 修改产品
     *
     * @param sysProduct 产品
     * @return 结果
     */
    @Override
    public int updateSysProduct(SysProduct sysProduct) {
        sysProduct.setUpdateTime(DateUtils.getNowDate());
        return sysProductMapper.updateSysProduct(sysProduct);
    }

    /**
     * 批量删除产品
     *
     * @param productIds 需要删除的产品ID
     * @return 结果
     */
    @Override
    public int deleteSysProductByIds(Long[] productIds) {
        return sysProductMapper.deleteSysProductByIds(productIds);
    }

    /**
     * 删除产品信息
     *
     * @param productId 产品ID
     * @return 结果
     */
    @Override
    public int deleteSysProductById(Long productId) {
        return sysProductMapper.deleteSysProductById(productId);
    }
}

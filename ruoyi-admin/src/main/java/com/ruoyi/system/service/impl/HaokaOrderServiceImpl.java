package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.HaokaOrderMapper;
import com.ruoyi.system.domain.HaokaOrder;
import com.ruoyi.system.service.IHaokaOrderService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-09-12
 */
@Service
public class HaokaOrderServiceImpl implements IHaokaOrderService 
{
    @Autowired
    private HaokaOrderMapper haokaOrderMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param orderId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public HaokaOrder selectHaokaOrderByOrderId(Long orderId)
    {
        return haokaOrderMapper.selectHaokaOrderByOrderId(orderId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param haokaOrder 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<HaokaOrder> selectHaokaOrderList(HaokaOrder haokaOrder)
    {
        return haokaOrderMapper.selectHaokaOrderList(haokaOrder);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param haokaOrder 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertHaokaOrder(HaokaOrder haokaOrder)
    {
        haokaOrder.setCreateTime(DateUtils.getNowDate());
        return haokaOrderMapper.insertHaokaOrder(haokaOrder);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param haokaOrder 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateHaokaOrder(HaokaOrder haokaOrder)
    {
        haokaOrder.setUpdateTime(DateUtils.getNowDate());
        return haokaOrderMapper.updateHaokaOrder(haokaOrder);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param orderIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteHaokaOrderByOrderIds(Long[] orderIds)
    {
        return haokaOrderMapper.deleteHaokaOrderByOrderIds(orderIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param orderId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteHaokaOrderByOrderId(Long orderId)
    {
        return haokaOrderMapper.deleteHaokaOrderByOrderId(orderId);
    }
}

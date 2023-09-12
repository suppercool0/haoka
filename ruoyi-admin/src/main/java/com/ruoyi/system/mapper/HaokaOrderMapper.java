package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.HaokaOrder;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2023-09-12
 */
public interface HaokaOrderMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param orderId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public HaokaOrder selectHaokaOrderByOrderId(Long orderId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param haokaOrder 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<HaokaOrder> selectHaokaOrderList(HaokaOrder haokaOrder);

    /**
     * 新增【请填写功能名称】
     * 
     * @param haokaOrder 【请填写功能名称】
     * @return 结果
     */
    public int insertHaokaOrder(HaokaOrder haokaOrder);

    /**
     * 修改【请填写功能名称】
     * 
     * @param haokaOrder 【请填写功能名称】
     * @return 结果
     */
    public int updateHaokaOrder(HaokaOrder haokaOrder);

    /**
     * 删除【请填写功能名称】
     * 
     * @param orderId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteHaokaOrderByOrderId(Long orderId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param orderIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHaokaOrderByOrderIds(Long[] orderIds);
}

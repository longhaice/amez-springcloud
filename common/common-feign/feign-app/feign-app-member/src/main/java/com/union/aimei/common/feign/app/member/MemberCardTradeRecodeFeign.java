package com.union.aimei.common.feign.app.member;


import com.github.pagehelper.PageInfo;
import com.union.aimei.common.feign.app.member.hystrix.MemberCardTradeRecodeApiHystrix;
import com.union.aimei.common.model.member.MemberCardTradeRecode;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;
/**
 * @author houji
 * @date 2018/8/13  11:46
 */
@FeignClient(serviceId = "APP-MEMBER-SERVICE", fallback = MemberCardTradeRecodeApiHystrix.class)
public interface MemberCardTradeRecodeFeign {
    /**
     * 添加会员卡交易记录
     *
     * @param memberCardTradeRecode
     * @return
     */
    @PostMapping(value = "/memberCardTradeRecode/insert")
    int insert(@RequestBody MemberCardTradeRecode memberCardTradeRecode);

    /**
     * 删除会员卡交易记录
     *
     * @param id
     * @return
     */
    @DeleteMapping(value = "/memberCardTradeRecode/deleteById/{id}")
    int deleteById(@PathVariable(value = "id") int id);

    /**
     * 修改会员卡交易记录
     *
     * @param memberCardTradeRecode
     * @return
     */
    @PutMapping(value = "/memberCardTradeRecode/edit")
    int edit(@RequestBody MemberCardTradeRecode memberCardTradeRecode);

    /**
     * 根据ID查询
     *
     * @param id
     * @returnmemberCardTradeRecode
     */
    @GetMapping(value = "/memberCardTradeRecode/queryById/{id}")
    MemberCardTradeRecode queryById(@PathVariable(value = "id") int id);

    /**
     * 前端分页查询会员卡交易记录
     *
     * @param pageNo                分页索引
     * @param pageSize              每页显示数量
     * @param memberCardTradeRecode 查询条件
     * @return
     */
    @PostMapping(value = "/memberCardTradeRecode/front/findByPage")
    PageInfo<MemberCardTradeRecode> findByPageForFront(@RequestParam(value = "pageNo", defaultValue = "0")
                                                               Integer pageNo, @RequestParam(value = "pageSize", defaultValue = "10")
                                                               Integer pageSize, @RequestBody MemberCardTradeRecode memberCardTradeRecode);

    /**
     * 根据订单编号查询
     * @param orderNo
     * @return
     */
    @GetMapping(value = "/memberCardTradeRecode/getByOrderNo")
    MemberCardTradeRecode queryByOrderNo(@RequestParam(value = "orderNo") String orderNo);
}
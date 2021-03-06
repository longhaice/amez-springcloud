package com.union.aimei.common.feign.app.umeng;

import com.github.pagehelper.PageInfo;
import com.union.aimei.common.feign.app.umeng.hystrix.BaseUmengPushHistoryApiHystrix;
import com.union.aimei.common.model.umeng.BaseUmengPushHistory;
import com.union.aimei.common.vo.umeng.UmengPushCategory;
import com.union.common.utils.ResponseMessage;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;
/**
 * @author houji
 * @date 2018/8/13  11:46
 */
@FeignClient(serviceId="APP-UMENG-SERVICE",fallback=BaseUmengPushHistoryApiHystrix.class)
public interface BaseUmengPushHistoryFeign {
       /**
        * 添加友盟消息推送记录
        * @param baseUmengPushHistory
        * @return
        */
       @PostMapping(value="/baseUmengPushHistory/insert")
       int insert(@RequestBody BaseUmengPushHistory baseUmengPushHistory);

       /**
        * 删除友盟消息推送记录
        * @param id
        * @return
        */
       @DeleteMapping(value="/baseUmengPushHistory/deleteById/{id}")
       int deleteById(@PathVariable(value = "id") int id);

       /** 
        * 修改友盟消息推送记录
        * @param baseUmengPushHistory
        * @return
        */
       @PutMapping(value="/baseUmengPushHistory/edit")
       int edit(@RequestBody BaseUmengPushHistory baseUmengPushHistory);

       /**
        * 根据ID查询
        * @param id
        * @returnbaseUmengPushHistory
        */
       @GetMapping(value="/baseUmengPushHistory/queryById/{id}")
       BaseUmengPushHistory queryById(@PathVariable(value = "id") int id);

       /**
     * 前端分页查询友盟消息推送记录
     * @param pageNo  分页索引
     * @param pageSize  每页显示数量
     * @param baseUmengPushHistory 查询条件
     * @return
     */
       @PostMapping(value="/baseUmengPushHistory/front/findByPage")
       PageInfo<BaseUmengPushHistory> findByPageForFront(
               @RequestParam(value = "pageNo", defaultValue = "0") Integer pageNo,
               @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
               @RequestBody BaseUmengPushHistory baseUmengPushHistory);

       /**
        * 查询所有的消息类型
        * @param umengPushCategory
        * @return
        */
       @PostMapping(value="/baseUmengPushHistory/front/findCategoryList")
       public ResponseMessage findCategoryList(@RequestBody UmengPushCategory umengPushCategory);
}
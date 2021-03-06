package com.union.aimei.common.feign.pc.umeng.hystrix;

import com.github.pagehelper.PageInfo;
import com.union.aimei.common.feign.pc.umeng.BaseUmengPushHistoryFeign;
import com.union.aimei.common.model.umeng.BaseUmengPushHistory;
import org.springframework.stereotype.Component;
/**
 * @author houji
 * @date 2018/8/20  10:20
 */
@Component(value = "pc-BaseUmengPushHistoryFeign")
public class BaseUmengPushHistoryApiHystrix implements BaseUmengPushHistoryFeign {

       /**
        * 前端分页查询友盟消息推送记录
        * @param pageNo  分页索引
        * @param pageSize  每页显示数量
        * @param baseUmengPushHistory 查询条件
        * @return 
        */
       @Override
       public PageInfo<BaseUmengPushHistory> findByPageForFront(Integer pageNo, Integer pageSize, BaseUmengPushHistory baseUmengPushHistory) {
              return null;
       }

       /**
        * 添加友盟消息推送记录
        * @param baseUmengPushHistory
        * @return
        */
       @Override
       public int insert(BaseUmengPushHistory baseUmengPushHistory) {
              return 0;
       }

       /**
        * 删除友盟消息推送记录
        * @param id
        * @return
        */
       @Override
       public int deleteById(int id) {
              return 0;
       }

       /** 
        * 修改友盟消息推送记录
        * @param baseUmengPushHistory
        * @return
        */
       @Override
       public int edit(BaseUmengPushHistory baseUmengPushHistory) {
              return 0;
       }

       /**
        * 根据ID查询
        * @param id
        * @returnbaseUmengPushHistory
        */
       @Override
       public BaseUmengPushHistory queryById(int id) {
              return null;
       }
}
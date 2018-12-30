package com.superman.superman.service;

import com.alibaba.fastjson.JSONObject;
import com.superman.superman.model.Oder;
import com.superman.superman.model.Userinfo;
import com.superman.superman.utils.PageParam;

import java.util.List;

/**
 * Created by liujupeng on 2018/11/14.
 */
public interface OderService {
    /**
     * 分页查询拼多多的订单
     * @param uid
     * @param status
     * @param pageParam
     * @return
     */
    JSONObject queryPddOder(Long uid, List status, PageParam pageParam);
    /**
     * 分页查询京东的订单
     * @param uid
     * @param status
     * @param pageParam
     * @return
     */
    JSONObject queryJdOder(Long uid,List status, PageParam pageParam);
    /**
     * 分页查询淘宝的订单
     * @param uid
     * @param status
     * @param pageParam
     * @return
     */
    JSONObject queryTbOder(Long uid,List status, PageParam pageParam);

    /**
     * 统计已结算/未结算 订单
     * @param uidList
     * @param status 0 代表未结算 1 已结算
     * @return
     */
    Long superQueryOderForUidList(List<Long> uidList, Integer status);

}

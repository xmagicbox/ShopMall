package com.superman.superman.service;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by liujupeng on 2018/12/4.
 */
public interface TaoBaoApiService {
    JSONObject serachGoods(Long uid,String Keywords, String cat, Boolean isTmall, Long page_no, Long page_size, String sort, String itemloc);

}

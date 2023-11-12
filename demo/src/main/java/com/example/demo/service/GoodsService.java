package com.example.demo.service;

import com.example.demo.common.result.PageResult;
import com.example.demo.entity.Goods;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.query.Query;
import com.example.demo.query.RecommendByTabGoodsQuery;
import com.example.demo.vo.GoodsVO;
import com.example.demo.vo.IndexTabRecommendVO;
import com.example.demo.vo.RecommendGoodsVO;
import io.swagger.models.auth.In;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author sunyu
 * @since 2023-11-08
 */
public interface GoodsService extends IService<Goods> {
    /**
     * 首页热门推荐 - 根据 tab Id 获取该推荐下的商品列表
     *
     * @return
     */
    IndexTabRecommendVO getTabRecommendGoodsByTabId(RecommendByTabGoodsQuery query);


    /**
     * 首页推荐 - 猜你喜欢(分页)
     *
     * @param query
     * @return
     */
    PageResult<RecommendGoodsVO> getRecommendGoodsByPage(Query query);

    /**
     * 根据id获取商品信息
     *
     * @param id
     * @return
     */
    GoodsVO getGoodsDetail(Integer id);
}
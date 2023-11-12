package com.example.demo.service;

import com.example.demo.entity.IndexCarousel;
import com.baomidou.mybatisplus.extension.service.IService;


import java.util.List;

/**
 * <p>
 *  服务类
 * </p>

 */
public interface IndexCarouselService extends IService<IndexCarousel> {
    /**
     * 获取指定分布点的轮播图列表
     *
     * @param distributionSite 分布点的标识
     * @return 分布点对应的轮播图列表
     */
    List<IndexCarousel> getList(Integer distributionSite);
}
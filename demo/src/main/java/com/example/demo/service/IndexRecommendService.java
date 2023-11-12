package com.example.demo.service;

import com.example.demo.entity.IndexRecommend;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.vo.IndexRecommendVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>

 */
public interface IndexRecommendService extends IService<IndexRecommend> {

    List<IndexRecommendVO> getList();
}
package com.example.demo.service;

import com.example.demo.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.vo.CategoryVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author sunyu
 * @since 2023-11-08
 */
public interface CategoryService extends IService<Category> {
    List<Category> getIndexCategoryList();
    List<CategoryVO> getCategoryList();
}
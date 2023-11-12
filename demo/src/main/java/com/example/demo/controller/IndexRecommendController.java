package com.example.demo.controller;

import com.example.demo.common.result.Result;
import com.example.demo.service.IndexRecommendService;
import com.example.demo.vo.IndexRecommendVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author sunyu
 * @since 2023-11-08
 */
@Tag(name = "推荐管理")
@RestController
@RequestMapping("home")
@AllArgsConstructor
public class IndexRecommendController {
    private final IndexRecommendService indexRecommendService;

    @Operation(summary = "首页-热门推荐")
    @GetMapping("/hot")
    public Result<List<IndexRecommendVO>> getList() {
        List<IndexRecommendVO> list = indexRecommendService.getList();
        return Result.ok(list);

    }

}
package com.example.demo.convert;

import com.example.demo.entity.Goods;
import com.example.demo.vo.GoodsVO;
import com.example.demo.vo.RecommendGoodsVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-12T09:38:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.9 (Oracle Corporation)"
)
public class GoodsConvertImpl implements GoodsConvert {

    @Override
    public GoodsVO convertToGoodsVO(Goods goods) {
        if ( goods == null ) {
            return null;
        }

        GoodsVO goodsVO = new GoodsVO();

        goodsVO.setId( goods.getId() );
        goodsVO.setName( goods.getName() );
        goodsVO.setDescription( goods.getDescription() );
        goodsVO.setPrice( goods.getPrice() );
        goodsVO.setOldPrice( goods.getOldPrice() );
        goodsVO.setDiscount( goods.getDiscount() );
        goodsVO.setInventory( goods.getInventory() );
        goodsVO.setSalesCount( goods.getSalesCount() );

        goodsVO.setProductPictures( MapStruct.strToList(goods.getProductPictures()) );
        goodsVO.setMainPictures( MapStruct.strToList(goods.getMainPictures()) );

        return goodsVO;
    }

    @Override
    public List<RecommendGoodsVO> convertToRecommendGoodsVOList(List<Goods> goodsList) {
        if ( goodsList == null ) {
            return null;
        }

        List<RecommendGoodsVO> list = new ArrayList<RecommendGoodsVO>( goodsList.size() );
        for ( Goods goods : goodsList ) {
            list.add( goodsToRecommendGoodsVO( goods ) );
        }

        return list;
    }

    protected RecommendGoodsVO goodsToRecommendGoodsVO(Goods goods) {
        if ( goods == null ) {
            return null;
        }

        RecommendGoodsVO recommendGoodsVO = new RecommendGoodsVO();

        recommendGoodsVO.setId( goods.getId() );
        recommendGoodsVO.setName( goods.getName() );
        recommendGoodsVO.setDescription( goods.getDescription() );
        if ( goods.getPrice() != null ) {
            recommendGoodsVO.setPrice( String.valueOf( goods.getPrice() ) );
        }
        recommendGoodsVO.setCover( goods.getCover() );
        if ( goods.getSalesCount() != null ) {
            recommendGoodsVO.setSalesCount( String.valueOf( goods.getSalesCount() ) );
        }

        return recommendGoodsVO;
    }
}

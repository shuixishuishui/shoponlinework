package com.example.demo.convert;

import com.example.demo.entity.IndexRecommend;
import com.example.demo.vo.IndexRecommendVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-12T09:38:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.9 (Oracle Corporation)"
)
public class IndexRecommendConvertImpl implements IndexRecommendConvert {

    @Override
    public IndexRecommendVO convertToIndexRecommendVo(IndexRecommend indexRecommend) {
        if ( indexRecommend == null ) {
            return null;
        }

        IndexRecommendVO indexRecommendVO = new IndexRecommendVO();

        indexRecommendVO.setId( indexRecommend.getId() );
        indexRecommendVO.setName( indexRecommend.getName() );
        indexRecommendVO.setDescription( indexRecommend.getDescription() );

        indexRecommendVO.setPictures( MapStruct.strToList(indexRecommend.getPictures()) );

        return indexRecommendVO;
    }

    @Override
    public List<IndexRecommendVO> convertToUserVoList(List<IndexRecommend> list) {
        if ( list == null ) {
            return null;
        }

        List<IndexRecommendVO> list1 = new ArrayList<IndexRecommendVO>( list.size() );
        for ( IndexRecommend indexRecommend : list ) {
            list1.add( convertToIndexRecommendVo( indexRecommend ) );
        }

        return list1;
    }
}

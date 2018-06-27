package com.zy.WeiC.dao;

import com.zy.WeiC.pojo.RelationCode;
import com.zy.WeiC.pojo.RelationCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelationCodeMapper {
    long countByExample(RelationCodeExample example);

    int deleteByExample(RelationCodeExample example);

    int deleteByPrimaryKey(Integer codeId);

    int insert(RelationCode record);

    int insertSelective(RelationCode record);

    List<RelationCode> selectByExample(RelationCodeExample example);

    RelationCode selectByPrimaryKey(Integer codeId);

    int updateByExampleSelective(@Param("record") RelationCode record, @Param("example") RelationCodeExample example);

    int updateByExample(@Param("record") RelationCode record, @Param("example") RelationCodeExample example);

    int updateByPrimaryKeySelective(RelationCode record);

    int updateByPrimaryKey(RelationCode record);
}
package com.zy.WeiC.dao;

import com.zy.WeiC.pojo.RelationMessageCode;
import com.zy.WeiC.pojo.RelationMessageCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelationMessageCodeMapper {
    long countByExample(RelationMessageCodeExample example);

    int deleteByExample(RelationMessageCodeExample example);

    int deleteByPrimaryKey(Integer codeId);

    int insert(RelationMessageCode record);

    int insertSelective(RelationMessageCode record);

    List<RelationMessageCode> selectByExample(RelationMessageCodeExample example);

    RelationMessageCode selectByPrimaryKey(Integer codeId);

    int updateByExampleSelective(@Param("record") RelationMessageCode record, @Param("example") RelationMessageCodeExample example);

    int updateByExample(@Param("record") RelationMessageCode record, @Param("example") RelationMessageCodeExample example);

    int updateByPrimaryKeySelective(RelationMessageCode record);

    int updateByPrimaryKey(RelationMessageCode record);
}
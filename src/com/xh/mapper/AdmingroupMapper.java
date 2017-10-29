package com.xh.mapper;

import com.xh.po.Admingroup;
import com.xh.po.AdmingroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdmingroupMapper {
    long countByExample(AdmingroupExample example);

    int deleteByExample(AdmingroupExample example);

    int deleteByPrimaryKey(Integer admingroupid);

    int insert(Admingroup record);

    int insertSelective(Admingroup record);

    List<Admingroup> selectByExample(AdmingroupExample example);

    Admingroup selectByPrimaryKey(Integer admingroupid);

    int updateByExampleSelective(@Param("record") Admingroup record, @Param("example") AdmingroupExample example);

    int updateByExample(@Param("record") Admingroup record, @Param("example") AdmingroupExample example);

    int updateByPrimaryKeySelective(Admingroup record);

    int updateByPrimaryKey(Admingroup record);
}
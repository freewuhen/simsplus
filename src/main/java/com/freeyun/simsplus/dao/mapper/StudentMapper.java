package com.freeyun.simsplus.dao.mapper;

import com.freeyun.simsplus.dao.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StudentMapper {
    Student select(@Param("sno") String sno);

}

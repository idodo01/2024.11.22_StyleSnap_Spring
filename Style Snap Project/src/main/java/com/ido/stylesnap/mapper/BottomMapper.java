package com.ido.stylesnap.mapper;

import com.ido.stylesnap.dto.BottomDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BottomMapper {
    void insertBottom(BottomDTO bottomWDTO);
}

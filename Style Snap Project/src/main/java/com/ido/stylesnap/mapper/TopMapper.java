package com.ido.stylesnap.mapper;

import com.ido.stylesnap.dto.style.TopDTO;
import org.apache.ibatis.annotations.*;

@Mapper
public interface TopMapper {
    void insertTop(TopDTO topDTO);
}






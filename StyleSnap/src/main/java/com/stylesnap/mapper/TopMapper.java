package com.stylesnap.mapper;

import java.util.List;
import com.stylesnap.dto.TopDTO;
import org.apache.ibatis.annotations.*;

@Mapper
public interface TopMapper {

    @Insert("INSERT INTO book (id, url) VALUES (#{id}, #{url})")
    void insertBook(
            @Param("bookISBN") String ISBN, // param1
            int price // param2
    );


    /********************************************************/

    void insertBookWithAuthor(TopDTO topDTO);

}






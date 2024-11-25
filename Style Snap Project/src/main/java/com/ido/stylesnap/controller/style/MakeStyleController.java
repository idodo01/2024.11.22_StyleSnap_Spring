package com.ido.stylesnap.controller.style;

import com.ido.stylesnap.dto.style.TopDTO;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/style/makeStyle")
public class MakeStyleController {
    Map<Integer, TopDTO> styles = new HashMap<>();

    @PostConstruct
    public void init() {
        styles.put(1,
                TopDTO.builder()
                        .id(1)
                        .url("url나올부분")
                        .build()
        );
    }

    @GetMapping("/load")
    public List<TopDTO> getComputers() {
        List<TopDTO> topDTOs = new ArrayList<>();
        Set<Integer> keySet = styles.keySet();
        for (Integer key : keySet) {
            TopDTO topDTO = styles.get(key);
            topDTOs.add(topDTO);
        }
        return topDTOs;
    }

    @PostMapping("/save")
    public void post(@RequestBody TopDTO topDTO){
        // 전달받은 데이터가 이미 생성이 되어 있는 데이터인가?
        if(!styles.containsKey(topDTO.getId())){
            // 생성이 되어 있지 않으면 생성한다 (생성되어있으면 중복!)
            styles.put(topDTO.getId(), topDTO);
        }
    }
}
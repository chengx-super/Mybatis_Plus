package com.testComtroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chengx
 * @date 2019/2/26 16:30:58
 */
@RestController
public class testComtroller {

    @RequestMapping("/test")
    public String test(){
        return "test";
    }


}
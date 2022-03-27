package com.example.zookeeper_demo;/**
 * @author wj
 * @date 2022/3/22
 * @version 1.0
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 15961
 * @create 2022-03-22 
 * @desc Hello
 **/


@Controller
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    public String getHello() {
        return "hello";
    }
}

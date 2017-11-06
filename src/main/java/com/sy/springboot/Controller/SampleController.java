package com.sy.springboot.Controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/11/6.
 */
@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("test")
    @ResponseBody
    String home() {
        return "Hello World!";
    }


}

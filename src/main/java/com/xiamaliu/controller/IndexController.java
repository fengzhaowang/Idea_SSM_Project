package com.xiamaliu.controller;

import com.xiamaliu.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/system")
@Controller
public class IndexController {
    @Autowired
    public IndexService indexService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public ModelAndView index(ModelAndView model){
        model.addObject("student",indexService.findStudent());
        model.setViewName("/system/index");
        return model;
    }

}

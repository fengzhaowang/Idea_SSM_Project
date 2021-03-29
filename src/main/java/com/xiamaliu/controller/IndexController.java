package com.xiamaliu.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xiamaliu.entity.UserInfo;
import com.xiamaliu.service.IndexService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;

@RequestMapping("/system")
@Controller
public class IndexController {

    @Autowired
    public IndexService indexService;

    @RequestMapping(value = "/index", method = {RequestMethod.GET})
    public ModelAndView getIndex() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping(value = "/goIndex", method = {RequestMethod.GET})
    public String goIndex(Model model) {
        model.addAttribute("msg", "aaaaaa");
        return "index";
    }

    @RequestMapping(value = "/index", produces = {"application/json;charset=UTF-8"}, method = {RequestMethod.POST})
    @ResponseBody
    public String index(HttpServletResponse request, @RequestBody String param) throws Exception {
        JSONObject object = JSON.parseObject(param);
        System.out.println(object.get("name"));
        System.out.println(object.get("sex"));
        System.out.println(object.get("age"));
        HashMap<String, Object> data = new HashMap<>();
        List<UserInfo> userInfo = indexService.findUserInfo();
        System.out.println(userInfo.toString());
        System.out.println("天天向上，我就是天天向上！");
//        System.out.println(object);
        data.put("data", userInfo.toString());
        return JSON.toJSONString(data);
    }


}

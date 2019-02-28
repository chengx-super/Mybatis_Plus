package com.base.controller;


import com.base.entity.DataBaseUser;
import com.base.service.IDataBaseUserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Chengx
 * @since 2019-02-27
 */
@RestController
@RequestMapping("/base/user")
public class DataBaseUserController {

    @Resource
    private IDataBaseUserService dataBaseUserService;

    @RequestMapping
    public ModelAndView index() {//@RequestParam Integer templeId
        ModelAndView result = new ModelAndView("test/test");
        result.addObject("value","test");
        return result;
    }

    @RequestMapping("/getView/{val}")
    public ModelAndView getUsesr(@PathVariable Object val){
        ModelAndView result = new ModelAndView("test/test");
        result.addObject("value",val);
        return result;
    }

    @RequestMapping("/getUser")
    public List<DataBaseUser> getUser(){
        return dataBaseUserService.list();
    }

    @RequestMapping("/getByid/{id}")
    @ResponseBody
    public DataBaseUser getByid(@PathVariable String id) {
        return dataBaseUserService.getById(id);
    }

}

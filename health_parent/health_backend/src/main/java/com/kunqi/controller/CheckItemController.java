package com.kunqi.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kunqi.POJO.CheckItem;
import com.kunqi.constant.MessageConstant;
import com.kunqi.entity.Result;
import com.kunqi.service.CheckItemService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 姚晶辉
 * @Description 检查项管理
 * @date 2020/12/17 20:06
 * @Version 1.0
 */
@RestController
@RequestMapping("/checkitem")
public class CheckItemController {



    @Reference
    private CheckItemService checkItemService;


    @RequestMapping("/add")
    public Result add(@RequestBody CheckItem checkItem){
        System.out.println(checkItem);
        try {
            checkItemService.add(checkItem);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, MessageConstant.ADD_CHECKITEM_FAIL);
        }
        return new Result(true,MessageConstant.ADD_CHECKITEM_SUCCESS);

    }


}

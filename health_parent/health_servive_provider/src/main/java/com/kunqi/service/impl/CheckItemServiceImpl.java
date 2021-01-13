package com.kunqi.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.kunqi.POJO.CheckItem;
import com.kunqi.dao.CheckItemDao;
import com.kunqi.service.CheckItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 姚晶辉
 * @Description TODO
 * @date 2020/12/17 20:14
 * @Version 1.0
 */
@Service(interfaceClass = CheckItemService.class)
@Transactional
public class CheckItemServiceImpl implements CheckItemService {
    @Autowired
    private CheckItemDao checkItemDao;

    @Override
    public void add(CheckItem checkItem) {
        
        checkItemDao.add(checkItem);
    }
}

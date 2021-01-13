package com.kunqi.dao;

import com.kunqi.POJO.CheckItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author 姚晶辉
 * @Description CheckItem持久层Dao接口
 * @date 2020/12/17 20:17
 * @Version 1.0
 */

public interface CheckItemDao {


    @Select("select * from t_record where state = 1 and data_time >#{data_time} and type = #{type}" +
            "unique select * from t_pred_record where state = 1 and data_time >#{data_time} and type = #{type} ")
    public void add(CheckItem checkItem);
}

package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.entity.Category;
import org.springframework.stereotype.Service;

/**
 * @author 彭桂涛
 * @version 1.0
 */

public interface CategoryService extends IService<Category> {
     void remove(long ids);
}

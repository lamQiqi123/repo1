package com.itheima.service;

import com.itheima.domain.Items;
import org.springframework.beans.factory.annotation.Autowired;

public interface ItemsService {
    /**
     * 通过id查询物品
     * @param id
     * @return
     */
    Items findById(int id);

    void transfer(int id1, int id2,float num);
}

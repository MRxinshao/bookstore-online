package com.autogen.service.impl;

import com.autogen.entity.Orders;
import com.autogen.mapper.OrdersMapper;
import com.autogen.service.OrdersService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xyx
 * @since 2019-11-16
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrdersService {

}

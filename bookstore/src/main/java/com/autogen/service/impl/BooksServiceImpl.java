package com.autogen.service.impl;

import com.autogen.entity.Books;
import com.autogen.mapper.BooksMapper;
import com.autogen.service.BooksService;
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
public class BooksServiceImpl extends ServiceImpl<BooksMapper, Books> implements BooksService {

}

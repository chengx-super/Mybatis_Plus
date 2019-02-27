package com.base.service.impl;

import com.base.entity.DataBaseUser;
import com.base.mapper.DataBaseUserMapper;
import com.base.service.IDataBaseUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Chengx
 * @since 2019-02-27
 */
@Service
public class DataBaseUserServiceImpl extends ServiceImpl<DataBaseUserMapper, DataBaseUser> implements IDataBaseUserService {

}

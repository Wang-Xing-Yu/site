package com.eric.site.web.base;

import com.eric.site.web.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: Eric
 */
@Service
@Transactional(rollbackFor = java.lang.Exception.class)
public interface BaseService<Entity extends BaseEntity, EntityExample> {

    long countByExample(EntityExample example);

    int deleteByExample(EntityExample example);

    int deleteByPrimaryKey(long id);

    int insert(Entity record);

    int insertSelective(Entity record);

    List<User> selectByExample(EntityExample example);

    User selectByPrimaryKey(long id);

    int updateByExampleSelective(Entity record, EntityExample example);

    int updateByExample(Entity record, EntityExample example);

    int updateByPrimaryKeySelective(Entity record);

    int updateByPrimaryKey(Entity record);

    List<User> selectAll();
}
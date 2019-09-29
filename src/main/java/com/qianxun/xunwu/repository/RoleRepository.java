package com.qianxun.xunwu.repository;

import java.util.List;

import com.qianxun.xunwu.entity.Role;
import org.springframework.data.repository.CrudRepository;



/**
 * 角色数据DAO
 * Created by 瓦力.
 */
public interface RoleRepository extends CrudRepository<Role, Long> {
    List<Role> findRolesByUserId(Long userId);
}

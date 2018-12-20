package com.hebeu.group.service;

import com.hebeu.group.pojo.Admin;

/**
 * @author 言立慧
 * @date 2018/12/20 15:24
 */

public interface AdminService {
    /**
     * 通过id查询管理员
     * @param id
     * @return
     */
    Admin getAdminById(Integer id);
}

package com.rpc.biz.service;

import com.rpc.dal.model.PersonDO;

import java.util.List;

/**
 * @program: http
 * @description:
 * @author: Napoleon
 * @create: 2018/8/10 21:53
 * @version: 0.0.1
 **/

public interface PersonService {


    List<PersonDO> getAllPerson();


}

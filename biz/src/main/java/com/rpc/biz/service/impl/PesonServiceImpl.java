package com.rpc.biz.service.impl;

import com.rpc.biz.service.PersonService;
import com.rpc.dal.mapper.PersonDOMapper;
import com.rpc.dal.model.PersonDO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: http
 * @description:
 * @author: Napoleon
 * @create: 2018/8/10 21:53
 * @version: 0.0.1
 **/
@Service("personService")
public class PesonServiceImpl implements PersonService {

    @Resource(name = "personDOMapper")
    private PersonDOMapper personDOMapper;

    @Override
    public List<PersonDO> getAllPerson() {
        return personDOMapper.selectAll();
    }
}

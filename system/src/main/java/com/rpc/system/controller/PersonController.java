package com.rpc.system.controller;

import com.rpc.biz.service.PersonService;
import com.rpc.dal.model.PersonDO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: http
 * @description:
 * @author: Napoleon
 * @create: 2018/8/10 21:52
 * @version: 0.0.1
 **/
@RestController
@RequestMapping("/person")
@Api(description = "人员")
public class PersonController {

    @Resource(name = "personService")
    private PersonService personService;

    @PostMapping("/getAllPerson")
    @ApiOperation(value = "获取所有人员")
    public List<PersonDO> getAllPerson() {
        return personService.getAllPerson();
    }
}

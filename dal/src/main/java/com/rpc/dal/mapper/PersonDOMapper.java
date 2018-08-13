package com.rpc.dal.mapper;

import com.rpc.dal.model.PersonDO;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
@Repository
public interface PersonDOMapper extends Mapper<PersonDO> {
}
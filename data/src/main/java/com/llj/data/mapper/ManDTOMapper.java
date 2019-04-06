package com.llj.data.mapper;

import com.llj.data.Man;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

/**
 * @author Jogen
 * @date 2019/4/6
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ManDTOMapper {
    ManDTOMapper INSTANCE= Mappers.getMapper(ManDTOMapper.class);
    Man toMan(InsertRequst insertRequst);
}

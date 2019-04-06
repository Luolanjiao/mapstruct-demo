package com.llj.data.mapper;

import com.llj.data.Man;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-04-06T14:18:20+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_121 (Oracle Corporation)"
)
public class ManDTOMapperImpl implements ManDTOMapper {

    @Override
    public Man toMan(InsertRequst insertRequst) {
        if ( insertRequst == null ) {
            return null;
        }

        Man man = new Man();

        man.setName( insertRequst.getName() );
        man.setAge( insertRequst.getAge() );
        man.setMobileNO( insertRequst.getMobileNO() );

        return man;
    }
}

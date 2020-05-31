package com.maradinho.coupons.model.mapper;

import org.mapstruct.Mapper;

import java.sql.Date;
import java.sql.Timestamp;

@Mapper(componentModel = "spring")
public interface DateMapper {
    default Timestamp mapSqlDateToSqlTimestamp(Date date) {
        Timestamp time =  null;
        if (date != null) {
            time = new Timestamp(date.getTime());
        }
        return time;
    }

    default Date mapSqlTimestampToSqlDate(Timestamp timestamp) {
        Date date =  null;
        if (timestamp != null) {
            date = new Date(timestamp.getTime());
        }
        return date;
    }
}
package com.linjing.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;

public class JsonUtils {

    public static String getJson(Object o) {
        //代码复用
        return getJson(o, "yyyy-MM-dd HH:mm:ss");
    }

    public static String getJson(Object o, String dataFormat) {
        ObjectMapper mapper = new ObjectMapper();
        //不使用时间戳
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        //自定义日期格式
        SimpleDateFormat sdf = new SimpleDateFormat(dataFormat);
        mapper.setDateFormat(sdf);

        try {
            return mapper.writeValueAsString(o); //也可以用时间戳
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}

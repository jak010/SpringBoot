package com.example.demo.response;

import lombok.Data;
import org.springframework.http.HttpStatus;


@Data
public class Message {

    private Integer status_code;
    private String code;
    private Object data;

    public Message() {
        this.status_code = null;
        this.code = null;
        this.data = null;
    }

}

package com.green.firstserver.model;

import lombok.Getter;
import lombok.Setter;

// 아이디, 제목, 내용을 받을 수 있는 객체를 만들 수 있는 클래스를 만드시오.
@Getter
@Setter
public class MemoPutReq {
    private int id;
    private String title;
    private String content;
}

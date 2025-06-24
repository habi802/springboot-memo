package com.green.firstserver.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemoGetOneRes {
    private int id;
    private String title;
    private String createdAt;
}

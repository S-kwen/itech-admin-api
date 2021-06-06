package com.boot.yuntechlifeadmin.entity.system;

import lombok.Data;

import java.util.Date;

/**
 * @Author: skwen
 * @ClassName: Advert
 * @Description: 實體類
 * @Date: 2020-03-17
 */
@Data
public class Advert {
    private int id;
    private int user_id;
    private int state;
    private int type;
    private int priority;
    private String title;
    private Date show_time;
    private Date hide_time;
    private int jump_type;
    private String lay_text;
    private String url;
    private int color;
    private boolean deleted;
    private Date add_time;
    //以上來自sql
    private int [] ids;
    private String username;
}

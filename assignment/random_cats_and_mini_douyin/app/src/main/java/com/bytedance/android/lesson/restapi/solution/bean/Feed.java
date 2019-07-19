package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

import java.io.File;

/**
 * @author Xavier.S
 * @date 2019.01.20 14:18
 */
public class Feed {

    // TODO-C2 (1) Implement your Feed Bean here according to the response json
    @SerializedName("student_id")
    String student_id;
    @SerializedName("user_name")
    String user_name;
    @SerializedName("image_url")//可能是string 不确定
    String img_url;
    @SerializedName("video_url")
    String video_url;

    public String getImg_url(){
        return img_url;
    }
}

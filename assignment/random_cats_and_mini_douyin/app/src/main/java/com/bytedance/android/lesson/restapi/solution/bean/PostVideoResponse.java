package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

/**
 * @author Xavier.S
 * @date 2019.01.18 17:53
 */
public class PostVideoResponse {

    @SerializedName("success")private boolean success;
    @SerializedName("item")private Feed item;
    public Feed getItem(){return item;}
    public boolean isSuccess(){return success;}

    // TODO-C2 (3) Implement your PostVideoResponse Bean here according to the response json
}

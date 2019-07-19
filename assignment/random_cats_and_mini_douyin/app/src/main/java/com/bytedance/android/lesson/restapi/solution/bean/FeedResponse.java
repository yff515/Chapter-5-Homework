package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xavier.S
 * @date 2019.01.20 14:17
 */
public class FeedResponse {
    @SerializedName("success") private boolean success;
    @SerializedName("feeds") private List<Feed> feeds;
    public List<Feed> getFeeds(){
        return feeds;
    }

    // TODO-C2 (2) Implement your FeedResponse Bean here according to the response json
}

package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

/**
 * @author Xavier.S
 * @date 2019.01.18 17:53
 */
public class PostVideoResponse {

    // TODO-C2 (3) Implement your PostVideoResponse Bean here according to the response json
    @SerializedName("success")
    private boolean successs;
    @SerializedName("result")
    private Feed result;

    public boolean isSuccesss() {
        return successs;
    }

    public void setSuccesss(boolean successs) {
        this.successs = successs;
    }

    public Feed getResult() {
        return result;
    }

    public void setResult(Feed result) {
        this.result = result;
    }
}

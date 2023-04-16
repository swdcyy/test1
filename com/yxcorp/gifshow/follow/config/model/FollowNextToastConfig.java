package com.yxcorp.gifshow.follow.config.model.FollowNextToastConfig;
import java.io.Serializable;
import java.lang.Object;

public class FollowNextToastConfig implements Serializable	// class@001098
{
    public int mMaxToastTimes;
    public int mNotShowDays;
    public boolean mShow;
    public static final long serialVersionUID = 0xae31bab3e194010f;

    public void FollowNextToastConfig(){
       super();
       this.mShow = false;
       this.mMaxToastTimes = 1;
       this.mNotShowDays = -1;
    }
}

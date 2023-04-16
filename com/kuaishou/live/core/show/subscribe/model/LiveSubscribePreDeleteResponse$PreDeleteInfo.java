package com.kuaishou.live.core.show.subscribe.model.LiveSubscribePreDeleteResponse$PreDeleteInfo;
import java.io.Serializable;
import java.lang.Object;

public class LiveSubscribePreDeleteResponse$PreDeleteInfo implements Serializable	// class@00113a
{
    public String mContent;
    public int mForbidDays;
    public int mStatus;
    public String mTitle;
    public static final long serialVersionUID = 0x9c3579c5911ef2c5;

    public void LiveSubscribePreDeleteResponse$PreDeleteInfo(){
       super();
    }
    public boolean willBeBannedAfterDelete(){
       boolean b = (this.mStatus == 2)? true: false;
       return b;
    }
}

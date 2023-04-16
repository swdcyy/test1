package com.kuaishou.live.core.show.subscribe.model.LiveSubscribeDetailResponse;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.live.core.show.subscribe.model.LiveSubscribeDetailResponse$LiveSubscribeDetailInfo;

public class LiveSubscribeDetailResponse implements Serializable	// class@001136
{
    public LiveSubscribeDetailResponse$LiveSubscribeDetailInfo mLiveSubscribeDetailInfo;
    public int mResult;
    public static final long serialVersionUID = 0x56b74bf11998e3cf;

    public void LiveSubscribeDetailResponse(){
       super();
    }
    public LiveSubscribeDetailResponse$LiveSubscribeDetailInfo getSubscribeDetailInfo(){
       return this.mLiveSubscribeDetailInfo;
    }
}

package com.kuaishou.live.core.show.liveaggregate.response.LiveAggregateBannerData;
import java.io.Serializable;
import java.lang.Object;

public class LiveAggregateBannerData implements Serializable	// class@000c6b
{
    public String mBannerId;
    public CDNUrl[] mImageUrl;
    public boolean mIsShown;
    public String mKsOrderId;
    public String mTargetUrl;
    public static final long serialVersionUID = 0x9af6e22505a210c4;

    public void LiveAggregateBannerData(){
       super();
       this.mIsShown = false;
    }
}

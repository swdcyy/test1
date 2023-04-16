package com.kuaishou.live.ad.social.LiveAdGetLiveConversionInfoHandler$a;
import com.kuaishou.live.ad.social.LiveAdGetLiveConversionInfoHandler$UserData;
import com.kuaishou.live.ad.social.LiveAdGetLiveConversionInfoHandler$ConversionTask;
import com.kuaishou.live.ad.social.LiveAdGetLiveConversionInfoHandler$LiveInfo;
import java.lang.Object;

public class LiveAdGetLiveConversionInfoHandler$a	// class@000a02
{
    public int mAdLiveClickType;
    public LiveAdGetLiveConversionInfoHandler$ConversionTask mConversionTask;
    public boolean mIsLivePlaying;
    public LiveAdGetLiveConversionInfoHandler$LiveInfo mLiveInfo;
    public LiveAdGetLiveConversionInfoHandler$UserData mUserData;

    public void LiveAdGetLiveConversionInfoHandler$a(LiveAdGetLiveConversionInfoHandler$UserData p0,LiveAdGetLiveConversionInfoHandler$ConversionTask p1,LiveAdGetLiveConversionInfoHandler$LiveInfo p2,boolean p3,int p4){
       super();
       this.mUserData = p0;
       this.mConversionTask = p1;
       this.mLiveInfo = p2;
       this.mIsLivePlaying = p3;
       this.mAdLiveClickType = p4;
    }
}

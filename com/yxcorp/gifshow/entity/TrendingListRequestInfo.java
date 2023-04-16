package com.yxcorp.gifshow.entity.TrendingListRequestInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public class TrendingListRequestInfo implements Serializable	// class@000d85
{
    public String mCurrentPlayTrendingInfoId;
    public String mCurrentPlayTrendingInfoType;
    public String mIsRisingTrending;
    public String mLocation;
    public String mPhotoId;
    public String mTrendingRequestListInfo;
    public String mTrendingRequestSource;
    public String mTrendingSource;
    public String mTrendingType;
    public static final long serialVersionUID = 0x4c724f50e5e5bd19;

    public void TrendingListRequestInfo(){
       super();
    }
    public void TrendingListRequestInfo(String p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,String p8){
       super();
       this.mPhotoId = p0;
       this.mTrendingType = p1;
       this.mCurrentPlayTrendingInfoId = p2;
       this.mTrendingRequestSource = p3;
       this.mTrendingRequestListInfo = p4;
       this.mCurrentPlayTrendingInfoType = p5;
       this.mIsRisingTrending = p6;
       this.mTrendingSource = p7;
       this.mLocation = p8;
    }
}

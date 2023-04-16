package com.kwai.feature.api.danmaku.model.LiveDanmakuData;
import com.kwai.feature.api.danmaku.model.DanmakuData;
import java.lang.CharSequence;
import java.lang.String;

public class LiveDanmakuData extends DanmakuData	// class@000e87
{
    public String mBackgroundCdnUrl;
    public Drawable mBackgroundDrawable;
    public String mCity;
    public double mLatitude;
    public String mLiveStreamId;
    public double mLongitude;
    public int mPropType;
    public Drawable mPropsDrawable;
    public String mPropsUrl;
    public String mProvince;
    public String mSubLocality;
    public Drawable mTagDrawable;
    public int mTagType;
    public String mTagUrl;
    public List mUserRoleInfoList;
    public int mVisibleStatus;
    public long mWishNo;

    public void LiveDanmakuData(CharSequence p0,long p1){
       super(p0, p1);
    }
    public void LiveDanmakuData(String p0,String p1){
       super(p0, p1);
    }
}

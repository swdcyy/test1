package com.yxcorp.gifshow.loading.HolidayLoadingPreferenceConfig;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import p17.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class HolidayLoadingPreferenceConfig implements Serializable	// class@001a94
{
    public boolean mDisablePullProgress;
    public long mEndTimeStamp;
    public String mLoadingBackgroundFilePath;
    public int mLoadingBackgroundHeight;
    public int mLoadingBackgroundWidth;
    public int mLoadingHeight;
    public int mLoadingWidth;
    public String mPullFilePath;
    public String mRefreshFilePath;
    public long mStartTimeStamp;
    public static final long serialVersionUID = 0xdb810ad189124638;

    public void HolidayLoadingPreferenceConfig(String p0,String p1,boolean p2,int p3,int p4,long p5,long p6){
       super();
       this.mPullFilePath = p0;
       this.mRefreshFilePath = p1;
       this.mDisablePullProgress = p2;
       this.mLoadingWidth = p3;
       this.mLoadingHeight = p4;
       this.mStartTimeStamp = p5;
       this.mEndTimeStamp = p6;
    }
    public static c newRefreshGlobalConfig(boolean p0,HolidayLoadingPreferenceConfig p1){
       Object obj;
       if (PatchProxy.isSupport(HolidayLoadingPreferenceConfig.class)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, null, HolidayLoadingPreferenceConfig.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       c uoc = new c(p0, p1.mDisablePullProgress, p1.mLoadingWidth, p1.mLoadingHeight, p1.mPullFilePath, p1.mRefreshFilePath, p1.mLoadingBackgroundFilePath, p1.mLoadingBackgroundWidth, p1.mLoadingBackgroundHeight);
       return obj;
    }
    public boolean isValid(){
       Object obj = PatchProxy.apply(null, this, HolidayLoadingPreferenceConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       long l = System.currentTimeMillis();
       boolean b = (!TextUtils.isEmpty(this.mPullFilePath) && (!TextUtils.isEmpty(this.mRefreshFilePath) && (this.mLoadingWidth != null && (this.mLoadingHeight != null && (l - this.mStartTimeStamp >= 0 && l - this.mEndTimeStamp <= 0)))))? true: false;
       return b;
    }
}

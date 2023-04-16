package com.yxcorp.gifshow.postwork.autoretry.AutoRetryConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.Float;
import java.lang.reflect.Type;

public class AutoRetryConfig implements Serializable	// class@0010c2
{
    public int mMaxRetryTimes;
    public int mMaxRetryUploadCount;
    public float mVideoRatio;
    public static int NO_ERROR = 0;
    public static int NO_NET = 1;
    public static int NO_SPACE = 2;
    public static int OTHER_ERRORS = 255;

    public void AutoRetryConfig(){
       super();
       this.mMaxRetryTimes = 3;
       this.mMaxRetryUploadCount = 4;
       this.mVideoRatio = 0x3fa66666;
    }
    public static AutoRetryConfig getConfig(){
       AutoRetryConfig obj = PatchProxy.apply(null, null, AutoRetryConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new AutoRetryConfig();
       obj.mMaxRetryTimes = a.t().a("retryUploadTimesPerWork", obj.mMaxRetryTimes);
       obj.mMaxRetryUploadCount = a.t().a("maxRetryUploadCount", obj.mMaxRetryUploadCount);
       obj.mVideoRatio = a.t().getValue("videoSizeRatio", Float.TYPE, Float.valueOf(obj.mVideoRatio)).floatValue();
       return obj;
    }
}

package com.kuaishou.live.ad.social.LiveAdConversionTaskDetail$LiveSignalInfo;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LiveAdSocialConversionTask;

public class LiveAdConversionTaskDetail$LiveSignalInfo implements Serializable, a	// class@0009fc
{
    public boolean mConversionEnabled;
    public long mConversionId;
    public long mConversionLaunchedOnTime;
    public int mConversionType;
    public String mEntranceInfo;
    public int mExceptionHandleStrategy;
    public long mLongMaxDelayMs;
    public long mMaxDelayMs;
    public long mSceneId;
    public int mSourceType;
    public LiveAdSocialMessages$LiveAdSocialConversionTask mTask;
    public String mUrl;
    public String mVersion;
    public static final long serialVersionUID = 0xd0e429ae0e558cb0;

    public void LiveAdConversionTaskDetail$LiveSignalInfo(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, LiveAdConversionTaskDetail$LiveSignalInfo.class, "1")) {
          return;
       }
       LiveAdSocialMessages$LiveAdSocialConversionTask liveAdSocial = new LiveAdSocialMessages$LiveAdSocialConversionTask();
       this.mTask = liveAdSocial;
       LiveAdConversionTaskDetail$LiveSignalInfo tmConversion = this.mConversionId;
       liveAdSocial.conversionId = tmConversion;
       liveAdSocial.conversionEnabled = this.mConversionEnabled;
       liveAdSocial.url = this.mUrl;
       liveAdSocial.version = tmConversion;
       liveAdSocial.conversionType = this.mConversionType;
       liveAdSocial.sourceType = this.mSourceType;
       liveAdSocial.sceneId = this.mSceneId;
       liveAdSocial.exceptionHandleStrategy = this.mExceptionHandleStrategy;
       liveAdSocial.entranceInfo = this.mEntranceInfo;
       liveAdSocial.maxDelayMs = this.mMaxDelayMs;
       liveAdSocial.longMaxDelayMs = this.mLongMaxDelayMs;
       liveAdSocial.conversionLaunchedOnTime = this.mConversionLaunchedOnTime;
       return;
    }
}

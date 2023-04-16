package com.kuaishou.live.common.core.basic.baseinfo.QLivePushConfig;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.android.live.model.Race;
import com.kuaishou.live.basic.model.StreamType;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.live.basic.model.CheckResolutionResponse$FpsConfig;
import com.kuaishou.live.basic.model.CheckResolutionResponse$VideoConfig;
import java.util.List;
import w51.a;
import d61.g;
import java.lang.Boolean;
import java.lang.StringBuilder;

public class QLivePushConfig implements Serializable	// class@000e7b
{
    public int fps;
    public String mAryaConfig;
    public int mAudioBitrate;
    public CDNUrl[] mCoverThumbnailUrls;
    public boolean mEnableRepushNotification;
    public boolean mExpectFreeTraffic;
    public boolean mHasRedPack;
    public List mHosts;
    public long mIFrameIntervalMS;
    public double mInitVideoBitrate;
    public boolean mIsFreeTrafficCdn;
    public boolean mIsPushOrigin;
    public String mLiveStreamId;
    public String mLocale;
    public double mMaxVideoBitrate;
    public double mMinVideoBitrate;
    public long mNotifyFansDuration;
    public PrePushResponse mPrePushResponse;
    public String mPushRtmpUrl;
    public long mQuotaAvailable;
    public long mQuotaNextResetTime;
    public Race mRace;
    public int mResolution;
    public List mSocketHostPorts;
    public StreamType mStreamType;
    public CheckResolutionResponse$VideoConfig mVideoConfig;
    public static final long serialVersionUID = 0xef15f92cf0d2b889;

    public void QLivePushConfig(){
       super();
       this.mHosts = new ArrayList();
       this.mSocketHostPorts = new ArrayList();
       CDNUrl[] uCDNUrlArray = new CDNUrl[0];
       this.mCoverThumbnailUrls = uCDNUrlArray;
       this.mRace = new Race();
       this.mIFrameIntervalMS = 4000;
       this.mAudioBitrate = 48;
       this.mStreamType = StreamType.VIDEO;
    }
    public int getCaptureFps(){
       Object obj = PatchProxy.apply(null, this, QLivePushConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.hasFpsConfig()) {
          return this.mVideoConfig.getFpsConfig().mCaptureFps;
       }
       return 0;
    }
    public CDNUrl[] getCoverThumbnailUrls(){
       return this.mCoverThumbnailUrls;
    }
    public int getFps(){
       return this.fps;
    }
    public List getHosts(){
       return this.mHosts;
    }
    public double getInitVideoBitrate(){
       return this.mInitVideoBitrate;
    }
    public String getLiveStreamId(){
       return this.mLiveStreamId;
    }
    public String getLocale(){
       return this.mLocale;
    }
    public double getMaxVideoBitrate(){
       return this.mMaxVideoBitrate;
    }
    public int getMinCaptureFps(){
       Object obj = PatchProxy.apply(null, this, QLivePushConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.hasFpsConfig()) {
          return this.mVideoConfig.getFpsConfig().mMinCaptureFps;
       }
       return 0;
    }
    public double getMinVideoBitrate(){
       return this.mMinVideoBitrate;
    }
    public int getOutputCaptureFps(){
       Object obj = PatchProxy.apply(null, this, QLivePushConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.hasFpsConfig()) {
          return this.mVideoConfig.getFpsConfig().mCaptureOutputFps;
       }
       return 0;
    }
    public String getPushRtmpUrl(){
       return this.mPushRtmpUrl;
    }
    public long getQuotaAvailable(){
       return this.mQuotaAvailable;
    }
    public long getQuotaNextResetTime(){
       return this.mQuotaNextResetTime;
    }
    public Race getRace(){
       QLivePushConfig tmRace;
       Race obj = PatchProxy.apply(null, this, QLivePushConfig.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (a.s())? g.a(): this.mRace;
       return obj;
    }
    public List getSocketHostPorts(){
       return this.mSocketHostPorts;
    }
    public boolean hasFpsConfig(){
       QLivePushConfig obj = PatchProxy.apply(null, this, QLivePushConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mVideoConfig;
       boolean b = (obj != null && obj.getFpsConfig() != null)? true: false;
       return b;
    }
    public QLivePushConfig setFps(int p0){
       this.fps = p0;
       return this;
    }
    public void setHosts(List p0){
       this.mHosts = p0;
    }
    public QLivePushConfig setInitVideoBitrate(double p0){
       this.mInitVideoBitrate = p0;
       return this;
    }
    public QLivePushConfig setLocale(String p0){
       this.mLocale = p0;
       return this;
    }
    public QLivePushConfig setMaxVideoBitrate(double p0){
       this.mMaxVideoBitrate = p0;
       return this;
    }
    public QLivePushConfig setMinVideoBitrate(double p0){
       this.mMinVideoBitrate = p0;
       return this;
    }
    public void setPushRtmpUrl(String p0){
       this.mPushRtmpUrl = p0;
    }
    public void setSocketHostPorts(List p0){
       this.mSocketHostPorts = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, QLivePushConfig.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "QLivePushConfig{mLiveStreamId=\'"+this.mLiveStreamId+'''+", mPushRtmpUrl=\'"+this.mPushRtmpUrl+'''+", mQuotaAvailable="+this.mQuotaAvailable+", mQuotaNextResetTime="+this.mQuotaNextResetTime+", mHosts="+this.mHosts+", mSocketHostPorts="+this.mSocketHostPorts+", mLocale=\'"+this.mLocale+'''+", fps="+this.fps+", mMaxVideoBitrate="+this.mMaxVideoBitrate+", mInitVideoBitrate="+this.mInitVideoBitrate+", mMinVideoBitrate="+this.mMinVideoBitrate+", mIFrameIntervalMS="+this.mIFrameIntervalMS+", mHasRedPack="+this.mHasRedPack+", mEnableRepushNotification="+this.mEnableRepushNotification+", mNotifyFansDuration="+this.mNotifyFansDuration+'}';
    }
}

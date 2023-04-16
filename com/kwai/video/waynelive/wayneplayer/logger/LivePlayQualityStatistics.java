package com.kwai.video.waynelive.wayneplayer.logger.LivePlayQualityStatistics;
import java.lang.Object;
import com.kwai.player.qos.KwaiQosInfo;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.waynelive.debug.DebugLog;
import java.lang.System;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.waynelive.wayneplayer.logger.KSLiveVideoContext;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONObject;
import com.kwai.video.waynelive.wayneplayer.logger.KSLivePlayerLogUploader;
import org.json.JSONException;

public class LivePlayQualityStatistics	// class@000e56
{
    public int mBlockCount;
    public long mBufferTime;
    public long mDropPackageTotalDuration;
    public long mFirstScreenDropPackageDuration;
    public long mFirstScreenTotalDuration;
    public long mFirstScreenTotalDurationStartTime;
    public String mHost;
    public boolean mIsPreload;
    public String mLiveStreamId;
    public long mLogStartTime;
    public String mPlayerQosJson;
    public int mRetryCount;
    public int mRetryReason;
    public long mStartBufferTime;
    public long mStartPlayerTime;
    public long mStopPlayerTime;
    public long mTotalDuration;
    public long mTraffic;

    public void LivePlayQualityStatistics(){
       super();
       this.mFirstScreenDropPackageDuration = -1;
       this.mLiveStreamId = "";
    }
    public LivePlayQualityStatistics addBlockCount(int p0){
       this.mBlockCount = this.mBlockCount + p0;
       return this;
    }
    public LivePlayQualityStatistics addBufferTime(long p0){
       this.mBufferTime = this.mBufferTime + p0;
       return this;
    }
    public LivePlayQualityStatistics addRetryCount(){
       this.mRetryCount = this.mRetryCount + 1;
       return this;
    }
    public LivePlayQualityStatistics addTraffic(long p0){
       this.mTraffic = this.mTraffic + p0;
       return this;
    }
    public LivePlayQualityStatistics fillDroppedFieldsWithStreamQosInfo(KwaiQosInfo p0){
       if (p0 != null) {
          if (!this.mFirstScreenDropPackageDuration - -1) {
             this.mFirstScreenDropPackageDuration = (long)p0.firstScreenTimeDroppedDuration;
          }
          this.mDropPackageTotalDuration = this.mDropPackageTotalDuration + (long)p0.totalDroppedDuration;
       }
       return this;
    }
    public String getHost(){
       return this.mHost;
    }
    public int getRetryCount(){
       return this.mRetryCount;
    }
    public int getRetryReason(){
       return this.mRetryReason;
    }
    public void logEnd(){
       if (PatchProxy.applyVoid(null, this, LivePlayQualityStatistics.class, "4")) {
          return;
       }
       DebugLog.i("LivePlayQualityStat", "logEnd");
       this.mTotalDuration = System.currentTimeMillis() - this.mLogStartTime;
       return;
    }
    public LivePlayQualityStatistics logEndBufferTimeThenAddIfNeed(){
       Object obj = PatchProxy.apply(null, this, LivePlayQualityStatistics.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mStartBufferTime > 0) {
          this.mStartBufferTime = 0;
          this.addBufferTime((System.currentTimeMillis() - this.mStartBufferTime));
       }
       return this;
    }
    public LivePlayQualityStatistics logPlayerStartTime(long p0){
       this.mStartPlayerTime = p0;
       return this;
    }
    public LivePlayQualityStatistics logPlayerStopTime(){
       Object obj = PatchProxy.apply(null, this, LivePlayQualityStatistics.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mStopPlayerTime = System.currentTimeMillis();
       return this;
    }
    public void logRenderEndTimeIfNeed(){
       if (PatchProxy.applyVoid(null, this, LivePlayQualityStatistics.class, "5")) {
          return;
       }
       if (this.mFirstScreenTotalDuration - null > 0) {
          return;
       }
       DebugLog.i("LivePlayQualityStat", "logRenderEndTimeIfNeed");
       this.mFirstScreenTotalDuration = System.currentTimeMillis() - this.mFirstScreenTotalDurationStartTime;
       return;
    }
    public void logStart(KSLiveVideoContext p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayQualityStatistics.class, "3")) {
          return;
       }
       DebugLog.i("LivePlayQualityStat", "logStart");
       this.mLogStartTime = System.currentTimeMillis();
       this.mFirstScreenTotalDurationStartTime = p0.clickTimeMs;
       return;
    }
    public LivePlayQualityStatistics logStartBufferTime(){
       Object obj = PatchProxy.apply(null, this, LivePlayQualityStatistics.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mStartBufferTime = System.currentTimeMillis();
       return this;
    }
    public LivePlayQualityStatistics setHost(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LivePlayQualityStatistics.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(p0) && TextUtils.isEmpty(this.mHost)) {
          this.mHost = p0;
       }
       return this;
    }
    public LivePlayQualityStatistics setIsPreload(boolean p0){
       this.mIsPreload = p0;
       return this;
    }
    public void setLiveStreamId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayQualityStatistics.class, "2")) {
          return;
       }
       if (!TextUtils.isEmpty(this.mLiveStreamId)) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          p0 = "";
       }
       this.mLiveStreamId = p0;
       return;
    }
    public LivePlayQualityStatistics setPlayerQosJson(String p0){
       this.mPlayerQosJson = p0;
       return this;
    }
    public LivePlayQualityStatistics setRetryCount(int p0){
       this.mRetryCount = p0;
       return this;
    }
    public LivePlayQualityStatistics setRetryReason(int p0){
       this.mRetryReason = p0;
       return this;
    }
    public void upload(){
       if (PatchProxy.applyVoid(null, this, LivePlayQualityStatistics.class, "9")) {
          return;
       }
       try{
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("play_start_time", this.mStartPlayerTime);
          jSONObject.put("play_end_time", this.mStopPlayerTime);
          jSONObject.put("live_stream_id", this.mLiveStreamId);
          jSONObject.put("live_stream_host", this.mHost);
          jSONObject.put("total_duration", this.mTotalDuration);
          jSONObject.put("first_screen_total_duration", this.mFirstScreenTotalDuration);
          jSONObject.put("retry_cnt", this.mRetryCount);
          jSONObject.put("traffic", this.mTraffic);
          jSONObject.put("first_screen_drop_package_duration", this.mFirstScreenDropPackageDuration);
          jSONObject.put("drop_package_total_duration", this.mDropPackageTotalDuration);
          jSONObject.put("buffer_time", this.mBufferTime);
          jSONObject.put("block_cnt", this.mBlockCount);
          jSONObject.put("player_qos_json", this.mPlayerQosJson);
          jSONObject.put("is_preload", this.mIsPreload);
          KSLivePlayerLogUploader.logEvent("VP_LIVE_PLAYER_FINISH", jSONObject.toString());
       }catch(org.json.JSONException e0){
          e0.printStackTrace();
       }
       return;
    }
}

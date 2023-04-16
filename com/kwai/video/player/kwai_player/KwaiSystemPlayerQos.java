package com.kwai.video.player.kwai_player.KwaiSystemPlayerQos;
import com.kwai.video.player.kwai_player.KwaiSystemMediaPlayer;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import org.json.JSONException;
import java.lang.System;

public class KwaiSystemPlayerQos	// class@000b4b
{
    public long mAliveDurMs;
    public int mBlockCnt;
    public int mBlockDur;
    public long mBlockStartMs;
    public int mBufferingPercent;
    public int mLastError;
    public long mPrepareEnd;
    public long mPrepareStart;
    public int mSeekCnt;
    public int mSeekDur;
    public long mSeekStartMs;
    public final KwaiSystemMediaPlayer mSysPlayer;
    public long mVideoRenderStart;

    public void KwaiSystemPlayerQos(KwaiSystemMediaPlayer p0){
       super();
       this.mSeekCnt = 0;
       this.mSeekDur = 0;
       this.mSeekStartMs = 0;
       this.mBlockCnt = 0;
       this.mBlockDur = 0;
       this.mBlockStartMs = 0;
       this.mBufferingPercent = 0;
       this.mPrepareStart = 0;
       this.mAliveDurMs = 0;
       this.mVideoRenderStart = 0;
       this.mPrepareEnd = 0;
       this.mLastError = 0;
       this.mSysPlayer = p0;
    }
    public String getBriefVodStatJson(){
       JSONObject obj = PatchProxy.apply(null, this, KwaiSystemPlayerQos.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject();
          JSONObject jSONObject = new JSONObject();
          obj.put("config", jSONObject);
          jSONObject.put("player_type", 2);
          jSONObject.put("url", this.mSysPlayer.getDataSource());
          jSONObject = new JSONObject();
          obj.put("meta", jSONObject);
          jSONObject.put("dur", this.mSysPlayer.getDuration());
          jSONObject.put("width", this.mSysPlayer.getVideoWidth());
          jSONObject.put("height", this.mSysPlayer.getVideoHeight());
          jSONObject = new JSONObject();
          obj.put("rt_stat", jSONObject);
          jSONObject.put("block_cnt", this.mBlockCnt);
          jSONObject.put("block_dur", this.mBlockDur);
          jSONObject.put("alive_dur", this.mAliveDurMs);
          jSONObject.put("last_error", this.mLastError);
       }catch(org.json.JSONException e1){
          e1.printStackTrace();
       }
       return obj.toString();
    }
    public String getVodStatJson(){
       JSONObject obj = PatchProxy.apply(null, this, KwaiSystemPlayerQos.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject();
          JSONObject jSONObject = new JSONObject();
          obj.put("config", jSONObject);
          jSONObject.put("player_type", 2);
          jSONObject.put("url", this.mSysPlayer.getDataSource());
          jSONObject.put("seek_at_start", this.mSysPlayer.getSeekAtStart());
          jSONObject = new JSONObject();
          obj.put("meta", jSONObject);
          jSONObject.put("dur", this.mSysPlayer.getDuration());
          jSONObject.put("width", this.mSysPlayer.getVideoWidth());
          jSONObject.put("height", this.mSysPlayer.getVideoHeight());
          jSONObject.put("fps", (double)this.mSysPlayer.getProbeFps());
          jSONObject = new JSONObject();
          obj.put("rt_stat", jSONObject);
          jSONObject.put("block_cnt", this.mBlockCnt);
          jSONObject.put("block_dur", this.mBlockDur);
          jSONObject.put("alive_dur", this.mAliveDurMs);
          jSONObject.put("last_error", this.mLastError);
          jSONObject.put("session_uuid", String.valueOf(this.mSysPlayer.getAudioSessionId()));
          jSONObject.put("percent", this.mBufferingPercent);
          jSONObject = new JSONObject();
          obj.put("rt_cost", jSONObject);
          jSONObject.put("prepare", this.mPrepareEnd);
          jSONObject.put("first_screen", this.mVideoRenderStart);
          jSONObject = new JSONObject();
          obj.put("seek_stat", jSONObject);
          jSONObject.put("seek_cnt", this.mSeekCnt);
          jSONObject.put("avg_dur", this.mSeekDur);
       }catch(org.json.JSONException e1){
          e1.printStackTrace();
       }
       return obj.toString();
    }
    public void onAliveDuration(){
       if (PatchProxy.applyVoid(null, this, KwaiSystemPlayerQos.class, "6")) {
          return;
       }
       this.mAliveDurMs = System.currentTimeMillis() - this.mPrepareStart;
       return;
    }
    public void onBlockEnd(){
       if (PatchProxy.applyVoid(null, this, KwaiSystemPlayerQos.class, "4")) {
          return;
       }
       this.mBlockDur = (int)((long)this.mBlockDur + (System.currentTimeMillis() - this.mBlockStartMs));
       return;
    }
    public void onBlockStart(){
       if (PatchProxy.applyVoid(null, this, KwaiSystemPlayerQos.class, "3")) {
          return;
       }
       this.mBlockCnt = this.mBlockCnt + 1;
       this.mBlockStartMs = System.currentTimeMillis();
       return;
    }
    public void onBufferingPercent(int p0){
       this.mBufferingPercent = p0;
    }
    public void onError(int p0){
       this.mLastError = p0;
    }
    public void onPrepareEnd(){
       if (PatchProxy.applyVoid(null, this, KwaiSystemPlayerQos.class, "8")) {
          return;
       }
       this.mPrepareEnd = System.currentTimeMillis() - this.mPrepareStart;
       return;
    }
    public void onPrepareStart(){
       if (PatchProxy.applyVoid(null, this, KwaiSystemPlayerQos.class, "5")) {
          return;
       }
       this.mPrepareStart = System.currentTimeMillis();
       return;
    }
    public void onSeekComplete(){
       if (PatchProxy.applyVoid(null, this, KwaiSystemPlayerQos.class, "2")) {
          return;
       }
       this.mSeekDur = (int)((long)this.mSeekDur + (System.currentTimeMillis() - this.mSeekStartMs));
       return;
    }
    public void onSeekStart(){
       if (PatchProxy.applyVoid(null, this, KwaiSystemPlayerQos.class, "1")) {
          return;
       }
       this.mSeekCnt = this.mSeekCnt + 1;
       this.mSeekStartMs = System.currentTimeMillis();
       return;
    }
    public void onVideoRenderStart(){
       if (PatchProxy.applyVoid(null, this, KwaiSystemPlayerQos.class, "7")) {
          return;
       }
       this.mVideoRenderStart = System.currentTimeMillis() - this.mPrepareStart;
       return;
    }
}

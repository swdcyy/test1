package com.kwai.video.stannis.audio.support.MiKTVHelper;
import android.content.Context;
import java.lang.Object;
import android.content.ContentResolver;
import java.lang.String;
import android.media.AudioManager;
import android.content.SharedPreferences;
import oe6.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import java.lang.Integer;

public class MiKTVHelper	// class@000c46
{
    public final String KARAOKE_ENABLE;
    public final String KARAOKE_EQ;
    public final String KARAOKE_KTVMODE;
    public final String KARAOKE_REVERB;
    public final String KARAOKE_SUPPORT;
    public final String KARAOKE_VOLUME;
    public final int VOLUME_MAX_APP;
    public final int VOLUME_MIN_APP;
    public AudioManager mAudioManager;
    public ContentResolver mContentResolver;
    public Context mContext;
    public int mEnabled;
    public int mEqMode;
    public boolean mInitialized;
    public int mReverbMode;
    public SharedPreferences mSp;
    public int mVolume;
    public static MiKTVHelper manager;
    public static final int[] reverbMap;

    static {
       MiKTVHelper.reverbMap = new int[13]{0,2,1,1,2,3,1,2,0,1,3,3,2};
    }
    public void MiKTVHelper(Context p0){
       super();
       this.KARAOKE_ENABLE = "audio_karaoke_enable";
       this.KARAOKE_VOLUME = "audio_karaoke_volume";
       this.KARAOKE_EQ = "audio_karaoke_EQ";
       this.KARAOKE_REVERB = "audio_karaoke_Reverb";
       this.KARAOKE_SUPPORT = "audio_karaoke_support";
       this.KARAOKE_KTVMODE = "audio_karaoke_ktvmode";
       this.VOLUME_MAX_APP = 15;
       this.VOLUME_MIN_APP = 0;
       this.mContext = p0;
       this.mContentResolver = p0.getContentResolver();
       this.mAudioManager = this.mContext.getSystemService("audio");
       this.mSp = o.c(this.mContext, "loopback_mode", 0);
       this.mInitialized = false;
    }
    public static MiKTVHelper getInstance(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MiKTVHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (MiKTVHelper.manager == null) {
          MiKTVHelper.manager = new MiKTVHelper(p0);
       }
       return MiKTVHelper.manager;
    }
    public void closeKTVDevice(){
       if (PatchProxy.applyVoid(null, this, MiKTVHelper.class, "4")) {
          return;
       }
       this.mAudioManager.setParameters("audio_karaoke_ktvmode=disable");
       this.mInitialized = false;
       return;
    }
    public int getMicVolParam(){
       return this.mVolume;
    }
    public int getPlayFeedbackParam(){
       if (this.mEnabled == 1) {
          return 1;
       }
       return 0;
    }
    public boolean isDeviceSupportKaraoke(){
       Object obj = PatchProxy.apply(null, this, MiKTVHelper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.mAudioManager.getParameters("audio_karaoke_support")).contains("true");
    }
    public void openKTVDevice(){
       if (PatchProxy.applyVoid(null, this, MiKTVHelper.class, "3")) {
          return;
       }
       if (this.mInitialized != null) {
          return;
       }
       this.mVolume = this.mSp.getInt("audio_karaoke_volume", 50);
       this.mEqMode = this.mSp.getInt("audio_karaoke_EQ", 0);
       this.mReverbMode = this.mSp.getInt("audio_karaoke_Reverb", 0);
       this.mAudioManager.setParameters("audio_karaoke_ktvmode=enable");
       this.mAudioManager.setParameters("audio_karaoke_volume="+this.mVolume);
       this.mAudioManager.setParameters("audio_karaoke_EQ="+this.mEqMode);
       this.mAudioManager.setParameters("audio_karaoke_Reverb="+this.mReverbMode);
       this.mInitialized = true;
       return;
    }
    public void setCustomMode(int p0){
       MiKTVHelper miKTVHelper = MiKTVHelper.class;
       if (PatchProxy.isSupport(miKTVHelper) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, miKTVHelper, "7")) {
          return;
       }
       if (p0 > 12) {
          p0 = p0 - 12;
       }
       this.setFeedbackEffect(MiKTVHelper.reverbMap[p0]);
       return;
    }
    public void setFeedbackEffect(int p0){
       MiKTVHelper miKTVHelper = MiKTVHelper.class;
       if (PatchProxy.isSupport(miKTVHelper) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, miKTVHelper, "8")) {
          return;
       }
       if (p0 > 0 && (p0 <= 3 && this.mReverbMode != p0)) {
          this.mAudioManager.setParameters("audio_karaoke_Reverb="+p0);
          this.mReverbMode = p0;
       }
    label_0036 :
       return;
    }
    public void setMicVolParam(int p0){
       MiKTVHelper miKTVHelper = MiKTVHelper.class;
       if (PatchProxy.isSupport(miKTVHelper) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, miKTVHelper, "5")) {
          return;
       }
       if (p0 > 15) {
          p0 = 15;
       }
       if (p0 < 0) {
          p0 = 0;
       }
       if (this.mVolume != p0 && this.mEnabled == 1) {
          this.mAudioManager.setParameters("audio_karaoke_volume="+p0);
          this.mVolume = p0;
       }
       return;
    }
    public void setPlayFeedbackParam(int p0){
       MiKTVHelper miKTVHelper = MiKTVHelper.class;
       if (PatchProxy.isSupport(miKTVHelper) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, miKTVHelper, "6")) {
          return;
       }
       if (this.mEnabled == p0) {
          return;
       }
       this.mEnabled = p0;
       this.mAudioManager.setParameters("audio_karaoke_enable="+p0);
       return;
    }
}

package com.kwai.video.stannis.audio.support.VivoKTVHelper;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import android.media.AudioManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.stannis.utils.Log;
import java.lang.Number;
import android.os.Build;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import java.util.StringTokenizer;
import java.lang.Integer;
import java.lang.Boolean;

public class VivoKTVHelper	// class@000c48
{
    public AudioManager mAudioManager;
    public Context mContext;
    public final Object mParamLock;
    public static final int[][] EQCustomGain;
    public static final int[][] EchoCustomParams;
    public static final int[][] ReverbCustomParams;
    public static VivoKTVHelper mVivoKTVHelper;

    static {
       int[][] ointArray = new int[][9];
       ointArray[0] = new int[6]{200,1000,500,4500,1000,1500};
       ointArray[1] = new int[6]{5000,4500,1200,4500,6500,1200};
       ointArray[2] = new int[6]{4500,8000,1000,4000,6500,1500};
       ointArray[3] = new int[6]{2500,3000,1500,4000,5000,1500};
       ointArray[4] = new int[6]{3500,5500,1500,5000,5500,1500};
       ointArray[5] = new int[6]{4000,3000,1000,2500,5500,1200};
       ointArray[6] = new int[6]{500,5000,800,4500,3000,1200};
       ointArray[7] = new int[6]{20,500,'<',4500,5000,1500};
       ointArray[8] = new int[6]{0,0,0,4000,0,1200};
       VivoKTVHelper.ReverbCustomParams = ointArray;
       int[][] ointArray1 = new int[][9];
       ointArray1[0] = new int[5]{0,0,0,2,2};
       ointArray1[1] = new int[5]{0,0,0,0,0};
       ointArray1[2] = new int[5]{3,4,2,0,-3};
       ointArray1[3] = new int[5]{3,2,0,0,2};
       ointArray1[4] = new int[5]{3,2,0,-1,-3};
       ointArray1[5] = new int[5]{2,2,2,0,0};
       ointArray1[6] = new int[5]{5,2,-2,1,3};
       ointArray1[7] = new int[5]{-2,0,1,2,1};
       ointArray1[8] = new int[5]{0,0,0,0,0};
       VivoKTVHelper.EQCustomGain = ointArray1;
       ointArray1 = new int[][1]{new int[4]{3200,150,1500,2000}};
       VivoKTVHelper.EchoCustomParams = ointArray1;
    }
    public void VivoKTVHelper(Context p0){
       super();
       this.mParamLock = new Object();
       this.mContext = p0;
       this.mAudioManager = p0.getSystemService("audio");
    }
    public static VivoKTVHelper getInstance(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VivoKTVHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (VivoKTVHelper.mVivoKTVHelper == null) {
          VivoKTVHelper.mVivoKTVHelper = new VivoKTVHelper(p0);
       }
       return VivoKTVHelper.mVivoKTVHelper;
    }
    public void closeKTVDevice(){
       if (PatchProxy.applyVoid(null, this, VivoKTVHelper.class, "4")) {
          return;
       }
       Log.i("VivoKTVHelper", "closeKTVDevice");
       this.mAudioManager.setParameters("vivo_ktv_mode=0");
       return;
    }
    public int getExtSpeakerParam(){
       Object obj = PatchProxy.apply(null, this, VivoKTVHelper.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getKTVParam("vivo_ktv_ext_speaker");
    }
    public final int getKTVParam(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, VivoKTVHelper.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (((Build.MANUFACTURER).trim()).contains("vivo")) {
          obj = this.mAudioManager.getParameters(p0);
          Log.i("VivoKTVHelper", "getKTVParam: "+obj);
          StringTokenizer stringTokeni = new StringTokenizer(obj, "=");
          if (stringTokeni.countTokens() != 2) {
             Log.e("VivoKTVHelper", "getKTVParam: malformated string "+obj);
          }else if(p0.equals(stringTokeni.nextToken())){
             return Integer.parseInt((stringTokeni.nextToken()).trim());
          }
       }
       return 0;
    }
    public int getMicTypeParam(){
       Object obj = PatchProxy.apply(null, this, VivoKTVHelper.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getKTVParam("vivo_ktv_mic_type");
    }
    public int getMicVolParam(){
       Object obj = PatchProxy.apply(null, this, VivoKTVHelper.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getKTVParam("vivo_ktv_volume_mic");
    }
    public int getPlayFeedbackParam(){
       Object obj = PatchProxy.apply(null, this, VivoKTVHelper.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getKTVParam("vivo_ktv_play_source");
    }
    public int getPreModeParam(){
       Object obj = PatchProxy.apply(null, this, VivoKTVHelper.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getKTVParam("vivo_ktv_preset_effect");
    }
    public int getVoiceOutParam(){
       Object obj = PatchProxy.apply(null, this, VivoKTVHelper.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getKTVParam("vivo_ktv_rec_source");
    }
    public boolean isDeviceSupportKaraoke(){
       String obj = PatchProxy.apply(null, this, VivoKTVHelper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (((Build.MANUFACTURER).trim()).contains("vivo")) {
          String str = "vivo_ktv_mic_type";
          obj = this.mAudioManager.getParameters(str);
          Log.i("VivoKTVHelper", "get+vivo_ktv_mic_type="+obj);
          StringTokenizer stringTokeni = new StringTokenizer(obj, "=");
          int i = stringTokeni.countTokens();
          if (i != 2) {
             Log.i("VivoKTVHelper", "isDeviceSupportKaraoke false tokens "+i);
             return false;
          }else if((stringTokeni.nextToken()).equals(str)){
             i = Integer.parseInt(stringTokeni.nextToken());
             if (i == 1 || !i) {
                return true;
             }
          }
       }
       Log.i("VivoKTVHelper", "isDeviceSupportKaraoke false");
       return false;
    }
    public void openKTVDevice(){
       if (PatchProxy.applyVoid(null, this, VivoKTVHelper.class, "3")) {
          return;
       }
       Log.i("VivoKTVHelper", "openKTVDevice");
       this.mAudioManager.setParameters("vivo_ktv_mode=1");
       return;
    }
    public void setCustomMode(int p0){
       VivoKTVHelper vivoKTVHelpe = VivoKTVHelper.class;
       if (PatchProxy.isSupport(vivoKTVHelpe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, vivoKTVHelpe, "16")) {
          return;
       }
       Log.i("VivoKTVHelper", "setCustomMode: "+p0);
       int i = 6;
       String str = 5;
       StringBuilder str1 = 4;
       String str2 = 8;
       if (!p0) {
          i = 8;
       }else if(p0 == 1 || p0 == 2){
          if (p0 != 3 && p0 != str1) {
             if (p0 != str) {
                if (p0 == i || p0 == 7) {
                   i = 1;
                }else if(p0 == str2){
                   if (p0 != 9) {
                      if (p0 != 10) {
                         if (p0 == 11) {
                            i = 5;
                         }else if(p0 == 12){
                            i = 4;
                         }
                      }
                   }
                }
             }
          }
          i = 0;
       }
    label_003a :
       i = 3;
       Log.i("VivoKTVHelper", "setCustomMode: "+p0+"switch to: "+i);
       VivoKTVHelper tmParamLock = this.mParamLock;
       _monitor_enter(tmParamLock);
       this.setExtSpeakerParam(0);
       this.setGramophoneParams(i);
       this.setReverbParams(i);
       this.setEQParams(i);
       this.setEchoParams(i);
       _monitor_exit(tmParamLock);
       return;
    }
    public final void setEQParams(int p0){
       VivoKTVHelper vivoKTVHelpe = VivoKTVHelper.class;
       if (PatchProxy.isSupport(vivoKTVHelpe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, vivoKTVHelpe, "18")) {
          return;
       }
       int[][] eQCustomGain = VivoKTVHelper.EQCustomGain;
       this.mAudioManager.setParameters("vivo_ktv_miceq_band1="+(eQCustomGain[p0][0] + 8));
       this.mAudioManager.setParameters("vivo_ktv_miceq_band2="+(eQCustomGain[p0][1] + 8));
       this.mAudioManager.setParameters("vivo_ktv_miceq_band3="+(eQCustomGain[p0][2] + 8));
       this.mAudioManager.setParameters("vivo_ktv_miceq_band4="+(eQCustomGain[p0][3] + 8));
       this.mAudioManager.setParameters("vivo_ktv_miceq_band5="+(eQCustomGain[p0][4] + 8));
       return;
    }
    public final void setEchoParams(int p0){
       VivoKTVHelper vivoKTVHelpe = VivoKTVHelper.class;
       if (PatchProxy.isSupport(vivoKTVHelpe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, vivoKTVHelpe, "19")) {
          return;
       }
       if (p0 == 4) {
          this.mAudioManager.setParameters("vivo_ktv_echo_enable=1");
          int[][] echoCustomPa = VivoKTVHelper.EchoCustomParams;
          this.mAudioManager.setParameters("vivo_ktv_echo_feedback="+echoCustomPa[0][0]);
          this.mAudioManager.setParameters("vivo_ktv_echo_delay="+echoCustomPa[0][1]);
          this.mAudioManager.setParameters("vivo_ktv_echo_wet="+echoCustomPa[0][2]);
          this.mAudioManager.setParameters("vivo_ktv_echo_dry="+echoCustomPa[0][3]);
       }
       return;
    }
    public void setExtSpeakerParam(int p0){
       VivoKTVHelper vivoKTVHelpe = VivoKTVHelper.class;
       if (PatchProxy.isSupport(vivoKTVHelpe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, vivoKTVHelpe, "8")) {
          return;
       }
       vivoKTVHelpe = this.mParamLock;
       _monitor_enter(vivoKTVHelpe);
       if (this.mAudioManager != null) {
          this.mAudioManager.setParameters("vivo_ktv_ext_speaker"+"="+p0);
       }
       _monitor_exit(vivoKTVHelpe);
       return;
    }
    public final void setGramophoneParams(int p0){
       VivoKTVHelper vivoKTVHelpe = VivoKTVHelper.class;
       if (PatchProxy.isSupport(vivoKTVHelpe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, vivoKTVHelpe, "20")) {
          return;
       }
       this.mAudioManager.setParameters("vivo_ktv_reverb_preset= (p0 == 7)?4"):0");
       return;
    }
    public void setMicVolParam(int p0){
       VivoKTVHelper vivoKTVHelpe = VivoKTVHelper.class;
       if (PatchProxy.isSupport(vivoKTVHelpe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, vivoKTVHelpe, "5")) {
          return;
       }
       vivoKTVHelpe = this.mParamLock;
       _monitor_enter(vivoKTVHelpe);
       if (this.mAudioManager != null) {
          this.mAudioManager.setParameters("vivo_ktv_volume_mic"+"="+p0);
       }
       _monitor_exit(vivoKTVHelpe);
       return;
    }
    public void setPlayFeedbackParam(int p0){
       VivoKTVHelper vivoKTVHelpe = VivoKTVHelper.class;
       if (PatchProxy.isSupport(vivoKTVHelpe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, vivoKTVHelpe, "7")) {
          return;
       }
       vivoKTVHelpe = this.mParamLock;
       _monitor_enter(vivoKTVHelpe);
       VivoKTVHelper tmAudioManag = this.mAudioManager;
       if (tmAudioManag != null) {
          tmAudioManag.setParameters("vivo_ktv_play_source="+p0);
       }
       _monitor_exit(vivoKTVHelpe);
       return;
    }
    public final void setReverbParams(int p0){
       VivoKTVHelper vivoKTVHelpe = VivoKTVHelper.class;
       if (PatchProxy.isSupport(vivoKTVHelpe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, vivoKTVHelpe, "17")) {
          return;
       }
       int[][] reverbCustom = VivoKTVHelper.ReverbCustomParams;
       this.mAudioManager.setParameters("vivo_ktv_rb_roomsize="+reverbCustom[p0][0]);
       this.mAudioManager.setParameters("vivo_ktv_rb_damp="+reverbCustom[p0][1]);
       this.mAudioManager.setParameters("vivo_ktv_rb_wet="+reverbCustom[p0][2]);
       this.mAudioManager.setParameters("vivo_ktv_rb_dry="+reverbCustom[p0][3]);
       this.mAudioManager.setParameters("vivo_ktv_rb_width="+reverbCustom[p0][4]);
       this.mAudioManager.setParameters("vivo_ktv_rb_gain="+reverbCustom[p0][5]);
       this.mAudioManager.setParameters("vivo_ktv_echo_enable=0");
       return;
    }
    public void setVoiceOutParam(int p0){
       VivoKTVHelper vivoKTVHelpe = VivoKTVHelper.class;
       if (PatchProxy.isSupport(vivoKTVHelpe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, vivoKTVHelpe, "6")) {
          return;
       }
       vivoKTVHelpe = this.mParamLock;
       _monitor_enter(vivoKTVHelpe);
       VivoKTVHelper tmAudioManag = this.mAudioManager;
       if (tmAudioManag != null) {
          tmAudioManag.setParameters("vivo_ktv_rec_source="+p0);
       }
       _monitor_exit(vivoKTVHelpe);
       return;
    }
}

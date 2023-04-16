package com.kwai.video.krtc.rtcengine.internal.RtcEngineInnerSetting;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import java.io.File;
import java.io.FileInputStream;
import java.lang.StringBuilder;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.Reader;
import org.json.JSONException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class RtcEngineInnerSetting	// class@00085f
{
    public String mAryaConfig;
    public boolean mHevc;
    public boolean mIsValid;
    public boolean mOpenApi;
    public int mQosInterval;
    public boolean mUseStannis;
    public boolean mVideoHwDec;
    public boolean mVideoHwEnc;

    public void RtcEngineInnerSetting(){
       super();
       this.mQosInterval = 0x2710;
       this.mOpenApi = true;
       this.mVideoHwEnc = true;
       this.mVideoHwDec = false;
       this.mHevc = false;
       this.mUseStannis = true;
       this.mAryaConfig = "";
       this.mIsValid = true;
    }
    public static RtcEngineInnerSetting getRtcEngineInnerSetting(){
       Object obj = PatchProxy.apply(null, null, RtcEngineInnerSetting.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RtcEngineInnerSetting.loadSettingFromSDCard();
    }
    public static JSONObject loadJsonFromFile(String p0){
       File obj = PatchProxy.applyOneRefs(p0, null, RtcEngineInnerSetting.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new File(p0);
          StringBuilder str = "";
          BufferedReader uBufferedRea = new BufferedReader(new InputStreamReader(new FileInputStream(obj), "utf-8"));
          p0 = uBufferedRea.readLine();
          while (p0 != null) {
             str = str+p0.trim();
          }
          uBufferedRea.close();
          p0 = str;
          if (p0 != null && !p0.isEmpty()) {
             return new JSONObject(p0);
          }
          return null;
       }catch(java.io.UnsupportedEncodingException e5){
          e5.printStackTrace();
       }catch(java.io.FileNotFoundException e0){
       }catch(java.io.IOException e5){
          e5.printStackTrace();
       }catch(org.json.JSONException e5){
          e5.printStackTrace();
       }
       return null;
    }
    public static RtcEngineInnerSetting loadSettingFromSDCard(){
       String str = "aryaConfig";
       String str1 = "useStannis";
       String str2 = "hevc";
       String str3 = "videoHwDec";
       String str4 = "videoHwEnc";
       String str5 = "qosInterval";
       Object[] objArray = null;
       JSONObject obj = PatchProxy.apply(objArray, objArray, RtcEngineInnerSetting.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = RtcEngineInnerSetting.loadJsonFromFile("/sdcard/setting.json");
       if (obj == null) {
          return objArray;
       }
       RtcEngineInnerSetting rtcEngineInn = new RtcEngineInnerSetting();
       boolean b = false;
       try{
          rtcEngineInn.mIsValid = b;
          if (obj.has(str5)) {
             rtcEngineInn.mQosInterval = obj.getInt(str5);
          }
          if (obj.has(str4)) {
             rtcEngineInn.mVideoHwEnc = obj.getBoolean(str4);
          }
          if (obj.has(str3)) {
             rtcEngineInn.mVideoHwDec = obj.getBoolean(str3);
          }
          if (obj.has(str2)) {
             rtcEngineInn.mHevc = obj.getBoolean(str2);
          }
          if (obj.has(str1)) {
             rtcEngineInn.mUseStannis = obj.getBoolean(str1);
          }
          if (obj.has(str)) {
             rtcEngineInn.mAryaConfig = obj.getString(str);
          }
          rtcEngineInn.mIsValid = true;
       }catch(org.json.JSONException e0){
          e0.printStackTrace();
       }
       return rtcEngineInn;
    }
    public boolean isValid(){
       return this.mIsValid;
    }
    public void setValid(boolean p0){
       this.mIsValid = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RtcEngineInnerSetting.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RtcEngineInnerSetting{mQosInterval="+this.mQosInterval+", mOpenApi="+this.mOpenApi+", mVideoHwEnc="+this.mVideoHwEnc+", mVideoHwDec="+this.mVideoHwDec+", mHevc="+this.mHevc+", mUseStannis="+this.mUseStannis+", mIsValid="+this.mIsValid+'}';
    }
}

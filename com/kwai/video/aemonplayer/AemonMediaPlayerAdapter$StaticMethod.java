package com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$StaticMethod;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.aemonplayer.JavaAttrList;
import com.kwai.video.aemonplayer.AemonMediaPlayer;
import java.lang.Number;
import java.lang.Boolean;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.io.IOException;
import com.kwai.video.player.KlogObserver$KlogParam;
import com.kwai.video.aemonplayer.AemonNativeLogger;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$StaticMethod$1;
import com.kwai.video.player.KlogObserver;
import com.kwai.video.aemonplayer.AemonNativeLogger$AemonLoggerCb;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter;

public class AemonMediaPlayerAdapter$StaticMethod	// class@0019ad
{
    public boolean isSetKlogParamCalled;
    public final int jniInstallMode;

    public void AemonMediaPlayerAdapter$StaticMethod(int p0){
       super();
       this.jniInstallMode = p0;
       this.isSetKlogParamCalled = false;
    }
    public String getColorFormatName(int p0){
       JavaAttrList obj;
       AemonMediaPlayerAdapter$StaticMethod staticMethod = AemonMediaPlayerAdapter$StaticMethod.class;
       if (PatchProxy.isSupport(staticMethod)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, staticMethod, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = AemonMediaPlayer.staticNewJavaAttrList(this.jniInstallMode);
       obj.SetIntValue("color_format", p0);
       obj.Destroy();
       return "";
    }
    public int getPlayerAliveCnt(){
       JavaAttrList obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter$StaticMethod.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = AemonMediaPlayer.staticBizInvoke(this.jniInstallMode, 0xc36f, AemonMediaPlayer.staticNewJavaAttrList(this.jniInstallMode));
       obj.Destroy();
       return obj.GetIntValue("ret");
    }
    public String getVersion(){
       JavaAttrList obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter$StaticMethod.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = AemonMediaPlayer.staticNewJavaAttrList(this.jniInstallMode);
       JavaAttrList javaAttrList = AemonMediaPlayer.staticBizInvoke(this.jniInstallMode, 0xc36b, obj);
       obj.Destroy();
       javaAttrList.Destroy();
       return javaAttrList.GetStringValue("version");
    }
    public String getVersionExt(){
       JavaAttrList obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter$StaticMethod.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = AemonMediaPlayer.staticNewJavaAttrList(this.jniInstallMode);
       JavaAttrList javaAttrList = AemonMediaPlayer.staticBizInvoke(this.jniInstallMode, 0xc36c, obj);
       javaAttrList.Destroy();
       obj.Destroy();
       return javaAttrList.GetStringValue("version");
    }
    public boolean isHdrFile(String p0){
       int i;
       MediaExtractor obj = PatchProxy.applyOneRefs(p0, this, AemonMediaPlayerAdapter$StaticMethod.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new MediaExtractor();
       try{
          i = 0;
          obj.setDataSource(p0);
          int i1 = 0;
          while (true) {
             if (i1 >= obj.getTrackCount()) {
                return i;
             }
             MediaFormat trackFormat = obj.getTrackFormat(i1);
             if (trackFormat.containsKey("color-standard")) {
                String str = "color-transfer";
                if (trackFormat.getInteger(str) == 6 || (trackFormat.getInteger(str) == 7 && trackFormat.getInteger("color-standard") == 6)) {
                   break ;
                }
             }
             i1++;
          }
          return true;
       }catch(java.io.IOException e8){
          e8.printStackTrace();
          return i;
       }
    }
    public synchronized void native_setKlogParam(KlogObserver$KlogParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter$StaticMethod.class, "1")) {
          return;
       }
       if (this.isSetKlogParamCalled != null) {
          AemonNativeLogger.i("AnoleLog", "AemonMediaPlayerAdapter#StaticMethod#native_setKlogParam is already set, return");
          return;
       }else {
          KlogObserver$KlogParam logCb = p0.logCb;
          KlogObserver$KlogParam logLevel = p0.logLevel;
          AemonNativeLogger$AemonLoggerCb uAemonLogger = (logCb == null)? null: new AemonMediaPlayerAdapter$StaticMethod$1(this, logCb);
          AemonNativeLogger.setLogConfig(logLevel, uAemonLogger);
          JavaAttrList javaAttrList = AemonMediaPlayer.staticNewJavaAttrList(this.jniInstallMode);
          javaAttrList.SetObjectValue("log_param", p0);
          AemonMediaPlayer.staticBizInvoke(this.jniInstallMode, 0xc36d, javaAttrList);
          javaAttrList.Destroy();
          AemonNativeLogger.i("AnoleLog", "AemonMediaPlayerAdapter#StaticMethod#native_setKlogParam done.");
          this.isSetKlogParamCalled = true;
          return;
       }
    }
    public void native_setKwaiLogLevel(int p0){
       AemonMediaPlayerAdapter$StaticMethod staticMethod = AemonMediaPlayerAdapter$StaticMethod.class;
       if (PatchProxy.isSupport(staticMethod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, staticMethod, "2")) {
          return;
       }
       JavaAttrList javaAttrList = AemonMediaPlayer.staticNewJavaAttrList(this.jniInstallMode);
       javaAttrList.SetIntValue("level", p0);
       AemonMediaPlayer.staticBizInvoke(this.jniInstallMode, 0xc36e, javaAttrList);
       return;
    }
    public void native_setLogLevel(int p0){
       AemonMediaPlayerAdapter$StaticMethod staticMethod = AemonMediaPlayerAdapter$StaticMethod.class;
       if (PatchProxy.isSupport(staticMethod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, staticMethod, "8")) {
          return;
       }
       JavaAttrList javaAttrList = AemonMediaPlayer.staticNewJavaAttrList(this.jniInstallMode);
       javaAttrList.SetIntValue("level", p0);
       AemonMediaPlayer.staticBizInvoke(this.jniInstallMode, 0xc36a, javaAttrList);
       javaAttrList.Destroy();
       return;
    }
    public void setGlobalSwitch(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter$StaticMethod.class, "7")) {
          return;
       }
       JavaAttrList javaAttrList = AemonMediaPlayer.staticNewJavaAttrList(this.jniInstallMode);
       if (p0 == null) {
          p0 = "";
       }
       javaAttrList.SetStringValue("value", p0);
       AemonMediaPlayer.staticBizInvoke(this.jniInstallMode, 0xc38a, javaAttrList);
       javaAttrList.Destroy();
       return;
    }
    public void setPlayerEncryptLiveDebugInfoKey(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter$StaticMethod.class, "6")) {
          return;
       }
       JavaAttrList javaAttrList = AemonMediaPlayer.staticNewJavaAttrList(this.jniInstallMode);
       javaAttrList.SetStringValue("authKey", p0);
       AemonMediaPlayer.staticBizInvoke(this.jniInstallMode, 0xc37e, javaAttrList);
       javaAttrList.Destroy();
       return;
    }
    public void setPlayerNativeDebugInfoAuthKey(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter$StaticMethod.class, "5")) {
          return;
       }
       JavaAttrList javaAttrList = AemonMediaPlayer.staticNewJavaAttrList(this.jniInstallMode);
       javaAttrList.SetStringValue("authKey", p0);
       AemonMediaPlayer.staticBizInvoke(this.jniInstallMode, 0xc37d, javaAttrList);
       javaAttrList.Destroy();
       return;
    }
    public void toneMappingProcess(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AemonMediaPlayerAdapter$StaticMethod.class, "12")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       int width = p0.getWidth();
       int height = p0.getHeight();
       if (p0.getConfig().equals(Bitmap$Config.ARGB_8888)) {
          JavaAttrList javaAttrList = AemonMediaPlayer.staticNewJavaAttrList(this.jniInstallMode);
          javaAttrList.SetObjectValue("bitmap", p0);
          javaAttrList.SetIntValue("width", width);
          javaAttrList.SetIntValue("height", height);
          javaAttrList.SetIntValue("bitdeep", 8);
          AemonMediaPlayer.staticBizInvoke(this.jniInstallMode, 0xc386, javaAttrList);
          javaAttrList.Destroy();
       }else {
          String tAG = AemonMediaPlayerAdapter.TAG;
       }
       return;
    }
}

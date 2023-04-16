package com.facebook.react.modules.systeminfo.AndroidInfoModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import se.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.ContentResolver;
import android.content.ContextWrapper;
import com.kwai.framework.deviceid.a;
import java.util.Map;
import java.util.HashMap;
import android.os.Build$VERSION;
import java.lang.Integer;
import android.os.Build;
import java.lang.System;
import java.lang.Boolean;
import se.c;
import com.facebook.react.modules.systeminfo.a;
import android.content.Context;
import android.content.res.Resources;
import se.b;
import java.lang.Runtime;
import java.lang.Process;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.io.Reader;
import java.lang.Throwable;
import cb.a;
import java.lang.CharSequence;
import java.util.Locale;
import com.facebook.react.bridge.ReactContext;
import android.app.UiModeManager;

public class AndroidInfoModule extends ReactContextBaseJavaModule implements TurboModule	// class@0012f1
{
    public static a sAgreePrivacyProvider;

    public void AndroidInfoModule(ReactApplicationContext p0){
       super(p0);
    }
    public static boolean lambda$getDefaultAgreePrivacyProvider$0(){
       return true;
    }
    public static void setAgreePrivacyProvider(a p0){
       AndroidInfoModule.sAgreePrivacyProvider = p0;
    }
    public String getAndroidID(){
       a obj = PatchProxy.apply(null, this, AndroidInfoModule.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = AndroidInfoModule.sAgreePrivacyProvider;
       if (obj == null) {
          obj = this.getDefaultAgreePrivacyProvider();
       }
       String str = (obj.b())? a.g(this.getReactApplicationContext().getContentResolver(), "android_id"): "";
       return str;
    }
    public Map getConstants(){
       HashMap obj = PatchProxy.apply(null, this, AndroidInfoModule.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("Version", Integer.valueOf(Build$VERSION.SDK_INT));
       obj.put("Release", Build$VERSION.RELEASE);
       obj.put("Serial", Build.SERIAL);
       obj.put("Fingerprint", Build.FINGERPRINT);
       obj.put("Model", Build.MODEL);
       boolean b = (("true").equals(System.getProperty("IS_TESTING")) || this.isRunningScreenshotTest().booleanValue())? true: false;
       obj.put("isTesting", Boolean.valueOf(b));
       obj.put("reactNativeVersion", c.a);
       obj.put("uiMode", this.uiMode());
       return obj;
    }
    public final a getDefaultAgreePrivacyProvider(){
       Object obj = PatchProxy.apply(null, this, AndroidInfoModule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a;
    }
    public String getName(){
       return "PlatformConstants";
    }
    public final String getServerHost(){
       boolean b;
       Process process;
       Throwable throwable;
       BufferedReader uBufferedRea;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Integer obj = PatchProxy.apply(objArray, this, AndroidInfoModule.class, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = Integer.valueOf(this.getReactApplicationContext().getApplicationContext().getResources().getInteger(R.integer.arg_RES_7f0b003b));
       b uob = b.class;
       String obj1 = PatchProxy.applyOneRefs(obj, objArray, uob, "3");
       if (obj1 != patchProxyRe) {
       }else {
          int i = obj.intValue();
          if (PatchProxy.isSupport(uob)) {
             obj1 = PatchProxy.applyOneRefs(Integer.valueOf(i), objArray, uob, "11");
             if (obj1 != patchProxyRe) {
             }
          }
          _monitor_enter(uob);
          obj1 = PatchProxy.apply(objArray, objArray, uob, "12");
          if (obj1 != patchProxyRe) {
             _monitor_exit(uob);
          }else {
             obj1 = b.b;
             if (obj1 != null) {
                _monitor_exit(uob);
             }else {
                try{
                   String[] stringArray = new String[]{"/system/bin/getprop","metro.host"};
                   process = Runtime.getRuntime().exec(stringArray);
                   try{
                      InputStreamReader inputStreamR = new InputStreamReader(process.getInputStream(), Charset.forName("UTF-8"));
                      try{
                         uBufferedRea = new BufferedReader(inputStreamR);
                         String str = "";
                         String str1 = uBufferedRea.readLine();
                         while (str1 != null) {
                            str = str1;
                         }
                         b.b = str;
                         try{
                            uBufferedRea.close();
                         }catch(java.lang.Exception e0){
                         }
                      }catch(java.lang.Exception e6){
                      }
                   }catch(java.lang.Exception e5){
                      throwable = e5;
                      uBufferedRea = objArray;
                   }
                }catch(java.lang.Exception e4){
                   throwable = e4;
                   process = objArray;
                   uBufferedRea = process;
                }
                process.destroy();
             }
          }
          if (obj1.equals("")) {
             if (b.b()) {
                obj1 = "10.0.3.2";
             }else {
                Object obj2 = PatchProxy.apply(objArray, objArray, uob, "2");
                b = (obj2 != patchProxyRe)? obj2.booleanValue(): (Build.FINGERPRINT).contains("generic");
                if (b) {
                   obj1 = "10.0.2.2";
                }else {
                   obj1 = "localhost";
                }
             }
          }
          objArray = new Object[]{obj1,Integer.valueOf(i)};
          obj1 = String.format(Locale.US, "%s:%d", objArray);
       }
       return obj1;
    }
    public void invalidate(){
    }
    public final Boolean isRunningScreenshotTest(){
       Object obj = PatchProxy.apply(null, this, AndroidInfoModule.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          Class.forName("com.facebook.testing.react.screenshots.ReactAppScreenshotTestActivity");
          return Boolean.TRUE;
       }catch(java.lang.ClassNotFoundException e0){
          return Boolean.FALSE;
       }
    }
    public final String uiMode(){
       Object obj = PatchProxy.apply(null, this, AndroidInfoModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int currentModeT = this.getReactApplicationContext().getSystemService("uimode").getCurrentModeType();
       if (currentModeT == 1) {
          return "normal";
       }
       if (currentModeT == 2) {
          return "desk";
       }
       if (currentModeT == 3) {
          return "car";
       }
       if (currentModeT == 4) {
          return "tv";
       }
       if (currentModeT != 6) {
          return "unknown";
       }
       return "watch";
    }
}

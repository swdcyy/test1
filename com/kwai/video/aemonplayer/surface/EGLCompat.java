package com.kwai.video.aemonplayer.surface.EGLCompat;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.Context;
import android.app.ActivityManager;
import android.content.pm.ConfigurationInfo;

public class EGLCompat	// class@0019d8
{
    public static Boolean sEnableOpenGlEs30;

    public void EGLCompat(){
       super();
    }
    public static synchronized boolean isEnableOpenGlEs30(){
       _monitor_enter(EGLCompat.class);
       Boolean obj = PatchProxy.apply(null, null, EGLCompat.class, "2");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(EGLCompat.class);
          return obj.booleanValue();
       }else {
          obj = EGLCompat.sEnableOpenGlEs30;
          if (obj != null) {
             _monitor_exit(EGLCompat.class);
             return obj.booleanValue();
          }else {
             _monitor_exit(EGLCompat.class);
             return false;
          }
       }
    }
    public static synchronized void setup(Context p0){
       boolean b;
       _monitor_enter(EGLCompat.class);
       if (PatchProxy.applyVoidOneRefs(p0, null, EGLCompat.class, "1")) {
          _monitor_exit(EGLCompat.class);
          return;
       }else if(EGLCompat.sEnableOpenGlEs30 != null){
          _monitor_exit(EGLCompat.class);
          return;
       }else if(p0 == null){
          _monitor_exit(EGLCompat.class);
          return;
       }else {
          ActivityManager systemServic = p0.getSystemService("activity");
          if (systemServic == null) {
             EGLCompat.sEnableOpenGlEs30 = Boolean.FALSE;
             _monitor_exit(EGLCompat.class);
             return;
          }else {
             ConfigurationInfo deviceConfig = systemServic.getDeviceConfigurationInfo();
             if (deviceConfig == null) {
                EGLCompat.sEnableOpenGlEs30 = Boolean.FALSE;
                _monitor_exit(EGLCompat.class);
                return;
             }else if(deviceConfig.reqGlEsVersion >= 0x30000){
                b = true;
             }else {
                b = false;
             }
             EGLCompat.sEnableOpenGlEs30 = Boolean.valueOf(b);
             _monitor_exit(EGLCompat.class);
             return;
          }
       }
    }
}

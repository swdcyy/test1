package com.kwai.video.player.kwai_player.KwaiBrightnessUtil;
import java.lang.Object;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.ContentResolver;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.provider.Settings$System;
import android.provider.Settings$SettingNotFoundException;

public class KwaiBrightnessUtil	// class@000b33
{
    public static ContentResolver contentResolver;

    public void KwaiBrightnessUtil(){
       super();
    }
    public static int adjustBrightnessNumber(int p0){
       int i = 255;
       if (p0 < 0) {
          p0 = 0;
       }else if(p0 > i){
          p0 = 255;
       }
       return (int)(((float)p0 / 0x437f0000) * 100.00f);
    }
    public static void collectBrightnessInfo(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KwaiBrightnessUtil.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       KwaiBrightnessUtil.contentResolver = p0.getContentResolver();
       return;
    }
    public static int getSystemBrightAutoMode(){
       Object obj = PatchProxy.apply(null, null, KwaiBrightnessUtil.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       try{
          i = Settings$System.getInt(KwaiBrightnessUtil.contentResolver, "screen_brightness_mode");
       }catch(android.provider.Settings$SettingNotFoundException e1){
          e1.printStackTrace();
       }
       return i;
    }
    public static int getSystemBrightnessPercent(){
       Object obj = PatchProxy.apply(null, null, KwaiBrightnessUtil.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return KwaiBrightnessUtil.adjustBrightnessNumber(KwaiBrightnessUtil.getSystemBrightnessValue());
    }
    public static int getSystemBrightnessValue(){
       ContentResolver obj = PatchProxy.apply(null, null, KwaiBrightnessUtil.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = KwaiBrightnessUtil.contentResolver;
       if (obj == null) {
          return 0;
       }
       return Settings$System.getInt(obj, "screen_brightness", 255);
    }
}

package com.kwai.video.krtc.utils.PlatformCapability;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.media.MediaCodecList;
import android.media.MediaCodecInfo;
import java.util.ArrayList;
import com.kwai.video.krtc.utils.PlatformCapability$VideoCodecInfo;
import java.util.Iterator;
import java.lang.Throwable;
import com.kwai.video.krtc.utils.Log;
import java.lang.StringBuilder;
import android.media.MediaCodecInfo$CodecCapabilities;
import android.media.MediaCodecInfo$CodecProfileLevel;
import android.media.MediaCodecInfo$EncoderCapabilities;
import android.content.Context;
import android.os.Build;
import android.os.Build$VERSION;

public final class PlatformCapability	// class@0008bc
{
    public static final String[] a;
    public static final int[] b;
    public static String c;
    public static String d;
    public static String e;
    public static String f;

    static {
       String[] stringArray = new String[]{"video/avc","video/hevc","video/x-vnd.on2.vp8","video/x-vnd.on2.vp9"};
       PlatformCapability.a = stringArray;
       PlatformCapability.b = new int[4]{0,1,2,3};
       PlatformCapability.c = "";
       PlatformCapability.d = "";
       PlatformCapability.e = "";
       PlatformCapability.f = "";
    }
    public void PlatformCapability(){
       super();
    }
    public static long GetVideoCodecCapability(){
       long l;
       MediaCodecInfo[] obj = PatchProxy.apply(null, null, PlatformCapability.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       try{
          int i = 0;
          obj = new MediaCodecList(i).getCodecInfos();
          ArrayList uArrayList = new ArrayList();
          int len = obj.length;
          int i1 = 0;
          while (i1 < len) {
             object oobject = obj[i1];
             if (oobject != null) {
                uArrayList.add(new PlatformCapability$VideoCodecInfo(oobject.isEncoder(), oobject.getSupportedTypes()));
             }
             i1 = i1 + 1;
          }
          len = 0;
          long l1 = 0;
          String[] a = PlatformCapability.a;
          while (len < a.length) {
             object oobject1 = a[len];
             Iterator iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                PlatformCapability$VideoCodecInfo videoCodecIn = iterator.next();
                PlatformCapability$VideoCodecInfo mimes = videoCodecIn.mimes;
                int len1 = mimes.length;
                int i2 = 0;
                while (i2 < len1) {
                   if (oobject1.equalsIgnoreCase(mimes[i2])) {
                      if (videoCodecIn.encoder != null) {
                         int i3 = PlatformCapability.b[len] + i;
                         i3 = 1 << i3;
                         l = (long)i3;
                      }else {
                         int i4 = PlatformCapability.b[len] + 8;
                         i4 = 1 << i4;
                         l = (long)i4;
                      }
                      l1 = l1 | l;
                   }
                   i2 = i2 + 1;
                }
             }
             len = len + 1;
          }
          l = PlatformCapability.a(obj) | l1;
       }catch(java.lang.RuntimeException e0){
          Log.e("PlatformCapability", "get video codec capability exception", e0);
          l = 0;
       }
       Log.i("PlatformCapability", "video codec capability: "+l);
       return l;
    }
    public static long a(MediaCodecInfo[] p0){
       int i3;
       int i4;
       object oobject1;
       String[] stringArray;
       Object obj = p0;
       MediaCodecInfo$CodecCapabilities obj1 = PatchProxy.applyOneRefs(obj, null, PlatformCapability.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1.longValue();
       }
       long l = 0;
       int len = obj.length;
       int i = 0;
       while (i < len) {
          object oobject = obj[i];
          if (oobject != null && oobject.isEncoder()) {
             String[] supportedTyp = oobject.getSupportedTypes();
             int len1 = supportedTyp.length;
             int i1 = 0;
             while (i1 < len1) {
                String str = "video/avc";
                if ((supportedTyp[i1]).equalsIgnoreCase(str)) {
                   long l1 = 1;
                   try{
                      obj1 = oobject.getCapabilitiesForType(str);
                      MediaCodecInfo$CodecCapabilities profileLevel = obj1.profileLevels;
                      int len2 = profileLevel.length;
                      int i2 = 0;
                      while (i2 < len2) {
                         MediaCodecInfo$CodecProfileLevel profile = profileLevel[i2].profile;
                         oobject1 = oobject;
                         stringArray = supportedTyp;
                         if ((long)profile - l1 > 0) {
                            l1 = (long)profile;
                         }
                         i2 = i2 + 1;
                         oobject = oobject1;
                         supportedTyp = stringArray;
                      }
                      long l2 = 127 & l1;
                      l2 = l2 << 16;
                      l = l | l2;
                      try{
                         if (obj1.getEncoderCapabilities().isBitrateModeSupported(2)) {
                            l = l | 0x800000;
                         }
                      }catch(java.lang.IllegalArgumentException e0){
                      }
                      Log.e("PlatformCapability", "Cannot retrieve encoder capabilities", e0);
                   label_008a :
                      i1 = i1 + 1;
                      oobject = i3;
                      supportedTyp = i4;
                   }catch(java.lang.IllegalArgumentException e0){
                      i3 = oobject;
                      i4 = supportedTyp;
                      goto label_007e ;
                   }
                }else {
                   oobject1 = oobject;
                   stringArray = supportedTyp;
                   goto label_008a ;
                }
             }
          }
          i = i + 1;
       }
       return l;
    }
    public static void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, PlatformCapability.class, "1")) {
          return;
       }
       try{
          PlatformCapability.c = p0.getPackageName();
          int i = 2;
          Object[] objArray = new Object[i];
          objArray[0] = Build.BRAND;
          objArray[1] = Build.MODEL;
          PlatformCapability.d = String.format("%s %s", objArray);
          objArray = new Object[i];
          objArray[0] = Build.CPU_ABI;
          objArray[1] = Build.HARDWARE;
          PlatformCapability.e = String.format("%s %s", objArray);
          if (Build$VERSION.SDK_INT >= 23) {
             Object[] objArray1 = new Object[i];
             objArray1[0] = Build$VERSION.RELEASE;
             objArray1[1] = Build$VERSION.BASE_OS;
             PlatformCapability.f = String.format("%s %s", objArray1);
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static String getCPUInfo(){
       return PlatformCapability.e;
    }
    public static String getDeviceInfo(){
       return PlatformCapability.d;
    }
    public static String getModelName(){
       return Build.MODEL;
    }
    public static String getOSInfo(){
       return PlatformCapability.f;
    }
    public static String getPackageName(){
       return PlatformCapability.c;
    }
    public static int getVersion(){
       return Build$VERSION.SDK_INT;
    }
}

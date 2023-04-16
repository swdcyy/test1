package com.kwai.sdk.kbar.qrdetection.JniQrCodeDetection;
import java.lang.Object;
import wkd.b;
import eo7.b;
import java.lang.String;
import com.kwai.sdk.kbar.qrdetection.JniQrCodeDetection$QRCodeEncodeSetting;
import com.kwai.sdk.kbar.qrdetection.kbarImage;
import java.lang.System;
import java.lang.UnsatisfiedLinkError;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.kwai.sdk.kbar.qrdetection.DecodeRet;
import com.kwai.sdk.kbar.qrdetection.KBarConfig;

public class JniQrCodeDetection	// class@00161e
{
    public long a;
    public boolean b;
    public KBarConfig c;
    public static b d;

    static {
       JniQrCodeDetection.d = b.a(-930908567);
    }
    public void JniQrCodeDetection(){
       super();
       this.a = 0;
       this.b = false;
    }
    public static boolean a(){
       b d = JniQrCodeDetection.d;
       if (d != null) {
          return d.c();
       }
       return true;
    }
    public static native void argbToNv21(byte[] p0,int[] p1,int p2,int p3);
    public static boolean b(){
       b d = JniQrCodeDetection.d;
       if (d != null) {
          return d.a();
       }
       return true;
    }
    public static native long createHandler();
    public static native kbarImage encodeAdvanced(long p0,String p1,JniQrCodeDetection$QRCodeEncodeSetting p2);
    public static native kbarImage encodeAuto(long p0,String p1,boolean p2,int p3);
    public static native void nativeCleanDYDetectModel(long p0);
    public static native long nativeCreateDYDetectHandler();
    public static native int nativeDetectDYLogo(long p0,byte[] p1,int p2,int p3,int p4,byte p5,byte p6);
    public static native int nativeDetectDYLogoWithPath(long p0,String p1);
    public static native void nativeLoadDYDetectModel(long p0,String p1);
    public boolean c(){
       boolean b = (JniQrCodeDetection.b() && this.a)? true: false;
       return b;
    }
    public native final int[] calc(long p0,byte[] p1,int p2,int p3,int p4,byte p5,byte p6,byte p7,double p8,int p9,int p10,int p11,int p12);
    public native final void cleanModel(long p0);
    public final boolean d(){
       if (!JniQrCodeDetection.b()) {
          b d = JniQrCodeDetection.d;
          if (d != null) {
             d.b();
          }
          return false;
       }else {
          try{
             System.loadLibrary("mmu_new_lib");
             return true;
          }catch(java.lang.UnsatisfiedLinkError e0){
             e0.printStackTrace();
             Log.d("[kbar-api]", "load mmu_new_lib error: "+e0.getLocalizedMessage());
             return v1;
          }
       }
    }
    public native final String decode(long p0,byte[] p1,int p2,int p3,int p4,byte p5,byte p6,byte p7,double p8,int p9,int p10,int p11,int p12,int p13);
    public native final DecodeRet[] decodeV2(long p0,byte[] p1,int p2,int p3,int p4,byte p5,byte p6,byte p7,double p8,int p9,int p10,int p11,int p12,int p13);
    public native final kbarImage encode(long p0,String p1);
    public native final int nativeLoadConfig(long p0,KBarConfig p1);
}

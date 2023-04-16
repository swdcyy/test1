package com.taobao.gcanvas.GCanvasJNI;
import java.lang.String;
import java.util.HashMap;
import java.lang.Object;
import java.lang.System;
import java.lang.Exception;
import java.lang.UnsatisfiedLinkError;
import com.taobao.gcanvas.a;
import java.io.File;
import java.util.Set;
import java.util.Iterator;
import java.util.List;
import android.graphics.Bitmap;

public class GCanvasJNI	// class@000ded
{
    public static boolean a;
    public static boolean b;
    public static List c;
    public static Map d;
    public static Map e;
    public static Map f;

    static {
       GCanvasJNI.a("StaticBlock");
       GCanvasJNI.d = new HashMap();
       GCanvasJNI.e = new HashMap();
       GCanvasJNI.f = new HashMap();
    }
    public void GCanvasJNI(){
       super();
    }
    public static void a(String p0){
       if (GCanvasJNI.a) {
          return;
       }
       boolean b = true;
       boolean b1 = false;
       try{
          GCanvasJNI.a = b;
          System.loadLibrary("freetype");
          System.loadLibrary("gcanvas");
          GCanvasJNI.b();
       }catch(java.lang.UnsatisfiedLinkError e1){
          GCanvasJNI.a = b1;
          e1.getLocalizedMessage();
       }catch(java.lang.Exception e1){
          GCanvasJNI.a = b1;
          e1.getLocalizedMessage();
       }
       return;
    }
    public static native void addFallbackFontFamily(String[] p0);
    public static native void addFontFamily(String[] p0,String[] p1);
    public static void b(){
       String str;
       a uoa = new a();
       if (new File("/system/fonts/DroidSansFallbackBBK.ttf").exists()) {
          str = "DroidSansFallbackBBK.ttf";
       }else if(new File("/system/fonts/NotoSansHans-Regular.otf").exists()){
          str = "NotoSansHans-Regular.otf";
       }else if(new File("/system/fonts/NotoSansSC-Regular.otf").exists()){
          str = "NotoSansSC-Regular.otf";
       }else if(new File("/system/fonts/NotoSansCJK-Regular.ttc").exists()){
          str = "NotoSansCJK-Regular.ttc";
       }else if(new File("/system/fonts/DroidSansFallback.ttf").exists()){
          str = "DroidSansFallback.ttf";
       }else {
          str = "DroidSans.ttf";
       }
       GCanvasJNI.setFallbackFont(str, "/system/fonts/");
       a b = uoa.b;
       if (b != null) {
          b.size();
       }
       int i = 0;
       if (b != null) {
          Iterator iterator = b.keySet().iterator();
          while (iterator.hasNext()) {
             List list = iterator.next();
             int i1 = list.size();
             String[] stringArray = new String[i1];
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                stringArray[i2] = list.get(i2);
             }
             list = b.get(list);
             i1 = list.size();
             String[] stringArray1 = new String[i1];
             for (int i3 = 0; i3 < i1; i3 = i3 + 1) {
                stringArray1[i3] = list.get(i3);
             }
             GCanvasJNI.addFontFamily(stringArray, stringArray1);
          }
       }
       uoa = uoa.c;
       if (uoa == null) {
          return;
       }else {
          int i4 = uoa.size();
          String[] stringArray2 = new String[i4];
          for (; i < i4; i = i + 1) {
             stringArray2[i] = uoa.get(i);
          }
          GCanvasJNI.addFallbackFontFamily(stringArray2);
          return;
       }
    }
    public static native void bindTexture(String p0,Bitmap p1,int p2,int p3,int p4,int p5,int p6,int p7);
    public static native String getImageData(String p0,int p1,int p2,int p3,int p4);
    public static native int getNativeFps(String p0);
    public static native boolean isFboSupport(String p0);
    public static native boolean isNeonSupport();
    public static native void registerCallback(String p0,int p1);
    public static native void release();
    public static native String render(String p0,String p1,int p2);
    public static native boolean sendEvent(String p0);
    public static native void setClearColor(String p0,String p1);
    public static native void setConfig(String p0,int p1);
    public static native void setContextType(String p0,int p1);
    public static native void setDevicePixelRatio(String p0,double p1);
    public static native void setFallbackFont(String p0,String p1);
    public static native void setHiQuality(String p0,boolean p1);
    public static native void setLogLevel(String p0);
    public static native void setOrtho(String p0,int p1,int p2);
    public static native void setPreCompilePath(String p0);
    public static native void setTyOffsetFlag(String p0,boolean p1);
}

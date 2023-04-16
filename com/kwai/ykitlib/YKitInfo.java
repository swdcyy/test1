package com.kwai.ykitlib.YKitInfo;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.ykitlib.YKitInfo$YKitFaceData;
import java.lang.Integer;

public class YKitInfo	// class@00115a
{

    public void YKitInfo(){
       super();
    }
    public static int getAnyArraySize(String[] p0,long p1){
       YKitInfo yKitInfo = YKitInfo.class;
       if (PatchProxy.isSupport(yKitInfo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), null, yKitInfo, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return YKitInfo.nativeGetAnyArraySize(p0, p1);
    }
    public static int getFaceFromAny(YKitInfo$YKitFaceData p0,long p1){
       YKitInfo yKitInfo = YKitInfo.class;
       if (PatchProxy.isSupport(yKitInfo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), null, yKitInfo, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return YKitInfo.nativeGetFaceDataFromAny(p0, p1);
    }
    public static float[] getFloatArrayFromAny(String[] p0,long p1){
       YKitInfo yKitInfo = YKitInfo.class;
       if (PatchProxy.isSupport(yKitInfo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), null, yKitInfo, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return YKitInfo.nativeGetFloatArrayDataFromAny(p0, p1);
    }
    public static float[] getFloatArrayFromAnyArray(String[] p0,int p1,String[] p2,long p3){
       if (PatchProxy.isSupport(YKitInfo.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, Long.valueOf(p3), null, YKitInfo.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return YKitInfo.nativeGetFloatArrayDataFromAnyArray(p0, p1, p2, p3);
    }
    public static float getFloatFromAny(String[] p0,long p1){
       YKitInfo yKitInfo = YKitInfo.class;
       if (PatchProxy.isSupport(yKitInfo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), null, yKitInfo, "5");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return YKitInfo.nativeGetFloatDataFromAny(p0, p1);
    }
    public static float getFloatFromAnyArray(String[] p0,int p1,String[] p2,long p3){
       if (PatchProxy.isSupport(YKitInfo.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, Long.valueOf(p3), null, YKitInfo.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return YKitInfo.nativeGetFloatDataFromAnyArray(p0, p1, p2, p3);
    }
    public static int[] getIntArrayFromAny(String[] p0,long p1){
       YKitInfo yKitInfo = YKitInfo.class;
       if (PatchProxy.isSupport(yKitInfo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), null, yKitInfo, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return YKitInfo.nativeGetIntArrayDataFromAny(p0, p1);
    }
    public static int[] getIntArrayFromAnyArray(String[] p0,int p1,String[] p2,long p3){
       if (PatchProxy.isSupport(YKitInfo.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, Long.valueOf(p3), null, YKitInfo.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return YKitInfo.nativeGetIntArrayDataFromAnyArray(p0, p1, p2, p3);
    }
    public static int getIntFromAny(String[] p0,long p1){
       YKitInfo yKitInfo = YKitInfo.class;
       if (PatchProxy.isSupport(yKitInfo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), null, yKitInfo, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return YKitInfo.nativeGetIntDataFromAny(p0, p1);
    }
    public static int getIntFromAnyArray(String[] p0,int p1,String[] p2,long p3){
       if (PatchProxy.isSupport(YKitInfo.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, Long.valueOf(p3), null, YKitInfo.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return YKitInfo.nativeGetIntDataFromAnyArray(p0, p1, p2, p3);
    }
    public static String getStringFromAny(String[] p0,long p1){
       YKitInfo yKitInfo = YKitInfo.class;
       if (PatchProxy.isSupport(yKitInfo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), null, yKitInfo, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return YKitInfo.nativeGetStringDataFromAny(p0, p1);
    }
    public static native int nativeGetAnyArraySize(String[] p0,long p1);
    public static native int nativeGetFaceDataFromAny(YKitInfo$YKitFaceData p0,long p1);
    public static native float[] nativeGetFloatArrayDataFromAny(String[] p0,long p1);
    public static native float[] nativeGetFloatArrayDataFromAnyArray(String[] p0,int p1,String[] p2,long p3);
    public static native float nativeGetFloatDataFromAny(String[] p0,long p1);
    public static native float nativeGetFloatDataFromAnyArray(String[] p0,int p1,String[] p2,long p3);
    public static native int[] nativeGetIntArrayDataFromAny(String[] p0,long p1);
    public static native int[] nativeGetIntArrayDataFromAnyArray(String[] p0,int p1,String[] p2,long p3);
    public static native int nativeGetIntDataFromAny(String[] p0,long p1);
    public static native int nativeGetIntDataFromAnyArray(String[] p0,int p1,String[] p2,long p3);
    public static native String nativeGetStringDataFromAny(String[] p0,long p1);
}

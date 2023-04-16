package com.ks.ksuploader.KSSpeedTester;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.ks.ksuploader.KSUploaderLogLevel;
import java.lang.StringBuilder;
import com.ks.ksuploader.KSUploader;
import java.util.HashSet;
import java.util.Iterator;
import com.ks.ksuploader.KSEncodePreset;
import java.lang.Integer;
import java.util.Map;
import java.lang.Double;
import java.lang.Math;
import java.util.HashMap;
import java.lang.Long;
import com.google.gson.c;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.Exception;
import android.content.Context;
import com.ks.ksapi.b;
import java.lang.System;
import com.ks.ksuploader.KSFileUploader;
import com.ks.ksuploader.KSSpeedTester$1;
import com.ks.ksuploader.KSUploader$KSUploaderSpeedTestListener;

public class KSSpeedTester	// class@00075a
{
    public static int defaultEncodePreset;
    public static int encodePreferRatio;
    public static int mLastSpeedTestResult;
    public static long mLastSpeedTestTs;
    public static final int[] orderedPresets;
    public static KSUploader uploader;

    static {
       KSSpeedTester.orderedPresets = new int[4]{2,3,1,0};
       KSSpeedTester.uploader = null;
       KSSpeedTester.mLastSpeedTestTs = 0;
       KSSpeedTester.mLastSpeedTestResult = 0;
       KSSpeedTester.encodePreferRatio = 0;
       KSSpeedTester.defaultEncodePreset = 0;
    }
    public void KSSpeedTester(){
       super();
    }
    public static int chooseDefaultEncodePreset(List p0){
       int i1;
       Object obj = PatchProxy.applyOneRefs(p0, null, KSSpeedTester.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "getEncodePreset chooseDefaultEncodePreset, prefered: "+KSSpeedTester.defaultEncodePreset);
       int defaultEncod = KSSpeedTester.defaultEncodePreset;
       HashSet hashSet = new HashSet();
       Iterator iterator = p0.iterator();
       while (true) {
          if (iterator.hasNext()) {
             KSEncodePreset type = iterator.next().type;
             if (KSSpeedTester.defaultEncodePreset == type) {
                break ;
             }else {
                hashSet.add(Integer.valueOf(type));
             }
          }else {
             int[] orderedPrese = KSSpeedTester.orderedPresets;
             int len = orderedPrese.length;
             int i = 0;
             while (true) {
                if (i < len) {
                   i1 = orderedPrese[i];
                   if (hashSet.contains(Integer.valueOf(i1))) {
                   }else {
                      i = i + 1;
                   }
                }else {
                   KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "getEncodePreset chooseDefaultEncodePreset, not found");
                   return -1;
                }
             }
             KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "getEncodePreset choose preset in order: "+defaultEncod);
             return i1;
          }
       }
       KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "getEncodePreset chooseDefaultEncodePreset, preset: "+defaultEncod);
       return KSSpeedTester.defaultEncodePreset;
    }
    public static int chooseEncodePreset(Map p0){
       double d3;
       double d4;
       Object obj = p0;
       KSUploaderLogLevel obj1 = PatchProxy.applyOneRefs(obj, null, KSSpeedTester.class, "4");
       if (obj1 != PatchProxyResult.class) {
          return obj1.intValue();
       }
       obj1 = KSUploaderLogLevel.KSUploaderLogLevel_Info;
       KSUploader.postLog(obj1, "chooseEncodePreset with ratio "+KSSpeedTester.encodePreferRatio);
       int i = 2;
       double d = 100.00f;
       double d1 = 0x3ff0000000000000;
       int i1 = 3;
       if (obj.containsKey(Integer.valueOf(i))) {
          double d2 = (obj.containsKey(Integer.valueOf(i1)))? obj.get(Integer.valueOf(i1)).doubleValue(): Double.MAX_VALUE;
          d3 = (obj.containsKey(Integer.valueOf(0)))? obj.get(Integer.valueOf(0)).doubleValue(): Double.MAX_VALUE;
          d4 = (obj.containsKey(Integer.valueOf(1)))? obj.get(Integer.valueOf(1)).doubleValue(): Double.MAX_VALUE;
          d3 = Math.min(d2, Math.min(d3, d4));
          d4 = ((((double)KSSpeedTester.encodePreferRatio * d1) / d) + d1) * d3;
          StringBuilder str = "Min cost of HW and SW: "+d3;
          KSUploader.postLog(obj1, str+", accepted SKIP threshold: "+d4);
          if (obj.get(Integer.valueOf(i)).doubleValue() - d4 <= 0) {
             return i;
          }else {
             obj.remove(Integer.valueOf(i));
          }
       }
       i = 1;
       if (obj.containsKey(Integer.valueOf(i)) || obj.containsKey(Integer.valueOf(3))) {
          Integer integer = Integer.valueOf(i);
          double d5 = (obj.containsKey(Integer.valueOf(i)))? obj.get(Integer.valueOf(i)).doubleValue(): Double.MAX_VALUE;
          obj.put(integer, Double.valueOf(d5));
          i = 3;
          integer = Integer.valueOf(i);
          d5 = (obj.containsKey(Integer.valueOf(i)))? obj.get(Integer.valueOf(i)).doubleValue(): Double.MAX_VALUE;
          obj.put(integer, Double.valueOf(d5));
          d3 = (obj.containsKey(Integer.valueOf(0)))? obj.get(Integer.valueOf(0)).doubleValue(): Double.MAX_VALUE;
          d4 = ((((double)KSSpeedTester.encodePreferRatio * d1) / d) + d1) * d3;
          KSUploader.postLog(obj1, "Cost of SW: "+d3+", accepted HW threshold: "+d4);
          int i2 = 3;
          if (obj.get(Integer.valueOf(i2)).doubleValue() - obj.get(Integer.valueOf(1)).doubleValue() <= 0 && obj.get(Integer.valueOf(i2)).doubleValue() - d4 <= 0) {
             return i2;
          }else if(obj.get(Integer.valueOf(1)).doubleValue() - d4 <= 0){
             return 1;
          }
       }
       return 0;
    }
    public static int getEncodePreset(List p0,String p1){
       HashMap hashMap;
       Iterator iterator1;
       long l1;
       double d;
       double d3;
       double d4;
       KSEncodePreset kSEncodePres2;
       HashMap hashMap1;
       double d5;
       Object[] objArray2;
       int i5;
       HashMap obj = p1;
       KSSpeedTester kSSpeedTeste = KSSpeedTester.class;
       KSUploader obj1 = PatchProxy.applyTwoRefs(p0, obj, null, kSSpeedTeste, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1.intValue();
       }
       _monitor_enter(kSSpeedTeste);
       obj1 = KSSpeedTester.uploader;
       if (obj1 != null) {
          KSSpeedTester.mLastSpeedTestResult = obj1.getNetSpeed();
       }
       _monitor_exit(kSSpeedTeste);
       if (KSSpeedTester.mLastSpeedTestResult <= 0 || p0.isEmpty()) {
          return KSSpeedTester.chooseDefaultEncodePreset(p0);
       }else {
          KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "getEncodePreset netSpeed "+KSSpeedTester.mLastSpeedTestResult+" kbps of taskId: "+obj);
          obj = new HashMap();
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             KSEncodePreset kSEncodePres = iterator.next();
             KSUploaderLogLevel kSUploaderLo = KSUploaderLogLevel.KSUploaderLogLevel_Info;
             Object[] objArray = new Object[5];
             int i = 0;
             objArray[i] = Integer.valueOf(kSEncodePres.type);
             int i1 = 1;
             objArray[i1] = Long.valueOf(kSEncodePres.fileSize);
             int i2 = 2;
             objArray[i2] = Integer.valueOf(kSEncodePres.transcodeTimeCostMs);
             objArray[3] = Integer.valueOf(kSEncodePres.videoDurationMs);
             objArray[4] = Integer.valueOf(kSEncodePres.videoFragmentDurationMs);
             KSUploader.postLog(kSUploaderLo, String.format("encode preset type %d, filesize %d, transcodeTimeCostMs %d, videoDurationMs %d, videoFragmentDurationMs %d", objArray));
             KSEncodePreset fileSize = kSEncodePres.fileSize;
             if (!fileSize || kSEncodePres.videoDurationMs == null) {
                hashMap = obj;
                iterator1 = iterator;
                KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Warn, "Wrong preset, skip");
             }else {
                long l = 8;
                if (kSEncodePres.type != i2) {
                   l1 = fileSize * l;
                   l1 = l1 / (long)kSEncodePres.transcodeTimeCostMs;
                   d = (double)l1;
                   Object[] objArray1 = new Object[i1];
                   objArray1[i] = Double.valueOf(d);
                   KSUploader.postLog(kSUploaderLo, String.format("encodeSpeed %f kbps", objArray1));
                   KSEncodePreset videoDuratio = kSEncodePres.videoDurationMs;
                   KSEncodePreset videoFragmen = kSEncodePres.videoFragmentDurationMs;
                   int i3 = videoDuratio + videoFragmen;
                   i3 = i3 - i1;
                   i3 = i3 / videoFragmen;
                   KSEncodePreset fileSize1 = kSEncodePres.fileSize;
                   double d1 = d;
                   double d2 = (double)fileSize1 / (double)videoDuratio;
                   d2 = d2 * (double)videoFragmen;
                   KSEncodePreset transcodeTim = kSEncodePres.transcodeTimeCostMs;
                   KSEncodePreset kSEncodePres1 = fileSize1;
                   d = (double)transcodeTim / (double)videoDuratio;
                   d = d * (double)videoFragmen;
                   int i4 = videoDuratio % videoFragmen;
                   if (!i4) {
                      d3 = d;
                      d4 = d2;
                      kSEncodePres2 = kSEncodePres1;
                   }else {
                      kSEncodePres2 = kSEncodePres1;
                      d4 = (double)kSEncodePres2 % d2;
                      d3 = (double)transcodeTim % d;
                   }
                   int mLastSpeedTe = KSSpeedTester.mLastSpeedTestResult;
                   hashMap1 = obj;
                   iterator1 = iterator;
                   if ((double)mLastSpeedTe - d1 <= 0) {
                      long l2 = kSEncodePres2 * 8;
                      l2 = l2 / (long)mLastSpeedTe;
                      d5 = (double)l2;
                      d3 = d + d5;
                      objArray2 = new Object[]{Integer.valueOf(i3),Integer.valueOf(kSEncodePres.transcodeTimeCostMs),Double.valueOf(d),Double.valueOf(d5),Double.valueOf(d3)};
                      KSUploader.postLog(kSUploaderLo, String.format("slow network, fragNum %d, transcodeTimeCostMs %d, mainFragEncodeMs %f, fileUploadMs %f, estimateTimeCostMs %f", objArray2));
                   }else {
                      d2 = d2 * 8.00f;
                      d2 = d2 / (double)mLastSpeedTe;
                      d4 = d4 * 8.00f;
                      d4 = d4 / (double)mLastSpeedTe;
                      i5 = i3 - 1;
                      d5 = (double)i5 * d;
                      d5 = d5 + Math.max(d2, d3);
                      d5 = d5 + d4;
                      objArray2 = new Object[]{Integer.valueOf(i3),Integer.valueOf(kSEncodePres.transcodeTimeCostMs),Double.valueOf(d),Double.valueOf(d2),Double.valueOf(d3),Double.valueOf(d4),Double.valueOf(d5)};
                      KSUploader.postLog(kSUploaderLo, String.format("fast network, fragNum %d, transcodeTimeCostMs %d, mainFragEncodeMs %f, mainFragUploadMs %f, lastFragEncode %f, lastFragUploadMs %f, estimateTimeCostMs %f", objArray2));
                      d3 = d5;
                   }
                }else {
                   hashMap1 = obj;
                   iterator1 = iterator;
                   KSEncodePreset transcodeTim1 = kSEncodePres.transcodeTimeCostMs;
                   if (transcodeTim1 > null) {
                      Object[] objArray3 = new Object[]{Integer.valueOf(transcodeTim1)};
                      KSUploader.postLog(kSUploaderLo, String.format("skip transcode not supported transcodeTimeCostMs %d", objArray3));
                      obj = hashMap1;
                   label_01e8 :
                      iterator = iterator1;
                   }else {
                      l1 = fileSize * 8;
                      l1 = l1 / (long)KSSpeedTester.mLastSpeedTestResult;
                      d3 = (double)l1;
                      Object[] objArray4 = new Object[]{Double.valueOf(d3)};
                      KSUploader.postLog(kSUploaderLo, String.format("skip transcode, estimateTimeCostMs %f", objArray4));
                   }
                }
                hashMap = hashMap1;
                hashMap.put(Integer.valueOf(kSEncodePres.type), Double.valueOf(d3));
             }
             obj = hashMap;
             goto label_01e8 ;
          }
          i5 = KSSpeedTester.chooseEncodePreset(obj);
          KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "getEncodePreset presetType "+i5);
          return i5;
       }
    }
    public static int getNetSpeed(){
       _monitor_enter(KSSpeedTester.class);
       _monitor_exit(KSSpeedTester.class);
       return KSSpeedTester.mLastSpeedTestResult;
    }
    public static void parseConfig(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KSSpeedTester.class, "3")) {
          return;
       }
       try{
          JsonElement jsonElement = new c().a(p0);
          if (jsonElement.E()) {
             JsonObject jsonObject = jsonElement.r();
             JsonElement jsonElement1 = jsonObject.e0("encodePreferRatio");
             if (jsonElement1 != null) {
                KSSpeedTester.encodePreferRatio = jsonElement1.p();
             }
             jsonElement = jsonObject.e0("defaultEncodePreset");
             if (jsonElement != null) {
                KSSpeedTester.defaultEncodePreset = jsonElement.p();
             }
             KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "parseConfig: encodePreferRatio:"+KSSpeedTester.encodePreferRatio+", defaultEncodePreset: "+KSSpeedTester.defaultEncodePreset);
          }
       }catch(java.lang.Exception e3){
          KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Error, "parseConfig failed: "+e3.toString());
       }
       return;
    }
    public static void startSpeedTest(Context p0,b p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, KSSpeedTester.class, "1")) {
          return;
       }
       KSSpeedTester kSSpeedTeste = KSSpeedTester.class;
       _monitor_enter(kSSpeedTeste);
       if (KSSpeedTester.mLastSpeedTestResult > 0 && (System.currentTimeMillis() - KSSpeedTester.mLastSpeedTestTs) - 0x493e0 <= 0) {
          KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "speed test not started for taskId: "+p3+", last result valid: "+KSSpeedTester.mLastSpeedTestResult);
          _monitor_exit(kSSpeedTeste);
          return;
       }else {
          KSSpeedTester.mLastSpeedTestTs = System.currentTimeMillis();
          _monitor_exit(kSSpeedTeste);
          KSSpeedTester.parseConfig(p2);
          KSFileUploader kSFileUpload = new KSFileUploader(p0, p1);
          KSSpeedTester.uploader = kSFileUpload;
          kSFileUpload.setConfig(p2);
          KSSpeedTester.uploader.setSpeedTestListener(new KSSpeedTester$1());
          if (!KSSpeedTester.uploader.startSpeedTest(p3)) {
             KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Error, "KSSpeedTester startSpeedTest failed!");
             KSSpeedTester.uploader.release();
             KSSpeedTester.uploader = null;
          }
          return;
       }
    }
}

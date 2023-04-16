package com.kwai.performance.stability.artti.monitor.JvmtiHelper;
import java.lang.Object;
import java.lang.String;
import kg7.b;
import java.lang.Runnable;
import ekd.s1;
import java.lang.System;
import kg7.c;
import kg7.d;
import android.os.Build$VERSION;
import com.yxcorp.utility.AbiUtil;
import kg7.a;
import java.lang.ClassLoader;
import java.lang.Class;
import android.os.Debug;
import yf7.i;
import java.lang.StackTraceElement;
import java.lang.Exception;
import android.text.TextUtils;
import org.json.JSONObject;
import java.lang.Long;
import java.lang.Runtime;
import java.lang.reflect.Method;
import java.lang.IllegalAccessException;
import java.lang.reflect.InvocationTargetException;
import java.lang.NoSuchMethodException;
import java.lang.CharSequence;

public class JvmtiHelper	// class@001187
{
    public static final String AGENT_LIB = "ti-monitor";
    public static final long DELAY_MS = 0xc8;
    public static final String KEY = "TI_PERF_MONITOR";
    public static final long LOW_MEM_THRESHOLD = 0xc800000;
    public static final int MB = 1048576;
    public static final int MIN_ALLOC_SIZE = 3145728;
    public static final int MIN_CLASS_LEN = 10485760;
    public static final int MIN_INTERVAL = 10;
    public static final String TAG = "jvmti";
    public static boolean isJdwpEnable;
    public static int mAllocRealSetting;
    public static a mConfig;
    public static int mLoadSizeRealSetting;
    public static boolean mLoaded;
    public static long preAllocEventTime;
    public static String preAllocMsg;
    public static String preClassLoadMsg;

    public void JvmtiHelper(){
       super();
    }
    public static native boolean avoidDeoptForReleaseBuild();
    public static native boolean disableJdwp();
    public static void doAllocAsyncReport(String p0,long p1){
       s1.e(new b(p0, p1), 200);
    }
    public static void doClazzLoadAsyncReport(String p0){
       s1.e(new c(p0, System.currentTimeMillis()), 200);
    }
    public static void doGCAsyncReport(String p0){
       s1.e(new d(p0, System.currentTimeMillis()), 200);
    }
    public static native boolean enableJdwp();
    public static boolean ensureAgentLoad(){
       int mLoadSizeRea;
       int i;
       JvmtiHelper.loadLibrary("openjdkjvmti");
       boolean sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 26 && (sDK_INT <= 30 && AbiUtil.b())) {
          System.loadLibrary("ti-monitor");
          boolean b = false;
          if (!JvmtiHelper.mConfig.i() && !JvmtiHelper.avoidDeoptForReleaseBuild()) {
             return b;
          }else {
             JvmtiHelper.mLoadSizeRealSetting = JvmtiHelper.mConfig.b();
             JvmtiHelper.mAllocRealSetting = JvmtiHelper.mConfig.a();
             if (!JvmtiHelper.mConfig.g()) {
                mLoadSizeRea = JvmtiHelper.mLoadSizeRealSetting;
                i = 0xa00000;
                if (mLoadSizeRea < i && mLoadSizeRea > 0) {
                   JvmtiHelper.mLoadSizeRealSetting = i;
                }else if(JvmtiHelper.mLoadSizeRealSetting <= 0){
                   JvmtiHelper.mLoadSizeRealSetting = b;
                }
             }else {
                goto label_004d ;
             }
             if (!JvmtiHelper.mConfig.g()) {
                mLoadSizeRea = JvmtiHelper.mAllocRealSetting;
                i = 0x300000;
                if (mLoadSizeRea < i && mLoadSizeRea > 0) {
                   JvmtiHelper.mAllocRealSetting = i;
                }else if(JvmtiHelper.mAllocRealSetting <= 0){
                   JvmtiHelper.mAllocRealSetting = b;
                }
             }else {
                goto label_0066 ;
             }
             if (!JvmtiHelper.mConfig.g() && sDK_INT < 29) {
                JvmtiHelper.mLoadSizeRealSetting = b;
             }
             JvmtiHelper.setConfig(JvmtiHelper.mConfig.h(), JvmtiHelper.mConfig.d(), JvmtiHelper.mAllocRealSetting, JvmtiHelper.mLoadSizeRealSetting, JvmtiHelper.mConfig.f(), JvmtiHelper.mConfig.c(), JvmtiHelper.mConfig.e(), JvmtiHelper.mConfig.g());
             if (sDK_INT >= 28) {
                sDK_INT = JvmtiHelper.enableJdwp();
                JvmtiHelper.isJdwpEnable = sDK_INT;
                if (sDK_INT) {
                   Debug.attachJvmtiAgent("libti-monitor.so", null, JvmtiHelper.class.getClassLoader());
                }else {
                   i.a.c("TI_PERF_MONITOR", "JDWP_FAIL", b);
                   return b;
                }
             }else if(!JvmtiHelper.loadTiAgent()){
                i.a.c("TI_PERF_MONITOR", "LOAD_A_F", b);
                return b;
             }
             JvmtiHelper.mLoaded = true;
          }
       }
       return JvmtiHelper.mLoaded;
    }
    public static void fastUnwindStack(String p0){
       try{
          StackTraceElement[] stackTraceEl = JvmtiHelper.frameInfoToTrace(p0);
          int len = stackTraceEl.length;
          for (int i = 0; i < len; i = i + 1) {
             stackTraceEl[i].toString();
          }
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return;
    }
    public static native StackTraceElement[] frameInfoToTrace(String p0);
    public static int getAllocSizeRealSetting(){
       return JvmtiHelper.mAllocRealSetting;
    }
    public static int getLoadSizeRealSetting(){
       return JvmtiHelper.mLoadSizeRealSetting;
    }
    public static native long getObjectSize(Object p0);
    public static boolean isJDWPEnable(){
       return JvmtiHelper.isJdwpEnable;
    }
    public static boolean isLoaded(){
       return JvmtiHelper.mLoaded;
    }
    public static void lambda$doAllocAsyncReport$0(String p0,long p1){
       String str = "::";
       try{
          String[] stringArray = TextUtils.split(p0, ";");
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("obj_name", (TextUtils.split(stringArray[0], str)[1]).trim());
          jSONObject.put("obj_size", Long.valueOf((TextUtils.split(stringArray[1], str)[1]).trim()));
          jSONObject.put("stack", (TextUtils.split(stringArray[2], str)[1]).trim());
          jSONObject.put("eventMs", p1);
          jSONObject.put("monitor_name", "alloc");
          i.a.c("TI_PERF_MONITOR", jSONObject.toString(), 0);
       }catch(java.lang.Exception e6){
          e6.printStackTrace();
       }
       return;
    }
    public static void lambda$doClazzLoadAsyncReport$2(String p0,long p1){
       String str = ":";
       try{
          String[] stringArray = TextUtils.split(p0, ",");
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("oversize_class_name", (TextUtils.split(stringArray[0], str)[1]).trim());
          jSONObject.put("class_load_len", Long.valueOf((TextUtils.split(stringArray[1], str)[1]).trim()));
          jSONObject.put("eventMs", p1);
          jSONObject.put("monitor_name", "oversize_class_load");
          i.a.c("TI_PERF_MONITOR", jSONObject.toString(), 0);
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
       }
       return;
    }
    public static void lambda$doGCAsyncReport$1(String p0,long p1){
       String str = ":";
       try{
          if (Runtime.getRuntime().freeMemory() - 0xc800000 < 0) {
             return;
          }else {
             String[] stringArray = TextUtils.split(p0, ",");
             JSONObject jSONObject = new JSONObject();
             jSONObject.put("gc_start_ms", Long.valueOf((TextUtils.split(stringArray[0], str)[1]).trim()));
             jSONObject.put("gc_finish_ms", Long.valueOf((TextUtils.split(stringArray[1], str)[1]).trim()));
             jSONObject.put("eventMs", p1);
             jSONObject.put("monitor_name", "gc");
             i.a.c("TI_PERF_MONITOR", jSONObject.toString(), 0);
          }
       }catch(java.lang.Exception e6){
          e6.printStackTrace();
       }
       return;
    }
    public static boolean loadLibrary(String p0){
       Class[] uClassArray2;
       String str = String.class;
       int i = 1;
       try{
          Class[] uClassArray = new Class[i];
          uClassArray[0] = str;
          Class[] uClassArray1 = new Class[]{str,Class[].class};
          Object[] objArray = new Object[i];
          objArray[0] = "java.lang.System";
          Class uClass = Class.class.getDeclaredMethod("forName", uClassArray).invoke(null, objArray);
          Object[] objArray1 = new Object[]{"loadLibrary",uClassArray2};
          uClassArray2 = new Class[i];
          uClassArray2[0] = str;
          Object[] objArray2 = new Object[i];
          objArray2[0] = p0;
          Class.class.getDeclaredMethod("getDeclaredMethod", uClassArray1).invoke(uClass, objArray1).invoke(uClass, objArray2);
       }catch(java.lang.NoSuchMethodException e9){
          e9.printStackTrace();
       }catch(java.lang.reflect.InvocationTargetException e9){
          e9.printStackTrace();
       }catch(java.lang.IllegalAccessException e9){
          e9.printStackTrace();
       }
       return i;
    }
    public static native boolean loadTiAgent();
    public static void logEvent(String p0){
       try{
          if (TextUtils.isEmpty(p0)) {
             return;
          }else if(p0.startsWith("alloc_obj")){
             long l = System.currentTimeMillis();
             if ((l - JvmtiHelper.preAllocEventTime) - 10 < 0 || p0.equals(JvmtiHelper.preAllocMsg)) {
                JvmtiHelper.preAllocEventTime = l;
                JvmtiHelper.preAllocMsg = p0;
                return;
             }else {
                JvmtiHelper.preAllocEventTime = l;
                JvmtiHelper.preAllocMsg = p0;
                JvmtiHelper.doAllocAsyncReport(p0, l);
                return;
             }
          }else if(p0.startsWith("gc_start")){
             JvmtiHelper.doGCAsyncReport(p0);
             return;
          }else if(p0.startsWith("class_load")){
             if (p0.equals(JvmtiHelper.preClassLoadMsg)) {
                return;
             }else {
                JvmtiHelper.preClassLoadMsg = p0;
                JvmtiHelper.doClazzLoadAsyncReport(p0);
                return;
             }
          }else {
             i.a.c("TI_PERF_MONITOR", p0, false);
          }
       }catch(java.lang.Exception e7){
          e7.printStackTrace();
       }
       return;
    }
    public static void setArttiMonitorConfig(a p0){
       JvmtiHelper.mConfig = p0;
    }
    public static native void setConfig(int p0,int p1,int p2,int p3,boolean p4,boolean p5,String p6,boolean p7);
    public static boolean unlikely(boolean p0){
       return p0;
    }
    public static native boolean unloadAgent();
    public static void unloadTiAgent(){
       if (JvmtiHelper.mLoaded) {
          JvmtiHelper.unloadAgent();
          JvmtiHelper.mLoaded = false;
       }
       return;
    }
}

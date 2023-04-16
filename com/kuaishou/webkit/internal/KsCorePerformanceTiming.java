package com.kuaishou.webkit.internal.KsCorePerformanceTiming;
import java.util.ArrayList;
import java.lang.Object;
import org.json.JSONObject;
import java.lang.String;
import android.os.Looper;
import com.kuaishou.webkit.internal.KsCorePerformanceTiming$KeyPerformanceEntry;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.webkit.extension.KsCorePerformanceListener;
import com.kuaishou.webkit.internal.InitSettingsImpl;
import com.kuaishou.webkit.internal.EventReporter;
import java.lang.CharSequence;
import android.text.TextUtils;

public class KsCorePerformanceTiming	// class@001318
{
    public static String sCoreLoadTag;
    public static boolean sFirstWebViewCreated;
    public static JSONObject sJsonObject;
    public static final ArrayList sKeyPerformanceEntries;
    public static final List sListeners;
    public static final Object sLock;
    public static boolean sSharedStatcisCreated;

    static {
       KsCorePerformanceTiming.sListeners = new ArrayList();
       KsCorePerformanceTiming.sLock = new Object();
       KsCorePerformanceTiming.sJsonObject = new JSONObject();
       KsCorePerformanceTiming.sCoreLoadTag = "Unknown";
       KsCorePerformanceTiming.sFirstWebViewCreated = false;
       KsCorePerformanceTiming.sSharedStatcisCreated = false;
       KsCorePerformanceTiming.sKeyPerformanceEntries = new ArrayList();
    }
    public void KsCorePerformanceTiming(){
       super();
    }
    public static void NotifyAsyncInitResult(boolean p0){
       try{
          Object sLock = KsCorePerformanceTiming.sLock;
          _monitor_enter(sLock);
          KsCorePerformanceTiming.sJsonObject.put("async_init_result", p0);
          _monitor_exit(sLock);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static void NotifyFirstWebViewCreated(){
       KsCorePerformanceTiming.sFirstWebViewCreated = true;
       if (KsCorePerformanceTiming.sSharedStatcisCreated) {
          KsCorePerformanceTiming.reportPerformanceTiming();
       }
       return;
    }
    public static void NotifyGeneralPerformanceTiming(String p0,long p1){
       try{
          Object sLock = KsCorePerformanceTiming.sLock;
          _monitor_enter(sLock);
          KsCorePerformanceTiming.sJsonObject.put(p0, p1);
          _monitor_exit(sLock);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static void NotifyKeyPerformanceTiming(String p0,long p1){
       try{
          boolean b = (Looper.myLooper() == Looper.getMainLooper())? true: false;
          Object sLock = KsCorePerformanceTiming.sLock;
          _monitor_enter(sLock);
          KsCorePerformanceTiming.sKeyPerformanceEntries.add(new KsCorePerformanceTiming$KeyPerformanceEntry(b, p0, p1));
          Iterator iterator = KsCorePerformanceTiming.sListeners.iterator();
          while (iterator.hasNext()) {
             iterator.next().onPerformanceTiming(b, p0, KsCorePerformanceTiming.sCoreLoadTag, p1);
          }
          KsCorePerformanceTiming.sJsonObject.put(p0, p1);
          _monitor_exit(sLock);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static void NotifySharedStaticsCreated(){
       KsCorePerformanceTiming.sSharedStatcisCreated = true;
       if (KsCorePerformanceTiming.sFirstWebViewCreated) {
          KsCorePerformanceTiming.reportPerformanceTiming();
       }
       return;
    }
    public static void addListener(KsCorePerformanceListener p0){
       if (p0 == null) {
          return;
       }
       Object sLock = KsCorePerformanceTiming.sLock;
       _monitor_enter(sLock);
       Iterator iterator = KsCorePerformanceTiming.sKeyPerformanceEntries.iterator();
       while (iterator.hasNext()) {
          KsCorePerformanceTiming$KeyPerformanceEntry keyPerforman = iterator.next();
          p0.onPerformanceTiming(keyPerforman.mOnMainThread, keyPerforman.mName, KsCorePerformanceTiming.sCoreLoadTag, keyPerforman.mTimeStamp);
       }
       KsCorePerformanceTiming.sListeners.add(p0);
       _monitor_exit(sLock);
       return;
    }
    public static void removeListener(KsCorePerformanceListener p0){
       if (p0 == null) {
          return;
       }
       Object sLock = KsCorePerformanceTiming.sLock;
       _monitor_enter(sLock);
       KsCorePerformanceTiming.sListeners.remove(p0);
       _monitor_exit(sLock);
       return;
    }
    public static void reportPerformanceTiming(){
       try{
          if (InitSettingsImpl.getInstance().getCommonSamplingFlag()) {
             KsCorePerformanceTiming.sJsonObject.put("optimize_policy_bits", InitSettingsImpl.getInstance().getOptimizePolicyBits());
             KsCorePerformanceTiming.sJsonObject.put("core_load_tag", KsCorePerformanceTiming.sCoreLoadTag);
             EventReporter.onEvent("core_performance_timing", KsCorePerformanceTiming.sJsonObject);
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static void setCoreLoadTag(String p0){
       if (!TextUtils.isEmpty(p0)) {
          KsCorePerformanceTiming.sCoreLoadTag = p0;
       }
       return;
    }
}

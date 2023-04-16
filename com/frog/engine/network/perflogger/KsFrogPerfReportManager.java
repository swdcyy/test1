package com.frog.engine.network.perflogger.KsFrogPerfReportManager;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.ConcurrentHashMap;
import android.os.Handler;
import android.os.Looper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import okhttp3.EventListener$Factory;
import com.frog.engine.network.perflogger.KsFrogHttpEventListener;
import java.lang.Long;
import com.frog.engine.jsobject.FrogLoggerObject;
import java.util.Map;
import com.frog.engine.data.FrogInitParam;
import com.frog.engine.FrogCommonListener;
import java.io.IOException;
import com.frog.engine.network.perflogger.KsFrogPerfReportManager$a;
import java.lang.Runnable;

public class KsFrogPerfReportManager	// class@001551
{
    public final Handler mHandler;
    public boolean mHttpPerfEnable;
    public FrogCommonListener mListener;
    public final AtomicLong mObjId;
    public final Map mObjMap;
    public static KsFrogPerfReportManager sInstance;

    public void KsFrogPerfReportManager(){
       super();
       this.mObjId = new AtomicLong(0);
       this.mObjMap = new ConcurrentHashMap();
       this.mHandler = new Handler(Looper.getMainLooper());
       this.mListener = null;
       this.mHttpPerfEnable = false;
    }
    public static KsFrogPerfReportManager instance(){
       KsFrogPerfReportManager ksFrogPerfRe = KsFrogPerfReportManager.class;
       Object obj = PatchProxy.apply(null, null, ksFrogPerfRe, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (KsFrogPerfReportManager.sInstance == null) {
          _monitor_enter(ksFrogPerfRe);
          if (KsFrogPerfReportManager.sInstance == null) {
             KsFrogPerfReportManager.sInstance = new KsFrogPerfReportManager();
          }
          _monitor_exit(ksFrogPerfRe);
       }
       return KsFrogPerfReportManager.sInstance;
    }
    public EventListener$Factory eventListenerFactory(){
       Object obj = PatchProxy.apply(null, this, KsFrogPerfReportManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.isHttpPerfEnable()) {
          return KsFrogHttpEventListener.FACTORY;
       }
       return null;
    }
    public Long genHttpPerfLogObjectId(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsFrogPerfReportManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.isHttpPerfEnable()) {
          return Long.valueOf(0);
       }
       long l = this.mObjId.incrementAndGet();
       FrogLoggerObject uFrogLoggerO = new FrogLoggerObject();
       uFrogLoggerO.setEvent("KS_FROG_NETWORK_PERF");
       uFrogLoggerO.put("type", p0);
       this.mObjMap.put(Long.valueOf(l), uFrogLoggerO);
       return Long.valueOf(l);
    }
    public FrogLoggerObject getLogObject(long p0){
       KsFrogPerfReportManager ksFrogPerfRe = KsFrogPerfReportManager.class;
       if (PatchProxy.isSupport(ksFrogPerfRe)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, ksFrogPerfRe, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.mObjMap.get(Long.valueOf(p0));
    }
    public void init(FrogInitParam p0,FrogCommonListener p1){
       this.mHttpPerfEnable = p0.enableReportFrogNetwork;
       this.mListener = p1;
    }
    public boolean isHttpPerfEnable(){
       return this.mHttpPerfEnable;
    }
    public FrogLoggerObject removeLogObject(long p0){
       KsFrogPerfReportManager ksFrogPerfRe = KsFrogPerfReportManager.class;
       if (PatchProxy.isSupport(ksFrogPerfRe)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, ksFrogPerfRe, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.mObjMap.remove(Long.valueOf(p0));
    }
    public void reportHttpPerfEx(long p0,IOException p1){
       KsFrogPerfReportManager ksFrogPerfRe = KsFrogPerfReportManager.class;
       if (PatchProxy.isSupport(ksFrogPerfRe) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, ksFrogPerfRe, "5")) {
          return;
       }
       FrogLoggerObject uFrogLoggerO = this.mObjMap.get(Long.valueOf(p0));
       if (uFrogLoggerO == null) {
          return;
       }
       KsFrogHttpEventListener.appendEx(uFrogLoggerO, p1);
       this.reportLogObject(p0);
       return;
    }
    public void reportLogObject(long p0){
       KsFrogPerfReportManager ksFrogPerfRe = KsFrogPerfReportManager.class;
       if (PatchProxy.isSupport(ksFrogPerfRe) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, ksFrogPerfRe, "6")) {
          return;
       }
       ksFrogPerfRe = this.mListener;
       FrogLoggerObject uFrogLoggerO = this.mObjMap.remove(Long.valueOf(p0));
       if (ksFrogPerfRe != null && uFrogLoggerO != null) {
          this.mHandler.postDelayed(new KsFrogPerfReportManager$a(this, ksFrogPerfRe, uFrogLoggerO), 100);
       }
       return;
    }
}

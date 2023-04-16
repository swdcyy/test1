package com.kwai.sdk.eve.internal.featurecenter.monitor.EveBackgroundMonitor;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kwai.sdk.eve.internal.featurecenter.monitor.FeatureMonitor;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveBackgroundMonitor$Companion;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.os.SystemClock;
import com.kwai.sdk.eve.internal.featurecenter.IFeatureProvider;
import com.kwai.sdk.eve.internal.featurecenter.AppFeatureProvider;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveBackgroundMonitor$createFeatureProvider$3;
import msd.a;
import com.kwai.sdk.eve.internal.featurecenter.AppCachedFeatureProvider;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveBackgroundMonitor$createFeatureProvider$1;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveBackgroundMonitor$createFeatureProvider$2;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import android.os.Handler;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveBackgroundMonitor$init$1;
import java.lang.Runnable;
import ekd.k1;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$State;
import n2.a;
import com.kwai.sdk.eve.internal.common.utils.EveLog;

public final class EveBackgroundMonitor extends FeatureMonitor implements DefaultLifecycleObserver	// class@001515
{
    public long enterBackgroundRealtime;
    public long enterForegroundRealtime;
    public boolean isForeground;
    public static final EveBackgroundMonitor$Companion Companion;

    static {
       EveBackgroundMonitor.Companion = new EveBackgroundMonitor$Companion(null);
    }
    public void EveBackgroundMonitor(Context p0){
       a.p(p0, "context");
       super(p0);
       this.enterForegroundRealtime = -1;
       this.enterBackgroundRealtime = -1;
    }
    public final long backgroundDuration(){
       Object obj = PatchProxy.apply(null, this, EveBackgroundMonitor.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = (this.isForeground == null)? SystemClock.elapsedRealtime() - this.enterBackgroundRealtime: -1;
       return l;
    }
    public IFeatureProvider createFeatureProvider(String p0){
       AppFeatureProvider uAppFeatureP;
       String obj = PatchProxy.applyOneRefs(p0, this, EveBackgroundMonitor.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "feature");
       int i = p0.hashCode();
       if (i != -1207971568) {
          if (i != -5131400) {
             if (i == 0x50d31d85) {
                obj = "background_duration";
                if (p0.equals(obj)) {
                   uAppFeatureP = new AppFeatureProvider(obj, new EveBackgroundMonitor$createFeatureProvider$3(this));
                label_005f :
                   return uAppFeatureP;
                }
             }
          }else {
             obj = "is_foreground";
             if (p0.equals(obj)) {
                uAppFeatureP = new AppCachedFeatureProvider(obj, new EveBackgroundMonitor$createFeatureProvider$1(this));
                goto label_005f ;
             }
          }
       }else {
          obj = "foreground_duration";
          if (p0.equals(obj)) {
             uAppFeatureP = new AppFeatureProvider(obj, new EveBackgroundMonitor$createFeatureProvider$2(this));
             goto label_005f ;
          }
       }
       throw new RuntimeException("EveBackgroundMonitor not expect feature:"+p0);
    }
    public List features(){
       String[] obj = PatchProxy.apply(null, this, EveBackgroundMonitor.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"is_foreground","foreground_duration","background_duration"};
       return CollectionsKt__CollectionsKt.L(obj);
    }
    public final long foregroundDuration(){
       Object obj = PatchProxy.apply(null, this, EveBackgroundMonitor.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = (this.isForeground != null)? SystemClock.elapsedRealtime() - this.enterForegroundRealtime: -1;
       return l;
    }
    public void init(Handler p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveBackgroundMonitor.class, "1")) {
          return;
       }
       a.p(p0, "handler");
       k1.o(new EveBackgroundMonitor$init$1(this));
       LifecycleOwner lifecycleOwn = ProcessLifecycleOwner.get();
       a.o(lifecycleOwn, "ProcessLifecycleOwner.get\(\)");
       Lifecycle lifecycle = lifecycleOwn.getLifecycle();
       a.o(lifecycle, "ProcessLifecycleOwner.get\(\).lifecycle");
       boolean b = lifecycle.getCurrentState().isAtLeast(Lifecycle$State.STARTED);
       this.isForeground = b;
       this.enterForegroundRealtime = (b)? SystemClock.elapsedRealtime(): SystemClock.elapsedRealtime();
       return;
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       a.d(this, p0);
    }
    public void onStart(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveBackgroundMonitor.class, "4")) {
          return;
       }
       a.p(p0, "owner");
       EveLog.i$default("EveBackgroundMonitor onForeground", false, 2, null);
       this.isForeground = true;
       this.enterForegroundRealtime = SystemClock.elapsedRealtime();
       this.notifyFeatureChange("is_foreground");
       return;
    }
    public void onStop(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveBackgroundMonitor.class, "5")) {
          return;
       }
       a.p(p0, "owner");
       EveLog.i$default("EveBackgroundMonitor onBackground", false, 2, null);
       this.isForeground = false;
       this.enterBackgroundRealtime = SystemClock.elapsedRealtime();
       this.notifyFeatureChange("is_foreground");
       return;
    }
}

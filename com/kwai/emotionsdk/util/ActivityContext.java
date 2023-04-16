package com.kwai.emotionsdk.util.ActivityContext;
import android.app.Application$ActivityLifecycleCallbacks;
import androidx.lifecycle.DefaultLifecycleObserver;
import java.lang.Object;
import java.util.ArrayList;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import android.content.Context;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import jl5.p;
import com.yxcorp.utility.n;
import android.content.res.Resources;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import nk5.m;
import android.os.SystemClock;

public class ActivityContext implements Application$ActivityLifecycleCallbacks, DefaultLifecycleObserver	// class@000db7
{
    public boolean b;
    public List c;
    public WeakReference d;
    public long e;
    public Context f;
    public static ActivityContext g;

    static {
       ActivityContext.g = new ActivityContext();
    }
    public void ActivityContext(){
       super();
       this.b = true;
       this.c = new ArrayList();
    }
    public static ActivityContext d(){
       return ActivityContext.g;
    }
    public final void a(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ActivityContext.class, "10")) {
          return;
       }
       ActivityContext td = this.d;
       if (td == null || td.get() != p0) {
          this.d = new WeakReference(p0);
       }
       Iterator iterator = this.c.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (iterator.next().get() == p0) {
                break ;
             }
          }else {
             this.c.add(new WeakReference(p0));
             return;
          }
       }
       return;
    }
    public Context b(){
       return this.f;
    }
    public Activity c(){
       Object[] objArray = null;
       ActivityContext obj = PatchProxy.apply(objArray, this, ActivityContext.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = this.c.size() - 1;
       while (true) {
          if (i >= 0) {
             WeakReference weakReferenc = this.c.get(i);
             if (weakReferenc.get() != null) {
                return weakReferenc.get();
             }else {
                i = i - 1;
             }
          }else {
             obj = this.d;
             if (obj != null) {
                objArray = obj.get();
                break ;
             }
             break ;
          }
       }
       return objArray;
    }
    public boolean e(){
       int b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Activity obj = PatchProxy.apply(objArray, this, ActivityContext.class, "13");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = ActivityContext.d().c();
       boolean b = true;
       if (p.a(obj)) {
          Object obj1 = PatchProxy.applyOneRefs(obj, objArray, p.class, "2");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             b1 = n.t(obj);
             if (p.a(obj) && (float)(n.w(obj) - b1) - p.a < 0) {
                b1 = n.j(obj);
             }
             if (((float)b1 / (float)n.x(obj)) - 0x3f99999a >= 0) {
                b = 0;
             }
             b1 = b;
          }
          return b1;
       }else {
          Resources resources = this.b().getResources();
          if (resources == null || (resources.getConfiguration() == null || resources.getConfiguration().orientation != 2)) {
             b = false;
          }
          return b;
       }
    }
    public final void f(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ActivityContext.class, "11")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          WeakReference weakReferenc = iterator.next();
          if (weakReferenc != null) {
             Activity uActivity = weakReferenc.get();
             if (uActivity == p0 || uActivity == null) {
                iterator.remove();
             }
          }
       }
       return;
    }
    public void onActivityCreated(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ActivityContext.class, "2")) {
          return;
       }
       this.a(p0);
       return;
    }
    public void onActivityDestroyed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ActivityContext.class, "7")) {
          return;
       }
       this.f(p0);
       return;
    }
    public void onActivityPaused(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ActivityContext.class, "5")) {
          return;
       }
       this.f(p0);
       return;
    }
    public void onActivityResumed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ActivityContext.class, "4")) {
          return;
       }
       this.a(p0);
       return;
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
    }
    public void onActivityStarted(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ActivityContext.class, "3")) {
          return;
       }
       this.a(p0);
       return;
    }
    public void onActivityStopped(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ActivityContext.class, "6")) {
          return;
       }
       this.f(p0);
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
       if (PatchProxy.applyVoidOneRefs(p0, this, ActivityContext.class, "8")) {
          return;
       }
       m.d("ActivityContext", "App switches to foreground");
       this.b = false;
       return;
    }
    public void onStop(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ActivityContext.class, "9")) {
          return;
       }
       m.d("ActivityContext", "App switches to background");
       this.b = true;
       this.e = SystemClock.elapsedRealtime();
       return;
    }
}

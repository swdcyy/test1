package com.kwai.component.photo.detail.core.util.ActivityLifeCircleBundle;
import androidx.lifecycle.DefaultLifecycleObserver;
import java.lang.Object;
import com.kwai.component.photo.detail.core.util.ActivityLifeCircleBundle$mObservers$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.LinkedHashSet;
import com.kwai.robust.PatchProxyResult;
import qrd.l1;
import androidx.lifecycle.LifecycleOwner;
import java.util.Iterator;
import java.lang.Iterable;

public final class ActivityLifeCircleBundle implements DefaultLifecycleObserver	// class@000a39
{
    public final p b;

    public void ActivityLifeCircleBundle(){
       super();
       this.b = s.c(ActivityLifeCircleBundle$mObservers$2.INSTANCE);
    }
    public final void a(DefaultLifecycleObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ActivityLifeCircleBundle.class, "10")) {
          return;
       }
       a.p(p0, "observer");
       LinkedHashSet linkedHashSe = this.b();
       _monitor_enter(linkedHashSe);
       this.b().add(p0);
       _monitor_exit(linkedHashSe);
       return;
    }
    public final LinkedHashSet b(){
       Object obj = PatchProxy.apply(null, this, ActivityLifeCircleBundle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, ActivityLifeCircleBundle.class, "8")) {
          return;
       }
       LinkedHashSet linkedHashSe = this.b();
       _monitor_enter(linkedHashSe);
       this.b().clear();
       _monitor_exit(linkedHashSe);
       return;
    }
    public final void d(DefaultLifecycleObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ActivityLifeCircleBundle.class, "11")) {
          return;
       }
       a.p(p0, "observer");
       LinkedHashSet linkedHashSe = this.b();
       _monitor_enter(linkedHashSe);
       this.b().remove(p0);
       _monitor_exit(linkedHashSe);
       return;
    }
    public void onCreate(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ActivityLifeCircleBundle.class, "2")) {
          return;
       }
       a.p(p0, "owner");
       LinkedHashSet linkedHashSe = this.b();
       _monitor_enter(linkedHashSe);
       Iterator iterator = this.b().iterator();
       while (iterator.hasNext()) {
          iterator.next().onCreate(p0);
       }
       _monitor_exit(linkedHashSe);
       return;
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ActivityLifeCircleBundle.class, "7")) {
          return;
       }
       a.p(p0, "owner");
       LinkedHashSet linkedHashSe = this.b();
       _monitor_enter(linkedHashSe);
       Iterator iterator = this.b().iterator();
       while (iterator.hasNext()) {
          iterator.next().onDestroy(p0);
       }
       _monitor_exit(linkedHashSe);
       return;
    }
    public void onPause(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ActivityLifeCircleBundle.class, "5")) {
          return;
       }
       a.p(p0, "owner");
       LinkedHashSet linkedHashSe = this.b();
       _monitor_enter(linkedHashSe);
       Iterator iterator = this.b().iterator();
       while (iterator.hasNext()) {
          iterator.next().onPause(p0);
       }
       _monitor_exit(linkedHashSe);
       return;
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ActivityLifeCircleBundle.class, "4")) {
          return;
       }
       a.p(p0, "owner");
       LinkedHashSet linkedHashSe = this.b();
       _monitor_enter(linkedHashSe);
       Iterator iterator = this.b().iterator();
       while (iterator.hasNext()) {
          iterator.next().onResume(p0);
       }
       _monitor_exit(linkedHashSe);
       return;
    }
    public void onStart(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ActivityLifeCircleBundle.class, "3")) {
          return;
       }
       a.p(p0, "owner");
       LinkedHashSet linkedHashSe = this.b();
       _monitor_enter(linkedHashSe);
       Iterator iterator = this.b().iterator();
       while (iterator.hasNext()) {
          iterator.next().onStart(p0);
       }
       _monitor_exit(linkedHashSe);
       return;
    }
    public void onStop(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ActivityLifeCircleBundle.class, "6")) {
          return;
       }
       a.p(p0, "owner");
       LinkedHashSet linkedHashSe = this.b();
       _monitor_enter(linkedHashSe);
       Iterator iterator = this.b().iterator();
       while (iterator.hasNext()) {
          iterator.next().onStop(p0);
       }
       _monitor_exit(linkedHashSe);
       return;
    }
}

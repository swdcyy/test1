package com.kwai.framework.activitycontext.ActivityContext;
import android.app.Application$ActivityLifecycleCallbacks;
import androidx.lifecycle.DefaultLifecycleObserver;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uv8.f;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import uv8.j;
import com.kwai.framework.activitycontext.ActivityContext$b;
import uv8.g;
import uv8.h;
import uv8.r1;
import uv8.q1;
import com.yxcorp.gifshow.StableLaunchEventTracker;
import j89.j;
import j89.i;
import p6a.q;
import p6a.r;
import hha.b;
import hha.a;
import fka.e;
import fka.d;
import jna.f;
import jna.e;
import cra.u;
import com.yxcorp.gifshow.growth.util.d;
import dsb.d;
import dsb.c;
import xbc.c;
import com.yxcorp.gifshow.relation.shake.i;
import vzc.b;
import vzc.a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import java.lang.Throwable;
import android.util.Log;
import java.lang.Integer;
import java.util.ListIterator;
import com.kwai.framework.activitycontext.ActivityContext$a;
import android.os.Bundle;
import org.greenrobot.eventbus.a;
import m56.b;
import m56.c;
import m56.d;
import m56.e;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import android.os.SystemClock;
import m56.g;
import t45.c;
import java.util.Objects;
import m56.f;

public class ActivityContext implements Application$ActivityLifecycleCallbacks, DefaultLifecycleObserver	// class@000b11
{
    public boolean b;
    public List c;
    public final List d;
    public LinkedList e;
    public List f;
    public WeakReference g;
    public WeakReference h;
    public long i;
    public long j;
    public static ActivityContext k;
    public static final List l;

    static {
       ActivityContext.k = new ActivityContext();
       ActivityContext.l = new CopyOnWriteArrayList();
       if (PatchProxy.applyVoid(null, null, ActivityContext.class, "1")) {
       }else if(!PatchProxy.applyVoid(null, null, f.class, "1") && SystemUtil.L(a.b())){
          ActivityContext.i(new j());
       }
       if (!PatchProxy.applyVoid(null, null, g.class, "1") && !SystemUtil.L(a.b())) {
          ActivityContext.i(new h());
       }
       if (!PatchProxy.applyVoid(null, null, r1.class, "2")) {
          ActivityContext.i(new q1());
       }
       if (!PatchProxy.applyVoid(null, null, StableLaunchEventTracker.class, "1")) {
          ActivityContext.i(new StableLaunchEventTracker());
       }
       if (!PatchProxy.applyVoid(null, null, j.class, "3")) {
          ActivityContext.i(new i());
       }
       q oq = q.class;
       if (!PatchProxy.applyVoidWithListener(null, null, oq, "1")) {
          if (SystemUtil.L(a.b())) {
             ActivityContext.i(new r());
          }
          PatchProxy.onMethodExit(oq, "1");
       }
       if (!PatchProxy.applyVoid(null, null, b.class, "9")) {
          ActivityContext.i(new a());
       }
       if (!PatchProxy.applyVoid(null, null, e.class, "3")) {
          ActivityContext.i(new d());
       }
       if (!PatchProxy.applyVoid(null, null, f.class, "1")) {
          ActivityContext.i(new e());
       }
       if (!PatchProxy.applyVoid(null, null, u.class, "1")) {
          ActivityContext.i(new d());
       }
       if (!PatchProxy.applyVoid(null, null, d.class, "1") && SystemUtil.L(a.b())) {
          ActivityContext.i(new c());
       }
       if (!PatchProxy.applyVoid(null, null, c.class, "1")) {
          ActivityContext.i(new i());
       }
       if (!PatchProxy.applyVoid(null, null, b.class, "1")) {
          ActivityContext.i(new a());
       }
    }
    public void ActivityContext(){
       super();
       this.b = true;
       this.c = new ArrayList();
       this.d = new ArrayList();
       LinkedList linkedList = new LinkedList();
       this.e = linkedList;
       this.f = Collections.unmodifiableList(linkedList);
    }
    public static ActivityContext g(){
       return ActivityContext.k;
    }
    public static void i(ActivityContext$b p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, null, ActivityContext.class, "2")) {
          return;
       }
       ActivityContext.l.add(p0);
       PatchProxy.onMethodExit(ActivityContext.class, "2");
       return;
    }
    public static void k(ActivityContext$b p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, null, ActivityContext.class, "3")) {
          return;
       }
       ActivityContext.l.remove(p0);
       PatchProxy.onMethodExit(ActivityContext.class, "3");
       return;
    }
    public synchronized final void a(Activity p0){
       WeakReference weakReferenc;
       if (PatchProxy.applyVoidOneRefs(p0, this, ActivityContext.class, "15")) {
          return;
       }
       ActivityContext tg = this.g;
       if (tg == null || tg.get() != p0) {
          this.g = new WeakReference(p0);
       }
       Iterator iterator = this.c.iterator();
       while (true) {
          int i = 1;
          if (iterator.hasNext()) {
             weakReferenc = iterator.next();
             if (weakReferenc.get() == p0) {
                break ;
             }
          }else {
             Object[] objArray1 = new Object[i];
             objArray1[0] = p0.toString();
             String.format("add activity = %s to mActivityStack success", objArray1);
             this.c.add(new WeakReference(p0));
             return;
          }
       }
       Object[] objArray = new Object[]{weakReferenc.get(),p0.toString()};
       String.format("has same activity, not add,weakReference.get\(\) = %s, activity = %s ", objArray);
       return;
    }
    public List b(){
       Object obj = PatchProxy.apply(null, this, ActivityContext.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ArrayList(this.d);
    }
    public List c(){
       return this.c;
    }
    public List d(){
       return this.f;
    }
    public synchronized Activity e(){
       Object[] objArray = null;
       ActivityContext obj = PatchProxy.apply(objArray, this, ActivityContext.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 1;
       int i1 = this.c.size() - i;
       while (true) {
          if (i1 >= 0) {
             WeakReference weakReferenc = this.c.get(i1);
             if (weakReferenc.get() != null) {
                return weakReferenc.get();
             }else {
                i1 = i1 - 1;
             }
          }else {
             obj = this.g;
             if (obj != null) {
                objArray = obj.get();
             }
             Activity uActivity = this.f();
             if (objArray != uActivity) {
                Object[] objArray1 = new Object[]{objArray,uActivity,Log.getStackTraceString(new Throwable())};
                String.format("activity not equal, activity = %s, currentActivityOptimize = %s,stack = %s", objArray1);
                break ;
             }
             break ;
          }
       }
       return objArray;
    }
    public Activity f(){
       Object[] objArray = null;
       ActivityContext obj = PatchProxy.apply(objArray, this, ActivityContext.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       _monitor_enter(obj);
       int i = this.d.size() - 1;
       while (true) {
          if (i >= 0) {
             WeakReference weakReferenc = this.d.get(i);
             if (weakReferenc.get() != null) {
                _monitor_exit(obj);
                return weakReferenc.get();
             }else {
                i = i - 1;
             }
          }else {
             _monitor_exit(obj);
             obj = this.h;
             if (obj != null) {
                objArray = obj.get();
                break ;
             }
             break ;
          }
       }
       return objArray;
    }
    public boolean h(){
       return (this.b ^ 0x01);
    }
    public synchronized final void j(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ActivityContext.class, "17")) {
          return;
       }
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          WeakReference weakReferenc = iterator.next();
          if (weakReferenc != null) {
             Activity uActivity = weakReferenc.get();
             if (uActivity == p0 || uActivity == null) {
                iterator.remove();
                Object[] objArray = new Object[]{p0.toString()};
                String.format("mActivityStack remove activity = %s success", objArray);
             }
          }
       }
       return;
    }
    public final void l(Activity p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ActivityContext.class, "19")) {
          return;
       }
       ActivityContext te = this.e;
       ListIterator listIterator = te.listIterator(te.size());
       while (true) {
          if (listIterator.hasPrevious()) {
             ActivityContext$a uoa = listIterator.previous();
             Activity uActivity = uoa.a();
             if (uActivity == null) {
                listIterator.remove();
             }else if(uActivity == p0){
                if (p1 != null) {
                   uoa.b = p1.intValue();
                   break ;
                }else {
                   listIterator.remove();
                   break ;
                }
             }
          }else if(p1 != null){
             Object[] objArray = new Object[]{p0.toString()};
             String.format("mActivityStackWithState add activity = %s", objArray);
             this.e.add(new ActivityContext$a(p0, p1.intValue()));
          }
          return;
       }
       return;
    }
    public void onActivityCreated(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, ActivityContext.class, "7")) {
          return;
       }
       p0.toString();
       this.a(p0);
       int i = 1;
       if (!PatchProxy.applyVoidOneRefs(p0, this, ActivityContext.class, "16")) {
          ActivityContext th = this.h;
          if (th == null || th.get() != p0) {
             this.h = new WeakReference(p0);
          }
          th = this.d;
          _monitor_enter(th);
          Iterator iterator1 = this.d.iterator();
          while (true) {
             if (iterator1.hasNext()) {
                WeakReference weakReferenc = iterator1.next();
                if (weakReferenc.get() == p0) {
                   Object[] objArray = new Object[]{weakReferenc.get(),p0.toString()};
                   String.format("has same activity, not add,weakReference.get\(\) = %s, activity = %s ", objArray);
                   _monitor_exit(th);
                }
             }else {
                Object[] objArray1 = new Object[i];
                objArray1[0] = p0.toString();
                String.format("add activity = %s to mActivityOptimizeStack success", objArray1);
                this.d.add(new WeakReference(p0));
                _monitor_exit(th);
             }
          }
          PatchProxy.onMethodExit(ActivityContext.class, "7");
          return;
       }
       a.d().k(new b(p0, p1));
       this.l(p0, Integer.valueOf(i));
       Iterator iterator = ActivityContext.l.iterator();
       while (iterator.hasNext()) {
          iterator.next().f(p0, p1);
       }
    }
    public void onActivityDestroyed(Activity p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ActivityContext.class, "12")) {
          return;
       }
       int i = 1;
       Object[] objArray = new Object[i];
       objArray[0] = p0.toString();
       String.format("onActivityDestroyed, activity = %s", objArray);
       this.j(p0);
       if (!PatchProxy.applyVoidOneRefs(p0, this, ActivityContext.class, "18")) {
          ActivityContext td = this.d;
          _monitor_enter(td);
          Iterator iterator1 = this.d.iterator();
          while (iterator1.hasNext()) {
             WeakReference weakReferenc = iterator1.next();
             if (weakReferenc != null) {
                Activity uActivity = weakReferenc.get();
                if (uActivity == p0 || uActivity == null) {
                   iterator1.remove();
                   Object[] objArray1 = new Object[i];
                   objArray1[0] = p0.toString();
                   String.format("mActivityOptimizeStack remove activity = %s success", objArray1);
                }
             }
          }
          _monitor_exit(td);
       }
       a.d().k(new c(p0));
       this.l(p0, null);
       Iterator iterator = ActivityContext.l.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       PatchProxy.onMethodExit(ActivityContext.class, "12");
       return;
    }
    public void onActivityPaused(Activity p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ActivityContext.class, "10")) {
          return;
       }
       Object[] objArray = new Object[]{p0.toString()};
       String.format("onActivityPaused, activity = %s", objArray);
       this.j(p0);
       a.d().k(new d(p0));
       this.l(p0, Integer.valueOf(2));
       Iterator iterator = ActivityContext.l.iterator();
       while (iterator.hasNext()) {
          iterator.next().e(p0);
       }
       PatchProxy.onMethodExit(ActivityContext.class, "10");
       return;
    }
    public void onActivityResumed(Activity p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ActivityContext.class, "9")) {
          return;
       }
       p0.toString();
       this.a(p0);
       a.d().k(new e(p0));
       this.l(p0, Integer.valueOf(3));
       Iterator iterator = ActivityContext.l.iterator();
       while (iterator.hasNext()) {
          iterator.next().d(p0);
       }
       PatchProxy.onMethodExit(ActivityContext.class, "9");
       return;
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
    }
    public void onActivityStarted(Activity p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ActivityContext.class, "8")) {
          return;
       }
       p0.toString();
       this.l(p0, Integer.valueOf(2));
       PatchProxy.onMethodExit(ActivityContext.class, "8");
       return;
    }
    public void onActivityStopped(Activity p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ActivityContext.class, "11")) {
          return;
       }
       Object[] objArray = new Object[]{p0.toString()};
       String.format("onActivityStopped, activity = %s", objArray);
       this.j(p0);
       this.l(p0, Integer.valueOf(1));
       PatchProxy.onMethodExit(ActivityContext.class, "11");
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
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ActivityContext.class, "13")) {
          return;
       }
       this.b = false;
       this.j = SystemClock.elapsedRealtime();
       a.d().k(new g((SystemClock.elapsedRealtime() - this.i)));
       Iterator iterator = ActivityContext.l.iterator();
       while (iterator.hasNext()) {
          iterator.next().onForeground();
       }
       PatchProxy.onMethodExit(ActivityContext.class, "13");
       return;
    }
    public void onStop(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ActivityContext.class, "14")) {
          return;
       }
       this.b = true;
       this.i = SystemClock.elapsedRealtime();
       Objects.requireNonNull(c.b());
       a.d().k(new f());
       Iterator iterator = ActivityContext.l.iterator();
       while (iterator.hasNext()) {
          iterator.next().onBackground();
       }
       PatchProxy.onMethodExit(ActivityContext.class, "14");
       return;
    }
}

package com.kwai.page.component.a;
import ud7.h;
import ae7.b;
import androidx.lifecycle.LifecycleOwner;
import android.view.View;
import ee7.g;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import com.kwai.page.component.ComponentStateGraph$ComponentState;
import ae7.a;
import ud7.d;
import com.kwai.page.component.task.PageTaskRegistry;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import crd.b;
import java.lang.String;
import crd.a;
import ee7.d;
import androidx.lifecycle.Observer;
import java.util.List;
import wd7.a;
import ee7.c;
import java.util.Objects;
import android.os.Looper;
import java.lang.Thread;
import java.lang.Runnable;
import androidx.lifecycle.LiveData;
import ud7.a;
import java.lang.Integer;
import java.util.Map;
import com.kwai.page.component.ComponentException;
import java.lang.StringBuilder;
import java.lang.Class;
import android.content.Context;
import ge7.c;
import android.content.res.Resources;
import ie7.a;
import yd7.b;
import java.lang.ref.WeakReference;
import ud7.b;
import com.kwai.page.component.b;
import xd7.a;
import xd7.c;
import android.view.ViewStub;
import ge7.a;
import ge7.b;
import com.kwai.page.component.ui.UIFrom;
import com.kwai.page.component.ui.UIException;
import ud7.e;
import com.kwai.page.component.ComponentStateGraph$a;
import com.kwai.page.component.ComponentStateGraph;
import java.lang.IllegalStateException;

public abstract class a implements h, b	// class@00103d
{
    public boolean a;
    public final View b;
    public g c;
    public boolean d;
    public final List e;
    public final Map f;
    public final LifecycleOwner g;
    public final PageTaskRegistry h;
    public ComponentStateGraph$ComponentState i;
    public final a j;
    public final LifecycleObserver k;

    public void a(LifecycleOwner p0,View p1,g p2){
       super();
       this.a = false;
       this.d = false;
       this.e = new ArrayList();
       this.f = new HashMap();
       this.i = ComponentStateGraph$ComponentState.INIT;
       this.j = new a();
       this.k = new d(this);
       this.c = p2;
       this.b = p1;
       this.g = p0;
       if (p2 != null) {
          p2.e();
       }
       PageTaskRegistry pageTaskRegi = new PageTaskRegistry(p0);
       this.h = pageTaskRegi;
       p0.getLifecycle().addObserver(pageTaskRegi);
       return;
    }
    public final void a(b p0){
       this.k("addToAutoDisposes");
       a tj = this.j;
       if (tj.a == null) {
          tj.a = new a();
       }
       tj.a.c(p0);
       return;
    }
    public final void b(d p0,Observer p1){
       this.k("addStateObserveSchedule");
       if (p0.h == null) {
          p0.h = new ArrayList();
       }
       if (!p0.h.contains(p1)) {
          p0.h.add(p1);
          if (p0.i != null) {
             a uoa = a.a();
             c uoc = new c(p0, p1);
             Objects.requireNonNull(uoa);
             int i = (Looper.getMainLooper().getThread() == Thread.currentThread())? 1: 0;
             if (i) {
                uoc.run();
             }else {
                uoa.b(uoc);
             }
          }
       }
       this.j.e(p0, p1);
       return;
    }
    public final void d(d p0,Observer p1){
       this.k("addStateObserver");
       p0.observeForever(p1);
       this.j.e(p0, p1);
    }
    public final void e(d p0,Observer p1){
       this.k("addStateObserver");
       p0.observe(this.g, p1);
       this.j.e(p0, p1);
    }
    public final void f(){
       this.l(ComponentStateGraph$ComponentState.BIND);
    }
    public final void g(a p0,boolean p1){
       int i = p0.b();
       int i1 = p0.b();
       if (this.f.get(Integer.valueOf(i1)) != null) {
          StringBuilder str = this.getClass().getName()+": 同一时间内只能有一个Component绑定某个View, 请先destroy原来的Component. viewId = ";
          a c = p0.c;
          Resources resources = (c != null)? c.a().getResources(): p0.j.getContext().getResources();
          throw new ComponentException(str+a.a(i1, resources)+";\nold component = "+this.f.get(Integer.valueOf(i1))+", new component = "+p0.h);
       }else if(this.a != null && p1){
          a d = p0.d;
          WeakReference weakReferenc = (d != null && d != b.c)? 1: null;
          if (weakReferenc) {
             a.a().b(new b(new WeakReference(p0), p0));
          label_0095 :
             this.f.put(Integer.valueOf(i), p0);
             return;
          }
       }
    label_0092 :
       p0.a();
       goto label_0095 ;
    }
    public final void h(){
       this.l(ComponentStateGraph$ComponentState.CREATE);
    }
    public final void i(a p0){
       b b1;
       a j = p0.j;
       b uob = this.c(p0.e, this.g);
       if (uob == null) {
          throw new ComponentException("请在"+this.getClass().getName()+": componentFactory方法中提供"+p0.e.getName()+"的实例");
       }
       a g = p0.g;
       if (g != null) {
          g.a(uob);
       }
       g = p0.f;
       if (g != null) {
          uob.c(j, g);
       }else {
          g = p0.c;
          String str = "\(true\) 的方式创建UIWidget";
          if (g != null) {
             b b = uob.b;
             if (b.f.c()) {
                b.e = UIFrom.OUTSIDE_VIEW;
                b.c = g;
                b.d = g.a();
                b.a = b.c.b();
                uob.i(ComponentStateGraph$ComponentState.CREATE);
             }else {
                throw new UIException(b.g+": 不支持外部传View模式，如需支持，请调用 new "+b.f.getClass().getSimpleName()+str);
             }
          }else {
             v2 = j instanceof ViewStub;
             if (g) {
                b1 = uob.b;
                Objects.requireNonNull(b1);
                b1.e = UIFrom.STUB_VIEW;
                b1.b = j;
                b1.d = j.getContext();
                uob.i(ComponentStateGraph$ComponentState.CREATE);
             }else if(!g){
                b1 = uob.b;
                if (b1.f.c()) {
                   b1.e = UIFrom.OUTSIDE_VIEW;
                   b1.a = j;
                   b1.d = j.getContext();
                   uob.i(ComponentStateGraph$ComponentState.CREATE);
                }else {
                   throw new UIException(b1.g+": 不支持外部传View模式，如需支持，请调用 new "+b1.f.getClass().getSimpleName()+str);
                }
             }else {
                throw new ComponentException(uob.getClass().getName()+": 传ViewStub请使用create\(ViewStub, boolean\)");
             }
          }
       }
       p0.h = uob;
       return;
    }
    public final void j(){
       this.l(ComponentStateGraph$ComponentState.DESTROY);
    }
    public final void k(String p0){
       if (this.d != null) {
          return;
       }
       throw new ComponentException(this.getClass().getName()+": 非Bind阶段不能调用 "+p0+" 方法");
    }
    public final void l(ComponentStateGraph$ComponentState p0){
       if (ComponentStateGraph.a(this.i, p0, new e(this))) {
          return;
       }
       throw new IllegalStateException("不能从 "+this.i+" 跳到 "+p0+", class:"+this.getClass().getName());
    }
    public void m(){
    }
    public abstract void n();
}

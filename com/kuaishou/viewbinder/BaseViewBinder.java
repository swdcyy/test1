package com.kuaishou.viewbinder.BaseViewBinder;
import com.kuaishou.viewbinder.IViewBinder;
import androidx.lifecycle.DefaultLifecycleObserver;
import c35.o;
import c35.c;
import java.lang.Object;
import java.util.HashMap;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import java.util.Iterator;
import com.kuaishou.viewbinder.BaseViewBinder$a;
import c35.f;
import java.lang.StringBuilder;
import q87.c;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.view.LayoutInflater;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import c35.n;
import java.util.Set;
import java.util.Map$Entry;
import com.kuaishou.viewbinder.IBaseViewHost;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;

public abstract class BaseViewBinder implements IViewBinder, DefaultLifecycleObserver, o	// class@001197
{
    public HashMap b;
    public View c;
    public View d;

    public void BaseViewBinder(c p0){
       super();
       this.b = new HashMap();
       this.d = null;
       this.v(p0);
    }
    public final void bindViews(View p0){
       BaseViewBinder uBaseViewBin = BaseViewBinder.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uBaseViewBin, "10")) {
          return;
       }
       this.s(p0);
       this.x();
       if (!PatchProxy.applyVoid(null, this, uBaseViewBin, "11")) {
          Iterator iterator1 = this.b.values().iterator();
          while (iterator1.hasNext()) {
             BaseViewBinder$a uoa = iterator1.next();
             Object[] objArray = new Object[0];
             f.C().s("ViewBinder", "replace view for key "+uoa.a, objArray);
             BaseViewBinder$a b = uoa.b;
             uoa = uoa.c;
             if (!PatchProxy.applyVoidTwoRefs(b, uoa, this, uBaseViewBin, "12") && (b == null || uoa == null)) {
                continue ;
             }else {
                ViewGroup parent = b.getParent();
                ViewGroup$LayoutParams layoutParams = b.getLayoutParams();
                int i = parent.indexOfChild(b);
                uoa.setId(b.getId());
                parent.removeView(b);
                if (layoutParams == null) {
                   parent.addView(uoa, i);
                }else {
                   parent.addView(uoa, i, layoutParams);
                }
             }
          }
       }
       Iterator iterator = this.b.values().iterator();
       while (iterator.hasNext()) {
          BaseViewBinder$a d = iterator.next().d;
          if (d != null) {
             d.bindViews(p0);
          }
       }
       return;
    }
    public final View getBindedView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, BaseViewBinder.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.c != null && this.p()) {
          this.d = this.c;
          this.c = null;
       }else {
          this.d = this.u(p0, p1, p2);
       }
       this.t(this.d, p0, p2);
       return this.d;
    }
    public void onCreate(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseViewBinder.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       f.C().s("ViewBinder", "onCreate >> "+this, objArray);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, BaseViewBinder.class, "16")) {
          return;
       }
       Iterator iterator = this.b.values().iterator();
       while (iterator.hasNext()) {
          BaseViewBinder$a d = iterator.next().d;
          if (d != null) {
             d.onDestroy();
          }
       }
       return;
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseViewBinder.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       f.C().s("ViewBinder", "onDestroy", objArray);
       return;
    }
    public boolean onInterceptUserEvent(View p0,ViewModel p1,boolean p2){
       return false;
    }
    public void onPause(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseViewBinder.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       f.C().s("ViewBinder", "onPause", objArray);
       return;
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseViewBinder.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       f.C().s("ViewBinder", "onResume", objArray);
       return;
    }
    public void onStart(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseViewBinder.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       f.C().s("ViewBinder", "onStart", objArray);
       return;
    }
    public void onStop(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseViewBinder.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       f.C().s("ViewBinder", "onStop", objArray);
       return;
    }
    public int p(){
       return n.a(this);
    }
    public void s(View p0){
    }
    public void t(View p0,LayoutInflater p1,Bundle p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, BaseViewBinder.class, "9")) {
          return;
       }
       this.d = p0;
       if (p0 instanceof ViewGroup) {
          Iterator iterator = this.b.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             int i = 0;
             BaseViewBinder$a d = uEntry.getValue().d;
             if (d instanceof BaseViewBinder) {
                BaseViewBinder$a uoa = d;
                if (uoa.w()) {
                   i = p0.findViewById(uoa.w());
                }
             }
             if (i != null) {
                d.d = i;
             }else {
                i = uEntry.getValue().d.getBindedView(p1, p0, p2);
             }
             uEntry.getValue().c = i;
          }
       }
       return;
    }
    public abstract View u(LayoutInflater p0,ViewGroup p1,Bundle p2);
    public void v(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseViewBinder.class, "1")) {
          return;
       }
       if (p0 instanceof IBaseViewHost) {
          LifecycleOwner lifecycleOwn = p0.lifecycleOwner();
          if (lifecycleOwn != null && lifecycleOwn.getLifecycle() != null) {
             lifecycleOwn.getLifecycle().addObserver(this);
          }
       }
       return;
    }
    public int w(){
       return 0;
    }
    public void x(){
    }
}

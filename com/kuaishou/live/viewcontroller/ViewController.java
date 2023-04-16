package com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import java.lang.Object;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.LifecycleRegistry;
import com.kuaishou.live.viewcontroller.ViewController$1;
import androidx.lifecycle.LifecycleObserver;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import kotlin.jvm.internal.a;
import android.content.Context;
import eq3.d;
import java.lang.IllegalStateException;
import com.kuaishou.live.viewcontroller.ViewControllerManagerImpl;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;
import java.lang.StringBuilder;
import msd.l;
import androidx.lifecycle.Lifecycle$State;
import java.lang.Enum;
import eq3.b;
import androidx.lifecycle.Lifecycle;

public abstract class ViewController implements LifecycleOwner, ViewModelStoreOwner	// class@000fe2
{
    public ViewGroup b;
    public View c;
    public Context d;
    public Activity e;
    public d f;
    public ViewControllerManagerImpl g;
    public final ViewModelStore h;
    public final LifecycleRegistry i;

    public void ViewController(){
       super();
       this.h = new ViewModelStore();
       LifecycleRegistry lifecycleReg = new LifecycleRegistry(this);
       this.i = lifecycleReg;
       lifecycleReg.addObserver(new ViewController$1(this));
    }
    public final View A2(int p0){
       ViewController viewControll = ViewController.class;
       if (PatchProxy.isSupport(viewControll)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, viewControll, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       viewControll = this.c;
       View view = (viewControll != null)? viewControll.findViewById(p0): null;
       return view;
    }
    public final Activity B2(){
       ViewController obj = PatchProxy.apply(null, this, ViewController.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e;
       if (obj == null) {
          a.S("activity");
       }
       return obj;
    }
    public final View C2(){
       return this.c;
    }
    public final Context D2(){
       ViewController obj = PatchProxy.apply(null, this, ViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj == null) {
          a.S("context");
       }
       return obj;
    }
    public final d E2(){
       ViewController obj = PatchProxy.apply(null, this, ViewController.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.f == null) {
          throw new IllegalStateException("must call viewControllerManager inside/after onCreate");
       }
       obj = this.g;
       if (obj == null) {
          a.S("childControllerManager");
       }
       return obj;
    }
    public void F2(){
    }
    public void J2(){
    }
    public void K2(){
    }
    public void L2(){
    }
    public void M2(){
    }
    public void N2(){
    }
    public final void O2(ViewController p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewController.class, "16")) {
          return;
       }
       a.p(p0, "viewController");
       ViewController tg = this.g;
       if (tg == null) {
          a.S("childControllerManager");
       }
       tg.o1(p0);
       return;
    }
    public final View P2(){
       ViewController obj = PatchProxy.apply(null, this, ViewController.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       a.m(obj);
       return obj;
    }
    public void Q2(int p0){
       ViewController viewControll = ViewController.class;
       if (PatchProxy.isSupport(viewControll) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, viewControll, "8")) {
          return;
       }
       if (this.b == null) {
          throw new IllegalStateException("ViewController{"+this.getClass().getSimpleName()+"} does not attach to a container, can not call setContentView");
       }
       viewControll = this.d;
       if (viewControll == null) {
          a.S("context");
       }
       View view = a.c(LayoutInflater.from(viewControll), p0, this.b, false);
       a.o(view, "LayoutInflater.from\(cont¡­r,\n                false\)");
       this.R2(view);
       return;
    }
    public void R2(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewController.class, "10")) {
          return;
       }
       a.p(p0, "view");
       ViewController tb = this.b;
       if (tb == null) {
          throw new IllegalStateException("ViewController{"+this.getClass().getSimpleName()+"} does not attach to a container, can not call setContentView");
       }
       if (tb != null) {
          this.c = p0;
          tb.addView(p0);
       }
       return;
    }
    public void S2(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewController.class, "9")) {
          return;
       }
       a.p(p0, "viewProvider");
       ViewController tb = this.b;
       String str = "ViewController{";
       if (tb == null) {
          throw new IllegalStateException(str+this.getClass().getSimpleName()+"} does not attach to a container, can not call setContentView");
       }
       a.m(tb);
       View view = p0.invoke(tb);
       if (a.g(view, this.b)) {
          throw new IllegalStateException(str+this.getClass().getSimpleName()+"} provided view can not attachToParent");
       }
       this.R2(view);
       return;
    }
    public final void T2(View p0){
       this.c = p0;
    }
    public final void U2(Lifecycle$State p0){
       Lifecycle$State currentState;
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewController.class, "7")) {
          return;
       }
       a.p(p0, "state");
       while (true) {
          currentState = this.i.getCurrentState();
          a.o(currentState, "lifecycleRegistry.currentState");
          if (currentState == p0) {
             return;
          }
          StringBuilder str = 1;
          int[] ointArray = (currentState.compareTo(p0) < 0)? 1: null;
          if (ointArray) {
             i = b.b[currentState.ordinal()];
             if (i != str) {
                if (i != 2) {
                   if (i == 3) {
                      currentState = Lifecycle$State.RESUMED;
                   }else {
                      throw new IllegalStateException("Invalid lifecycle "+currentState+" -> "+p0);
                   }
                }else {
                   currentState = Lifecycle$State.STARTED;
                }
             }else {
                currentState = Lifecycle$State.CREATED;
             }
          }else {
             i = b.c[currentState.ordinal()];
             if (i != str) {
                if (i != 2) {
                   if (i == 3) {
                      currentState = Lifecycle$State.STARTED;
                   }else {
                      break ;
                   }
                }else {
                   currentState = Lifecycle$State.CREATED;
                }
             }else {
                currentState = Lifecycle$State.DESTROYED;
             }
          }
          this.i.setCurrentState(currentState);
       }
       throw new IllegalStateException("Invalid lifecycle "+currentState+" -> "+p0);
    }
    public Lifecycle getLifecycle(){
       return this.i;
    }
    public ViewModelStore getViewModelStore(){
       return this.h;
    }
    public final void x2(int p0,ViewController p1){
       ViewController viewControll = ViewController.class;
       if (PatchProxy.isSupport(viewControll) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, viewControll, "13")) {
          return;
       }
       a.p(p1, "viewController");
       viewControll = this.g;
       if (viewControll == null) {
          a.S("childControllerManager");
       }
       viewControll.G8(p0, p1);
       return;
    }
    public final void y2(ViewGroup p0,ViewController p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ViewController.class, "14")) {
          return;
       }
       a.p(p0, "container");
       a.p(p1, "viewController");
       ViewController tg = this.g;
       if (tg == null) {
          a.S("childControllerManager");
       }
       tg.E2(p0, p1);
       return;
    }
    public final void z2(ViewController p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewController.class, "15")) {
          return;
       }
       a.p(p0, "viewController");
       this.x2(0, p0);
       return;
    }
}

package com.kuaishou.live.viewcontroller.ViewControllerManagerImpl;
import eq3.d;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import android.content.Context;
import com.kuaishou.live.viewcontroller.ViewHost;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.IdentityHashMap;
import android.view.ViewGroup;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.Integer;
import java.lang.IllegalArgumentException;
import android.content.res.Resources;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$State;
import com.kuaishou.live.viewcontroller.ViewControllerManagerImpl$addViewControllerInner$ob$1;
import java.util.Objects;
import com.kuaishou.live.viewcontroller.ViewController$attach$2;
import com.kuaishou.live.viewcontroller.ViewHost$Companion;
import com.kwai.robust.PatchProxyResult;
import eq3.a;
import msd.a;
import java.util.Map;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleEventObserver;
import eq3.d$a;

public final class ViewControllerManagerImpl implements d	// class@000fe4
{
    public final IdentityHashMap b;
    public final LifecycleOwner c;
    public final Activity d;
    public final Context e;
    public final ViewHost f;

    public void ViewControllerManagerImpl(LifecycleOwner p0,Activity p1,Context p2,ViewHost p3){
       a.p(p0, "hostLifecycleOwner");
       a.p(p1, "activity");
       a.p(p2, "context");
       a.p(p3, "viewHost");
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.b = new IdentityHashMap();
    }
    public void ViewControllerManagerImpl(LifecycleOwner p0,Activity p1,ViewHost p2){
       a.p(p0, "hostLifecycleOwner");
       a.p(p1, "activity");
       a.p(p2, "viewHost");
       super(p0, p1, p1, p2);
    }
    public void E2(ViewGroup p0,ViewController p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ViewControllerManagerImpl.class, "2")) {
          return;
       }
       a.p(p0, "container");
       a.p(p1, "viewController");
       if (!this.f.a(p0)) {
          throw new IllegalStateException("containerView "+p0+" is not inside ViewController "+this);
       }
       this.a(p0, p1);
       return;
    }
    public void G8(int p0,ViewController p1){
       ViewGroup viewGroup;
       ViewControllerManagerImpl viewControll = ViewControllerManagerImpl.class;
       if (PatchProxy.isSupport(viewControll) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, viewControll, "1")) {
          return;
       }
       a.p(p1, "viewController");
       if (!p0) {
          viewGroup = null;
       }else {
          ViewGroup viewGroup1 = this.f.b(p0);
          if (viewGroup1 != null) {
             viewGroup = viewGroup1;
          }else {
             throw new IllegalArgumentException("container id "+this.e.getResources().getResourceEntryName(p0)+" not found");
          }
       }
       this.a(viewGroup, p1);
       return;
    }
    public final void a(ViewGroup p0,ViewController p1){
       ViewHost$Companion a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ViewControllerManagerImpl.class, "3")) {
          return;
       }
       Lifecycle lifecycle = this.c.getLifecycle();
       String str = "hostLifecycleOwner.lifecycle";
       a.o(lifecycle, str);
       Lifecycle$State iNITIALIZED = Lifecycle$State.INITIALIZED;
       int i = 0;
       int i1 = 1;
       ViewControllerManagerImpl viewControll = (lifecycle.getCurrentState() != iNITIALIZED)? 1: null;
       if (viewControll) {
          lifecycle = this.c.getLifecycle();
          a.o(lifecycle, str);
          if (lifecycle.getCurrentState() != Lifecycle$State.DESTROYED) {
             i = 1;
          }
          if (i) {
             if (this.b.containsKey(p1) ^ i1) {
                ViewControllerManagerImpl$addViewControllerInner$ob$1 uoaddViewCon = new ViewControllerManagerImpl$addViewControllerInner$ob$1(p1);
                ViewControllerManagerImpl te = this.e;
                ViewControllerManagerImpl td = this.d;
                Objects.requireNonNull(p1);
                if (!PatchProxy.applyVoidFourRefs(this, te, td, p0, p1, ViewController.class, "6")) {
                   a.p(this, "controllerManager");
                   a.p(te, "context");
                   a.p(td, "activity");
                   if (p1.f == null) {
                      p1.f = this;
                      p1.d = te;
                      p1.e = td;
                      p1.b = p0;
                      a = ViewHost.a;
                      ViewController$attach$2 uoattach$2 = new ViewController$attach$2(p1);
                      Objects.requireNonNull(a);
                      a uoa = PatchProxy.applyOneRefs(uoattach$2, a, ViewHost$Companion.class, "1");
                      if (uoa != PatchProxyResult.class) {
                      }else {
                         a.p(uoattach$2, "viewProvider");
                         uoa = new a(uoattach$2);
                      }
                      p1.g = new ViewControllerManagerImpl(p1, td, uoa);
                   }else {
                      throw new IllegalStateException("ViewController{"+p1.getClass().getSimpleName()+"} already attached, can not attach again");
                   }
                }
                this.b.put(p1, uoaddViewCon);
                this.c.getLifecycle().addObserver(uoaddViewCon);
                if (p1.getLifecycle().getCurrentState() == iNITIALIZED) {
                   p1.U2(Lifecycle$State.CREATED);
                }
                return;
             }else {
                throw new IllegalStateException("viewController already added ["+p1+']'.toString());
             }
          }else {
             throw new IllegalStateException("addViewController can not be called after onDestroy".toString());
          }
       }else {
          throw new IllegalStateException("addViewController must be called after onCreate".toString());
       }
    }
    public void o1(ViewController p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewControllerManagerImpl.class, "4")) {
          return;
       }
       a.p(p0, "viewController");
       Lifecycle$State dESTROYED = Lifecycle$State.DESTROYED;
       if (p0.getLifecycle().getCurrentState() == dESTROYED) {
          return;
       }
       int i = 1;
       ViewControllerManagerImpl viewControll = (p0.getLifecycle().getCurrentState() != Lifecycle$State.INITIALIZED)? 1: null;
       if (viewControll) {
          LifecycleEventObserver lifecycleEve = this.b.remove(p0);
          if (lifecycleEve == null) {
             i = 0;
          }
          if (i) {
             this.c.getLifecycle().removeObserver(lifecycleEve);
             p0.U2(dESTROYED);
             return;
          }else {
             throw new IllegalStateException("ViewController is not added ["+p0+']'.toString());
          }
       }else {
          throw new IllegalStateException("can not remove "+p0+" because it has not been added".toString());
       }
    }
    public void xg(ViewController p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewControllerManagerImpl.class, "5")) {
          return;
       }
       a.p(p0, "viewController");
       d$a.a(this, p0);
       return;
    }
}

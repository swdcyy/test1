package com.kuaishou.live.common.core.basic.livepresenter.LiveVCHostPresenter;
import eq3.d;
import a51.c;
import com.kuaishou.live.common.core.basic.livepresenter.LiveVCHostPresenter$controllerManager$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.view.ViewGroup;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$State;
import java.lang.IllegalStateException;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.LifecycleOwner;

public abstract class LiveVCHostPresenter extends c implements d	// class@000eb0
{
    public final p v;
    public static String sLivePresenterClassName = "LiveVCHostPresenter";

    public void LiveVCHostPresenter(){
       super();
       this.v = s.c(new LiveVCHostPresenter$controllerManager$2(this));
    }
    public void E2(ViewGroup p0,ViewController p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveVCHostPresenter.class, "3")) {
          return;
       }
       a.p(p0, "container");
       a.p(p1, "viewController");
       Lifecycle lifecycle = this.getLifecycle();
       String str = "lifecycle";
       a.o(lifecycle, str);
       if (lifecycle.getCurrentState() == Lifecycle$State.INITIALIZED) {
          throw new IllegalStateException("addViewController must be called after onBind");
       }
       lifecycle = this.getLifecycle();
       a.o(lifecycle, str);
       if (lifecycle.getCurrentState() == Lifecycle$State.DESTROYED) {
          throw new IllegalStateException("addViewController can not be called after onUnbind");
       }
       this.S8().E2(p0, p1);
       return;
    }
    public void G8(int p0,ViewController p1){
       LiveVCHostPresenter liveVCHostPr = LiveVCHostPresenter.class;
       if (PatchProxy.isSupport(liveVCHostPr) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, liveVCHostPr, "2")) {
          return;
       }
       a.p(p1, "viewController");
       Lifecycle lifecycle = this.getLifecycle();
       String str = "lifecycle";
       a.o(lifecycle, str);
       if (lifecycle.getCurrentState() == Lifecycle$State.INITIALIZED) {
          throw new IllegalStateException("addViewController must be called after onBind");
       }
       lifecycle = this.getLifecycle();
       a.o(lifecycle, str);
       if (lifecycle.getCurrentState() == Lifecycle$State.DESTROYED) {
          throw new IllegalStateException("addViewController can not be called after onUnbind");
       }
       this.S8().G8(p0, p1);
       return;
    }
    public final d S8(){
       Object obj = PatchProxy.apply(null, this, LiveVCHostPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.v.getValue();
    }
    public abstract LifecycleOwner V8();
    public void o1(ViewController p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVCHostPresenter.class, "5")) {
          return;
       }
       a.p(p0, "viewController");
       this.S8().o1(p0);
       return;
    }
    public void xg(ViewController p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVCHostPresenter.class, "4")) {
          return;
       }
       a.p(p0, "viewController");
       this.G8(0, p0);
       return;
    }
}

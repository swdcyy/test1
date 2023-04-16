package com.kuaishou.live.common.core.component.multipk.render.viewcontroller.LiveMultiPkRenderChildViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.LiveMultiPkRenderChildViewController$renderChildViewModel$2;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.LiveMultiPkRenderChildViewController$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import ju1.a;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.LiveMultiPkRenderChildViewController$$special$$inlined$viewModels$2;
import msd.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import java.util.Objects;
import zs1.b;
import android.view.View;
import androidx.lifecycle.LiveData;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import ut1.j;

public abstract class LiveMultiPkRenderChildViewController extends ViewController	// class@001686
{
    public b j;
    public LiveData k;
    public j l;
    public LiveData m;
    public String n;
    public ViewGroup o;
    public final p p;

    public void LiveMultiPkRenderChildViewController(){
       super();
       this.p = new ViewModelLazy(m0.d(a.class), new LiveMultiPkRenderChildViewController$$special$$inlined$viewModels$2(new LiveMultiPkRenderChildViewController$$special$$inlined$viewModels$1(this)), new LiveMultiPkRenderChildViewController$renderChildViewModel$2(this));
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, LiveMultiPkRenderChildViewController.class, "11")) {
          return;
       }
       LiveMultiPkRenderChildViewController to = this.o;
       if (to == null) {
          a.S("renderContainer");
       }
       this.d3(to);
       this.Z2().c.setValue(new Object());
       a uoa = this.Z2();
       Objects.requireNonNull(uoa, "null cannot be cast to non-null type ViewModel");
       this.V2(uoa);
       return;
    }
    public abstract void V2(a p0);
    public abstract a W2(b p0);
    public abstract View X2();
    public final LiveData Y2(){
       LiveMultiPkRenderChildViewController obj = PatchProxy.apply(null, this, LiveMultiPkRenderChildViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.k;
       if (obj == null) {
          a.S("pkInfoModel");
       }
       return obj;
    }
    public final a Z2(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkRenderChildViewController.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.getValue();
    }
    public final j a3(){
       LiveMultiPkRenderChildViewController obj = PatchProxy.apply(null, this, LiveMultiPkRenderChildViewController.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.l;
       if (obj == null) {
          a.S("switchConfig");
       }
       return obj;
    }
    public final String b3(){
       LiveMultiPkRenderChildViewController obj = PatchProxy.apply(null, this, LiveMultiPkRenderChildViewController.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.n;
       if (obj == null) {
          a.S("viewKey");
       }
       return obj;
    }
    public final a c3(){
       a obj = PatchProxy.apply(null, this, LiveMultiPkRenderChildViewController.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Z2();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type ViewModel");
       return obj;
    }
    public abstract void d3(ViewGroup p0);
}

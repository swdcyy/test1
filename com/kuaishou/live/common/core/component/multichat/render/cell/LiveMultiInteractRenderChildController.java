package com.kuaishou.live.common.core.component.multichat.render.cell.LiveMultiInteractRenderChildController;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.common.core.component.multichat.render.cell.LiveMultiInteractRenderChildController$renderChildViewModel$2;
import com.kuaishou.live.common.core.component.multichat.render.cell.LiveMultiInteractRenderChildController$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import yh3.a;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.multichat.render.cell.LiveMultiInteractRenderChildController$$special$$inlined$viewModels$2;
import msd.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import android.view.View;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import cq1.c;
import qrd.p;
import yp1.c;

public abstract class LiveMultiInteractRenderChildController extends ViewController	// class@0014db
{
    public ViewGroup j;
    public View k;
    public c l;
    public final p m;

    public void LiveMultiInteractRenderChildController(){
       super();
       this.m = new ViewModelLazy(m0.d(a.class), new LiveMultiInteractRenderChildController$$special$$inlined$viewModels$2(new LiveMultiInteractRenderChildController$$special$$inlined$viewModels$1(this)), new LiveMultiInteractRenderChildController$renderChildViewModel$2(this));
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, LiveMultiInteractRenderChildController.class, "5")) {
          return;
       }
       LiveMultiInteractRenderChildController tj = this.j;
       if (tj == null) {
          a.S("renderContainer");
       }
       this.k = this.W2(tj);
       a uoa = this.a3();
       Objects.requireNonNull(uoa, "null cannot be cast to non-null type VM");
       this.V2(uoa);
       return;
    }
    public abstract void V2(a p0);
    public abstract View W2(ViewGroup p0);
    public abstract a X2();
    public final View Y2(){
       LiveMultiInteractRenderChildController obj = PatchProxy.apply(null, this, LiveMultiInteractRenderChildController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.k;
       if (obj == null) {
          a.S("childView");
       }
       return obj;
    }
    public final c Z2(){
       return this.l;
    }
    public final a a3(){
       Object obj = PatchProxy.apply(null, this, LiveMultiInteractRenderChildController.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m.getValue();
    }
    public final a b3(){
       a obj = PatchProxy.apply(null, this, LiveMultiInteractRenderChildController.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a3();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type VM");
       return obj;
    }
    public void c3(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiInteractRenderChildController.class, "6")) {
          return;
       }
       a.p(p0, "renderLayoutData");
       return;
    }
}

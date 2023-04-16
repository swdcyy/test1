package nu1.c;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.LiveMultiPkRenderChildViewController;
import java.lang.Float;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkTeamFrameView;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ju1.a;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.team.frame.LiveMultiPkRenderTeamFrameViewModel;
import androidx.lifecycle.LiveData;
import nu1.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import pu1.m;
import ut1.f;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import nu1.b;
import zs1.b;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.kuaishou.live.viewcontroller.ViewController;
import android.util.AttributeSet;
import nsd.u;
import android.animation.Animator;

public final class c extends LiveMultiPkRenderChildViewController	// class@0033cf
{
    public LiveMultiPkTeamFrameView q;
    public Animator r;
    public final Float s;

    public void c(Float p0){
       super();
       this.s = p0;
    }
    public static final LiveMultiPkTeamFrameView e3(c p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("teamFrameView");
       }
       return p0;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.f3();
       return;
    }
    public void V2(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
       }else {
          a.p(p0, "viewModel");
          p0.i().observe(this, new a(this));
          if (!m.a.u(this.Y2().getValue())) {
             Object obj = PatchProxy.apply(null, p0, LiveMultiPkRenderTeamFrameViewModel.class, "2");
             if (obj != PatchProxyResult.class) {
             }else {
                obj = p0.h.getValue();
             }
             obj.observe(this, new b(this));
          }
       }
       return;
    }
    public a W2(b p0){
       LiveMultiPkRenderTeamFrameViewModel liveMultiPkR = PatchProxy.applyOneRefs(p0, this, c.class, "3");
       if (liveMultiPkR != PatchProxyResult.class) {
       }else {
          a.p(p0, "pkCoreModel");
          liveMultiPkR = new LiveMultiPkRenderTeamFrameViewModel(p0, this.b3());
       }
       return liveMultiPkR;
    }
    public View X2(){
       c obj = PatchProxy.apply(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj == null) {
          a.S("teamFrameView");
       }
       return obj;
    }
    public void d3(ViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       a.p(p0, "root");
       LiveMultiPkTeamFrameView liveMultiPkT = new LiveMultiPkTeamFrameView(this.s, this.D2(), null, 4, null);
       this.q = p0;
       return;
    }
    public final void f3(){
       if (PatchProxy.applyVoid(null, this, c.class, "7")) {
          return;
       }
       c tr = this.r;
       if (tr != null && tr.isRunning()) {
          tr.cancel();
       }
       return;
    }
}

package h6a.y2;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayVerticalPhotosVMFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.smile.gifmaker.mvps.presenter.MainThreadScatterPresenterGroup;
import com.yxcorp.gifshow.detail.presenter.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import id5.o;
import w1a.c;
import fx9.b;
import tkd.b;
import tkd.d;
import nl9.n;
import com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import o56.a;
import e7a.c;
import e0a.j;
import e7a.o;
import com.yxcorp.gifshow.detail.slideplay.presenter.e;

public final class y2 implements Runnable	// class@0025d3
{
    public final SlidePlayVerticalPhotosVMFragment b;

    public void y2(SlidePlayVerticalPhotosVMFragment p0){
       this.b = p0;
    }
    public final void run(){
       y2 tb = this.b;
       SlidePlayVerticalPhotosVMFragment j = tb.J;
       if (PatchProxy.applyVoidOneRefsWithListener(j, tb, SlidePlayVerticalPhotosVMFragment.class, "15")) {
       }else {
          tb.xh(j);
          j.a(new c());
          if (o.c()) {
             j.a(new c());
          }
          j.a(new b());
          d.a(-1815398131).Qg(j, true, tb.kh());
          if (a.d()) {
             j.a(new c());
          }
          if (a.d() || j.q() > 0) {
             j.a(new o());
          }
          j.a(new e());
          PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment.class, "15");
       }
       return;
    }
}

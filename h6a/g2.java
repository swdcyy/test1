package h6a.g2;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayHorizontalPhotosVMFragment;
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

public final class g2 implements Runnable	// class@00258b
{
    public final SlidePlayHorizontalPhotosVMFragment b;

    public void g2(SlidePlayHorizontalPhotosVMFragment p0){
       this.b = p0;
    }
    public final void run(){
       g2 tb = this.b;
       SlidePlayHorizontalPhotosVMFragment h = tb.H;
       if (PatchProxy.applyVoidOneRefsWithListener(h, tb, SlidePlayHorizontalPhotosVMFragment.class, "20")) {
       }else {
          tb.xh(tb.H);
          h.a(new c());
          if (o.c()) {
             h.a(new c());
          }
          h.a(new b());
          d.a(-1815398131).Qg(h, true, tb.kh());
          if (a.d()) {
             h.a(new c());
          }
          if (a.d() || j.q() > 0) {
             h.a(new o());
          }
          h.a(new e());
          PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "20");
       }
       return;
    }
}

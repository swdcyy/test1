package h6a.q2;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayPhotoDetailVMFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.smile.gifmaker.mvps.presenter.MainThreadScatterPresenterGroup;
import com.yxcorp.gifshow.detail.presenter.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import xf6.f;
import com.yxcorp.gifshow.detail.presenter.b;
import y4a.f;
import jc6.p;
import com.yxcorp.gifshow.detail.slideplay.presenter.e;
import fe5.m;
import id5.o;
import w1a.c;
import w5a.d;
import fx9.b;
import tkd.b;
import tkd.d;
import nl9.n;
import com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import o56.a;
import e7a.c;
import e0a.j;
import e7a.o;
import com.yxcorp.gifshow.freetraffic.FreeTrafficManager;
import ayb.c;

public final class q2 implements Runnable	// class@0025b3
{
    public final SlidePlayPhotoDetailVMFragment b;

    public void q2(SlidePlayPhotoDetailVMFragment p0){
       this.b = p0;
    }
    public final void run(){
       q2 tb = this.b;
       SlidePlayPhotoDetailVMFragment h = tb.H;
       if (PatchProxy.applyVoidOneRefsWithListener(h, tb, SlidePlayPhotoDetailVMFragment.class, "23")) {
       }else {
          tb.yh(h);
          h.a(new c());
          if (f.k()) {
             h.a(new b());
          }
          if (f.i()) {
             h.a(new f());
          }
          if (f.g()) {
             h.a(new p(R.id.view_stub_hodor_debug_info));
          }
          h.a(new e());
          h.a(new m());
          if (o.c()) {
             h.a(new c());
          }
          h.a(new d());
          h.a(new b());
          d.a(-1815398131).Qg(h, true, tb.kh());
          if (a.d()) {
             h.a(new c());
          }
          if (a.d() || j.q() > 0) {
             h.a(new o());
          }
          if (!FreeTrafficManager.j().n()) {
             int i = 0x4d672e6e;
             if (d.a(i) != null) {
                h.a(d.a(i).nc());
             }
          }
          PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "23");
       }
       return;
    }
}

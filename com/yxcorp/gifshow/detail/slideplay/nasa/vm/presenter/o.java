package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.o;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import y6a.w0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.o$a;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.o$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p5a.e;
import de5.a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.framework.player.core.b;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import up.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class o extends PresenterV2	// class@00182b
{
    public int p;
    public a q;
    public BaseFragment r;
    public SlidePlayViewModel s;
    public QPhoto t;
    public final IMediaPlayer$OnInfoListener u;
    public final a v;
    public final a w;

    public void o(){
       super();
       this.u = new w0(this);
       this.v = new o$a(this);
       this.w = new o$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoidWithListener(null, this, o.class, "2")) {
          return;
       }
       this.q.getPlayer().addOnInfoListener(this.u);
       o tr = this.r;
       if (tr != null) {
          this.s = SlidePlayViewModel.S0(tr.getParentFragment());
       }
       tr = this.s;
       if (tr != null) {
          tr.r0(this.r, this.v);
       }
       this.t.setActionReportFetcher(this.w);
       PatchProxy.onMethodExit(o.class, "2");
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, o.class, "3")) {
          return;
       }
       this.p = 0;
       this.q.getPlayer().removeOnInfoListener(this.u);
       this.t.setActionReportFetcher(objArray);
       o ts = this.s;
       if (ts != null) {
          ts.D(this.r, this.v);
       }
       PatchProxy.onMethodExit(o.class, "3");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, o.class, "1")) {
          return;
       }
       this.q = this.q8(a.class);
       this.t = this.q8(QPhoto.class);
       this.r = this.r8("DETAIL_FRAGMENT");
       PatchProxy.onMethodExit(o.class, "1");
       return;
    }
}

package a7a.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import a7a.k$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import a7a.j;
import erd.g;
import crd.b;
import brd.t;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.p;
import com.yxcorp.gifshow.entity.QPhoto;
import android.view.View;
import ekd.m1;
import a7a.i;
import android.view.View$OnClickListener;
import im8.f;
import rf5.u;
import xx9.a;

public class k extends PresenterV2	// class@00005c
{
    public t p;
    public f q;
    public QPhoto r;
    public u s;
    public a t;
    public SlidePlayViewModel u;
    public Fragment v;
    public a w;

    public void k(){
       super();
       this.w = new k$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoidWithListener(null, this, k.class, "3")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.v.getParentFragment());
       this.u = slidePlayVie;
       slidePlayVie.P(this.v, this.w);
       k tp = this.p;
       if (tp != null) {
          this.X7(tp.subscribe(new j(this)));
       }
       PatchProxy.onMethodExit(k.class, "3");
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, k.class, "4")) {
          return;
       }
       this.u.D(this.v, this.w);
       PatchProxy.onMethodExit(k.class, "4");
       return;
    }
    public final void P8(boolean p0){
       if (PatchProxy.isSupport2(k.class, "5") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, k.class, "5")) {
          return;
       }
       RxBus.f.b(new p(this.r.getPhotoId(), p0));
       PatchProxy.onMethodExit(k.class, "5");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, k.class, "2")) {
          return;
       }
       p0 = m1.f(p0, R.id.open_long_atlas);
       if (p0 != null) {
          p0.setOnClickListener(new i(this));
          p0.setClickable(false);
       }
       PatchProxy.onMethodExit(k.class, "2");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, k.class, "1")) {
          return;
       }
       this.p = this.t8("SLIDE_PLAY_CLICK_TO_ATLAS_DETAIL");
       this.q = this.x8("DETAIL_LOGGER");
       this.r = this.q8(QPhoto.class);
       this.v = this.r8("DETAIL_FRAGMENT");
       this.s = this.q8(u.class);
       this.t = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       PatchProxy.onMethodExit(k.class, "1");
       return;
    }
}

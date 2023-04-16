package com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.g;
import com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.e;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import nna.b;
import brd.t;
import brd.z;
import lrd.b;
import io.reactivex.android.schedulers.a;
import g99.b0;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import xk9.g;
import uw9.b;
import com.yxcorp.gifshow.detail.nonslide.NonSlidePhotoConfig;
import java.util.Set;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Activity;
import uw9.b0;
import g99.w;
import com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.g$a;
import im8.f;

public class g extends e	// class@001bae
{
    public b A;
    public Set B;
    public f C;
    public f D;
    public NonSlidePhotoConfig E;
    public QPhoto F;
    public Set G;
    public g$a H;
    public f z;
    public static final int I;
    public static final int J;
    public static final int K;

    static {
       g.I = a1.d(0x7f070fdf);
       g.J = a1.e(66.67f);
       g.K = a1.e(6.67f);
    }
    public void g(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       super.E8();
       this.X7(RxBus.f.f(b.class).subscribeOn(b.c()).observeOn(a.c()).subscribe(new b0(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "5")) {
          return;
       }
       super.J8();
       g tH = this.H;
       if (tH != null) {
          this.A.f(tH);
          if (!this.E.a()) {
             this.B.remove(this.H);
             this.G.remove(this.H);
          }
       }
       return;
    }
    public boolean P8(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b0.c(this.getActivity(), p0);
    }
    public void R8(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "3")) {
          return;
       }
       if (this.H == null) {
          this.w.u0(0);
          this.H = new g$a(this, this.E.a());
          if (!this.E.a()) {
             this.B.add(this.H);
             this.A.a(this.H);
             this.G.add(this.H);
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       super.j8();
       this.z = this.x8("DETAIL_COMMENT_RECYCLER_VIEW");
       this.A = this.q8(b.class);
       this.B = this.r8("DETAIL_SCROLL_LISTENERS");
       this.C = this.x8("DETAIL_PHOTO_HEIGHT");
       this.D = this.x8("DETAIL_SCROLL_DISTANCE");
       this.E = this.r8("DETAIL_PHOTO_NON_SLIDE_CONFIG");
       this.F = this.q8(QPhoto.class);
       this.G = this.r8("DETAIL_RECYCLER_VIEW_TRANSLATION_Y_CHANGE_LISTENER");
       return;
    }
}

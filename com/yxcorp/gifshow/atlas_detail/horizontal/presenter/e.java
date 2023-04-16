package com.yxcorp.gifshow.atlas_detail.horizontal.presenter.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.e$a;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.e$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import ub6.b;
import brd.t;
import t45.d;
import brd.z;
import k99.u;
import erd.g;
import crd.b;
import android.content.Context;
import com.yxcorp.utility.n;
import tyc.v1;
import com.facebook.drawee.view.DraweeView;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.ImageSource;
import dd.d;
import tyc.k;
import ekd.m1;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Integer;
import java.util.List;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.y;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;

public class e extends PresenterV2	// class@001bc7
{
    public v1 A;
    public final k B;
    public final d C;
    public KwaiImageView p;
    public View q;
    public View r;
    public QPhoto s;
    public int t;
    public List u;
    public PublishSubject v;
    public BaseFragment w;
    public PhotoDetailParam x;
    public y y;
    public int z;

    public void e(){
       super();
       this.B = new e$a(this);
       this.C = new e$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       this.X7(RxBus.f.f(b.class).observeOn(d.a).subscribe(new u(this)));
       this.z = n.y(this.getContext());
       this.p.setAspectRatio(this.A.c(this.t));
       this.P8();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       this.p.setImageDrawable(null);
       return;
    }
    public final void P8(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "5")) {
          return;
       }
       this.q.setVisibility(0);
       a uoa = PatchProxy.apply(objArray, this, uoe, "7");
       if (uoa != PatchProxyResult.class) {
       }else {
          a$a uoa1 = a.d();
          uoa1.b(":ks-features:ft-feed:atlas-detail");
          uoa1.d(ImageSource.FEED_COVER);
          uoa = uoa1.a();
       }
       this.A.b(uoa, this.C, this.t, this.B);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a2912);
       this.r = m1.f(p0, 0x7f0a2908);
       this.p = m1.f(p0, 0x7f0a130c);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.s = this.q8(QPhoto.class);
       this.t = this.r8("ATLAS_ADAPTER_POSITION").intValue();
       this.u = this.r8("COVER_SHOWED_LIST");
       this.v = this.r8("DETAIL_ATLAS_AUTO_PLAY");
       this.w = this.r8("DETAIL_FRAGMENT");
       this.y = this.t8("DETAIL_IMAGE_LOAD_OBSERVER");
       this.A = this.r8("ATLAS_LOAD_HELPER");
       this.x = this.q8(PhotoDetailParam.class);
       return;
    }
}

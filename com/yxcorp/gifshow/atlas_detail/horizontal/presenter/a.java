package com.yxcorp.gifshow.atlas_detail.horizontal.presenter.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.a$a;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.a$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import android.view.View;
import tyc.v1;
import com.facebook.drawee.view.DraweeView;
import com.yxcorp.gifshow.util.rx.RxBus;
import ub6.b;
import brd.t;
import t45.d;
import brd.z;
import k99.b;
import erd.g;
import crd.b;
import android.content.Context;
import com.yxcorp.utility.n;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.ImageSource;
import dd.d;
import tyc.k;
import ekd.m1;
import com.yxcorp.gifshow.entity.QPhoto;
import brd.y;

public class a extends PresenterV2	// class@001bbe
{
    public KwaiImageView p;
    public View q;
    public View r;
    public QPhoto s;
    public int t;
    public List u;
    public y v;
    public int w;
    public v1 x;
    public final k y;
    public final d z;

    public void a(){
       super();
       this.y = new a$a(this);
       this.z = new a$b(this);
    }
    public void E8(){
       int b;
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "3")) {
          return;
       }
       a tq = this.q;
       a tt = this.t;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(tt), this, uoa, "8");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          label_0035 :
             b = (b)? 8: 0;
             tq.setVisibility(b);
             this.p.setAspectRatio(this.x.c(this.t));
             this.X7(RxBus.f.f(b.class).observeOn(d.a).subscribe(new b(this)));
             this.w = n.y(this.getContext());
             this.P8();
             return;
          }
       }
       b = this.u.contains(Integer.valueOf(tt));
       goto label_0035 ;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.p.setImageDrawable(null);
       return;
    }
    public final void P8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "6")) {
          return;
       }
       this.q.setVisibility(0);
       uoa = PatchProxy.apply(objArray, this, uoa, "7");
       if (uoa != PatchProxyResult.class) {
       }else {
          a$a uoa1 = a.d();
          uoa1.b(":ks-features:ft-feed:atlas-detail");
          uoa1.d(ImageSource.FEED_COVER);
          uoa = uoa1.a();
       }
       this.x.b(uoa, this.z, this.t, this.y);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a2912);
       this.r = m1.f(p0, 0x7f0a2908);
       this.p = m1.f(p0, 0x7f0a130c);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.s = this.q8(QPhoto.class);
       this.t = this.r8("ATLAS_ADAPTER_POSITION").intValue();
       this.u = this.r8("COVER_SHOWED_LIST");
       this.v = this.t8("DETAIL_IMAGE_LOAD_OBSERVER");
       this.x = this.r8("ATLAS_LOAD_HELPER");
       return;
    }
}

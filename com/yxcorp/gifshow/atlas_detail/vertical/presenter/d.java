package com.yxcorp.gifshow.atlas_detail.vertical.presenter.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.atlas_detail.vertical.presenter.d$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.f0;
import android.content.Context;
import w4.h;
import com.yxcorp.gifshow.util.rx.RxBus;
import ub6.b;
import brd.t;
import t45.d;
import brd.z;
import n99.f;
import erd.g;
import crd.b;
import im8.f;
import java.lang.Integer;
import com.yxcorp.gifshow.entity.QPhoto;
import je5.a;
import m99.f;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import com.yxcorp.image.callercontext.ImageSource;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.atlas_detail.vertical.presenter.d$b;
import ub.b;
import com.facebook.drawee.controller.ForwardingControllerListener;
import xf6.d;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.framework.model.feed.BaseFeed;
import dd.d;
import android.graphics.drawable.Drawable;
import wb5.g;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import brd.y;

public class d extends PresenterV2	// class@001be0
{
    public KwaiImageView p;
    public QPhoto q;
    public f r;
    public f s;
    public y t;
    public View u;
    public int v;
    public final d w;

    public void d(){
       super();
       this.w = new d$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       this.v = this.v + 1;
       f0 uof0 = new f0(this.getContext(), 0x7f0f0044);
       uof0.D(-1);
       uof0.E(0.27f);
       this.X7(RxBus.f.f(b.class).observeOn(d.a).subscribe(new f(this)));
       this.P8();
       a.a(this.s.get().intValue(), this.q);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       PhotoDetailLogger.reportAtlas(2, (long)this.r.getItemCount(), (long)this.v);
       return;
    }
    public final void P8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "4")) {
          return;
       }
       d tp = this.p;
       QPhoto mEntity = this.q.mEntity;
       int i = this.s.get().intValue();
       ImageSource dETAIL_ATLAS = ImageSource.DETAIL_ATLAS;
       int i1 = n.y(this.getContext());
       ForwardingControllerListener uForwardingC = ForwardingControllerListener.of(new d$b(this));
       if (d.f()) {
          objArray = this.w;
       }
       g.v(tp, mEntity, i, "IMAGE_ATLAS_VERTICAL", dETAIL_ATLAS, i1, false, uForwardingC, objArray, null);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a130c);
       this.u = m1.f(p0, 0x7f0a2916);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.q = this.q8(QPhoto.class);
       this.r = this.q8(f.class);
       this.s = this.x8("ADAPTER_POSITION");
       this.t = this.r8("DETAIL_IMAGE_LOAD_OBSERVER");
       return;
    }
}

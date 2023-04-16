package com.yxcorp.gifshow.ad.detail.presenter.player.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import o56.a;
import android.content.res.Resources;
import android.app.Application;
import com.yxcorp.gifshow.ad.detail.presenter.player.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.yxcorp.gifshow.entity.QPhoto;
import d19.b;
import com.yxcorp.gifshow.ad.detail.presenter.player.a;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.app.Activity;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import im8.f;
import hn5.n;
import hn5.m;
import android.content.Context;
import tkd.b;
import tkd.d;
import ilc.i;
import yxb.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.Objects;
import java.lang.StringBuilder;
import yx.j0;
import java.lang.Integer;
import com.facebook.drawee.view.DraweeView;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import com.yxcorp.gifshow.ad.detail.presenter.player.b$b;
import ub.b;
import com.facebook.drawee.controller.ForwardingControllerListener;
import jp.a;
import com.kwai.framework.model.feed.BaseFeed;
import wb5.g;
import com.yxcorp.gifshow.ad.detail.presenter.player.b$c;
import jd.c;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import foc.t;
import foc.y;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import com.facebook.imagepipeline.request.ImageRequest;
import com.kuaishou.android.model.mix.CoverMeta;
import kp.r1;
import com.kuaishou.android.model.mix.w;
import s0d.f;
import wb5.b;
import s0d.a;
import s0d.e;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import ac.a;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.yxcorp.gifshow.ad.detail.presenter.player.b$d;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.yxcorp.gifshow.ad.detail.presenter.player.b$e;

public abstract class b extends PresenterV2	// class@001675
{
    public f p;
    public QPhoto q;
    public PhotoDetailParam r;
    public boolean s;
    public Activity t;
    public b u;
    public final a v;
    public static final int w;

    static {
       b.w = a.B.getResources().getColor(0x7f061ed9);
    }
    public void b(){
       super();
       this.v = new b$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.X7(this.q.observePostChange().subscribe(new b(this), a.b));
       this.V8(this.P8(), this.q.getColor(), false);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.s = false;
       this.t = this.getActivity();
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, b.class, "4");
    }
    public abstract KwaiImageView P8();
    public final boolean R8(boolean p0){
       b obj;
       Object obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, b.class, "6");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       if (this.r.enableSlidePlay()) {
          obj = this.p;
          if (obj == null || (!obj.get().booleanValue() && !p0)) {
          label_0037 :
             if (!m.a().U3(this.t)) {
                obj1 = PatchProxy.apply(null, this, b.class, "9");
                obj1 = (obj1 != patchProxyRe)? obj1.booleanValue(): d.a(0x681d4627).r1(this.q);
                if (!obj1) {
                   obj1 = false;
                label_0068 :
                   return obj1;
                }
             }
          }
       }else {
          goto label_0037 ;
       }
       obj1 = true;
       goto label_0068 ;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, b.class, "8")) {
          return;
       }
       if (this.s == null && d.a(-430326918).cR(this.getActivity())) {
          GifshowActivity activity = this.getActivity();
          this.s = true;
          Objects.requireNonNull(activity);
          Object[] objArray = new Object[0];
          j0.j("PerformanceMonitor", "photo detail cover show event, "+activity.getClass().getName(), objArray);
       }
       return;
    }
    public void V8(KwaiImageView p0,int p1,boolean p2){
       a b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, b.class, "5")) {
          return;
       }
       p0.setAspectRatio(this.q.getDetailDisplayAspectRatio());
       p0.setPlaceHolderImage(new ColorDrawable(p1));
       a$a uoa = a.d();
       uoa.b(":ks-features:ft-commercial:commercial");
       uoa.d(ImageSource.DETAIL_COVER_IMAGE);
       a uoa1 = uoa.a();
       if (this.q.isImageType()) {
          g.r(p0, this.q.mEntity, a.b, ForwardingControllerListener.of(ForwardingControllerListener.of(new b$b(this, p0), this.v)), uoa1);
       }else if(this.R8(p2)){
          g.m(p0, this.q.mEntity, a.b, super(this), null, uoa1, b.w);
       }else {
          t ot = y.a(this.r.getDetailCommonParam().getUnserializableBundleId());
          a uoa2 = null;
          Bitmap uBitmap = (ot != null)? ot.a(): uoa2;
          if (uBitmap != null && !uBitmap.isRecycled()) {
             p0.setImageBitmap(uBitmap.copy(uBitmap.getConfig(), true));
             return;
          }else {
             QPhoto mEntity = this.q.mEntity;
             a uoa3 = PatchProxy.applyOneRefs(mEntity, this, uob, "7");
             if (uoa3 != PatchProxyResult.class) {
             }else {
                CoverMeta uCoverMeta = r1.D0(mEntity);
                if (uCoverMeta != null) {
                   if (w.v0(mEntity)) {
                      b = a.b;
                      int i = b.d(uCoverMeta);
                      uoa2 = b.h(uCoverMeta).o(i, b.b(uCoverMeta)).v();
                   }else {
                      uoa2 = b.d(uCoverMeta);
                   }
                }
                uoa3 = uoa2;
             }
             if (uoa3 != null) {
                d uod = Fresco.newDraweeControllerBuilder();
                uod.y(p0.getController());
                uod.w(uoa3);
                d uod1 = uod.r(uoa1);
                uod1.s(new b$d(this));
                p0.setController(uod1.e());
             }else {
                g.B(p0, this.q.mEntity, a.b, super(this), uoa1, null, b.w);
             }
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.w8("DETAIL_FROM_SLIDE");
       this.q = this.q8(QPhoto.class);
       this.r = this.q8(PhotoDetailParam.class);
       return;
    }
}

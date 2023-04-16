package com.yxcorp.gifshow.atlas_detail.horizontal.presenter.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.f$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import sd5.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import com.yxcorp.gifshow.entity.QPhoto;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import ekd.i;
import java.lang.Math;
import k99.f0;
import erd.g;
import crd.b;
import brd.t;
import k99.h0;
import java.lang.Runnable;
import android.view.View;
import k99.g0;
import android.app.Activity;
import lnc.a1;
import android.content.res.Resources;
import cw9.c;
import android.view.View$OnLayoutChangeListener;
import im8.f;
import java.lang.Boolean;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.widget.RelativeLayout$LayoutParams;
import uw9.b0;
import io.reactivex.subjects.PublishSubject;
import rkd.b;
import ekd.m1;
import com.yxcorp.gifshow.widget.viewpager.PhotosViewPager;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;

public class f extends PresenterV2	// class@001bc9
{
    public int A;
    public int B;
    public f C;
    public t D;
    public NormalDetailBizParam E;
    public final View$OnLayoutChangeListener F;
    public PhotosViewPager p;
    public QPhoto q;
    public PublishSubject r;
    public PublishSubject s;
    public f t;
    public f u;
    public f v;
    public PhotoDetailParam w;
    public View x;
    public int y;
    public int z;

    public void f(){
       super();
       this.F = new f$a(this);
    }
    public void E8(){
       int i;
       float f;
       int i4;
       Object[] objArray = null;
       String str = "4";
       if (PatchProxy.applyVoid(objArray, this, f.class, str)) {
          return;
       }
       if (this.w.getSource() == 288 || (this.w.getSource() == 8 && NasaExperimentUtils.A())) {
          f tq = this.q;
          Object obj = PatchProxy.applyOneRefs(tq, objArray, a.class, str);
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else {
             ImageMeta$AtlasCoverSize[] atlasSizes = tq.getAtlasSizes();
             f = 0x3f400000;
             int i1 = 0;
             int i2 = 0x3f800000;
             if (atlasSizes != null) {
                int i3 = 0;
                i4 = 0x3f800000;
                while (i3 < atlasSizes.length) {
                   object oobject = null;
                   float f1 = (atlasSizes[i3].mHeight - oobject && atlasSizes[i3].mWidth - oobject)? atlasSizes[i3].mWidth / atlasSizes[i3].mHeight: 0x3f800000;
                   if (f1 - i4 < 0) {
                      i4 = f1;
                   }
                   i3 = i3 + 1;
                }
             }else {
                i4 = 0x3f800000;
             }
             if (i4 - f >= 0) {
                f = (i4 - i2 > 0)? 0x3f800000: i4;
             }
          label_007e :
             Application b = a.B;
             int i5 = (int)((float)n.y(b) / f);
             if (!i.c()) {
                i1 = n.A(b);
             }
             i = Math.min(i5, (n.u(b) - i1));
          }
          this.y = i;
       }else {
          this.y = a.a(this.q);
       }
       this.P8();
       this.X7(this.r.subscribe(new f0(this)));
       this.x.post(new h0(this));
       this.X7(this.D.subscribe(new g0(this)));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       this.x = this.getActivity().findViewById(0x1020002);
       this.z = a1.h();
       int height = (this.x.getHeight())? this.x.getHeight(): a1.g();
       this.A = height;
       this.B = c.b(this.l8(), 0x7f070fdf);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "5")) {
          return;
       }
       this.x.removeOnLayoutChangeListener(this.F);
       return;
    }
    public void P8(){
       f tA;
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "6")) {
          return;
       }
       if (this.u.get().booleanValue()) {
          if (!PatchProxy.applyVoid(objArray, this, uof, "8")) {
             uof = this.y;
             tA = this.A;
             if (tA < uof) {
                uof = tA;
             }
             this.t.set(Integer.valueOf(uof));
             RelativeLayout$LayoutParams layoutParams = this.p.getLayoutParams();
             layoutParams.height = uof;
             this.p.setLayoutParams(layoutParams);
             if (this.A > ((int)((float)this.z / this.q.getDetailDisplayAspectRatio()) + this.B)) {
                this.s.onNext(Boolean.valueOf(b0.c(this.getActivity(), this.q)));
             }else {
                this.s.onNext(Boolean.TRUE);
             }
          }
       }else if(PatchProxy.applyVoid(objArray, this, uof, "7") || b.g()){
          RelativeLayout$LayoutParams layoutParams1 = this.p.getLayoutParams();
          tA = this.y;
          layoutParams1.height = tA;
          this.t.set(Integer.valueOf(tA));
          this.p.setLayoutParams(layoutParams1);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a4452);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.q = this.q8(QPhoto.class);
       this.r = this.r8("DETAIL_ON_CONFIGURATION_CHANGED_EVENT");
       this.s = this.r8("DETAIL_ADJUST_EVENT");
       this.t = this.x8("DETAIL_PHOTO_HEIGHT");
       this.u = this.x8("DETAIL_MULTI_WINDOW_MODE");
       this.C = this.x8("DETAIL_COMMENT_RECYCLER_VIEW");
       this.D = this.r8("DETAIL_PAGE_VISIBLE_OBSERVABLE");
       this.E = this.q8(NormalDetailBizParam.class);
       this.v = this.x8("DETAIL_ATLAS_SCROLL_DISTANCE");
       this.w = this.q8(PhotoDetailParam.class);
       return;
    }
}

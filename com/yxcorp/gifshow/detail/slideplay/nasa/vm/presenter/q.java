package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.q;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import w85.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import android.view.View;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.kwai.feature.component.entry.a;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Drawable;
import le5.f;
import y6a.c1;
import erd.g;
import crd.b;
import brd.t;
import y6a.b1;
import android.content.Context;
import android.content.res.Resources;
import cw9.c;
import ekd.m1;
import android.widget.ProgressBar;
import io.reactivex.subjects.PublishSubject;

public class q extends PresenterV2	// class@001830
{
    public boolean A;
    public t B;
    public View p;
    public View q;
    public View r;
    public ProgressBar s;
    public View t;
    public NasaBizParam u;
    public View v;
    public int w;
    public PublishSubject x;
    public a y;
    public int z;

    public void q(boolean p0){
       super();
       this.w = -1;
       this.A = p0;
    }
    public void E8(){
       q tt;
       int b;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, q.class, "4")) {
          return;
       }
       String str = "5";
       if (!PatchProxy.applyVoidWithListener(objArray, this, q.class, str)) {
          q ty = this.y;
          Objects.requireNonNull(ty);
          ViewGroup$LayoutParams obj = PatchProxy.apply(objArray, ty, a.class, "12");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(ty.R != null){
             b = ty.s;
          }else if(ty.T.getBizType() == 4){
             b = 1;
          }else {
             b = null;
          }
          if (b != null) {
             tt = this.p;
             if (tt != null) {
                tt.setVisibility(0);
             }
          }
          tt = this.u;
          if (tt == null || tt.getNasaSlideParam() == null) {
             PatchProxy.onMethodExit(q.class, str);
          }else {
             b = a.n(this.u.getNasaSlideParam().mEntrySource);
             int i = 0x7f060755;
             if (b == 7 || b == 8) {
                i = 0x7f060757;
                tt = this.p;
                if (tt != null) {
                   obj = tt.getLayoutParams();
                   obj.height = a1.e(0x42f00000);
                   this.p.setLayoutParams(obj);
                }
             }
             tt = this.p;
             if (tt != null) {
                tt.setVisibility(0);
                GradientDrawable gradientDraw = new GradientDrawable();
                gradientDraw.setShape(0);
                gradientDraw.setGradientType(0);
                int[] ointArray = new int[]{a1.a(i),a1.a(0x7f06202f)};
                gradientDraw.setColors(ointArray);
                this.p.setBackground(gradientDraw);
             }
             PatchProxy.onMethodExit(q.class, str);
          }
       }
       if (f.b() || (!this.u.getNasaSlideParam().isHomePage() && (this.u.getNasaSlideParam().isTrendingPage() || this.u.getNasaSlideParam().isDetailPage()))) {
          tt = this.t;
          if (tt != null) {
             tt.setVisibility(0);
          }
          tt = this.q;
          if (tt != null) {
             tt.setVisibility(8);
          }
          this.v = this.t;
       }else {
          tt = this.t;
          if (tt != null) {
             tt.setVisibility(8);
          }
          tt = this.q;
          if (tt != null) {
             tt.setVisibility(0);
          }
          this.v = this.q;
       }
       if (this.A != null) {
          tt = this.r;
          if (tt != null) {
             tt.setTranslationY((float)this.z);
          }
          this.X7(this.x.subscribe(new c1(this)));
       }
       this.X7(this.B.subscribe(new b1(this)));
       PatchProxy.onMethodExit(q.class, "4");
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoidWithListener(null, this, q.class, "3")) {
          return;
       }
       this.z = c.b(this.getContext().getResources(), 0x7f070bf1);
       PatchProxy.onMethodExit(q.class, "3");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, q.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a39fe);
       this.p = m1.f(p0, 0x7f0a400c);
       this.q = m1.f(p0, 0x7f0a04db);
       this.r = m1.f(p0, 0x7f0a04e1);
       p0 = m1.f(p0, R.id.bottom_shadow_exp);
       this.t = p0;
       if (p0 != null) {
          p0.setTag(R.id.key_view_checker_white_list, Boolean.TRUE);
       }
       PatchProxy.onMethodExit(q.class, "2");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, q.class, "1")) {
          return;
       }
       this.x = this.r8("DETAIL_NASA_BOTTOM_VISIBLE_EVENT");
       this.y = this.q8(a.class);
       this.B = this.r8("CAPTION_FOLD_PROGRESS_OBSERVABLE");
       this.u = this.q8(NasaBizParam.class);
       PatchProxy.onMethodExit(q.class, "1");
       return;
    }
}

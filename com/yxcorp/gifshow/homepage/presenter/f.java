package com.yxcorp.gifshow.homepage.presenter.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.homepage.presenter.f$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.utility.n;
import lnc.d2;
import android.view.View$OnLayoutChangeListener;
import android.view.View;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.homepage.presenter.f$b;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.kwai.component.homepage_interface.channel.model.ChannelTemplateMeta;
import ekd.j;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.view.ViewGroup$MarginLayoutParams;
import com.kwai.component.homepage_interface.channel.model.ChannelTemplateCoverInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import yta.p;
import android.view.View$OnClickListener;
import ekd.m1;
import com.kwai.framework.model.feed.BaseFeed;

public class f extends PresenterV2	// class@0017c2
{
    public View A;
    public View$OnLayoutChangeListener B;
    public BaseFeed p;
    public ChannelTemplateMeta q;
    public View r;
    public KwaiImageView s;
    public KwaiImageView t;
    public KwaiImageView u;
    public KwaiImageView v;
    public View w;
    public View x;
    public View y;
    public View z;

    public void f(){
       super();
       this.B = new f$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       if (d2.h(n.k(this.getActivity()), n.j(this.getActivity()))) {
          this.r.addOnLayoutChangeListener(this.B);
       }
       int measuredWidt = this.r.getMeasuredWidth();
       if (measuredWidt > 0) {
          this.P8(measuredWidt);
       }else {
          this.r.getViewTreeObserver().addOnPreDrawListener(new f$b(this));
       }
       if (j.h(this.q.mSubCoverInfoList)) {
          return;
       }else {
          int i = 0;
          this.S8(this.t, i);
          int i1 = 1;
          this.S8(this.u, i1);
          this.S8(this.v, 2);
          measuredWidt = (this.q.mShowOrder != null)? 0: 8;
          View[] viewArray = new View[]{this.w,this.x,this.y,this.z};
          n.Z(measuredWidt, viewArray);
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       this.r.removeOnLayoutChangeListener(this.B);
       return;
    }
    public void P8(int p0){
       float f;
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof, "6")) {
          return;
       }
       f = (float)p0;
       int i = (int)((f * 15.00f) / 201.00f);
       f = (int)((f * 153.00f) / 201.00f) / 3;
       float f1 = (float)i;
       int i1 = (int)((16.00f * f1) / 15.00f);
       ViewGroup$MarginLayoutParams layoutParams = this.s.getLayoutParams();
       layoutParams.topMargin = i1;
       layoutParams.leftMargin = i;
       layoutParams.rightMargin = i;
       this.s.setLayoutParams(layoutParams);
       layoutParams = this.t.getLayoutParams();
       layoutParams.width = f;
       layoutParams.topMargin = i1;
       layoutParams.bottomMargin = i;
       this.t.setLayoutParams(layoutParams);
       this.R8(this.u, f);
       this.R8(this.v, f);
       ViewGroup$MarginLayoutParams layoutParams1 = this.A.getLayoutParams();
       layoutParams1.topMargin = i1 - i;
       layoutParams1.bottomMargin = (int)((f1 * 66.00f) / 15.00f);
       this.A.setLayoutParams(layoutParams1);
       return;
    }
    public final void R8(KwaiImageView p0,int p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uof, "7")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.width = p1;
       p0.setLayoutParams(layoutParams);
       return;
    }
    public final void S8(KwaiImageView p0,int p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uof, "5")) {
          return;
       }
       object oobject = null;
       ChannelTemplateMeta mSubCoverInf = this.q.mSubCoverInfoList;
       if (p1 < mSubCoverInf.length) {
          oobject = mSubCoverInf[p1];
       }
       if (oobject == null) {
          return;
       }else if(!j.h(oobject.mCoverUrl)){
          p0.U(oobject.mCoverUrl);
       }
       p0.setOnClickListener(new p(this, oobject.mLinkUrl, p1));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a36a4);
       this.s = m1.f(p0, 0x7f0a3105);
       this.t = m1.f(p0, 0x7f0a09d7);
       this.u = m1.f(p0, 0x7f0a09d8);
       this.v = m1.f(p0, 0x7f0a09d9);
       this.w = m1.f(p0, 0x7f0a3403);
       this.x = m1.f(p0, 0x7f0a3404);
       this.y = m1.f(p0, 0x7f0a3405);
       this.z = m1.f(p0, 0x7f0a3406);
       this.A = m1.f(p0, 0x7f0a3d93);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.p = this.q8(BaseFeed.class);
       this.q = this.q8(ChannelTemplateMeta.class);
       return;
    }
}

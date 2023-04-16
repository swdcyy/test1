package com.yxcorp.gifshow.homepage.presenter.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.CommonMeta;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kwai.component.feedstaggercard.model.ArticleModel;
import android.widget.ImageView;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import xl8.d;
import y8c.a;
import brd.t;
import lnc.b9;
import yta.k;
import erd.g;
import crd.b;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.StringBuilder;
import lnc.a1;
import android.content.Context;
import com.yxcorp.gifshow.util.DateUtils;
import android.graphics.drawable.ColorDrawable;
import android.content.res.Resources;
import com.kuaishou.android.model.mix.CoverMeta;
import zf6.l;
import java.util.List;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kwai.component.feedstaggercard.model.ArticleModel$CDNUrlsExt;
import java.lang.Boolean;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.View;
import java.lang.Float;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.utility.n;
import ekd.m1;
import com.yxcorp.gifshow.entity.QPhoto;
import y8c.q;

public class c extends PresenterV2	// class@0017bd
{
    public TextView A;
    public KwaiImageView B;
    public View C;
    public KwaiImageView D;
    public KwaiImageView E;
    public KwaiImageView F;
    public KwaiImageView G;
    public q H;
    public List I;
    public ColorDrawable J;
    public final float K;
    public final float L;
    public final float M;
    public QPhoto p;
    public User q;
    public CoverMeta r;
    public CommonMeta s;
    public PhotoMeta t;
    public ArticleModel u;
    public TextView v;
    public View w;
    public TextView x;
    public TextView y;
    public TextView z;

    public void c(){
       super();
       this.I = new ArrayList();
       this.K = 12.60f;
       this.L = 16.60f;
       this.M = 0x40f33333;
    }
    public void E8(){
       int i1;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "4")) {
          return;
       }
       this.v.setText(this.s.mCaption);
       int i = 8;
       if (this.u.isShowAuthor()) {
          this.B.setVisibility(i);
          this.B.U(this.q.mAvatars);
          this.x.setText(this.q.mName);
       }else {
          this.B.setVisibility(i);
          this.x.setText(this.u.mArticleSource);
       }
       this.X7(b9.d(this.t, this.H).subscribe(new k(this)));
       this.X8(this.t);
       this.z.setText(this.t.mViewCount+a1.p(R.string.arg_RES_7f10022a));
       this.A.setText(DateUtils.w(this.getContext(), this.s.mCreated));
       if (!PatchProxy.applyVoid(objArray, this, uoc, "5")) {
          if (this.J == null) {
             this.J = new ColorDrawable(l.m(this.getContext().getResources().getColor(0x7f061d82), this.r.mColor));
          }
          ArticleModel mResourcePic = this.u.mResourcePics;
          mResourcePic = (mResourcePic == null)? 0: mResourcePic.size();
          if (mResourcePic) {
             if (mResourcePic != 1 && mResourcePic != 2) {
                this.R8(false);
                this.S8(true);
                this.V8(true);
                this.W8(0x40f33333);
             }else {
                this.R8(true);
                this.S8(false);
                this.V8(2);
                this.W8(16.60f);
             }
          }else {
             this.R8(false);
             this.S8(false);
             this.V8(true);
             this.W8(12.60f);
          }
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.I.add(this.E);
       this.I.add(this.F);
       this.I.add(this.G);
       return;
    }
    public final List P8(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          return this.u.mResourcePics.get(p0).mResCdnUrls;
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public final void R8(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "8")) {
          return;
       }
       int i = 0;
       List list = this.P8(i);
       if (p0 && list != null) {
          this.D.setVisibility(i);
          this.D.setPlaceHolderImage(this.J);
          this.D.P(list);
       }else {
          this.D.setVisibility(8);
       }
       return;
    }
    public final void S8(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "9")) {
          return;
       }
       if (p0) {
          if (!PatchProxy.applyVoid(null, this, uoc, "10")) {
             int i = this.I.size();
             for (int i1 = 0; i1 < i; i1 = i1 + 1) {
                this.I.get(i1).setPlaceHolderImage(this.J);
                this.I.get(i1).P(this.P8(i1));
             }
          }
          this.C.setVisibility(0);
       }else {
          this.C.setVisibility(8);
       }
       return;
    }
    public final void V8(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "7")) {
          return;
       }
       this.v.setMinLines(p0);
       return;
    }
    public final void W8(float p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoc, "6")) {
          return;
       }
       ViewGroup$MarginLayoutParams layoutParams = this.w.getLayoutParams();
       layoutParams.topMargin = n.c(this.getContext(), p0);
       this.w.setLayoutParams(layoutParams);
       return;
    }
    public final void X8(PhotoMeta p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "12")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       int likeCount = p0.getLikeCount();
       int i = 8;
       if (likeCount <= 0) {
          this.y.setVisibility(i);
       }else {
          this.y.setVisibility(i);
          this.y.setText(likeCount+a1.p(R.string.arg_RES_7f101cb7));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.E = m1.f(p0, 0x7f0a09d6);
       this.C = m1.f(p0, 0x7f0a09dd);
       this.x = m1.f(p0, 0x7f0a0246);
       this.B = m1.f(p0, 0x7f0a0333);
       this.z = m1.f(p0, 0x7f0a342d);
       this.G = m1.f(p0, 0x7f0a09d8);
       this.v = m1.f(p0, 0x7f0a0248);
       this.D = m1.f(p0, 0x7f0a09e9);
       this.y = m1.f(p0, 0x7f0a31a9);
       this.A = m1.f(p0, 0x7f0a0243);
       this.F = m1.f(p0, 0x7f0a09d7);
       this.w = m1.f(p0, 0x7f0a437a);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.q8(User.class);
       this.r = this.q8(CoverMeta.class);
       this.s = this.q8(CommonMeta.class);
       this.t = this.q8(PhotoMeta.class);
       this.u = this.q8(ArticleModel.class);
       this.H = this.r8("FRAGMENT");
       return;
    }
}

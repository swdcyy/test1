package com.yxcorp.gifshow.profile.presenter.profile.header.recommend.PymkRecommendContactPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.PymkRecommendContactPresenter$mPermissionHolder$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.widget.TextView;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import n7c.c;
import com.kwai.framework.model.user.RecoUser;
import z5c.y1;
import com.yxcorp.gifshow.pymk.PymkGuideCard;
import java.lang.CharSequence;
import android.text.TextPaint;
import zf6.k;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ub.b;
import com.yxcorp.image.callercontext.a;
import wb5.g;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import lnc.a1;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import n7c.e;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.PymkRecommendContactPresenter$a;
import java.lang.Runnable;
import com.kwai.robust.PatchProxyResult;
import zf6.j;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.PymkRecommendContactPresenter$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.PymkRecommendContactPresenter$c;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.PymkRecommendContactPresenter$d;
import com.yxcorp.gifshow.widget.m;
import f7c.c;
import y8c.g;

public final class PymkRecommendContactPresenter extends PresenterV2	// class@00151e
{
    public final p A;
    public final int B;
    public int p;
    public KwaiImageView q;
    public TextView r;
    public TextView s;
    public View t;
    public TextView u;
    public RecoUser v;
    public c w;
    public g x;
    public PymkGuideCard y;
    public boolean z;

    public void PymkRecommendContactPresenter(int p0){
       super();
       this.B = p0;
       this.p = -1;
       this.A = s.c(PymkRecommendContactPresenter$mPermissionHolder$2.INSTANCE);
    }
    public static final TextView P8(PymkRecommendContactPresenter p0){
       p0 = p0.u;
       if (p0 == null) {
          a.S("mActionBtn");
       }
       return p0;
    }
    public static final View R8(PymkRecommendContactPresenter p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("mActionBtnContainer");
       }
       return p0;
    }
    public void E8(){
       PymkRecommendContactPresenter tu;
       PymkRecommendContactPresenter tq;
       PymkRecommendContactPresenter pymkRecommen = PymkRecommendContactPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, pymkRecommen, "4")) {
          return;
       }
       this.z = c.f();
       PymkRecommendContactPresenter tv = this.v;
       if (tv == null) {
          a.S("mRecoUser");
       }
       RecoUser mPymkGuideCa = tv.mPymkGuideCard;
       this.y = mPymkGuideCa;
       if (mPymkGuideCa != null) {
          y1.b0(this.B);
          PymkRecommendContactPresenter tr = this.r;
          String str = "mTitle";
          if (tr == null) {
             a.S(str);
          }
          tr.setText(mPymkGuideCa.mTitle);
          tr = this.r;
          if (tr == null) {
             a.S(str);
          }
          TextPaint paint = tr.getPaint();
          a.o(paint, "mTitle.paint");
          paint.setFakeBoldText(true);
          tr = this.s;
          if (tr == null) {
             a.S("mSubTitle");
          }
          tr.setText(mPymkGuideCa.mSubTitle);
          String str1 = "mAvatarView";
          if (!PatchProxy.applyVoid(objArray, this, pymkRecommen, "5")) {
             tv = this.y;
             if (tv != null) {
                if (k.d() && !TextUtils.x(tv.mDarkHeadUrl)) {
                   tq = this.q;
                   if (tq == null) {
                      a.S(str1);
                   }
                   g.g(tq, tv.mDarkHeadUrl, HeadImageSize.ADJUST_BIG, objArray, objArray);
                }else if(!TextUtils.x(tv.mHeadUrl)){
                   tq = this.q;
                   if (tq == null) {
                      a.S(str1);
                   }
                   g.g(tq, tv.mHeadUrl, HeadImageSize.ADJUST_BIG, objArray, objArray);
                }
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, pymkRecommen, "6")) {
             pymkRecommen = this.q;
             if (pymkRecommen == null) {
                a.S(str1);
             }
             ViewGroup$LayoutParams layoutParams = pymkRecommen.getLayoutParams();
             if (this.z != null) {
                layoutParams.height = a1.e(110.00f);
                layoutParams.width = a1.e(110.00f);
             }else {
                layoutParams.height = a1.e(48.00f);
                layoutParams.width = a1.e(132.00f);
             }
             tu = this.q;
             if (tu == null) {
                a.S(str1);
             }
             tu.setLayoutParams(layoutParams);
          }
          if (this.z != null) {
             boolean b = this.V8().d();
             tu = this.u;
             if (tu == null) {
                a.S("mActionBtn");
             }
             tv = this.t;
             if (tv == null) {
                a.S("mActionBtnContainer");
             }
             e.c(b, tu, tv);
          }else {
             this.W8();
          }
       }
       return;
    }
    public final void S8(){
       String str;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PymkRecommendContactPresenter.class, "7")) {
          return;
       }
       if (this.z != null && this.V8().d()) {
          str = "second_view";
       }else if(this.z != null){
          str = "view";
       }else {
          str = "open";
       }
       y1.a0(this.B, str);
       Activity activity = this.getActivity();
       if (activity instanceof GifshowActivity) {
          objArray = activity;
       }
       if (objArray != null) {
          this.V8().g(objArray, this.B, new PymkRecommendContactPresenter$a(objArray, this));
       }
       return;
    }
    public final ContactPermissionHolder V8(){
       Object obj = PatchProxy.apply(null, this, PymkRecommendContactPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.A.getValue();
    }
    public final void W8(){
       PymkRecommendContactPresenter tu;
       TextPaint paint;
       if (PatchProxy.applyVoid(null, this, PymkRecommendContactPresenter.class, "9")) {
          return;
       }
       boolean b = true;
       String str = "mActionBtn";
       if (this.V8().d()) {
          tu = this.u;
          if (tu == null) {
             a.S(str);
          }
          tu.setText(a1.p(R.string.arg_RES_7f1046e4));
          tu.setTextColor(j.d(tu, R.color.arg_RES_7f061fbb));
          paint = tu.getPaint();
          a.o(paint, "paint");
          paint.setFakeBoldText(b);
          tu = this.t;
          if (tu == null) {
             a.S("mActionBtnContainer");
          }
          tu.setBackgroundResource(R.drawable.arg_RES_7f0801b6);
       }else {
          tu = this.u;
          if (tu == null) {
             a.S(str);
          }
          paint = tu.getPaint();
          a.o(paint, "mActionBtn.paint");
          paint.setFakeBoldText(b);
          tu = this.u;
          if (tu == null) {
             a.S(str);
          }
          tu.setText(a1.p(R.string.arg_RES_7f103ac5));
       }
       return;
    }
    public void doBindView(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, PymkRecommendContactPresenter.class, "2")) {
          return;
       }
       a.p(p0, "view");
       view = m1.f(p0, R.id.name);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.name\)");
       this.r = view;
       view = m1.f(p0, R.id.text);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.text\)");
       this.s = view;
       view = m1.f(p0, R.id.avatar);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.avatar\)");
       this.q = view;
       view = m1.f(p0, R.id.follow_button);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.follow_button\)");
       this.t = view;
       view = m1.f(p0, R.id.follow_text);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.follow_text\)");
       this.u = view;
       PymkRecommendContactPresenter tt = this.t;
       if (tt == null) {
          a.S("mActionBtnContainer");
       }
       tt.setOnClickListener(new PymkRecommendContactPresenter$b(this));
       p0.setOnClickListener(new PymkRecommendContactPresenter$c(this));
       m1.b(p0, new PymkRecommendContactPresenter$d(this), R.id.close);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, PymkRecommendContactPresenter.class, "3")) {
          return;
       }
       Object obj = this.q8(RecoUser.class);
       a.o(obj, "inject\(RecoUser::class.java\)");
       this.v = obj;
       obj = this.r8("PYMK_ACCESS_IDSITEM_CLICK_LISTENER");
       a.o(obj, "inject\(PymkAccessIds.ITEM_CLICK_LISTENER\)");
       this.w = obj;
       this.x = this.t8("PYMK_ADAPTER");
       return;
    }
}

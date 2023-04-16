package com.yxcorp.gifshow.profile.presenter.profile.header.recommend.PymkRecommendInfoEditPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.PymkRecommendInfoEditPresenter$mEventListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.RecoUser;
import z5c.y1;
import java.lang.Integer;
import k2b.f3;
import lnc.i3;
import java.lang.Number;
import com.yxcorp.gifshow.pymk.PymkGuideCard;
import java.lang.CharSequence;
import android.widget.TextView;
import android.text.TextPaint;
import zf6.k;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ub.b;
import com.yxcorp.image.callercontext.a;
import wb5.g;
import com.kuaishou.krn.event.a;
import oj0.a;
import crd.b;
import lnc.b9;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import android.view.View;
import zf6.j;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.PymkRecommendInfoEditPresenter$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.PymkRecommendInfoEditPresenter$b;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.PymkRecommendInfoEditPresenter$c;
import com.yxcorp.gifshow.widget.m;
import android.content.Context;
import com.yxcorp.gifshow.util.rx.RxBus;
import cx5.e;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import u4c.h;
import erd.g;
import eda.q;
import u4c.i;
import tkd.b;
import tkd.d;
import gx5.c;
import f7c.c;
import y8c.g;

public final class PymkRecommendInfoEditPresenter extends PresenterV2	// class@001525
{
    public final p A;
    public final int B;
    public KwaiImageView p;
    public View q;
    public TextView r;
    public TextView s;
    public TextView t;
    public RecoUser u;
    public c v;
    public g w;
    public PymkGuideCard x;
    public b y;
    public b z;

    public void PymkRecommendInfoEditPresenter(int p0){
       super();
       this.B = p0;
       this.A = s.c(PymkRecommendInfoEditPresenter$mEventListener$2.INSTANCE);
    }
    public void E8(){
       PymkRecommendInfoEditPresenter pymkRecommen = PymkRecommendInfoEditPresenter.class;
       if (PatchProxy.applyVoid(null, this, pymkRecommen, "4")) {
          return;
       }
       PymkRecommendInfoEditPresenter tu = this.u;
       if (tu == null) {
          a.S("mRecoUser");
       }
       RecoUser mPymkGuideCa = tu.mPymkGuideCard;
       this.x = mPymkGuideCa;
       if (mPymkGuideCa != null) {
          PymkRecommendInfoEditPresenter tB = this.B;
          y1 oy1 = y1.class;
          if (!PatchProxy.isSupport(oy1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(tB), null, oy1, "153")) {
             f3 uof3 = f3.j("PROFILE_FILL_CARD");
             i3 oi3 = i3.f();
             oi3.c("portal", Integer.valueOf(tB));
             uof3.m(oi3.e());
             uof3.g();
          }
          tB = this.s;
          String str = "mTitle";
          if (tB == null) {
             a.S(str);
          }
          tB.setText(mPymkGuideCa.mTitle);
          tB = this.s;
          if (tB == null) {
             a.S(str);
          }
          TextPaint paint = tB.getPaint();
          a.o(paint, "mTitle.paint");
          paint.setFakeBoldText(true);
          tB = this.t;
          if (tB == null) {
             a.S("mSubTitle");
          }
          tB.setText(mPymkGuideCa.mSubTitle);
          if (!PatchProxy.applyVoid(null, this, pymkRecommen, "8")) {
             pymkRecommen = this.x;
             if (pymkRecommen != null) {
                String str1 = "mAvatarView";
                if (k.d() && !TextUtils.x(pymkRecommen.mDarkHeadUrl)) {
                   tu = this.p;
                   if (tu == null) {
                      a.S(str1);
                   }
                   g.g(tu, pymkRecommen.mDarkHeadUrl, HeadImageSize.ADJUST_BIG, null, null);
                }else if(!TextUtils.x(pymkRecommen.mHeadUrl)){
                   tu = this.p;
                   if (tu == null) {
                      a.S(str1);
                   }
                   g.g(tu, pymkRecommen.mHeadUrl, HeadImageSize.ADJUST_BIG, null, null);
                }
             }
          }
          this.R8();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, PymkRecommendInfoEditPresenter.class, "5")) {
          return;
       }
       a.b().c("KRNSocialProfileRefreshEvent", this.P8());
       b[] uobArray = new b[]{this.y,this.z};
       b9.b(uobArray);
       return;
    }
    public final a P8(){
       Object obj = PatchProxy.apply(null, this, PymkRecommendInfoEditPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.A.getValue();
    }
    public final void R8(){
       TextPaint paint;
       if (PatchProxy.applyVoid(null, this, PymkRecommendInfoEditPresenter.class, "7")) {
          return;
       }
       PymkRecommendInfoEditPresenter tx = this.x;
       if (tx != null) {
          boolean b = true;
          if (tx.mIsNameEmpty == null && tx.mIsHeadEmpty == null) {
             tx = this.r;
             if (tx == null) {
                a.S("mActionBtn");
             }
             tx.setText(a1.p(R.string.arg_RES_7f103c4e));
             tx = this.r;
             if (tx == null) {
                a.S("mActionBtn");
             }
             paint = tx.getPaint();
             a.o(paint, "mActionBtn.paint");
             paint.setFakeBoldText(b);
             tx = this.r;
             if (tx == null) {
                a.S("mActionBtn");
             }
             PymkRecommendInfoEditPresenter tr = this.r;
             if (tr == null) {
                a.S("mActionBtn");
             }
             tx.setTextColor(j.d(tr, R.color.arg_RES_7f061fbb));
             tx = this.q;
             if (tx == null) {
                a.S("mActionBtnContainer");
             }
             tx.setBackgroundResource(R.drawable.arg_RES_7f0801b6);
          }else {
             tx = this.r;
             if (tx == null) {
                a.S("mActionBtn");
             }
             paint = tx.getPaint();
             a.o(paint, "mActionBtn.paint");
             paint.setFakeBoldText(b);
             tx = this.r;
             if (tx == null) {
                a.S("mActionBtn");
             }
             tx.setText(a1.p(R.string.arg_RES_7f100912));
          }
       }
       return;
    }
    public void doBindView(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, PymkRecommendInfoEditPresenter.class, "2")) {
          return;
       }
       a.p(p0, "view");
       view = m1.f(p0, R.id.name);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.name\)");
       this.s = view;
       view = m1.f(p0, R.id.text);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.text\)");
       this.t = view;
       view = m1.f(p0, R.id.avatar);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.avatar\)");
       this.p = view;
       view = m1.f(p0, R.id.follow_button);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.follow_button\)");
       this.q = view;
       view = m1.f(p0, R.id.follow_text);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.follow_text\)");
       this.r = view;
       PymkRecommendInfoEditPresenter tq = this.q;
       if (tq == null) {
          a.S("mActionBtnContainer");
       }
       tq.setOnClickListener(new PymkRecommendInfoEditPresenter$a(this));
       p0.setOnClickListener(new PymkRecommendInfoEditPresenter$b(this));
       m1.b(p0, new PymkRecommendInfoEditPresenter$c(this), R.id.close);
       return;
    }
    public final void j6(){
       PymkRecommendInfoEditPresenter pymkRecommen = PymkRecommendInfoEditPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, pymkRecommen, "6")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, pymkRecommen, "9")) {
          Context context = this.getContext();
          if (context != null) {
             a.o(context, "context ?: return");
             PymkRecommendInfoEditPresenter tx = this.x;
             if (tx != null && (tx.mIsNameEmpty != null || tx.mIsHeadEmpty != null)) {
                b[] uobArray = new b[]{this.y,this.z};
                b9.b(uobArray);
                if (tx.mIsHeadEmpty != null) {
                   this.y = RxBus.f.g(e.class, RxBus$ThreadMode.MAIN).subscribe(new h(this));
                }
                if (tx.mIsNameEmpty != null) {
                   a.b().a("KRNSocialProfileRefreshEvent", this.P8());
                   this.z = RxBus.f.g(q.class, RxBus$ThreadMode.MAIN).subscribe(new i(this));
                }
                d.a(0x763547f8).Sf(context, tx, this.B);
             }
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, PymkRecommendInfoEditPresenter.class, "3")) {
          return;
       }
       Object obj = this.q8(RecoUser.class);
       a.o(obj, "inject\(RecoUser::class.java\)");
       this.u = obj;
       obj = this.r8("PYMK_ACCESS_IDSITEM_CLICK_LISTENER");
       a.o(obj, "inject\(PymkAccessIds.ITEM_CLICK_LISTENER\)");
       this.v = obj;
       this.w = this.t8("PYMK_ADAPTER");
       return;
    }
}

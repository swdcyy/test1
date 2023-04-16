package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.e$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.animation.AnimatorSet;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.e$a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.AvatarWithLiving;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import android.graphics.drawable.Drawable;
import lnc.a1;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import yl8.b;
import y8c.d;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.d;
import erd.o;
import t45.d;
import brd.z;
import o6a.e;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import crd.b;
import android.view.View;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.f;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.g;
import lu7.f;
import rnc.i;
import android.text.Spanned;
import android.text.Html;
import com.kwai.framework.model.user.MerchantCardEntity$CouponDetail;
import com.kwai.framework.model.user.MerchantCardEntity$GoodsDetail;
import o56.a;
import android.content.Context;
import android.graphics.Typeface;
import ekd.d0;
import k6a.g;
import java.lang.Integer;
import com.yxcorp.utility.n;
import o6a.l;
import o6a.k;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import uw9.o;
import java.lang.Exception;
import q87.c;
import androidx.fragment.app.FragmentActivity;
import android.net.Uri;
import ekd.x0;
import wkd.b;
import nf6.i;
import android.content.Intent;
import android.app.Activity;
import tkd.b;
import tkd.d;
import vs3.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import android.animation.ObjectAnimator;
import o6a.d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import com.kwai.robust.PatchProxyResult;
import android.content.res.Resources;
import brd.y;
import ekd.m1;
import android.text.TextPaint;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class e$a extends PresenterV2	// class@00179e
{
    public View A;
    public TextView B;
    public KwaiImageView[] C;
    public View D;
    public View E;
    public TextView F;
    public TextView G;
    public View H;
    public KwaiImageView I;
    public TextView J;
    public TextView K;
    public TextView L;
    public SlidePlayViewModel M;
    public AnimatorSet N;
    public a O;
    public int P;
    public User p;
    public d q;
    public y r;
    public BaseFragment s;
    public l t;
    public AvatarWithLiving u;
    public TextView v;
    public TextView w;
    public TextView x;
    public TextView y;
    public TextView z;

    public void e$a(){
       super();
       this.N = new AnimatorSet();
       this.O = new e$a$a(this);
    }
    public void E8(){
       int i;
       User mTagDesc;
       e$a tv;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, e$a.class, "3")) {
          return;
       }
       e$a tp = this.p;
       boolean b = false;
       if (tp.mGoodsDetail != null) {
          i = 1;
       }else if(tp.mCouponDetail != null){
          i = 2;
       }else {
          i = 0;
       }
       this.P = i;
       String str = "9";
       if (!PatchProxy.applyVoidWithListener(objArray, this, e$a.class, str)) {
          if (this.p.mIsLiving != null) {
             this.u.b();
          }else {
             this.u.c();
          }
          g.l(this.u.getMAvatarView(), this.p, HeadImageSize.MIDDLE, a1.f(R.drawable.arg_RES_7f0819bd));
          PatchProxy.onMethodExit(e$a.class, str);
       }
       this.V8(this.p, b);
       this.p.b();
       this.p.mPosition = this.q.get();
       tp = this.y;
       int i1 = (TextUtils.isEmpty(this.p.mTagDesc))? 8: 0;
       tp.setVisibility(i1);
       str = "8";
       if (!PatchProxy.applyVoidWithListener(objArray, this, e$a.class, str)) {
          Fragment parentFragme = this.s.getParentFragment();
          if (parentFragme != null) {
             SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(parentFragme);
             this.M = slidePlayVie;
             slidePlayVie.P(this.s, this.O);
          }
          this.X7(this.p.observable().distinctUntilChanged(d.b).observeOn(d.a).subscribe(new e(this), e.b));
          View view = this.m8();
          if (view != null) {
             view.setOnClickListener(new f(this));
          }
          tv = this.A;
          if (tv != null) {
             tv.setOnClickListener(new g(this));
          }
          PatchProxy.onMethodExit(e$a.class, str);
       }
       str = "5";
       if (!PatchProxy.applyVoidWithListener(objArray, this, e$a.class, str)) {
          tv = this.v;
          if (tv != null) {
             tv.setText(i.j(f.a(this.p)));
          }
          tv = this.w;
          if (tv != null) {
             tv.setText(this.p.mTitleLabel);
          }
          this.P8(30);
          PatchProxy.onMethodExit(e$a.class, str);
       }
       str = "4";
       if (!PatchProxy.applyVoidWithListener(objArray, this, e$a.class, str)) {
          if (this.y != null) {
             mTagDesc = this.p.mTagDesc;
             if (TextUtils.isEmpty(mTagDesc)) {
                this.y.setVisibility(8);
             }else {
                this.y.setVisibility(b);
                this.y.setText(Html.fromHtml(mTagDesc));
             }
          }
          mTagDesc = this.p.mCouponDetail;
          if (mTagDesc != null) {
             this.E.setVisibility(b);
             this.F.setText(mTagDesc.mCouponName);
             this.G.setText(mTagDesc.mCouponDesc);
             this.P8(20);
          }else {
             this.E.setVisibility(8);
          }
          mTagDesc = this.p.mGoodsDetail;
          if (mTagDesc != null) {
             this.y.setVisibility(8);
             this.H.setVisibility(b);
             this.J.setText(mTagDesc.mName);
             this.K.setText(mTagDesc.mPrice);
             this.L.setText(mTagDesc.mLabel);
             this.I.L(mTagDesc.mImageUrl);
             Typeface typeface = d0.a("alte-din.ttf", a.B);
             if (typeface != null) {
                this.K.setTypeface(typeface);
             }
             this.P8(14);
          }else {
             this.H.setVisibility(8);
          }
          PatchProxy.onMethodExit(e$a.class, str);
       }
       e$a ts = this.s;
       if (ts instanceof g && ts.V()) {
          this.R8();
       }
       PatchProxy.onMethodExit(e$a.class, "3");
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, e$a.class, "11")) {
          return;
       }
       e$a tu = this.u;
       if (tu != null) {
          tu.c();
       }
       PatchProxy.onMethodExit(e$a.class, "11");
       return;
    }
    public final void P8(int p0){
       if (PatchProxy.isSupport2(e$a.class, "6") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, e$a.class, "6")) {
          return;
       }
       Context context = this.getContext();
       if (context == null) {
          PatchProxy.onMethodExit(e$a.class, "6");
          return;
       }else {
          e$a tv = this.v;
          if (tv != null) {
             tv.setPadding(0, n.c(context, (float)p0), 0, 0);
          }
          PatchProxy.onMethodExit(e$a.class, "6");
          return;
       }
    }
    public void R8(){
       if (PatchProxy.applyVoidWithListener(null, this, e$a.class, "10")) {
          return;
       }
       e$a tp = this.p;
       e$a ts = this.s;
       int i = this.t.a();
       if (!PatchProxy.isSupport2(k.class, "3") || !PatchProxy.applyVoidThreeRefsWithListener(tp, ts, Integer.valueOf(i), null, k.class, "3")) {
          try{
             if (tp == null || ("empty").equals(tp.mId)) {
                PatchProxy.onMethodExit(k.class, "3");
             }else {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "USER_RECO_CARD";
                i3 oi3 = i3.f();
                oi3.d("live_id", tp.mLiveStreamId);
                oi3.d("user_id", tp.mId);
                oi3.c("type", Integer.valueOf(i));
                uElementPack.params = oi3.e();
                u1.D0(null, ts, 3, uElementPack, null, null);
             }
          }catch(java.lang.Exception e1){
             Object[] objArray = new Object[0];
             o.C().t("MerchantRecommendUserLoggerV2", e1.toString(), objArray);
          }
          PatchProxy.onMethodExit(k.class, "3");
       }
       PatchProxy.onMethodExit(e$a.class, "10");
       return;
    }
    public void S8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, e$a.class, "16")) {
          return;
       }
       if (this.p == null) {
          PatchProxy.onMethodExit(e$a.class, "16");
          return;
       }else {
          e$a ts = this.s;
          FragmentActivity activity = (ts != null)? ts.getActivity(): objArray;
          if (activity == null) {
             PatchProxy.onMethodExit(e$a.class, "16");
             return;
          }else {
             e$a tp = this.p;
             if (tp.mIsLiving != null) {
                activity.startActivity(b.a(0x66dce92a).a(activity, x0.f(tp.mLiveStreamJumperUrl)));
             }else {
                d.a(0x7074b578).rj(activity, tp.mshopLink, objArray);
             }
             PatchProxy.onMethodExit(e$a.class, "16");
             return;
          }
       }
    }
    public final void V8(User p0,boolean p1){
       String str;
       if (PatchProxy.isSupport2(e$a.class, "12") && PatchProxy.applyVoidTwoRefsWithListener(p0, Boolean.valueOf(p1), this, e$a.class, "12")) {
          return;
       }
       e$a tN = this.N;
       if (tN != null) {
          tN.cancel();
       }
       PatchProxyResult patchProxyRe = 1;
       if (this.t.a() == patchProxyRe) {
          this.W8(this.B, R.string.arg_RES_7f103422);
          PatchProxy.onMethodExit(e$a.class, "12");
          return;
       }else if(this.t.a() == 3){
          this.W8(this.B, R.string.arg_RES_7f103421);
          PatchProxy.onMethodExit(e$a.class, "12");
          return;
       }else {
          int i = 2;
          Object[] objArray = null;
          if (!QCurrentUser.ME.isLogined() || !p0.isFollowingOrFollowRequesting()) {
             e$a tz = this.z;
             str = "13";
             Object[] objArray1 = PatchProxy.applyWithListener(objArray, this, e$a.class, str);
             if (objArray1 != PatchProxyResult.class) {
             }else if(this.P == i){
                User mCouponDetai = this.p.mCouponDetail;
                if (mCouponDetai != null) {
                   objArray = mCouponDetai.mButtonName;
                }
             }
             objArray1 = (objArray == null || objArray.isEmpty())? a1.m().getString(R.string.arg_RES_7f100f8f): objArray;
             PatchProxy.onMethodExit(e$a.class, str);
             this.X8(tz, objArray1);
          }else if(p1){
             String str1 = "alpha";
             str = "20";
             if (!PatchProxy.applyVoidWithListener(objArray, this, e$a.class, str)) {
                try{
                   this.B.setText(R.string.arg_RES_7f103421);
                   float[] uofloatArray = new float[i];
                   uofloatArray[0] = 0x3f800000;
                   uofloatArray[patchProxyRe] = 0;
                   float[] uofloatArray1 = new float[i];
                   uofloatArray1[0] = 0;
                   uofloatArray1[patchProxyRe] = 0x3f800000;
                   ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.B, str1, uofloatArray1);
                   objectAnimat.addUpdateListener(new d(this));
                   this.N.setDuration(300);
                   this.N.play(ObjectAnimator.ofFloat(this.z, str1, uofloatArray)).before(objectAnimat);
                   this.N.start();
                   k.c(this.p, 3, this.s);
                }catch(java.lang.Exception e0){
                   this.W8(this.B, R.string.arg_RES_7f103421);
                }
                PatchProxy.onMethodExit(e0, str);
             }
          }else {
             this.W8(this.z, R.string.arg_RES_7f103421);
          }
          this.r.onNext(Boolean.TRUE);
          PatchProxy.onMethodExit(e$a.class, "12");
          return;
       }
    }
    public final void W8(TextView p0,int p1){
       if (PatchProxy.isSupport2(e$a.class, "14") && PatchProxy.applyVoidTwoRefsWithListener(p0, Integer.valueOf(p1), this, e$a.class, "14")) {
          return;
       }
       this.X8(p0, a1.m().getString(p1));
       PatchProxy.onMethodExit(e$a.class, "14");
       return;
    }
    public final void X8(TextView p0,String p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, e$a.class, "15")) {
          return;
       }
       p0.setText(p1);
       p0.setAlpha(0x3f800000);
       e$a tB = this.B;
       int i = 0;
       int i1 = 4;
       if (p0 == tB) {
          this.z.setVisibility(i1);
          this.B.setVisibility(i);
          e$a tp = this.p;
          if (this.t.a() != 1) {
             i1 = 3;
          }
          k.c(tp, i1, this.s);
       }else {
          tB.setVisibility(i1);
          this.z.setVisibility(i);
          k.c(this.p, 2, this.s);
       }
       PatchProxy.onMethodExit(e$a.class, "15");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, e$a.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a037c);
       this.v = m1.f(p0, 0x7f0a4381);
       this.w = m1.f(p0, 0x7f0a42d5);
       this.v.getPaint().setFakeBoldText(true);
       this.x = m1.f(p0, 0x7f0a41ad);
       this.y = m1.f(p0, 0x7f0a42ba);
       TextView textView = m1.f(p0, R.id.follow_text);
       this.z = textView;
       textView.getPaint().setFakeBoldText(true);
       this.A = m1.f(p0, 0x7f0a0f4c);
       textView = m1.f(p0, R.id.enter_live_text);
       this.B = textView;
       textView.getPaint().setFakeBoldText(true);
       KwaiImageView[] kwaiImageVie = new KwaiImageView[]{m1.f(p0, 0x7f0a0dd7),m1.f(p0, 0x7f0a0dd8),m1.f(p0, 0x7f0a0dd9)};
       this.C = kwaiImageVie;
       this.D = m1.f(p0, 0x7f0a0dda);
       this.E = m1.f(p0, 0x7f0a09bb);
       this.F = m1.f(p0, 0x7f0a4135);
       this.G = m1.f(p0, 0x7f0a4134);
       this.H = m1.f(p0, 0x7f0a10e1);
       this.I = m1.f(p0, 0x7f0a10e3);
       this.J = m1.f(p0, 0x7f0a10e7);
       this.K = m1.f(p0, 0x7f0a10e8);
       this.L = m1.f(p0, 0x7f0a10e5);
       PatchProxy.onMethodExit(e$a.class, "2");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, e$a.class, "1")) {
          return;
       }
       this.p = this.q8(User.class);
       this.q = this.r8("ADAPTER_POSITION_GETTER");
       this.r = this.r8("FOLLOW_STATUS_CHANGE");
       this.s = this.q8(BaseFragment.class);
       this.t = this.q8(l.class);
       PatchProxy.onMethodExit(e$a.class, "1");
       return;
    }
}

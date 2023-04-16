package com.kwai.component.photo.reduce.o;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z8c.a;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$l;
import com.kwai.component.photo.reduce.o$b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.List;
import g9c.a;
import com.yxcorp.gifshow.entity.QPhoto;
import ag5.c;
import m01.a;
import android.view.View$OnClickListener;
import android.view.View;
import android.animation.ValueAnimator;
import android.animation.AnimatorSet;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback$NegativeReason;
import com.kuaishou.android.model.mix.QRecoTag;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import jga.f$a;
import com.kwai.framework.model.user.User;
import java.lang.StringBuilder;
import jga.c;
import com.kwai.framework.model.feed.BaseFeed;
import wca.b;
import jga.f;
import java.lang.Boolean;
import java.util.HashMap;
import ag5.a;
import lc5.b;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import brd.t;
import cg5.c;
import crd.b;
import u07.t$a;
import yf5.o2;
import u07.u;
import yf5.n2;
import u07.f;
import yf5.i2;
import java.lang.Runnable;
import yf5.p2;
import sfc.a;
import erd.g;
import org.greenrobot.eventbus.a;
import cda.i;
import kp.r1;
import yf5.q2;
import com.kwai.framework.logger.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.e0;
import brd.x;
import cjd.e;
import erd.o;
import yf5.r2;
import wkd.b;
import l66.a;
import dda.i;
import m66.a;
import com.kwai.component.photo.reduce.i$b;
import com.yxcorp.gifshow.events.realaction.RealAction$ExtParams;
import gda.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.action.c;
import com.kwai.library.widget.popup.common.c;
import cda.e;
import java.lang.Integer;
import com.yxcorp.utility.n;
import yf5.h2;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import yf5.t2;
import android.animation.Animator$AnimatorListener;
import java.lang.Float;
import yf5.j2;
import yf5.u2;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import android.animation.Animator;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.reco.FeedMiscPojo;
import e17.i$b;
import e17.i;
import com.kwai.library.widget.popup.common.f;
import ekd.m1;
import android.widget.TextView;
import yf5.k2;
import yf5.m2;
import yf5.l2;
import androidx.fragment.app.Fragment;

public class o extends PresenterV2	// class@000b00
{
    public View$OnClickListener A;
    public i$b B;
    public c C;
    public List D;
    public String E;
    public GifshowActivity F;
    public Fragment G;
    public FeedNegativeFeedback$NegativeReason H;
    public o$b I;
    public o$a J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public AnimatorSet S;
    public ValueAnimator T;
    public ValueAnimator U;
    public final float p;
    public final long q;
    public final int r;
    public View s;
    public RecyclerView t;
    public View u;
    public RecyclerView v;
    public TextView w;
    public TextView x;
    public QPhoto y;
    public int z;

    public void o(boolean p0,boolean p1){
       super();
       this.p = 2.00f;
       this.q = 300;
       this.r = a1.e(50.50f);
       this.N = p0;
       this.O = p1;
    }
    public void o(boolean p0,boolean p1,boolean p2,boolean p3){
       super();
       this.p = 2.00f;
       this.q = 300;
       this.r = a1.e(50.50f);
       this.K = p0;
       this.L = p1;
       this.M = p2;
       this.O = p3;
    }
    public void E8(){
       o oo = o.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oo, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oo, "5")) {
          a uoa = new a();
          uoa.p(false);
          uoa.q(false);
          Resources resources = this.l8();
          int i = (this.K != null)? 0x7f080685: 0x7f081e25;
          uoa.o(resources.getDrawable(i));
          this.t.setLayoutManager(new LinearLayoutManager(this.getContext()));
          this.t.addItemDecoration(uoa);
          this.t.setItemAnimator(objArray);
          o$b uob = new o$b(this);
          this.I = uob;
          this.t.setAdapter(uob);
          this.v.setLayoutManager(new LinearLayoutManager(this.getContext()));
          this.v.addItemDecoration(uoa);
          this.v.setItemAnimator(objArray);
          this.I.W0(this.D);
       }
       c.h(this.y, this.D, false, objArray);
       this.s.setOnClickListener(a.b);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, o.class, "4")) {
          return;
       }
       this.P8();
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, o.class, "20")) {
          return;
       }
       o tT = this.T;
       if (tT != null) {
          tT.removeAllListeners();
       }
       tT = this.U;
       if (tT != null) {
          tT.removeAllListeners();
       }
       tT = this.S;
       if (tT != null) {
          tT.cancel();
       }
       return;
    }
    public void R8(View p0,FeedNegativeFeedback$NegativeReason p1,QRecoTag p2){
       String this;
       o oo4;
       o oo5;
       FeedNegativeFeedback$NegativeReason negativeReas1;
       String str3;
       String str4;
       String str5;
       HashMap hashMap;
       FeedNegativeFeedback$NegativeReason negativeReas2;
       boolean b1;
       FeedNegativeFeedback$NegativeReason negativeReas3;
       QRecoTag qRecoTag1;
       a uoa1;
       QPhoto mEntity;
       QRecoTag qRecoTag2;
       o f;
       o oo = this;
       FeedNegativeFeedback$NegativeReason negativeReas = p1;
       QRecoTag qRecoTag = p2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       o oo1 = o.class;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, o.class, "7")) {
          return;
       }
       o e = (!TextUtils.x(oo.E))? oo.E: this.getActivity().getUrl();
       o oo2 = e;
       int i = 1;
       int b = false;
       String str = (oo.M != null && negativeReas.mCategory == i)? 1: null;
       String str1 = "3";
       int i1 = (oo.L != null && TextUtils.n(negativeReas.mId, str1))? 1: 0;
       o oo3 = (oo.N != null && (TextUtils.n(negativeReas.mId, str1) || TextUtils.n(negativeReas.mId, "6")))? 1: null;
       Object[] objArray = null;
       User user = PatchProxy.apply(objArray, oo, oo1, "9");
       if (user != patchProxyRe) {
       }else {
          user = oo.y.getUser();
       }
       f$a uoa = new f$a(user, this.getActivity().Q2());
       uoa.o(oo2+"#unfollow");
       uoa.c(oo.y.getFullSource());
       uoa.q(b);
       c uoc = PatchProxy.apply(objArray, oo, oo1, "10");
       if (uoc != patchProxyRe) {
       }else {
          uoc = b.b(2, oo.y.mEntity);
       }
       uoa.i(uoc);
       f uof = uoa.b();
       String str2 = "ReducePopupPresenter";
       this = "clickReduceReason";
       FeedNegativeFeedback$NegativeReason mId = negativeReas.mId;
       o m = oo.M;
       e = oo.N;
       o l = oo.L;
       if (PatchProxy.isSupport(oo1)) {
          oo4 = e;
          oo5 = m;
          negativeReas1 = mId;
          str3 = this;
          str4 = str2;
          str5 = str1;
          hashMap = PatchProxy.applyFourRefs(mId, Boolean.valueOf(m), Boolean.valueOf(e), Boolean.valueOf(l), this, o.class, "11");
          if (hashMap != patchProxyRe) {
          }else {
          label_011b :
             hashMap = new HashMap();
             hashMap.put("reason", negativeReas1);
             String str7 = "page";
             if (oo5 != null) {
                hashMap.put(str7, "acquaintance");
             }else if(oo4 != null){
                hashMap.put(str7, "frequentUser");
             }else if(l != null){
                hashMap.put(str7, "follow");
             }
          }
       }else {
          oo4 = e;
          oo5 = m;
          negativeReas1 = mId;
          str3 = this;
          str4 = str2;
          str5 = str1;
          goto label_011b ;
       }
       if (!PatchProxy.applyVoidThreeRefs(str4, str3, hashMap, null, a.class, "4")) {
          String[] stringArray = new String[]{"HomeFollow","followReduce",str4};
          b.g(str3, hashMap, stringArray);
       }
       int i2 = 0x6d2a4fdd;
       if (i1 || str) {
          oo3 = oo2;
          int o this1 = qRecoTag;
          negativeReas2 = negativeReas;
          b1 = false;
          FollowHelper.l(uof);
          if (str) {
             negativeReas3 = negativeReas2;
             qRecoTag1 = this1;
             c.i("acquaintance", oo.y, oo.z, p1, p2, oo3).subscribe();
          }else {
             negativeReas3 = negativeReas2;
             qRecoTag1 = this1;
             boolean b2 = true;
          }
          if (i1) {
             uoa1 = b.a(i2);
             mEntity = oo.y.mEntity;
             this = TextUtils.I(negativeReas3.mId);
             this1 = oo.F;
             this1 = (this1 != null)? this1.getPage(): 0;
             uoa1.b(new i(mEntity, this, this1, true));
          }
       }else if(oo3 != null){
          if (TextUtils.n(negativeReas.mId, str5)) {
             FollowHelper.l(uof);
             c.i("frequentUser", oo.y, oo.z, p1, p2, oo2).subscribe();
          }else {
             t$a uoa2 = new t$a(this.getActivity());
             uoa2.z0(a1.p(R.string.arg_RES_7f1038e0));
             uoa2.T0(a1.p(R.string.arg_RES_7f1007e2));
             uoa2.R0(a1.p(R.string.cancel));
             uoa2.u0(new o2(oo, negativeReas, qRecoTag, oo2));
             uoa2.t0(new n2(oo, negativeReas));
             this.m8().postDelayed(new i2(oo, f.e(uoa2)), 200);
          }
          qRecoTag1 = qRecoTag;
          negativeReas3 = negativeReas;
          b1 = false;
       }else if(oo.M != null){
          c.i("acquaintance", oo.y, oo.z, p1, p2, oo2).subscribe(new p2(oo, negativeReas), new a());
          qRecoTag1 = (TextUtils.n(negativeReas.mId, "2002") || TextUtils.n(negativeReas.mId, "2004"))? 0: 1;
          a.d().k(new i(oo.y.isLiveStream(), r1.t1(oo.y.mEntity), negativeReas.mId, oo.y.getUserId()));
          qRecoTag2 = qRecoTag;
          negativeReas2 = negativeReas;
          b1 = false;
       }else if(oo.N != null){
          c.i("frequentUser", oo.y, oo.z, p1, p2, oo2).subscribe(new q2(oo, negativeReas), new a());
          qRecoTag2 = qRecoTag;
          negativeReas2 = negativeReas;
          b1 = false;
       }else {
          b1 = false;
          e = oo1;
          PatchProxyResult patchProxyRe1 = patchProxyRe;
          qRecoTag2 = qRecoTag;
          negativeReas2 = negativeReas;
          t ot = c.h(oo.y, oo.z, null, p1, p2, null, oo2, "COVER");
          ClientEvent$ElementPackage uElementPack = PatchProxy.apply(null, oo, e, "21");
          if (uElementPack != patchProxyRe1) {
          }else {
             uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "PHOTO_REDUCE_RESULT";
          }
          Object obj = uElementPack;
          ClientContent$ContentPackage uContentPack = PatchProxy.apply(null, oo, e, "22");
          if (uContentPack != patchProxyRe1) {
          }else {
             uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(oo.y.getEntity());
          }
          a uoa3 = new a("PHOTO_REDUCE_RESULT", obj, uContentPack, null, oo.y.getFeedLogCtx());
          ot.compose(negativeReas).map(new e()).subscribe(new r2(oo, negativeReas2, qRecoTag2), new a());
       }
       qRecoTag1 = 1;
       uoa1 = b.a(i2);
       mEntity = oo.y.mEntity;
       String str6 = TextUtils.I(negativeReas2.mId);
       f = oo.F;
       b = (f != null)? f.getPage(): 0;
       uoa1.b(new i(mEntity, str6, b));
       if (qRecoTag1) {
          e = oo.A;
          View view = p0;
          if (e != null) {
             e.onClick(view);
          }
          e = oo.B;
          if (e != null) {
             e.a(view, negativeReas2, qRecoTag2);
          }
       }
       negativeReas3 = negativeReas2;
       qRecoTag1 = qRecoTag2;
       RealAction$ExtParams uExtParams = RealAction$ExtParams.newInstance();
       uExtParams.mNegativeType = a.b(negativeReas3.mId, oo.y.mEntity);
       if (qRecoTag1 != null) {
          uExtParams.mNegativeDetailType = qRecoTag1.mId;
       }
       m = oo.G;
       if (m instanceof BaseFragment && !TextUtils.x(m.o())) {
          c.f(oo.G.o(), 9, oo.y.mEntity, oo.G.o(), uExtParams);
       }else {
          c.b(9, oo.y.mEntity, uExtParams);
       }
       oo.C.q(4);
       if (oo.K != null) {
          a.d().k(new e(oo.y.getPhotoId(), b1, negativeReas3, qRecoTag1));
       }
       return;
    }
    public final void S8(int p0,int p1,boolean p2){
       ValueAnimator valueAnimato;
       ValueAnimator valueAnimato1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(o.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, o.class, "15")) {
          return;
       }
       this.P8();
       View[] viewArray = new View[]{this.u};
       n.Z(0, viewArray);
       if (PatchProxy.isSupport(o.class)) {
          valueAnimato = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, o.class, "16");
          if (valueAnimato != patchProxyRe) {
          label_0069 :
             this.T = valueAnimato;
             float f = 0;
             float f1 = (p2)? (float)(- this.P): 0;
             if (!p2) {
                f = (float)(- this.P);
             }
             if (PatchProxy.isSupport(o.class)) {
                valueAnimato1 = PatchProxy.applyTwoRefs(Float.valueOf(f1), Float.valueOf(f), this, o.class, "18");
                if (valueAnimato1 != patchProxyRe) {
                label_00b5 :
                   this.U = valueAnimato1;
                   AnimatorSet uAnimatorSet = new AnimatorSet();
                   this.S = uAnimatorSet;
                   uAnimatorSet.setInterpolator(new DecelerateInterpolator(2.00f));
                   this.S.setDuration(300);
                   Animator[] uAnimatorArr = new Animator[]{this.T,this.U};
                   this.S.playTogether(uAnimatorArr);
                   this.S.start();
                   return;
                }
             }
             this.W8(this.t, this.u, f1);
             float[] uofloatArray = new float[]{f1,f};
             valueAnimato1 = ValueAnimator.ofFloat(uofloatArray);
             valueAnimato1.addUpdateListener(new j2(this));
             valueAnimato1.addListener(new u2(this, f));
             goto label_00b5 ;
          }
       }
       this.V8(this.s, p0);
       int[] ointArray = new int[]{p0,p1};
       valueAnimato = ValueAnimator.ofInt(ointArray);
       valueAnimato.addUpdateListener(new h2(this));
       valueAnimato.addListener(new t2(this, p1));
       goto label_0069 ;
    }
    public void V8(View p0,int p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oo, "17")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.height = p1;
       p0.setLayoutParams(layoutParams);
       return;
    }
    public void W8(View p0,View p1,float p2){
       if (PatchProxy.isSupport(o.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Float.valueOf(p2), this, o.class, "19")) {
          return;
       }
       p0.setTranslationX(p2);
       p1.setTranslationX((p2 + (float)this.P));
       return;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, o.class, "8")) {
          return;
       }
       if (!FeedMiscPojo.isFeedRecommendEnabled()) {
          i$b uob = i.m();
          uob.y(f.o(R.string.arg_RES_7f100a62));
          i.z(uob);
       }else {
          i.a(R.style.arg_RES_7f11066a, 0x7f100a61);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "2")) {
          return;
       }
       this.w = m1.f(p0, 0x7f0a3690);
       this.x = m1.f(p0, 0x7f0a2d8c);
       this.v = m1.f(p0, 0x7f0a37f3);
       this.s = m1.f(p0, 0x7f0a0b73);
       this.t = m1.f(p0, 0x7f0a0ec7);
       this.u = m1.f(p0, 0x7f0a37f6);
       m1.a(p0, new k2(this), R.id.cancel_button);
       m1.a(p0, new m2(this), R.id.roast);
       m1.a(p0, new l2(this), R.id.back_iv);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       this.y = this.q8(QPhoto.class);
       this.z = this.r8("SOURCE").intValue();
       this.A = this.s8(View$OnClickListener.class);
       this.B = this.s8(i$b.class);
       this.C = this.r8("PHOTO_REDUCE_POPUP");
       this.D = this.r8("PHOTO_REDUCE_REASONS");
       this.E = this.t8("PHOTO_REDUCE_REFERER");
       this.F = this.t8("PHOTO_REDUCE_ACTIVITY");
       this.G = this.t8("PHOTO_REDUCE_FRAGMENT");
       return;
    }
}

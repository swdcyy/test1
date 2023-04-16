package com.kuaishou.merchant.interpretation.presenter.b;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.UUID;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import brd.t;
import t45.d;
import brd.z;
import m04.g;
import erd.g;
import crd.b;
import com.kuaishou.merchant.interpretation.presenter.b$a;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.kuaishou.merchant.interpretation.presenter.b$b;
import android.view.View;
import com.kuaishou.merchant.interpretation.presenter.b$c;
import com.kuaishou.merchant.interpretation.presenter.b$d;
import com.kuaishou.merchant.api.core.model.Commodity$ExtraInfo;
import com.kuaishou.merchant.api.core.model.Commodity;
import android.view.animation.Animation;
import com.kuaishou.merchant.interpretation.model.MerchantInterpretationInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Boolean;
import android.widget.TextView;
import k2b.e0;
import h04.a;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.QCurrentUser;
import o56.a;
import android.app.Application;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import com.kwai.feature.api.social.login.model.LoginParams;
import m04.d;
import android.content.Context;
import n3d.a;
import m04.i;
import com.kuaishou.merchant.interpretation.presenter.a;
import com.kwai.framework.model.user.User;
import com.kuaishou.merchant.interpretation.model.SliceCommodityBubbleModel$SellerInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import jga.f$a;
import fka.e;
import jga.f;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import com.kuaishou.merchant.basic.util.f;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$CommodityDetailPackage;
import com.google.gson.JsonObject;
import java.util.List;
import r74.e;
import r74.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import h04.c;
import q87.c;
import com.kuaishou.merchant.api.core.model.Commodity$IconLabel;
import com.kuaishou.merchant.basic.util.d;
import m04.f;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import lnc.a1;
import ot3.p0;
import android.view.animation.AnimationUtils;
import com.kuaishou.merchant.interpretation.presenter.b$e;
import l04.b;
import l04.a;
import brd.x;
import com.kuaishou.merchant.basic.fragment.MerchantBaseFragment;
import m04.e;
import cjd.e;
import erd.o;
import m04.j;
import m04.h;
import ekd.m1;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import m04.b;
import m04.c;
import m04.a;
import com.kwai.robust.PatchProxyResult;
import m04.o;
import java.util.Map;
import java.util.HashMap;

public class b extends PresenterV2 implements g	// class@001858
{
    public KwaiImageView A;
    public TextView B;
    public TextView C;
    public TextView D;
    public TextView E;
    public View F;
    public View G;
    public View H;
    public View I;
    public View J;
    public Animation K;
    public Animation L;
    public FrameLayout M;
    public h N;
    public ViewGroup O;
    public JsonElement P;
    public String Q;
    public MerchantInterpretationInfo R;
    public Commodity S;
    public SliceCommodityBubbleModel$ItemInfo T;
    public SliceCommodityBubbleModel$SellerInfo U;
    public String V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public MerchantBaseFragment p;
    public KwaiImageView q;
    public TextView r;
    public TextView s;
    public TextView t;
    public TextView u;
    public View v;
    public View w;
    public View x;
    public View y;
    public View z;

    public void b(){
       super();
       this.Q = "MerchantInterpretationPlayerJSTONative"+UUID.randomUUID().toString();
       this.W = false;
       this.X = false;
       this.Y = false;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.X7(RxBus.f.f(n.class).observeOn(d.a).subscribe(new g(this)));
       this.W = false;
       this.A.setOnClickListener(new b$a(this));
       this.F.setOnClickListener(new b$b(this));
       this.G.setOnClickListener(new b$c(this));
       this.H.setOnClickListener(new b$d(this));
       if (this.S.getExtraInfo().mSaleType == 2) {
          return;
       }
       this.X8();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       this.W = false;
       this.X = false;
       this.Y = false;
       this.V = "";
       b tK = this.K;
       if (tK != null) {
          tK.cancel();
       }
       tK = this.L;
       if (tK != null) {
          tK.cancel();
       }
       return;
    }
    public final void P8(){
       boolean b;
       b uob = b.class;
       if (PatchProxy.applyVoid(null, this, uob, "10")) {
          return;
       }
       int i = 0;
       b = (this.R.entranceType == 3 || !TextUtils.isEmpty(this.V))? true: false;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uob, "11")) {
          int i1 = 8;
          if (this.X != null) {
             this.F.setVisibility(i1);
             uob = this.G;
             if (!b) {
                i = 8;
             }
             uob.setVisibility(i);
             this.G.setClickable(b);
          }else {
             this.G.setVisibility(i1);
             uob = this.D;
             int i2 = (b)? 0: 8;
             uob.setVisibility(i2);
             uob = this.F;
             if (!b) {
                i = 8;
             }
             uob.setVisibility(i);
             this.F.setClickable(b);
          }
          if (b) {
             uob = this.R;
             a.d(uob.liveStreamId, uob.sellerId, uob.serverExpTag, this.V, this.S, this.p, "MERCHANT_TO_WATCH_LIVE", 3);
          }
       }
       return;
    }
    public void R8(){
       a b;
       if (PatchProxy.applyVoid(null, this, b.class, "14")) {
          return;
       }
       GifshowActivity activity = this.getActivity();
       if (!QCurrentUser.ME.isLogined()) {
          LoginParams$a uoa = new LoginParams$a();
          uoa.d(a.B.getString(R.string.arg_RES_7f103077));
          LoginParams loginParams = uoa.a();
          d.a(-1712118428).x00(activity, 14, loginParams, new d(this));
          return;
       }else {
          i oi = new i(this);
          b = a.b;
          if (this.U != null) {
             b tU = this.U;
             User user = new User(tU.mSellerId, tU.mNickName, tU.mSellerSex, "", null);
             f$a uoa1 = new f$a(v3, activity.Q2());
             uoa1.o(activity.getUrl());
             uoa1.l(e.a().c(0));
             uoa1.q(0);
             f uof = uoa1.b();
             if (this.Y != null) {
                FollowHelper.l(uof);
             }else {
                FollowHelper.d(uof, oi, b);
             }
          }
          return;
       }
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, b.class, "7")) {
          return;
       }
       b tR = this.R;
       a.c(tR.liveStreamId, tR.sellerId, tR.serverExpTag, this.V, this.S, this.p, "MERCHANT_TO_WATCH_LIVE", 3);
       if (this.R.entranceType != 3 && !TextUtils.isEmpty(this.V)) {
          f.e(this.getActivity(), this.V);
       }else {
          this.getActivity().finish();
       }
       return;
    }
    public void V8(View p0){
       ClientContent$ContentPackage uContentPack;
       Object obj = this;
       a uoa = a.class;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, obj, uob, "19")) {
          return;
       }
       b r = obj.R;
       MerchantInterpretationInfo liveStreamId = r.liveStreamId;
       MerchantInterpretationInfo sellerId = r.sellerId;
       MerchantInterpretationInfo serverExpTag = r.serverExpTag;
       b v = obj.V;
       b s = obj.S;
       b p = obj.p;
       int i = 6;
       int i1 = 2;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[i];
          objArray[0] = liveStreamId;
          objArray[1] = sellerId;
          objArray[i1] = serverExpTag;
          objArray[3] = v;
          objArray[4] = s;
          objArray[5] = p;
          if (PatchProxy.applyVoid(objArray, null, uoa, "1")) {
          label_0063 :
             r = obj.R;
             liveStreamId = r.liveStreamId;
             sellerId = r.sellerId;
             serverExpTag = r.serverExpTag;
             v = obj.V;
             s = obj.S;
             p = obj.p;
             if (PatchProxy.isSupport(uoa)) {
                objArray = new Object[i];
                objArray[0] = liveStreamId;
                objArray[1] = sellerId;
                objArray[2] = serverExpTag;
                objArray[3] = v;
                objArray[4] = s;
                objArray[5] = p;
                if (PatchProxy.applyVoid(objArray, null, uoa, "4")) {
                label_00af :
                   MerchantInterpretationInfo entranceType = obj.R.entranceType;
                   if (entranceType != null && (entranceType != 1 && entranceType != 2)) {
                      if (entranceType == 3 || (entranceType == 4 || (entranceType == 5 && !PatchProxy.applyVoid(null, obj, uob, "20")))) {
                         if (TextUtils.isEmpty(obj.S.mJumpUrl)) {
                            Object[] objArray1 = new Object[0];
                            c.C().w("MerchantInterpretationBubblePresenter", "mInterpretationInfo.jumpUrl is null", objArray1);
                         }else {
                            f.e(this.getActivity(), obj.S.mJumpUrl);
                         }
                      }
                   }else {
                      this.getActivity().finish();
                   }
                   return;
                }
             }
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "ITEM_CARD";
             uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = a.b(liveStreamId, sellerId, serverExpTag, v);
             uContentPack.commodityDetailPackage = a.a(s);
             u1.L("", p, 1, uElementPack, uContentPack);
             goto label_00af ;
          }
       }
       uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = a.b(liveStreamId, sellerId, serverExpTag, v);
       uContentPack.commodityDetailPackage = a.a(s);
       a.d(e.c("EXPLANATION_PLAYBACK", "ITEM_CARD", uContentPack, null), p);
       goto label_0063 ;
    }
    public final void W8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "21")) {
          return;
       }
       int i = 8;
       int i1 = 0;
       if (this.X != null) {
          this.I.setVisibility(i1);
          this.E.setVisibility(i);
       }else {
          this.I.setVisibility(i);
          this.E.setVisibility(i1);
       }
       b uob = (!TextUtils.isEmpty(this.S.mTitle) && (!TextUtils.isEmpty(this.S.mJumpUrl) && !TextUtils.isEmpty(this.S.mDisplayPrice)))? 1: null;
       if (!uob) {
          this.w.setVisibility(i);
          return;
       }else {
          this.w.setVisibility(i1);
          Commodity mExtraInfo = this.S.mExtraInfo;
          if (mExtraInfo != null) {
             objArray = mExtraInfo.mMidIconList2;
          }
          this.X7(d.g(objArray).subscribe(new f(this)));
          uob = this.r;
          Commodity mTitle = this.S.mTitle;
          if (mTitle == null) {
             mTitle = "";
          }
          uob.setText(mTitle);
          if (!q.f(this.S.mImageUrls)) {
             this.q.P(this.S.mImageUrls);
          }
          if (!TextUtils.isEmpty(this.S.mDisplayPrice)) {
             this.t.setText(p0.e(this.S.mDisplayPrice, a1.d(R.dimen.arg_RES_7f070f6e), a1.d(R.dimen.arg_RES_7f070f71)));
          }
          uob = this.R;
          a.d(uob.liveStreamId, uob.sellerId, uob.serverExpTag, this.V, this.S, this.p, "MERCHANT_ITEM_CARD", 3);
          this.K = AnimationUtils.loadAnimation(this.getContext(), 0x7f0100b2);
          this.L = AnimationUtils.loadAnimation(this.getContext(), 0x7f0100b3);
          this.y.setOnClickListener(new b$e(this));
          return;
       }
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, b.class, "9")) {
          return;
       }
       b tR = this.R;
       this.X7(a.a().a(this.S.mId, tR.sellerId, 2, tR.liveStreamId, tR.entranceType, tR.mPayload, tR.channel).compose(this.p.eh()).doOnNext(new e(this)).map(new e()).subscribe(new j(this), new h(this)));
       return;
    }
    public final void Y8(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "16")) {
          return;
       }
       this.Y = p0;
       this.C.setSelected(p0);
       if (p0) {
          this.C.setText(a1.p(R.string.arg_RES_7f101034));
       }else {
          this.C.setText(a1.p(R.string.arg_RES_7f100f8f));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.M = m1.f(p0, 0x7f0a103d);
       this.w = m1.f(p0, 0x7f0a0594);
       this.z = m1.f(p0, 0x7f0a3101);
       this.q = m1.f(p0, 0x7f0a134d);
       this.r = m1.f(p0, 0x7f0a2d1e);
       this.s = m1.f(p0, 0x7f0a3d2e);
       this.t = m1.f(p0, 0x7f0a3214);
       this.u = m1.f(p0, 0x7f0a058d);
       this.v = m1.f(p0, 0x7f0a059c);
       this.x = m1.f(p0, 0x7f0a435d);
       this.A = m1.f(p0, 0x7f0a0333);
       this.B = m1.f(p0, 0x7f0a4381);
       this.C = m1.f(p0, 0x7f0a0f40);
       this.y = m1.f(p0, 0x7f0a2b3a);
       this.D = m1.f(p0, 0x7f0a1a66);
       this.F = m1.f(p0, 0x7f0a1a67);
       this.G = m1.f(p0, 0x7f0a0395);
       this.H = m1.f(p0, 0x7f0a3643);
       this.E = m1.f(p0, 0x7f0a3f7b);
       this.I = m1.f(p0, 0x7f0a455d);
       this.J = m1.f(p0, 0x7f0a3b47);
       m1.a(p0, new b(this), R.id.close_bubble);
       m1.a(p0, new c(this), R.id.live_shop_and_see);
       m1.a(p0, new a(this), R.id.bubble_layout);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new o();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b.class, new o());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.r8("MERCHANT_FRAGMENT");
       this.R = this.q8(MerchantInterpretationInfo.class);
       this.S = this.q8(Commodity.class);
       return;
    }
}

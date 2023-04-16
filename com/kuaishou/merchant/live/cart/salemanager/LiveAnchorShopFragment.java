package com.kuaishou.merchant.live.cart.salemanager.LiveAnchorShopFragment;
import hka.a;
import com.kuaishou.merchant.basic.fragment.MerchantRecycleFragment;
import a24.a;
import java.lang.String;
import com.kwai.sdk.switchconfig.a;
import mrd.a;
import com.kuaishou.merchant.live.cart.salemanager.LiveAnchorShopFragment$b;
import com.kuaishou.merchant.live.cart.salemanager.LiveAnchorShopFragment$a;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.kuaishou.merchant.api.core.model.MerchantInfo;
import fs3.c$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import android.os.Parcelable;
import org.parceler.b;
import androidx.fragment.app.Fragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import s54.b1;
import s54.x;
import s54.p;
import s54.f1;
import y8c.t;
import com.kuaishou.merchant.live.cart.salemanager.g;
import android.view.animation.Animation;
import java.util.Objects;
import android.os.SystemClock;
import qvb.i;
import java.lang.Boolean;
import brd.y;
import android.view.View;
import com.kuaishou.merchant.live.cart.salemanager.b;
import android.view.View$OnClickListener;
import androidx.fragment.app.FragmentActivity;
import android.content.Context;
import ekd.i;
import android.app.Activity;
import qvb.n0;
import java.util.List;
import qvb.a;
import qvb.o;
import java.util.Map;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.utility.TextUtils;
import js3.a;
import r54.a;
import o54.a;
import com.kuaishou.merchant.live.cart.salemanager.model.ExcellentCommodityInfo;
import java.util.Iterator;
import com.kuaishou.merchant.api.core.model.AnchorNeedCallBackendTool;
import com.kuaishou.merchant.live.cart.salemanager.model.LiveAnchorToolsInfo$LiveAnchorTool;
import java.lang.Integer;
import java.util.HashMap;
import r54.b;
import androidx.fragment.app.c;
import o54.d;
import z1.k;
import ot3.c;
import w24.a;
import q87.c;
import java.lang.CharSequence;
import t54.d;
import us3.f;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import crd.b;
import lnc.b9;
import ekd.k1;
import androidx.recyclerview.widget.RecyclerView;
import ekd.m1;
import y8c.g;
import com.kuaishou.merchant.live.cart.salemanager.a;

public class LiveAnchorShopFragment extends MerchantRecycleFragment implements a	// class@0019cf
{
    public int I;
    public a J;
    public boolean K;
    public final c L;
    public LiveAnchorShopFragment$b M;
    public LiveAnchorShopFragment$a N;
    public boolean O;
    public b P;
    public static final int Q;

    public void LiveAnchorShopFragment(){
       super();
       this.I = 0;
       this.J = new a(this.C1());
       this.K = a.t().d("enableMerchantFirstPageSizeOpSwitch", 0);
       this.L = a.g();
       this.M = new LiveAnchorShopFragment$b();
       this.N = new LiveAnchorShopFragment$a(this);
       this.O = false;
    }
    public static LiveAnchorShopFragment Nh(LiveMerchantBaseContext p0,MerchantInfo p1,c$a p2,String p3){
       Bundle obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, LiveAnchorShopFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Bundle();
       obj.putParcelable("KEY_LIVE_BASE_CONTEXT", b.c(p0));
       obj.putParcelable("KEY_MERCHANT_INFO", b.c(p1));
       obj.putString("KEY_SOURCE", p3);
       LiveAnchorShopFragment liveAnchorSh = new LiveAnchorShopFragment();
       liveAnchorSh.setArguments(obj);
       p1.d = p2;
       return liveAnchorSh;
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, LiveAnchorShopFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new b1());
       obj.U7(new x());
       obj.U7(new p());
       obj.U7(new f1());
       PatchProxy.onMethodExit(LiveAnchorShopFragment.class, "16");
       return obj;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, LiveAnchorShopFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new g(this, this.M);
    }
    public String C1(){
       return "MERCHANT_ANCHOR_SALE_MANAGER";
    }
    public String D1(){
       return "主播选择售卖商品页面";
    }
    public void Ih(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorShopFragment.class, "13")) {
          return;
       }
       LiveAnchorShopFragment tJ = this.J;
       Objects.requireNonNull(tJ);
       if (!PatchProxy.applyVoid(null, tJ, a.class, "7") && tJ.b - null > 0) {
          tJ.h = SystemClock.elapsedRealtime() - tJ.b;
       }
       if (!PatchProxy.applyVoid(null, this, LiveAnchorShopFragment.class, "14")) {
          this.q().o.onNext(Boolean.TRUE);
       }
       return;
    }
    public void Jh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAnchorShopFragment.class, "10")) {
          return;
       }
       p0.setOnClickListener(b.b);
       i.b(this.getActivity(), p0);
       i.a(this.getActivity(), -1, true);
       return;
    }
    public void Kh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAnchorShopFragment.class, "9")) {
          return;
       }
       LiveAnchorShopFragment tJ = this.J;
       Objects.requireNonNull(tJ);
       if (!PatchProxy.applyVoid(objArray, tJ, a.class, "6") && tJ.b - null > 0) {
          tJ.g = SystemClock.elapsedRealtime() - tJ.d;
       }
       return;
    }
    public void Lh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAnchorShopFragment.class, "8")) {
          return;
       }
       LiveAnchorShopFragment tJ = this.J;
       Objects.requireNonNull(tJ);
       if (!PatchProxy.applyVoid(objArray, tJ, a.class, "5") && tJ.b > 0) {
          tJ.d = SystemClock.elapsedRealtime();
       }
       return;
    }
    public int M(){
       return 5;
    }
    public void Mh(){
       if (PatchProxy.applyVoid(null, this, LiveAnchorShopFragment.class, "5")) {
          return;
       }
       LiveAnchorShopFragment tN = this.N;
       if (tN != null) {
          tN.a();
       }
       return;
    }
    public boolean S1(){
       return false;
    }
    public List fg(){
       List obj = PatchProxy.apply(null, this, LiveAnchorShopFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.fg();
       obj.add(this.M);
       return obj;
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAnchorShopFragment.class, "11")) {
          return;
       }
       super.fh(p0, p1);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, LiveAnchorShopFragment.class, "12")) {
          LiveAnchorShopFragment tN = this.N;
          if (tN == null || (!PatchProxy.applyVoid(objArray, tN, LiveAnchorShopFragment$a.class, "2") && tN.isLoading())) {
             a c = tN.c;
             boolean b = tN.K();
             boolean b1 = (tN.K() && tN.E1())? true: false;
             c.N0(b, b1);
          }
       label_0047 :
          this.L.onNext(Boolean.TRUE);
       }
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d04d8;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAnchorShopFragment.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveAnchorShopFragment.class, null);
       return objectsByTag;
    }
    public int getPage(){
       return 99;
    }
    public String getPageParams(){
       JsonObject obj = PatchProxy.apply(null, this, LiveAnchorShopFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       String str = (this.M.c())? "1": "2";
       obj.c0("source_channel", str);
       str = (this.M.d())? "TRUE": "FALSE";
       obj.c0("is_trust", str);
       return obj.toString();
    }
    public String o(){
       return "MY_SHOP";
    }
    public void onAttach(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorShopFragment.class, "2")) {
          return;
       }
       super.onAttach(p0);
       if (!PatchProxy.applyVoid(null, this, LiveAnchorShopFragment.class, "4")) {
          p0.e = b.a(this.getArguments().getParcelable("KEY_LIVE_BASE_CONTEXT"));
          p0.j = TextUtils.k(this.getArguments().getString("KEY_SOURCE"));
          MerchantInfo merchantInfo = b.a(this.getArguments().getParcelable("KEY_MERCHANT_INFO"));
          if (merchantInfo != null) {
             LiveAnchorShopFragment tM = this.M;
             tM.g.d = merchantInfo.mIsSandeagoOpen;
             tM.h.d = merchantInfo.mIsAuctionOpen;
             if (tM.c()) {
                this.M.c.i(merchantInfo.mChosenCommodities);
             }
             LiveAnchorShopFragment$b m = this.M.m;
             m.mModuleType = merchantInfo.mModuleType;
             m.mBrandUserId = merchantInfo.mBrandUserId;
             m.mType = merchantInfo.mType;
             Iterator iterator = merchantInfo.mAnchorNeedCallBackendTools.iterator();
             while (iterator.hasNext()) {
                AnchorNeedCallBackendTool uAnchorNeedC = iterator.next();
                LiveAnchorToolsInfo$LiveAnchorTool liveAnchorTo = new LiveAnchorToolsInfo$LiveAnchorTool();
                liveAnchorTo.mSwitchOpen = uAnchorNeedC.switchOpen;
                this.M.o.put(Integer.valueOf(uAnchorNeedC.type), liveAnchorTo);
             }
             m = this.M.v;
             m.a = merchantInfo.mLivePlanId;
             m.b = merchantInfo.mLivePlanBindStatus;
          }
          merchantInfo.c = this.N;
       }
       this.Mh();
       return;
    }
    public boolean onBackPressed(){
       Object[] obj = PatchProxy.apply(null, this, LiveAnchorShopFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.isAdded()) {
          return true;
       }
       this.I = 0;
       c uoc = c.a(this.getChildFragmentManager(), new d(this));
       if (uoc != null && uoc.getBackStackEntryCount() > 0) {
          return uoc.popBackStackImmediate();
       }
    }
    public void onCreate(Bundle p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorShopFragment.class, "3")) {
          return;
       }
       LiveAnchorShopFragment tJ = this.J;
       Objects.requireNonNull(tJ);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tJ, uoa, "1")) {
          tJ.b = SystemClock.elapsedRealtime();
       }
       super.onCreate(p0);
       if (!PatchProxy.applyVoid(objArray, this, LiveAnchorShopFragment.class, "6") && (this.M.e != null && this.getArguments() != null)) {
          String str = "ROUTER_URL";
          if (!TextUtils.x(this.getArguments().getString(str))) {
             String str1 = this.getArguments().getString(str);
             String liveAuthorId = this.M.e.getLiveAuthorId();
             String str2 = this.M.b();
             if (!PatchProxy.applyVoidFourRefs(this, str1, liveAuthorId, str2, null, d.class, "1")) {
                d.c(this, str1, liveAuthorId, str2, null, null);
             }
             this.getArguments().putString(str, "");
          }
       }
       LiveAnchorShopFragment tJ1 = this.J;
       Objects.requireNonNull(tJ1);
       if (!PatchProxy.applyVoid(objArray, tJ1, uoa, "2") && tJ1.b - null > 0) {
          tJ1.e = SystemClock.elapsedRealtime() - tJ1.b;
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       a uoa = a.class;
       LiveAnchorShopFragment obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveAnchorShopFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.J;
       Objects.requireNonNull(obj);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, obj, uoa, "3") && obj.b > 0) {
          obj.c = SystemClock.elapsedRealtime();
       }
       View view = super.onCreateView(p0, p1, p2);
       LiveAnchorShopFragment tJ = this.J;
       Objects.requireNonNull(tJ);
       if (!PatchProxy.applyVoid(objArray, tJ, uoa, "4") && tJ.b > 0) {
          tJ.f = SystemClock.elapsedRealtime() - tJ.c;
       }
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LiveAnchorShopFragment.class, "19")) {
          return;
       }
       super.onDestroy();
       if (this.getActivity() != null) {
          i.a(this.getActivity(), 0, 0);
       }
       this.O = false;
       b9.a(this.P);
       k1.n(this);
       return;
    }
    public void th(){
       if (PatchProxy.applyVoid(null, this, LiveAnchorShopFragment.class, "24")) {
          return;
       }
       super.th();
       this.M.s = this.h0();
       this.M.u = m1.f(this.getView(), 0x7f0a01fe);
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, LiveAnchorShopFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this.M, this.getContext());
    }
    public i yh(){
       return this.N;
    }
}

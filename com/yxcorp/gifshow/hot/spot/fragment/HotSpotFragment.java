package com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment;
import eb5.g;
import com.kwai.component.homepage_interface.homeitemfragment.HomeItemFragment;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment$a;
import nsd.u;
import com.kwai.component.feedstaggercard.model.CardStyle;
import com.yxcorp.gifshow.action.RealActionBizType;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment$cardList$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment$bigEventTKAdapter$2;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment$todayTitleAdapter$2;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment$todayListAdapter$2;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment$todayMoreAdapter$2;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment$todayTitleAdapterV2$2;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment$todayListAdapterV2$2;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment$todayListWrapperAdapterV2$2;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment$interestCardAdapter$2;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment$interestCardWrapperAdapter$2;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment$feedTitleAdapter$2;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment$concatAdapter$2;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment$concatAdapterV2$2;
import jva.g;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.kcube.TabIdentifier;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fva.i;
import on5.a;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.f;
import cb5.u;
import fva.j;
import com.yxcorp.gifshow.hot.spot.presenter.a;
import com.yxcorp.gifshow.hot.spot.presenter.BigEventBgPresenter;
import vua.a;
import hn5.n;
import hn5.m;
import cb5.c0;
import androidx.fragment.app.Fragment;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.HomeItemRecoRealShowPresenter;
import fva.l;
import com.yxcorp.gifshow.hot.spot.data.HotSpotFeedPageList;
import k2b.e0;
import q99.a;
import x99.o;
import brd.t;
import eb5.f;
import on5.b;
import wua.b;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import y99.i;
import com.yxcorp.gifshow.hot.spot.adapter.interest.InterestCardWrapperAdapter;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import lnc.a1;
import android.content.Context;
import com.kwai.written.view.IWrittenLayout;
import yua.a;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotExperimentUtils;
import g9c.d;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import crd.b;
import lnc.b9;
import as6.a;
import wq6.d;
import zq6.l;
import pn5.a;
import zq6.p;
import ln5.c;
import eva.a;
import io.reactivex.internal.functions.Functions;
import erd.g;
import java.lang.Exception;
import eva.h;
import java.util.Map;
import java.lang.StringBuilder;
import ro5.e0;
import com.yxcorp.gifshow.page.cost.RecyclerFragmentWithStageTrace;
import com.yxcorp.gifshow.model.LivePlayConfig;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import rx4.b;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import rx4.a;
import y8c.g;
import java.util.ArrayList;
import qrd.l1;
import wua.a;
import pa5.n;
import com.kwai.component.photo.reduce.f;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment$b;
import ha5.e;
import ab5.a;
import java.lang.Boolean;
import android.content.Intent;
import qvb.i;

public final class HotSpotFragment extends HomeItemFragment implements g	// class@00183e
{
    public final int R;
    public CardStyle S;
    public e T;
    public c U;
    public final p U0;
    public a V;
    public final p V0;
    public final p W;
    public final p W0;
    public final p X;
    public final p X0;
    public final p Y;
    public final p Y0;
    public final p Z;
    public final p Z0;
    public final p a1;
    public g b1;
    public b c1;
    public final p d1;
    public final p e1;
    public a f1;
    public static final HotSpotFragment$a g1;

    static {
       HotSpotFragment.g1 = new HotSpotFragment$a(null);
    }
    public void HotSpotFragment(){
       super();
       this.R = 1;
       this.S = CardStyle.CARD_V6;
       this.U = RealActionBizType.HOT_SPOT;
       this.W = s.c(HotSpotFragment$cardList$2.INSTANCE);
       this.X = s.c(new HotSpotFragment$bigEventTKAdapter$2(this));
       this.Y = s.c(new HotSpotFragment$todayTitleAdapter$2(this));
       this.Z = s.c(new HotSpotFragment$todayListAdapter$2(this));
       this.U0 = s.c(new HotSpotFragment$todayMoreAdapter$2(this));
       this.V0 = s.c(new HotSpotFragment$todayTitleAdapterV2$2(this));
       this.W0 = s.c(new HotSpotFragment$todayListAdapterV2$2(this));
       this.X0 = s.c(new HotSpotFragment$todayListWrapperAdapterV2$2(this));
       this.Y0 = s.c(new HotSpotFragment$interestCardAdapter$2(this));
       this.Z0 = s.c(new HotSpotFragment$interestCardWrapperAdapter$2(this));
       this.a1 = s.c(new HotSpotFragment$feedTitleAdapter$2(this));
       this.d1 = s.c(new HotSpotFragment$concatAdapter$2(this));
       this.e1 = s.c(new HotSpotFragment$concatAdapterV2$2(this));
    }
    public static final g Yh(HotSpotFragment p0){
       p0 = p0.b1;
       if (p0 == null) {
          a.S("foldView");
       }
       return p0;
    }
    public int Ab(){
       return 289;
    }
    public PresenterV2 Kh(TabIdentifier p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, HotSpotFragment.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "homeTabId");
       PatchProxy.onMethodExit(HotSpotFragment.class, "27");
       return new i(a.a(p0));
    }
    public PresenterV2 Lh(){
       Object obj = PatchProxy.applyWithListener(null, this, HotSpotFragment.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(HotSpotFragment.class, "28");
       return new f(false, false);
    }
    public PresenterV2 Mh(){
       u ou = PatchProxy.apply(null, this, HotSpotFragment.class, "34");
       if (ou != PatchProxyResult.class) {
       }else {
          ou = new u(true);
       }
       return ou;
    }
    public PresenterV2 Nh(){
       Object obj = PatchProxy.applyWithListener(null, this, HotSpotFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(HotSpotFragment.class, "22");
       return new j();
    }
    public void Oh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HotSpotFragment.class, "24")) {
          return;
       }
       super.Oh();
       this.I.U7(new a());
       this.I.U7(new BigEventBgPresenter(this.Zh()));
       this.I.U7(m.a().GW());
       this.I.U7(new c0(this));
       this.I.U7(new HomeItemRecoRealShowPresenter());
       HomeItemFragment tI = this.I;
       HotSpotFeedPageList hotSpotFeedP = this.ai();
       HotSpotFragment tb1 = this.b1;
       if (tb1 == null) {
          a.S("foldView");
       }
       tI.U7(new l(hotSpotFeedP, tb1, this));
       HotSpotFragment tV = this.V;
       if (tV != null) {
          if (tV != null) {
             objArray = tV.n;
          }
          if (objArray != null) {
             this.I.U7(new o());
          }
       }
       return;
    }
    public t Ra(){
       return f.b(this);
    }
    public TabIdentifier Ua(){
       TabIdentifier obj = PatchProxy.apply(null, this, HotSpotFragment.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.w;
       a.o(obj, "HomeTabIdentifier.HOT_SPOT");
       return obj;
    }
    public String X3(){
       String obj = PatchProxy.apply(null, this, HotSpotFragment.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.d(this.Ua());
       a.o(obj, "HomeTabIdConverter.identifierToTabTag\(homeTab\)");
       return obj;
    }
    public final a Zh(){
       Object obj = PatchProxy.apply(null, this, HotSpotFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.X.getValue();
    }
    public final HotSpotFeedPageList ai(){
       Object obj = PatchProxy.apply(null, this, HotSpotFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.W.getValue();
    }
    public final b bi(){
       Object obj = PatchProxy.apply(null, this, HotSpotFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a1.getValue();
    }
    public void c0(){
       if (PatchProxy.applyVoid(null, this, HotSpotFragment.class, "30")) {
          return;
       }
       super.c0();
       HotSpotFragment tV = this.V;
       if (tV != null) {
          a d = tV.d;
          if (d != null) {
             d.d(false);
          }
       }
       return;
    }
    public final InterestCardWrapperAdapter ci(){
       Object obj = PatchProxy.apply(null, this, HotSpotFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Z0.getValue();
    }
    public final a di(){
       return this.V;
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, HotSpotFragment.class, "17");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, this.getLayoutResId(), p1, false);
       View view1 = view.findViewById(R.id.refresh_layout);
       if (view1 != null) {
          view1.setBackgroundColor(a1.a(R.color.arg_RES_7f0617b3));
       }
       if (view instanceof ViewGroup) {
          View view2 = view;
          Context context = view2.getContext();
          a.o(context, "context");
          g og = new g(context);
          this.b1 = og;
          og.l1().setVisibility(8);
          HotSpotFragment tb1 = this.b1;
          if (tb1 == null) {
             a.S("foldView");
          }
          view2.addView(tb1.l1());
       }
       a.o(view, "view");
       return view;
    }
    public final a ei(){
       Object obj = PatchProxy.apply(null, this, HotSpotFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Z.getValue();
    }
    public int f(){
       return 289;
    }
    public void fh(View p0,Bundle p1){
       d uod;
       Object obj;
       p b;
       c uoc;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HotSpotFragment.class, "18")) {
          return;
       }
       a.p(p0, "view");
       super.fh(p0, p1);
       Object[] objArray = null;
       if (HotSpotExperimentUtils.a()) {
          uod = this.ia();
          obj = PatchProxy.apply(objArray, this, HotSpotFragment.class, "15");
          if (obj != patchProxyRe) {
          }else {
             obj = this.e1.getValue();
          }
          uod.N0(obj);
       }else {
          uod = this.ia();
          obj = PatchProxy.apply(objArray, this, HotSpotFragment.class, "14");
          if (obj != patchProxyRe) {
          }else {
             obj = this.d1.getValue();
          }
          uod.N0(obj);
       }
       try{
          this.ia().n1(true);
          if (!PatchProxy.applyVoid(objArray, this, HotSpotFragment.class, "19")) {
             b9.a(this.c1);
             TabIdentifier g = b.G;
             a.o(g, "HomeTabIdentifier.X_BLOCK");
             if (!a.c(this, g)) {
                g = b.F;
                a.o(g, "HomeTabIdentifier.BLOCK");
                if (!a.c(this, g)) {
                }
             }
             uod = a.e(this);
             if (uod != null) {
                l ol = uod.d0();
                if (ol != null) {
                   b = a.b;
                   a.o(b, "HomeBlockTopStateId.BLOCK_TAB_TRANSLATION_Y");
                   uoc = ol.a(b);
                label_00a4 :
                   if (uoc != null) {
                      t ot = uoc.b();
                      if (ot != null) {
                         objArray = ot.subscribe(new a(this), Functions.e);
                      }
                   }
                   this.c1 = objArray;
                }
             }
             uoc = objArray;
             goto label_00a4 ;
          }
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HotSpotFragment.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, HotSpotFragment.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(HotSpotFragment.class, new h());
       }else {
          obj.put(HotSpotFragment.class, null);
       }
       return obj;
    }
    public String getPageParams(){
       String obj = PatchProxy.apply(null, this, HotSpotFragment.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       e0.b(this, obj);
       obj = obj;
       a.o(obj, "sb.toString\(\)");
       return obj;
    }
    public boolean kf(){
       return f.a(this);
    }
    public String o(){
       return "HOT_SPOT_PAGE";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSpotFragment.class, "16")) {
          return;
       }
       super.onCreate(p0);
       this.S = CardStyle.CARD_V6;
       this.V = new a(this, FollowConfigUtil.o(), 3);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, HotSpotFragment.class, "35")) {
          b uob = new b(this.getActivity(), objArray, "FeedHotSpotsTemplate", "Feed");
          boolean b = true;
          uob.g(b);
          uob.e(0);
          a uoa = uob.b();
          this.f1 = uoa;
          if (uoa != null) {
             uoa.y(b);
          }
          uoa.f = this.f1;
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, HotSpotFragment.class, "20")) {
          return;
       }
       super.onDestroyView();
       HotSpotFragment tV = this.V;
       if (tV != null) {
          tV.a();
       }
       b9.a(this.c1);
       tV = this.f1;
       if (tV != null) {
          tV.onDestroy();
       }
       return;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, HotSpotFragment.class, "29")) {
          return;
       }
       super.u();
       HotSpotFragment tV = this.V;
       if (tV != null) {
          a d = tV.d;
          if (d != null) {
             d.d(true);
          }
       }
       return;
    }
    public g vh(){
       Boolean obj = PatchProxy.apply(null, this, HotSpotFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ArrayList uArrayList = new ArrayList();
       HotSpotFragment tV = this.V;
       a.m(tV);
       uArrayList.add(tV);
       a uoa = new a(this.ai(), uArrayList);
       uoa.x1(this.S);
       uoa.z1(new f(this));
       uoa.y1(new HotSpotFragment$b(uoa));
       uoa.n1("HOME_RECYCLE_VIEW_SCROLL_STATE", this.H.k);
       obj = Boolean.TRUE;
       uoa.n1("HOT_LIVE_CLICK_TO_SLIDE_PLAY", obj);
       uoa.n1("HOTSPOT_CLICK_TO_SLIDE_PLAY", obj);
       uoa.n1("PAGE_NAME", a1.p(R.string.arg_RES_7f104d99));
       uoa.n1("HOME_COVER_ENABLE_MIN_ASPECTIO", obj);
       uoa.n1("RECYCLERVIEW_LAYOUT_COMPLETE", Boolean.valueOf(this.H.l));
       return uoa;
    }
    public void y2(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSpotFragment.class, "33")) {
          return;
       }
       a.p(p0, "intent");
       return;
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, HotSpotFragment.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.ai();
    }
}

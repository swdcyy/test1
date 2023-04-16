package lz0.c;
import lz0.f;
import k51.c;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.o;
import bk2.e;
import lz0.c$a;
import bk2.e$a;
import lz0.c$b;
import lz0.c$c;
import lz0.c$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qk1.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import vg1.c;
import vg1.e;
import com.kuaishou.live.common.core.component.gift.gift.LiveGiftGridView;
import ia2.a;
import android.widget.LinearLayout;
import com.kuaishou.live.common.core.basic.widget.VerticalPageIndicator;
import mk1.w;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import com.kwai.library.widget.pageindicator.HorizontalPageIndicator;
import androidx.viewpager.widget.ViewPager$i;
import com.kuaishou.live.common.core.component.gift.gift.LiveGiftGridView$a;
import t02.a0;
import jk1.c;
import jk1.f;
import t45.d;
import brd.z;
import brd.t;
import lz0.b;
import erd.g;
import crd.b;
import android.view.View;
import mkc.c;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import ql1.d$b;
import java.lang.Integer;
import mkc.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import h3.a;
import ekd.m1;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftTitleView;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.widget.LiveGiftPanelItemView;
import com.yxcorp.gifshow.models.Gift;
import androidx.collection.ArrayMap;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.sort.LiveGiftSortType;
import java.util.Map;
import w91.a;
import lp3.c;
import lp3.i;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;
import mk1.b;
import k2b.e0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import ik1.a0;
import android.content.Context;
import android.view.ViewGroup;
import i2b.a;
import android.widget.TextView;
import lz0.c$e;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import om1.a;
import com.kuaishou.live.common.core.component.trace.gift.bean.LiveSendGiftTraceInfo;
import mm1.c;
import mm1.e;
import mm1.g;
import km1.b;
import java.util.List;
import com.kuaishou.android.live.log.b;
import mk1.h;
import d01.a;
import m01.m;
import mrd.c;
import java.lang.Throwable;
import xz6.d;
import java.util.Collection;
import ekd.q;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import lz0.a;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.StringBuilder;
import oy1.a;
import mk1.f;
import lnc.a1;
import com.kwai.library.widget.viewpager.GridViewPager;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.LiveProp;
import gl1.a;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import mk1.b0;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Enum;
import pp.c;
import java.lang.Math;
import android.widget.BaseAdapter;
import wh1.b;
import wh1.a;
import android.util.SparseArray;
import cl1.c;
import wk1.b;
import com.kwai.framework.model.user.QCurrentUser;

public abstract class c extends c implements f	// class@003085
{
    public m A;
    public b B;
    public c C;
    public boolean D;
    public d$b E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public c J;
    public boolean K;
    public o L;
    public final e M;
    public final ViewPager$l N;
    public final LiveGiftGridView$a O;
    public final c P;
    public LiveGiftTitleView p;
    public LiveGiftGridView q;
    public HorizontalPageIndicator r;
    public VerticalPageIndicator s;
    public View t;
    public View u;
    public h v;
    public a0 w;
    public i x;
    public a y;
    public a z;
    public static String sLivePresenterClassName = "LiveAudienceGiftBoxSimpleGiftPresenter";

    public void c(o p0){
       super();
       this.D = false;
       this.G = true;
       this.K = true;
       this.M = new e(new c$a(this));
       this.N = new c$b(this);
       this.O = new c$c(this);
       this.P = new c$d(this);
       this.L = p0;
    }
    public void E8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "3")) {
          return;
       }
       this.s9(this.X8().f());
       if (!PatchProxy.applyVoid(objArray, this, uoc, "13")) {
          if (y.d(this.getActivity())) {
             if (!PatchProxy.applyVoid(objArray, this, uoc, "14")) {
                this.S8().R(true);
                this.q.b(true);
                this.q.setRowNumber(2);
                if (a.c()) {
                   this.q.setColumnNumber(4);
                }else {
                   this.q.setColumnNumber(3);
                }
                this.q.setGiftItemAdapter(this.S8());
                this.r.setVisibility(8);
                if (this.q.getPageCount() > 1) {
                   this.s.setVisibility(0);
                }else {
                   this.s.setVisibility(4);
                }
                w.q(this.s, this.q.getCurrentPosition());
                if (this.q.getParent() instanceof RelativeLayout) {
                   RelativeLayout$LayoutParams layoutParams = this.q.getLayoutParams();
                   layoutParams.leftMargin = 0;
                   layoutParams.rightMargin = 0;
                   this.q.requestLayout();
                }
             }
          }else if(PatchProxy.applyVoid(objArray, this, uoc, "15")){
             this.S8().R(0);
             this.q.b(0);
             this.q.setRowNumber(2);
             this.q.setColumnNumber(4);
             this.q.setGiftItemAdapter(this.S8());
             this.s.setVisibility(8);
             if (this.q.getPageCount() > 1) {
                this.r.setVisibility(0);
             }else {
                this.r.setVisibility(4);
             }
             w.r(this.r, this.q.getCurrentPosition());
          }
          if (this.S8().z() >= 0) {
             this.q.setSelection(this.S8().z());
          }
       }
       if (!this.q.c()) {
          this.q.a(this.N);
       }else {
          this.q.setGiftGridRecyclerViewCallback(this.O);
       }
       this.w.x1.fl(this.P);
       this.X7(this.C.observeOn(d.a).subscribe(new b(this)));
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "5")) {
          return;
       }
       this.F = false;
       this.G = true;
       this.K = true;
       this.I = false;
       this.H = false;
       if (!this.q.c()) {
          this.q.d(this.N);
       }else {
          this.q.setGiftGridRecyclerViewCallback(objArray);
       }
       this.w.x1.ii(this.P);
       this.S8().M();
       return;
    }
    public void P3(){
       if (PatchProxy.applyVoid(null, this, c.class, "21")) {
          return;
       }
       c tu = this.u;
       if (tu == null) {
          return;
       }
       c.c(this.t, tu);
       return;
    }
    public void P8(GiftPanelItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "32")) {
          return;
       }
       c tE = this.E;
       if (tE != null) {
          tE.c(this.Y8(), p0);
       }
       return;
    }
    public void R8(GiftPanelItem p0,int p1,View p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, c.class, "31")) {
          return;
       }
       c tE = this.E;
       if (tE != null) {
          tE.g(this.Y8(), p0, p1, p2);
       }
       return;
    }
    public abstract c S8();
    public abstract int V8();
    public abstract String W8();
    public abstract a X8();
    public abstract GiftTab Y8();
    public abstract int Z8();
    public void a9(){
       if (PatchProxy.applyVoid(null, this, c.class, "8")) {
          return;
       }
       b[] uobArray = new b[]{b.i};
       c.d(this.t, uobArray);
       return;
    }
    public boolean b9(){
       Object obj = PatchProxy.apply(null, this, c.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.p.isSelected();
    }
    public abstract void c9();
    public void d9(){
       if (PatchProxy.applyVoid(null, this, c.class, "16")) {
          return;
       }
       if (this.q.getPagerAdapter() != null && this.q.getPagerAdapter().j() > 0) {
          this.M.c(this.q.getCurrentPosition(), null, false);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.p = m1.f(p0, this.Z8());
       LiveGiftPanelItemView liveGiftPane = m1.f(p0, this.V8());
       this.r = liveGiftPane.getHorizontalPageIndicator();
       this.s = liveGiftPane.getVerticalPageIndicator();
       this.q = liveGiftPane.getGridView();
       this.t = liveGiftPane.getTipsHostView();
       return;
    }
    public void e9(Gift p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "24")) {
          return;
       }
       ArrayMap uArrayMap = new ArrayMap();
       uArrayMap.put("type", Integer.valueOf(LiveGiftSortType.DEFAULT.getType()));
       uArrayMap.putAll(this.x.a(a.class).d6());
       uoc = this.w;
       a0.u(this.w.Z2.b(), this.w.Z2.a(), this.w.Z2.y(), uoc.c, p0, p1, uoc.B.getIndexInAdapter(), this.B.i(), this.q.getCurrentPosition(), this.W8(), uArrayMap);
       this.G = false;
       this.h9(this.B, p0, "CLIENT_GIFT_BOX_ITEM_CLICK", "[LiveAudienceGiftBoxSimpleGiftPresenter][logSelectGiftIfNeeded]gift click", 1);
       return;
    }
    public void f1(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "20")) {
          return;
       }
       if (this.u == null) {
          View view = a.i(new FrameLayout(this.getContext()), R.layout.arg_RES_7f0d161a);
          this.u = view;
          view.findViewById(R.id.login_btn).setOnClickListener(new c$e(this, p0));
       }
       c.i(this.t, this.u);
       return;
    }
    public void h9(b p0,Gift p1,String p2,String p3,int p4){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoc, "36")) {
             return;
          }
       }
       if (!this.x.b()) {
          LiveSendGiftTraceInfo liveSendGift = this.y.o6().D(p0);
          if (p1 != null) {
             liveSendGift.j(p1);
          }
          this.y.yk(liveSendGift).d(p2).f("PRE_SEND_GIFT").g(p4).e(p3).a();
       }else {
          b.P(b.a, "[LiveAudienceGiftBoxSimpleGiftPresenter][logTraceInfo]service manager cleared");
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.v = this.q8(h.class);
       this.w = this.q8(a0.class);
       i oi = this.r8("LIVE_SERVICE_MANAGER");
       this.x = oi;
       this.y = oi.a(a.class);
       this.z = this.q8(a.class);
       this.A = this.q8(m.class);
       this.B = this.q8(b.class);
       this.E = this.t8("LIVE_GIFT_PANEL_EVENT_SERVICE");
       this.C = this.r8("gift_tab_changed_subject");
       return;
    }
    public void j9(b p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, c.class, "35")) {
          return;
       }
       this.h9(p0, null, p1, p2, p3);
       return;
    }
    public void k9(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "30")) {
          return;
       }
       if (this.S8() != null) {
          c tE = this.E;
          if (tE != null) {
             tE.g(this.Y8(), this.S8().A(), this.S8().z(), this.S8().v());
          }
       }
       if (!this.q.c()) {
          this.d9();
       }
       a0.m(this.w.Z2.b(), this.w.Z2.a(), this.W8(), this.w.Z2.y(), this.B.i());
       this.j9(this.B, "CLIENT_GIFT_BOX_TAB_SHOW", "[LiveAudienceGiftBoxSimpleGiftPresenter][onGiftTabShown]show gift tab", 1);
       return;
    }
    public void l9(Throwable p0){
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "27")) {
          return;
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, "CLIENT_GIFT_BOX_REQUEST_TAB_DATA", this, uoc, "28")) {
          boolean b = false;
          this.D = b;
          b[] uobArray = new b[]{b.e};
          c.d(this.t, uobArray);
          if (q.f(this.S8().d())) {
             KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
             uoa.h(R.string.arg_RES_7f1038e5);
             uoa.p(new a(this));
             uoa.b();
             ExceptionHandler.handleUserNotLoginFirstTimeAlert(p0, c.e(this.t, b.g, uoa));
          }
          if (p0 instanceof KwaiException) {
             b = p0.mErrorCode;
          }
          c tB = this.B;
          String str = "[LiveAudienceGiftBoxSimpleGiftPresenter][onLoadGiftFailed]"+a.a(p0);
          if (b == null) {
             b = 0x30da5;
          }
          this.j9(tB, "CLIENT_GIFT_BOX_REQUEST_TAB_DATA", str, b);
       }
       return;
    }
    public void m9(){
       int i1;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "29")) {
          return;
       }
       this.L.b(this.X8(), this.Y8(), objArray, this.B);
       boolean b = false;
       this.D = b;
       this.F = true;
       int i = 2;
       if (w.b()) {
          b[] uobArray = new b[]{b.e,b.g,b.i};
          c.d(this.t, uobArray);
       }else {
          b[] uobArray1 = new b[i];
          uobArray1[b] = b.e;
          uobArray1[1] = b.g;
          c.d(this.t, uobArray1);
       }
       if (q.f(this.S8().d())) {
          if (!PatchProxy.applyVoid(objArray, this, uoc, "7")) {
             KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
             uoa.b();
             uoa.h(R.string.arg_RES_7f101425);
             uoa.k(R.drawable.arg_RES_7f081478);
             View view = c.e(this.t, b.i, uoa);
             if (view instanceof KwaiEmptyStateView) {
                TextView emptyDesc = view.getEmptyDesc();
                emptyDesc.setTextSize(true, 14.00f);
                emptyDesc.setTextColor(a1.a(R.color.arg_RES_7f060cd4));
             }
          }
          this.q.setGiftItemAdapter(this.S8());
       }
       GridViewPager pagerView = this.q.getPagerView();
       if (pagerView != null) {
          if (!y.d(this.getActivity())) {
             w.v(pagerView, this.r);
          }else {
             w.u(pagerView, this.s);
          }
       }
       List list = this.S8().d();
       if (!q.f(list)) {
          if (this.Y8() == GiftTab.PropsPanel) {
             LiveProp liveProp = this.v.E.k();
             Object obj = PatchProxy.applyTwoRefs(list, liveProp, objArray, w.class, "31");
             if (obj != PatchProxyResult.class) {
                i1 = obj.intValue();
             }else if(q.f(list) || liveProp == null){
                int i2 = 0;
                while (true) {
                   if (i2 < list.size()) {
                      GiftPanelItem mProp = list.get(i2).mProp;
                      if (mProp != null && TextUtils.equals(mProp.mPropId, liveProp.mPropId)) {
                         i1 = i2;
                         break ;
                      }else {
                         i2 = i2 + 1;
                      }
                   }
                }
             }
             i1 = -1;
          }else {
             i1 = w.n(list, this.X8().e()).a;
          }
          b.e0(LiveLogTag.GIFT, "[LiveAudienceGiftBoxSimpleGiftPresenter][GiftOpt][onLoadGiftSuccess]", "giftId", Integer.valueOf(this.X8().e()), "lastSelectGiftPanelItemIndex", Integer.valueOf(i1), "tab", this.Y8().name());
          this.S8().W(Math.max(i1, b), b);
          this.S8().notifyDataSetChanged();
       }
       this.j9(this.B, "CLIENT_GIFT_BOX_REQUEST_TAB_DATA", "[LiveAudienceGiftBoxSimpleGiftPresenter][onLoadGiftSuccess]load data success", true);
       return;
    }
    public void n9(){
    }
    public void o9(int p0,String p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "12")) {
          return;
       }
       b uob = a.b(p0, this.Y8().name(), this.w.Z2.getLiveStreamId());
       if (uob != null) {
          c tv = this.v;
          b d = uob.d;
          tv.H = d;
          tv.I.put(d, Integer.valueOf(uob.e));
          if (uob.a() != null) {
             b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[LiveAudienceGiftBoxSimpleGiftPresenter] [handleNormalGiftTypeItemSelect] recover comboKeyType");
             this.v.J = uob.a();
          }
          this.v.t.c(uob.f);
          String str = p1+"->[LiveAudienceGiftBoxSimpleGiftPresenter][restoreComboProtectionIfNeeded]";
          if (!PatchProxy.applyVoidOneRefs(str, this, uoc, "25")) {
             this.v.A.f(str, true);
          }
       }
       return;
    }
    public void q9(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "10")) {
          return;
       }
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.FALSE, this, uoc, "11")) {
          this.q.e(p0, false);
          if (!this.q.c()) {
             p0 = p0 / this.q.getPageSize();
             if (this.G != null && !p0) {
                this.d9();
             }
          }
       }
       return;
    }
    public void s9(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "26")) {
          return;
       }
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "23")) {
          this.A.b(this.Y8(), p0);
       }
       if (this.I == p0) {
          return;
       }else if(p0){
          BaseFragment uBaseFragmen = this.w.Z2.b();
          ClientContent$LiveStreamPackage liveStreamPa = this.w.Z2.a();
          String str = this.W8();
          ClientContent$LiveVoicePartyPackageV2 liveVoicePar = this.w.Z2.y();
          int i = this.B.i();
          a0 uoa0 = a0.class;
          if (PatchProxy.isSupport(uoa0)) {
             Object[] objArray = new Object[]{uBaseFragmen,liveStreamPa,str,liveVoicePar,Integer.valueOf(i)};
             if (!PatchProxy.applyVoid(objArray, null, uoa0, "35")) {
             }
          }else {
          }
       }
    label_0086 :
       this.I = p0;
       return;
    }
    public boolean t9(){
       c uoc = c.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uoc, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!QCurrentUser.ME.isLogined() || this.I == null) {
          return false;
       }
       this.S8().t();
       c.h(this.t, b.e);
       if (this.b9()) {
          this.v.A.d("[LiveAudienceGiftBoxSimpleGiftPresenter][tryPrepareLoadGift]");
          this.v.K = objArray;
       }
       b[] uobArray = new b[]{b.g};
       c.d(this.t, uobArray);
       this.a9();
       if (!PatchProxy.applyVoid(objArray, this, uoc, "21")) {
          uoc = this.u;
          if (uoc != null) {
             c.c(this.t, uoc);
          }
       }
       return 1;
    }
    public void u9(Gift p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "9")) {
          return;
       }
       int i = this.X8().d();
       if (i > 0) {
          this.v.t.c(i);
          this.X8().l(-1);
       }else {
          this.v.t.c(Math.min(p0.mMaxBatchCount, 1));
       }
       return;
    }
}

package com.kuaishou.live.core.show.hourlytrank.h;
import im8.g;
import k51.c;
import java.lang.String;
import lnc.a1;
import java.util.HashSet;
import com.kwai.framework.abtest.f;
import com.kuaishou.live.core.show.hourlytrank.h$a;
import com.kuaishou.live.core.show.hourlytrank.h$b;
import ba2.y;
import ba2.l0;
import ba2.h0;
import ba2.i0;
import ba2.j0;
import ba2.k0;
import ba2.g0;
import ba2.m0;
import com.kwai.feature.api.live.service.show.hourlytrank.ranklist.LiveHourlyRankType;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import gw1.a;
import com.kuaishou.live.core.show.hourlytrank.a;
import t02.a0;
import com.kuaishou.live.core.show.hourlytrank.h$c;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import oq5.c;
import jv1.b;
import android.view.ViewTreeObserver;
import android.view.View;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.util.Set;
import k51.a;
import java.util.Iterator;
import n51.a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.hourlytrank.h$d;
import com.kuaishou.live.core.show.hourlytrank.a$a;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import i2b.a;
import com.kuaishou.live.core.show.hourlytrank.LiveHourlyRankPendantView;
import java.lang.Integer;
import android.widget.LinearLayout;
import com.kuaishou.live.core.show.hourlytrank.h$e;
import android.view.View$OnClickListener;
import ekd.j;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCGzoneLiveHourRankInfo;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$GzoneLiveHourRankTabInfo;
import ks5.b;
import ks5.c;
import aq5.d;
import fq5.b;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import ry1.b;
import p91.m;
import ry1.a;
import lp3.c;
import lp3.e;
import brd.t;
import com.kuaishou.live.core.show.hourlytrank.e;
import hf3.a;
import g53.a;
import java.lang.Boolean;
import com.kwai.live.gzone.common.keyswitch.a;
import xp5.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.hourlytrank.i;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveDistrictRankInfo;
import lf3.g;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveDistrictRankClosed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCGzoneLiveHourRankInfoClose;
import com.kuaishou.livestream.message.nano.SCLivePopularityRankInfo;
import com.kuaishou.livestream.message.nano.SCLivePopularityRankClosed;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$SCLiveRankVisibleResetInfo;
import ba2.l;
import ba2.m;
import erd.g;
import crd.b;
import crd.a;
import wkd.b;
import com.kuaishou.live.common.core.component.authority.c;
import com.kuaishou.live.common.core.component.authority.LiveAnchorCommonAuthority;
import ba2.n;
import ba2.o;
import ba2.n0;
import io.reactivex.internal.functions.Functions;
import ba2.q0;
import vq5.b;
import vq5.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import ba2.i;
import ba2.r;
import android.widget.ViewFlipper;
import android.app.Activity;
import d61.y;
import ekd.k1;
import ekd.m1;
import android.view.ViewStub;
import ba2.u0;
import java.util.Map;
import java.util.HashMap;
import jt5.b;
import t02.r1;
import ba2.p0;
import android.view.ViewOutlineProvider;
import ba2.z;
import java.lang.Runnable;
import ba2.b0;
import ba2.c0;
import ba2.d0;
import ba2.a0;
import ba2.e0;
import ba2.o0;
import android.net.Uri;
import ba2.v;
import ba2.f0;
import msd.a;
import k51.b;
import java.util.Arrays;
import va1.l0;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable$Orientation;
import android.graphics.drawable.Drawable;

public class h extends c implements g	// class@000c17
{
    public ViewStub A;
    public ViewStub B;
    public ViewStub C;
    public View D;
    public Uri E;
    public a F;
    public a G;
    public int H;
    public String I;
    public m J;
    public b K;
    public a0 L;
    public e M;
    public r1 N;
    public c O;
    public a P;
    public d Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean U0;
    public boolean V;
    public boolean V0;
    public boolean W;
    public boolean W0;
    public LiveStreamMessages$SCLiveDistrictRankInfo X;
    public boolean X0;
    public SCLivePopularityRankInfo Y;
    public boolean Y0;
    public LiveStreamMessages$SCGzoneLiveHourRankInfo Z;
    public String[] Z0;
    public String[] a1;
    public String[] b1;
    public int c1;
    public final Set d1;
    public e e1;
    public LiveHourlyRankPendantView f1;
    public String[] g1;
    public final boolean h1;
    public final Set i1;
    public r j1;
    public h k1;
    public ViewTreeObserver$OnGlobalLayoutListener l1;
    public final g m1;
    public final g n1;
    public final g o1;
    public int p;
    public final g p1;
    public boolean q;
    public final g q1;
    public ViewFlipper r;
    public final g r1;
    public LiveHourlyRankPendantView s;
    public final c s1;
    public View t;
    public LiveHourlyRankPendantView u;
    public LiveHourlyRankPendantView v;
    public LiveHourlyRankPendantView w;
    public LiveHourlyRankPendantView x;
    public LiveHourlyRankPendantView y;
    public LiveHourlyRankPendantView z;
    public static String sLivePresenterClassName = "LiveNewHourlyRankPresenter";
    public static final String t1;

    static {
       h.t1 = a1.p(0x7f060846);
    }
    public void h(){
       String t1;
       super();
       this.p = -1;
       this.q = false;
       this.H = 0;
       this.R = false;
       this.S = false;
       this.T = false;
       this.U = false;
       this.V = false;
       this.W = false;
       String[] stringArray = new String[]{t1};
       t1 = h.t1;
       this.Z0 = stringArray;
       stringArray = new String[]{t1};
       this.a1 = stringArray;
       stringArray = new String[]{t1};
       this.b1 = stringArray;
       this.c1 = -1;
       this.d1 = new HashSet();
       this.e1 = null;
       String[] stringArray1 = new String[]{t1};
       this.g1 = stringArray1;
       this.h1 = f.a("enableDistrictRankPendantFlipperOptimize");
       this.i1 = new HashSet();
       this.j1 = new h$a(this);
       this.k1 = new h$b(this);
       this.l1 = new y(this);
       this.m1 = new l0(this);
       this.n1 = new h0(this);
       this.o1 = new i0(this);
       this.p1 = new j0(this);
       this.q1 = new k0(this);
       this.r1 = new g0(this);
       this.s1 = new m0(this);
    }
    public static LiveHourlyRankType W8(int p0){
       if (p0 == 1) {
          return LiveHourlyRankType.NATIONAL_RANK;
       }
       if (p0 == 2) {
          return LiveHourlyRankType.DISTRICT_RANK;
       }
       if (p0 == 6) {
          return LiveHourlyRankType.GZONE_RANK;
       }
       if (p0 == 7) {
          return LiveHourlyRankType.POPULARITY_RANK;
       }
       if (p0 != 9) {
          return LiveHourlyRankType.UNKNOWN;
       }
       return LiveHourlyRankType.CITY_RANK;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       if (!a.c()) {
          this.F = this.P8();
       }
       h tL = this.L;
       if (tL != null && tL.h != null) {
          tL.y2.P4(new h$c(this));
       }else {
          this.Y8();
       }
       tL = this.L;
       if (tL != null) {
          tL.x.H6(this.s1);
       }
       return;
    }
    public void J8(){
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "4")) {
          return;
       }
       this.d9();
       if (!PatchProxy.applyVoid(objArray, this, oh, "11")) {
          h tt = this.t;
          if (tt != null) {
             tt.getViewTreeObserver().removeOnGlobalLayoutListener(this.l1);
             this.d1.clear();
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, oh, "5") && (a.h() && this.P != null)) {
          Iterator iterator = this.i1.iterator();
          while (iterator.hasNext()) {
             this.P.b(iterator.next());
          }
       }
       return;
    }
    public a P8(){
       a obj = PatchProxy.apply(null, this, h.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a();
       obj.u(new h$d(this));
       if (this.D == null) {
          this.D = a.a(this.getContext(), 0x7f0d0ce0);
       }
       obj.a = this.D;
       return obj;
    }
    public final LiveHourlyRankPendantView R8(int p0,int p1){
       LiveHourlyRankPendantView obj;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oh, "44");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new LiveHourlyRankPendantView(this.getContext());
       h tL = this.L;
       if (tL != null && tL.l()) {
          obj.setBackgroundResource(R.drawable.arg_RES_7f08121e);
       }
       obj.setPendantViewClickListener(new h$e(this, p1, p0, obj));
       return obj;
    }
    public final String[] S8(String[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (j.h(p0)) {
          p0 = new String[]{h.t1};
       }
       return p0;
    }
    public final String V8(LiveStreamMessages$SCGzoneLiveHourRankInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && !j.h(p0.tabInfo)) {
          p0 = p0.tabInfo;
          int len = p0.length;
          int i = 0;
          while (i < len) {
             object oobject = p0[i];
             if (oobject.isInTop != null) {
                return oobject.rankName;
             }
             i = i + 1;
          }
       }
       return null;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, h.class, "40")) {
          return;
       }
       if (this.r != null) {
          h tF = this.F;
          if (tF != null) {
             this.O.c(tF);
             this.J.A0().yj(AudienceBizRelation.DISTRICT_RANK);
          }
       }
       return;
    }
    public void Y8(){
       boolean b;
       boolean b3;
       e uoe = this;
       b uob = b.class;
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, uoe, oh, "7")) {
          return;
       }
       int i = -416381922;
       String str = "LiveNewHourlyRankPresenter";
       b = false;
       LiveLogTag liveLogTag = 1;
       if (!PatchProxy.applyVoid(objArray, uoe, oh, "8")) {
          t ot = (uoe.J.e())? uoe.M.a(a.class).F3(): objArray;
          Object[] objArray1 = (uoe.J.e())? objArray: uoe.M.a(uob).W();
          a uoa = uoe.J.u();
          h l = uoe.L;
          e obj = PatchProxy.applyOneRefs(l, objArray, a.class, "1");
          if (obj != PatchProxyResult.class) {
             b3 = obj.booleanValue();
          }else if(l != null && (a.a() && l.t.c())){
             b3 = true;
          }else {
             b3 = false;
          }
          e uoe1 = new e(uoa, b3, uoe.h1, uoe.J.e(), ot, objArray1);
          uoe.e1 = v4;
          LiveLogTag hOURLY_RANK = LiveLogTag.HOURLY_RANK;
          hOURLY_RANK.appendTag(str);
          b.P(hOURLY_RANK, "mIsDistrictRankFlipperOtpEnabled = "+uoe.h1);
          l = uoe.e1;
          i oi = new i(uoe);
          Objects.requireNonNull(l);
          obj = e.class;
          if (!PatchProxy.applyVoidOneRefs(oi, l, obj, "5")) {
             a.p(oi, "listener");
             l.f = oi;
             l.b = l.r ^ liveLogTag;
             String str1 = "LiveHourlyRankPendantDataManager";
             hOURLY_RANK.appendTag(str1);
             b.T(hOURLY_RANK, "on data manager init", "isHourlyRankPendantSortEnable", Boolean.valueOf(l.r), "isHourlyRankEntryVisibleCtrEnable", Boolean.valueOf(l.g));
             e p = l.p;
             if (p != null) {
                p.u0(587, LiveStreamMessages$SCLiveDistrictRankInfo.class, l.i);
             }
             p = l.p;
             if (p != null) {
                p.u0(588, LiveStreamMessages$SCLiveDistrictRankClosed.class, l.j);
             }
             if (l.q != null) {
                p = l.p;
                if (p != null) {
                   p.u0(848, LiveStreamMessages$SCGzoneLiveHourRankInfo.class, l.m);
                }
                p = l.p;
                if (p != null) {
                   p.u0(849, LiveStreamMessages$SCGzoneLiveHourRankInfoClose.class, l.n);
                }
             }
             p = l.p;
             if (p != null) {
                p.u0(858, SCLivePopularityRankInfo.class, l.k);
             }
             p = l.p;
             if (p != null) {
                p.u0(859, SCLivePopularityRankClosed.class, l.l);
             }
             p = l.p;
             if (p != null) {
                p.u0(1097, LiveDistrictRankFinalBattle$SCLiveRankVisibleResetInfo.class, l.o);
             }
             if (!PatchProxy.applyVoid(objArray, l, obj, "6")) {
                if (l.s != null) {
                   obj = l.t;
                   if (obj != null) {
                      b uob1 = obj.subscribe(new l(l), new m(l));
                      if (uob1 != null) {
                         l.a.c(uob1);
                      }
                   }
                   c obj1 = b.a(i);
                   a.o(obj1, "Singleton.get\(LiveAnchor¡­ctionManager::class.java\)");
                   obj1 = obj1.b;
                   b3 = (obj1 != null && obj1.mIsHourlyRankEntryEnable != null)? true: false;
                   b.S(hOURLY_RANK.appendTag(str1), "[district] anchor got hourlyrank config", "isHourlyRankEntryEnable", Boolean.valueOf(b3));
                   l.h = b3 ^ 0x01;
                }else {
                   e u = l.u;
                   if (u != null) {
                      b uob2 = u.subscribe(new n(l), new o(l));
                      if (uob2 != null) {
                         l.a.c(uob2);
                      }
                   }
                }
             }
          }
       }
    label_01b1 :
       if (!PatchProxy.applyVoid(objArray, uoe, oh, "9")) {
          if (uoe.J.e()) {
             c b1 = b.a(i).b;
             boolean b2 = (b1 != null && b1.mIsCityRankEnable != null)? true: false;
             uoe.V0 = b2;
             b1 = b.a(i).b;
             b2 = (b1 != null && b1.mIsHourlyQuarterRankEnable != null)? true: false;
             uoe.W0 = b2;
             b1 = b.a(i).b;
             if (b1 != null && b1.mIsNewHourlyRankResultEnable != null) {
                b = true;
             }
             uoe.Y0 = b;
             this.n9();
             b.e0(LiveLogTag.HOURLY_RANK, "fetch anchor config", "isCityRankEnable", Boolean.valueOf(uoe.V0), "isHeadLineEnable", Boolean.valueOf(uoe.W0), "mIsNewHourlyRankResultEnable", Boolean.valueOf(uoe.Y0));
          }else {
             uoe.X7(uoe.M.a(uob).W().subscribe(new n0(uoe), Functions.d()));
          }
          b.S(LiveLogTag.HOURLY_RANK.appendTag(str), "initData", "isEnableLiveHourlyRankTopPendantPerfOpt", Boolean.valueOf(a.h()));
       }
       if (!PatchProxy.applyVoid(objArray, uoe, oh, "50")) {
          uoe.Q.t5("hourlyranklist", new q0(uoe));
       }
       return;
    }
    public final boolean Z8(){
       boolean b;
       LiveLogTag obj = PatchProxy.apply(null, this, h.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.X != null) {
          obj = LiveLogTag.HOURLY_RANK;
          obj.appendTag("LiveNewHourlyRankPresenter");
          LiveLogTag liveLogTag = obj;
          b.T(liveLogTag, "on update [district]", "aggregationShowRank", Boolean.valueOf(this.X.aggregationShowRank), "aggregationDisplayName", this.X.aggregationDisplayName);
       }
       h tX = this.X;
       b = (tX != null && (tX.aggregationShowRank != null && !TextUtils.x(tX.aggregationDisplayName)))? true: false;
       return b;
    }
    public final boolean a9(LiveStreamMessages$SCGzoneLiveHourRankInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null && !j.h(p0.tabInfo)) {
          p0 = p0.tabInfo;
          int len = p0.length;
          int i = 0;
          while (i < len) {
             object oobject = p0[i];
             if (oobject.isInTop != null) {
                boolean b = true;
                if (oobject.tabId == b) {
                   return b;
                }
             }
             i = i + 1;
          }
       }
       return false;
    }
    public void b9(){
       if (PatchProxy.applyVoid(null, this, h.class, "48")) {
          return;
       }
       h tF = this.F;
       if (tF != null && tF.t()) {
          tF = this.H;
          boolean b = true;
          if (tF != b) {
             if (tF != 2) {
                if (tF != 3) {
                   if (tF != 6) {
                      if (tF != 7) {
                         if (tF != 9) {
                            return;
                         }else if(this.W != null){
                            return;
                         }else {
                            this.W = b;
                         }
                      }else if(this.U != null){
                         return;
                      }else {
                         this.U = b;
                      }
                   }else if(this.V != null){
                      return;
                   }else {
                      this.V = b;
                   }
                }else if(this.T != null){
                   return;
                }else {
                   this.T = b;
                }
             }else if(this.R != null){
                return;
             }else {
                this.R = b;
             }
          }else if(this.S != null){
             return;
          }else {
             this.S = b;
          }
          int[] ointArray = new int[0];
          i.e(this.J.a(), this.H, this.I, ointArray);
       }
       return;
    }
    public final void c9(){
       h oh = h.class;
       if (PatchProxy.applyVoid(null, this, oh, "15")) {
          return;
       }
       h ts = this.s;
       h tr = this.r;
       h tJ = this.J;
       a uoa = this.j1.g();
       String str = "LiveNewHourlyRankPresenter";
       if (ts != null && (tr != null && (tJ == null || uoa == null))) {
          LiveLogTag hOURLY_RANK = LiveLogTag.HOURLY_RANK;
          hOURLY_RANK.appendTag(str);
          b.V(hOURLY_RANK, "onPendantViewUpdateFinish: necessary param is null!", "shrinkModeView", ts, "rankPendantFlipper", tr, "liveBasicContext", tJ, "rankPendantItem", uoa);
          return;
       }else {
          LiveLogTag hOURLY_RANK1 = LiveLogTag.HOURLY_RANK;
          hOURLY_RANK1.appendTag(str);
          LiveLogTag liveLogTag = hOURLY_RANK1;
          b.P(liveLogTag, "do update pendantView after task");
          if (ts.getVisibility() == 8 && tr.getChildCount() <= 0) {
             this.U0 = false;
             this.X8();
          }else if(PatchProxy.applyVoidOneRefs(uoa, this, oh, "16")){
             this.O.b(uoa);
             this.U0 = true;
          }
          if (!PatchProxy.applyVoidOneRefs(tr, this, oh, "17")) {
             if (!tr.getVisibility() && tr.getChildCount() > 1) {
                tr.startFlipping();
             }else {
                tr.stopFlipping();
             }
          }
          if (!PatchProxy.applyVoidOneRefs(tJ, this, oh, "18") && !tJ.e()) {
             tJ.A0().Pj(AudienceBizRelation.DISTRICT_RANK);
          }
          if (y.d(this.getActivity())) {
             this.X8();
          }
          return;
       }
    }
    public void d9(){
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "10")) {
          return;
       }
       k1.n(this);
       this.X = objArray;
       this.Y = objArray;
       this.Z = objArray;
       this.p = -1;
       this.h9();
       h tF = this.F;
       if (tF != null) {
          tF.u(objArray);
       }
       tF = this.L;
       if (tF != null) {
          tF.x.Q0(this.s1);
       }
       tF = this.e1;
       if (tF != null) {
          Objects.requireNonNull(tF);
          if (!PatchProxy.applyVoid(objArray, tF, e.class, "7")) {
             tF.f = objArray;
             tF.a.dispose();
             e p = tF.p;
             if (p != null) {
                p.o(587, tF.i);
             }
             p = tF.p;
             if (p != null) {
                p.o(588, tF.j);
             }
             if (tF.q != null) {
                p = tF.p;
                if (p != null) {
                   p.o(848, tF.m);
                }
                p = tF.p;
                if (p != null) {
                   p.o(849, tF.n);
                }
             }
             p = tF.p;
             if (p != null) {
                p.o(858, tF.k);
             }
             p = tF.p;
             if (p != null) {
                p.o(859, tF.l);
             }
             p = tF.p;
             if (p != null) {
                p.o(1097, tF.o);
             }
          }
          this.e1 = objArray;
       }
       if (!PatchProxy.applyVoid(objArray, this, oh, "52")) {
          this.Q.Z4("hourlyranklist");
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       this.A = m1.f(p0, 0x7f0a221d);
       this.B = m1.f(p0, 0x7f0a1c77);
       this.C = m1.f(p0, 0x7f0a204e);
       return;
    }
    public final void e9(){
       if (PatchProxy.applyVoid(null, this, h.class, "36")) {
          return;
       }
       if (this.r != null && this.w != null) {
          b.P(LiveLogTag.HOURLY_RANK.appendTag("LiveNewHourlyRankPresenter"), "delete [popularity] pendant");
          this.r.removeView(this.w);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new u0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, h.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(h.class, new u0());
       }else {
          obj.put(h.class, null);
       }
       return obj;
    }
    public final void h9(){
       this.R = false;
       this.S = false;
       this.T = false;
       this.U = false;
       this.V = false;
       this.W = false;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.J = this.r8("LIVE_BASIC_CONTEXT");
       this.K = this.r8("LIVE_HOURLY_RANK_LIST_SERVICE");
       this.L = this.s8(a0.class);
       this.N = this.s8(r1.class);
       this.O = this.q8(c.class);
       this.Q = this.r8("LIVE_ROUTER_SERVICE");
       this.M = this.r8("LIVE_SERVICE_MANAGER");
       this.P = this.t8("LIVE_PLAY_MAIN_THREAD_TASKS_SERVICE");
       return;
    }
    public void j9(LiveStreamMessages$SCLiveDistrictRankInfo p0){
       h oh = h.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oh, "14")) {
          return;
       }
       if (p0 != null) {
          this.X = p0;
       }
       a uoa = this.j1.g();
       if (uoa == null) {
          return;
       }else {
          h tD = this.D;
          if (!PatchProxy.applyVoidOneRefs(tD, this, oh, "42") && (this.r == null && tD != null)) {
             this.t = tD.findViewById(0x7f0a220c);
             this.r = tD.findViewById(0x7f0a220d);
             if (!PatchProxy.applyVoid(null, this, oh, "43")) {
                this.r.setOutlineProvider(new p0(this));
                this.r.setClipToOutline(true);
             }
             oh = this.r;
             if (oh != null) {
                oh.setFlipInterval(5000);
             }
             LiveHourlyRankPendantView liveHourlyRa = tD.findViewById(R.id.live_hourly_rank_shrink_view);
             this.s = liveHourlyRa;
             liveHourlyRa.setContentText(a1.p(R.string.arg_RES_7f1024ee));
             this.t.getViewTreeObserver().addOnGlobalLayoutListener(this.l1);
          }
       label_0080 :
          if (this.r == null) {
             return;
          }else {
             this.O.b(uoa);
             h tX = this.X;
             String str = "LiveNewHourlyRankPresenter";
             if (tX == null || (tX.isInTop == null && tX.isInCityRank == null)) {
                tX = this.Y;
                if (tX == null || (tX.showRank == null && (this.a9(this.Z) || (this.h1 != null && this.Z8())))) {
                label_00d5 :
                   if (this.y != null) {
                      b.P(LiveLogTag.HOURLY_RANK.appendTag(str), "remove [not in top] pendant");
                      this.r.removeView(this.y);
                   }
                   if (this.h1 == null) {
                      this.l9("LiveNewHourlyRankPresenter::updateNationalPendantView", new b0(this));
                      this.l9("LiveNewHourlyRankPresenter::updateDistrictPendantView", new c0(this));
                      this.l9("LiveNewHourlyRankPresenter::updateCityPendantViewIfNecessary", new d0(this));
                   }else {
                      this.l9("LiveNewHourlyRankPresenter::updateOptDistrictPendantView", new a0(this));
                   }
                   this.l9("LiveNewHourlyRankPresenter::updatePopularityPendantView", new e0(this));
                   this.l9("LiveNewHourlyRankPresenter::updateGzonePendantView", new o0(this));
                }else {
                   tX = this.X;
                   if (tX != null && !TextUtils.x(tX.displayNotInTop)) {
                      this.l9("LiveNewHourlyRankPresenter::updateNotInTopPendantView", new z(this));
                      b.P(LiveLogTag.HOURLY_RANK.appendTag(str), "update [not in top] pendant");
                   }
                }
             }else {
                goto label_00d5 ;
             }
             if (!a.h()) {
                this.c9();
             }
             return;
          }
       }
    }
    public void k9(Uri p0){
       LiveHourlyRankType nATIONAL_RAN;
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "51")) {
          return;
       }
       String queryParamet = p0.getQueryParameter("tab");
       String queryParamet1 = p0.getQueryParameter("source");
       h tK = this.K;
       LiveHourlyRankType liveHourlyRa = PatchProxy.applyOneRefs(queryParamet, null, v.class, "18");
       if (liveHourlyRa != PatchProxyResult.class) {
       }else {
          liveHourlyRa = LiveHourlyRankType.UNKNOWN;
          if (("2").equals(queryParamet)) {
             nATIONAL_RAN = LiveHourlyRankType.NATIONAL_RANK;
          }else if(("1").equals(queryParamet)){
             nATIONAL_RAN = LiveHourlyRankType.DISTRICT_RANK;
          }else if(("3").equals(queryParamet)){
             nATIONAL_RAN = LiveHourlyRankType.GZONE_RANK;
          }else if(("4").equals(queryParamet)){
             nATIONAL_RAN = LiveHourlyRankType.POPULARITY_RANK;
          }else if(("5").equals(queryParamet)){
             nATIONAL_RAN = LiveHourlyRankType.HIGH_VALUE_RANK;
          }else if(("6").equals(queryParamet)){
             nATIONAL_RAN = LiveHourlyRankType.CITY_RANK;
          }
          liveHourlyRa = nATIONAL_RAN;
       }
       if (TextUtils.x(queryParamet1)) {
          queryParamet1 = "UNKNOWN";
       }
       tK.a(liveHourlyRa, queryParamet1);
       return;
    }
    public final void l9(String p0,Runnable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "53")) {
          return;
       }
       boolean b = a.h();
       this.i1.add(b.c(p0, p1, b, this.P, new f0(this, b)));
       return;
    }
    public final boolean m9(LiveHourlyRankPendantView p0,String[] p1,String[] p2){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, h.class, "45");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.applyTwoRefs(p1, p2, this, h.class, "46");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(j.h(p2)){
          b.Z(LiveLogTag.HOURLY_RANK, "disable pendant background, illegal info");
       }else if(Arrays.equals(p1, p2)){
          b = true;
       }
       b = false;
       if (!b) {
          return false;
       }else {
          int[] ointArray = l0.h(p2);
          GradientDrawable gradientDraw = new GradientDrawable();
          gradientDraw.setGradientType(false);
          gradientDraw.setOrientation(GradientDrawable$Orientation.LEFT_RIGHT);
          if (p2.length > 1) {
             gradientDraw.setColors(ointArray);
          }else {
             gradientDraw.setColor(ointArray[0]);
          }
          gradientDraw.setCornerRadius((float)(a1.d(R.dimen.arg_RES_7f0708a3) / 2));
          p0.setBackground(gradientDraw);
          return true;
       }
    }
    public final void n9(){
       h oh = h.class;
       if (PatchProxy.applyVoid(null, this, oh, "12")) {
          return;
       }
       if (this.V0 != null && !PatchProxy.applyVoid(null, this, oh, "13")) {
          oh = this.X;
          if (oh != null) {
             this.j9(oh);
          }
       }
       return;
    }
}

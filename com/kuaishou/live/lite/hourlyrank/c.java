package com.kuaishou.live.lite.hourlyrank.c;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.String;
import lnc.a1;
import hf3.a;
import com.kuaishou.live.lite.tempplay.LiveLiteTempPlayService;
import td3.o;
import e93.b;
import xp5.i;
import or5.d;
import java.util.HashSet;
import java.util.HashMap;
import qb3.c;
import qb3.b;
import qb3.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveDistrictRankInfo;
import lf3.g;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveDistrictRankClosed;
import com.kuaishou.livestream.message.nano.SCLivePopularityRankInfo;
import brd.t;
import qb3.e;
import sfc.a;
import erd.g;
import crd.b;
import qb3.f;
import android.content.Context;
import android.view.View;
import ha1.b;
import android.view.ViewGroup;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper;
import com.kuaishou.live.lite.hourlyrank.b;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper$a;
import lnc.b9;
import java.util.Set;
import e93.f;
import com.kuaishou.live.lite.hourlyrank.LiveLiteHourlyRankPendantView;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.kuaishou.live.lite.hourlyrank.c$a;
import android.view.View$OnClickListener;
import ekd.j;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import java.lang.Boolean;
import android.widget.ViewFlipper;
import java.util.Objects;
import com.kuaishou.live.widget.ShootMarqueeView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import qb3.a;
import com.kuaishou.live.lite.tempplay.d;
import com.kuaishou.live.lite.tempplay.LiveLiteTempPlayService$a;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveDistrictRankConfig;
import java.lang.reflect.Type;
import wg3.a;
import java.util.Map;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.lite.hourlyrank.a;
import com.kuaishou.live.widget.ShootMarqueeView$c;
import qb3.l;
import qb3.j;
import java.lang.Runnable;
import java.lang.System;
import java.lang.Long;
import qb3.i;
import qb3.g;
import android.widget.TextView;
import java.util.Arrays;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable$Orientation;
import android.graphics.drawable.Drawable;

public class c extends ViewController	// class@0009bb
{
    public long A;
    public long B;
    public long C;
    public b D;
    public b E;
    public LiveStreamMessages$SCLiveDistrictRankInfo F;
    public SCLivePopularityRankInfo G;
    public final Set H;
    public final Map I;
    public final g J;
    public final g K;
    public final g L;
    public final a j;
    public final LiveLiteTempPlayService k;
    public final o l;
    public final b m;
    public final i n;
    public final d o;
    public LiveViewFlipper p;
    public LiveLiteHourlyRankPendantView q;
    public LiveLiteHourlyRankPendantView r;
    public LiveLiteHourlyRankPendantView s;
    public LiveLiteHourlyRankPendantView t;
    public LiveLiteHourlyRankPendantView u;
    public LiveLiteTempPlayService$a v;
    public ViewGroup w;
    public boolean x;
    public boolean y;
    public boolean z;
    public static final String M;

    static {
       c.M = a1.p(0x7f060846);
    }
    public void c(a p0,LiveLiteTempPlayService p1,o p2,b p3,i p4,d p5){
       super();
       this.x = false;
       this.y = false;
       this.z = false;
       this.A = 0xea60;
       this.B = 3;
       this.C = 0;
       this.H = new HashSet();
       this.I = new HashMap();
       this.J = new c(this);
       this.K = new b(this);
       this.L = new d(this);
       this.j = p0;
       this.k = p1;
       this.l = p2;
       this.m = p3;
       this.n = p4;
       this.o = p5;
    }
    public void F2(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "1")) {
          return;
       }
       this.j.u0(587, LiveStreamMessages$SCLiveDistrictRankInfo.class, this.J);
       this.j.u0(588, LiveStreamMessages$SCLiveDistrictRankClosed.class, this.K);
       this.j.u0(858, SCLivePopularityRankInfo.class, this.L);
       this.D = this.l.W().subscribe(new e(this), new a());
       this.E = this.l.T3().subscribe(new f(this), new a());
       if (!PatchProxy.applyVoid(objArray, this, uoc, "3")) {
          if (this.w == null) {
             this.w = b.b(this.D2(), 0x7f0d0988);
          }
          LiveViewFlipper liveViewFlip = this.w.findViewById(R.id.live_lite_pendant_hourly_rank_pendant_container);
          this.p = liveViewFlip;
          liveViewFlip.a(new b(this));
       }
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.j.o(587, this.J);
       this.j.o(588, this.K);
       this.j.o(858, this.L);
       b9.a(this.D);
       b9.a(this.E);
       this.H.clear();
       f.g("removeTop100RankPendantToken");
       f.g(this);
       return;
    }
    public final LiveLiteHourlyRankPendantView V2(String p0){
       LiveLiteHourlyRankPendantView obj = PatchProxy.applyOneRefs(p0, this, c.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a(this.D2(), R.layout.arg_RES_7f0d0c5f);
       obj.setLiteRankHorseRaceTimes(this.B);
       obj.setRankType(p0);
       obj.setHourlyRankItemViewClickListener(new c$a(this, p0));
       return obj;
    }
    public final String[] W2(String[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (j.h(p0)) {
          p0 = new String[]{c.M};
       }
       return p0;
    }
    public final void X2(int p0,int p1,View p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, c.class, "20")) {
          return;
       }
       FrameLayout$LayoutParams layoutParams = p2.getLayoutParams();
       layoutParams.width = p0;
       layoutParams.height = a1.d(0x7f0702b8);
       p2.setLayoutParams(layoutParams);
       p2.setContentViewLayoutParams(p1);
       return;
    }
    public final boolean Y2(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, c.class, "25");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.p;
       if (obj != null && obj.getCurrentView() != null) {
          LiveLiteHourlyRankPendantView currentView = this.p.getCurrentView();
          Objects.requireNonNull(currentView);
          Object obj1 = PatchProxy.apply(objArray, currentView, LiveLiteHourlyRankPendantView.class, "6");
          b = (obj1 != patchProxyRe)? obj1.booleanValue(): currentView.b.q();
          if (b) {
             b = true;
          label_0045 :
             return b;
          }
       }
    label_0044 :
       b = false;
       goto label_0045 ;
    }
    public void Z2(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "35")) {
          return;
       }
       if (!TextUtils.x(p0) && !this.H.contains(p0)) {
          this.H.add(p0);
          ClientContent$LiveStreamPackage liveStreamPa = this.n.a();
          if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, p0, null, a.class, "1")) {
             d.d(liveStreamPa, "SNAP_FUN", "HOUR_LIST", a.a(p0));
          }
       }
       return;
    }
    public final void a3(){
       if (PatchProxy.applyVoid(null, this, c.class, "23")) {
          return;
       }
       c tp = this.p;
       if (tp != null) {
          tp.setVisibility(8);
       }
       tp = this.v;
       if (tp != null) {
          this.k.a(tp);
       }
       this.v = null;
       this.G = null;
       this.F = null;
       this.H.clear();
       f.g(this);
       return;
    }
    public final void b3(LiveLiteHourlyRankPendantView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "22")) {
          return;
       }
       if (p0.getParent() == null) {
          this.p.addView(p0);
       }
       if (!TextUtils.n(p0.getContentText(), p1)) {
          p0.setContentText(p1);
       }
       return;
    }
    public void c3(){
       boolean i;
       String[] obj;
       String str2;
       LiveConfigStartupResponse$LiveDistrictRankConfig obj1;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "9")) {
          return;
       }
       boolean b = false;
       this.z = b;
       if (this.p == null) {
          return;
       }
       c tF = this.F;
       String str = "removeTop100RankPendantToken";
       if (tF == null || (tF.isInTop == null && tF.isInCityRank == null)) {
          c tG = this.G;
          if (tG != null && tG.showRank != null) {
          label_002a :
             if (!PatchProxy.applyVoid(objArray, this, uoc, "10")) {
                tG = this.u;
                if (tG != null) {
                   this.p.removeView(tG);
                   f.g(str);
                }
                int childCount = this.p.getChildCount();
                String str1 = "";
                if (!PatchProxy.applyVoid(objArray, this, uoc, "11") && this.p != null) {
                   obj1 = PatchProxy.apply(objArray, this, uoc, "27");
                   if (obj1 != PatchProxyResult.class) {
                      i = obj1.booleanValue();
                   }else {
                      tG = this.F;
                      if (tG != null && tG.isInTop != null) {
                         obj1 = PatchProxy.apply(objArray, this, uoc, "28");
                         if (obj1 != PatchProxyResult.class) {
                            i = obj1.booleanValue();
                         }else {
                            obj1 = a.l(LiveConfigStartupResponse$LiveDistrictRankConfig.class);
                            i = (obj1 != null && obj1.mDisableShowGlobalRank == null)? true: false;
                         }
                         if (i) {
                            tG = this.F;
                            if (tG.isInGlobalRank != null && !TextUtils.x(tG.globalRankName)) {
                               i = true;
                            }
                         }
                      }
                   label_00a2 :
                      i = false;
                   }
                   if (i) {
                      str2 = "2";
                      if (this.r == null) {
                         this.r = this.V2(str2);
                      }
                      this.b3(this.r, this.F.globalRankName);
                      obj = this.W2(this.F.globalPendantColor);
                      if (this.e3(this.r, str2, obj)) {
                         this.I.put(str2, obj);
                      }
                   }else {
                      tG = this.r;
                      if (tG != null) {
                         tG.setContentText(str1);
                         this.p.removeView(this.r);
                      }
                   }
                }
             label_00de :
                if (!PatchProxy.applyVoid(objArray, this, uoc, "12") && this.p != null) {
                   obj1 = PatchProxy.apply(objArray, this, uoc, "29");
                   if (obj1 != PatchProxyResult.class) {
                      i = obj1.booleanValue();
                   }else {
                      tG = this.F;
                      i = (tG != null && (tG.isInTop != null && (tG.isInRank != null && !TextUtils.x(tG.rankName))))? true: false;
                   }
                   if (i) {
                      str2 = "1";
                      if (this.s == null) {
                         this.s = this.V2(str2);
                      }
                      this.b3(this.s, this.F.rankName);
                      obj = this.W2(this.F.districtPendantColor);
                      if (this.e3(this.s, str2, obj)) {
                         this.I.put(str2, obj);
                      }
                   }else {
                      tG = this.s;
                      if (tG != null) {
                         tG.setContentText(str1);
                         this.p.removeView(this.s);
                      }
                   }
                }
             label_014d :
                if (!PatchProxy.applyVoid(objArray, this, uoc, "13") && this.p != null) {
                   obj = PatchProxy.apply(objArray, this, uoc, "30");
                   if (obj != PatchProxyResult.class) {
                      i = obj.booleanValue();
                   }else if(this.x != null){
                      tG = this.F;
                      if (tG != null && (tG.isInCityRank != null && !TextUtils.x(tG.cityRankName))) {
                         i = true;
                      }
                   }
                   i = false;
                   if (i) {
                      str2 = "6";
                      if (this.t == null) {
                         this.t = this.V2(str2);
                      }
                      this.b3(this.t, this.F.cityRankName);
                      obj = this.W2(this.F.cityPendantColor);
                      if (this.e3(this.t, str2, obj)) {
                         this.I.put(str2, obj);
                      }
                   }else {
                      tG = this.t;
                      if (tG != null) {
                         tG.setContentText(str1);
                         this.p.removeView(this.t);
                      }
                   }
                }
             label_01bc :
                if (!PatchProxy.applyVoid(objArray, this, uoc, "14") && this.p != null) {
                   obj = PatchProxy.apply(objArray, this, uoc, "31");
                   if (obj != PatchProxyResult.class) {
                      i = obj.booleanValue();
                   }else {
                      tG = this.G;
                      i = (tG != null && (tG.showRank != null && (this.y != null && !TextUtils.x(tG.displayRank))))? true: false;
                   }
                   if (i) {
                      if (this.q == null) {
                         this.q = this.V2("4");
                      }
                      this.b3(this.q, this.G.displayRank);
                   }else {
                      tG = this.q;
                      if (tG != null) {
                         tG.setContentText(str1);
                         this.p.removeView(this.q);
                      }
                   }
                }
             label_0216 :
                if (!PatchProxy.applyVoid(objArray, this, uoc, "18")) {
                   b.c0(LiveLiteLogTag.HOURLY_RANK, "ÉÏ°ñ¸öÊý", "rank count:", String.valueOf(this.p.getChildCount()));
                   if (this.p.getChildCount() > 0) {
                      if (this.p.getChildCount() > 1) {
                         if (!PatchProxy.applyVoid(objArray, this, uoc, "19")) {
                            for (i = 0; i < this.p.getChildCount(); i = i + 1) {
                               this.X2(a1.d(R.dimen.arg_RES_7f070257), -1, this.p.getChildAt(i));
                               this.p.getChildAt(i).setMarqueeListener(new a(this));
                            }
                         }
                      }else {
                         this.X2(-2, -2, this.p.getCurrentView());
                      }
                   }
                }
                if (!PatchProxy.applyVoid(objArray, this, uoc, "21") && (this.p.getChildCount() > 0 && this.v == null)) {
                   l ol = PatchProxy.apply(objArray, this, uoc, "26");
                   if (ol != PatchProxyResult.class) {
                   }else {
                      ol = new l(this);
                   }
                   this.v = ol;
                   this.k.b(ol);
                   this.p.setVisibility(b);
                }
             label_02b4 :
                LiveLiteHourlyRankPendantView currentView = this.p.getCurrentView();
                if (childCount <= 1) {
                   f.k("updateHourlyRank", new j(this, currentView), this, 500);
                }
                if (this.p.getChildCount() == 1 && currentView != null) {
                   currentView.setContentText(currentView.getContentText());
                }
                if (currentView != null) {
                   this.Z2(currentView.getRankType());
                }
             }
          }else if(tF != null && (TextUtils.x(tF.displayNotInTop) || PatchProxy.applyVoid(objArray, this, uoc, "15"))){
             c tp = this.p;
             if (tp == null || (tp.getChildCount() > 0 && this.p.getVisibility() != 8)) {
                this.p.removeAllViews();
                long l = System.currentTimeMillis() - this.C;
                if (l - this.A >= 0) {
                   this.a3();
                }else if(PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Long.valueOf(l), this, uoc, "16")){
                   if (this.u == null) {
                      this.u = this.V2("0");
                   }
                   this.u.post(new i(this));
                   this.b3(this.u, a1.p(R.string.arg_RES_7f1024ee));
                   f.k("showTop100HourlyRank", new g(this), str, (this.A - l));
                }
             }
          }
       }else {
          goto label_002a ;
       }
       return;
    }
    public void d3(LiveLiteHourlyRankPendantView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "24")) {
          return;
       }
       if (this.p.getChildCount() <= 1 || (p0 == null || (!this.Y2() && !PatchProxy.applyVoid(null, p0, LiveLiteHourlyRankPendantView.class, "5")))) {
          p0.b.setText(p0.e);
          p0.b.setMarqueeDpPerSecond(30);
          p0.b.w(1, (p0.d + a1.d(R.dimen.arg_RES_7f070334)));
       }
    label_0045 :
       return;
    }
    public final boolean e3(LiveLiteHourlyRankPendantView p0,String p1,String[] p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, c.class, "33");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       String[] stringArray = this.I.get(p1);
       if (j.h(stringArray)) {
          stringArray = new String[]{c.M};
       }
       if (Arrays.equals(stringArray, p2)) {
          return 0;
       }else {
          int[] ointArray = PatchProxy.applyOneRefs(p2, this, c.class, "34");
          if (ointArray != patchProxyRe) {
          }else {
             ointArray = new int[p2.length];
             for (int i = 0; i < p2.length; i = i + 1) {
                ointArray[i] = Color.parseColor(p2[i]);
             }
          }
          GradientDrawable gradientDraw = new GradientDrawable();
          gradientDraw.setGradientType(0);
          gradientDraw.setOrientation(GradientDrawable$Orientation.LEFT_RIGHT);
          if (p2.length > 1) {
             gradientDraw.setColors(ointArray);
          }else {
             gradientDraw.setColor(ointArray[0]);
          }
          gradientDraw.setCornerRadius((float)(a1.d(R.dimen.arg_RES_7f0708a3) >> 1));
          p0.setBackground(gradientDraw);
          return 1;
       }
    }
    public final void f3(){
       if (PatchProxy.applyVoid(null, this, c.class, "8")) {
          return;
       }
       if (this.Y2()) {
          this.z = true;
       }else {
          this.c3();
       }
       return;
    }
}

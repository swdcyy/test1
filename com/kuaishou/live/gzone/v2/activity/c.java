package com.kuaishou.live.gzone.v2.activity.c;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import com.kwai.live.gzone.pendant.service.LiveGzoneAudienceFeatureEntranceItem;
import java.util.HashMap;
import com.kuaishou.live.gzone.v2.activity.c$d;
import androidx.collection.ArraySet;
import h63.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y43.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import fq5.b;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import brd.x;
import com.kuaishou.live.gzone.v2.activity.d;
import bp6.a;
import erd.g;
import crd.b;
import w53.t;
import lp3.e;
import com.kwai.live.gzone.treasure.box.bean.PanelVisibilityType;
import android.app.Activity;
import d61.y;
import w53.b;
import k67.b;
import java.util.ArrayList;
import java.util.List;
import androidx.viewpager.widget.ViewPager;
import h3.a;
import com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip;
import android.widget.HorizontalScrollView;
import android.content.Context;
import com.yxcorp.utility.n;
import java.util.Map;
import k67.g;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import w53.j0;
import lv1.h;
import j47.c;
import lv1.g;
import c63.a;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kwai.live.gzone.pendant.service.LiveGzoneFeatureEntrances;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import w53.e;
import w53.i;
import k67.m;
import k67.c;
import k67.o;
import w53.d;
import k67.e$b;
import w53.f;
import k67.n;
import w53.j;
import f67.d;
import k67.l;
import w53.h;
import com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip$f;
import com.kuaishou.live.gzone.v2.activity.c$a;
import androidx.viewpager.widget.ViewPager$i;
import w53.g;
import java.util.Objects;
import java.util.Set;
import com.kuaishou.live.gzone.v2.activity.c$c;
import java.lang.Enum;
import com.kuaishou.live.gzone.v2.activity.LiveGzoneActivityIconTab;
import com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip$e;
import android.view.View;
import v77.c0;
import k67.h;
import com.kuaishou.live.gzone.v2.activity.i;
import p47.c;
import tkd.b;
import tkd.d;
import os5.h;
import android.util.Pair;
import android.view.ViewGroup;
import i2b.a;
import com.kwai.live.gzone.turntable.a;
import com.kwai.live.gzone.guess.kshell.f0;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import f37.c0;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.log.LiveGzoneLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.live.gzone.v2.activity.a;
import java.lang.Number;
import com.kuaishou.live.gzone.v2.activity.c$b;
import java.lang.reflect.Type;
import el.a;
import f37.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import w53.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import i63.b;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabSource;
import java.lang.Boolean;
import m02.o;
import dz1.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ScreenPackage;
import k2b.u1;
import c77.a$a;
import com.kuaishou.android.live.log.LiveLogTag;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kuaishou.live.gzone.v2.activity.b;
import java.util.Comparator;
import java.util.Collections;
import java.lang.Math;
import android.widget.LinearLayout;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import ekd.m1;
import w53.m;
import com.kuaishou.live.gzone.v2.activity.e;

public class c extends PresenterV2 implements g	// class@001cb8
{
    public Map A;
    public a B;
    public b C;
    public List D;
    public final Set E;
    public Boolean F;
    public String G;
    public boolean H;
    public int I;
    public int J;
    public LiveGzoneTabSource K;
    public final i L;
    public boolean M;
    public boolean N;
    public String O;
    public HashMap p;
    public ViewPager q;
    public GzonePagerSlidingTabStrip r;
    public View s;
    public a t;
    public e u;
    public o v;
    public m w;
    public n x;
    public t y;
    public final Map z;
    public static final int P;
    public static final LiveGzoneAudienceFeatureEntranceItem[] Q;

    static {
       c.P = a1.a(0x7f0604ba);
       LiveGzoneAudienceFeatureEntranceItem[] liveGzoneAud = new LiveGzoneAudienceFeatureEntranceItem[]{LiveGzoneAudienceFeatureEntranceItem.TREASURE_BOX,LiveGzoneAudienceFeatureEntranceItem.GIFT,LiveGzoneAudienceFeatureEntranceItem.GUESS,LiveGzoneAudienceFeatureEntranceItem.VOTE,LiveGzoneAudienceFeatureEntranceItem.TURN_TABLE,LiveGzoneAudienceFeatureEntranceItem.GZONE_VOTE,LiveGzoneAudienceFeatureEntranceItem.COMPETITION_PREDICTION};
       c.Q = liveGzoneAud;
    }
    public void c(){
       super();
       this.z = new HashMap();
       this.A = null;
       this.B = new c$d(this);
       this.E = new ArraySet();
       this.I = -1;
       this.L = new i();
       this.M = true;
       this.N = true;
       this.O = "";
    }
    public void E8(){
       a y;
       c tt;
       c tw;
       a d1;
       List list;
       Iterator iterator;
       j0 oj0;
       LiveGzoneAudienceFeatureEntranceItem[] q;
       boolean len;
       t ot;
       PanelVisibilityType pANEL_FLAG_N;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "3")) {
          return;
       }
       String str = (this.N != null)? "PLAY": "ACTIVITY";
       this.O = str;
       if (!PatchProxy.applyVoid(objArray, this, uoc, "10")) {
          BaseFragment uBaseFragmen = this.t.m.b();
          t ot1 = uBaseFragmen.m();
          ot = ot1.compose(uBaseFragmen.Ug(FragmentEvent.DESTROY_VIEW));
          this.X7(ot.subscribe(new d(this), new a()));
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "18")) {
          ot = new t();
          this.y = ot;
          ot.c = this.B;
          tw = this.t;
          ot.b = tw.J;
          ot.e = this.u;
          d1 = tw.m;
          ot.f = d1;
          ot.g = d1.t5();
          tt = this.y;
          tw = this.t;
          tt.h = tw.O;
          tt.i = tw.L;
          tt.j = tw.p;
          tt.k = tw.v;
          tt.m = tw.n;
          tt.l = tw.d;
          if (this.H != null) {
             pANEL_FLAG_N = PanelVisibilityType.PANEL_FLAG_NEW_LIVE_ACTIVITY_TAB;
          }else if(y.d(this.getActivity())){
             pANEL_FLAG_N = PanelVisibilityType.PANEL_FLAG_NEW_LIVE_LANDSCAPE_POPUP;
          }else {
             pANEL_FLAG_N = PanelVisibilityType.PANEL_FLAG_NEW_LIVE_PORTRAIT_POPUP;
          }
          tt.d = pANEL_FLAG_N;
          this.y.n = this.t.h;
       }
       c$a uoa = null;
       if (!PatchProxy.applyVoid(objArray, this, uoc, "17")) {
          b uob = new b();
          this.C = uob;
          a d2 = this.t.d;
          len = (d2 != null && d2.S2())? true: false;
          uob.g = len;
          tt = this.D;
          if (tt == null) {
             this.D = new ArrayList();
          }else {
             tt.clear();
          }
          this.C.C(this.D);
          this.q.setOffscreenPageLimit(true);
          this.q.setAdapter(this.C);
          this.r.setViewPager(this.q);
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "19")) {
          tt = this.t;
          if (tt.n == null || (tt.d != null && tt.y != null)) {
             this.r.setSmoothScrollingEnabled(uoa);
             this.r.setScrollSelectedTabToCenter(true);
             tt = this.r;
             tt.setFadingEdgeLength(n.c(tt.getContext(), 32.00f));
             this.r.setHorizontalFadingEdgeEnabled(true);
             this.r.setTabPadding(a1.e(16.00f));
             this.r.O(a1.e(12.00f), a1.e(20.00f));
             this.r.setPadding(a1.e(8.00f), uoa, a1.e(8.00f), uoa);
             this.r.setIsAverageWidth(uoa);
             this.z.clear();
             if (this.N != null && !PatchProxy.applyVoid(objArray, this, uoc, "21")) {
                list = this.t.n.s7();
                if (!q.f(list)) {
                   iterator = list.iterator();
                   while (iterator.hasNext()) {
                      String str4 = iterator.next();
                      j0 oj01 = this.P8(str4);
                      if (oj01 != null) {
                         this.z.put(str4, oj01);
                      }
                   }
                   q = c.Q;
                   len = q.length;
                   int i1 = 0;
                   while (i1 < len) {
                      object oobject = q[i1];
                      if (this.t.d.yi(oobject.mEntranceId) && !this.z.containsKey(oobject.mEntranceId)) {
                         j0 oj02 = this.P8(oobject.mEntranceId);
                         if (oj02 != null) {
                            this.z.put(oobject.mEntranceId, oj02);
                         }
                      }
                      i1 = i1 + 1;
                   }
                }
             }
             if (this.M != null) {
                if (!PatchProxy.applyVoid(objArray, this, uoc, "20")) {
                   list = this.t.O.l3().f();
                   if (!q.f(list)) {
                      iterator = list.iterator();
                      while (iterator.hasNext()) {
                         g og = iterator.next();
                         if (og instanceof a) {
                            String str1 = og.o();
                            if (str1 == null || (str1.startsWith("http") && !this.z.containsKey(og.i()))) {
                               c tz = this.z;
                               String str2 = og.i();
                               int i = uoa + 1;
                               if (PatchProxy.isSupport(uoc)) {
                                  oj0 = PatchProxy.applyTwoRefs(og, Integer.valueOf(uoa), this, uoc, "26");
                                  if (oj0 != PatchProxyResult.class) {
                                  label_0275 :
                                     tz.put(str2, oj0);
                                     uoa = i;
                                  }
                               }
                               LiveGzoneFeatureEntrances liveGzoneFea = new LiveGzoneFeatureEntrances();
                               liveGzoneFea.mType = 3;
                               String str3 = (TextUtils.x(og.n()))? a1.p(R.string.arg_RES_7f102475): og.n();
                               liveGzoneFea.mName = str3;
                               liveGzoneFea.mTabBarColor = TextUtils.J(og.l, -1);
                               liveGzoneFea.mPriority = uoa;
                               liveGzoneFea.mId = og.i();
                               liveGzoneFea.mUrl = og.o();
                               oj0 = this.R8(liveGzoneFea);
                               goto label_0275 ;
                            }
                         }
                      }
                   }
                }
                this.w = new e(this);
             }
             if (this.N != null) {
                this.v = new i(this);
             }
             y = this.t.X0;
             if (y != null) {
                tw = this.w;
                if (tw != null) {
                   y.O0(tw);
                }
                tt = this.v;
                if (tt != null) {
                   this.t.X0.U0(tt);
                }
             }
             this.c9(true);
             if (this.N != null) {
                this.t.n.nb(new d(this));
                f uof = new f(this);
                this.x = uof;
                d1 = this.t.d;
                if (d1 != null) {
                   d1.Se(uof);
                }
             }
          }
       }
    label_02c8 :
       if (!PatchProxy.applyVoid(objArray, this, uoc, "29")) {
          y = this.t.y;
          if (y != null) {
             y.k(new j(this));
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "4")) {
          this.r.setOnChildShowListener(new h(this));
       }
       this.q.addOnPageChangeListener(new c$a(this));
       if (!PatchProxy.applyVoid(objArray, this, uoc, "5")) {
          a d = this.t.d;
          if (d != null) {
             this.X7(d.ua().subscribe(new g(this)));
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "33")) {
          return;
       }
       c tt = this.t;
       if (tt.d != null) {
          tt.X0.R0(this.v);
          this.t.d.vb(this.x);
       }
       this.X8();
       this.q.clearOnPageChangeListeners();
       tt = this.C;
       Objects.requireNonNull(tt);
       if (!PatchProxy.applyVoid(null, tt, b.class, "13") && !q.f(tt.e)) {
          Iterator iterator = tt.e.iterator();
          while (iterator.hasNext()) {
             j0 oj0 = iterator.next();
             Objects.requireNonNull(oj0);
             if (!PatchProxy.applyVoid(null, oj0, j0.class, "4") && oj0.i == null) {
                oj0.i = true;
                oj0.c.destroy();
             }
          }
       }
       this.E.clear();
       this.I = -1;
       this.G = null;
       this.F = null;
       return;
    }
    public final j0 P8(String p0){
       String str;
       LiveGzoneActivityIconTab liveGzoneAct;
       GzonePagerSlidingTabStrip$e uoe;
       j0 oj01;
       a d;
       j0 oj02;
       LiveGzoneFeatureEntrances liveGzoneFea1;
       LiveGzoneActivityIconTab liveGzoneAct1;
       GzonePagerSlidingTabStrip$e uoe1;
       j0 oj03;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       LiveGzoneAudienceFeatureEntranceItem obj = PatchProxy.applyOneRefs(p0, this, uoc, "23");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = LiveGzoneAudienceFeatureEntranceItem.fromEntranceId(p0);
       j0 oj0 = null;
       if (obj == null) {
          if (this.t.n.sa(p0)) {
             Object obj1 = PatchProxy.applyOneRefs(p0, this, uoc, "24");
             if (obj1 != patchProxyRe) {
                oj0 = obj1;
             }else {
                LiveGzoneFeatureEntrances liveGzoneFea = this.t.X0.T0(p0);
                if (liveGzoneFea != null && !TextUtils.x(liveGzoneFea.mUrl)) {
                   oj0 = this.R8(liveGzoneFea);
                }
             }
          }
          return oj0;
       }else {
          switch (c$c.a[obj.ordinal()]){
              case 1:
                str = a1.p(R.string.arg_RES_7f101ee7);
                liveGzoneAct = LiveGzoneActivityIconTab.b(this.getContext(), str);
                liveGzoneAct.setIcon(R.drawable.arg_RES_7f08128f);
                uoe = new GzonePagerSlidingTabStrip$e(obj.mEntranceId, liveGzoneAct);
                oj01 = new j0(p0, new f0(), 0x7f0d0b4f, uoe, this.m8().getContext());
                v12.a = true;
                break;
              case 2:
                str = a1.p(R.string.arg_RES_7f104e8c);
                liveGzoneAct = LiveGzoneActivityIconTab.b(this.getContext(), str);
                liveGzoneAct.setIcon(R.drawable.arg_RES_7f081291);
                uoe = new GzonePagerSlidingTabStrip$e(obj.mEntranceId, liveGzoneAct);
                oj01 = new j0(p0, new a(), 0x7f0d0b98, uoe, this.m8().getContext());
                v12.m = this.t;
                break;
              case 3:
                str = a1.p(R.string.arg_RES_7f10247a);
                liveGzoneAct = LiveGzoneActivityIconTab.b(this.getContext(), str);
                liveGzoneAct.setIcon(R.drawable.arg_RES_7f081290);
                uoe = new GzonePagerSlidingTabStrip$e(obj.mEntranceId, liveGzoneAct);
                Pair pair = d.a(0x2cb5d4a8).l50(this.t.U());
                oj02 = new j0(p0, pair.first, a.i(this.m8(), pair.second.intValue()), uoe);
                oj02.m = this.t.O.o3();
                break;
              case 4:
                d = this.t.S;
                if (d == null) {
                label_01f4 :
                   str = oj0;
                   liveGzoneAct = str;
                   uoe = liveGzoneAct;
                   oj02 = uoe;
                }else {
                   liveGzoneFea1 = d.a();
                   if (liveGzoneFea1 == null) {
                      goto label_01f4 ;
                   }else {
                      String str1 = TextUtils.k(liveGzoneFea1.mName);
                      liveGzoneAct1 = LiveGzoneActivityIconTab.b(this.getContext(), str1);
                      liveGzoneAct1.setIcon(R.drawable.arg_RES_7f08128d);
                      uoe1 = new GzonePagerSlidingTabStrip$e(obj.mEntranceId, liveGzoneAct1);
                      oj03 = new j0(obj.mEntranceId, new i(), 0x7f0d0beb, uoe1, this.m8().getContext());
                      v13.m = liveGzoneFea1;
                   label_0128 :
                      liveGzoneFea1 = str1;
                      liveGzoneAct = liveGzoneAct1;
                      uoe = uoe1;
                      oj02 = v13;
                   }
                }
                break;
              case 5:
                c tt = this.t;
                a t = tt.T;
                if (t == null || tt.d == null) {
                   goto label_01f4 ;
                }else {
                   liveGzoneFea1 = t.c();
                   if (liveGzoneFea1 != null) {
                      LiveGzoneFeatureEntrances liveGzoneFea2 = this.t.X0.T0(LiveGzoneAudienceFeatureEntranceItem.GIFT.mEntranceId);
                      if (liveGzoneFea2 != null) {
                         liveGzoneFea2 = liveGzoneFea2.mName;
                         liveGzoneAct1 = LiveGzoneActivityIconTab.b(this.getContext(), liveGzoneFea2);
                         liveGzoneAct1.setIcon(R.drawable.arg_RES_7f08128e);
                         uoe1 = new GzonePagerSlidingTabStrip$e(obj.mEntranceId, liveGzoneAct1);
                         oj03 = new j0(obj.mEntranceId, new i(), 0x7f0d0beb, uoe1, this.m8().getContext());
                         v13.m = liveGzoneFea1;
                         goto label_0128 ;
                      }else {
                         goto label_01f4 ;
                      }
                   }else {
                      goto label_01f4 ;
                   }
                }
                break;
              case 6:
                str = a1.p(R.string.arg_RES_7f1024a7);
                liveGzoneAct = LiveGzoneActivityIconTab.b(this.getContext(), str);
                liveGzoneAct.setIcon(R.drawable.arg_RES_7f080cc8);
                uoe = new GzonePagerSlidingTabStrip$e(obj.mEntranceId, liveGzoneAct);
                oj01 = new j0(p0, new c0(), 0x7f0d0c01, uoe, this.m8().getContext());
                v12.b = true;
                v12.m = this.t;
                break;
              default:
                goto label_01f4 ;
          }
          if (v12 == null) {
             return oj0;
          }
          uoe.k(str);
          uoe.g(false);
          liveGzoneAct.setRedDot(this.t.y.i(p0));
          liveGzoneAct.setEnableAlphaOnSelected(true);
          v12.f.i(this.W8(str, uoe.c()));
          v12.g = this.y;
          d = this.t.d;
          if (d != null) {
             v12.l = d.Sl(p0);
             v12.k = this.t.d.za(p0);
          }
          v12.n = p0;
          v12.o = obj;
          v12.r = 1;
          v12.p = false;
          b.d0(LiveGzoneLogTag.PLAY_STATION, "createTabPageByPendantId", "pendantId", p0, "priority", String.valueOf(v12.l));
          return v12;
       }
    }
    public final j0 R8(LiveGzoneFeatureEntrances p0){
       LiveGzoneActivityIconTab liveGzoneAct;
       GzonePagerSlidingTabStrip$e uoe;
       j0 oj01;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoc, "28");
       if (obj != patchProxyRe) {
          return obj;
       }
       boolean b = false;
       int i = 1;
       if (p0.isKrnUrl()) {
          j0 oj0 = PatchProxy.applyOneRefs(p0, this, uoc, "27");
          if (oj0 != patchProxyRe) {
          }else {
             p0.mType = i;
             liveGzoneAct = LiveGzoneActivityIconTab.b(this.getContext(), p0.mName);
             liveGzoneAct.setEnableAlphaOnSelected(i);
             liveGzoneAct.setIconUrl(p0.mTabIcons);
             uoe = new GzonePagerSlidingTabStrip$e(p0.mId, liveGzoneAct);
             uoe.k(p0.mName);
             uoe.g(b);
             oj01 = new j0(p0.mId, new a(), 0x7f0d04ac, uoe, this.m8().getContext());
             oj0.f.i(this.W8(p0.mName, p0.mId));
             oj0.g = this.y;
             oj0.m = p0;
             oj0.l = p0.mPriority;
             oj0.n = p0.mId;
             oj0.q = p0.isNormalH5();
             oj0.r = p0.mType;
             oj0.k = p0.mTabBarColor;
          }
          return oj0;
       }else {
          liveGzoneAct = LiveGzoneActivityIconTab.b(this.getContext(), p0.mName);
          liveGzoneAct.setEnableAlphaOnSelected(i);
          liveGzoneAct.setIconUrl(p0.mTabIcons);
          uoe = new GzonePagerSlidingTabStrip$e(p0.mId, liveGzoneAct);
          uoe.k(p0.mName);
          uoe.g(b);
          oj01 = new j0(p0.mId, new i(), 0x7f0d0beb, uoe, this.m8().getContext());
          liveGzoneAct.f.i(this.W8(p0.mName, p0.mId));
          liveGzoneAct.g = this.y;
          liveGzoneAct.m = p0;
          liveGzoneAct.l = p0.mPriority;
          liveGzoneAct.n = p0.mId;
          liveGzoneAct.q = p0.isNormalH5();
          liveGzoneAct.r = p0.mType;
          liveGzoneAct.k = p0.mTabBarColor;
          a d = this.t.d;
          if (d != null) {
             liveGzoneAct.p = d.u9();
          }
          return liveGzoneAct;
       }
    }
    public final int S8(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, c.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.V8();
       int i = (obj.get(p0) == null)? 0: obj.get(p0).intValue();
       return i;
    }
    public final HashMap V8(){
       Object[] objArray = null;
       Type obj = PatchProxy.apply(objArray, this, c.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new c$b(this).getType();
       String str = a.a.getString(b.d("user")+"live_gzone_activity_sub_tab_showed_count_map", "{}");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       if (objArray == null) {
          objArray = new HashMap();
       }
       return objArray;
    }
    public final View$OnClickListener W8(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(this, p1, p0);
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, c.class, "13")) {
          return;
       }
       this.L.a(this.t.m.a(), this.t.m.b(), null);
       return;
    }
    public final void Y8(String p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "22")) {
          return;
       }
       if (!p1) {
          if (this.z.containsKey(p0)) {
             return;
          }else if(!q.f(this.D)){
             Iterator iterator = this.D.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   j0 oj0 = iterator.next();
                   if (TextUtils.n(oj0.n, p0)) {
                      this.z.put(oj0.n, oj0);
                      return;
                   }
                }
             }
          }
          j0 oj01 = this.P8(p0);
          if (oj01 == null) {
             return;
          }else {
             this.z.put(p0, oj01);
             this.c9(false);
          }
       }else if(p1 == 8){
          j0 oj02 = this.z.remove(p0);
          if (oj02 != null && oj02.b != null) {
             this.c9(true);
          }
       }else {
          this.z.remove(p0);
          this.c9(false);
       }
       return;
    }
    public void Z8(int p0,LiveGzoneTabSource p1){
       j0 oj01;
       LiveGzoneTabSource liveGzoneTab;
       Boolean uBoolean = this;
       int i = p0;
       Object obj = p1;
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), obj, uBoolean, c.class, "11")) {
          return;
       }
       if (i > 0) {
          uBoolean.F = Boolean.TRUE;
       }
       if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), uBoolean, c.class, "15")) {
          PagerSlidingTabStrip$d uod = uBoolean.C.b(i);
          if (uod != null && !TextUtils.n(uBoolean.G, uod.c())) {
             uBoolean.G = uod.c();
          }
       }
       j0 oj0 = uBoolean.C.z(i);
       if (oj0 == null) {
          return;
       }else {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, oj0, j0.class, "3") && !oj0.c.R1()) {
             View view = a.i(oj0.d, oj0.e);
             oj0.d.addView(view);
             oj0.c.f(view);
             oj0.c();
          }
          int i1 = 1;
          if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), oj0, p1, this, c.class, "12")) {
             uBoolean.K = objArray;
             if (obj != null && obj != LiveGzoneTabSource.IGNORE) {
                String str = (oj0.b().f() != null)? oj0.b().f().toString(): objArray;
                this.X8();
                uBoolean.L.e(str, oj0.b().c(), i, uBoolean.O);
                if (uBoolean.t.E.v0()) {
                   uBoolean.L.c();
                }
                String str1 = "PLAY";
                String str2 = "ACTIVITY";
                String str3 = (uBoolean.N != null)? str1: str2;
                String str4 = oj0.b().c();
                c n = uBoolean.N;
                String str5 = (n != null)? str1: str2;
                if (n != null) {
                   str2 = str1;
                }
                ClientContent$LiveStreamPackage liveStreamPa = uBoolean.t.m.a();
                boolean b = uBoolean.C.B(i);
                LiveGzoneTabSource mValues = obj.mValues;
                a uoa1 = a.class;
                if (PatchProxy.isSupport(uoa1)) {
                   objArray = new Object[10];
                   objArray[0] = str3;
                   objArray[i1] = str;
                   objArray[2] = str4;
                   objArray[3] = Integer.valueOf(p0);
                   objArray[4] = str5;
                   objArray[5] = str2;
                   objArray[6] = Integer.valueOf(0);
                   objArray[7] = liveStreamPa;
                   objArray[8] = Boolean.valueOf(b);
                   objArray[9] = mValues;
                   liveGzoneTab = mValues;
                   if (PatchProxy.applyVoid(objArray, null, uoa1, "34")) {
                      oj01 = oj0;
                   label_01a0 :
                      b.d0(LiveGzoneLogTag.PLAY_STATION, "onSubPageSelected: ", obj.mValues, String.valueOf(p0), "id:", String.valueOf(uBoolean.C.d(i)));
                   label_01be :
                      if (!PatchProxy.isSupport(c.class) || (PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), obj, uBoolean, c.class, "16") || (!q.f(uBoolean.E) && i < uBoolean.D.size()))) {
                         Iterator iterator = uBoolean.E.iterator();
                         while (iterator.hasNext()) {
                            a$a uoa = iterator.next();
                            if (TextUtils.n(uoa.a, uBoolean.C.d(i))) {
                               uoa.a(obj);
                            }else {
                               uoa.b();
                            }
                         }
                      }
                      j0 oj02 = oj01;
                      if (!PatchProxy.applyVoidOneRefs(oj02, uBoolean, c.class, "14")) {
                         j0 m = oj02.m;
                         if (!m instanceof LiveGzoneFeatureEntrances || (m.isShowed == null && m.mShowCount > null)) {
                            m.isShowed = true;
                            int i2 = uBoolean.S8(m.mId) + true;
                            b.c0(LiveLogTag.GZONE, "addActivitySubTabCount\(\)", "showCount", i2+"");
                            HashMap hashMap = this.V8();
                            hashMap.put(m.mId, Integer.valueOf(i2));
                            SharedPreferences$Editor uEditor = a.a.edit();
                            uEditor.putString(b.d("user")+"live_gzone_activity_sub_tab_showed_count_map", b.e(hashMap));
                            g.a(uEditor);
                         }
                      }
                      return;
                   }
                }else {
                   liveGzoneTab = mValues;
                }
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "AGGR_PANEL_SUB_TAB_CONTENT";
                oj01 = oj0;
                i3 oi3 = a.c(str, str4, str5, str2, p0, 0);
                oi3.d("source", liveGzoneTab);
                oi3.d("panel_type", str3);
                oi3.c("is_with_dot", Integer.valueOf(b));
                uElementPack.params = oi3.e();
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = liveStreamPa;
                uContentPack.screenPackage = a.d();
                u1.u0(3, uElementPack, uContentPack);
                goto label_01a0 ;
             }
          }
          oj01 = oj0;
          goto label_01be ;
       }
    }
    public final void a9(String p0,LiveGzoneTabSource p1){
       j0 oj01;
       c uoc = c.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoc, "8")) {
          return;
       }
       if (!q.f(this.D) && (a1.i(this.getActivity()) && (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidThreeRefs(p0, Boolean.TRUE, p1, this, c.class, "9")))) {
          this.K = p1;
          int i = 0;
          while (true) {
             if (i < this.D.size()) {
                j0 oj0 = this.D.get(i);
                if (TextUtils.n(oj0.n, p0)) {
                label_006e :
                   oj01 = 1;
                }else if(TextUtils.x(p0)){
                   oj01 = (p1 == LiveGzoneTabSource.UNION_H5_PENDANT && oj0.r == 2)? 1: null;
                   if (p1 == LiveGzoneTabSource.ACTIVITY_PENDANT && oj0.r == 3) {
                      goto label_006e ;
                   }
                }else {
                   oj01 = null;
                }
                if (oj01) {
                   this.q.setCurrentItem(i, true);
                   if (!i && this.I != i) {
                      this.Z8(0, p1);
                      break ;
                   }
                }else {
                   i = i + 1;
                }
             }else {
                this.Z8(0, p1);
                break ;
             }
          }
       }
    label_0088 :
       return;
    }
    public boolean b9(c0 p0,Collection p1){
       j0 obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (q.f(p1)) {
          return false;
       }
       Iterator iterator = p1.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          obj = iterator.next();
          if ((obj.n).equals(p0.a()) && obj.f.b() instanceof LiveGzoneActivityIconTab) {
             break ;
          }
       }
       obj.f.b().setRedDot(p0);
       return true;
    }
    public void c9(boolean p0){
       Iterator iterator;
       int i;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "25")) {
          return;
       }
       if (!a1.i(this.getActivity())) {
          return;
       }
       int currentItem = this.q.getCurrentItem();
       if (currentItem < 0) {
          currentItem = 0;
       }
       c uoc1 = null;
       if (!q.f(this.D) && currentItem < this.D.size()) {
          uoc1 = this.D.get(currentItem);
       }
       Collection uCollection = this.z.values();
       if (p0) {
          iterator = this.D.iterator();
          while (iterator.hasNext()) {
             if (!uCollection.contains(iterator.next())) {
                iterator.remove();
             }
          }
       }
       iterator = uCollection.iterator();
       while (iterator.hasNext()) {
          j0 oj0 = iterator.next();
          if (this.D.contains(oj0) || (y.e(this.getActivity()) && oj0.p != null)) {
             continue ;
          }
          this.D.add(oj0);
       }
       Collections.sort(this.D, b.b);
       if (this.G != null) {
          c tF = this.F;
          if (tF != null && !tF.booleanValue()) {
             this.F = Boolean.TRUE;
          }else {
             i = this.D.indexOf(uoc1);
          label_00b7 :
             int i1 = 1;
             if (this.D.size() == i1) {
                this.r.N(false);
             }else {
                this.r.N(i1);
             }
             this.C.C(this.D);
             this.C.q();
             uoc = this.q;
             uoc.setOffscreenPageLimit(Math.max(uoc.getOffscreenPageLimit(), (this.D.size() + i1)));
             if (i < this.D.size() && (i >= 0 && i < this.r.getTabsContainer().getChildCount())) {
                this.q.setCurrentItem(i);
             }else {
                this.q.setCurrentItem(false);
             }
             this.r.q();
             if (q.f(this.D)) {
                KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
                uoa.b();
                uoa.a(this.s);
                this.s.setVisibility(false);
             }else {
                this.s.setVisibility(8);
             }
             return;
          }
       }
       i = 0;
       goto label_00b7 ;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a0d30);
       this.q = m1.f(p0, 0x7f0a1f67);
       this.r = m1.f(p0, 0x7f0a1f66);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, c.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(c.class, new m());
       }else {
          obj.put(c.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.t = this.q8(a.class);
       this.u = this.s8(e.class);
       this.M = this.r8("enableH5").booleanValue();
       this.N = this.r8("enableNative").booleanValue();
       return;
    }
}

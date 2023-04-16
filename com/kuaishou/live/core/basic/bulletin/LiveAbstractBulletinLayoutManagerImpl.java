package com.kuaishou.live.core.basic.bulletin.LiveAbstractBulletinLayoutManagerImpl;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager;
import android.app.Activity;
import i81.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import crd.a;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager$a$c;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager$GiftSlotSize;
import mrd.a;
import java.lang.Integer;
import java.lang.Boolean;
import p02.t;
import com.kuaishou.live.core.basic.bulletin.LiveAbstractBulletinLayoutManagerImpl$stageManager$1;
import msd.p;
import p02.s;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import com.kuaishou.live.core.basic.bulletin.LiveAbstractBulletinLayoutManagerImpl$verticalMarginConfigMap$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.core.basic.bulletin.LiveAbstractBulletinLayoutManagerImpl$a;
import java.util.LinkedHashSet;
import com.kuaishou.live.core.basic.bulletin.LiveAbstractBulletinLayoutManagerImpl$c;
import java.lang.Throwable;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.live.comments.bulletin.LiveBulletinViewType;
import java.util.Map;
import p02.w;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager$a$a;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.view.View;
import android.graphics.Rect;
import p02.x;
import android.view.ViewGroup;
import android.view.View$OnLayoutChangeListener;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager$BizType;
import com.yxcorp.utility.n;
import java.util.Set;
import com.kuaishou.live.comments.bulletin.LiveBulletinStageType;
import java.lang.Runnable;
import android.os.Handler;
import i81.c;
import i81.d;
import i81.a;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import p02.m;
import p02.g;
import java.util.List;
import p02.e;
import i81.b;
import com.kuaishou.live.core.basic.bulletin.LiveAbstractBulletinLayoutManagerImpl$d;
import java.util.Comparator;
import trd.x;
import java.lang.RuntimeException;
import androidx.constraintlayout.widget.a;
import i81.e;
import java.lang.Math;
import i81.f$a$a;
import lnc.a1;
import i81.f$a$c;
import com.yxcorp.utility.SystemUtil;
import w51.a;
import p02.c;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager$a$b;
import p02.f;
import com.kuaishou.live.core.basic.bulletin.LiveAbstractBulletinLayoutManagerImpl$b;
import java.lang.Enum;
import kotlin.collections.CollectionsKt__CollectionsKt;
import trd.u;
import kotlin.collections.CollectionsKt___CollectionsKt;
import qrd.l1;
import usd.q;
import p02.a;
import kotlin.NoWhenBranchMatchedException;

public abstract class LiveAbstractBulletinLayoutManagerImpl implements LiveBulletinLayoutManager	// class@000826
{
    public final Map A;
    public final a B;
    public final a C;
    public final a D;
    public final List E;
    public final p F;
    public final LiveAbstractBulletinLayoutManagerImpl$a G;
    public final LiveAbstractBulletinLayoutManagerImpl$a H;
    public final Set I;
    public final LiveAbstractBulletinLayoutManagerImpl$c J;
    public a K;
    public a L;
    public a M;
    public a N;
    public int O;
    public final Activity P;
    public final f Q;
    public final int R;
    public View a;
    public ConstraintLayout b;
    public ViewGroup c;
    public ViewGroup d;
    public ViewGroup e;
    public ViewGroup f;
    public ViewGroup g;
    public View h;
    public View i;
    public View j;
    public View k;
    public ViewGroup l;
    public ViewGroup m;
    public j n;
    public final a o;
    public final a p;
    public final a q;
    public final a r;
    public final a s;
    public t t;
    public final a u;
    public final a v;
    public final t w;
    public final s x;
    public f$a y;
    public final List z;

    public void LiveAbstractBulletinLayoutManagerImpl(Activity p0,f p1,int p2){
       a.p(p0, "activity");
       a.p(p1, "focusAreaManager");
       super();
       this.P = p0;
       this.Q = p1;
       this.R = p2;
       this.o = new a();
       a uoa = a.h(new LiveBulletinLayoutManager$a$c(LiveBulletinLayoutManager$GiftSlotSize.NORMAL));
       a.o(uoa, "BehaviorSubject.createDe…iftSlotSize.NORMAL\)\n    \)");
       this.p = uoa;
       Integer integer = Integer.valueOf(0);
       a uoa1 = a.h(integer);
       a.o(uoa1, "BehaviorSubject.createDefault\(0\)");
       this.q = uoa1;
       uoa1 = a.h(Boolean.FALSE);
       a.o(uoa1, "BehaviorSubject.createDefault\(false\)");
       this.r = uoa1;
       Boolean tRUE = Boolean.TRUE;
       a uoa2 = a.h(tRUE);
       a.o(uoa2, "BehaviorSubject.createDefault\(true\)");
       this.s = uoa2;
       uoa1 = a.h(tRUE);
       a.o(uoa1, "BehaviorSubject.createDefault\(true\)");
       this.u = uoa1;
       uoa1 = a.h(integer);
       a.o(uoa1, "BehaviorSubject.createDefault\(0\)");
       this.v = uoa1;
       this.w = new t(new LiveAbstractBulletinLayoutManagerImpl$stageManager$1(this));
       this.x = new s(p2);
       this.z = new ArrayList();
       this.A = new LinkedHashMap();
       uoa1 = a.h(integer);
       a.o(uoa1, "BehaviorSubject.createDefault\(0\)");
       this.B = uoa1;
       uoa1 = a.h(integer);
       a.o(uoa1, "BehaviorSubject.createDefault\(0\)");
       this.C = uoa1;
       uoa = a.h(integer);
       a.o(uoa, "BehaviorSubject.createDefault\(0\)");
       this.D = uoa;
       this.E = new ArrayList();
       this.F = s.c(new LiveAbstractBulletinLayoutManagerImpl$verticalMarginConfigMap$2(this));
       this.G = new LiveAbstractBulletinLayoutManagerImpl$a();
       this.H = new LiveAbstractBulletinLayoutManagerImpl$a();
       this.I = new LinkedHashSet();
       this.J = new LiveAbstractBulletinLayoutManagerImpl$c(this);
    }
    public static void E(LiveAbstractBulletinLayoutManagerImpl p0,String p1,Throwable p2,int p3,Object p4){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidTwoRefs(p1, null, p0, LiveAbstractBulletinLayoutManagerImpl.class, "77")) {
       }else {
          b.g0(LiveLogTag.COMMENT, "CommentAreaOpt BulletinLayoutManager "+p1, null);
       }
       return;
    }
    public final a A(){
       return this.p;
    }
    public final a B(){
       return this.q;
    }
    public final int C(int p0,LiveBulletinLayoutManager$a p1){
       LiveBulletinViewType obj;
       LiveAbstractBulletinLayoutManagerImpl liveAbstract = LiveAbstractBulletinLayoutManagerImpl.class;
       if (PatchProxy.isSupport(liveAbstract)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, liveAbstract, "76");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = LiveBulletinViewType.GIFT_SLOT;
       int i = this.u(obj);
       w ow = this.D().get(obj);
       int i1 = (ow != null)? ow.c(i): 0;
       if (!p1 instanceof LiveBulletinLayoutManager$a$a) {
          i = i + i1;
       }
       i1 = p0 - i;
       Resources resources = this.P.getResources();
       a.o(resources, "activity.resources");
       b.Z(LiveLogTag.COMMENT, "getTopGuideLineForHalfScreenFocus "+i1+' '+"= "+p0+" - "+i+' '+p1+' '+c.c(resources).density+"dpi");
       return i1;
    }
    public final Map D(){
       Object obj = PatchProxy.apply(null, this, LiveAbstractBulletinLayoutManagerImpl.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.F.getValue();
    }
    public final int F(int p0){
       Rect obj;
       LiveAbstractBulletinLayoutManagerImpl liveAbstract = LiveAbstractBulletinLayoutManagerImpl.class;
       if (PatchProxy.isSupport(liveAbstract)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, liveAbstract, "42");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       liveAbstract = this.a;
       if (liveAbstract == null) {
          a.S("rootView");
       }
       obj = x.a(liveAbstract);
       LiveAbstractBulletinLayoutManagerImpl tb = this.b;
       if (tb == null) {
          a.S("bulletinContainer");
       }
       return ((obj.height() - p0) - (obj.bottom - x.a(tb).bottom));
    }
    public abstract void G(float p0);
    public final void H(int p0){
       LiveAbstractBulletinLayoutManagerImpl tc;
       LiveAbstractBulletinLayoutManagerImpl liveAbstract = LiveAbstractBulletinLayoutManagerImpl.class;
       if (PatchProxy.isSupport(liveAbstract) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, liveAbstract, "52")) {
          return;
       }
       Throwable throwable = null;
       LiveAbstractBulletinLayoutManagerImpl.E(this, "updateGifSlotMinHeight minHeight: "+p0, throwable, 2, throwable);
       String str = "giftSlotArea";
       if (p0 <= 0) {
          tc = this.c;
          if (tc == null) {
             a.S(str);
          }
          tc.setTranslationY(0);
          if (this.J.b()) {
             tc = this.c;
             if (tc == null) {
                a.S(str);
             }
             tc.removeOnLayoutChangeListener(this.J);
          }
          LiveAbstractBulletinLayoutManagerImpl.E(this, "updateGifSlotMinHeight translationY: 0", throwable, 2, throwable);
       }else {
          LiveAbstractBulletinLayoutManagerImpl tJ = this.J;
          tJ.c = p0;
          if (!tJ.b()) {
             p0.b = true;
             tc = this.c;
             if (tc == null) {
                a.S(str);
             }
             tc.addOnLayoutChangeListener(this.J);
          }
          tc = this.J;
          tJ = this.c;
          if (tJ == null) {
             a.S(str);
          }
          tc.a(tJ.getBottom());
       }
       return;
    }
    public void a(int p0){
       LiveAbstractBulletinLayoutManagerImpl liveAbstract = LiveAbstractBulletinLayoutManagerImpl.class;
       if (PatchProxy.isSupport(liveAbstract) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, liveAbstract, "62")) {
          return;
       }
       this.v.onNext(Integer.valueOf(p0));
       return;
    }
    public void b(LiveBulletinLayoutManager$BizType p0,int p1){
       LiveAbstractBulletinLayoutManagerImpl liveAbstract = LiveAbstractBulletinLayoutManagerImpl.class;
       if (PatchProxy.isSupport(liveAbstract) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, liveAbstract, "56")) {
          return;
       }
       a.p(p0, "bizType");
       int i = this.F((n.j(this.P) - p1));
       LiveAbstractBulletinLayoutManagerImpl.E(this, "updateGifSlotMinHeight "+p0+" heightInWindow: "+p1+" heightToBottom:"+i, null, 2, null);
       this.H.d(p0, i);
       return;
    }
    public void d(LiveBulletinLayoutManager$BizType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAbstractBulletinLayoutManagerImpl.class, "57")) {
          return;
       }
       a.p(p0, "bizType");
       this.H.a(p0);
       return;
    }
    public void e(boolean p0,Object p1){
       LiveAbstractBulletinLayoutManagerImpl liveAbstract = LiveAbstractBulletinLayoutManagerImpl.class;
       if (PatchProxy.isSupport(liveAbstract) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, liveAbstract, "61")) {
          return;
       }
       a.p(p1, "biz");
       if (p0) {
          if (this.I.contains(p1)) {
             this.I.remove(p1);
          }
          if (this.I.isEmpty()) {
             this.u.onNext(Boolean.TRUE);
          }
       }else {
          this.I.add(p1);
          this.u.onNext(Boolean.FALSE);
       }
       return;
    }
    public void f(LiveBulletinStageType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAbstractBulletinLayoutManagerImpl.class, "55")) {
          return;
       }
       a.p(p0, "stage");
       LiveAbstractBulletinLayoutManagerImpl tw = this.w;
       Objects.requireNonNull(tw);
       t ot = t.class;
       if (!PatchProxy.applyVoidOneRefs(p0, tw, ot, "2")) {
          a.p(p0, "stageType");
          b.d0(LiveLogTag.COMMENT, "exitStage", "type", p0, "current type", tw.b);
          if (tw.b == p0) {
             tw.b = LiveBulletinStageType.None;
             if (!PatchProxy.applyVoid(null, tw, ot, "4")) {
                tw.a.postDelayed(tw.d, 100);
             }
          }
       }
       return;
    }
    public void h(LiveBulletinLayoutManager$BizType p0,int p1){
       LiveAbstractBulletinLayoutManagerImpl liveAbstract = LiveAbstractBulletinLayoutManagerImpl.class;
       if (PatchProxy.isSupport(liveAbstract) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, liveAbstract, "58")) {
          return;
       }
       a.p(p0, "bizType");
       this.G.d(p0, p1);
       return;
    }
    public void i(LiveBulletinStageType p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAbstractBulletinLayoutManagerImpl.class, "54")) {
          return;
       }
       a.p(p0, "stage");
       this.w.a(p0, p1);
       return;
    }
    public void j(LiveBulletinViewType p0,int p1,d p2){
       if (PatchProxy.isSupport(LiveAbstractBulletinLayoutManagerImpl.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, LiveAbstractBulletinLayoutManagerImpl.class, "70")) {
          return;
       }
       a.p(p0, "viewType");
       a.p(p2, "requestCallback");
       this.q(p0, p1, false, p2);
       return;
    }
    public void k(LiveBulletinLayoutManager$BizType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAbstractBulletinLayoutManagerImpl.class, "59")) {
          return;
       }
       a.p(p0, "bizType");
       this.G.a(p0);
       return;
    }
    public void l(boolean p0){
       LiveAbstractBulletinLayoutManagerImpl tl;
       LiveAbstractBulletinLayoutManagerImpl liveAbstract = LiveAbstractBulletinLayoutManagerImpl.class;
       if (PatchProxy.isSupport(liveAbstract) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveAbstract, "60")) {
          return;
       }
       if (p0) {
          tl = this.l;
          if (tl != null) {
             tl.setVisibility(0);
          }
       }else {
          tl = this.l;
          if (tl != null) {
             tl.setVisibility(8);
          }
       }
       return;
    }
    public void m(a p0){
       LiveBulletinViewType liveBulletin;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveAbstractBulletinLayoutManagerImpl liveAbstract = LiveAbstractBulletinLayoutManagerImpl.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveAbstract, "67")) {
          return;
       }
       a.p(p0, "bizShrinkStrategy");
       LiveAbstractBulletinLayoutManagerImpl tz = this.z;
       int i = 0;
       if (!tz instanceof Collection || !tz.isEmpty()) {
          Iterator iterator = tz.iterator();
          while (true) {
             if (iterator.hasNext()) {
                LiveBulletinViewType liveBulletin1 = (iterator.next().a().getViewType() == p0.getViewType())? 1: null;
                if (liveBulletin1) {
                   liveBulletin = 1;
                   break ;
                }
             }
          }
          if (!liveBulletin) {
             if (p0.getViewType() == LiveBulletinViewType.GIFT_SLOT) {
                g og = PatchProxy.applyOneRefs(p0, this, liveAbstract, "68");
                if (og != patchProxyRe) {
                }else {
                   og = new g(this, p0);
                }
                p0 = og;
             }
             m om = new m(p0, i);
             this.z.add(om);
             this.A.put(om.a().getViewType(), om);
             liveBulletin = p0.getViewType();
             e uoe = PatchProxy.applyOneRefs(liveBulletin, this, liveAbstract, "69");
             if (uoe != patchProxyRe) {
             }else {
                uoe = new e(this, liveBulletin);
             }
             p0.c(uoe);
             LiveAbstractBulletinLayoutManagerImpl tz1 = this.z;
             if (tz1.size() > 1) {
                x.p0(tz1, new LiveAbstractBulletinLayoutManagerImpl$d());
             }
             return;
          }else {
             throw new RuntimeException(p0.getViewType()+" bizShrinkStrategy has been registered!!");
          }
       }
       liveBulletin = null;
       goto label_0046 ;
    }
    public final a n(a p0){
       a obj = PatchProxy.applyOneRefs(p0, this, LiveAbstractBulletinLayoutManagerImpl.class, "79");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a();
       obj.j(p0);
       return obj;
    }
    public abstract e o(LiveBulletinStageType p0,c p1);
    public abstract Map p();
    public final void q(LiveBulletinViewType p0,int p1,boolean p2,d p3){
       int i2;
       int i3;
       LiveAbstractBulletinLayoutManagerImpl this;
       int i8;
       int i9;
       s a;
       String str1;
       StringBuilder str2;
       Object obj3;
       LiveAbstractBulletinLayoutManagerImpl$b uob1;
       s os1;
       s os2;
       LiveAbstractBulletinLayoutManagerImpl liveAbstract1;
       int i10;
       Throwable throwable;
       Iterator iterator1;
       String obj4;
       s os3;
       ArrayList obj5;
       a uoa1;
       LiveAbstractBulletinLayoutManagerImpl liveAbstract3;
       m obj6;
       int i13;
       a obj7;
       s os5;
       Throwable throwable1;
       LiveBulletinViewType obj8;
       LiveAbstractBulletinLayoutManagerImpl obj10;
       int i16;
       int i = this;
       Object obj = p0;
       int i1 = p1;
       Object obj1 = p3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveAbstractBulletinLayoutManagerImpl liveAbstract = LiveAbstractBulletinLayoutManagerImpl.class;
       if (PatchProxy.isSupport(liveAbstract) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), p3, this, LiveAbstractBulletinLayoutManagerImpl.class, "71")) {
          return;
       }
       if (PatchProxy.isSupport(liveAbstract)) {
          Object[] obj2 = PatchProxy.applyTwoRefs(obj, Integer.valueOf(p1), i, liveAbstract, "72");
          if (obj2 != patchProxyRe) {
             i2 = obj2.intValue();
          label_0050 :
             i3 = i2;
          label_0053 :
             if (this.r() && obj == LiveBulletinViewType.BOTTOM_BUBBLE) {
                i.O = i3;
             }
             String str = "availableHeight:";
             a uoa = null;
             int i4 = 10;
             this = null;
             if (PatchProxy.isSupport(liveAbstract)) {
                obj2 = PatchProxy.applyTwoRefs(obj, Integer.valueOf(i3), i, liveAbstract, "63");
                if (obj2 != patchProxyRe) {
                   i2 = obj2.intValue();
                }else if(i.y instanceof f$a$a){
                   if (PatchProxy.isSupport(liveAbstract)) {
                      obj8 = PatchProxy.applyTwoRefs(obj, Integer.valueOf(i3), i, liveAbstract, "65");
                      if (obj8 != patchProxyRe) {
                         i2 = obj8.intValue();
                      }
                   }
                   obj8 = LiveBulletinViewType.GIFT_SLOT;
                   if (obj == obj8) {
                      i2 = i3;
                   }else {
                      obj6 = i.A.get(obj8);
                      i2 = (obj6 != null)? obj6.b(): 0;
                   }
                   Object obj9 = i.v.i();
                   a.m(obj9);
                   i2 = ((a1.e((float)obj9.intValue()) + a1.d(0x7f070618)) + i2) + i.O;
                }else if(PatchProxy.isSupport(liveAbstract)){
                   obj10 = PatchProxy.applyTwoRefs(obj, Integer.valueOf(i3), i, liveAbstract, "64");
                   if (obj10 != patchProxyRe) {
                      i2 = obj10.intValue();
                   }
                }
                obj10 = PatchProxy.apply(uoa, i, liveAbstract, "75");
                if (obj10 != patchProxyRe) {
                   i2 = obj10.intValue();
                }else {
                   obj10 = i.y;
                   if (!obj10 instanceof f$a$c) {
                      i2 = 0;
                   }else if(SystemUtil.K() && a.e()){
                      i2 = a1.e((float)a.e());
                   }else {
                      i2 = i.F(obj10.a().bottom);
                   }
                }
                i9 = i.w(obj, i3);
                Object obj11 = i.D.i();
                a.m(obj11);
                a.o(obj11, "focusAreaBottomExtraSpaceSubject.value!!");
                i8 = Math.max((i2 - obj11.intValue()), this);
                LiveBulletinLayoutManager$a uoa2 = i.p.i();
                if (uoa2 instanceof LiveBulletinLayoutManager$a$a) {
                   i16 = this.y().a();
                }else if(uoa2 instanceof LiveBulletinLayoutManager$a$b){
                   i16 = this.y().b();
                }else if(uoa2 instanceof LiveBulletinLayoutManager$a$c || uoa2 == null){
                   i16 = 0;
                }else {
                   throw new NoWhenBranchMatchedException();
                }
                i8 = ((i8 + i16) - i9) + i.O;
                str1 = "before LiveBulletinShrinkStrategy: calculate\n"+"focusAreaBottom:"+i2+i4+"focusAreaBottomExtraSpaceSubject:"+i.D.i()+i4+"giftSlotHeightAboveTopGuideline"+i16+i4+"containerTotalMargin:"+i9+i4+str+i8+i4;
                a.o(str1, "it");
                throwable1 = null;
                LiveAbstractBulletinLayoutManagerImpl.E(i, str1, throwable1, 2, throwable1);
                i2 = i8;
             }else {
                goto label_007f ;
             }
             if (obj == LiveBulletinViewType.GIFT_SLOT) {
                f uof = PatchProxy.applyOneRefs(obj1, i, liveAbstract, "73");
                if (uof != patchProxyRe) {
                }else {
                   uof = new f(i, obj1);
                }
                obj1 = uof;
             }
             LiveAbstractBulletinLayoutManagerImpl$b uob = new LiveAbstractBulletinLayoutManagerImpl$b(i, obj, i3, i1);
             LiveAbstractBulletinLayoutManagerImpl x = i.x;
             int i5 = Math.max(i2, 0);
             this = i.z;
             Objects.requireNonNull(x);
             s os = s.class;
             int i6 = 5;
             int i7 = 4;
             i8 = 6;
             i9 = 1;
             if (PatchProxy.isSupport(os)) {
                obj2 = new Object[]{obj,Integer.valueOf(i3),Integer.valueOf(i5),Boolean.valueOf(p2),this,obj1,uob};
                if (!PatchProxy.applyVoid(obj2, x, os, "1")) {
                label_026d :
                   a.p(obj, "requestViewType");
                   a.p(this, "bizShrinkStrategyList");
                   a.p(obj1, "requestCallback");
                   a.p(uob, "calculateCallback");
                   if (x.b == null) {
                      if (!this.isEmpty()) {
                         x.b = i9;
                         a = x.a;
                         str1 = "requestChangeHeight before calculate\n";
                         if (PatchProxy.isSupport(os)) {
                            str2 = str1;
                            obj3 = obj1;
                            uob1 = uob;
                            os1 = a;
                            os2 = os;
                            liveAbstract1 = this;
                            i10 = 10;
                            throwable = uoa;
                            str1 = PatchProxy.applyFourRefs(p0, Integer.valueOf(i3), Integer.valueOf(i5), this, x, s.class, "2");
                            if (str1 != patchProxyRe) {
                            label_0372 :
                               b.Z(os1, str2+str1);
                               Iterator iterator = liveAbstract1.iterator();
                               int i11 = 0;
                               while (iterator.hasNext()) {
                                  m om = iterator.next();
                                  i9 = (om.a().getViewType() == obj)? i3: om.b();
                                  i11 = i11 + i9;
                               }
                               i11 = i11 + x.c;
                               int[] ointArray = new int[liveAbstract1.size()];
                               iterator1 = liveAbstract1.iterator();
                               i8 = 0;
                               while (iterator1.hasNext()) {
                                  obj4 = iterator1.next();
                                  i4 = i8 + 1;
                                  if (i8 < 0) {
                                     CollectionsKt__CollectionsKt.W();
                                  }
                                  ointArray[i8] = obj4.b();
                                  i8 = i4;
                               }
                               i11 = i11 - i5;
                               if (PatchProxy.isSupport(os2)) {
                                  obj2 = new Object[]{Integer.valueOf(i11),obj,Integer.valueOf(i3),obj3,liveAbstract,Boolean.valueOf(p2)};
                                  liveAbstract = liveAbstract1;
                                  os3 = os2;
                                  obj5 = PatchProxy.apply(obj2, x, os3, "3");
                                  if (obj5 != patchProxyRe) {
                                     i2 = obj5.intValue();
                                     i6 = i5;
                                  label_0400 :
                                     i9 = 0;
                                     b.Z(x.a, "requestMoreHeight:"+i2+" moveUpHeight:"+q.n(i2, i9));
                                     if (!p2) {
                                        uob1.a((Math.max(i2, 0) + i6));
                                     }
                                     x.b = false;
                                  }
                               }else {
                                  os3 = os2;
                                  liveAbstract = liveAbstract1;
                                  uoa1 = null;
                               }
                               obj5 = new ArrayList(u.Y(liveAbstract, i10));
                               iterator1 = liveAbstract.iterator();
                               i8 = 0;
                               i10 = 0;
                               while (iterator1.hasNext()) {
                                  obj4 = iterator1.next();
                                  i4 = i8 + 1;
                                  if (i8 < 0) {
                                     CollectionsKt__CollectionsKt.W();
                                  }
                                  if (obj4.a().getViewType() == obj) {
                                     i10 = i8;
                                     i8 = i3;
                                  }else {
                                     i8 = obj4.b();
                                  }
                                  obj5.add(Integer.valueOf(i8));
                                  i8 = i4;
                               }
                               List list = CollectionsKt___CollectionsKt.J5(obj5);
                               String str3 = "\nrequestHeight:";
                               b.Z(x.a, "\n_spaceNeedToShrink:"+i11+"\nrequestViewType:"+obj+str3+i3+"\nheightList:"+list);
                               i9 = liveAbstract.size();
                               i8 = i11;
                               i11 = 0;
                               obj4 = "\ndiff:";
                               String str4 = "\nnewHeight:";
                               String str5 = "\nspaceNeedToShrink:";
                               while (i11 < i9) {
                                  uoa1 = liveAbstract.get(i11).a();
                                  if (i8 <= 0) {
                                     break ;
                                  }
                                  int i14 = list.get(i11).intValue();
                                  i9 = i14 - i8;
                                  i9 = uoa1.b(Math.max(i9, 0));
                                  i5 = i14 - i9;
                                  list.set(i11, Integer.valueOf(i9));
                                  i8 = i8 - i5;
                                  b.Z(x.a, "\nfirst onDryRun:"+uoa1.getViewType()+str4+i9+obj4+i5+str5+i8);
                                  i11++;
                                  i9 = i9;
                                  os3 = os3;
                                  i5 = i5;
                                  liveAbstract = liveAbstract;
                                  list = list;
                                  uoa1 = null;
                               }
                               LiveAbstractBulletinLayoutManagerImpl liveAbstract2 = liveAbstract;
                               i6 = i5;
                               s os4 = os3;
                               List list1 = list;
                               b.Z(x.a, str3+i3+"\ntargetNewHeight:"+list1.get(i10).intValue()+str5+i8);
                               if (i8 < 0) {
                                  i2 = liveAbstract2.size() - 1;
                                  while (i2 >= 0 && i8 < 0) {
                                     liveAbstract3 = liveAbstract2;
                                     obj7 = liveAbstract3.get(i2).a();
                                     if (obj7.getViewType() != p0) {
                                        i11 = list1.get(i2).intValue();
                                        i13 = i11 - i8;
                                        i13 = obj7.b(i13);
                                        i11 = i13 - i11;
                                        list1.set(i2, Integer.valueOf(i13));
                                        i8 = i8 + i11;
                                        b.Z(x.a, "\nsecond onDryRun:"+obj7.getViewType()+str4+i13+obj4+i11+str5+i8);
                                     }
                                     i2 = i2 - 1;
                                     liveAbstract2 = liveAbstract3;
                                  }
                               }
                               liveAbstract3 = liveAbstract2;
                               int i12 = i8;
                               if (!p2) {
                                  Iterator iterator2 = list1.iterator();
                                  i11 = 0;
                                  while (iterator2.hasNext()) {
                                     obj6 = iterator2.next();
                                     i13 = i11 + 1;
                                     if (i11 < 0) {
                                        CollectionsKt__CollectionsKt.W();
                                     }
                                     i3 = obj6.intValue();
                                     obj6 = liveAbstract3.get(i11);
                                     if (i11 == i10) {
                                        if (PatchProxy.isSupport(os4) && PatchProxy.applyVoidFourRefs(p0, obj3, liveAbstract3, Integer.valueOf(i3), x, s.class, "5")) {
                                           obj7 = obj3;
                                        }else {
                                           iterator = liveAbstract3.iterator();
                                           while (true) {
                                              if (iterator.hasNext()) {
                                                 throwable1 = iterator.next();
                                                 i11 = (throwable1.a().getViewType() == p0)? 1: 0;
                                                 if (!i11) {
                                                    continue ;
                                                 }
                                              }else {
                                                 throwable1 = throwable;
                                              }
                                              if (throwable1 != null) {
                                                 throwable1.c(i3);
                                              }
                                              obj7 = obj3;
                                              obj7.a(i3);
                                           }
                                        }
                                        os5 = os4;
                                     }else {
                                        obj7 = obj3;
                                        if (PatchProxy.isSupport(os4)) {
                                           os5 = os4;
                                           if (!PatchProxy.applyVoidTwoRefs(obj6, Integer.valueOf(i3), x, os5, "4")) {
                                           }
                                        }else {
                                           os5 = os4;
                                        }
                                     }
                                     obj3 = obj7;
                                     os4 = os5;
                                     i11 = i13;
                                  }
                               }else {
                                  obj3.a(list1.get(i10).intValue());
                               }
                               i2 = i12;
                               goto label_0400 ;
                            }
                         }else {
                            str2 = str1;
                            os2 = os;
                            liveAbstract1 = this;
                            throwable = uoa;
                            obj3 = obj1;
                            uob1 = uob;
                            i10 = 10;
                            int i15 = 1;
                            os1 = a;
                         }
                         str1 = "viewType:"+p0.name()+i10+"height:"+i3+i10+str+i5+i10;
                         iterator1 = liveAbstract1.iterator();
                         while (iterator1.hasNext()) {
                            m om1 = iterator1.next();
                            str1 = str1+om1.a().getViewType().name()+':'+om1.b()+i10;
                         }
                         str1 = str1;
                         a.o(str1, "StringBuilder\(\).apply {\n…\n      }\n    }.toString\(\)");
                         goto label_0372 ;
                      }
                   }else {
                      throw new RuntimeException("请勿在onDryRun/onHeightDeterminedChanged中调用requestChangeHeight");
                   }
                }
             }else {
                liveAbstract1 = null;
                goto label_026d ;
             }
             return;
          }
       }
       if (obj == LiveBulletinViewType.GIFT_SLOT) {
          i2 = Math.max(i1, this.z());
          goto label_0050 ;
       }else {
          i3 = i1;
          goto label_0053 ;
       }
    }
    public abstract boolean r();
    public abstract boolean s();
    public abstract boolean t();
    public final int u(LiveBulletinViewType p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAbstractBulletinLayoutManagerImpl.class, "78");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       m om = this.A.get(p0);
       int i = (om != null)? om.b(): 0;
       return i;
    }
    public final ViewGroup v(){
       LiveAbstractBulletinLayoutManagerImpl obj = PatchProxy.apply(null, this, LiveAbstractBulletinLayoutManagerImpl.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e;
       if (obj == null) {
          a.S("commentListContainer");
       }
       return obj;
    }
    public final int w(LiveBulletinViewType p0,int p1){
       LiveBulletinViewType[] obj;
       int i2;
       LiveAbstractBulletinLayoutManagerImpl liveAbstract = LiveAbstractBulletinLayoutManagerImpl.class;
       if (PatchProxy.isSupport(liveAbstract)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, liveAbstract, "66");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = new LiveBulletinViewType[]{LiveBulletinViewType.ENTER_ROOM,LiveBulletinViewType.ENTER_ROOM_OLD,LiveBulletinViewType.COMBO_COMMENT,LiveBulletinViewType.GIFT_SLOT,LiveBulletinViewType.BOTTOM_BUBBLE};
       int i = 0;
       Iterator iterator = CollectionsKt__CollectionsKt.L(obj).iterator();
       int i1 = 0;
       while (iterator.hasNext()) {
          LiveBulletinViewType liveBulletin = iterator.next();
          if (p0 == liveBulletin) {
             i2 = p1;
          }else {
             m om = this.A.get(liveBulletin);
             i2 = (om != null)? om.b(): 0;
          }
          w ow = this.D().get(liveBulletin);
          i2 = (ow != null)? ow.c(i2): 0;
          StringBuilder str = liveBulletin+"  margin: "+i2+10;
          i1 = i1 + i2;
       }
       w ow1 = this.D().get(LiveBulletinViewType.SCROLL_COMMENT);
       if (ow1 != null) {
          i = ow1.a() + ow1.b();
       }
       i1 = i1 + i;
       String str1 = "SCROLL_COMMENT margin: "+i+10+"totalMargin: "+i1;
       a.o(str1, "it");
       LiveAbstractBulletinLayoutManagerImpl.E(this, str1, null, 2, null);
       return i1;
    }
    public final ViewGroup x(){
       LiveAbstractBulletinLayoutManagerImpl obj = PatchProxy.apply(null, this, LiveAbstractBulletinLayoutManagerImpl.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj == null) {
          a.S("giftSlotArea");
       }
       return obj;
    }
    public abstract c y();
    public final int z(){
       LiveBulletinLayoutManager$a obj = PatchProxy.apply(null, this, LiveAbstractBulletinLayoutManagerImpl.class, "74");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.p.i();
       int i = 0;
       if (obj instanceof LiveBulletinLayoutManager$a$a) {
          i = this.y().a();
       }else if(obj instanceof LiveBulletinLayoutManager$a$b){
          i = this.y().b();
       }else if(obj instanceof LiveBulletinLayoutManager$a$c || obj == null){
          throw new NoWhenBranchMatchedException();
       }
       return i;
    }
}

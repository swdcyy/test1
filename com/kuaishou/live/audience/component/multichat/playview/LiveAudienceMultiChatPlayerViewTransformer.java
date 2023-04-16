package com.kuaishou.live.audience.component.multichat.playview.LiveAudienceMultiChatPlayerViewTransformer;
import com.kwai.video.waynelive.LivePlayerController;
import ee1.a;
import ke3.d;
import ga1.c;
import mw1.c;
import aq5.d;
import xp5.g;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import android.app.Activity;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ke3.f;
import xo1.f;
import je3.g;
import crd.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import fe3.a;
import mrd.a;
import com.kuaishou.live.audience.component.multichat.playview.LiveAudienceMultiChatPlayerViewTransformer$b;
import com.kuaishou.live.audience.component.multichat.playview.LiveAudienceMultiChatPlayerViewTransformer$a;
import com.kuaishou.live.audience.component.multichat.playview.LiveAudienceMultiChatPlayerViewTransformer$topBarView$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.audience.component.multichat.playview.LiveAudienceMultiChatPlayerViewTransformer$bottomBarView$2;
import com.kuaishou.live.audience.component.multichat.playview.LiveAudienceMultiChatPlayerViewTransformer$playerViewWrapper$2;
import ga1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import p51.c;
import java.lang.StringBuilder;
import ga1.b;
import com.kuaishou.live.common.core.basic.player.AdaptPlayViewReason;
import android.view.ViewGroup;
import java.lang.Number;
import lnc.a1;
import com.kuaishou.live.core.basic.utils.e;
import com.yxcorp.utility.n;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import fe3.e;
import fe3.d;
import com.kwai.framework.model.user.User;
import fe3.g;
import ae1.c;
import tkd.b;
import tkd.d;
import ym5.a;
import va1.b0;
import qsd.d;
import java.lang.Integer;
import java.lang.Float;
import rkd.b;
import com.kuaishou.android.live.model.QLivePlayConfig;
import kotlin.collections.ArraysKt___ArraysKt;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.UnsupportedOperationException;

public final class LiveAudienceMultiChatPlayerViewTransformer	// class@000baa
{
    public final f a;
    public final a b;
    public boolean c;
    public final a d;
    public LayoutConfig e;
    public final IMediaPlayer$OnVideoSizeChangedListener f;
    public final b g;
    public final p h;
    public final p i;
    public final p j;
    public boolean k;
    public int l;
    public final LivePlayerController m;
    public final a n;
    public final d o;
    public final c p;
    public final c q;
    public final d r;
    public final g s;
    public final LiveStreamFeedWrapper t;
    public final LiveBizParam u;
    public final Activity v;
    public final View w;

    public void LiveAudienceMultiChatPlayerViewTransformer(LivePlayerController p0,a p1,d p2,c p3,c p4,d p5,g p6,LiveStreamFeedWrapper p7,LiveBizParam p8,Activity p9,View p10){
       a.p(p0, "playerController");
       a.p(p1, "liveRTCManager");
       a.p(p2, "delegate");
       a.p(p3, "playerViewService");
       a.p(p4, "audiencePlayViewService");
       a.p(p5, "bizManager");
       a.p(p6, "liveInfoManager");
       a.p(p7, "feed");
       a.p(p8, "liveBizParam");
       a.p(p9, "activity");
       a.p(p10, "rootView");
       super();
       this.m = p0;
       this.n = p1;
       this.o = p2;
       this.p = p3;
       this.q = p4;
       this.r = p5;
       this.s = p6;
       this.t = p7;
       this.u = p8;
       this.v = p9;
       this.w = p10;
       this.a = new f(new f(p0), p2, 1);
       this.b = new a();
       this.c = p5.r2(AudienceBizRelation.CHAT_VIDEO_STATUS_VIEW);
       a uoa = a.h(new a(-1, -1));
       a.o(uoa, "BehaviorSubject.createDefault\(Size\(-1, -1\)\)");
       this.d = uoa;
       this.f = new LiveAudienceMultiChatPlayerViewTransformer$b(this);
       this.g = new LiveAudienceMultiChatPlayerViewTransformer$a(this);
       this.h = s.c(new LiveAudienceMultiChatPlayerViewTransformer$topBarView$2(this));
       this.i = s.c(new LiveAudienceMultiChatPlayerViewTransformer$bottomBarView$2(this));
       this.j = s.c(new LiveAudienceMultiChatPlayerViewTransformer$playerViewWrapper$2(this));
    }
    public final void a(boolean p0,boolean p1,a p2){
       int bottom;
       b uob;
       View view1;
       AdaptPlayViewReason vIDEO_CHATTI;
       LiveAudienceMultiChatPlayerViewTransformer liveAudience = LiveAudienceMultiChatPlayerViewTransformer.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), p2, this, LiveAudienceMultiChatPlayerViewTransformer.class, "12")) {
          return;
       }
       c uoc = PatchProxy.apply(null, this, liveAudience, "1");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = this.q.j();
       }
       if (uoc != null) {
          Object[] objArray = new Object[0];
          this.j("enableChat="+p0+",isThemeSwitch="+p1+",model="+p2, objArray);
          if (p0 && p2 != null) {
             if (!PatchProxy.applyVoidTwoRefs(p2, uoc, this, liveAudience, "13")) {
                uoc.i(0);
                View view = this.g();
                a.o(view, "topBarView");
                bottom = view.getBottom();
                uob = new b(this.i(), this.q.getVideoSizeRatio(), bottom, this.q.f(), this.q.b(), AdaptPlayViewReason.MULTI_CHAT_VIDEO_CHATTING_FIT, p2);
                uoc.a(PatchProxy.applyVoidTwoRefs(p2, uoc, this, liveAudience, "13"));
             }
          }else if(p0){
             if (!PatchProxy.applyVoidOneRefs(uoc, this, liveAudience, "14")) {
                uoc.i(true);
                view1 = this.g();
                a.o(view1, "topBarView");
                bottom = view1.getBottom();
                uob = new b(this.i(), this.q.getVideoSizeRatio(), bottom, this.q.f(), this.q.b(), AdaptPlayViewReason.VIDEO_CHATTING_START, null);
                uoc.a(true);
             }
          }else if(p1){
             vIDEO_CHATTI = AdaptPlayViewReason.VIDEO_CHATTING_THEME_SWITCH;
          }else {
             vIDEO_CHATTI = AdaptPlayViewReason.VIDEO_CHATTING_END;
          }
          AdaptPlayViewReason uAdaptPlayVi = vIDEO_CHATTI;
          if (!PatchProxy.applyVoidTwoRefs(uoc, uAdaptPlayVi, this, liveAudience, "15")) {
             uoc.i(0);
             view1 = this.g();
             a.o(view1, "topBarView");
             bottom = view1.getBottom();
             uob = new b(this.i(), this.q.getVideoSizeRatio(), bottom, this.q.f(), this.q.b(), uAdaptPlayVi, null);
             uoc.a(PatchProxy.applyVoidTwoRefs(uoc, uAdaptPlayVi, this, liveAudience, "15"));
          }
          this.k = p0;
          return;
       }else {
          Object[] objArray1 = new Object[0];
          this.j("fitScreenHelper is null", objArray1);
          return;
       }
    }
    public final ViewGroup b(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiChatPlayerViewTransformer.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i.getValue();
    }
    public final int c(){
       ViewGroup obj = PatchProxy.apply(null, this, LiveAudienceMultiChatPlayerViewTransformer.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b();
       a.o(obj, "bottomBarView");
       int height = obj.getHeight();
       if (height <= 0) {
          height = a1.d(R.dimen.arg_RES_7f0705b7);
       }
       return (height + a1.d(0x7f07034b));
    }
    public final int d(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiChatPlayerViewTransformer.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((a1.d(0x7f070268) + e.k(this.v, this.u.mIsStatusBarSolid)) + a1.d(0x7f070271));
    }
    public final int e(){
       LiveAudienceMultiChatPlayerViewTransformer obj = PatchProxy.apply(null, this, LiveAudienceMultiChatPlayerViewTransformer.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.l;
       if (obj > null) {
          return obj;
       }
       int height = this.w.getHeight();
       LiveAudienceMultiChatPlayerViewTransformer tv = this.v;
       if (height <= 0 && tv != null) {
          height = n.j(tv);
       }
       this.l = (height - this.d()) - this.c();
       Object[] objArray = new Object[0];
       this.j("audience multi chat init MaxChatWindowHeight="+this.l, objArray);
       return this.l;
    }
    public final View f(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiChatPlayerViewTransformer.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
    public final View g(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiChatPlayerViewTransformer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.getValue();
    }
    public final void h(boolean p0,boolean p1,LayoutConfig p2){
       Object[] objArray;
       Object[] obj2;
       int b;
       String obj3;
       int i2;
       Object[] obj5;
       String str1;
       ViewGroup viewGroup;
       int i3;
       int i4;
       int i5;
       Object[] obj3;
       float f1;
       float f3;
       int f3;
       int i6;
       LiveAudienceMultiChatPlayerViewTransformer liveAudience = this;
       Object obj = p2;
       LiveAudienceMultiChatPlayerViewTransformer liveAudience1 = LiveAudienceMultiChatPlayerViewTransformer.class;
       if (PatchProxy.isSupport(liveAudience1) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), p2, this, LiveAudienceMultiChatPlayerViewTransformer.class, "7")) {
          return;
       }
       int i = 0;
       if (p0) {
          if (!liveAudience.p.bk()) {
             objArray = new Object[i];
             liveAudience.j("enableOverlayChat", objArray);
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             a obj1 = PatchProxy.applyOneRefs(obj, liveAudience, liveAudience1, "16");
             int i1 = 1;
             if (obj1 != patchProxyRe) {
                obj2 = obj1;
             }else if(obj == null){
                objArray = new Object[i];
                liveAudience.j("layoutConfig is null ", objArray);
             }else if(p2.c() != i1){
                Object[] objArray1 = new Object[i];
                liveAudience.j("layoutType is invalid"+p2.c(), objArray1);
             }else {
                ArrayList uArrayList = new ArrayList();
                Iterator iterator = p2.e().iterator();
                while (iterator.hasNext()) {
                   obj3 = iterator.next();
                   d obj4 = obj3;
                   if (obj4.h() != null) {
                      obj4 = obj4.h();
                      a.m(obj4);
                      String str = obj4.b();
                      User user = liveAudience.s.I();
                      String id = (user != null)? user.getId(): null;
                      i2 = a.g(str, id) ^ i1;
                      if (i2) {
                         obj5 = 1;
                      label_00b8 :
                         if (obj5) {
                            uArrayList.add(obj3);
                         }
                      }
                   }
                   obj5 = null;
                   goto label_00b8 ;
                }
                iterator = uArrayList.iterator();
                if (!iterator.hasNext()) {
                   obj3 = null;
                }else {
                   obj3 = iterator.next();
                   if (iterator.hasNext()) {
                      i2 = obj3.e().d();
                      Object obj9 = iterator.next();
                      int i7 = obj9.e().d();
                      while (i2 > i7) {
                         obj3 = obj9;
                         i2 = i7;
                         break ;
                         i5 = p2;
                      }
                      if (iterator.hasNext()) {
                      }
                   }
                }
                Object obj6 = obj3;
                if (obj6 != null) {
                   iterator = uArrayList.iterator();
                   if (!iterator.hasNext()) {
                      str1 = null;
                   }else {
                      str1 = iterator.next();
                      if (iterator.hasNext()) {
                         f3 = str1.e().d();
                         Object obj8 = iterator.next();
                         i6 = obj8.e().d();
                         while (f3 < i6) {
                            str1 = obj8;
                            f3 = i6;
                            break ;
                            i5 = p2;
                         }
                         if (iterator.hasNext()) {
                         }
                      }
                   }
                   Object obj7 = str1;
                   if (obj7 != null) {
                      obj1 = p2.d();
                      c uoc = PatchProxy.applyTwoRefs(obj6, obj1, liveAudience, liveAudience1, "18");
                      obj3 = "bottomBarView";
                      float f = 0x3f800000;
                      if (uoc != patchProxyRe) {
                      }else {
                         i2 = n.j(liveAudience.v);
                         float f4 = (float)n.k(liveAudience.v);
                         float f5 = (float)i2;
                         float f6 = (f4 * f) / f5;
                         float videoSizeRat = liveAudience.m.getVideoSizeRatio();
                         f1 = ((float)obj6.e().c() * f) / (float)obj1.d();
                         float f7 = ((float)obj6.e().d() * f) / (float)obj1.c();
                         float f8 = ((float)obj6.e().b() * f) / (float)obj1.d();
                         f = ((float)obj6.e().a() * 0x3f800000) / (float)obj1.c();
                         boolean b1 = b0.a();
                         if (d.a(0x4c5dd1b8).f2() && (b1 && (videoSizeRat - (float)1 < 0 && this.f() != null))) {
                            View view = this.f();
                            a.m(view);
                            videoSizeRat = videoSizeRat * f5;
                            b = d.H0((((0x3f800000 - f1) - f8) * videoSizeRat));
                            ViewGroup viewGroup1 = this.b();
                            a.o(viewGroup1, obj3);
                            i4 = d.H0(((((0x3f800000 - f7) - f) * f5) - (float)viewGroup1.getHeight())) + (i2 - view.getBottom());
                            i3 = d.H0((f5 * f));
                            i2 = d.H0((videoSizeRat * f8));
                         }else if(videoSizeRat - f6 >= 0){
                            videoSizeRat = videoSizeRat * f5;
                            b = d.H0((((0x3f800000 - f1) - f8) * videoSizeRat));
                            viewGroup = this.b();
                            a.o(viewGroup, obj3);
                            i4 = d.H0(((((0x3f800000 - f7) - f) * f5) - (float)viewGroup.getHeight()));
                            i3 = d.H0((f5 * f));
                            i2 = d.H0((videoSizeRat * f8));
                         }else {
                            b = d.H0((((0x3f800000 - f1) - f8) * f4));
                            float f9 = f4 / videoSizeRat;
                            viewGroup = this.b();
                            a.o(viewGroup, obj3);
                            i4 = d.H0(((((0x3f800000 - f7) - f) * f9) - (float)viewGroup.getHeight()));
                            i3 = d.H0((f9 * f));
                            i2 = d.H0((f4 * f8));
                         }
                         uoc = new c(b, i4, (i2 + a1.d(0x7f0702ac)), i3);
                      }
                      viewGroup = this.b();
                      a.o(viewGroup, obj3);
                      b = (uoc.a() + uoc.b()) + viewGroup.getHeight();
                      i3 = liveAudience.w.getHeight() - b;
                      i4 = i3 - this.d();
                      i5 = 6;
                      obj3 = new Object[i5];
                      obj3[0] = "currentChatWindowTop";
                      obj3[1] = Integer.valueOf(b);
                      obj3[2] = "currentTopMargin";
                      obj3[3] = Integer.valueOf(i3);
                      obj3[4] = "topMarginDiff";
                      obj3[5] = Integer.valueOf(i4);
                      liveAudience.j("getMultiChatWindowAdapterModel", obj3);
                      if (i4 <= 0) {
                         a uoa = p2.d();
                         obj2 = PatchProxy.applyThreeRefs(obj7, obj6, uoa, this, LiveAudienceMultiChatPlayerViewTransformer.class, "17");
                         if (obj2 != patchProxyRe) {
                         }else {
                            f1 = (((float)obj7.e().d() * 0x3f800000) / (float)uoa.c()) + (((float)obj7.e().a() * 0x3f800000) / (float)uoa.c());
                            float f2 = f1 - (((float)obj6.e().d() * 0x3f800000) / (float)uoa.c());
                            i4 = liveAudience.w.getHeight();
                            f3 = (float)liveAudience.w.getHeight() * f2;
                            obj5 = new Object[i5];
                            obj5[0] = " chatContainerHeight";
                            obj5[1] = Float.valueOf(f3);
                            obj5[2] = " MaxChatWindowHeight";
                            obj5[3] = Integer.valueOf(this.e());
                            obj5[4] = " rootHeight";
                            obj5[5] = Integer.valueOf(liveAudience.w.getHeight());
                            liveAudience.j(" getAdapterModelByFitBottom ", obj5);
                            if (f3 - (float)this.e() > 0) {
                               i4 = d.H0(((float)this.e() / f2));
                               obj5 = new Object[0];
                               liveAudience.j("getAdapterModelByFitBottom playerViewHeight="+i4, obj5);
                            }
                            f2 = (float)i4;
                            f3 = d.H0((liveAudience.q.getVideoSizeRatio() * f2));
                            a uoa1 = new a();
                            uoa1.c = i4;
                            uoa1.d = f3;
                            uoa1.a = (liveAudience.w.getWidth() - f3) / 2;
                            i6 = 1;
                            uoa1.b = this.c() - d.H0((f2 * ((float)i6 - f1)));
                            objArray = new Object[i5];
                            objArray[0] = "bottomMarginRatio ";
                            objArray[i6] = Float.valueOf(f1);
                            objArray[2] = "playerViewHeight ";
                            objArray[3] = Integer.valueOf(i4);
                            objArray[4] = "adapterModel  ";
                            objArray[5] = uoa1;
                            liveAudience.j("getAdapterModelByFitBottom fit bottom adapter model ", objArray);
                            obj2 = uoa1;
                         }
                      }
                   }else {
                      b = 0;
                      objArray = new Object[b];
                      liveAudience.j("bottomWindow is null ", objArray);
                   label_0051 :
                      obj1 = null;
                   label_03fc :
                      liveAudience.a(true, b, obj1);
                   }
                }else {
                   b = 0;
                   objArray = new Object[b];
                   liveAudience.j("topWindow is null ", objArray);
                   goto label_0051 ;
                }
             }
             b = false;
             goto label_0051 ;
             obj1 = obj2;
             b = false;
             goto label_03fc ;
          }else {
             obj2 = new Object[0];
             liveAudience.j("PlayViewSize is Empty", obj2);
          }
       }else {
          b = 0;
          if (liveAudience.k != null) {
             objArray = new Object[b];
             liveAudience.j("disableOverlayChat", objArray);
             liveAudience.a(b, p1, null);
          }else {
             obj2 = new Object[b];
             liveAudience.j("keepCurrent", obj2);
          }
       }
       return;
    }
    public final boolean i(){
       boolean b;
       QLivePlayConfig obj = PatchProxy.apply(null, this, LiveAudienceMultiChatPlayerViewTransformer.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (b.g()) {
          b = b.e();
       }else {
          obj = this.t.getLivePlayConfig();
          a.o(obj, "feed.livePlayConfig");
          b = obj.isLandscape();
       }
       return b;
    }
    public final void j(String p0,Object[] p1){
       String str;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceMultiChatPlayerViewTransformer.class, "23")) {
          return;
       }
       int i = 0;
       int i1 = 1;
       int i2 = (!p1.length)? 1: 0;
       if (i2 ^ i1) {
          object oobject = (!p1.length)? 1: null;
          if (!oobject) {
             oobject = p1[i];
             i = ArraysKt___ArraysKt.Rd(p1);
             if (i1 <= i) {
                while (true) {
                   object oobject1 = p1[i1];
                   int i3 = i1 % 2;
                   if (!i3) {
                      str = oobject+", "+oobject1;
                   label_005c :
                      if (i1 != i) {
                         i1 = i1 + 1;
                      }
                   }else {
                      str = oobject+"=["+oobject1+']';
                      goto label_005c ;
                   }
                }
             }
             b.Z(LiveCommonLogTag.NEW_MULTI_CHAT, "[PlayViewController]:"+p0+" {"+str+'}');
          }else {
             throw new UnsupportedOperationException("Empty array can\'t be reduced.");
          }
       }else {
          b.Z(LiveCommonLogTag.NEW_MULTI_CHAT, "[PlayViewController]:"+p0);
       }
       return;
    }
}

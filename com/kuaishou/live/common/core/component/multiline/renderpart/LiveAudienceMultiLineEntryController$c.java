package com.kuaishou.live.common.core.component.multiline.renderpart.LiveAudienceMultiLineEntryController$c;
import lq1.f;
import com.kuaishou.live.common.core.component.multiline.renderpart.LiveAudienceMultiLineEntryController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sq1.e;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import nq1.d;
import com.kuaishou.live.common.core.component.multiline.renderpart.LiveAudienceMultiLineEntryController$initBasicModel$1;
import sz1.e;
import msd.l;
import ee3.d0;
import brd.t;
import sq1.d;
import erd.g;
import crd.b;
import sq1.a;
import com.kuaishou.live.livestage.videopipe.renderarea.ui.RenderAreaView;
import android.content.Context;
import com.kuaishou.live.viewcontroller.ViewController;
import android.widget.FrameLayout;
import android.view.View;
import je3.i;
import com.kuaishou.live.livestage.g;
import com.kuaishou.live.livestage.f;
import com.kuaishou.live.livestage.f$a$b;
import com.kuaishou.live.livestage.f$b;
import fe3.b;
import f02.d;
import com.kuaishou.live.livestage.f$a;
import kotlin.jvm.internal.a;
import re3.c;
import ee3.e;
import f02.b;
import ke3.d;
import com.kuaishou.live.livestage.VideoRenderMode;
import qrd.l1;
import l02.f;
import oq1.e;
import com.kuaishou.live.common.core.component.multiline.renderpart.LiveAudienceMultiLineEntryController$initLiveMultiLineUserTagLogManager$1;
import oq1.b;
import xp5.i;
import ls1.h;
import com.kuaishou.live.common.multiinteract.biz.adapter.BizEndReason;
import sq1.c;
import java.lang.Enum;
import rq1.a;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;
import lh3.b;
import nh3.b;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import nh3.c;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Integer;
import lq1.c;
import java.lang.System;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiLineChatOpened;
import lq1.e;

public final class LiveAudienceMultiLineEntryController$c implements f	// class@0014f4
{
    public final LiveAudienceMultiLineEntryController a;

    public void LiveAudienceMultiLineEntryController$c(LiveAudienceMultiLineEntryController p0){
       this.a = p0;
       super();
    }
    public void a(){
       LiveAudienceMultiLineEntryController liveAudience = LiveAudienceMultiLineEntryController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceMultiLineEntryController$c.class, "1")) {
          return;
       }
       b.P(e.a, "coreModelObserver - onLineStart ");
       LiveAudienceMultiLineEntryController$c ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, liveAudience, "5")) {
          d uod = new d(ta.B, new LiveAudienceMultiLineEntryController$initBasicModel$1(ta), objArray);
          ta.k = uod;
          uod.c().subscribe(new d(ta));
       }
       this.a.E.a();
       ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, liveAudience, "7")) {
          if (!PatchProxy.applyVoid(objArray, ta, liveAudience, "6") && ta.r == null) {
             ta.r = new RenderAreaView(ta.D2());
             ta.Y2().addView(ta.r);
          }
          i oi = ta.B.Rf();
          g og = ta.B.vi();
          if (og != null && (oi != null && ta.r != null)) {
             LiveAudienceMultiLineEntryController r = ta.r;
             a.m(r);
             f$a$b uoa$b = f.s.b().b(new b(2, d.a(ta.B))).w(r).x(oi).C(e.b).u(ta.Z2()).A(VideoRenderMode.ALWAYS);
             LiveAudienceMultiLineEntryController k = ta.k;
             if (k == null) {
                a.S("multiLineBasicModel");
             }
             f uof = uoa$b.y(k).c();
             og.e(uof);
             ta.p = uof;
          }
       }
    label_00e4 :
       ta = this.a;
       ta.E.i(ta.w);
       ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, liveAudience, "20")) {
          ta.m = new e(ta.z, ta.F, new LiveAudienceMultiLineEntryController$initLiveMultiLineUserTagLogManager$1(ta.E));
       }
       h.b.c();
       return;
    }
    public void b(BizEndReason p0){
       LiveAudienceMultiLineEntryController$c a;
       String str;
       Object obj = this;
       LiveAudienceMultiLineEntryController obj1 = p0;
       LiveAudienceMultiLineEntryController liveAudience = LiveAudienceMultiLineEntryController.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, LiveAudienceMultiLineEntryController$c.class, "2")) {
          return;
       }
       a.p(obj1, "bizEndReason");
       b.P(e.a, "coreModelObserver - onLineEnd ");
       obj.a.E.b();
       obj.a.a3();
       a = obj.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoid(null, a, liveAudience, "8")) {
          LiveAudienceMultiLineEntryController p = a.p;
          if (p != null) {
             g og = a.B.vi();
             if (og != null) {
                og.a(p);
             }
          }
          a.p = null;
       }
       a = obj.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoid(null, a, liveAudience, "9")) {
          liveAudience = a.r;
          if (liveAudience != null) {
             a.Y2().removeView(liveAudience);
          }
          a.r = null;
       }
       int i = c.a[p0.ordinal()];
       if (i != 1) {
          if (i == 2) {
             obj1 = obj.a.t;
             if (obj1 != null && (!PatchProxy.applyVoid(null, obj1, a.class, "4") && obj1.a != null)) {
                SCInteractiveChatRoomInfo sCInteractiv = obj1.n.b();
                if (sCInteractiv != null) {
                   a.m(sCInteractiv);
                   b uob = obj1.e(sCInteractiv);
                   if (!q.f(uob.f())) {
                      List list = uob.f();
                      a.m(list);
                      Iterator iterator = list.iterator();
                      while (true) {
                         if (iterator.hasNext()) {
                            c uoc = iterator.next();
                            a.o(uoc, "userInfo");
                            if (a.g(uoc.c().mId, obj1.l)) {
                               str = uoc.b();
                            label_00d6 :
                               obj1.d.clear();
                               obj1.e.clear();
                               obj1.b(10, "MULTI_LIVE_CHAT_MODE_PLAY", str, uob.a(), "AUTHOR_EXIT", Integer.valueOf(uob.b()), uob.c(), obj1.a(obj1.o), obj1.o.Y(), System.currentTimeMillis(), obj1.b, obj1.d, obj1.e, obj1.f);
                               obj1.d();
                            }
                         }
                      }
                   }
                   str = null;
                   goto label_00d6 ;
                }
             }
          }
       }else {
          obj1 = obj.a.t;
          if (obj1 != null) {
             obj1.c();
          }
       }
       obj1 = obj.a.t;
       if (obj1 != null) {
          obj1.d();
       }
       LiveAudienceMultiLineEntryController$c a1 = obj.a;
       a1.t = null;
       a1.E.j(a1.w);
       obj.a.m = null;
       return;
    }
    public void c(SCLiveMultiLineChatOpened p0){
       e.c(this, p0);
    }
}

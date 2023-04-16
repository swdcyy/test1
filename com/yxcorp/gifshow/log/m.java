package com.yxcorp.gifshow.log.m;
import m2b.h;
import com.yxcorp.gifshow.log.n;
import java.lang.Object;
import k2b.k2;
import java.util.Objects;
import f3b.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.System;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.log.ActivityLifecycleCallbacks;
import com.yxcorp.gifshow.log.b;
import com.google.common.base.Optional;
import com.yxcorp.gifshow.log.t;
import k2b.j3;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.util.List;
import f3b.l;
import k2b.b;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Iterator;
import com.yxcorp.gifshow.log.n$b;
import java.lang.ref.WeakReference;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.yxcorp.gifshow.log.model.CommonParams;
import android.view.View;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import g3b.g;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$EventPackage;
import k2b.s1;
import ekd.e0;
import k2b.k3;
import k2b.b3;
import com.google.common.collect.ImmutableList;
import k2b.a0;
import y2b.b;
import k2b.x1;
import com.yxcorp.gifshow.numberfour.NumberFourEventType;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.gifshow.log.o;
import v2b.e;
import java.lang.Exception;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.packages.nano.ClientLog$ReportEvent;
import k2b.w0;
import java.lang.Runnable;
import android.os.Handler;
import f3b.o;
import java.lang.Throwable;
import k2b.z1;

public final class m implements h	// class@0011ea
{
    public final n a;

    public void m(n p0){
       this.a = p0;
    }
    public final void a(k2 p0,int p1){
       n h;
       String str1;
       ClientEvent$ShowEvent showEvent2;
       n y;
       int i7;
       String str3;
       k2 x;
       k2 c;
       Object[] objArray;
       f uof1;
       ClientEvent$UrlPackage page2;
       ClientEvent$UrlPackage identity;
       ClientEvent$UrlPackage pageSeq;
       ClientEvent$ShowEvent referUrlPack;
       String str4;
       ClientEvent$ShowEvent action;
       w0 obj1;
       ClientLog$ReportEvent reportEvent;
       w0 i61;
       ClientLog$ReportEvent reportEvent1;
       Optional optional;
       Object obj = p0;
       int i = p1;
       m a = this.a;
       Objects.requireNonNull(a);
       f uof = f.class;
       n on = n.class;
       if (!PatchProxy.isSupport(on) || !PatchProxy.applyVoidTwoRefs(obj, Integer.valueOf(p1), a, on, "74")) {
          long l = System.currentTimeMillis();
          ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
          ActivityLifecycleCallbacks uActivityLif = 2;
          int i1 = 1;
          int i2 = (TextUtils.x(p0.o()))? 1: 2;
          showEvent.type = i2;
          showEvent.action = i;
          showEvent.status = (i == uActivityLif)? i1: obj.n;
          int b = false;
          n on1 = 3;
          if (i == i1) {
             a.k = b;
             i2 = 1;
          }else if(i == on1){
             a.k = b;
             optional = 3;
          }else if(i == uActivityLif){
             optional = (a.k != null)? 2: 4;
          }else {
             optional = 0;
          }
          if (!p0.j()) {
             obj.v(a.i);
          }
          int i3 = -1;
          if (i == i1) {
             showEvent.timeCost = p0.f();
             h = a.h;
             int i4 = a.m + i1;
             a.m = i4;
             Objects.requireNonNull(h);
             if (!PatchProxy.isSupport(ActivityLifecycleCallbacks.class) || !PatchProxy.applyVoidTwoRefs(obj, Integer.valueOf(i4), h, ActivityLifecycleCallbacks.class, "21")) {
                ActivityLifecycleCallbacks c2 = h.c;
                if (c2 != null) {
                   b uob3 = b.class;
                   if (!PatchProxy.isSupport(uob3) || !PatchProxy.applyVoidTwoRefs(obj, Integer.valueOf(i4), c2, uob3, "17")) {
                      Optional optional1 = c2.P.c(obj);
                      if (optional1.isPresent() && optional1.get().p == i3) {
                         optional1.get().p = i4;
                      }
                   }
                }
             }
          }
          String str = null;
          if (i == i1 || i == on1) {
             showEvent.showType = p0.j();
             b = a.l + i1;
             a.l = b;
             showEvent.pageShowSeq = b;
             a.s = i1;
             n g = a.g;
             Objects.requireNonNull(g);
             if (!PatchProxy.applyVoidOneRefs(obj, g, j3.class, "3")) {
                j3 d = g.d;
                String str5 = "SourceTopPage set to: ";
                str1 = "TopPageManager";
                if (d != null) {
                   g.b = d;
                   Log.g(str1, str5+g.b);
                   g.d = str;
                   Log.g(str1, "Clear override source.");
                }else if(g.a.contains(obj.d)){
                   g.b = obj.d+l.b(obj.g);
                   Log.g(str1, str5+g.b);
                }
             }
             if (a.r != null || (i == i1 && (a.o != i3 && (a.l0() != null && (a.l0().c() != null && a.o != a.l0().c().E()))))) {
                a.n = obj.a;
                a.p = a.q;
                a.o = i3;
                a.q = str;
                a.r = false;
             }else {
                n$b uob2 = null;
             }
             if (!a.t.isEmpty()) {
                Iterator iterator = a.t.iterator();
                while (iterator.hasNext()) {
                   n$b uob = iterator.next();
                   a.Y(uob.a, uob.b, uob.c.get(), uob.f, uob.e, uob.d, null);
                   i1 = 1;
                }
                a.t.clear();
             }
          }
          n h1 = a.h;
          h = a.n;
          n p = a.p;
          str1 = a.g.a();
          Objects.requireNonNull(h1);
          int i5 = i2;
          k2 int i6 = 2;
          ClientEvent$ShowEvent showEvent1 = showEvent;
          n on2 = on;
          if (!PatchProxy.applyVoidFourRefs(p0, h, p, str1, h1, ActivityLifecycleCallbacks.class, "22")) {
             ActivityLifecycleCallbacks c1 = h1.c;
             if (c1 != null && !PatchProxy.applyVoidFourRefs(p0, h, p, str1, c1, b.class, "18")) {
                optional = c1.P.c(obj);
                if (optional.isPresent()) {
                   optional.get().q = h;
                   optional.get().r = p;
                   optional.get().s = str1;
                }
             }
          }
          if (i == i6) {
             showEvent2 = showEvent1;
             showEvent2.stayLength = p0.n();
             showEvent2.showType = p0.k();
             a.i = p0.k();
             a.s = false;
          }else {
             showEvent2 = showEvent1;
          }
          showEvent2.subAction = i5;
          showEvent2.urlPackage = a.Q1(obj);
          showEvent2.referUrlPackage = a.R1(obj.t);
          String str2 = "";
          a.U1(i6, str2, showEvent2);
          k2 t = obj.t;
          if (t != null) {
             showEvent2.referElementPackage = t.u;
          }
          if (i != i6) {
             showEvent2.contentPackage = obj.v;
          }else {
             k2 w = obj.w;
             showEvent2.contentPackage = w;
             if (w == null) {
                showEvent2.contentPackage = obj.v;
             }
          }
          showEvent2.contentWrapper = TextUtils.I(obj.y);
          l.a(showEvent2.referUrlPackage, showEvent2.referElementPackage, false);
          a.C.p(showEvent2, f.e(showEvent2), "PAGE_SHOW_EVENT", "UNKNOWN2", showEvent2.urlPackage.topPage);
          ClientEvent$ShowEvent contentPacka = showEvent2.contentPackage;
          if (contentPacka != null) {
             ClientContent$ContentPackage photoPackage = contentPacka.photoPackage;
             ClientContent$FeedLogContext uFeedLogCont = null;
             if (photoPackage != null) {
                photoPackage.feedLogCtx = uFeedLogCont;
             }
             ClientContent$ContentPackage liveStreamPa = contentPacka.liveStreamPackage;
             if (liveStreamPa != null) {
                liveStreamPa.feedLogCtx = uFeedLogCont;
             }
          }else {
             h = null;
          }
          ClientEvent$EventPackage uEventPackag = new ClientEvent$EventPackage();
          uEventPackag.showEvent = showEvent2;
          Iterator iterator1 = a.x.iterator();
          while (iterator1.hasNext()) {
             s1 os1 = iterator1.next();
             try{
                ClientEvent$ShowEvent urlPackage = showEvent2.urlPackage;
                os1.d(urlPackage.page2, showEvent2.subAction, urlPackage.params);
             }catch(java.lang.Exception e0){
                Log.g("LogManager", "Error while dispatching onPageChanged to "+os1);
                goto label_02c2 ;
             }
          }
          if (e0.a) {
             y = a.y;
             if (y != null) {
                y.a(showEvent2.urlPackage.page2, a.d.r().d);
             }
          }
          b uob1 = a.x1(obj);
          if (n.A1().Q()) {
             contentPacka = showEvent2.action;
             i2 = 1;
             i7 = 3;
             if (contentPacka == i2 || (contentPacka == i7 && showEvent2.urlPackage != null)) {
                y = a.H;
                NumberFourEventType pAGE_SHOW = NumberFourEventType.PAGE_SHOW;
                boolean b1 = SystemUtil.L(a.a);
                try{
                   y.e(uEventPackag, pAGE_SHOW, b1, uob1);
                   if (showEvent2.action == i2) {
                      e.d().a("PV_ENTER", showEvent2.urlPackage.page2, i2);
                   }
                   if (showEvent2.action == i7) {
                      e.d().a("PV_RESUME", showEvent2.urlPackage.page2, i2);
                   }
                }catch(java.lang.Exception e0){
                   Log.d("LogManager", "bucketManager error£º"+e0.getMessage());
                }
             }
          }else {
             i2 = 1;
             i7 = 3;
          }
       }
       return;
    }
}

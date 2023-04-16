package com.yxcorp.gifshow.featured.detail.featured.preinit.f;
import mn5.c;
import com.yxcorp.gifshow.featured.detail.featured.preinit.c;
import ok.x;
import com.google.common.base.Suppliers;
import com.yxcorp.gifshow.featured.detail.featured.preinit.f$a;
import com.yxcorp.gifshow.featured.detail.featured.preinit.a;
import com.yxcorp.gifshow.featured.detail.featured.preinit.b;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import yda.b;
import androidx.fragment.app.FragmentActivity;
import android.os.Bundle;
import com.yxcorp.gifshow.featured.detail.featured.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.eve.kit.api.NasaSwitch;
import e50.g;
import com.kuaishou.eve.kit.rerank.BizPage;
import ff6.d;
import wkd.b;
import nda.a;
import android.content.Intent;
import android.app.Activity;
import lda.d;
import com.yxcorp.gifshow.featured.feedprefetcher.g;
import e50.m;
import androidx.fragment.app.Fragment;
import tkd.b;
import tkd.d;
import hn5.n;
import yda.a;
import s3a.c;
import com.yxcorp.gifshow.entity.QPhoto;
import p5a.c;
import com.kwai.framework.player.core.b;
import java.lang.Boolean;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import kp.r1;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.kwai.video.player.mid.manifest.v2.Adaptation;
import com.kwai.video.player.mid.manifest.v2.Representation;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import ekd.x0;
import lo5.a;
import ko5.c;
import on5.b;
import com.kwai.kcube.TabIdentifier;
import uy6.h;
import uy6.b;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.c;
import uv8.m1;
import com.kwai.component.feedsmonitor.f;
import mda.c;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.featured.detail.featured.preinit.d;
import mda.d;
import mda.e;
import lnc.c2;
import com.kwai.component.feedsmonitor.FeedMonitor$b;
import com.kwai.component.feedsmonitor.FeedMonitor;
import com.kwai.component.feedsmonitor.pool.b;
import com.kwai.component.feedsmonitor.pool.FeedPoolLifecycle;
import com.kwai.component.feedsmonitor.report.FeedReportLifecycle;
import mda.b;
import androidx.lifecycle.LifecycleOwner;

public class f implements c	// class@000f52
{
    public final AtomicReference a;
    public FragmentActivity b;
    public final AtomicInteger c;
    public final g d;
    public QPhoto e;
    public static final x f;
    public static final f$a g;
    public static boolean h;
    public static final x i;
    public static final x j;
    public static g k;

    static {
       f.f = Suppliers.a(c.b);
       f.g = new f$a();
       f.i = Suppliers.a(a.b);
       f.j = Suppliers.a(b.b);
       f.k = null;
    }
    public void f(){
       super();
       this.a = new AtomicReference();
       this.c = new AtomicInteger(0);
       this.d = new b(this);
    }
    public static t a(int p0,FragmentActivity p1,Bundle p2){
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, null, null, f.class, "12");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (PatchProxy.isSupport(uof)) {
          ot = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, null, null, f.class, "13");
          if (ot != patchProxyRe) {
          label_0086 :
             return ot;
          }
       }
       g og = (NasaSwitch.c.a())? new g(BizPage.GAMORA): new d(BizPage.GAMORA);
       d uod = null;
       boolean b = true;
       if (!b.a(0x8ca227e).e(p1)) {
          if (p1 != null) {
             uod = d.a(p1.getIntent());
             if (uod == null) {
             }
          }else {
          }
       }
       boolean b1 = true;
    label_0071 :
       f.h = b1;
       if (!g.c() || b1) {
          b = false;
       }
       t ot1 = new t(og, b, 0);
       ot1.E2(uod);
       ot = ot1;
       goto label_0086 ;
    }
    public static f c(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f.d(p0.getActivity());
    }
    public static f d(FragmentActivity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(-1883158055).ae(p0, "FeaturedPreInitHelper", new a(p0));
    }
    public void b(){
       f uof = f.class;
       if (PatchProxy.applyVoid(null, this, uof, "7")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uof, "17")) {
          c uoc = c.e.b(this.e, false);
          if (uoc != null) {
             uoc.release();
          }
          this.e = null;
       }
       this.b = null;
       return;
    }
    public t e(){
       t obj = PatchProxy.apply(null, this, f.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.getAndSet(null);
       if (obj != null) {
          return obj;
       }
       obj = f.a(0, this.b, null);
       this.h(obj);
       return obj;
    }
    public final boolean f(QPhoto p0){
       Adaptation obj = PatchProxy.applyOneRefs(p0, this, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (f.j.get().booleanValue() && p0.isVideoType()) {
          KwaiManifest kwaiManifest = r1.q1(p0.getEntity());
          if (kwaiManifest != null && !q.f(kwaiManifest.mAdaptationSet)) {
             Iterator iterator = kwaiManifest.mAdaptationSet.iterator();
             while (iterator.hasNext()) {
                obj = iterator.next();
                if (obj != null && !q.f(obj.mRepresentation)) {
                   Iterator iterator1 = obj.mRepresentation.iterator();
                   while (true) {
                      if (iterator1.hasNext()) {
                         Representation representati = iterator1.next();
                         if (!TextUtils.x(representati.getUrl())) {
                            String str = x0.a(Uri.parse(representati.getUrl()), "tt");
                            if (!TextUtils.x(str) && str.contains("drift")) {
                               return true;
                            }
                         }else {
                            continue ;
                         }
                      }else {
                         continue ;
                      }
                   }
                }
             }
          }
       }
       return false;
    }
    public final boolean g(){
       Object obj = PatchProxy.apply(null, this, f.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c.b(this.b).r(this.b.getIntent(), b.f);
    }
    public final void h(t p0){
       f uof = f.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uof, "15")) {
          return;
       }
       if (h.a.x == null) {
          p0.B = c.o0(this.b);
       }
       if (f.i.get().booleanValue()) {
          p0.A = this.d;
       }
       if (!m1.g() && !PatchProxy.applyVoidOneRefs(p0, this, uof, "16")) {
          uof = new f();
          c uoc = new c();
          d uod = null;
          if (a.t().d("duplication_feed_monitor_ignore_ad", false)) {
             uod = d.a;
          }
          d uod1 = new d("featured", true, uod, new e());
          FeedMonitor$b uob = FeedMonitor.b("featured");
          uob.b(uof);
          uob.c(new b());
          uob.d(uoc);
          uob.d = uod;
          uob.h = uod1;
          uob.g = new b();
          uob.a().d(this.b);
          p0.I = uof;
          p0.J = uoc;
          p0.M = uod1;
       }
       return;
    }
}

package com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdMKPageLoadPresenter$pageStatusCallback$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdMKPageLoadPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.ad.webview.jshandler.dto.PageStatus;
import qrd.l1;
import c59.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import yx.j0;
import com.kwai.adclient.kscommerciallogger.snapshot.Span;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Objects;
import java.lang.Double;
import java.lang.System;
import java.lang.Long;
import im8.f;
import p49.d;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Math;
import x49.h;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.ad.report.monitor.DynamicMonitorFactory;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.kwai.framework.model.feed.BaseFeed;
import cm9.a;
import com.yxcorp.gifshow.ad.tachikoma.AdTkException;
import java.lang.Throwable;

public final class AdMKPageLoadPresenter$pageStatusCallback$1 extends Lambda implements l	// class@001854
{
    public final AdMKPageLoadPresenter this$0;

    public void AdMKPageLoadPresenter$pageStatusCallback$1(AdMKPageLoadPresenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(PageStatus p0){
       AdMKPageLoadPresenter e;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, AdMKPageLoadPresenter$pageStatusCallback$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       this.this$0.W8(false);
       Object[] objArray = new Object[false];
       j0.f("AdMKLoadPresenter", "pageStatusCallback run pageStatus "+p0, objArray);
       Span span = this.this$0.R8();
       PageStatus mStatus = p0.mStatus;
       String str = 1;
       if (mStatus != null) {
          Object[] objArray1 = null;
          if (mStatus != str) {
             if (mStatus == 2) {
                e = this.this$0.E;
                if (e != null && !PatchProxy.applyVoid(objArray1, e, uob, "3")) {
                   e.c = SystemClock.elapsedRealtime();
                }
             }
          }else {
             span.c("render success pageStatus code = "+p0);
             p0 = this.this$0.B.get("preRenderTimeMs");
             Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Double");
             long l = (long)p0.doubleValue();
             e = this.this$0.y;
             if (e == null) {
                a.S("mMKPageRenderTime");
             }
             e.set(Long.valueOf((System.currentTimeMillis() - l)));
             e = this.this$0.E;
             if (e != null) {
                if (!PatchProxy.applyVoid(objArray1, e, uob, "8")) {
                   b.b(e, 1, Long.valueOf((SystemClock.elapsedRealtime() - e.a)), null, 4, null);
                }
                if (!PatchProxy.applyVoid(objArray1, e, uob, "5")) {
                   e.e = SystemClock.elapsedRealtime();
                }
                if (!PatchProxy.applyVoid(objArray1, e, uob, "6")) {
                   JsonObject jsonObject = new JsonObject();
                   jsonObject.c0("template_id", e.f);
                   jsonObject.a0("version_code", Integer.valueOf(e.g));
                   jsonObject.c0("page_id", e.i);
                   jsonObject.c0("mid_page_template_id", e.j);
                   jsonObject.a0("page_conversion_type", Integer.valueOf(e.k));
                   long l1 = 0;
                   jsonObject.a0("t0", Long.valueOf(Math.max(l1, (e.b - e.a))));
                   jsonObject.a0("t1", Long.valueOf(Math.max(l1, (e.c - e.a))));
                   jsonObject.a0("t2", Long.valueOf(Math.max(l1, (e.d - e.a))));
                   jsonObject.a0("t3", Long.valueOf(Math.max(l1, (e.e - e.a))));
                   h.c("ks_tk_page_perf", jsonObject, null, null, d.d.a("ks_tk_page_perf", 0x3f800000), null, 44, null);
                }
             }
             AdMKPageLoadPresenter$pageStatusCallback$1 tthis$0 = this.this$0;
             Objects.requireNonNull(tthis$0);
             if (!PatchProxy.applyVoid(objArray1, tthis$0, AdMKPageLoadPresenter.class, "14")) {
                AdMKPageLoadPresenter t = tthis$0.t;
                if (t != null) {
                   QPhoto mEntity = t.mEntity;
                   if (mEntity != null) {
                      DynamicMonitorFactory c = DynamicMonitorFactory.c;
                      t = tthis$0.H;
                      if (t == null) {
                         a.S("mFragment");
                      }
                      a uoa = c.F("ad_mk_landing_page", "ad_mk_landing_page_content", mEntity, t.m(), null);
                      tthis$0.I = uoa;
                      if (uoa != null) {
                         uoa.start();
                      }
                   }
                }
             }
          }
       }else {
          span.c("render fail,because pageStatus code = "+p0+" ,startBackupPage ");
          this.this$0.X8(str, new AdTkException("ÒµÎñÊ§°Ü pageStatus £º"+p0));
       }
    label_01d2 :
       return;
    }
}

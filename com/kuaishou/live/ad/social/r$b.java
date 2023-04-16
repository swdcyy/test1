package com.kuaishou.live.ad.social.r$b;
import java.lang.Runnable;
import com.kuaishou.live.ad.social.r;
import java.lang.Object;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import os5.d;
import zl0.b1;
import zl0.a;
import zl0.s0;
import com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LiveAdSocialConversionTask;
import java.lang.Integer;
import cjd.e;
import erd.o;
import z1.a;
import java.lang.Throwable;
import com.google.common.collect.ImmutableMap;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.util.Map;
import com.kuaishou.android.live.log.b;
import zl0.a1;
import java.lang.Boolean;
import crd.b;
import lnc.b9;
import java.lang.Long;
import zl0.n0;
import zl0.m0;
import erd.g;
import zl0.l0;
import io.reactivex.internal.functions.Functions;

public class r$b implements Runnable	// class@000a1f
{
    public a b;
    public LiveAdSocialMessages$LiveAdSocialConversionTask c;
    public boolean d;
    public boolean e;
    public final r f;

    public void r$b(r p0){
       this.f = p0;
       super();
       this.d = true;
       this.e = true;
    }
    public final t a(){
       Object obj = this;
       b1 obj1 = PatchProxy.apply(null, obj, r$b.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = d.a(-2004767397).L8();
       String liveStreamId = obj.f.g.getLiveStreamId();
       String str = obj.f.g.k2();
       r$b c = obj.c;
       LiveAdSocialMessages$LiveAdSocialConversionTask liveAdSocial = null;
       int i = (c == null)? liveAdSocial: c.conversionId;
       if (c != null) {
          liveAdSocial = c.sceneId;
       }
       LiveAdSocialMessages$LiveAdSocialConversionTask liveAdSocial1 = liveAdSocial;
       String str1 = obj.f.g.d6();
       String str2 = obj.f.g.I6();
       c = obj.c;
       String str3 = (c == null)? "": c.entranceInfo;
       a uoa = new a(liveStreamId, str, i, liveAdSocial1, str1, str2, str3, Integer.valueOf(obj.f.h), Integer.valueOf(1));
       return obj1.a(v14.a()).map(new e());
    }
    public final void b(LiveAdSocialMessages$LiveAdSocialConversionTask p0,a p1,Throwable p2){
       boolean b;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, r$b.class, "3")) {
          return;
       }
       String str = "error";
       ImmutableMap immutableMap = (p2 != null)? ImmutableMap.of(str, p2): ImmutableMap.of(str, "null");
       b.h0(LiveLogTag.AD, "fetch task error", immutableMap);
       immutableMap.b = new a1(p0);
       r$b tf = this.f;
       b = true;
       if (tf.b.i == b) {
          b = false;
       }
       tf.g.K0(b);
       p1.accept(Boolean.valueOf(b));
       this.c = null;
       return;
    }
    public void c(LiveAdSocialMessages$LiveAdSocialConversionTask p0,boolean p1,a p2,boolean p3){
       boolean b;
       if (PatchProxy.isSupport(r$b.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), p2, Boolean.valueOf(p3), this, r$b.class, "4")) {
          return;
       }
       b9.a(this.f.c);
       r$b tc = this.c;
       if (tc != null) {
          b.h0(LiveLogTag.AD, "give up update previous fetching task ", ImmutableMap.of("previousVersion", Long.valueOf(tc.version)));
       }
       if (this.b != null && this.c != null) {
          this.f.b = (p0 != null)? new a1(p0): null;
          b = true;
          if (this.c.exceptionHandleStrategy == b) {
             b = false;
          }
          this.f.g.K0(b);
          this.b.accept(Boolean.valueOf(b));
       }
       this.e = p3;
       this.b = p2;
       this.c = p0;
       this.d = p1;
       return;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, r$b.class, "1")) {
          return;
       }
       if (this.e != null) {
          r$b tc = this.c;
          if (tc == null) {
             b.Z(LiveLogTag.AD, "cannot fetch task, fetching task is null");
             return;
          }else {
             this.f.c = this.a().subscribe(new n0(this, tc), new m0(this, tc));
          }
       }else {
          this.f.c = this.a().subscribe(new l0(this), Functions.e);
       }
       return;
    }
}

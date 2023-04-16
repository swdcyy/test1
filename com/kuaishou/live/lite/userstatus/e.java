package com.kuaishou.live.lite.userstatus.e;
import td3.o;
import e93.a;
import ds5.a;
import rd3.b;
import java.lang.Object;
import java.util.ArrayList;
import crd.a;
import java.util.HashMap;
import com.google.common.collect.Maps;
import jy1.h;
import java.util.Map;
import ok.x;
import qk.e0;
import com.google.common.collect.Multimaps;
import com.kuaishou.live.lite.userstatus.e$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ds5.c;
import xp5.g;
import com.kuaishou.live.lite.userstatus.LiveLiteUserStatusResponse;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import td3.d;
import io.reactivex.g;
import t45.d;
import brd.z;
import td3.e;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import brd.v;
import brd.g;
import java.lang.Throwable;
import java.lang.Integer;
import qk.g0;
import com.kuaishou.live.lite.userstatus.LiveLiteTimeConsumingUserStatusResponse;
import java.lang.Boolean;
import td3.c;
import td3.b;
import cjd.e;
import erd.o;
import java.util.Objects;
import o31.l;
import erd.g;
import td3.f;
import td3.j;
import td3.h;
import crd.b;
import com.kuaishou.live.lite.LiveLiteParam;
import td3.g;
import com.kuaishou.live.lite.userstatus.d;
import td3.k;
import td3.i;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import java.lang.RuntimeException;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;

public class e implements o	// class@000b96
{
    public final b a;
    public final a b;
    public final a c;
    public final List d;
    public final List e;
    public final a f;
    public LiveLiteUserStatusResponse g;
    public LiveLiteTimeConsumingUserStatusResponse h;
    public Throwable i;
    public Throwable j;
    public final g0 k;
    public final g0 l;
    public final c m;

    public void e(a p0,a p1,b p2){
       super();
       this.d = new ArrayList();
       this.e = new ArrayList();
       this.f = new a();
       this.k = Multimaps.a(Maps.s(), h.b);
       this.l = Multimaps.a(Maps.s(), h.b);
       e$a uoa = new e$a(this);
       this.m = uoa;
       this.b = p0;
       this.c = p1;
       this.a = p2;
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
       }else {
          p1.gd(uoa);
          if (this.h()) {
             this.j(p0.getLiveStreamId(), false);
          }
       }
       return;
    }
    public LiveLiteUserStatusResponse D1(){
       return this.g;
    }
    public t T3(){
       Object obj = PatchProxy.apply(null, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.create(new d(this)).observeOn(d.a);
    }
    public t W(){
       Object obj = PatchProxy.apply(null, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.create(new e(this)).observeOn(d.a);
    }
    public final void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "15")) {
          return;
       }
       if (!q.f(p0)) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             v ov = iterator.next();
             if (!ov.isDisposed()) {
                ov.onComplete();
             }
          }
          p0.clear();
       }
       return;
    }
    public final void b(Throwable p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "16")) {
          return;
       }
       if (!q.f(p1)) {
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             v ov = iterator.next();
             if (!ov.isDisposed()) {
                ov.onError(p0);
             }
          }
          p1.clear();
       }
       return;
    }
    public final void c(Object p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "14")) {
          return;
       }
       if (!q.f(p1)) {
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             v ov = iterator.next();
             if (!ov.isDisposed()) {
                ov.onNext(p0);
             }
          }
       }
       return;
    }
    public final void d(int p0,v p1,Throwable p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, e.class, "5")) {
          return;
       }
       if (!this.h()) {
          p1.onError(p2);
          return;
       }else {
          this.k.put(Integer.valueOf(p0), p1);
          return;
       }
    }
    public LiveLiteTimeConsumingUserStatusResponse d0(){
       return this.h;
    }
    public final void e(int p0,v p1,Object p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, e.class, "6")) {
          return;
       }
       if (!this.h()) {
          p1.onNext(p2);
          p1.onComplete();
          return;
       }else {
          p1.onNext(p2);
          this.l.put(Integer.valueOf(p0), p1);
          return;
       }
    }
    public final void f(String p0,String p1,String p2,boolean p3){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, e.class, "12")) {
          return;
       }
       e tf = this.f;
       Objects.requireNonNull(tf);
       b.b().a(this.a.a(), p0, p1, p2).map(new e()).observeOn(d.a).doOnSubscribe(new l(tf)).doOnNext(new f(this)).subscribe(new j(this, p0, p3), new h(this, p0, p3));
       return;
    }
    public final void g(String p0,boolean p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoe, "13")) {
          return;
       }
       e tf = this.f;
       Objects.requireNonNull(tf);
       b.b().c(this.a.a(), p0, this.b.ok().getStartPlaySourceType()).map(new e()).doOnSubscribe(new l(tf)).doOnNext(new g(this)).doOnNext(d.b).subscribe(new k(this, p0, p1), new i(this, p0, p1));
       return;
    }
    public final boolean h(){
       Object obj = PatchProxy.apply(null, this, e.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("enableRequestUserStatusImmediately", true);
    }
    public void i(int p0){
       RuntimeException runtimeExcep;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "7")) {
          return;
       }
       if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "9")) {
          if (PatchProxy.isSupport(uoe)) {
             runtimeExcep = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "10");
             if (runtimeExcep != PatchProxyResult.class) {
             }else if(p0 != 1){
                runtimeExcep = (p0 != 2)? new RuntimeException("impossible"): this.j;
             }else {
                runtimeExcep = this.i;
             }
          }else {
             goto label_0040 ;
          }
          if (runtimeExcep != null) {
             Collection uCollection1 = this.k.get(Integer.valueOf(p0));
             if (uCollection1 != null) {
                b.d0(LiveLiteLogTag.USER_STATUS, "LiteUserStatusObtainController.notifyError", "type", Integer.valueOf(p0), "throwable", runtimeExcep);
                Iterator iterator1 = uCollection1.iterator();
                while (iterator1.hasNext()) {
                   v ov1 = iterator1.next();
                   if (ov1.isDisposed()) {
                      continue ;
                   }
                   ov1.onError(runtimeExcep);
                }
             }
          }
       }
       if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "8")) {
          Collection uCollection = this.l.get(Integer.valueOf(p0));
          if (uCollection != null) {
             Iterator iterator = uCollection.iterator();
             while (iterator.hasNext()) {
                v ov = iterator.next();
                if (!ov.isDisposed()) {
                   ov.onComplete();
                }
             }
          }
       }
       return;
    }
    public void j(String p0,boolean p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoe, "11")) {
          return;
       }
       this.f.d();
       b.c0(LiveLiteLogTag.USER_STATUS, "LiteUserStatusObtainController.queryAudienceStatus - start", "liveStreamId", p0);
       this.g(p0, p1);
       this.f(p0, r1.M0(this.b.ok().getLiveStreamFeed()), r1.Q1(this.b.ok().getLiveStreamFeed()), p1);
       return;
    }
}

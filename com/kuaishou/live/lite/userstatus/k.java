package com.kuaishou.live.lite.userstatus.k;
import td3.o;
import e93.a;
import ds5.a;
import rd3.b;
import java.lang.Object;
import com.kuaishou.live.lite.userstatus.k$a;
import crd.a;
import io.reactivex.subjects.ReplaySubject;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ds5.c;
import com.kuaishou.live.lite.userstatus.LiveLiteUserStatusResponse;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import java.util.List;
import java.lang.Runnable;
import java.lang.Boolean;
import td3.c;
import td3.b;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import java.util.Objects;
import o31.l;
import erd.g;
import com.kuaishou.live.lite.userstatus.f;
import com.kuaishou.live.lite.userstatus.h;
import crd.b;
import com.kuaishou.live.lite.LiveLiteParam;
import td3.l;
import com.kuaishou.live.lite.userstatus.j;
import com.kuaishou.live.lite.userstatus.g;
import com.kuaishou.live.lite.userstatus.i;
import xp5.g;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kuaishou.live.lite.userstatus.LiveLiteTimeConsumingUserStatusResponse;

public class k implements o	// class@000b9d
{
    public final a a;
    public final a b;
    public final b c;
    public boolean d;
    public final c e;
    public final a f;
    public String g;
    public LiveLiteUserStatusResponse h;
    public final c i;
    public LiveLiteTimeConsumingUserStatusResponse j;
    public final c k;
    public final List l;

    public void k(a p0,a p1,b p2){
       super();
       this.d = false;
       k$a uoa = new k$a(this);
       this.e = uoa;
       this.f = new a();
       this.i = ReplaySubject.g();
       this.k = ReplaySubject.g();
       this.l = new ArrayList();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       if (PatchProxy.applyVoid(null, this, k.class, "8")) {
       }else {
          p1.gd(uoa);
          this.d(this.d);
       }
       return;
    }
    public LiveLiteUserStatusResponse D1(){
       return this.h;
    }
    public t T3(){
       Object obj = PatchProxy.apply(null, this, k.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i.hide();
    }
    public t W(){
       Object obj = PatchProxy.apply(null, this, k.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.hide();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       k tl = this.l;
       Iterator iterator = tl.iterator();
       while (iterator.hasNext()) {
          iterator.next().run();
       }
       tl.clear();
       return;
    }
    public final void b(String p0,String p1,String p2,boolean p3){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, k.class, "5")) {
          return;
       }
       k tf = this.f;
       Objects.requireNonNull(tf);
       b.b().a(this.c.a(), p0, p1, p2).map(new e()).observeOn(d.a).doOnSubscribe(new l(tf)).subscribe(new f(this, p0, p3), new h(this, p0, p3));
       return;
    }
    public final void c(String p0,boolean p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ok, "6")) {
          return;
       }
       k tf = this.f;
       Objects.requireNonNull(tf);
       b.b().c(this.c.a(), p0, this.a.ok().getStartPlaySourceType()).map(new e()).doOnSubscribe(new l(tf)).doOnNext(new l(this)).doOnNext(j.b).subscribe(new g(this, p0, p1), new i(this, p0, p1));
       return;
    }
    public void d(boolean p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ok, "4")) {
          return;
       }
       String str = PatchProxy.apply(null, this, ok, "7");
       if (str != PatchProxyResult.class) {
       }else {
          str = this.a.getLiveStreamId();
       }
       this.g = str;
       this.f.d();
       b.c0(LiveLiteLogTag.USER_STATUS, "LiteUserStatusObtainController.queryAudienceStatus - start", "liveStreamId", str);
       this.c(str, p0);
       this.b(str, r1.M0(this.a.ok().getLiveStreamFeed()), r1.Q1(this.a.ok().getLiveStreamFeed()), p0);
       return;
    }
    public LiveLiteTimeConsumingUserStatusResponse d0(){
       return this.j;
    }
}

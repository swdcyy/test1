package com.kuaishou.live.common.core.component.follow.cache.c;
import java.lang.Object;
import mrd.a;
import java.util.HashSet;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import java.lang.Class;
import brd.t;
import t45.d;
import brd.z;
import qg1.d;
import erd.g;
import crd.b;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import qg1.e;
import com.kuaishou.live.common.core.component.follow.cache.c$a;
import com.kuaishou.live.common.core.component.follow.cache.c$b;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import qg1.g;
import erd.o;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.QCurrentUser;
import android.os.SystemClock;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import qg1.b;
import ok.x;
import qg1.c;
import erd.a;
import cjd.e;
import ekd.k1;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import qg1.f;
import com.kuaishou.live.common.core.component.follow.cache.b;

public class c	// class@001107
{
    public boolean a;
    public long b;
    public final c c;
    public Set d;
    public Set e;

    public void c(){
       super();
       this.a = false;
       this.b = 0;
       this.c = a.g();
       this.d = new HashSet();
       this.e = new HashSet();
       RxBus f = RxBus.f;
       f.f(n.class).observeOn(d.a).subscribe(new d(this));
       f.g(n.class, RxBus$ThreadMode.MAIN).subscribe(new e(this));
    }
    public void c(c$a p0){
       super();
       this.a = false;
       this.b = 0;
       this.c = a.g();
       this.d = new HashSet();
       this.e = new HashSet();
       RxBus f = RxBus.f;
       f.f(n.class).observeOn(d.a).subscribe(new d(this));
       f.g(n.class, RxBus$ThreadMode.MAIN).subscribe(new e(this));
    }
    public static c b(){
       return c$b.a;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       this.d.clear();
       this.e.clear();
       this.b = 0;
       return;
    }
    public boolean c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.d.contains(p0);
    }
    public t d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.map(new g(this, p0));
    }
    public boolean e(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (TextUtils.x(p0)) {
          return false;
       }
       return this.e.contains(p0);
    }
    public void f(String p0,boolean p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "1")) {
          return;
       }
       if (!QCurrentUser.me().isLogined()) {
          this.a();
          return;
       }else if(SystemClock.elapsedRealtime() - this.b < 0){
          return;
       }else if(this.a != null){
          return;
       }else {
          b.Z(LiveLogTag.FOLLOW_CACHE, "LiveMyFollowingManager.refreshFollowingCacheIfNecessary start");
          this.a = true;
          t ot = b.a.get().a(p0).doFinally(new c(this)).map(new e());
          if (p1) {
             ot = ot.delaySubscription((long)(k1.b.nextDouble() * 9999.00f), TimeUnit.MILLISECONDS);
          }
          ot.subscribe(new f(this), b.b);
          return;
       }
    }
}

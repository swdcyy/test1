package iy1.f;
import hy1.a;
import lp3.e;
import java.util.HashMap;
import iy1.e;
import iy1.l;
import ky1.a;
import ky1.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xp5.i;
import lp3.c;
import hy1.e;
import java.lang.Boolean;
import android.os.SystemClock;
import java.lang.Number;
import java.lang.Math;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Long;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Runnable;
import ekd.k1;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import my1.e;
import jy1.b;
import xp5.g;
import iy1.d;
import ok.x;
import d61.r;
import ky1.h;
import iy1.b;
import iy1.c;
import java.lang.Integer;
import com.google.common.base.Optional;
import v91.n;
import iy1.a;
import ok.h;

public class f extends a	// class@0029c3
{
    public final boolean b;
    public final e c;
    public boolean d;
    public long e;
    public l f;
    public final Map g;
    public final Map h;
    public final Map i;
    public c j;
    public final Map k;
    public boolean l;
    public final Runnable m;

    public void f(e p0,boolean p1){
       super();
       this.d = true;
       this.e = 0;
       this.g = new HashMap();
       this.h = new HashMap();
       this.i = new HashMap();
       this.k = new HashMap();
       this.l = false;
       this.m = new e(this);
       this.b = p1;
       this.c = p0;
       this.o(l.j, new a());
    }
    public static ClientContent$LiveStreamPackage h(f p0){
       Objects.requireNonNull(p0);
       ClientContent$LiveStreamPackage liveStreamPa = PatchProxy.apply(null, p0, f.class, "18");
       if (liveStreamPa != PatchProxyResult.class) {
       }else {
          liveStreamPa = p0.c.a(i.class).a();
       }
       return liveStreamPa;
    }
    public int a(){
       return 1;
    }
    public e c(){
       boolean b;
       Object[] obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       Object[] objArray = null;
       l obj = PatchProxy.apply(objArray, this, uof, "12");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(objArray, this, uof, "9");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(this.b == null && (this.l == null && (SystemClock.elapsedRealtime() - this.e) - this.m() < 0)){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          obj1 = PatchProxy.apply(objArray, this, uof, "10");
          long l = (obj1 != patchProxyRe)? obj1.longValue(): Math.max(0, (this.m() - (SystemClock.elapsedRealtime() - this.e)));
          b.d0(LiveLogTag.LIVE_ENHANCE_MESSAGE, "pnConsume blocked by global limit", "minShowIntervalMs", Long.valueOf(this.m()), "remindTime", Long.valueOf(l));
          k1.m(this.m);
          k1.s(this.m, this, l);
          return objArray;
       }else {
          obj1 = PatchProxy.apply(objArray, this, uof, "14");
          if (obj1 != patchProxyRe) {
          }else {
             Iterator iterator = this.i.keySet().iterator();
             obj1 = objArray;
             while (iterator.hasNext()) {
                obj = iterator.next();
                if (obj1 == null || this.l(obj) > this.l(obj1)) {
                   l ol = obj;
                }
             }
             obj1 = (obj1 != null)? this.i.remove(obj1): objArray;
          }
          if (obj1 == null) {
             return objArray;
          }else {
             e d = obj1.d;
             e a = d.a;
             this.l = d.b();
             if (this.b == null) {
                this.j(a).a(this.i());
             }
             b.c0(LiveLogTag.LIVE_ENHANCE_MESSAGE, "onConsume", "message", obj1);
             return obj1;
          }
       }
    }
    public void d(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "13")) {
          return;
       }
       this.e = SystemClock.elapsedRealtime() + p0.b();
       this.f = p0.d.a;
       return;
    }
    public void e(e p0){
       boolean b;
       f uof = f.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uof, "2")) {
          return;
       }
       e a = p0.d.a;
       Object obj = PatchProxy.applyOneRefs(a, this, uof, "3");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(this.b != null){
          b = false;
       }else {
          b = this.j(a).b(this.i()) ^ 0x01;
       }
       if (b) {
          b.d0(LiveLogTag.LIVE_ENHANCE_MESSAGE, "putMessage blockByBizLimit", "biz", a, "strategy", this.j(a));
          return;
       }else {
          this.i.put(a, p0);
          this.b();
          return;
       }
    }
    public boolean g(){
       Object obj = PatchProxy.apply(null, this, f.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.d != null) {
          return (this.i.isEmpty() ^ 0x01);
       }
       b.Z(LiveLogTag.LIVE_ENHANCE_MESSAGE, "tryConsume blocked by disabled");
       return false;
    }
    public final String i(){
       Object obj = PatchProxy.apply(null, this, f.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.a(g.class).getLiveStreamId();
    }
    public final b j(l p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return r.b(this.g, p0, new d(p0));
    }
    public c k(l p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       f obj = PatchProxy.applyOneRefs(p0, this, uof, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.k;
       uof = PatchProxy.apply(null, this, uof, "1");
       if (uof != patchProxyRe) {
       }else if(this.j == null){
          h oh = new h(this.c);
          this.j = oh;
          oh.f(new b(this));
       }
       uof = this.j;
       return r.a(obj, p0, uof);
    }
    public final int l(l p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return r.b(this.h, p0, new c(p0)).intValue();
    }
    public final long m(){
       Object obj = PatchProxy.apply(null, this, f.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return n.c("temporaryEnhance").transform(a.b).or(Long.valueOf(0x2710)).longValue();
    }
    public l n(){
       return this.f;
    }
    public void o(l p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "4")) {
          return;
       }
       b.d0(LiveLogTag.LIVE_ENHANCE_MESSAGE, "registerHandler", "type", p0, "handler", p1);
       p1.f(new b(this));
       this.k.put(p0, p1);
       return;
    }
}

package com.kuaishou.live.core.show.wishlight.render.a;
import pz2.e;
import com.kuaishou.live.core.show.wishlight.render.a$a;
import nsd.u;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import java.lang.Object;
import kotlin.jvm.internal.a;
import gz2.h;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.kuaishou.live.core.show.wishlight.render.a$b;
import dn2.e;
import com.kuaishou.live.core.show.wishlight.render.a$e;
import java.lang.StringBuilder;
import cz2.d;
import dn2.a$a;
import dn2.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import pz2.c;
import pz2.d;
import pz2.i;
import zf1.d;
import java.util.Map;
import pz2.j;
import xy2.a;
import java.lang.Boolean;
import com.kuaishou.live.core.show.wishlight.render.a$d;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import qrd.l1;
import java.util.Collection;
import com.kuaishou.livestream.message.nano.LiveMultiMagicEffectInfo;
import yy2.a;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import java.lang.Long;
import c03.l;
import com.kuaishou.live.core.show.wishlight.render.a$c;
import vz2.f;
import java.util.Objects;
import c03.m;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.effect.resource.download.common.e;
import vz2.a;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import zz2.d;
import trd.t;
import pz2.a;
import com.kuaishou.live.core.show.wishlight.render.a$f;
import a97.h;
import java.util.Set;
import java.util.Map$Entry;
import java.lang.Number;

public final class a implements e	// class@0012b8
{
    public final Map a;
    public final ConcurrentLinkedQueue b;
    public final long c;
    public boolean d;
    public c e;
    public d f;
    public a$b g;
    public a h;
    public final a$a i;
    public final h j;
    public static final List k;
    public static final a$a l;

    static {
       a.l = new a$a(null);
       List list = LiveLogTag.LIVE_EFFECT.appendTag("LiveWishLightEffectRender");
       a.o(list, "LiveLogTag.LIVE_EFFECT.a¡­veWishLightEffectRender\"\)");
       a.k = list;
    }
    public void a(h p0){
       a.p(p0, "mLocalRender");
       super();
       this.j = p0;
       this.a = new ConcurrentHashMap();
       this.b = new ConcurrentLinkedQueue();
       long l = a.t().u("SOURCE_LIVE").b("liveWishLightMaxPendingTaskSize", 50);
       this.c = l;
       this.g = new a$b(this);
       this.h = new e(l);
       a$e uoe = new a$e(this);
       this.i = uoe;
       a.l.b("[init]"+this);
       p0.g(this.g);
       this.h.c(uoe);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.i(true, null);
       return;
    }
    public void b(c p0,String p1){
       d.h(this, p0, p1);
    }
    public boolean c(){
       return this.d;
    }
    public c d(){
       return this.e;
    }
    public void e(i p0){
       if (p0 instanceof d) {
          this.f = p0;
       }
       return;
    }
    public void f(String p0){
       d.g(this, p0);
    }
    public void g(int p0,int p1,Map p2,j p3){
       d.f(this, p0, p1, p2, p3);
    }
    public final void h(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       a.l.b("[addPendingTask]taskId:"+p0.N());
       this.b.add(p0);
       while ((long)this.b.size() - this.c > 0) {
          p0 = this.b.poll();
          if (p0 != null) {
             a.l.b("[addPendingTask]remove taskId::"+p0.N());
             a tf = this.f;
             if (tf != null) {
                tf.f(p0, false, 1003, "pending trim");
             }
          }
       }
       return;
    }
    public final void i(boolean p0,String p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "5")) {
          return;
       }
       a.l.b("[clearEffect]");
       this.j(p0, 1006, p1);
       k1.o(new a$d(this, p0, p1));
       return;
    }
    public final void j(boolean p0,int p1,String p2){
       l1 a;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), p2, this, a.class, "7")) {
          return;
       }
       a tb = this.b;
       ArrayList uArrayList = new ArrayList(u.Y(tb, 10));
       Iterator iterator = tb.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          a tf = this.f;
          if (tf != null) {
             a.o(uoa, "it");
             tf.f(uoa, p0, p1, p2);
             a = l1.a;
          }else {
             a = null;
          }
          uArrayList.add(a);
       }
       this.b.clear();
       return;
    }
    public final void k(a p0){
       a th;
       LiveMultiMagicEffectInfo fromUserInfo;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "8")) {
          return;
       }
       a.l.b("[downloadAvatar]taskId:"+p0.N());
       UserInfos$UserInfo userInfo = null;
       if (a.a(p0.L())) {
          th = this.h;
          fromUserInfo = p0.L().fromUserInfo;
          if (fromUserInfo != null) {
             userInfo = fromUserInfo.headUrls;
          }
          th.d(e0.i(userInfo), p0);
       }else {
          th = this.h;
          fromUserInfo = p0.L().fromUserInfo;
          if (fromUserInfo != null) {
             userInfo = fromUserInfo.headUrls;
          }
          th.b(e0.i(userInfo), p0);
       }
       return;
    }
    public final h l(){
       return this.j;
    }
    public final boolean m(){
       boolean b = (this.e != null)? true: false;
       return b;
    }
    public synchronized final void n(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "11")) {
          return;
       }
       if (this.a.get(Long.valueOf(p0.b())) == null) {
          a$c uoc = new a$c(this, p0);
          f e = f.e;
          String str = String.valueOf(p0.b());
          Objects.requireNonNull(e);
          if (!PatchProxy.applyVoidTwoRefs(str, uoc, e, f.class, "1")) {
             a.p(str, "resourceId");
             a.p(uoc, "observer");
             f.b.d(str, uoc);
          }
          this.a.put(Long.valueOf(p0.b()), uoc);
       }
       return;
    }
    public void n5(c p0){
       StringBuilder str;
       a tf;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "1")) {
          return;
       }
       a.p(p0, "task");
       boolean i = 1002;
       if (this.c()) {
          str = "[executeEffectTask]render released,task:"+p0;
          tf = this.f;
          if (tf != null) {
             tf.f(p0, false, i, str);
          }
          a.l.a(str);
          return;
       }else if(!p0 instanceof a){
          str = "[executeEffectTask]unknown task:"+p0;
          tf = this.f;
          if (tf != null) {
             tf.f(p0, false, i, str);
          }
          a.l.a(str);
          return;
       }else {
          a$a l = a.l;
          l.b("[executeEffectTask]taskId:"+p0.N());
          Objects.requireNonNull(p0);
          Object[] objArray = null;
          Object obj = PatchProxy.apply(objArray, p0, a.class, "1");
          if (obj != PatchProxyResult.class) {
             i = obj.booleanValue();
          }else if(e.b().he().g(String.valueOf(p0.b())) != null){
             i = true;
          }else {
             i = false;
          }
          if (!i) {
             this.h(p0);
             _monitor_enter(this);
             if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "10")) {
                _monitor_exit(this);
             }else {
                l.b("[downloadResource]taskId:"+p0.N()+",magicFaceId:"+p0.b());
                this.n(p0);
                f.e.c(t.k(new d(p0)), 10);
                _monitor_exit(this);
             }
             return;
          }else if(!this.m()){
             this.h(p0);
             this.o(p0);
             return;
          }else {
             uoa = this.e;
             if (uoa == null || uoa.b() - p0.b()) {
                str = "magic face id changed ";
                tf = this.e;
                if (tf != null) {
                   objArray = Long.valueOf(tf.b());
                }
                this.i(false, str+objArray+"->"+p0.b());
                this.h(p0);
                this.o(p0);
                return;
             }else {
                this.k(p0);
                return;
             }
          }
       }
    }
    public final void o(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       h.a(new a$f(this, p0));
       return;
    }
    public synchronized final void p(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "12")) {
          return;
       }
       l ol = this.a.get(Long.valueOf(p0.b()));
       if (ol != null) {
          f.e.e(String.valueOf(p0.b()), ol);
          this.a.remove(Long.valueOf(p0.b()));
       }
       return;
    }
    public void pause(){
       d.c(this);
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a.l.b("[release]"+this);
       this.a();
       a ta = this.a;
       ArrayList uArrayList = new ArrayList(ta.size());
       Iterator iterator = ta.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          f.e.e(String.valueOf(uEntry.getKey().longValue()), uEntry.getValue());
          uArrayList.add(l1.a);
       }
       this.a.clear();
       this.h.a(this.i);
       this.h.clear();
       this.j.g(null);
       this.f = null;
       this.d = true;
       return;
    }
    public void resume(){
       d.e(this);
    }
}

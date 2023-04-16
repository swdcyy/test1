package af1.x;
import te1.c;
import android.content.Context;
import lp3.e;
import ok.x;
import xp5.g;
import java.lang.Object;
import java.util.LinkedList;
import af1.c;
import af1.v;
import v51.a;
import java.lang.Class;
import lp3.c;
import hf3.a;
import java.lang.String;
import af1.k;
import com.yxcorp.utility.TextUtils;
import ff1.a;
import af1.j;
import vf1.a;
import java.util.Objects;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import te1.c$a;
import te1.d;
import df1.c;
import com.kuaishou.live.basic.model.LiveMessageFrequencyConfig$FrequencyConfig;
import v91.b;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import java.util.List;
import java.lang.Iterable;
import qk.m;
import af1.s;
import ok.o;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import df1.a;
import java.lang.Number;
import com.google.common.base.Optional;
import v91.n;
import af1.q;
import ok.h;
import java.lang.Long;
import java.lang.Boolean;
import af1.n;
import java.lang.Runnable;
import ekd.k1;
import bf1.j;
import java.util.Map;
import d61.r;
import df1.f;
import bf1.e;
import af1.a;
import bf1.h;
import af1.b;
import af1.u;
import af1.l;
import java.lang.Integer;
import com.kuaishou.live.common.core.component.comments.fluency.LiveCommentBottomMessageType;
import te1.b;
import af1.p;
import af1.w;
import af1.m;
import lf3.g;
import crd.b;
import lnc.b9;
import java.lang.StringBuilder;
import java.lang.System;

public class x implements c	// class@000082
{
    public final Context a;
    public final a b;
    public final a c;
    public final LinkedList d;
    public final k e;
    public final c f;
    public final e g;
    public final j h;
    public final g i;
    public boolean j;
    public boolean k;
    public h l;
    public c$a m;

    public void x(Context p0,e p1,x p2){
       super();
       this.d = new LinkedList();
       this.f = new c();
       this.i = new v(this);
       this.j = false;
       this.k = false;
       this.b = p1.a(a.class).u();
       this.a = p0;
       this.g = p1;
       this.e = new k(TextUtils.k(p1.a(g.class).getLiveStreamId()));
       this.c = new a(p1.a(g.class).d(), p2);
       this.h = new j(p1.a(a.class));
    }
    public static void b(x p0){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoid(null, p0, x.class, "19")) {
       }else {
          b.Z(LiveLogTag.LIVE_HIGH_FLUENCY_FEEDS, "LiveHighFluencyMessagePool.releaseCooling");
          p0.j = false;
          p0.k = false;
          p0.h();
       }
       return;
    }
    public void a(c$a p0){
       this.m = null;
    }
    public void c(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "9")) {
          return;
       }
       if (p0 != null) {
          p0 = p0.d;
          if (p0 instanceof c) {
             x te = this.e;
             Objects.requireNonNull(te);
             if (!PatchProxy.applyVoidOneRefs(p0, te, k.class, "5") && (p0.j() && te.c(p0))) {
                LiveMessageFrequencyConfig$FrequencyConfig uFrequencyCo = te.d(p0);
                if (uFrequencyCo == null) {
                   b.c0(LiveLogTag.LIVE_HIGH_FLUENCY_FEEDS, "tryConsumeMessageFrequencyFail, config not found", "message", p0.h());
                }else {
                   b uob = te.e(p0, uFrequencyCo);
                   if (uob != null) {
                      uob.a();
                   }
                }
             }
          }
       }
       return;
    }
    public d d(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       x ox = x.class;
       x obj = PatchProxy.apply(null, this, ox, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (q.f(this.d)) {
          return null;
       }
       if (this.k != null) {
          return null;
       }
       obj = this.d;
       ImmutableList immutableLis = PatchProxy.applyOneRefs(obj, this, ox, "14");
       if (immutableLis != patchProxyRe) {
       }else {
          immutableLis = m.s(obj).p(new s(this)).B();
       }
       this.d.clear();
       this.d.addAll(immutableLis);
       obj = this.d;
       Object[] objArray = PatchProxy.applyOneRefs(obj, this, ox, "8");
       if (objArray != patchProxyRe) {
       }else if(obj.isEmpty()){
          objArray = null;
       }else {
          objArray = Ordering.natural().nullsLast().max(obj);
       }
       if (objArray == null) {
          b.Z(LiveLogTag.LIVE_HIGH_FLUENCY_FEEDS, "LiveHighFluencyMessagePool.pollOne failed, --> no message");
          return null;
       }else if(this.j != null){
          if (objArray instanceof a) {
             return this.i(objArray);
          }else {
             return null;
          }
       }else {
          return this.i(objArray);
       }
    }
    public void e(c$a p0){
       this.m = p0;
    }
    public final long f(){
       Object obj = PatchProxy.apply(null, this, x.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return n.c("highFrequency").transform(q.b).or(Long.valueOf(0)).longValue();
    }
    public final boolean g(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, x.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && p0.isValid())? true: false;
       return b;
    }
    public int getPriority(){
       return 0;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, x.class, "20")) {
          return;
       }
       k1.p(new n(this), this);
       return;
    }
    public final d i(c p0){
       j oj1;
       x a;
       x h;
       x c;
       boolean b = this;
       d uod = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       x ox = x.class;
       x obj = PatchProxy.applyOneRefs(uod, b, ox, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyOneRefs(uod, b, ox, "6");
       d uod1 = null;
       if (obj != patchProxyRe) {
       }else {
          obj = b.f;
          Objects.requireNonNull(obj);
          j oj = PatchProxy.applyOneRefs(uod, obj, c.class, "2");
          if (oj != patchProxyRe) {
          label_0041 :
             oj1 = oj;
          }else {
             oj = r.a(obj.a, p0.getClass(), uod1);
             if (oj != null) {
                goto label_0041 ;
             }else if(uod instanceof f){
                if (p0.c()) {
                   oj1 = r.b(obj.b, e.class, a.b);
                }else if(!p0.k()){
                   oj1 = r.b(obj.b, h.class, b.b);
                }
             }else {
                b.c0(LiveLogTag.LIVE_HIGH_FLUENCY_FEEDS, "HighFluencyHandlerManager.getHandler, unsupproted message", "messageType", p0.getClass());
             }
             oj1 = uod1;
          }
          if (oj1 != null) {
             a = b.a;
             x g = b.g;
             h = b.h;
             Objects.requireNonNull(h);
             u ou = new u(h);
             l ol = new l(b);
             c = b.c;
             if (oj1.a == null) {
                oj1.d = a;
                oj1.c = g;
                oj1.f = ol;
                oj1.b = ou;
                oj1.e = c;
                oj1.a = true;
             }
          }
          b.f0(LiveLogTag.LIVE_HIGH_FLUENCY_FEEDS, "LiveHighFluencyMessagePool.getHandler", "isSupportShowAsWeakStyle", Boolean.valueOf(p0.k()), "style", Boolean.valueOf(p0.c()), "type", p0.h(), "handler", oj1);
       }
       if (!obj) {
          b.c0(LiveLogTag.LIVE_HIGH_FLUENCY_FEEDS, "LiveHighFluencyMessagePool.pollOne failed -> no matched handler", "message", uod);
          return uod1;
       }else {
          LiveLogTag lIVE_HIGH_FL = LiveLogTag.LIVE_HIGH_FLUENCY_FEEDS;
          b.d0(lIVE_HIGH_FL, "LiveHighFluencyMessagePool.pollOne success", "message.priority", Integer.valueOf(p0.getPriority()), "isStrongStyle", Boolean.valueOf(p0.c()));
          b.d.remove(uod);
          c uoc = PatchProxy.applyOneRefs(obj, uod, c.class, "1");
          if (uoc != patchProxyRe) {
          }else if(uod.b == null){
             d uod2 = new d();
             uod2.b = (p0.c())? d.f: p0.i();
             uod2.d = uod;
             uod2.c = false;
             uod2.a = LiveCommentBottomMessageType.HighFluencyMessage;
             uod2.b(obj);
             uod.b = uod2;
          }
          uoc = uod.b;
          if (!PatchProxy.applyVoidTwoRefs(uoc, uod, b, ox, "15")) {
             b.j = true;
             b.k = true;
             if (!uoc.b - d.f) {
                if (!PatchProxy.applyVoidOneRefs(uod, b, ox, "16")) {
                   b.c0(lIVE_HIGH_FL, "LiveHighFluencyMessagePool.pendCollingUntilMessageSelfDiscard, start waiting", "message", uod);
                   b.l = new p(b, uod);
                }
             }else {
                k1.s(new w(b), b, p0.i());
             }
          }
          return uoc;
       }
    }
    public void j(Class p0,j p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, x.class, "2")) {
          return;
       }
       x tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, tf, c.class, "1")) {
          tf.a.put(p0, p1);
       }
       return;
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, x.class, "17")) {
          return;
       }
       this.k = false;
       this.h();
       k1.s(new m(this), this, this.f());
       return;
    }
    public final void l(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "24")) {
          return;
       }
       if (!q.f(p0) && p0.size() > 50) {
          while (p0.size() > 50) {
             p0.remove(0);
          }
       }
       return;
    }
    public void onDestroy(){
       Object[] objArray = null;
       String str = "3";
       if (PatchProxy.applyVoid(objArray, this, x.class, str)) {
          return;
       }
       this.b.o(510, this.i);
       k1.n(this);
       this.j = false;
       this.k = false;
       x tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoid(objArray, tf, c.class, str)) {
          tf.a(tf.a);
          tf.a(tf.b);
       }
       tf = this.h;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoid(objArray, tf, j.class, str)) {
          b.Z(LiveLogTag.LIVE_HIGH_FLUENCY_FEEDS, "HighFluencyStyleController.release");
          b9.a(tf.c);
       }
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, x.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveHighFluencyMessagePool{}@"+Integer.toHexString(System.identityHashCode(this));
    }
}

package ic9.w;
import lc9.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.gifshow.camera.record.autoapply.sample.c;
import fe9.f;
import wf9.f;
import java.lang.Integer;
import java.lang.Boolean;
import ic9.b;
import ic9.a;
import com.yxcorp.gifshow.camera.record.base.b;
import brd.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ic9.m;
import java.lang.Iterable;
import erd.o;
import java.lang.Number;
import java.util.Collection;
import lc9.a;
import com.yxcorp.gifshow.model.CDNUrl;
import j8c.a;
import q87.c;
import ic9.j;
import ic9.k;
import ic9.l;
import brd.w;
import ic9.i;
import ic9.n;
import erd.a;
import ic9.o;
import jd.c;
import ekd.q;
import java.lang.StringBuilder;
import ic9.v;
import ic9.f;
import ic9.h;
import ic9.r;
import erd.g;
import ic9.d;
import ic9.u;
import java.lang.Float;
import ic9.p;
import ic9.g;
import ic9.e;
import ic9.t;

public class w implements b	// class@002685
{
    public Map a;
    public b b;

    public void w(){
       super();
       Object[] objArray = null;
       HashMap hashMap = PatchProxy.apply(objArray, this, w.class, "15");
       if (hashMap != PatchProxyResult.class) {
       }else {
          hashMap = new HashMap();
          hashMap.put("sample", new c());
          hashMap.put("magicface", new f());
          hashMap.put("music", new f(objArray));
       }
       this.a = hashMap;
       return;
    }
    public String a(Object p0,int p1,boolean p2){
       if (PatchProxy.isSupport(w.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, w.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = "";
       if (!this.r(p0)) {
          return str;
       }else {
          p0 = p0.b();
          if (p0 != null && this.a.containsKey(p0.c())) {
             return this.a.get(p0.c()).a(p0.b(), p1, p2);
          }else {
             return str;
          }
       }
    }
    public void b(Object p0,int p1){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ow, "22")) {
          return;
       }
       if (!this.r(p0)) {
          return;
       }
       p0 = p0.b();
       b uob = this.a.get(p0.c());
       if (uob != null) {
          uob.b(p0.b(), p1);
       }
       return;
    }
    public t c(Object p0,b p1){
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, this, w.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       p0 = p0.a.iterator();
       while (p0.hasNext()) {
          a uoa = p0.next();
          b uob = this.a.get(uoa.c());
          if (uoa.h != null && (!uoa.e() && (uob != null && !uob.h(uoa.b())))) {
             obj.add(uob.c(uoa.b(), p1));
          }
       }
       if (obj.isEmpty()) {
          return t.just(Boolean.TRUE);
       }
       return t.zip(obj, m.b);
    }
    public int d(Object p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, w.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (!this.r(p0)) {
          return i;
       }
       p0 = p0.b();
       if (p0 != null && this.a.containsKey(p0.c())) {
          return this.a.get(p0.c()).d(p0.b(), p1);
       }
       return i;
    }
    public void e(Object p0){
    }
    public void f(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "8")) {
          return;
       }
       Iterator iterator = this.a.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().f(p0);
       }
       return;
    }
    public void g(Object p0,int p1){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ow, "23")) {
          return;
       }
       if (!this.r(p0)) {
          return;
       }
       p0 = p0.b();
       if (p0 != null) {
          b uob = this.a.get(p0.c());
          if (uob != null) {
             uob.g(p0.b(), p1);
          }
       }
       return;
    }
    public boolean h(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, w.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       p0 = p0.a.iterator();
       int i = 0;
       while (p0.hasNext()) {
          a uoa = p0.next();
          b uob = this.a.get(uoa.c());
          if (uob != null) {
             int i1 = (!uoa.a() - a.i)? 0: uob.h(uoa.b());
             i = i | i1;
          }
       }
       return i;
    }
    public String i(Object p0,int p1){
       return a.a(this, p0, p1);
    }
    public CDNUrl[] j(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, w.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       if (!this.r(p0)) {
          p0 = new CDNUrl[i];
          return p0;
       }else {
          p0 = p0.b();
          if (p0 != null && this.a.containsKey(p0.c())) {
             return this.a.get(p0.c()).j(p0.b());
          }
          p0 = new CDNUrl[i];
          return p0;
       }
    }
    public void k(Object p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, w.class, "7")) {
          return;
       }
       p0 = this.b;
       if (p0 != null) {
          p0 = p0.a.iterator();
          while (p0.hasNext()) {
             a uoa = p0.next();
             b uob = this.a.get(uoa.c());
             if (uob != null) {
                uob.k(uoa.b(), p1);
             }
          }
          if (this.m()) {
             p0 = this.b.a.iterator();
             while (p0.hasNext()) {
                b uob1 = this.a.get(p0.next().c());
                if (uob1 != null) {
                   uob1.f(p1);
                }
             }
          }
       }
       return;
    }
    public t l(Object p0,b p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t obj = PatchProxy.applyTwoRefs(p0, p1, this, w.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().s("CompoundProcessor", "download", objArray);
       this.b = p0;
       obj = this.u(p0.b, p1, 0);
       b c = p0.c;
       t ot = PatchProxy.applyThreeRefs(p0, c, p1, this, w.class, "20");
       if (ot != patchProxyRe) {
       }else {
          ot = this.v(p0, c, p1, true).flatMap(new j(this, p0, c, p1)).flatMap(new k(this, c, p1)).onErrorReturn(l.b);
       }
       return t.concat(obj, ot).map(new i(this, p0)).doOnDispose(n.b).doOnComplete(o.b);
    }
    public boolean m(){
       Object obj = PatchProxy.apply(null, this, w.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       w tb = this.b;
       if (tb != null) {
          Iterator iterator = tb.a.iterator();
          while (iterator.hasNext()) {
             b uob = this.a.get(iterator.next().c());
             if (uob != null) {
                i = i | uob.m();
             }
          }
       }
       return i;
    }
    public t n(Object p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, w.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().s("CompoundProcessor", "obtain", objArray);
       this.b = p0;
       return this.v(p0, p0.b, p1, 0);
    }
    public String o(Object p0,int p1,boolean p2){
       if (PatchProxy.isSupport(w.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, w.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = "";
       if (!this.r(p0)) {
          return str;
       }else {
          p0 = p0.b();
          if (p0 != null && this.a.containsKey(p0.c())) {
             return this.a.get(p0.c()).o(p0.b(), p1, p2);
          }else {
             return str;
          }
       }
    }
    public c p(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, w.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c uoc = null;
       if (!this.r(p0)) {
          return uoc;
       }
       p0 = p0.b();
       if (p0 != null && this.a.containsKey(p0.c())) {
          return this.a.get(p0.c()).p(p0.b());
       }
       return uoc;
    }
    public t q(Object p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, w.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().s("CompoundProcessor", "check", objArray);
       this.b = p0;
       return this.s(p0, p0.b, p1, 0);
    }
    public boolean r(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, w.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 instanceof b && !q.f(p0.a))? true: false;
       return b;
    }
    public final t s(b p0,List p1,b p2,boolean p3){
       ArrayList obj;
       if (PatchProxy.isSupport(w.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, w.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[0];
       a.D().s("CompoundProcessor", "getCheckObs, dataList:"+p1+" , isSkipError:"+p3, objArray);
       obj = new ArrayList();
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          b uob = this.a.get(uoa.c());
          if (uoa.a() - a.i && uob != null) {
             t ot = uob.q(uoa.b(), p2).map(new v(uoa, p0));
             if (p3) {
                ot = ot.onErrorReturn(new f(uoa, p0));
             }
             obj.add(ot);
          }
       }
       if (obj.isEmpty()) {
          return t.just(p0);
       }else {
          return t.zip(obj, new h(p0));
       }
    }
    public final a t(List p0,String p1){
       a obj = PatchProxy.applyTwoRefs(p0, p1, this, w.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          obj = iterator.next();
          if (p1.equals(obj.c())) {
             break ;
          }
       }
       return obj;
    }
    public final t u(List p0,b p1,boolean p2){
       ArrayList obj;
       if (PatchProxy.isSupport(w.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, w.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[0];
       a.D().s("CompoundProcessor", "getDownloadObs, dataList:"+p0+" , isSkipError:"+p2, objArray);
       obj = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          b uob = this.a.get(uoa.c());
          if (uoa.a() - a.i && uob != null) {
             t ot = uob.l(uoa.b(), p1).doOnNext(new r(uoa)).doOnComplete(new d(uoa, uob, p1));
             if (p2) {
                ot = ot.onErrorReturn(new u(uoa));
             }
             obj.add(ot);
          }
       }
       if (obj.isEmpty()) {
          return t.just(Float.valueOf(0x3f800000));
       }else {
          return t.merge(obj);
       }
    }
    public final t v(b p0,List p1,b p2,boolean p3){
       ArrayList obj;
       if (PatchProxy.isSupport(w.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, w.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[0];
       a.D().s("CompoundProcessor", "getObtainObs, dataList:"+p1+" , isSkipError:"+p3, objArray);
       obj = new ArrayList();
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          b uob = this.a.get(uoa.c());
          if (uob != null) {
             t ot = uob.n(uoa.b(), p2).doOnNext(new p(uoa)).map(new g(p0));
             if (p3) {
                ot = ot.onErrorReturn(new e(uoa, p0));
             }
             obj.add(ot);
          }
       }
       if (obj.isEmpty()) {
          return t.just(p0);
       }else if(p3){
          return t.zip(obj, new h(p0));
       }else {
          return t.zip(obj, new h(p0)).doOnNext(new t(this));
       }
    }
}

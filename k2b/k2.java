package k2b.k2;
import f3b.p$a;
import java.lang.Object;
import wkd.b;
import com.yxcorp.gifshow.log.n;
import com.yxcorp.gifshow.log.b;
import q2b.i;
import java.lang.Long;
import com.google.common.base.Optional;
import f3b.p;
import java.lang.String;
import java.util.concurrent.ConcurrentHashMap;
import com.yxcorp.gifshow.log.t;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.UUID;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import com.yxcorp.gifshow.log.model.CommonParams;
import java.lang.System;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import f3b.v;
import java.util.List;
import java.util.ArrayList;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import com.kwai.robust.PatchProxyResult;
import q2b.i$a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import java.lang.Boolean;
import y2b.b;
import java.util.Objects;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;
import org.json.JSONObject;
import java.lang.Exception;
import java.lang.StringBuilder;
import f3b.o;
import java.lang.Integer;

public class k2 implements p$a	// class@003268
{
    public ClientEvent$ExpTagTrans A;
    public ClientEvent$ExpTagTransList B;
    public CommonParams C;
    public v D;
    public v E;
    public long F;
    public long G;
    public long H;
    public long I;
    public b J;
    public Optional K;
    public Optional L;
    public Optional M;
    public p N;
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public String e;
    public final String f;
    public final String g;
    public final int h;
    public String i;
    public final boolean j;
    public String k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public int p;
    public String q;
    public String r;
    public String s;
    public final k2 t;
    public ClientEvent$ElementPackage u;
    public ClientContent$ContentPackage v;
    public ClientContent$ContentPackage w;
    public ClientContentWrapper$ContentWrapper x;
    public String y;
    public ClientEvent$ExpTagTrans z;
    public static final z O;

    static {
       k2.O = b.a(0x4b316083).v;
    }
    public void k2(b p0,i p1,k2 p2,Long p3){
       super();
       this.l = 1;
       this.o = false;
       this.p = -1;
       this.q = null;
       this.r = null;
       this.F = -1;
       this.G = -1;
       this.H = -1;
       this.I = -1;
       this.K = Optional.absent();
       this.L = Optional.absent();
       this.M = Optional.absent();
       this.N = new p(this);
       this.b = p1.b();
       this.c = p1.o();
       this.d = p1.p();
       this.e = p1.s();
       this.i = p1.v();
       this.j = p1.c();
       if (p0 != null && (p0.J() != null && !TextUtils.x(p0.J().get(t.h(p1))))) {
          this.a = p0.J().get(t.h(p1));
          p0.J().remove(t.h(p1));
       }else {
          this.a = UUID.randomUUID().toString();
       }
       this.f = p1.m();
       this.g = p1.w();
       this.h = p1.q();
       this.k = p1.r();
       this.n = p1.u();
       if (p1.i() > 0) {
          this.H = p1.i();
       }
       this.u = p1.j();
       this.v = p1.e();
       this.x = p1.g();
       this.y = p1.h();
       this.z = p1.k();
       this.A = p1.l();
       this.w = p1.f();
       this.C = p1.d();
       this.t = p2;
       this.p = -1;
       this.q = null;
       this.J = p0;
       this.m = p1.t();
       if (!this.G - -1) {
          this.G = Optional.fromNullable(p3).or(Long.valueOf(System.currentTimeMillis())).longValue();
       }
       return;
    }
    public void A(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k2.class, "1")) {
          return;
       }
       if (p0.u()) {
          this.n = p0.u();
       }
       if (p0.t()) {
          this.m = p0.t();
       }
       if (!TextUtils.x(p0.v())) {
          this.i = p0.v();
       }
       if (!TextUtils.x(p0.s())) {
          this.e = p0.s();
       }
       if (!TextUtils.x(p0.r())) {
          this.k = p0.r();
       }
       if (p0.j() != null) {
          this.u = p0.j();
       }
       if (p0.e() != null) {
          this.v = p0.e();
       }
       if (p0.g() != null) {
          this.x = p0.g();
       }
       if (!TextUtils.x(p0.h())) {
          this.y = p0.h();
       }
       if (p0.k() != null) {
          this.z = p0.k();
       }
       if (p0.l() != null) {
          this.A = p0.l();
       }
       if (p0.f() != null) {
          this.w = p0.f();
       }
       if (p0.d() != null) {
          this.C = p0.d();
       }
       if (p0.i() > 0) {
          this.H = p0.i();
       }
       return;
    }
    public void B(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k2.class, "11")) {
          return;
       }
       this.E = v.h(this.E, p0);
       return;
    }
    public void a(List p0){
       k2 ok2 = k2.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ok2, "20")) {
          return;
       }
       v ov = this.q();
       ArrayList uArrayList = new ArrayList();
       if (ov != null && ov.j() != null) {
          uArrayList.addAll(ov.j());
       }
       uArrayList.addAll(p0);
       ImmutableList immutableLis = ImmutableList.copyOf(uArrayList);
       if (!PatchProxy.applyVoidOneRefs(immutableLis, this, ok2, "5")) {
          this.M = Optional.fromNullable(immutableLis);
       }
       return;
    }
    public void b(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k2.class, "16")) {
          return;
       }
       v ov = this.q();
       ArrayList uArrayList = new ArrayList();
       if (ov != null && ov.b() != null) {
          uArrayList.addAll(ov.b());
       }
       uArrayList.addAll(p0);
       this.t(ImmutableList.copyOf(uArrayList));
       return;
    }
    public i d(){
       Object obj = PatchProxy.apply(null, this, k2.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return i.a().u(this.k).y(this.i).e(this.b).r(this.c).s(this.d).p(this.f).v(this.e).f(this.j).z(this.g).n(this.z).o(this.A).m(this.u).h(this.v).j(this.x).k(this.y).i(this.w).g(this.C).b();
    }
    public ClientEvent$UrlPackage e(boolean p0){
       ClientEvent$UrlPackage obj;
       k2 ok2 = k2.class;
       if (PatchProxy.isSupport(ok2)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, ok2, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ClientEvent$UrlPackage();
       obj.category = this.b;
       obj.page = this.c;
       obj.page2 = TextUtils.I(this.d);
       obj.pageType = this.h;
       obj.subPages = TextUtils.I(this.i);
       obj.params = TextUtils.I(this.k);
       obj.identity = this.a;
       k2 tp = this.p;
       if (tp > null) {
          obj.pageSeq = tp;
       }
       obj.entryPageId = TextUtils.I(this.q);
       obj.entryPageSource = TextUtils.I(this.r);
       if (p0) {
          obj.expTagList = this.B;
       }
       obj.topPage = TextUtils.k(this.s);
       obj.coPage = this.j;
       return obj;
    }
    public long f(){
       return this.H;
    }
    public final b g(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       k2 obj = PatchProxy.apply(objArray, this, k2.class, "18");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.D;
       if (obj != null) {
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(objArray, obj, v.class, "10");
          if (obj1 != patchProxyRe) {
             objArray = obj1;
          }else if(obj.e()){
             objArray = obj.i();
          }
       }
       return objArray;
    }
    public Optional h(){
       return this.L;
    }
    public Optional i(){
       return this.K;
    }
    public int j(){
       return this.m;
    }
    public int k(){
       return this.l;
    }
    public String l(){
       return this.k;
    }
    public p m(){
       return this.N;
    }
    public long n(){
       return (this.I - this.F);
    }
    public String o(){
       return this.i;
    }
    public v p(){
       p b;
       v ov;
       b uob;
       b uob1;
       v ov1;
       k2 ok2 = k2.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       k2 obj = PatchProxy.apply(objArray, this, ok2, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       ok2 = PatchProxy.apply(objArray, this, ok2, "10");
       if (ok2 != patchProxyRe) {
       }else {
          ok2 = this.E;
          if (ok2 == null || !ok2.e()) {
             obj = this.D;
             if (obj != null && obj.e()) {
                uob = new b();
                uob1 = this.D.i();
                if (uob1 != null) {
                   uob.f(uob1.c());
                   uob.e(uob1.a());
                   uob.h(uob1.d());
                }
                if (ok2 == null) {
                   ov1 = v.a(objArray, objArray, uob, objArray);
                }else {
                   ov1 = v.a(ok2.g(), ok2.b(), uob, ok2.j());
                }
             }
          }
          if (ov1 == null || (!ov1.e() && this instanceof b)) {
             try{
                ov = this.G();
                if (ov != null && ov.e()) {
                   uob1 = new b();
                   uob = ov.i();
                   if (uob != null) {
                      uob1.f(uob.c());
                      uob1.e(uob.a());
                      uob1.h(uob.d());
                   }
                   if (ov1 == null) {
                      ov1 = v.a(objArray, objArray, uob1, objArray);
                   }else {
                      ov1 = v.a(ov1.g(), ov1.b(), uob1, ov1.j());
                   }
                }
             }catch(java.lang.Exception e3){
                e3.printStackTrace();
             }
          }
       }
       obj = this.N;
       p a = obj.a;
       obj.a = objArray;
       b = obj.b;
       obj.b = objArray;
       ov = PatchProxy.applyThreeRefs(ok2, a, b, null, v.class, "4");
       if (ov != patchProxyRe) {
       }else if(ok2 == null){
          if (a != null && (!a.isEmpty() || (b != null && !b.isEmpty()))) {
             if (b == null || b.isEmpty()) {
                objArray = v.a(objArray, ImmutableList.copyOf(a), objArray, objArray);
             }else if(a == null || a.isEmpty()){
                ov = v.a(objArray, objArray, objArray, ImmutableList.copyOf(b));
             }else {
                ov = v.a(objArray, ImmutableList.copyOf(a), objArray, ImmutableList.copyOf(b));
             }
          }
          ov = objArray;
       }else {
          ArrayList uArrayList = new ArrayList();
          if (ok2.c()) {
             uArrayList.addAll(ok2.b());
          }
          if (a != null && !a.isEmpty()) {
             uArrayList.addAll(a);
          }
          ArrayList uArrayList1 = new ArrayList();
          if (ok2.f()) {
             uArrayList1.addAll(ok2.j());
          }
          if (b != null && !b.isEmpty()) {
             uArrayList1.addAll(b);
          }
          ov = v.a(ok2.g(), ImmutableList.copyOf(uArrayList), ok2.i(), ImmutableList.copyOf(uArrayList1));
       }
       return ov;
    }
    public v q(){
       return this.D;
    }
    public boolean r(){
       boolean b = (this.F > 0)? true: false;
       return b;
    }
    public boolean s(){
       boolean b = (this.I < 0)? true: false;
       return b;
    }
    public void t(ImmutableList p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k2.class, "4")) {
          return;
       }
       this.L = Optional.fromNullable(p0);
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, k2.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LogPage\(page: "+this.d+"£¬scene £º"+this.e+"£¬category £º"+o.e(this.b)+", identity : "+this.a+", subPages : "+this.i+", params : "+this.k+", create cost "+this.f()+", stay length : "+this.n()+"\n ReferPage --> "+this.t;
    }
    public void u(ImmutableList p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k2.class, "3")) {
          return;
       }
       this.K = Optional.fromNullable(p0);
       return;
    }
    public void v(int p0){
       this.m = p0;
    }
    public void w(Integer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k2.class, "12")) {
          return;
       }
       if (p0 != null && p0.intValue()) {
          this.l = p0.intValue();
       }
       return;
    }
    public void x(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k2.class, "6")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          this.k = p0;
       }
       return;
    }
    public void y(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k2.class, "8")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          this.i = p0;
       }
       return;
    }
    public void z(v p0){
       this.D = p0;
    }
}

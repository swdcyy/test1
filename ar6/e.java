package ar6.e;
import zq6.r;
import com.kwai.kcube.internal.tab.TabNode;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.kcube.TabIdentifier;
import java.util.LinkedHashMap;
import ar6.e$a;
import zq6.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import com.kwai.kcube.internal.tab.container.ContainerTabNode;
import zq6.b;
import ar6.a;
import com.kwai.robust.PatchProxyResult;
import ar6.f;
import wq6.h;
import zq6.t;
import msd.a;
import nsd.u;
import java.lang.Boolean;
import java.lang.System;

public final class e implements r	// class@0003a1
{
    public final String a;
    public final Map b;
    public final e$a c;
    public final TabNode d;

    public void e(TabNode p0){
       a.p(p0, "tabNode");
       super();
       this.d = p0;
       this.a = p0.q().toString();
       this.b = new LinkedHashMap();
       this.c = new e$a(this);
    }
    public static void h(e p0,p p1,Object p2,String p3,boolean p4,int p5,Object p6){
       if (p5 & 0x04) {
          p3 = "Unk";
       }
       if (p5 & 0x08) {
          p4 = false;
       }
       p0.g(p1, p2, p3, p4);
       return;
    }
    public void a(p p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "4")) {
          return;
       }
       a.p(p0, "stateId");
       a.p(p1, "data");
       e.h(this, p0, p1, null, false, 12, null);
       return;
    }
    public void b(p p0,Object p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, e.class, "5")) {
          return;
       }
       a.p(p0, "stateId");
       a.p(p1, "data");
       a.p(p2, "reason");
       e.h(this, p0, p1, p2, false, 8, null);
       return;
    }
    public void c(p p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "7")) {
          return;
       }
       a.p(p0, "stateId");
       if (!this.d.s()) {
          return;
       }
       if (this.b.containsKey(p0)) {
          this.b.remove(p0);
          ContainerTabNode uContainerTa = this.d.z();
          a uoa = null;
          b uob = (uContainerTa != null)? uContainerTa.G(): uoa;
          if (uob instanceof a) {
             uoa = uob;
          }
          if (uoa != null) {
             uoa.m(this.d, p0);
          }
       }
       return;
    }
    public Object d(p p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "stateId");
       f uof = this.f(p0);
       uof = (uof != null)? uof.value(): null;
       return uof;
    }
    public void e(p p0,Object p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, e.class, "6")) {
          return;
       }
       a.p(p0, "stateId");
       a.p(p1, "data");
       a.p(p2, "reason");
       this.g(p0, p1, p2, true);
       return;
    }
    public final f f(p p0){
       p obj = PatchProxy.applyOneRefs(p0, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "stateId");
       obj = p0.e;
       if (obj != null) {
          h oh = this.d.A();
          f uof = this.b.get(p0);
          Object obj1 = (uof != null)? uof.value(): null;
          Object obj2 = obj.a(oh, obj1);
          if (obj2 != null) {
             f uof1 = new f(obj2, null, "StateEvaluator", null, false, 26, null);
             return p0;
          }
       }
       return this.b.get(p0);
    }
    public final void g(p p0,Object p1,String p2,boolean p3){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, e.class, "8")) {
          return;
       }
       if (!this.d.s()) {
          return;
       }
       Object obj = this.b.get(p0);
       a uoa = null;
       if (!obj instanceof f) {
          obj = uoa;
       }
       if (obj == null) {
          f uof = new f(p1, null, this.a, p2, p3, 2, null);
          this.b.put(p0, v1);
       }else if(PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(p1, p2, Boolean.valueOf(p3), obj, f.class, "2")){
          a.p(p1, "data");
          a.p(p2, "reason");
          obj.b = false;
          obj.a = p1;
          obj.f = p2;
          obj.g = p3;
          obj.c = System.currentTimeMillis();
       }
       p1 = this.d.z();
       p1 = (p1 != null)? p1.G(): uoa;
       if (p1 instanceof a) {
          uoa = p1;
       }
       if (uoa != null) {
          uoa.m(this.d, p0);
       }
       return;
    }
}

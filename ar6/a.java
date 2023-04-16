package ar6.a;
import zq6.b;
import ar6.a$b;
import nsd.u;
import com.kwai.kcube.internal.tab.container.ContainerTabNode;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import fr6.b;
import ar6.a$a;
import fr6.i;
import java.util.LinkedHashMap;
import ar6.a$c;
import wq6.h;
import zq6.p;
import zq6.u;
import zq6.a;
import zq6.s;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ar6.c;
import com.kwai.kcube.internal.tab.TabNode;
import wq6.m;
import ar6.f;
import com.kwai.kcube.TabIdentifier;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import zq6.b$a;
import zq6.a$a;
import zq6.i;
import ar6.b;
import java.util.Iterator;
import java.util.Objects;
import wr6.a;
import java.lang.StringBuilder;
import q87.c;
import zq6.o;
import ur6.f;
import zq6.o$a;
import zq6.v;
import msd.a;
import ar6.e;
import wq6.f;
import ur6.e;
import java.lang.Boolean;
import java.lang.IllegalArgumentException;
import com.kwai.kcube.communication.upward.RefreshTrigger;
import java.util.Set;
import java.util.Map$Entry;
import java.lang.Iterable;
import nsd.s0;

public final class a implements b	// class@00039c
{
    public int a;
    public int b;
    public float c;
    public final Map d;
    public final Map e;
    public final o$a f;
    public final ContainerTabNode g;
    public static final boolean h;
    public static final a$b i;

    static {
       a.i = new a$b(null);
    }
    public void a(ContainerTabNode p0){
       a.p(p0, "containerNode");
       super();
       this.g = p0;
       p0.O().c(new a$a(this));
       this.d = new LinkedHashMap();
       this.e = new LinkedHashMap();
       this.f = new a$c(this);
    }
    public s a(h p0,p p1,u p2,a p3){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, a.class, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "child");
       a.p(p1, "stateId");
       a.p(p3, "callerInfo");
       obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, a.class, "7");
       if (obj != patchProxyRe) {
       }else if(p3 != null){
          b = p3.b();
       }else {
          b = false;
       }
       ArrayList uArrayList = null;
       ArrayList uArrayList1 = (p3 != null)? p3.a(): uArrayList;
       obj = new c(p2, b, uArrayList1);
       f uof = this.i(m.b(p0), p1, obj);
       if (p2 != null) {
          Map map = this.d.get(p0.M2());
          if (map == null) {
             map = new LinkedHashMap();
             this.d.put(p0.M2(), map);
          }else {
             uArrayList = map.get(p1);
          }
          if (uArrayList == null) {
             uArrayList = new ArrayList();
             map.put(p1, uArrayList);
          }
          uArrayList.add(obj);
          if (uof != null) {
             obj.d(p1, uof);
          }
       }else if(uof != null){
          obj.b(uof);
       }
       return obj;
    }
    public s b(p p0,u p1){
       s this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "17");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "stateId");
       this = PatchProxy.applyThreeRefs(this, p0, p1, null, b$a.class, "2");
       if (this != patchProxyRe) {
       }else {
          a.p(p0, "stateId");
          this = this.f(p0, p1, a.e.a());
       }
       return this;
    }
    public s c(h p0,List p1,i p2){
       List list;
       b obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "child");
       a.p(p1, "stateIdList");
       a.p(p2, "watcher");
       boolean b = true;
       obj = new b(p2, b, null);
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          p op = iterator.next();
          Objects.requireNonNull(op, "null cannot be cast to non-null type com.kwai.kcube.communication.upward.StateId<kotlin.Any>");
          f uof = this.i(m.b(p0), op, obj);
          Map map = this.d.get(p0.M2());
          if (map == null) {
             map = new LinkedHashMap();
             this.d.put(p0.M2(), map);
             list = null;
          }else {
             list = map.get(op);
          }
          if (list == null) {
             list = new ArrayList();
             map.put(op, list);
          }
          list.add(obj);
          if (uof != null) {
             linkedHashMa.put(op, uof.value());
          }
       }
       if ((linkedHashMa.isEmpty() ^ b) && !PatchProxy.applyVoidOneRefs(linkedHashMa, obj, b.class, "2")) {
          a.p(linkedHashMa, "valuesMap");
          obj.f.a(linkedHashMa);
          if (a.i.a()) {
             Object[] objArray = new Object[0];
             a.c.w("ChildStateReader", "notifyFirstValues\(\) "+linkedHashMa, objArray);
          }
       }
       return obj;
    }
    public Object d(p p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "stateId");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, b$a.class, "4");
       if (obj1 == PatchProxyResult.class) {
          a.p(p0, "stateId");
          obj1 = this.b(p0, null).value();
       }
       return obj1;
    }
    public Object e(h p0,p p1){
       Object this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "18");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "child");
       a.p(p1, "stateId");
       this = PatchProxy.applyThreeRefs(this, p0, p1, null, b$a.class, "3");
       if (this == patchProxyRe) {
          a.p(p0, "child");
          a.p(p1, "stateId");
          this = this.g(p0, p1, null).value();
       }
       return this;
    }
    public s f(p p0,u p1,a p2){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "stateId");
       a.p(p2, "callerInfo");
       obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "9");
       if (obj != patchProxyRe) {
       }else if(p2 != null){
          b = p2.b();
       }else {
          b = false;
       }
       p2 = (p2 != null)? p2.a(): null;
       obj = new c(p1, b, p2);
       f uof = this.h(p0, obj);
       if (p1 != null) {
          List list = this.e.get(p0);
          if (list == null) {
             list = new ArrayList();
             this.e.put(p0, list);
          }
          list.add(obj);
          if (uof != null) {
             obj.d(p0, uof);
          }
       }else if(uof != null){
          obj.b(uof);
       }
       return obj;
    }
    public s g(h p0,p p1,u p2){
       s this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "16");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "child");
       a.p(p1, "stateId");
       this = PatchProxy.applyFourRefs(this, p0, p1, p2, null, b$a.class, "1");
       if (this != patchProxyRe) {
       }else {
          a.p(p0, "child");
          a.p(p1, "stateId");
          this = this.a(p0, p1, p2, a.e.a());
       }
       return this;
    }
    public final f h(p p0,c p1){
       a uoa1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       f obj = PatchProxy.applyTwoRefs(p0, p1, this, uoa, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       v ov = PatchProxy.applyTwoRefs(p0, p1, this, uoa, "4");
       obj = null;
       if (ov != patchProxyRe) {
       }else if(this.a >= this.g.F() || this.a < null){
          uoa1 = 1;
       }else {
          uoa1 = null;
       }
       int i = (uoa1)? 0: this.a;
       int i1 = (uoa1)? 0: this.b;
       float f = (uoa1)? 0: this.c;
       v ov1 = p0.c().a(p0, this.g.d0().getChildren(), i, i1, f, p1, this.f);
       this.k("getPolyState\(\) "+p0+" ["+this.a+','+this.b+','+this.c+"], valueW="+ov1);
       if (!ov1 instanceof f) {
          ov1 = obj;
       }
       ov = ov1;
       if (ov != null) {
          obj = ov;
       }else if(p0.a() != null){
          f uof = new f(p0.a(), null, "SysDef", "Def", false, 18, null);
       }
       return obj;
    }
    public final f i(TabNode p0,p p1,c p2){
       String str1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       f uof = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "2");
       Object obj1 = null;
       if (uof != patchProxyRe) {
       }else if(this.g.H(p0.q())){
          uof = p0.k().f(p1);
          if (p2.d != null && (p0.u() && (uof == null || uof.g == null))) {
             b uob = p0.K().y();
             Objects.requireNonNull(uob, "null cannot be cast to non-null type com.kwai.kcube.communication.upward.impl.ChildStateReaderImpl");
             f uof2 = uob.h(p1, p2);
             if (uof2 != null) {
                boolean Object uob1 = PatchProxy.apply(obj1, uof2, f.class, "4");
                uob1 = (uob1 != patchProxyRe)? uob1.booleanValue(): a.g(uof2.f, "Def");
                if (!uob1) {
                   uof = uof2;
                }
             }
          }
       label_0080 :
          StringBuilder str = "getState\(\) child="+p0.A().M2()+' '+p1.b()+",valueW=";
          if (uof != null) {
             str1 = PatchProxy.apply(obj1, uof, f.class, "7");
             if (str1 != patchProxyRe) {
             }else {
                str1 = "v="+uof.a+",o="+uof.e+",r="+uof.f;
             }
          }else {
             str1 = obj1;
          }
          this.k(str+str1);
       }else {
          throw new IllegalArgumentException(p0+" 不是 "+this.g+" 的直接子tab");
       }
       if (uof != null) {
          obj1 = uof;
       }else if(p1.a() != null){
          f uof1 = new f(p1.a(), null, "SysDef", "Def", false, 18, null);
       }
       return obj1;
    }
    public final a j(){
       Object[] objArray = null;
       ContainerTabNode obj = PatchProxy.apply(objArray, this, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.g.s()) {
          return objArray;
       }
       obj = this.g.z();
       b uob = (obj != null)? obj.G(): objArray;
       if (uob instanceof a) {
          objArray = uob;
       }
       return objArray;
    }
    public final void k(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "15")) {
          return;
       }
       if (a.h) {
          Object[] objArray = new Object[0];
          a.c.w("ChildStateReader", this.g.q().getType()+this.g.d0().M2()+": "+p0, objArray);
       }
       return;
    }
    public final void l(TabNode p0,RefreshTrigger p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "12")) {
          return;
       }
       Map map = this.d.get(p0.q());
       if (map != null) {
          Iterator iterator = map.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             p key = uEntry.getKey();
             List value = uEntry.getValue();
             if (key.c().b() == p1) {
                Iterator iterator1 = value.iterator();
                while (iterator1.hasNext()) {
                   c uoc = iterator1.next();
                   Objects.requireNonNull(uoc, "null cannot be cast to non-null type com.kwai.kcube.communication.upward.impl.Observer<kotlin.Any>");
                   f uof = this.i(p0, key, uoc);
                   if (uof != null) {
                      uoc.d(key, uof);
                   }else {
                      continue ;
                   }
                }
             }
          }
       }
       this.n(p1);
       a uoa = this.j();
       if (uoa != null) {
          uoa.l(this.g, p1);
       }
       return;
    }
    public final void m(TabNode p0,p p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "11")) {
          return;
       }
       a.p(p0, "childTab");
       a.p(p1, "stateId");
       Map map = this.d.get(p0.q());
       List list = null;
       List list1 = (map != null)? map.get(p1): list;
       if (!s0.F(list1)) {
          list1 = list;
       }
       if (list1 != null) {
          Iterator iterator = list1.iterator();
          while (iterator.hasNext()) {
             c uoc = iterator.next();
             f uof = this.i(p0, p1, uoc);
             if (uof != null) {
                uoc.d(p1, uof);
             }
          }
       }
       p0 = this.e.get(p1);
       if (s0.F(p0)) {
          list = p0;
       }
       if (list != null) {
          this.o(p1, list);
       }
       a uoa = this.j();
       if (uoa != null) {
          uoa.m(this.g, p1);
       }
       return;
    }
    public final void n(RefreshTrigger p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "13")) {
          return;
       }
       Iterator iterator = this.e.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          p key = uEntry.getKey();
          List value = uEntry.getValue();
          if (key.c().b() == p0) {
             Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.collections.MutableList<com.kwai.kcube.communication.upward.impl.Observer<kotlin.Any>>");
             this.o(key, s0.g(value));
          }
       }
       return;
    }
    public final void o(p p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "10")) {
          return;
       }
       Objects.requireNonNull(p0, "null cannot be cast to non-null type com.kwai.kcube.communication.upward.StateId<kotlin.Any>");
       f uof = this.h(p0, p1.get(0));
       if (uof != null) {
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             iterator.next().d(p0, uof);
          }
       }
       return;
    }
    public final void p(int p0){
       this.b = p0;
    }
}

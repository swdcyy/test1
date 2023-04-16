package com.kuaishou.android.post.session.previewtasks.a;
import java.lang.Object;
import java.util.HashMap;
import rk.u;
import com.google.common.graph.ElementOrder;
import rk.a0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cq.a;
import q87.c;
import java.util.Collection;
import java.util.Iterator;
import com.kuaishou.android.post.session.previewtasks.a$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.Set;
import rk.t;
import java.util.Map;
import java.util.HashSet;
import java.lang.Boolean;
import com.google.common.graph.Graphs;
import w46.b;
import java.lang.RuntimeException;

public class a	// class@000ebd
{
    public final HashMap a;
    public final a0 b;

    public void a(){
       super(false, 20);
    }
    public void a(boolean p0,int p1){
       super();
       this.a = new HashMap();
       u ou = u.c();
       ou.e(ElementOrder.a());
       ou.d(p1);
       ou.a(p0);
       this.b = ou.b();
    }
    public synchronized void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "12")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("GraphManager", "clear", objArray);
       Iterator iterator = this.a.values().iterator();
       while (iterator.hasNext()) {
          this.b.n(iterator.next());
       }
       this.a.clear();
       return;
    }
    public synchronized final a$a b(Object p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("GraphManager", "findNode key:"+p0, objArray);
       a$a uoa = null;
       obj = this.b.f().iterator();
       while (obj.hasNext()) {
          a$a uoa1 = obj.next();
          if (p0.equals(uoa1.key())) {
             uoa = uoa1;
             break ;
          }
       }
       return uoa;
    }
    public synchronized Map c(){
       HashMap obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("GraphManager", "getAllNodeMap size:"+this.a.size(), objArray);
       obj = new HashMap();
       Iterator iterator = this.a.keySet().iterator();
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          obj.put(obj1, this.a.get(obj1));
       }
       return obj;
    }
    public synchronized Set d(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("GraphManager", "getAllNodeSet size:"+this.a.size(), objArray);
       return new HashSet(this.a.values());
    }
    public synchronized boolean e(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return Graphs.d(this.b);
    }
    public synchronized final boolean f(a$a p0,Collection p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 1;
       int i1 = 0;
       int i2 = (p0 != null)? this.a.containsKey(p0.key()) ^ i: false;
       Object[] objArray = new Object[i1];
       a.D().w("GraphManager", "nodeNotExistInGraph hasNodeNotExist:"+i2, objArray);
       Iterator iterator = p1.iterator();
       do {
          if (iterator.hasNext()) {
          }else {
             i = i2;
             break ;
          }
       } while (!this.a.containsKey(iterator.next().key()));
       Object[] objArray1 = new Object[i1];
       a.D().w("GraphManager", "nodeNotExistInGraph hasNodeNotExist:"+i, objArray1);
       return i;
    }
    public synchronized boolean g(a$a p0,Collection p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Object[] objArray = new Object[0];
       a.D().w("GraphManager", "predecessorsLink targetNode:"+p0, objArray);
       if (this.f(p0, p1)) {
          Object[] objArray1 = new Object[0];
          a.D().t("GraphManager", "predecessorsLink some node not in graph", objArray1);
          return 0;
       }else {
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             this.b.u(iterator.next(), p0);
          }
          return true;
       }
    }
    public synchronized boolean h(a$a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = this.a.containsKey(p0.key());
       Object[] objArray = new Object[0];
       a.D().w("GraphManager", "putNode node:"+p0+",nodeExist:"+b, objArray);
       if (b) {
          a$a uoa = this.b(p0.key());
          if (uoa != null) {
             this.b.n(uoa);
             this.g(p0, this.b.a(uoa));
             this.j(p0, this.b.b(uoa));
          }else {
             throw new RuntimeException("error node exist in map but not exist in graph");
          }
       }else {
          this.a.put(p0.key(), p0);
          this.b.q(p0);
       }
       return b;
    }
    public synchronized boolean i(a$a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       int i = 0;
       boolean b1 = (this.a.remove(p0.key()) != null)? true: false;
       Object[] objArray = new Object[i];
       a.D().w("GraphManager", "removedNode result1:"+b1, objArray);
       if (!b1 || !this.b.n(p0)) {
          b = false;
       }
       Object[] objArray1 = new Object[i];
       a.D().w("GraphManager", "removedNode result2:"+b, objArray1);
       return b;
    }
    public synchronized boolean j(a$a p0,Collection p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Object[] objArray = new Object[0];
       a.D().w("GraphManager", "successorsLink targetNode:"+p0, objArray);
       if (this.f(p0, p1)) {
          Object[] objArray1 = new Object[0];
          a.D().t("GraphManager", "successorsLink some node not in graph", objArray1);
          return 0;
       }else {
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             this.b.u(p0, iterator.next());
          }
          return true;
       }
    }
}

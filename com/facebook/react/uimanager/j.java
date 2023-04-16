package com.facebook.react.uimanager.j;
import com.facebook.react.bridge.ReactApplicationContext;
import ze.m;
import java.lang.Object;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.HashMap;
import com.facebook.react.uimanager.j$j;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.j$a;
import yd.e;
import com.facebook.react.uimanager.c;
import ze.x;
import java.util.HashSet;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.uimanager.f;
import java.lang.Integer;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.lang.Long;
import hg.b$b;
import hg.b;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;
import cf.a;
import hg.a;
import com.facebook.react.uimanager.j$b;
import java.lang.Runnable;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.RenderProfileQueue;
import ze.n0;
import ze.z;
import com.facebook.react.uimanager.j$e;
import ze.a1;
import com.facebook.react.uimanager.j$n;
import com.facebook.react.uimanager.j$a0;
import com.facebook.react.uimanager.j$y;
import com.facebook.react.uimanager.j$z;
import cb.a;
import ze.y0;
import com.facebook.react.uimanager.RenderProfileQueue$a;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.uimanager.j$w;
import com.facebook.react.uimanager.j$b0;
import java.util.Objects;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReadableArray;
import ze.y;
import ze.k0;
import com.facebook.react.uimanager.j$l;
import ze.f;
import com.facebook.react.uimanager.j$s;
import com.facebook.react.uimanager.j$c;
import com.facebook.react.uimanager.j$h;
import com.facebook.react.uimanager.j$i;
import java.lang.Boolean;
import java.util.concurrent.CopyOnWriteArraySet;
import com.facebook.react.uimanager.j$x;

public class j	// class@00136d
{
    public c A;
    public boolean B;
    public HashMap C;
    public f D;
    public boolean E;
    public boolean F;
    public final int[] a;
    public f b;
    public final Object c;
    public final Object d;
    public final j$j e;
    public final ReactApplicationContext f;
    public ArrayList g;
    public ArrayList h;
    public ArrayDeque i;
    public a j;
    public boolean k;
    public boolean l;
    public boolean m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public CopyOnWriteArraySet z;

    public void j(ReactApplicationContext p0,m p1,int p2){
       super();
       int[] ointArray = new int[4];
       this.a = ointArray;
       this.c = new Object();
       this.d = new Object();
       this.g = new ArrayList();
       this.h = new ArrayList();
       this.i = new ArrayDeque();
       this.k = false;
       this.l = false;
       this.m = false;
       this.B = false;
       this.C = new HashMap();
       this.D = null;
       this.E = false;
       this.F = false;
       this.b = p1;
       if (p2 == -1) {
          p2 = 8;
       }
       this.e = new j$j(this, p0, p2, null);
       this.f = p0;
       if (e.r) {
          this.e(true);
          c uoc = new c(this, p1);
          this.A = uoc;
          this.b = uoc;
          this.B = true;
       }
       return;
    }
    public void a(x p0,HashSet p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "44")) {
          return;
       }
       int syncRenderDa = p0.getSyncRenderDataCellRootTag();
       if (!syncRenderDa) {
          return;
       }
       p1.add(Integer.valueOf(this.D.i(p0.getSyncRenderDataTag()).indexOf(this.D.i(syncRenderDa))));
       return;
    }
    public final void b(int p0,HashSet p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oj, "43")) {
          return;
       }
       x ox = this.D.i(p0);
       LinkedHashMap linkedHashMa = this.C.get(String.valueOf(p0));
       if (linkedHashMa != null && ox != null) {
          int i = 0;
          while (i < ox.getChildCount()) {
             if (linkedHashMa.get(Integer.valueOf(i)) == null || ox.getChildAt(i).getReactTag() != linkedHashMa.get(Integer.valueOf(i)).intValue()) {
                p1.add(Integer.valueOf(i));
             }
             i = i + 1;
          }
       }
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, j.class, "42")) {
          return;
       }
       j tC = this.C;
       if (tC == null) {
          return;
       }
       Iterator iterator = tC.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          LinkedHashMap linkedHashMa = this.C.get(str);
          x ox = this.D.i(Integer.parseInt(str));
          if (ox == null || linkedHashMa == null) {
             continue ;
          }else {
             linkedHashMa.clear();
             for (int i = 0; i < ox.getChildCount(); i = i + 1) {
                linkedHashMa.put(Integer.valueOf(i), Integer.valueOf(ox.getChildAt(i).getReactTag()));
             }
          }
       }
       return;
    }
    public void d(int p0,long p1,long p2){
       boolean b;
       j g;
       j oj2;
       j oj = this;
       int i = p0;
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), this, j.class, "37")) {
          return;
       }
       b.a(0, "UIViewOperationQueue.dispatchViewUpdates").b("batchId", i).e();
       long l = SystemClock.uptimeMillis();
       long l1 = SystemClock.currentThreadTimeMillis();
       AtomicBoolean uAtomicBoole = new AtomicBoolean(false);
       j oj1 = null;
       b = true;
       if (!oj.g.isEmpty()) {
          g = oj.g;
          oj.g = super();
          uAtomicBoole.set(b);
          oj2 = g;
       }else {
          oj2 = oj1;
       }
       g = oj.d;
       _monitor_enter(g);
       if (!oj.i.isEmpty()) {
          oj1 = oj.i;
          oj.i = new ArrayDeque();
          uAtomicBoole.set(b);
       }
       j oj3 = oj1;
       _monitor_exit(g);
       ArrayList uArrayList = oj.l(oj2, oj3);
       if (uArrayList != null && !uArrayList.isEmpty()) {
          uAtomicBoole.set(b);
       }
       g = oj.j;
       if (g != null) {
          g.b();
       }
       oj1 = this;
       AtomicBoolean uAtomicBoole1 = uAtomicBoole;
       j$a uoa = v11;
       j$a uoa1 = new j$a(oj1, p0, oj3, oj2, uArrayList, uAtomicBoole, p1, p2, l, l1);
       if (oj1.E != null) {
          this.c();
       }
       b.a(0, "acquiring mDispatchRunnablesLock").b("batchId", i).e();
       g = oj1.c;
       _monitor_enter(g);
       a.c(0, "acquiring mDispatchRunnablesLock");
       oj1.h.add(uoa);
       _monitor_exit(g);
       if (oj1.k == null) {
          UiThreadUtil.runOnUiThread(new j$b(oj1, oj1.f));
       }
       if (oj1.B != null && uAtomicBoole1.get()) {
          oj1.A.C().d();
       }
       a.c(0, "UIViewOperationQueue.dispatchViewUpdates");
       return;
    }
    public void e(boolean p0){
       this.F = p0;
    }
    public void f(n0 p0,int p1,String p2,z p3){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, j.class, "20")) {
          return;
       }
       j td = this.d;
       _monitor_enter(td);
       this.x = this.x + 1;
       j$e uoe = new j$e(this, p0, p1, p2, p3);
       this.i.addLast(v8);
       _monitor_exit(td);
       return;
    }
    public void g(int p0,int[] p1,a1[] p2,int[] p3,int[] p4){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, oj, "25")) {
             return;
          }
       }
       j$n on = new j$n(this, p0, p1, p2, p3, p4);
       this.g.add(v8);
       return;
    }
    public void h(int p0,Object p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oj, "17")) {
          return;
       }
       this.g.add(new j$a0(this, p0, p1));
       return;
    }
    public void i(int p0,int p1,int p2,int p3,int p4,int p5){
       j oj = this;
       j oj1 = j.class;
       if (PatchProxy.isSupport(oj1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, oj1, "24")) {
             return;
          }
       }
       j$y oy = new j$y(this, p0, p1, p2, p3, p4, p5);
       oj.g.add(v10);
       return;
    }
    public void j(int p0,String p1,z p2){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, j.class, "22")) {
          return;
       }
       this.y = this.y + 1;
       this.g.add(new j$z(this, p0, p2));
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, j.class, "47")) {
          return;
       }
       if (this.l != null) {
          a.x("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
          return;
       }else {
          j tc = this.c;
          _monitor_enter(tc);
          if (!this.h.isEmpty()) {
             j th = this.h;
             this.h = new ArrayList();
             _monitor_exit(tc);
             long l = SystemClock.uptimeMillis();
             if (e.r) {
                this.A.C().c(new y0(th));
             }else {
                Iterator iterator = th.iterator();
                while (iterator.hasNext()) {
                   iterator.next().run();
                }
             }
             if (this.m != null) {
                this.u = SystemClock.uptimeMillis() - l;
                this.v = this.n;
                this.m = false;
             }
             this.n = 0;
             return;
          }else {
             _monitor_exit(tc);
             return;
          }
       }
    }
    public final ArrayList l(ArrayList p0,ArrayDeque p1){
       Iterator iterator;
       HashSet hashSet;
       x obj1;
       HashSet hashSet1;
       HashMap obj = PatchProxy.applyTwoRefs(p0, p1, this, j.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.E == null || this.D == null) {
          return null;
       }
       obj = new HashMap();
       boolean b = true;
       if (p0 != null) {
          iterator = p0.iterator();
          while (iterator.hasNext()) {
             j$w ow = iterator.next();
             if (ow instanceof j$b0) {
                j$w ow1 = ow;
                x ox = this.D.i(ow1.a);
                if (ox != null && (!ox.isSyncRenderDataRelativeNode() || !this.r(ow, ox))) {
                   continue ;
                }else {
                   ow1.b = b;
                   boolean b1 = (ox.getSyncRenderDataTag() == ox.getReactTag())? true: false;
                   ow1.c = b1;
                   String str = String.valueOf(ox.getSyncRenderDataTag());
                   if (obj.get(str) != null) {
                      hashSet = obj.get(str);
                   }else if(this.C.get(str) == null){
                      this.C.put(str, new LinkedHashMap());
                   }
                   hashSet = new HashSet();
                   obj.put(str, hashSet);
                   this.b(ox.getSyncRenderDataTag(), hashSet);
                   obj1 = this.C.get(str);
                   Objects.requireNonNull(obj1);
                   if (!obj1.isEmpty()) {
                      this.a(ox, hashSet);
                   }
                }
             }
          }
       }
       if (p1 != null) {
          iterator = p1.iterator();
          while (iterator.hasNext()) {
             j$w ow2 = iterator.next();
             if (ow2 instanceof j$b0) {
                j$w ow3 = ow2;
                obj1 = this.D.i(ow3.a);
                if (obj1 != null && (!obj1.isSyncRenderDataRelativeNode() || !this.r(ow2, obj1))) {
                   continue ;
                }else {
                   ow3.b = b;
                   boolean b2 = (obj1.getSyncRenderDataTag() == obj1.getReactTag())? true: false;
                   ow3.c = b2;
                   String str1 = String.valueOf(obj1.getSyncRenderDataTag());
                   if (obj.get(str1) != null) {
                      hashSet1 = obj.get(str1);
                   }else if(this.C.get(str1) == null){
                      this.C.put(str1, new LinkedHashMap());
                   }
                   hashSet1 = new HashSet();
                   obj.put(str1, hashSet1);
                   this.b(obj1.getSyncRenderDataTag(), hashSet1);
                   str1 = this.C.get(str1);
                   Objects.requireNonNull(str1);
                   if (!str1.isEmpty()) {
                      this.a(obj1, hashSet1);
                   }
                }
             }
          }
       }
       iterator = new ArrayList();
       Iterator iterator1 = obj.keySet().iterator();
       while (iterator1.hasNext()) {
          String str2 = iterator1.next();
          obj1 = this.D.i(Integer.parseInt(str2));
          HashSet hashSet2 = obj.get(str2);
          if (hashSet2 == null || obj1 == null) {
             continue ;
          }else {
             LinkedHashMap linkedHashMa = this.C.get(String.valueOf(obj1.getReactTag()));
             if (linkedHashMa == null || (hashSet2.isEmpty() && linkedHashMa.size() == obj1.getChildCount())) {
             }else {
                JavaOnlyArray javaOnlyArra = new JavaOnlyArray();
                JavaOnlyArray javaOnlyArra1 = new JavaOnlyArray();
                Iterator iterator2 = hashSet2.iterator();
                while (iterator2.hasNext()) {
                   javaOnlyArra1.pushInt(iterator2.next().intValue());
                }
                javaOnlyArra.pushArray(javaOnlyArra1);
                javaOnlyArra.pushInt(obj1.getChildCount());
                if (!PatchProxy.applyVoidOneRefs(obj1, this, j.class, "39") && (obj1.getNodeWrapper() == null || obj1.getNodeWrapperRegistry() == null)) {
                   y oy = new y(obj1);
                   k0 ok0 = new k0();
                   ok0.a(oy);
                   this.w(obj1, oy, ok0);
                   obj1.setSnapShotShadowTree(oy, ok0);
                }
                obj1.setSnapShotShadowTree(false);
                j$l ol = new j$l(this, obj1.getReactTag(), javaOnlyArra, obj1.getNodeWrapper(), obj1.getNodeWrapperRegistry());
                iterator.add(iterator2);
             }
          }
       }
       return iterator;
    }
    public m m(){
       Object obj = PatchProxy.apply(null, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.r();
    }
    public boolean n(j$w p0){
       boolean b = false;
       if (!p0 instanceof j$b0) {
          return b;
       }
       if (p0.c == null) {
          return b;
       }
       if (p0 instanceof j$n || p0 instanceof j$s) {
          b = true;
       }
       return b;
    }
    public boolean o(j$w p0){
       boolean b = false;
       if (!p0 instanceof j$b0) {
          return b;
       }
       j$b0 uob0 = p0;
       if (uob0.c != null) {
          return b;
       }
       if (uob0.b != null && !p0 instanceof j$c) {
          b = true;
       }
       return b;
    }
    public boolean p(j$w p0){
       boolean b = (p0 instanceof j$h || p0 instanceof j$i)? true: false;
       return b;
    }
    public boolean q(){
       Object obj = PatchProxy.apply(null, this, j.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.g.isEmpty();
    }
    public final boolean r(j$w p0,x p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, j.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       p1 = this.D.i(p1.getSyncRenderDataTag());
       boolean b = (!p0 instanceof j$c && (!p0 instanceof j$z || (p1.hasSetSnapShotShadowTree() && !this.p(p0))))? true: false;
       return b;
    }
    public void s(j$w p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "7")) {
          return;
       }
       j tz = this.z;
       if (tz == null) {
          return;
       }
       Iterator iterator = tz.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0);
       }
       return;
    }
    public void t(long p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, oj, "8")) {
          return;
       }
       oj = this.z;
       if (oj == null) {
          return;
       }
       Iterator iterator = oj.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       return;
    }
    public void u(j$w p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "6")) {
          return;
       }
       j tz = this.z;
       if (tz == null) {
          return;
       }
       Iterator iterator = tz.iterator();
       while (iterator.hasNext()) {
          iterator.next().c(p0);
       }
       return;
    }
    public void v(f p0){
       this.b = p0;
    }
    public final void w(x p0,y p1,k0 p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, j.class, "40")) {
          return;
       }
       for (int i = 0; i < p0.getChildCount(); i = i + 1) {
          x childAt = p0.getChildAt(i);
          if (p0.getReactTag() == p0.getSyncRenderDataTag()) {
             childAt.setSyncRenderDataCellRootTag(childAt.getReactTag());
          }else {
             childAt.setSyncRenderDataCellRootTag(p0.getSyncRenderDataCellRootTag());
          }
          childAt.setSyncRenderDataTag(p0.getSyncRenderDataTag());
          y oy = new y(childAt);
          p2.a(oy);
          p1.a(oy, i);
          this.w(childAt, oy, p2);
       }
       return;
    }
}

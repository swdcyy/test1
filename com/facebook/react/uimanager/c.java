package com.facebook.react.uimanager.c;
import ze.f;
import com.facebook.react.uimanager.j;
import ze.m;
import java.lang.Object;
import android.util.SparseArray;
import com.facebook.react.uimanager.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.UiThreadUtil;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import cb.a;
import java.util.Objects;
import ze.e0;
import com.facebook.react.uimanager.RenderProfileQueue$a;
import com.facebook.react.uimanager.RenderProfileQueue;
import android.util.SparseIntArray;
import java.lang.Number;
import java.lang.StringBuilder;
import ze.z;
import java.lang.Boolean;
import com.facebook.react.uimanager.j$z;
import com.facebook.react.uimanager.j$w;
import java.lang.Throwable;
import com.facebook.react.uimanager.j$c;
import ze.n0;
import com.facebook.react.uimanager.j$e;
import com.facebook.react.bridge.ReadableArray;
import ze.a1;
import java.util.Arrays;
import com.facebook.react.uimanager.IllegalViewOperationException;
import hg.b$b;
import hg.b;
import com.facebook.react.uimanager.j$y;
import hg.a;
import com.facebook.react.uimanager.j$i;
import com.facebook.react.bridge.Callback;
import com.facebook.react.uimanager.j$u;
import com.facebook.react.bridge.ReadableMap;
import android.view.View;
import com.facebook.react.uimanager.j$h;
import com.facebook.react.uimanager.j$a0;
import java.lang.Long;
import yd.e;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.uimanager.j$v;
import com.facebook.react.uimanager.c$a;
import ze.q0;
import java.lang.Float;

public class c implements f	// class@00133c
{
    public final SparseArray a;
    public final SparseArray b;
    public final SparseArray c;
    public final j d;
    public final m e;
    public RenderProfileQueue f;
    public static final String g = "c";

    public void c(j p0,m p1){
       super();
       this.c = new SparseArray();
       this.f = null;
       this.a = new SparseArray();
       this.b = new SparseArray();
       this.d = p0;
       this.e = p1;
    }
    public synchronized void A(d p0){
       Object obj;
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "23")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       if (p0 == null) {
          return;
       }
       int i = p0.e() - 1;
       while (i >= 0) {
          if (PatchProxy.isSupport(uod)) {
             obj = PatchProxy.applyOneRefs(Integer.valueOf(i), p0, uod, "16");
             if (obj != PatchProxyResult.class) {
                if (obj == null) {
                   a.g(c.g, "Unable to drop null child view");
                }else if(this.a.get(obj.f()) != null){
                   this.A(obj);
                }
                i = i - 1;
             }
          }
          obj = p0.c.get(i);
          goto label_0032 ;
       }
       if (!PatchProxy.applyVoid(null, p0, uod, "15")) {
          int i1 = p0.c.size();
          i1 = i1 - 1;
          while (i1 >= 0) {
             p0.i(i1);
          }
       }
       this.c.remove(p0.f());
       this.a.remove(p0.f());
       p0.l = true;
       return;
    }
    public synchronized void B(){
       if (PatchProxy.applyVoid(null, this, c.class, "21")) {
          return;
       }
       int i = 0;
       while (i < this.b.size()) {
          d uod = this.b.valueAt(i);
          Objects.requireNonNull(uod);
          if (!PatchProxy.applyVoid(null, uod, d.class, "8")) {
             ArrayList uArrayList = new ArrayList();
             uod.b(uArrayList);
             if (!uArrayList.isEmpty()) {
                uod.p = true;
                uod.j.c(new e0(uod, uArrayList));
             }
          }
          uod.d();
          if (uod.h()) {
             this.b.delete(uod.f());
          }
          i = i + 1;
       }
       return;
    }
    public RenderProfileQueue C(){
       return this.f;
    }
    public int D(int p0,SparseIntArray p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoc, "12");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i1 = p0;
       for (int i = 0; i <= p0; i = i + 1) {
          i1 = i1 + p1.get(i);
       }
       return i1;
    }
    public synchronized final d E(int p0){
       d obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.a.get(p0);
       if (obj == null) {
          a.g(c.g, this+" Trying to resolve view with tag "+p0+" which doesn\'t exist");
       }
       return obj;
    }
    public synchronized void F(int p0,z p1,boolean p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), this, c.class, "6")) {
          return;
       }
       try{
          UiThreadUtil.assertOnUiThread();
          d uod = this.E(p0);
          if (uod == null) {
             return;
          }else if(p1 != null){
             c td = this.d;
             Objects.requireNonNull(td);
             uod.c(new j$z(td, p0, p1));
          }
       }catch(com.facebook.react.uimanager.IllegalViewOperationException e9){
          a.h(c.g, "Unable to update properties for view tag "+p0, e9);
       }
       return;
    }
    public void a(int p0,int p1,boolean p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, c.class, "32")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       d uod = this.a.get(p0);
       if (uod == null) {
          a.g(c.g, "No native view for "+p0+" currently exists");
          return;
       }else {
          c td = this.d;
          Objects.requireNonNull(td);
          j$c uoc = new j$c(td, p0, p1, false, p2);
          uod.c(v7);
          return;
       }
    }
    public synchronized void b(int p0,int p1,int p2){
       int i;
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, c.class, "11")) {
          return;
       }
       d uod = this.a.get(p0);
       d uod1 = this.a.get(p1);
       if (uod == null || uod1 == null) {
          return;
       }
       d uod2 = uod.g();
       if (uod2 == null) {
          return;
       }
       Object obj = PatchProxy.applyOneRefs(uod, uod2, d.class, "13");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          i = 0;
          while (true) {
             if (i < uod2.c.size()) {
                if (uod2.c.get(i).f() != uod.f()) {
                   i = i + 1;
                }
             }else {
                i = -1;
                break ;
             }
          }
       }
       uod2.i(i);
       uod1.a(uod, p2);
       return;
    }
    public synchronized void c(n0 p0,int p1,String p2,z p3){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, c.class, "10")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       d uod = new d(this, p1, p2);
       this.a.put(p1, uod);
       c td = this.d;
       Objects.requireNonNull(td);
       j$e uoe = new j$e(td, p0, p1, p2, p3);
       uod.c(v1);
       return;
    }
    public synchronized void d(int p0,ReadableArray p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "18")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       d uod = this.a.get(p0);
       if (uod == null) {
          return;
       }
       int i = 0;
       while (i < p1.size()) {
          d uod1 = this.a.get(p1.getInt(i));
          if (uod1 == null) {
             a.g(c.g, "Trying to add unknown view tag: "+p1.getInt(i));
          }else {
             uod.a(uod1, i);
          }
          i = i + 1;
       }
       return;
    }
    public synchronized void e(int p0,int[] p1,a1[] p2,int[] p3,int[] p4){
       SparseIntArray sparseIntArr;
       c uoc = c.class;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoc, "14")) {
             return;
          }
       }
       UiThreadUtil.assertOnUiThread();
       String g = c.g;
       StringBuilder str = this.e+" Render managerChildren "+p0+":"+Arrays.toString(p1)+":";
       String str1 = (p2 != null)? p2[i1].toString(): "null";
       a.g(g, str+str1+":"+Arrays.toString(p3)+":"+Arrays.toString(p4));
       if (PatchProxy.isSupport(uoc)) {
          sparseIntArr = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "13");
          if (sparseIntArr != PatchProxyResult.class) {
          }else {
          label_0095 :
             sparseIntArr = this.c.get(p0);
             if (sparseIntArr == null) {
                sparseIntArr = new SparseIntArray();
                this.c.put(p0, sparseIntArr);
             }
          }
       }else {
          goto label_0095 ;
       }
       d uod = this.a.get(p0);
       if (uod == null) {
          a.g(g, "Trying to manageChildren view with tag "+p0+" which doesn\'t exist\n detail: ");
          return;
       }else {
          int i2 = uod.e();
          if (p1 != null) {
             int i3 = p1.length - i;
             while (true) {
                if (i3 >= 0) {
                   i = p1[i3];
                   if (i >= 0) {
                      if (i >= uod.e()) {
                         if (this.b.get(p0) != null && !uod.e()) {
                            return;
                         }else {
                            throw new IllegalViewOperationException("Trying to remove a view index above child count "+i+" view tag: "+p0+"\n detail: ");
                         }
                      }else if(i < i2){
                         uod.i(this.D(i, sparseIntArr));
                         i3 = i3 - 1;
                         i2 = i;
                      }else {
                         throw new IllegalViewOperationException("Trying to remove an out of order view index:"+i+" view tag: "+p0+"\n detail: ");
                      }
                   }else {
                      throw new IllegalViewOperationException("Trying to remove a negative view index:"+i+" view tag: "+p0+"\n detail: ");
                   }
                }
             }
          }
          if (p3 != null) {
             p0 = 0;
             while (p0 < p3.length) {
                int i4 = p3[p0];
                d uod1 = this.a.get(i4);
                if (uod1 == null) {
                   a.g(c.g, "Trying to destroy unknown view tag: "+i4+"\n detail: ");
                }else {
                   this.A(uod1);
                }
                p0++;
             }
          }
          if (p2 != null) {
             while (i1 < p2.length) {
                object oobject = p2[i1];
                d uod2 = this.a.get(oobject.a);
                if (uod2 == null) {
                   a.g(c.g, "Trying to add unknown view tag: "+oobject.a+"\n detail: ");
                }else {
                   oobject = this.D(oobject.b, sparseIntArr);
                   d uod3 = d.class;
                   if (!PatchProxy.isSupport(uod3) || !PatchProxy.applyVoidTwoRefs(uod2, Integer.valueOf(oobject), uod, uod3, "19")) {
                      uod.a(uod2, oobject);
                   }
                }
                i1 = i1 + 1;
             }
          }
          return;
       }
    }
    public void f(int p0,int p1,int p2,int p3,int p4,int p5){
       c uoc = this;
       int i = p1;
       c uoc1 = c.class;
       int i1 = 6;
       int i2 = 5;
       int i3 = 4;
       int i4 = 3;
       int i5 = 2;
       int i6 = 1;
       int i7 = 0;
       if (PatchProxy.isSupport(uoc1)) {
          Object[] objArray = new Object[i1];
          objArray[i7] = Integer.valueOf(p0);
          objArray[i6] = Integer.valueOf(p1);
          objArray[i5] = Integer.valueOf(p2);
          objArray[i4] = Integer.valueOf(p3);
          objArray[i3] = Integer.valueOf(p4);
          objArray[i2] = Integer.valueOf(p5);
          if (PatchProxy.applyVoid(objArray, this, uoc1, "3")) {
             return;
          }
       }
       boolean b = uoc.e.g(i);
       _monitor_enter(this);
       if (PatchProxy.isSupport(uoc1)) {
          Object[] objArray1 = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),Boolean.valueOf(b)};
          if (PatchProxy.applyVoid(objArray1, this, uoc1, "8")) {
             _monitor_exit(this);
          label_00c6 :
             return;
          }
       }
       UiThreadUtil.assertOnUiThread();
       b.a(0, "NativeViewHierarchyManager_updateLayout").b("parentTag", p0).b("tag", i).e();
       d uod = this.E(i);
       uod.j(b);
       c d = uoc.d;
       Objects.requireNonNull(d);
       j$y oy = new j$y(d, p0, p1, p2, p3, p4, p5);
       uod.c(v13);
       a.c(0, "NativeViewHierarchyManager_updateLayout");
       _monitor_exit(this);
       goto label_00c6 ;
    }
    public boolean g(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.e.g(p0);
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, c.class, "33")) {
          return;
       }
       this.e.h();
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, c.class, "30")) {
          return;
       }
       this.e.i();
       return;
    }
    public synchronized void j(int p0,String p1,String p2,ReadableArray p3){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, c.class, "34")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       d uod = this.a.get(p0);
       if (uod == null) {
          a.g(c.g, "No native view for "+p0+" currently exists");
          return;
       }else {
          c td = this.d;
          Objects.requireNonNull(td);
          j$i oi = new j$i(td, p0, p1, p2, p3);
          uod.c(v7);
          return;
       }
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, c.class, "36")) {
          return;
       }
       this.e.k();
       return;
    }
    public synchronized void l(int p0,ReadableArray p1,Callback p2,Callback p3){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, c.class, "35")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       d uod = this.a.get(p0);
       if (uod == null) {
          a.g(c.g, "No native view for "+p0+" currently exists");
          return;
       }else {
          c td = this.d;
          Objects.requireNonNull(td);
          j$u ou = new j$u(td, p0, p1, p3, p2);
          uod.c(v7);
          return;
       }
    }
    public synchronized void m(int p0,z p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "5")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       this.F(p0, p1, false);
       return;
    }
    public void n(ReadableMap p0,Callback p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "29")) {
          return;
       }
       this.e.n(p0, p1);
       return;
    }
    public void o(int p0,int[] p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "16")) {
          return;
       }
       this.e.o(p0, p1);
       return;
    }
    public View p(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "31");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.e.p(p0);
    }
    public synchronized void q(int p0,int p1,String p2,ReadableArray p3){
       UiThreadUtil.assertOnUiThread();
       d uod = this.a.get(p0);
       if (uod == null) {
          a.g(c.g, "No native view for "+p0+" currently exists");
          return;
       }else {
          c td = this.d;
          Objects.requireNonNull(td);
          j$h oh = new j$h(td, p0, p1, p2, p3);
          uod.c(v7);
          return;
       }
    }
    public m r(){
       return this.e;
    }
    public synchronized void s(int p0,Object p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "7")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       c td = this.d;
       Objects.requireNonNull(td);
       this.E(p0).c(new j$a0(td, p0, p1));
       return;
    }
    public void sendAccessibilityEvent(int p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoc, "24")) {
          return;
       }
       this.e.sendAccessibilityEvent(p0, p1);
       return;
    }
    public void t(boolean p0){
    }
    public void u(int p0,int[] p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "17")) {
          return;
       }
       this.e.u(p0, p1);
       return;
    }
    public void v(int p0,View p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "19")) {
          return;
       }
       if (this.f == null) {
          this.f = new RenderProfileQueue(this);
       }
       this.e.v(p0, p1);
       d uod = new d(this, p0, "root");
       uod.k((long)p0);
       uod.h = true;
       _monitor_enter(this);
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), uod, this, uoc, "20")) {
          _monitor_exit(this);
       }else {
          this.z(p0, uod);
          _monitor_exit(this);
       }
       return;
    }
    public synchronized void w(int p0,long p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), this, uoc, "2")) {
          return;
       }
       try{
          UiThreadUtil.assertOnUiThread();
          d uod = this.E(p0);
          if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(uod, Long.valueOf(p1), this, uoc, "9")) {
             UiThreadUtil.assertOnUiThread();
             uod.k(p1);
          }
       }catch(com.facebook.react.uimanager.IllegalViewOperationException e6){
          a.h(c.g, "Unable to update properties for view tag "+p0, e6);
       }
       return;
    }
    public synchronized void x(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "25")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       a.x("ReactNativeDestroy", "NativeViewHierarchyManager::removeRootView "+p0+":"+this.b.get(p0));
       if (this.b.get(p0) == null) {
          if (e.y) {
             return;
          }else {
             SoftAssertions.assertUnreachable("View with tag "+p0+" is not registered as a root view");
          }
       }
       d uod = this.a.get(p0);
       this.A(uod);
       c td = this.d;
       Objects.requireNonNull(td);
       uod.c(new j$v(td, new c$a(this, p0)));
       a.x("ReactNativeDestroy", "NativeViewHierarchyManager::after removeRootView "+p0+":"+this.a);
       return;
    }
    public int y(int p0,float p1,float p2){
       if (PatchProxy.isSupport(c.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, c.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.e.y(p0, p1, p2);
    }
    public synchronized final void z(int p0,d p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "22")) {
          return;
       }
       this.a.put(p0, p1);
       this.b.put(p0, p1);
       p1.g = p0;
       return;
    }
}

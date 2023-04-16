package com.facebook.imagepipeline.memory.BasePool;
import eb.e;
import eb.c;
import ed.w;
import ed.x;
import java.lang.Object;
import java.lang.Class;
import ab.e;
import android.util.SparseArray;
import android.util.SparseIntArray;
import ed.f;
import java.util.Set;
import ab.g;
import com.facebook.imagepipeline.memory.BasePool$a;
import cb.a;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.ArrayList;
import java.lang.Math;
import java.lang.System;
import java.lang.Throwable;
import com.facebook.common.internal.e;
import com.facebook.imagepipeline.memory.BasePool$PoolSizeViolationException;
import com.facebook.common.memory.MemoryTrimType;
import eb.b;

public abstract class BasePool implements e	// class@000483
{
    public final Class a;
    public final c b;
    public final w c;
    public final SparseArray d;
    public final Set e;
    public boolean f;
    public final BasePool$a g;
    public final BasePool$a h;
    public final x i;
    public boolean j;

    public void BasePool(c p0,w p1,x p2){
       super();
       this.a = this.getClass();
       e.d(p0);
       this.b = p0;
       e.d(p1);
       this.c = p1;
       e.d(p2);
       this.i = p2;
       SparseArray sparseArray = new SparseArray();
       this.d = sparseArray;
       if (p1.g != null) {
          _monitor_enter(this);
          p1 = p1.c;
          if (p1 != null) {
             sparseArray.clear();
             for (int i = 0; i < p1.size(); i++) {
                int i1 = p1.keyAt(i);
                this.d.put(i1, new f(this.v(i1), p1.valueAt(i), 0, this.c.g));
             }
             this.f = false;
          }else {
             this.f = true;
          }
          _monitor_exit(this);
       }else {
          this.A(new SparseIntArray(0));
       }
       this.e = g.a();
       this.h = new BasePool$a();
       this.g = new BasePool$a();
       return;
    }
    public synchronized final void A(SparseIntArray p0){
       e.d(p0);
       this.d.clear();
       w c = this.c.c;
       if (c != null) {
          for (int i = 0; i < c.size(); i = i + 1) {
             int i1 = c.keyAt(i);
             this.d.put(i1, new f(this.v(i1), c.valueAt(i), p0.get(i1, 0), this.c.g));
          }
          this.f = false;
       }else {
          this.f = true;
       }
       return;
    }
    public final void B(){
       if (a.l(2)) {
          a.q(this.a, "Used = \(%d, %d\); Free = \(%d, %d\)", Integer.valueOf(this.g.a), Integer.valueOf(this.g.b), Integer.valueOf(this.h.a), Integer.valueOf(this.h.b));
       }
       return;
    }
    public f C(int p0){
       return new f(this.v(p0), Integer.MAX_VALUE, 0, this.c.g);
    }
    public final List D(){
       ArrayList uArrayList = new ArrayList(this.d.size());
       int i = this.d.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          f uof = this.d.valueAt(i1);
          f a = uof.a;
          f b = uof.b;
          int i2 = uof.d();
          if (uof.c() > 0) {
             uArrayList.add(uof);
          }
          this.d.setValueAt(i1, new f(this.v(a), b, i2, this.c.g));
       }
       return uArrayList;
    }
    public synchronized void E(int p0){
       BasePool$a b = this.h.b;
       int i = Math.min(((this.g.b + b) - p0), b);
       if (i <= 0) {
          return;
       }
       int i1 = 2;
       if (a.l(i1)) {
          a.p(this.a, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(p0), Integer.valueOf((this.g.b + this.h.b)), Integer.valueOf(i));
       }
       this.B();
       BasePool uBasePool = null;
       while (uBasePool < this.d.size() && i > 0) {
          f uof = this.d.valueAt(uBasePool);
          while (i > 0) {
             f obj = uof.e();
             if (obj == null) {
                break ;
             }
             this.r(obj);
             obj = uof.a;
             i = i - obj;
             this.h.a(obj);
          }
          uBasePool = uBasePool + 1;
       }
       this.B();
       if (a.l(i1)) {
          a.o(this.a, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(p0), Integer.valueOf((this.g.b + this.h.b)));
       }
       return;
    }
    public void a(Object p0){
       e.d(p0);
       int i = this.u(p0);
       int i1 = this.v(i);
       _monitor_enter(this);
       _monitor_enter(this);
       f uof = this.d.get(i);
       _monitor_exit(this);
       int i2 = 1;
       int i3 = 2;
       if (!this.e.remove(p0)) {
          Object[] objArray = new Object[i3];
          objArray[0] = Integer.valueOf(System.identityHashCode(p0));
          objArray[i2] = Integer.valueOf(i);
          a.e(this.a, "release \(free, value unrecognized\) \(object, size\) = \(%x, %s\)", objArray);
          this.r(p0);
          this.i.d(i1);
       }else if(uof != null){
          if ((uof.e + uof.c()) <= uof.b) {
             i2 = 0;
          }
          if (i2 || (!this.y() && this.z(p0))) {
             uof.f(p0);
             this.h.b(i1);
             this.g.a(i1);
             this.i.e(i1);
             if (a.l(i3)) {
                a.o(this.a, "release \(reuse\) \(object, size\) = \(%x, %s\)", Integer.valueOf(System.identityHashCode(p0)), Integer.valueOf(i));
             }
          }
       }
    label_008e :
       if (uof != null) {
          uof.b();
       }
       if (a.l(i3)) {
          a.o(this.a, "release \(free\) \(object, size\) = \(%x, %s\)", Integer.valueOf(System.identityHashCode(p0)), Integer.valueOf(i));
       }
       this.r(p0);
       this.g.a(i1);
       this.i.d(i1);
       this.B();
       _monitor_exit(this);
       return;
    }
    public abstract Object d(int p0);
    public Object get(int p0){
       _monitor_enter(this);
       BasePool uBasePool = 1;
       int b = (!this.y() || this.h.b == null)? true: false;
       e.f(b);
       _monitor_exit(this);
       p0 = this.t(p0);
       _monitor_enter(this);
       f uof = this.s(p0);
       int i = 2;
       if (uof != null) {
          Object obj = this.w(uof);
          if (obj != null) {
             e.f(this.e.add(obj));
             p0 = this.u(obj);
             b = this.v(p0);
             this.g.b(b);
             this.h.a(b);
             this.i.b(b);
             this.B();
             if (a.l(i)) {
                a.o(this.a, "get \(reuse\) \(object, size\) = \(%x, %s\)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(p0));
             }
             _monitor_exit(this);
             return obj;
          }
       }
       int i1 = this.v(p0);
       if (this.q(i1)) {
          this.g.b(i1);
          if (uof != null) {
             uof.e = uof.e + uBasePool;
          }
          _monitor_exit(this);
          Object obj1 = this.d(p0);
          _monitor_enter(this);
          e.f(this.e.add(obj1));
          _monitor_enter(this);
          if (this.y()) {
             this.E(this.c.b);
          }
          _monitor_exit(this);
          this.i.a(i1);
          this.B();
          if (a.l(i)) {
             a.o(this.a, "get \(alloc\) \(object, size\) = \(%x, %s\)", Integer.valueOf(System.identityHashCode(obj1)), Integer.valueOf(p0));
          }
          _monitor_exit(this);
          return obj1;
       }else {
          throw new BasePool$PoolSizeViolationException(this.c.a, this.g.b, this.h.b, i1);
       }
    }
    public void o(MemoryTrimType p0){
       List list;
       _monitor_enter(this);
       int i = 0;
       if (this.c.g != null) {
          list = this.D();
       }else {
          list = new ArrayList(this.d.size());
          SparseIntArray sparseIntArr = new SparseIntArray();
          for (int i1 = 0; i1 < this.d.size(); i1 = i1 + 1) {
             f uof1 = this.d.valueAt(i1);
             if (uof1.c() > 0) {
                list.add(uof1);
             }
             sparseIntArr.put(this.d.keyAt(i1), uof1.d());
          }
          this.A(sparseIntArr);
       }
       BasePool th = this.h;
       th.a = i;
       th.b = i;
       this.B();
       _monitor_exit(this);
       while (i < list.size()) {
          f uof = list.get(i);
          Object obj = uof.e();
          while (obj != null) {
             this.r(obj);
          }
          i = i + 1;
       }
       return;
    }
    public synchronized boolean q(int p0){
       if (this.j != null) {
          return true;
       }
       BasePool tc = this.c;
       w a = tc.a;
       BasePool$a b = this.g.b;
       if (p0 > (a - b)) {
          this.i.f();
          return false;
       }else {
          w b1 = tc.b;
          if (p0 > (b1 - (b + this.h.b))) {
             this.E((b1 - p0));
          }
          if (p0 > (a - (this.g.b + this.h.b))) {
             this.i.f();
             return false;
          }else {
             return true;
          }
       }
    }
    public abstract void r(Object p0);
    public synchronized f s(int p0){
       f uof = this.d.get(p0);
       if (uof != null || this.f == null) {
          return uof;
       }
       if (a.l(2)) {
          a.n(this.a, "creating new bucket %s", Integer.valueOf(p0));
       }
       uof = this.C(p0);
       this.d.put(p0, uof);
       return uof;
    }
    public abstract int t(int p0);
    public abstract int u(Object p0);
    public abstract int v(int p0);
    public synchronized Object w(f p0){
       Object obj = p0.e();
       if (obj != null) {
          p0.e = p0.e + 1;
       }
       return obj;
    }
    public void x(){
       this.b.b(this);
       this.i.g(this);
    }
    public synchronized boolean y(){
       boolean b = ((this.g.b + this.h.b) > this.c.b)? true: false;
       if (b) {
          this.i.c();
       }
       return b;
    }
    public boolean z(Object p0){
       e.d(p0);
       return true;
    }
}

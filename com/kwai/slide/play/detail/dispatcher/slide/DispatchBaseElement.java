package com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import ih5.c0;
import fh5.a;
import qp7.b;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement$a;
import nsd.u;
import rp7.a;
import jh5.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import pp7.a;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement$dispatchHelper$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.robust.PatchProxyResult;
import ih5.o;
import eh5.q;
import ih5.y;
import java.lang.StringBuilder;
import ih5.d0;
import ih5.w;
import ih5.u;
import ih5.b;
import android.util.SparseLongArray;
import com.kwai.component.taskdispatcher.slide.strategy.SlideTaskDispatcher;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement$i;
import eh5.v;
import eh5.q$a;
import java.lang.Runnable;
import eh5.l;
import com.yxcorp.utility.Log;
import java.lang.Integer;
import ih5.c0$a;
import java.lang.Long;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement$j;
import java.util.List;
import crd.a;
import xf6.d;
import xf6.l;
import rq7.a;
import ih5.d;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement$b;
import java.util.Iterator;
import qp7.b1;
import ih5.f;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement$c;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement$d;
import java.util.Collection;
import ih5.m;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement$e;
import qp7.a;
import ih5.k;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement$f;
import qp7.x0;
import ih5.r;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement$g;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement$h;

public abstract class DispatchBaseElement extends b implements c0, a	// class@0017b7
{
    public final p q;
    public final a r;
    public static final DispatchBaseElement$a s;

    static {
       DispatchBaseElement.s = new DispatchBaseElement$a(null);
    }
    public void DispatchBaseElement(a p0,a p1){
       a.p(p0, "bizType");
       super(p0);
       this.r = p1;
       p0 = new a(p1, false, Boolean.FALSE);
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "11")) {
       }else {
          a.p(p0, "<set-?>");
          this.l = p0;
       }
       this.q = s.c(new DispatchBaseElement$dispatchHelper$2(this));
       return;
    }
    public boolean G(){
       boolean b;
       DispatchBaseElement obj = PatchProxy.apply(null, this, DispatchBaseElement.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.e0()) {
          obj = this.r;
          if (obj != null && obj.d()) {
             b = true;
          label_0027 :
             return b;
          }
       }
       b = false;
       goto label_0027 ;
    }
    public final void O(){
    }
    public final void Q(){
       long l;
       if (PatchProxy.applyVoid(null, this, DispatchBaseElement.class, "2")) {
          return;
       }
       o a = o.a;
       if (this.G()) {
          q$a m = q.m;
          y oy = this.h0();
          a.m(oy);
          String str = this.getClass().getCanonicalName()+' '+a.getClass().getSimpleName();
          if (oy.c().b() && (!a.g(a, d0.a) && (!a.g(a, w.a) && (a.g(a, u.a) || a.g(a, b.a))))) {
             l = -1;
          }else {
             SparseLongArray sparseLongAr = oy.i(oy.c().a());
             a uoa = oy.c();
             SlideTaskDispatcher slideTaskDis = uoa.c();
             long l1 = uoa.a();
             long l2 = slideTaskDis.e(q$a.c(m, a, new DispatchBaseElement$i(a, sparseLongAr, str, this), l1, str, false, 16, null));
             if (m.d(l2)) {
                if (m.d(sparseLongAr.get(a.getStage()))) {
                   Log.n("SingleDispatchTaskController", "有相同阶段的task残留->stage:"+a.getStage()+", taskName:"+str);
                   oy.a(sparseLongAr, a, true, true);
                }
                sparseLongAr.append(a.getStage(), l2);
             }
             l = l2;
          }
          if (m.d(l)) {
          label_00e6 :
             return;
          }
       }
       this.k0(false);
       goto label_00e6 ;
    }
    public final void R(){
    }
    public final void T(){
    }
    public boolean b(int p0,int p1,boolean p2){
       if (PatchProxy.isSupport(DispatchBaseElement.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, DispatchBaseElement.class, "22");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return c0$a.b(this, p0, p1, p2);
    }
    public void d(long p0,l p1,boolean p2){
       if (PatchProxy.isSupport(DispatchBaseElement.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, Boolean.valueOf(p2), this, DispatchBaseElement.class, "18")) {
          return;
       }
       a.p(p1, "type");
       y oy = this.h0();
       if (oy != null) {
          oy.d(p0, p1, p2);
       }
       return;
    }
    public final void d0(){
       long l;
       if (PatchProxy.applyVoid(null, this, DispatchBaseElement.class, "4")) {
          return;
       }
       d0 a = d0.a;
       if (this.G()) {
          q$a m = q.m;
          y oy = this.h0();
          a.m(oy);
          String str = this.getClass().getCanonicalName()+' '+a.getClass().getSimpleName();
          if (oy.c().b() && (!a.g(a, a) && (!a.g(a, w.a) && (a.g(a, u.a) || a.g(a, b.a))))) {
             l = -1;
          }else {
             SparseLongArray sparseLongAr = oy.i(oy.c().a());
             a uoa = oy.c();
             SlideTaskDispatcher slideTaskDis = uoa.c();
             long l1 = uoa.a();
             long l2 = slideTaskDis.e(q$a.c(m, a, new DispatchBaseElement$j(a, sparseLongAr, str, this), l1, str, false, 16, null));
             if (m.d(l2)) {
                if (m.d(sparseLongAr.get(a.getStage()))) {
                   Log.n("SingleDispatchTaskController", "有相同阶段的task残留->stage:"+a.getStage()+", taskName:"+str);
                   oy.a(sparseLongAr, a, true, true);
                }
                sparseLongAr.append(a.getStage(), l2);
             }
             l = l2;
          }
          if (!m.d(l)) {
          label_00e0 :
             if (!this.g0() || this.L()) {
                this.X(false);
                this.m0(false);
                this.F().clear();
                this.w().dispose();
                this.V(new a());
             }
          }
       }else {
          goto label_00e0 ;
       }
       return;
    }
    public boolean e0(){
       DispatchBaseElement obj = PatchProxy.apply(null, this, DispatchBaseElement.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!l.c("KEY_DISABLE_ElEMENT_ASYNC_OPT", b)) {
          obj = this.r;
          boolean b1 = (obj != null)? obj.f(): false;
          if (!b1) {
             b = true;
          }
       }
       return b;
    }
    public void f(long p0){
       DispatchBaseElement uDispatchBas = DispatchBaseElement.class;
       if (PatchProxy.isSupport(uDispatchBas) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uDispatchBas, "20")) {
          return;
       }
       y oy = this.h0();
       if (oy != null) {
          oy.f(p0);
       }
       return;
    }
    public abstract a f0(a p0);
    public void g(long p0,l p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(DispatchBaseElement.class) && PatchProxy.applyVoidFourRefs(Long.valueOf(p0), p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, DispatchBaseElement.class, "19")) {
          return;
       }
       a.p(p1, "type");
       y oy = this.h0();
       if (oy != null) {
          oy.g(p0, p1, p2, p3);
       }
       return;
    }
    public final boolean g0(){
       DispatchBaseElement obj = PatchProxy.apply(null, this, DispatchBaseElement.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.r;
       if (obj != null && (obj.d() && obj.b())) {
          return true;
       }
       return false;
    }
    public void h(long p0,l p1,boolean p2){
       if (PatchProxy.isSupport(DispatchBaseElement.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, Boolean.valueOf(p2), this, DispatchBaseElement.class, "21")) {
          return;
       }
       a.p(p1, "type");
       c0$a.a(this, p0, p1, p2);
       return;
    }
    public final y h0(){
       Object obj = PatchProxy.apply(null, this, DispatchBaseElement.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.q.getValue();
    }
    public final a i0(){
       return this.r;
    }
    public void j0(boolean p0){
    }
    public final void k(){
       long l;
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, DispatchBaseElement.class, "8")) {
          return;
       }
       d a = d.a;
       if (this.G()) {
          q$a m = q.m;
          y oy = this.h0();
          a.m(oy);
          String str = this.getClass().getCanonicalName()+' '+a.getClass().getSimpleName();
          if (oy.c().b() && (!a.g(a, d0.a) && (!a.g(a, w.a) && (a.g(a, u.a) || a.g(a, b.a))))) {
             l = -1;
          }else {
             SparseLongArray sparseLongAr = oy.i(oy.c().a());
             a uoa = oy.c();
             SlideTaskDispatcher slideTaskDis = uoa.c();
             long l1 = uoa.a();
             SlideTaskDispatcher slideTaskDis1 = slideTaskDis;
             long l2 = slideTaskDis1.e(q$a.c(m, a, new DispatchBaseElement$b(a, sparseLongAr, str, obj), l1, str, false, 16, 0));
             if (m.d(l2)) {
                if (m.d(sparseLongAr.get(a.getStage()))) {
                   Log.n("SingleDispatchTaskController", "有相同阶段的task残留->stage:"+a.getStage()+", taskName:"+str);
                   oy.a(sparseLongAr, a, true, true);
                }
                sparseLongAr.append(a.getStage(), l2);
             }
             l = l2;
          }
          if (m.d(l)) {
          }
       }
       obj.U(true);
       Iterator iterator = this.F().iterator();
       while (iterator.hasNext()) {
          iterator.next().c(false);
       }
       return;
    }
    public void k0(boolean p0){
    }
    public final void l(){
       long l;
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, DispatchBaseElement.class, "6")) {
          return;
       }
       f a = f.a;
       if (this.G()) {
          q$a m = q.m;
          y oy = this.h0();
          a.m(oy);
          String str = this.getClass().getCanonicalName()+' '+a.getClass().getSimpleName();
          if (oy.c().b() && (!a.g(a, d0.a) && (!a.g(a, w.a) && (a.g(a, u.a) || a.g(a, b.a))))) {
             l = -1;
          }else {
             SparseLongArray sparseLongAr = oy.i(oy.c().a());
             a uoa = oy.c();
             SlideTaskDispatcher slideTaskDis = uoa.c();
             long l1 = uoa.a();
             SlideTaskDispatcher slideTaskDis1 = slideTaskDis;
             long l2 = slideTaskDis1.e(q$a.c(m, a, new DispatchBaseElement$c(a, sparseLongAr, str, obj), l1, str, false, 16, 0));
             if (m.d(l2)) {
                if (m.d(sparseLongAr.get(a.getStage()))) {
                   Log.n("SingleDispatchTaskController", "有相同阶段的task残留->stage:"+a.getStage()+", taskName:"+str);
                   oy.a(sparseLongAr, a, true, true);
                }
                sparseLongAr.append(a.getStage(), l2);
             }
             l = l2;
          }
          if (m.d(l)) {
          }
       }
       obj.W(true);
       Iterator iterator = this.F().iterator();
       while (iterator.hasNext()) {
          iterator.next().f(false);
       }
       return;
    }
    public void l0(boolean p0){
    }
    public final void m(){
       long l;
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, DispatchBaseElement.class, "7")) {
          return;
       }
       w a = w.a;
       if (this.G()) {
          q$a m = q.m;
          y oy = this.h0();
          a.m(oy);
          String str = this.getClass().getCanonicalName()+' '+a.getClass().getSimpleName();
          if (oy.c().b() && (!a.g(a, d0.a) && (!a.g(a, a) && (a.g(a, u.a) || a.g(a, b.a))))) {
             l = -1;
          }else {
             SparseLongArray sparseLongAr = oy.i(oy.c().a());
             a uoa = oy.c();
             SlideTaskDispatcher slideTaskDis = uoa.c();
             long l1 = uoa.a();
             SlideTaskDispatcher slideTaskDis1 = slideTaskDis;
             long l2 = slideTaskDis1.e(q$a.c(m, a, new DispatchBaseElement$d(a, sparseLongAr, str, obj), l1, str, false, 16, 0));
             if (m.d(l2)) {
                if (m.d(sparseLongAr.get(a.getStage()))) {
                   Log.n("SingleDispatchTaskController", "有相同阶段的task残留->stage:"+a.getStage()+", taskName:"+str);
                   oy.a(sparseLongAr, a, true, true);
                }
                sparseLongAr.append(a.getStage(), l2);
             }
             l = l2;
          }
          if (!m.d(l)) {
          label_00e7 :
             if (this.g0() && !this.K()) {
                if (this.F().isEmpty() ^ 1) {
                   Log.b("DispatchBaseElement", this.getClass().getSimpleName()+" discard becomesDetached");
                }
             }else {
                obj.W(false);
                Iterator iterator = this.F().iterator();
                while (iterator.hasNext()) {
                   iterator.next().e(false);
                }
             }
          }
       }else {
          goto label_00e7 ;
       }
       return;
    }
    public void m0(boolean p0){
    }
    public final void n(){
       q$a m;
       long l;
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, DispatchBaseElement.class, "3")) {
          return;
       }
       m a = m.a;
       if (this.G()) {
          m = q.m;
          y oy = this.h0();
          a.m(oy);
          String str = this.getClass().getCanonicalName()+' '+a.getClass().getSimpleName();
          if (oy.c().b() && (!a.g(a, d0.a) && (!a.g(a, w.a) && (a.g(a, u.a) || a.g(a, b.a))))) {
             l = -1;
          }else {
             SparseLongArray sparseLongAr = oy.i(oy.c().a());
             a uoa = oy.c();
             SlideTaskDispatcher slideTaskDis = uoa.c();
             long l1 = uoa.a();
             SlideTaskDispatcher slideTaskDis1 = slideTaskDis;
             long l2 = slideTaskDis1.e(q$a.c(m, a, new DispatchBaseElement$e(a, sparseLongAr, str, obj), l1, str, false, 16, 0));
             if (m.d(l2)) {
                if (m.d(sparseLongAr.get(a.getStage()))) {
                   Log.n("SingleDispatchTaskController", "有相同阶段的task残留->stage:"+a.getStage()+", taskName:"+str);
                   oy.a(sparseLongAr, a, true, true);
                }
                sparseLongAr.append(a.getStage(), l2);
             }
             l = l2;
          }
          if (m.d(l)) {
          label_00f1 :
             return;
          }
       }
       obj.X(true);
       obj.j0(false);
       goto label_00f1 ;
    }
    public final void o(a p0){
       k a;
       long l;
       q$a uoa;
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, DispatchBaseElement.class, "10")) {
          return;
       }
       a.p(obj, "callerContext");
       a = k.a;
       if (this.G()) {
          q$a m = q.m;
          y oy = this.h0();
          a.m(oy);
          String str = this.getClass().getCanonicalName()+' '+a.getClass().getSimpleName();
          if (oy.c().b() && (!a.g(a, d0.a) && (!a.g(a, w.a) && (a.g(a, u.a) || a.g(a, b.a))))) {
             l = -1;
             uoa = m;
          }else {
             SparseLongArray sparseLongAr = oy.i(oy.c().a());
             a uoa1 = oy.c();
             SlideTaskDispatcher slideTaskDis = uoa1.c();
             DispatchBaseElement$f uof = new DispatchBaseElement$f(a, sparseLongAr, str, this, p0);
             long l1 = uoa1.a();
             SlideTaskDispatcher slideTaskDis1 = slideTaskDis;
             DispatchBaseElement$f uof1 = v16;
             String str1 = str;
             SparseLongArray sparseLongAr1 = sparseLongAr;
             long l2 = l1;
             y oy1 = oy;
             uoa = m;
             k ok = a;
             l = slideTaskDis1.e(q$a.c(m, a, uof1, l2, str1, null, 16, 0));
             if (uoa.d(l)) {
                SparseLongArray sparseLongAr2 = sparseLongAr1;
                if (uoa.d(sparseLongAr2.get(ok.getStage()))) {
                   Log.n("SingleDispatchTaskController", "有相同阶段的task残留->stage:"+ok.getStage()+", taskName:"+str1);
                   oy1.a(sparseLongAr2, ok, true, true);
                }
                sparseLongAr2.append(ok.getStage(), l);
             }
          }
          if (uoa.d(l)) {
          label_010c :
             return;
          }
       }
       this.P(p0);
       goto label_010c ;
    }
    public x0 t(){
       a uoa = PatchProxy.apply(null, this, DispatchBaseElement.class, "17");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = this.f0(this.r);
       }
       return uoa;
    }
    public final void u(){
       long l;
       if (PatchProxy.applyVoid(null, this, DispatchBaseElement.class, "5")) {
          return;
       }
       r a = r.a;
       if (this.G()) {
          q$a m = q.m;
          y oy = this.h0();
          a.m(oy);
          String str = this.getClass().getCanonicalName()+' '+a.getClass().getSimpleName();
          if (oy.c().b() && (!a.g(a, d0.a) && (!a.g(a, w.a) && (a.g(a, u.a) || a.g(a, b.a))))) {
             l = -1;
          }else {
             SparseLongArray sparseLongAr = oy.i(oy.c().a());
             a uoa = oy.c();
             SlideTaskDispatcher slideTaskDis = uoa.c();
             long l1 = uoa.a();
             long l2 = slideTaskDis.e(q$a.c(m, a, new DispatchBaseElement$g(a, sparseLongAr, str, this), l1, str, false, 16, null));
             if (m.d(l2)) {
                if (m.d(sparseLongAr.get(a.getStage()))) {
                   Log.n("SingleDispatchTaskController", "有相同阶段的task残留->stage:"+a.getStage()+", taskName:"+str);
                   oy.a(sparseLongAr, a, true, true);
                }
                sparseLongAr.append(a.getStage(), l2);
             }
             l = l2;
          }
          if (!m.d(l)) {
          label_00e2 :
             this.l0(false);
             this.F().clear();
             if (this.w().f() > 0) {
                this.w().dispose();
                this.V(new a());
             }
          }
       }else {
          goto label_00e2 ;
       }
       return;
    }
    public final void v(){
       long l;
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, DispatchBaseElement.class, "9")) {
          return;
       }
       u a = u.a;
       if (this.G()) {
          q$a m = q.m;
          y oy = this.h0();
          a.m(oy);
          String str = this.getClass().getCanonicalName()+' '+a.getClass().getSimpleName();
          if (oy.c().b() && (!a.g(a, d0.a) && (!a.g(a, w.a) && (a.g(a, a) || a.g(a, b.a))))) {
             l = -1;
          }else {
             SparseLongArray sparseLongAr = oy.i(oy.c().a());
             a uoa = oy.c();
             SlideTaskDispatcher slideTaskDis = uoa.c();
             long l1 = uoa.a();
             SlideTaskDispatcher slideTaskDis1 = slideTaskDis;
             long l2 = slideTaskDis1.e(q$a.c(m, a, new DispatchBaseElement$h(a, sparseLongAr, str, obj), l1, str, false, 16, 0));
             if (m.d(l2)) {
                if (m.d(sparseLongAr.get(a.getStage()))) {
                   Log.n("SingleDispatchTaskController", "有相同阶段的task残留->stage:"+a.getStage()+", taskName:"+str);
                   oy.a(sparseLongAr, a, true, true);
                }
                sparseLongAr.append(a.getStage(), l2);
             }
             l = l2;
          }
          if (!m.d(l)) {
          label_00e7 :
             if (this.g0() && !this.J()) {
                if (this.F().isEmpty() ^ 1) {
                   Log.b("DispatchBaseElement", this.getClass().getSimpleName()+" discard detached");
                }
             }else {
                obj.U(false);
                Iterator iterator = this.F().iterator();
                while (iterator.hasNext()) {
                   iterator.next().d(false);
                }
             }
          }
       }else {
          goto label_00e7 ;
       }
       return;
    }
}

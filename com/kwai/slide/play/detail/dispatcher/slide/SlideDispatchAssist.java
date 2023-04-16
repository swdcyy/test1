package com.kwai.slide.play.detail.dispatcher.slide.SlideDispatchAssist;
import ih5.c0;
import com.kwai.slide.play.detail.dispatcher.slide.SlideDispatchAssist$a;
import nsd.u;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import com.kwai.component.taskdispatcher.slide.SlideDispatchHelper;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.component.taskdispatcher.utils.DispatchLogger;
import java.lang.StringBuilder;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import xf6.d;
import androidx.fragment.app.Fragment;
import jh5.a;
import ih5.y;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import com.kwai.slide.play.detail.dispatcher.slide.SlideDispatchAssist$enableDispatchOptCancel$2;
import msd.a;
import qrd.p;
import qrd.s;
import eh5.j;
import java.lang.Long;
import java.lang.Boolean;
import eh5.l;
import java.lang.Integer;
import ih5.c0$a;
import android.os.SystemClock;
import java.util.Iterator;
import java.lang.Iterable;
import ih5.b0;
import as7.a;
import q87.c;
import eh5.v;
import java.lang.Runnable;
import eh5.q;
import ih5.d0;
import ih5.w;
import ih5.u;
import ih5.b;
import android.util.SparseLongArray;
import com.kwai.component.taskdispatcher.slide.strategy.SlideTaskDispatcher;
import com.kwai.slide.play.detail.dispatcher.slide.SlideDispatchAssist$b;
import eh5.q$a;
import com.yxcorp.utility.Log;
import java.lang.IllegalAccessException;
import android.util.SparseArray;
import androidx.collection.SimpleArrayMap;
import com.kwai.slide.play.detail.dispatcher.slide.SlideDispatchAssist$c;
import java.util.Map;
import ih5.x;
import ih5.o;
import ih5.k;
import ih5.m;
import ih5.d;
import ih5.f;
import ih5.r;
import java.lang.Throwable;
import java.util.Objects;
import eh5.u;
import eh5.r;

public final class SlideDispatchAssist implements c0	// class@0017bc
{
    public final y b;
    public final ArrayList c;
    public final p d;
    public final Fragment e;
    public final a f;
    public static final boolean g;
    public static final int h;
    public static final SlideDispatchAssist$a i;

    static {
       int i;
       SlideDispatchAssist.i = new SlideDispatchAssist$a(null);
       boolean b = false;
       SlideDispatchAssist.g = a.t().d("disableFlushCreateTask", b);
       c obj = PatchProxy.apply(null, null, SlideDispatchHelper.class, "16");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          Object[] objArray = new Object[b];
          DispatchLogger.d.w("DispatchStrategyUtil", "sEnableSlideFlushDispatch-> "+SlideDispatchHelper.o(), objArray);
          obj = a.a();
          a.o(obj, "AppEnv.get\(\)");
          if (obj.c()) {
             i = (d.m() == -1)? SlideDispatchHelper.o(): d.m();
          }else {
             i = SlideDispatchHelper.o();
          }
       }
       SlideDispatchAssist.h = i;
    }
    public void SlideDispatchAssist(Fragment p0,a p1){
       a.p(p0, "fragment");
       a.p(p1, "dispatcherContext");
       super();
       this.e = p0;
       this.f = p1;
       y oy = new y(p1, null, null, 6, null);
       this.b = p0;
       ArrayList uArrayList = new ArrayList();
       this.c = uArrayList;
       uArrayList.add(p0);
       this.d = s.c(SlideDispatchAssist$enableDispatchOptCancel$2.INSTANCE);
    }
    public static void c(SlideDispatchAssist p0,long p1,j p2,boolean p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = false;
       }
       SlideDispatchAssist slideDispatc = SlideDispatchAssist.class;
       if (!PatchProxy.isSupport(slideDispatc) || !PatchProxy.applyVoidThreeRefs(Long.valueOf(p1), p2, Boolean.valueOf(p3), p0, SlideDispatchAssist.class, "17")) {
          if (PatchProxy.isSupport(slideDispatc) && (!PatchProxy.applyVoidThreeRefs(Long.valueOf(p1), p2, Boolean.valueOf(p3), p0, SlideDispatchAssist.class, "18") && !d.a())) {
             p0.g(p1, p2, p3, false);
          }
          p0.k(p1, p2, p3);
       }
       return;
    }
    public static void l(SlideDispatchAssist p0,long p1,j p2,boolean p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = false;
       }
       p0.k(p1, p2, p3);
       return;
    }
    public final void a(c0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideDispatchAssist.class, "3")) {
          return;
       }
       a.p(p0, "finder");
       this.c.add(p0);
       return;
    }
    public boolean b(int p0,int p1,boolean p2){
       if (PatchProxy.isSupport(SlideDispatchAssist.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, SlideDispatchAssist.class, "24");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return c0$a.b(this, p0, p1, p2);
    }
    public void d(long p0,l p1,boolean p2){
       if (PatchProxy.isSupport(SlideDispatchAssist.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, Boolean.valueOf(p2), this, SlideDispatchAssist.class, "21")) {
          return;
       }
       a.p(p1, "type");
       DispatchLogger.D("SlideDispatchAssist", this.f.a()+"  start flushTasks->type:"+p1.getStage()+", "+"overStep:"+p2+' ');
       long l = SystemClock.elapsedRealtimeNanos();
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().d(p0, p1, p2);
       }
       Object[] objArray = new Object[0];
       a.C().s("SlideDispatchAssist", this.f.a()+"  end flushTasks, cost: "+((SystemClock.elapsedRealtimeNanos() - l) / (long)1000)+"us", objArray);
       return;
    }
    public final boolean e(v p0,Runnable p1,String p2){
       long l;
       a this;
       long l1;
       SlideDispatchAssist slideDispatc = this;
       Object obj = p0;
       Object obj1 = p1;
       String str = p2;
       q$a obj2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, SlideDispatchAssist.class, "1");
       if (obj2 != PatchProxyResult.class) {
          return obj2.booleanValue();
       }
       a.p(obj, "type");
       a.p(obj1, "runnable");
       if (!slideDispatc.f.d()) {
          return false;
       }
       obj2 = q.m;
       SlideDispatchAssist b = slideDispatc.b;
       if (v2 = obj instanceof l) {
          if (v2) {
             if (b.c().b() && (!a.g(obj, d0.a) && (!a.g(obj, w.a) && (a.g(obj, u.a) || a.g(obj, b.a))))) {
                l = -1;
             }else {
                SparseLongArray sparseLongAr = b.i(b.c().a());
                this = b.c();
                SlideTaskDispatcher slideTaskDis = this.c();
                l1 = this.a();
                long l2 = slideTaskDis.e(q$a.c(obj2, p0, new SlideDispatchAssist$b(obj, sparseLongAr, str, obj1), l1, p2, false, 16, false));
                if (obj2.d(l2)) {
                   l ol = p0;
                   if (obj2.d(sparseLongAr.get(ol.getStage()))) {
                      Log.n("SingleDispatchTaskController", "有相同阶段的task残留->stage:"+ol.getStage()+", taskName:"+p2);
                      b.a(sparseLongAr, ol, true, true);
                   }
                   sparseLongAr.append(ol.getStage(), l2);
                }
                l = l2;
             }
          }else {
             throw new IllegalAccessException("type is not Periodical,Please use doNormalDispatchFunc to add task");
          }
       }else if(!v2){
          String str1 = String.valueOf(SystemClock.elapsedRealtime());
          int this1 = p0.hashCode();
          SparseArray sparseArray = b.e(b.c().a());
          a uoa = b.c();
          SlideTaskDispatcher obj3 = sparseArray.get(this1);
          a.m(obj3);
          obj3.remove(str1);
          obj3 = uoa.c();
          String str2 = p2;
          SlideDispatchAssist$c uoc = new SlideDispatchAssist$c(sparseArray, this1, str1, p0, str2, p1);
          l1 = uoa.a();
          SlideDispatchAssist$c uoc1 = obj;
          long l3 = obj3.e(q$a.c(obj2, p0, uoc1, l1, str2, false, 16, 0));
          if (obj2.d(l3)) {
             ArrayMap uArrayMap = sparseArray.get(this1);
             if (uArrayMap == null) {
                uArrayMap = new ArrayMap();
                sparseArray.put(this1, uArrayMap);
             }
             uArrayMap.put(str1, Long.valueOf(l3));
          }
          l = l3;
       }else {
          throw new IllegalAccessException("type is Periodical,Please use doStateDispatch to add task");
       }
       return obj2.d(l);
    }
    public void f(long p0){
       SlideDispatchAssist slideDispatc = SlideDispatchAssist.class;
       if (PatchProxy.isSupport(slideDispatc) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, slideDispatc, "22")) {
          return;
       }
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().f(p0);
       }
       return;
    }
    public void g(long p0,l p1,boolean p2,boolean p3){
       long this;
       long l = p0;
       if (PatchProxy.isSupport(SlideDispatchAssist.class) && PatchProxy.applyVoidFourRefs(Long.valueOf(p0), p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, SlideDispatchAssist.class, "20")) {
          return;
       }
       a.p(p1, "type");
       DispatchLogger.D("SlideDispatchAssist", l+" start cancelTasks->type:"+p1.getStage()+", "+"overStep:"+p2+", "+"flushRemain:"+p3+' ');
       this = SystemClock.elapsedRealtimeNanos();
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().g(p0, p1, p2, p3);
       }
       Object[] objArray = new Object[0];
       a.C().s("SlideDispatchAssist", l+"  end cancelTasks, cost: "+((SystemClock.elapsedRealtimeNanos() - this) / (long)1000)+"us", objArray);
       return;
    }
    public void h(long p0,l p1,boolean p2){
       if (PatchProxy.isSupport(SlideDispatchAssist.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, Boolean.valueOf(p2), this, SlideDispatchAssist.class, "23")) {
          return;
       }
       a.p(p1, "type");
       c0$a.a(this, p0, p1, p2);
       return;
    }
    public final void i(boolean p0,boolean p1){
       SlideDispatchAssist slideDispatc = SlideDispatchAssist.class;
       if (PatchProxy.isSupport(slideDispatc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, slideDispatc, "5")) {
          return;
       }
       if (this.f.d()) {
          int h = SlideDispatchAssist.h;
          if (h > 0 && (!p0 || (h == 1 || (!p0 && (h == 2 && !p1))))) {
             Object[] objArray = new Object[0];
             a.C().s("SlideDispatchAssist", "flushBindTaskBySlide\(\) slideFlushMode="+h, objArray);
             slideDispatc = this;
             SlideDispatchAssist.l(slideDispatc, this.f.a(), o.a, false, 4, null);
             SlideDispatchAssist.l(slideDispatc, this.f.a(), k.a, false, 4, null);
             SlideDispatchAssist.l(slideDispatc, this.f.a(), m.a, false, 4, null);
          }
       }
    label_0074 :
       return;
    }
    public final void j(){
       if (PatchProxy.applyVoid(null, this, SlideDispatchAssist.class, "6")) {
          return;
       }
       if (!this.f.d()) {
          return;
       }
       if (!SlideDispatchAssist.g) {
          SlideDispatchAssist.l(this, this.f.a(), o.a, false, 4, null);
       }
       return;
    }
    public final void k(long p0,j p1,boolean p2){
       if (PatchProxy.isSupport(SlideDispatchAssist.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, Boolean.valueOf(p2), this, SlideDispatchAssist.class, "19")) {
          return;
       }
       a.p(p1, "mainStage");
       this.d(p0, p1, p2);
       return;
    }
    public final boolean m(){
       Object obj = PatchProxy.apply(null, this, SlideDispatchAssist.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.f.b();
    }
    public final boolean n(){
       Object obj = PatchProxy.apply(null, this, SlideDispatchAssist.class, "15");
       if (obj == PatchProxyResult.class) {
          obj = this.d.getValue();
       }
       return obj.booleanValue();
    }
    public final void o(){
       if (PatchProxy.applyVoid(null, this, SlideDispatchAssist.class, "11")) {
          return;
       }
       if (!this.f.d()) {
          return;
       }
       if (this.m()) {
          SlideDispatchAssist.c(this, this.f.a(), d.a, false, 4, null);
       }
       return;
    }
    public final void p(){
       if (PatchProxy.applyVoid(null, this, SlideDispatchAssist.class, "9")) {
          return;
       }
       if (!this.f.d()) {
          return;
       }
       if (this.m()) {
          SlideDispatchAssist.c(this, this.f.a(), f.a, false, 4, null);
       }
       return;
    }
    public final void q(){
       if (PatchProxy.applyVoid(null, this, SlideDispatchAssist.class, "12")) {
          return;
       }
       if (!this.f.d()) {
          return;
       }
       if (this.m()) {
          return;
       }
       if (this.n()) {
          SlideDispatchAssist.c(this, this.f.a(), u.a, false, 4, null);
       }else {
          SlideDispatchAssist.l(this, this.f.a(), u.a, false, 4, null);
       }
       return;
    }
    public final void r(){
       if (PatchProxy.applyVoid(null, this, SlideDispatchAssist.class, "13")) {
          return;
       }
       if (!this.f.d()) {
          return;
       }
       if (this.n()) {
          this.f(this.f.a());
          this.g(this.f.a(), r.a, true, true);
       }
       return;
    }
    public final void s(){
       if (PatchProxy.applyVoid(null, this, SlideDispatchAssist.class, "10")) {
          return;
       }
       if (!this.f.d()) {
          return;
       }
       if (this.m()) {
          return;
       }
       if (this.n()) {
          SlideDispatchAssist.c(this, this.f.a(), w.a, false, 4, null);
       }else {
          SlideDispatchAssist.l(this, this.f.a(), w.a, false, 4, null);
       }
       return;
    }
    public final boolean t(v p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyOneRefs(p0, this, SlideDispatchAssist.class, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = "type";
       a.p(p0, obj);
       boolean b = false;
       if (!this.f.d()) {
          return b;
       }
       SlideDispatchAssist tb = this.b;
       long l = this.f.a();
       Objects.requireNonNull(tb);
       y oy = y.class;
       if (PatchProxy.isSupport(oy)) {
          Object obj1 = PatchProxy.applyTwoRefs(Long.valueOf(l), p0, tb, oy, "11");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
          label_0048 :
             a.p(p0, obj);
             if (p0 instanceof l) {
                SparseLongArray sparseLongAr = tb.i(l);
                int i = (sparseLongAr.size())? 1: 0;
                if (i) {
                   long l1 = sparseLongAr.get(p0.getStage());
                   i = (q.m.d(l1) && tb.b.c().k().g(l1))? 1: 0;
                   if (i) {
                      sparseLongAr.delete(p0.getStage());
                      long[] olongArray = new long[]{l1};
                      tb.b.c().k().i(1, olongArray);
                   }
                   b = i;
                }
             }
          }
       }else {
          goto label_0048 ;
       }
       return b;
    }
}

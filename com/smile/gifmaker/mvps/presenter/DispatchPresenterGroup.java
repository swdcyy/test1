package com.smile.gifmaker.mvps.presenter.DispatchPresenterGroup;
import ih5.c0;
import com.smile.gifmaker.mvps.presenter.DispatchPresenterGroup$a;
import nsd.u;
import jh5.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import vl8.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import com.smile.gifmaker.mvps.presenter.DispatchPresenterGroup$mExcludePresenters$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.ArrayList;
import java.util.LinkedList;
import com.smile.gifmaker.mvps.presenter.DispatchPresenterGroup$groupDispatchHelper$2;
import com.smile.gifmaker.mvps.presenter.DispatchPresenterGroup$presenterDispatchHelper$2;
import eh5.j;
import eh5.q;
import ih5.y;
import eh5.l;
import ih5.d0;
import ih5.w;
import ih5.u;
import ih5.b;
import android.util.SparseLongArray;
import com.kwai.component.taskdispatcher.slide.strategy.SlideTaskDispatcher;
import nl8.d;
import eh5.v;
import eh5.q$a;
import java.lang.Runnable;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.lang.IllegalAccessException;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import nl8.b;
import java.lang.Long;
import java.util.Map;
import ih5.c0$a;
import ih5.g;
import nl8.e;
import com.kwai.component.taskdispatcher.utils.DispatchLogger;
import nl8.c;

public final class DispatchPresenterGroup implements c0	// class@000bfb
{
    public final b b;
    public final p c;
    public final List d;
    public final LinkedList e;
    public Runnable f;
    public final p g;
    public final p h;
    public final a i;
    public static final DispatchPresenterGroup$a j;

    static {
       DispatchPresenterGroup.j = new DispatchPresenterGroup$a(null);
    }
    public void DispatchPresenterGroup(a p0){
       a.p(p0, "dispatcherContext");
       super();
       this.i = p0;
       this.b = new b(this, PresenterV2.class);
       this.c = s.c(DispatchPresenterGroup$mExcludePresenters$2.INSTANCE);
       this.d = new ArrayList();
       this.e = new LinkedList();
       this.g = s.c(new DispatchPresenterGroup$groupDispatchHelper$2(this));
       this.h = s.c(new DispatchPresenterGroup$presenterDispatchHelper$2(this));
    }
    public final boolean a(j p0,String p1,a p2){
       long l;
       long l1;
       SparseArray obj = p0;
       String str = p1;
       if (this.i.d()) {
          q$a m = q.m;
          y oy = this.e();
          if (v0 = obj instanceof l) {
             if (v0) {
                if (oy.c().b() && (!a.g(obj, d0.a) && (!a.g(obj, w.a) && (a.g(obj, u.a) || a.g(obj, b.a))))) {
                   l = -1;
                }else {
                   SparseLongArray sparseLongAr = oy.i(oy.c().a());
                   a uoa = oy.c();
                   SlideTaskDispatcher slideTaskDis = uoa.c();
                   l1 = uoa.a();
                   SlideTaskDispatcher slideTaskDis1 = slideTaskDis;
                   l = slideTaskDis1.e(q$a.c(m, p0, new d(obj, sparseLongAr, p2, str), l1, p1, false, 16, 0));
                   if (m.d(l)) {
                      if (m.d(sparseLongAr.get(p0.getStage()))) {
                         Log.n("SingleDispatchTaskController", "有相同阶段的task残留->stage:"+p0.getStage()+", taskName:"+str);
                         oy.a(sparseLongAr, obj, true, true);
                      }
                      sparseLongAr.append(p0.getStage(), l);
                   }
                }
             }else {
                throw new IllegalAccessException("type is not Periodical,Please use doNormalDispatchFunc to add task");
             }
          }else if(!v0){
             String str1 = String.valueOf(SystemClock.elapsedRealtime());
             int i = p0.hashCode();
             SparseArray sparseArray = oy.e(oy.c().a());
             a uoa1 = oy.c();
             b obj1 = sparseArray.get(i);
             a.m(obj1);
             obj1.remove(str1);
             SlideTaskDispatcher slideTaskDis2 = uoa1.c();
             obj1 = new b(sparseArray, i, str1, p0, p2, p1);
             l1 = uoa1.a();
             obj = sparseArray;
             l = slideTaskDis2.e(q$a.c(m, p0, v17, l1, p1, false, 16, 0));
             if (m.d(l)) {
                ArrayMap uArrayMap = obj.get(i);
                if (uArrayMap == null) {
                   uArrayMap = new ArrayMap();
                   obj.put(i, uArrayMap);
                }
                uArrayMap.put(str1, Long.valueOf(l));
             }
          }else {
             throw new IllegalAccessException("type is Periodical,Please use doStateDispatch to add task");
          }
          if (m.d(l)) {
             return true;
          }
       }
       p2.invoke();
       return false;
    }
    public boolean b(int p0,int p1,boolean p2){
       return c0$a.b(this, p0, p1, p2);
    }
    public final boolean c(j p0,String p1,String p2,a p3){
       long l1;
       v ov;
       long l2;
       q oq;
       Object obj = p0;
       String str = p1;
       String str1 = p2;
       if (!this.i.d()) {
          return false;
       }
       q$a m = q.m;
       g og = this.j();
       long l = 0;
       if (v0 = obj instanceof l) {
          a.m(p1);
          if (v0) {
             if (og.e().b() && (!a.g(obj, d0.a) && (!a.g(obj, w.a) && (a.g(obj, u.a) || a.g(obj, b.a))))) {
                l1 = -1;
             }else {
                l = og.e().a();
                SparseArray sparseArray = og.j(l);
                ov = p0;
                l2 = l;
                String str2 = p2;
                long l3 = l;
                e uoe = new e(ov, sparseArray, p1, l2, str2, p3, 0);
                oq = q$a.b(m, ov, v17, 0, l3, str2, false, 32, null);
                long l4 = og.e().c().e(oq);
                String str3 = ", taskName:";
                String str4 = ", taskBelong:";
                String str5 = "BatchDispatchTaskController";
                if (m.d(l4)) {
                   DispatchLogger.D(str5, l3+" :addStageTask success-> type:"+p0.getStage()+str4+str+str3+str1+" ， taskId:"+l4);
                   og.a(sparseArray, p0, p1, l4);
                }else {
                   DispatchLogger.D(str5, l3+" :addStageTask failed-> type:"+p0.getStage()+str4+str+str3+str1+" ， taskId:-1");
                }
                l1 = l4;
             }
          }else {
             throw new IllegalAccessException("type is not Periodical,Please use doNormalDispatchFunc to add task");
          }
       }else if(!v0){
          String str6 = (str == null)? String.valueOf(SystemClock.elapsedRealtime()): str+SystemClock.elapsedRealtime();
          str = str6;
          int i = p0.hashCode();
          SparseArray sparseArray1 = og.i(og.e().a());
          a uoa = og.e();
          ov = p0;
          SparseArray sparseArray2 = sparseArray1;
          SparseArray sparseArray3 = sparseArray1;
          c uoc = new c(ov, sparseArray2, i, str, p3, 0, p2);
          l2 = uoa.a();
          int i1 = i;
          oq = q$a.b(m, ov, v16, l, l2, p2, false, 32, 0);
          l1 = uoa.c().e(oq);
          if (m.d(l1)) {
             sparseArray2 = sparseArray3;
             ArrayMap uArrayMap = sparseArray2.get(i1);
             if (uArrayMap == null) {
                uArrayMap = new ArrayMap();
                sparseArray2.put(i1, uArrayMap);
             }
             uArrayMap.put(str, Long.valueOf(l1));
          }
       }else {
          throw new IllegalAccessException("type is Periodical,Please use doStateDispatch to add task");
       }
       return m.d(l1);
    }
    public void d(long p0,l p1,boolean p2){
       a.p(p1, "type");
       DispatchLogger.d.j("DispatchPresenterGroup", this.i.a()+" , [flushTasks\(\)]  batchId="+p0+", type="+p1.getStage()+", overStep="+p2);
       this.e().d(p0, p1, p2);
       this.j().d(p0, p1, p2);
    }
    public final y e(){
       return this.g.getValue();
    }
    public void f(long p0){
       DispatchLogger.d.j("DispatchPresenterGroup", this.i.a()+" , [cancelNormalTasks\(\)]  batchId="+p0);
       this.e().f(p0);
       this.j().f(p0);
    }
    public void g(long p0,l p1,boolean p2,boolean p3){
       a.p(p1, "type");
       DispatchLogger.d.j("DispatchPresenterGroup", this.i.a()+" , [cancelTasks\(\)]  batchId="+p0+", type="+p1.getStage()+", overStep="+p2+", flushRemain="+p3);
       this.e().g(p0, p1, p2, p3);
       this.j().g(p0, p1, p2, p3);
    }
    public void h(long p0,l p1,boolean p2){
       a.p(p1, "type");
       c0$a.a(this, p0, p1, p2);
    }
    public final PresenterV2 i(){
       return this.c.getValue();
    }
    public final g j(){
       return this.h.getValue();
    }
}

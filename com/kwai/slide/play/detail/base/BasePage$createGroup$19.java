package com.kwai.slide.play.detail.base.BasePage$createGroup$19;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.slide.play.detail.base.BasePage;
import java.lang.Object;
import java.util.List;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ih5.o;
import bq7.c;
import ih5.g;
import com.kwai.slide.play.detail.base.BasePage$a;
import jh5.a;
import eh5.q;
import eh5.l;
import ih5.d0;
import ih5.w;
import ih5.u;
import ih5.b;
import android.util.SparseArray;
import com.kwai.component.taskdispatcher.slide.strategy.SlideTaskDispatcher;
import com.kwai.slide.play.detail.base.BasePage$createGroup$19$a;
import eh5.v;
import eh5.q$a;
import java.lang.Runnable;
import java.lang.StringBuilder;
import com.kwai.component.taskdispatcher.utils.DispatchLogger;
import java.lang.IllegalAccessException;
import android.os.SystemClock;
import com.kwai.slide.play.detail.base.BasePage$createGroup$19$b;
import androidx.collection.ArrayMap;
import java.lang.Long;
import java.util.Map;
import qp7.t0;
import qp7.e;
import android.widget.RelativeLayout;

public final class BasePage$createGroup$19 extends Lambda implements l	// class@00174d
{
    public final BasePage this$0;

    public void BasePage$createGroup$19(BasePage p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(List p0){
       o a;
       long l;
       q$a uoa1;
       g og1;
       String this;
       String str1;
       o oo;
       Object obj = this;
       String obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, BasePage$createGroup$19.class, "1")) {
          return;
       }
       a.p(obj1, "$receiver");
       BasePage$createGroup$19 this$0 = obj.this$0;
       a = o.a;
       String name = c.class.getName();
       a.o(name, "BottomPanelGroup::class.java.name");
       String str = "bottomPanelGroupElements create";
       if (this$0.G() != null && BasePage.U.a()) {
          a uoa = this$0.H();
          a.m(uoa);
          if (uoa.d()) {
             q$a m = q.m;
             g og = this$0.G();
             a.m(og);
             BasePage$createGroup$19$a uocreateGrou = null;
             v0 = a instanceof l;
             if (this$0) {
                a.m(name);
                if (this$0) {
                   if (og.e().b() && (!a.g(a, d0.a) && (!a.g(a, w.a) && (a.g(a, u.a) || a.g(a, b.a))))) {
                      l = -1;
                      uoa1 = m;
                   }else {
                      long l1 = og.e().a();
                      SparseArray sparseArray = og.j(l1);
                      long l2 = l1;
                      long l3 = l1;
                      og1 = og;
                      BasePage$createGroup$19$a uocreateGrou1 = new BasePage$createGroup$19$a(a, sparseArray, name, l2, str, 0, this, p0);
                      uoa1 = m;
                      this = str;
                      str1 = name;
                      BasePage$createGroup$19$a uocreateGrou2 = uocreateGrou;
                      oo = a;
                      long l4 = og.e().c().e(q$a.b(m, a, uocreateGrou2, null, l3, this, false, 32, null));
                      String str2 = ", taskName:";
                      String str3 = ", taskBelong:";
                      String str4 = "BatchDispatchTaskController";
                      if (uoa1.d(l4)) {
                         DispatchLogger.D(str4, l3+" :addStageTask success-> type:"+oo.getStage()+str3+str1+str2+this+" £¬ taskId:"+l4);
                         og1.a(sparseArray, oo, str1, l4);
                      }else {
                         DispatchLogger.D(str4, l3+" :addStageTask failed-> type:"+oo.getStage()+str3+str1+str2+this+" £¬ taskId:-1");
                      }
                      l = l4;
                   }
                }else {
                   throw new IllegalAccessException("type is not Periodical,Please use doNormalDispatchFunc to add task");
                }
             }else {
                og1 = og;
                uoa1 = m;
                this = str;
                str1 = name;
                oo = a;
                if (!this$0) {
                   obj1 = str1+SystemClock.elapsedRealtime();
                   int i = oo.hashCode();
                   g og2 = og1;
                   SparseArray sparseArray1 = og2.i(og1.e().a());
                   a uoa2 = og2.e();
                   SlideTaskDispatcher slideTaskDis = uoa2.c();
                   BasePage$createGroup$19$b uocreateGrou3 = new BasePage$createGroup$19$b(oo, sparseArray1, i, obj1, 0, this, this, p0);
                   l = uoa2.a();
                   SlideTaskDispatcher slideTaskDis1 = slideTaskDis;
                   SparseArray sparseArray2 = sparseArray1;
                   int i1 = i;
                   l = slideTaskDis1.e(q$a.b(uoa1, oo, v17, uocreateGrou, l, this, false, 32, null));
                   if (uoa1.d(l)) {
                      ArrayMap uArrayMap = sparseArray2.get(i1);
                      if (uArrayMap == null) {
                         uArrayMap = new ArrayMap();
                         sparseArray2.put(i1, uArrayMap);
                      }
                      uArrayMap.put(obj1, Long.valueOf(l));
                   }
                }else {
                   throw new IllegalAccessException("type is Periodical,Please use doStateDispatch to add task");
                }
             }
             if (uoa1.d(l)) {
             label_021f :
                return;
             }
          }
       }
       obj.this$0.K0(new c());
       c uoc = obj.this$0.x();
       if (uoc != null) {
          uoc.v(obj.this$0.U());
       }
       uoc = obj.this$0.x();
       if (uoc != null) {
          RelativeLayout relativeLayo = obj.this$0.V();
          a.m(relativeLayo);
          uoc.l(relativeLayo);
       }
       uoc = obj.this$0.x();
       if (uoc != null) {
          uoc.a(p0);
          goto label_021f ;
       }else {
          goto label_021f ;
       }
    }
}

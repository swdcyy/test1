package com.smile.gifmaker.mvps.presenter.PriorityScatterPresenterGroup;
import ih5.c0;
import jh5.a;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.smile.gifmaker.mvps.presenter.PriorityScatterPresenterGroup$mSlideDispatchPresenterGroup$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.String;
import kotlin.jvm.internal.a;
import nl8.s;
import nl8.q;
import java.util.List;
import vl8.b;
import ih5.c0$a;
import java.util.Arrays;
import java.util.LinkedList;
import com.kwai.component.taskdispatcher.utils.DispatchLogger;
import java.lang.StringBuilder;
import com.smile.gifshow.annotation.provider.v2.a;
import java.util.Iterator;
import java.lang.Iterable;
import ih5.m;
import eh5.q;
import java.lang.Class;
import ih5.g;
import ih5.d0;
import ih5.w;
import ih5.u;
import ih5.b;
import android.util.SparseArray;
import com.kwai.component.taskdispatcher.slide.strategy.SlideTaskDispatcher;
import nl8.t;
import eh5.v;
import eh5.q$a;
import java.lang.Runnable;
import eh5.l;
import android.view.View;
import ih5.o;
import nl8.u;
import nl8.v;

public final class PriorityScatterPresenterGroup implements c0	// class@000c29
{
    public PresenterV2 b;
    public PresenterV2 c;
    public boolean d;
    public final p e;
    public final a f;
    public final boolean g;

    public void PriorityScatterPresenterGroup(a p0,boolean p1){
       super();
       this.f = p0;
       this.g = p1;
       this.b = new PresenterV2();
       this.c = new PresenterV2();
       this.e = s.c(new PriorityScatterPresenterGroup$mSlideDispatchPresenterGroup$2(this));
    }
    public void PriorityScatterPresenterGroup(boolean p0){
       super(null, p0);
    }
    public final void a(PresenterV2 p0){
       String str = "presenter";
       a.p(p0, str);
       a.p(p0, str);
       if (!this.j()) {
          this.b.U7(p0);
       }else {
          s os = this.k();
          if (os != null) {
             a.p(p0, str);
             if (!os.a(p0)) {
                if (os.d == null) {
                   os.d = new PresenterV2();
                }
                s d = os.d;
                if (d != null) {
                   d.U7(p0);
                }
             }else {
                os.c.add(new q(p0, 0));
                os.b.x(p0);
             }
          }
       }
       return;
    }
    public boolean b(int p0,int p1,boolean p2){
       return c0$a.b(this, p0, p1, p2);
    }
    public final void c(Object[] p0){
       m a;
       q$a m;
       long l;
       Iterator iterator1;
       q$a uoa1;
       boolean b;
       String this;
       Object[] obj = p0;
       String str = "callerContext";
       a.p(obj, str);
       if (!this.j()) {
          this.b.i(Arrays.copyOf(obj, obj.length));
       }else {
          s os = this.k();
          if (os != null) {
             obj = Arrays.copyOf(obj, obj.length);
             a.p(obj, str);
             os.i.clear();
             s d = os.d;
             if (d != null) {
                d.i(Arrays.copyOf(obj, obj.length));
             }
             DispatchLogger.d.j("PriorityDispatchPresenterGroup", os.l.a()+" [BindMain]bind count="+os.c.size()+" hashcode = "+os.hashCode());
             a uoa = os.b.a(Arrays.copyOf(obj, obj.length));
             Iterator iterator = os.c.iterator();
             while (iterator.hasNext()) {
                Object obj1 = iterator.next();
                a = m.a;
                PresenterV2 presenterV2 = obj1.a();
                int i = obj1.b();
                if (os.l.d()) {
                   m = q.m;
                   s h = os.h;
                   String str1 = String.valueOf(presenterV2.hashCode());
                   String str2 = presenterV2.getClass().getName()+' '+a.getClass().getSimpleName();
                   a.m(str1);
                   if (h.e().b() && (!a.g(a, d0.a) && (!a.g(a, w.a) && (a.g(a, u.a) || a.g(a, b.a))))) {
                      l = -1;
                      iterator1 = iterator;
                      uoa1 = m;
                   }else {
                      long l1 = h.e().a();
                      SparseArray sparseArray = h.j(l1);
                      iterator1 = iterator;
                      long l2 = l1;
                      String str3 = str2;
                      this = str1;
                      s os1 = h;
                      q$a uoa2 = m;
                      m om = a;
                      t ot = new t(a, sparseArray, str1, l1, str2, i, obj1, os, uoa);
                      long l3 = h.e().c().e(q$a.b(uoa2, om, v20, i, l1, str2, false, 32, null));
                      uoa1 = uoa2;
                      String str4 = ", taskName:";
                      String str5 = ", taskBelong:";
                      String str6 = "BatchDispatchTaskController";
                      if (uoa1.d(l3)) {
                         DispatchLogger.D(str6, l2+" :addStageTask success-> type:"+om.getStage()+str5+this+str4+str3+" £¬ taskId:"+l3);
                         os1.a(sparseArray, om, this, l3);
                      }else {
                         DispatchLogger.D(str6, l2+" :addStageTask failed-> type:"+om.getStage()+str5+this+str4+str3+" £¬ taskId:-1");
                      }
                      l = l3;
                   }
                   b = uoa1.d(l);
                }else {
                   iterator1 = iterator;
                   b = false;
                }
                DispatchLogger.d.j("PriorityDispatchPresenterGroup", os.l.a()+" [dispatch "+b+"], "+obj1.a().getClass().getName()+"_BindMain");
                if (!b) {
                   Object[] objArray = new Object[]{uoa};
                   obj1.a().i(objArray);
                   os.i.add(obj1.a());
                }
                iterator = iterator1;
             }
          }
       }
       return;
    }
    public void d(long p0,l p1,boolean p2){
       a.p(p1, "type");
       s os = this.k();
       if (os != null) {
          os.d(p0, p1, p2);
       }
       return;
    }
    public final void e(View p0){
       o a;
       long l;
       q$a uoa;
       Iterator iterator1;
       boolean b;
       PriorityScatterPresenterGroup priorityScat = this;
       Object obj = p0;
       String str = "view";
       a.p(obj, str);
       priorityScat.d = true;
       if (!this.j()) {
          priorityScat.b.f(obj);
       }else {
          s os = this.k();
          if (os != null) {
             a.p(obj, str);
             s d = os.d;
             if (d != null) {
                d.f(obj);
             }
             DispatchLogger.d.j("PriorityDispatchPresenterGroup", os.l.a()+" [CreateMain]create count="+os.c.size()+" hashcode = "+os.hashCode());
             Iterator iterator = os.c.iterator();
             while (iterator.hasNext()) {
                Object obj1 = iterator.next();
                a = o.a;
                PresenterV2 presenterV2 = obj1.a();
                int i = obj1.b();
                if (os.l.d()) {
                   q$a m = q.m;
                   s h = os.h;
                   String str1 = String.valueOf(presenterV2.hashCode());
                   String str2 = presenterV2.getClass().getName()+' '+a.getClass().getSimpleName();
                   a.m(str1);
                   if (h.e().b() && (!a.g(a, d0.a) && (!a.g(a, w.a) && (a.g(a, u.a) || a.g(a, b.a))))) {
                      l = -1;
                      uoa = m;
                      iterator1 = iterator;
                   }else {
                      long l1 = h.e().a();
                      SparseArray sparseArray = h.j(l1);
                      long l2 = l1;
                      String str3 = str2;
                      iterator1 = iterator;
                      String str4 = str1;
                      s os1 = h;
                      q$a uoa1 = m;
                      o oo = a;
                      u ou = new u(a, sparseArray, str1, l1, str2, i, obj1, os, p0);
                      long l3 = h.e().c().e(q$a.b(uoa1, oo, v19, i, l1, str2, false, 32, null));
                      uoa = uoa1;
                      String str5 = ", taskName:";
                      String str6 = ", taskBelong:";
                      String str7 = "BatchDispatchTaskController";
                      if (uoa.d(l3)) {
                         DispatchLogger.D(str7, l2+" :addStageTask success-> type:"+oo.getStage()+str6+str4+str5+str3+" £¬ taskId:"+l3);
                         os1.a(sparseArray, oo, str4, l3);
                      }else {
                         DispatchLogger.D(str7, l2+" :addStageTask failed-> type:"+oo.getStage()+str6+str4+str5+str3+" £¬ taskId:-1");
                      }
                      l = l3;
                   }
                   b = uoa.d(l);
                }else {
                   iterator1 = iterator;
                   b = false;
                }
                DispatchLogger.d.j("PriorityDispatchPresenterGroup", os.l.a()+" [dispatch "+b+"], "+obj1.a().getClass().getName()+"_CreateMain");
                if (!b) {
                   obj1.a().f(obj);
                }
                iterator = iterator1;
             }
          }
       }
       return;
    }
    public void f(long p0){
       s os = this.k();
       if (os != null) {
          os.f(p0);
       }
       return;
    }
    public void g(long p0,l p1,boolean p2,boolean p3){
       a.p(p1, "type");
       s os = this.k();
       if (os != null) {
          os.g(p0, p1, p2, p3);
       }
       return;
    }
    public void h(long p0,l p1,boolean p2){
       a.p(p1, "type");
       c0$a.a(this, p0, p1, p2);
    }
    public final void i(){
       this.d = false;
       if (!this.j()) {
          this.b.destroy();
          this.b = new PresenterV2();
       }else {
          s os = this.k();
          if (os != null) {
             s d = os.d;
             if (d != null) {
                d.destroy();
             }
             DispatchLogger.d.j("PriorityDispatchPresenterGroup", os.l.a()+" [DestroyMain]destroy count="+os.c.size()+" hashcode = "+os.hashCode());
             Iterator iterator = os.i.iterator();
             while (iterator.hasNext()) {
                iterator.next().destroy();
             }
          }
       }
       return;
    }
    public final boolean j(){
       PriorityScatterPresenterGroup tf = this.f;
       boolean b = (tf != null && (this.g != null && tf.d()))? true: false;
       return b;
    }
    public final s k(){
       return this.e.getValue();
    }
    public final void l(PresenterV2 p0){
       String str = "presenter";
       a.p(p0, str);
       a.p(p0, str);
       if (!this.j()) {
          this.c.U7(p0);
       }else {
          s os = this.k();
          if (os != null) {
             a.p(p0, str);
             if (!os.a(p0)) {
                if (os.g == null) {
                   os.g = new PresenterV2();
                }
                s g = os.g;
                if (g != null) {
                   g.U7(p0);
                }
             }else {
                os.e.add(new q(p0, 0));
                os.f.x(p0);
             }
          }
       }
       return;
    }
    public final void m(Object[] p0){
       m a;
       q$a m;
       long l;
       Iterator iterator1;
       q$a uoa1;
       boolean b;
       String this;
       Object[] obj = p0;
       String str = "callerContext";
       a.p(obj, str);
       if (!this.j()) {
          this.c.i(Arrays.copyOf(obj, obj.length));
       }else {
          s os = this.k();
          if (os != null) {
             obj = Arrays.copyOf(obj, obj.length);
             a.p(obj, str);
             os.j.clear();
             s g = os.g;
             if (g != null) {
                g.i(Arrays.copyOf(obj, obj.length));
             }
             DispatchLogger.d.j("PriorityDispatchPresenterGroup_insert", os.l.a()+" [BindMain]bind count="+os.e.size()+" hashcode = "+os.hashCode());
             a uoa = os.f.a(Arrays.copyOf(obj, obj.length));
             Iterator iterator = os.e.iterator();
             while (iterator.hasNext()) {
                Object obj1 = iterator.next();
                a = m.a;
                PresenterV2 presenterV2 = obj1.a();
                int i = obj1.b();
                if (os.l.d()) {
                   m = q.m;
                   s h = os.h;
                   String str1 = String.valueOf(presenterV2.hashCode());
                   String str2 = presenterV2.getClass().getName()+' '+a.getClass().getSimpleName();
                   a.m(str1);
                   if (h.e().b() && (!a.g(a, d0.a) && (!a.g(a, w.a) && (a.g(a, u.a) || a.g(a, b.a))))) {
                      l = -1;
                      iterator1 = iterator;
                      uoa1 = m;
                   }else {
                      long l1 = h.e().a();
                      SparseArray sparseArray = h.j(l1);
                      iterator1 = iterator;
                      long l2 = l1;
                      String str3 = str2;
                      this = str1;
                      s os1 = h;
                      q$a uoa2 = m;
                      m om = a;
                      v ov = new v(a, sparseArray, str1, l1, str2, i, obj1, os, uoa);
                      long l3 = h.e().c().e(q$a.b(uoa2, om, v20, i, l1, str2, false, 32, null));
                      uoa1 = uoa2;
                      String str4 = ", taskName:";
                      String str5 = ", taskBelong:";
                      String str6 = "BatchDispatchTaskController";
                      if (uoa1.d(l3)) {
                         DispatchLogger.D(str6, l2+" :addStageTask success-> type:"+om.getStage()+str5+this+str4+str3+" £¬ taskId:"+l3);
                         os1.a(sparseArray, om, this, l3);
                      }else {
                         DispatchLogger.D(str6, l2+" :addStageTask failed-> type:"+om.getStage()+str5+this+str4+str3+" £¬ taskId:-1");
                      }
                      l = l3;
                   }
                   b = uoa1.d(l);
                }else {
                   iterator1 = iterator;
                   b = false;
                }
                DispatchLogger.d.j("PriorityDispatchPresenterGroup_insert", os.l.a()+" [dispatch "+b+"], "+obj1.a().getClass().getName()+"_BindMain");
                if (!b) {
                   Object[] objArray = new Object[]{uoa};
                   obj1.a().i(objArray);
                   os.j.add(obj1.a());
                }
                iterator = iterator1;
             }
          }
       }
       return;
    }
    public final void n(){
       if (!this.j()) {
          this.c.destroy();
          this.c = new PresenterV2();
       }else {
          s os = this.k();
          if (os != null) {
             s g = os.g;
             if (g != null) {
                g.destroy();
             }
             DispatchLogger.d.j("PriorityDispatchPresenterGroup_insert", os.l.a()+" [DestroyMain]destroy count="+os.e.size()+" hashcode = "+os.hashCode());
             Iterator iterator = os.j.iterator();
             while (iterator.hasNext()) {
                iterator.next().destroy();
             }
          }
       }
       return;
    }
    public final void o(){
       if (!this.j()) {
          this.c.unbind();
       }else {
          s os = this.k();
          if (os != null) {
             s g = os.g;
             if (g != null) {
                g.unbind();
             }
             DispatchLogger.d.j("PriorityDispatchPresenterGroup_insert", os.l.a()+" [UnBindMain]unbind count="+os.e.size()+" hashcode = "+os.hashCode());
             os.h(os.l.a(), o.a, false);
             os.h(os.l.a(), m.a, false);
             Iterator iterator = os.j.iterator();
             while (iterator.hasNext()) {
                iterator.next().unbind();
             }
          }
       }
       return;
    }
    public final boolean p(){
       return this.d;
    }
    public final void q(){
       if (!this.j()) {
          this.b.unbind();
       }else {
          s os = this.k();
          if (os != null) {
             s d = os.d;
             if (d != null) {
                d.unbind();
             }
             DispatchLogger.d.j("PriorityDispatchPresenterGroup", os.l.a()+" [UnBindMain]unbind count="+os.c.size()+" hashcode = "+os.hashCode());
             os.h(os.l.a(), o.a, false);
             os.h(os.l.a(), m.a, false);
             Iterator iterator = os.i.iterator();
             while (iterator.hasNext()) {
                iterator.next().unbind();
             }
          }
       }
       return;
    }
}

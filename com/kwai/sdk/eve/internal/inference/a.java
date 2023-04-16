package com.kwai.sdk.eve.internal.inference.a;
import en7.t;
import java.lang.String;
import zn7.a;
import wn7.a;
import vm7.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import ym7.c;
import java.util.HashMap;
import en7.j;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import en7.t$b;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.inference.EveExecutableAtomic;
import java.lang.Throwable;
import cn7.f;
import com.kwai.robust.PatchProxyResult;
import cn7.b;
import cn7.c;
import java.lang.System;
import msd.l;
import ml5.a;
import brd.v;
import com.kwai.sdk.eve.internal.common.utils.TimeRange;
import en7.v;
import wm7.a;
import java.lang.reflect.Method;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import java.util.Iterator;
import zsd.u;
import com.kwai.sdk.eve.internal.common.scheduler.LabeledRunnable;
import com.kuaishou.eve.packageinfo.model.ResourceType;
import com.kwai.sdk.eve.internal.inference.a$b;
import cn7.b$a;
import com.kwai.sdk.eve.internal.inference.a$c;
import nsd.u;
import com.kwai.sdk.eve.internal.common.models.InferenceCanceled;

public final class a implements t	// class@001569
{
    public l b;
    public Iterator c;
    public boolean d;
    public final c e;
    public t f;
    public EveExecutableAtomic g;
    public EveExecutableAtomic h;
    public final HashMap i;
    public final j j;
    public final String k;
    public final a l;
    public final a m;
    public final a n;
    public final String o;

    public void a(String p0,a p1,a p2,a p3,String p4){
       a.p(p0, "id");
       a.p(p1, "task");
       a.p(p2, "monitor");
       a.p(p3, "eveContext");
       a.p(p4, "pipelineName");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.o = p4;
       this.e = new c(this, p3);
       this.i = new HashMap();
       this.j = new j(p1.n(), p0);
    }
    public Map a(){
       return this.i;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "12")) {
          return;
       }
       t$b.b(this);
       return;
    }
    public void c(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "11")) {
          return;
       }
       a.p(p0, "action");
       t$b.c(this, p0);
       return;
    }
    public void d(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "10")) {
          return;
       }
       a.p(p0, "action");
       t$b.a(this, p0);
       return;
    }
    public final void e(){
       this.d = true;
    }
    public final void f(EveExecutableAtomic p0,Object p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "9")) {
          return;
       }
       this.m.d(this, p0, p1, p2, this.g(p0));
       return;
    }
    public final f g(EveExecutableAtomic p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       f uof = new f(this.n.h().f(p0), this.n.h().h(p0), this.n.h().d(), System.currentTimeMillis());
       return obj;
    }
    public final String h(){
       return this.k;
    }
    public final String i(){
       return this.o;
    }
    public final j j(){
       return this.j;
    }
    public final a k(){
       return this.l;
    }
    public final boolean l(){
       boolean b = (this.h != null)? true: false;
       return b;
    }
    public final void m(l p0){
       this.b = p0;
    }
    public final void n(a p0,v p1){
       Class[] obj3;
       Object obj = this;
       Object obj1 = p0;
       Object obj2 = p1;
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, uoa, "5")) {
          return;
       }
       int i = 2;
       if (obj.d == null) {
          obj.j.d("p_checkCancel");
          a l = obj.l;
          if (!PatchProxy.applyVoidOneRefs(l, null, a.class, "4")) {
             a.p(l, "task");
             Class b = a.b;
             if (b != null) {
                obj3 = new Class[]{a.class};
                Object[] objArray = new Object[]{l};
                b.getMethod("updateDebugInfoIfNecessary", obj3).invoke(b, objArray);
             }
          }
          obj.j.d("p_debugToolInit");
          l = obj.c;
          String str = "iterator";
          if (l == null) {
             a.S(str);
          }
          if (l.hasNext()) {
             l = obj.c;
             if (l == null) {
                a.S(str);
             }
             obj3 = l.next();
             String str1 = u.g2(obj3.b(), "@", "_", false, 4, null);
             obj.j.d("p_getNextProcessor_"+str1);
             if (!PatchProxy.applyVoidOneRefs(obj3, obj, uoa, "7")) {
                obj.m.h(obj, obj3, obj.g(obj3));
             }
             obj.j.d("p_dispatchProcessorSubmit_"+str1);
             EveLog.i$default("EveInference#submitNext submit "+obj3.b(), false, i, null);
             a$b uob = v4;
             a$b uob1 = v4;
             uob = new a$b(obj3, this, str1, obj3, p0, p1);
             b$a.a(obj.n.h(), new LabeledRunnable(obj3.m(), obj3.getResource(), obj3.q(), uob1), false, 2, null);
             obj.j.d("p_commitRunnable_"+str1);
          }else {
             obj.j.d("t_graph_loopFinish");
             EveLog.i$default("EveInference#submitNext loop finish", false, 2, null);
             LabeledRunnable labeledRunna = new LabeledRunnable(obj.l.f(), null, null, new a$c(obj2, obj1), 6, null);
             b$a.a(obj.n.h(), i, false, 2, null);
          }
          return;
       }else {
          EveLog.i$default("EveInference#submitNext but canceled "+obj.l.n()+' '+obj.k+' '+obj.d, false, 2, null);
          throw new InferenceCanceled();
       }
    }
}

package com.kwai.sdk.eve.internal.datacenter.components.DataStreamCenter;
import gn7.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import hn7.g;
import cn7.c;
import cn7.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cn7.b;
import java.lang.System;
import com.kuaishou.eve.packageinfo.model.FilterAction;
import ml5.a;
import zn7.a;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import q50.f;
import gn7.l;
import q50.d;
import java.util.Set;
import com.kwai.sdk.eve.internal.datacenter.internal.MatcherActionScheduler;
import com.kuaishou.eve.packageinfo.model.MatcherSchedule;
import com.kwai.sdk.eve.internal.datacenter.components.DataStreamCenter$onMatchResult$1;
import msd.a;
import java.util.Iterator;
import java.lang.Iterable;
import in7.f;
import q50.g;
import com.kwai.sdk.eve.internal.datacenter.components.DataStreamCenter$onMatchResult$3;
import java.lang.Runnable;
import brd.t;
import io.reactivex.subjects.PublishSubject;
import gn7.m;
import nsd.u;
import com.kwai.sdk.eve.internal.common.scheduler.LabeledRunnable;
import ao7.a;
import com.kuaishou.eve.packageinfo.model.ResourceType;
import java.util.List;
import cn7.h;
import com.kwai.sdk.eve.internal.datacenter.components.DataStreamCenter$a;
import cn7.b$a;

public final class DataStreamCenter	// class@0014b7
{
    public final Object a;
    public g b;
    public final Map c;
    public final Set d;
    public float e;
    public boolean f;
    public final c g;

    public void DataStreamCenter(c p0){
       a.p(p0, "context");
       super();
       this.g = p0;
       this.a = new Object();
       this.c = new LinkedHashMap();
       this.d = new LinkedHashSet();
    }
    public static final g a(DataStreamCenter p0){
       p0 = p0.b;
       if (p0 == null) {
          a.S("trie");
       }
       return p0;
    }
    public final f b(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DataStreamCenter.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       f uof = new f(this.g.c().f(p0), this.g.c().h(p0), this.g.c().d(), System.currentTimeMillis());
       return obj;
    }
    public final void c(FilterAction p0,a p1,a p2){
       Iterator iterator;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, DataStreamCenter.class, "7")) {
          return;
       }
       EveLog.i$default("DataStreamCenter#onMatchResult "+p2.n()+' '+p0, false, 2, null);
       if (p0 instanceof f) {
          this.g.a().a(p1, p2);
       }else if(p0 instanceof d){
          if (this.f != null) {
             MatcherActionScheduler.c.a(p2.n()+"_Infer_"+p0.a(), p0.b(), new DataStreamCenter$onMatchResult$1(this, p0, p2, p1));
          }else {
             iterator = p0.a().iterator();
             while (iterator.hasNext()) {
                this.g.b().c(p2, p1, iterator.next());
             }
          }
       }else if(p0 instanceof g){
          this.g.a().a(p1, p2);
          if (this.f != null) {
             MatcherActionScheduler.c.a(p2.n()+"_SaveAndInfer_"+p0.a(), p0.b(), new DataStreamCenter$onMatchResult$3(this, p0, p2, p1));
          }else {
             iterator = p0.a().iterator();
             while (iterator.hasNext()) {
                this.g.b().c(p2, p1, iterator.next());
             }
          }
       }
       return;
    }
    public final void d(Set p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DataStreamCenter.class, "9")) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          iterator.next().q("DataStreamCenter");
       }
       return;
    }
    public final t e(a p0,Runnable p1){
       String str;
       DataStreamCenter uDataStreamC = this;
       a obj = p0;
       PublishSubject obj1 = PatchProxy.applyTwoRefs(obj, p1, this, DataStreamCenter.class, "10");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = PublishSubject.g();
       a.o(obj1, "PublishSubject.create<SchedulerInfoHolder>\(\)");
       m om = new m(null, null, null, 7, null);
       if (obj != null) {
          obj = p0.h();
          if (obj != null) {
             str = obj.m();
             if (str != null) {
             label_003b :
                LabeledRunnable labeledRunna = new LabeledRunnable(str, null, "dataStream", p1, 2, null);
                v11.H().add(new DataStreamCenter$a(v11, this, v3, obj1));
                v3.a = this.b(v11);
                b$a.a(uDataStreamC.g.c(), v11, false, 2, null);
                return obj1;
             }
          }
       }
       str = "__TOP";
       goto label_003b ;
    }
}

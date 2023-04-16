package com.kwai.plugin.dva.feature.core.opt.FeatureDex2OatManager$triggerDex2OatPendingTask$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ftd.k0;
import qrd.l1;
import csd.b;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.kwai.plugin.dva.feature.core.opt.FeatureDex2OatManager$a;
import qrd.j0;
import java.lang.IllegalStateException;
import com.kwai.plugin.dva.feature.core.opt.FeatureDex2OatManager;
import java.lang.Integer;
import dsd.a;
import kotlin.jvm.internal.a;
import qj7.d;
import java.util.LinkedList;
import java.lang.System;
import com.kwai.dva.dex2oat.Dex2OatManager;
import java.io.File;
import java.lang.ClassLoader;
import aj5.b$a;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.c;
import wi7.a;
import java.lang.Boolean;

public final class FeatureDex2OatManager$triggerDex2OatPendingTask$1 extends SuspendLambda implements p	// class@00131f
{
    public long J$0;
    public Object L$0;
    public Object L$1;
    public int label;

    public void FeatureDex2OatManager$triggerDex2OatPendingTask$1(c p0){
       super(2, p0);
    }
    public final c create(Object p0,c p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, FeatureDex2OatManager$triggerDex2OatPendingTask$1.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new FeatureDex2OatManager$triggerDex2OatPendingTask$1(p1);
    }
    public final Object invoke(k0 p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, FeatureDex2OatManager$triggerDex2OatPendingTask$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final Object invokeSuspend(Object p0){
       long l1;
       FeatureDex2OatManager$triggerDex2OatPendingTask$1 obj = PatchProxy.applyOneRefs(p0, this, FeatureDex2OatManager$triggerDex2OatPendingTask$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       FeatureDex2OatManager$triggerDex2OatPendingTask$1 tlabel = this.label;
       LinkedList linkedList = 2;
       FeatureDex2OatManager$triggerDex2OatPendingTask$1 otriggerDex2 = 1;
       if (tlabel != null) {
          if (tlabel != otriggerDex2) {
             if (tlabel == linkedList) {
                obj = this.L$1;
                tlabel = this.L$0;
                j0.n(p0);
             label_00ec :
                otriggerDex2 = obj;
             label_00ed :
                FeatureDex2OatManager$a uoa = new FeatureDex2OatManager$a(tlabel.b(), tlabel.a(), tlabel.d(), tlabel.c(), tlabel.e(), false);
                otriggerDex2.element = p0;
             }else {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
             }
          }else {
             otriggerDex2 = this.J$0;
             tlabel = this.L$0;
             j0.n(p0);
          label_00a3 :
             long l = System.currentTimeMillis() - otriggerDex2;
             Ref$ObjectRef objectRef = new Ref$ObjectRef();
             if (!p0.b() && (tlabel.f != null && StringsKt__StringsKt.O2(p0.a(), "timeout", false, linkedList, null))) {
                d.c(a.C("retry triggerDex2Oat, apk=", tlabel.a()));
                if (FeatureDex2OatManager.f.isEmpty()) {
                   this.L$0 = tlabel;
                   this.L$1 = objectRef;
                   this.label = linkedList;
                   if (c.a(0x2710, this) == obj) {
                      return obj;
                   }else {
                      Ref$ObjectRef objectRef1 = objectRef;
                      goto label_00ec ;
                   }
                }else {
                   goto label_00ed ;
                }
             }else {
                a uoa1 = FeatureDex2OatManager.a.d();
                if (uoa1 != null) {
                   uoa1.a(tlabel.b(), p0, l);
                }
             }
          }
       }else {
          j0.n(p0);
          p0 = FeatureDex2OatManager.f;
          _monitor_enter(p0);
          if (FeatureDex2OatManager.e >= 3) {
             d.c(a.C("dex2oat running task count = ", a.f(FeatureDex2OatManager.e)));
             _monitor_exit(p0);
             return l1.a;
          }else if(FeatureDex2OatManager.f.isEmpty()){
             d.c("dex2oat apk list is empty");
             _monitor_exit(p0);
             return l1.a;
          }else {
             FeatureDex2OatManager.e = FeatureDex2OatManager.e + otriggerDex2;
             FeatureDex2OatManager$a uoa2 = FeatureDex2OatManager.f.pop();
             _monitor_exit(p0);
             a.o(uoa2, "withDex2OatTaskQueueLock¡­BeOpt.pop\(\)\n            }");
             l1 = System.currentTimeMillis();
             this.L$0 = uoa2;
             this.J$0 = l1;
             this.label = otriggerDex2;
             p0 = Dex2OatManager.a.f(uoa2.a(), uoa2.d(), uoa2.c(), uoa2.e(), this);
             if (p0 == obj) {
                return obj;
             }else {
                long l2 = l1;
                goto label_00a3 ;
             }
          }
       }
       p0 = FeatureDex2OatManager.a;
       LinkedList f = FeatureDex2OatManager.f;
       _monitor_enter(f);
       FeatureDex2OatManager.e = FeatureDex2OatManager.e - 1;
       Ref$ObjectRef element = otriggerDex2.element;
       if (element != null) {
          a.a(FeatureDex2OatManager.f.add(element));
       }
       _monitor_exit(f);
       p0.k();
       return l1.a;
    }
}

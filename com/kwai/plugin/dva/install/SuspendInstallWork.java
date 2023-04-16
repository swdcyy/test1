package com.kwai.plugin.dva.install.SuspendInstallWork;
import com.kwai.plugin.dva.install.SuspendInstallWork$a;
import nsd.u;
import java.lang.Object;
import ptd.c;
import kotlinx.coroutines.sync.MutexKt;
import com.kwai.plugin.dva.work.c;
import java.lang.String;
import nj7.e;
import com.kwai.plugin.dva.install.e;
import lj7.g;
import java.util.List;
import kotlin.jvm.internal.a;
import kotlinx.coroutines.CoroutineDispatcher;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ftd.r1;
import com.kwai.plugin.dva.install.SuspendInstallWork$run$_run$1;
import asd.c;
import ftd.k0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import com.kwai.plugin.dva.repository.model.PluginConfig;
import com.kwai.robust.PatchProxyResult;
import asd.h;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import com.kwai.plugin.dva.install.PluginUrlManager;
import com.kwai.plugin.dva.install.SuspendInstallWork$b;
import java.lang.Integer;
import fj7.a;
import com.kwai.plugin.dva.install.d;
import com.kwai.plugin.dva.install.e$b;
import gj7.b;
import com.kwai.plugin.dva.install.remote.c;
import csd.b;
import dsd.e;
import qrd.l1;
import java.lang.Boolean;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import com.kwai.plugin.dva.work.WorkExecutors;
import com.kwai.plugin.dva.install.SuspendInstallWork$c;
import java.util.concurrent.Executor;
import com.kwai.plugin.dva.work.c$c;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Iterator;
import com.kwai.plugin.dva.install.a;
import java.lang.System;
import java.lang.StringBuilder;
import qj7.d;
import java.lang.Float;
import com.kwai.plugin.dva.install.SuspendInstallWork$suspendRun$1;
import java.lang.IllegalStateException;
import kotlin.jvm.internal.Ref$ObjectRef;
import qrd.j0;
import ftd.r0;
import com.kwai.plugin.dva.install.SuspendInstallInterceptor;
import com.kwai.plugin.dva.install.error.PluginInstallException;
import java.lang.Throwable;
import java.lang.Exception;
import com.kwai.plugin.dva.install.SuspendInstallWork$suspendRun$installDependsTask$1;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.plugin.dva.entity.Plugin;
import com.kwai.plugin.dva.repository.model.PluginInfo;
import java.lang.Thread;
import java.io.File;
import nj7.c;
import com.kwai.plugin.dva.repository.model.DvaPluginConfig;
import qj7.a;
import ii7.b;
import java.lang.RuntimeException;

public final class SuspendInstallWork	// class@001351
{
    public final c a;
    public final String b;
    public final e c;
    public final e d;
    public final g e;
    public final List f;
    public final List g;
    public boolean h;
    public float i;
    public float j;
    public static final SuspendInstallWork$a k;
    public static final c l;

    static {
       SuspendInstallWork.k = new SuspendInstallWork$a(null);
       SuspendInstallWork.l = MutexKt.g(false, 1, null);
    }
    public void SuspendInstallWork(c p0,String p1,e p2,e p3,g p4,List p5,List p6){
       a.p(p0, "mTask");
       a.p(p1, "mPluginName");
       a.p(p2, "mPluginSource");
       a.p(p3, "mInstaller");
       a.p(p4, "mPluginLoader");
       a.p(p5, "mInstallInterceptors");
       a.p(p6, "mBlockCompleteInterceptors");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
    }
    public static final void f(CoroutineDispatcher p0,SuspendInstallWork p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, SuspendInstallWork.class, "8")) {
          return;
       }
       a.f(r1.b, p0, null, new SuspendInstallWork$run$_run$1(p1, null), 2, null);
       return;
    }
    public final Object a(e p0,c p1,PluginConfig p2,c p3){
       h obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, SuspendInstallWork.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new h(IntrinsicsKt__IntrinsicsJvmKt.d(p3));
       PluginConfig name = p2.name;
       PluginConfig version = p2.version;
       String str = PluginUrlManager.a.b(p2);
       p2 = p2.md5;
       super(this, p1, obj);
       e uoe = e.class;
       _monitor_enter(p0);
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{name,Integer.valueOf(version),str,p2,this};
          if (PatchProxy.applyVoid(objArray, p0, uoe, "2")) {
             _monitor_exit(p0);
          label_0068 :
             p0 = obj.b();
             if (p0 == b.h()) {
                e.c(p3);
             }
             if (p0 == b.h()) {
                return p0;
             }else {
                return l1.a;
             }
          }
       }
       a uoa = new a(name, version, str, p2);
       uoa.b(new d(p0, this));
       p0.b.g(uoa);
       _monitor_exit(p0);
       goto label_0068 ;
    }
    public final float b(){
       float f = (this.i * 9.00f) / 10.00f;
       if (this.h != null) {
          f = (f + this.j) / 2.00f;
       }
       return f;
    }
    public final Object c(List p0,boolean p1,c p2){
       h obj;
       if (PatchProxy.isSupport(SuspendInstallWork.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, SuspendInstallWork.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != null && (p0.isEmpty() || p0.contains("ignore"))) {
          return null;
       }else {
          obj = new h(IntrinsicsKt__IntrinsicsJvmKt.d(p2));
          Dva.instance().getPluginInstallManager().k(p0).b(WorkExecutors.c, new SuspendInstallWork$c(p1, this, obj));
          p0 = obj.b();
          if (p0 == b.h()) {
             e.c(p2);
          }
          return p0;
       }
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, SuspendInstallWork.class, "4")) {
          return;
       }
       Iterator iterator = new LinkedList(this.g).iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          uoa.a(this.b);
          long l = System.currentTimeMillis() - System.currentTimeMillis();
          d.c("..installing "+this.b+" block interceptor "+uoa.getClass().getName()+" cost "+l);
       }
       return;
    }
    public final void e(c p0,float p1){
       SuspendInstallWork suspendInsta = SuspendInstallWork.class;
       if (PatchProxy.isSupport(suspendInsta) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, suspendInsta, "7")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.m(p1);
       return;
    }
    public final Object g(c p0){
       int i;
       SuspendInstallWork$suspendRun$1 osuspendRun$;
       SuspendInstallWork$suspendRun$1 obj4;
       long l1;
       SuspendInstallWork$suspendRun$1 osuspendRun$1;
       long l2;
       SuspendInstallWork a;
       SuspendInstallWork b;
       r0 or0;
       SuspendInstallWork$suspendRun$1 osuspendRun$2;
       SuspendInstallWork$suspendRun$1 osuspendRun$4;
       SuspendInstallWork$suspendRun$1 osuspendRun$5;
       long l4;
       SuspendInstallWork$suspendRun$1 osuspendRun$6;
       Object obj6;
       Ref$ObjectRef objectRef;
       Object obj = this;
       SuspendInstallWork$suspendRun$1 obj1 = p0;
       SuspendInstallWork suspendInsta = SuspendInstallWork.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SuspendInstallWork$suspendRun$1 obj2 = PatchProxy.applyOneRefs(obj1, obj, suspendInsta, "2");
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       if (obj1 instanceof SuspendInstallWork$suspendRun$1) {
          i = obj1;
          SuspendInstallWork$suspendRun$1 label = i.label;
          boolean i1 = Integer.MIN_VALUE;
          int i2 = label & i1;
          if (i2) {
             int i3 = label - i1;
             i.label = i3;
             try{
             label_0029 :
                obj1 = i.result;
                Object obj3 = b.h();
                c uoc = null;
                switch (i.label){
                    case 0:
                      j0.n(obj1);
                      d.c(a.C("Doing install job ", obj.b));
                      Iterator iterator = obj.f.iterator();
                      osuspendRun$ = obj;
                      long l = System.currentTimeMillis();
                   label_00e8 :
                      i1 = 1;
                      if (iterator.hasNext()) {
                         obj4 = iterator.next();
                         l1 = System.currentTimeMillis();
                         if (obj4 instanceof SuspendInstallInterceptor) {
                            i.L$0 = osuspendRun$;
                            i.L$1 = iterator;
                            i.L$2 = obj4;
                            i.J$0 = l;
                            i.J$1 = l1;
                            i.label = i1;
                            if (obj4.b(osuspendRun$.b, i) == obj3) {
                               return obj3;
                            }else {
                               osuspendRun$1 = obj4;
                               l2 = l1;
                            label_0118 :
                               l1 = l2;
                            label_0120 :
                               l2 = System.currentTimeMillis() - l1;
                               d.c("run interceptor "+osuspendRun$1.getClass().getName()+" cost "+l2);
                               goto label_00e8 ;
                            }
                         }else {
                            obj4.a(osuspendRun$.b);
                            osuspendRun$1 = obj4;
                            goto label_0120 ;
                         }
                      }else {
                         l2 = System.currentTimeMillis();
                         d.c("..installing "+osuspendRun$.b+": waitInstallInterceptor cost "+(l2 - l));
                         a = osuspendRun$.a;
                         b = osuspendRun$.b;
                         _monitor_enter(a);
                         if (PatchProxy.applyOneRefs(b, a, c.class, "5") != patchProxyRe) {
                            _monitor_exit(a);
                         }else {
                            c b1 = a.b;
                            _monitor_enter(b1);
                            a.q(0x276a);
                            a.o(b);
                            _monitor_exit(b1);
                            a.l();
                            _monitor_exit(a);
                         }
                         PluginConfig pluginConfig = osuspendRun$.c.g(osuspendRun$.b);
                         if (pluginConfig == null) {
                            d.c("\t error, config not exist");
                            osuspendRun$.a.d(new Exception("Plugin Config not Found"));
                            return l1.a;
                         }else {
                            PluginConfig depends = pluginConfig.depends;
                            if (depends != null) {
                               a.m(depends);
                               if (!depends.isEmpty()) {
                               label_01de :
                                  osuspendRun$.h = i1;
                                  or0 = a.b(r1.b, WorkExecutors.d(), null, new SuspendInstallWork$suspendRun$installDependsTask$1(osuspendRun$, pluginConfig, uoc), 2, null);
                                  if (TextUtils.isEmpty(PluginUrlManager.a.b(pluginConfig))) {
                                     try{
                                        i.L$0 = osuspendRun$;
                                        i.L$1 = uoc;
                                        i.L$2 = uoc;
                                        i.label = 2;
                                        if (or0.C(i) == obj3) {
                                           return obj3;
                                        }else {
                                           osuspendRun$2 = osuspendRun$;
                                        }
                                     }catch(java.lang.Exception e0){
                                        suspendInsta = osuspendRun$;
                                     }
                                     suspendInsta.a.d(e0);
                                     return l1.a;
                                  }else {
                                     d.c("installing "+osuspendRun$.b+" by PluginInstaller at "+Thread.currentThread().getName());
                                     i.L$0 = osuspendRun$;
                                     i.L$1 = pluginConfig;
                                     i.L$2 = or0;
                                     i.J$0 = l;
                                     i.J$1 = l2;
                                     i.label = 3;
                                     if (osuspendRun$.a(osuspendRun$.d, osuspendRun$.a, pluginConfig, i) == obj3) {
                                        return obj3;
                                     }else {
                                        PluginConfig pluginConfig1 = pluginConfig;
                                     label_00a0 :
                                        obj1 = or0;
                                        SuspendInstallWork$suspendRun$1 osuspendRun$3 = l2;
                                        osuspendRun$1 = l;
                                        osuspendRun$4 = osuspendRun$;
                                        long l3 = System.currentTimeMillis();
                                        osuspendRun$5 = pluginConfig1;
                                        d.c("..installing "+osuspendRun$4.b+": tDownloadPlugin cost "+(l3 - osuspendRun$3));
                                        if (osuspendRun$5.type == null && !osuspendRun$4.a.h()) {
                                           try{
                                              String absolutePath = c.a(osuspendRun$5.name, osuspendRun$5.version).getAbsolutePath();
                                              a.o(absolutePath, "apkFile.absolutePath");
                                              i.L$0 = osuspendRun$4;
                                              i.L$1 = osuspendRun$5;
                                              i.L$2 = obj1;
                                              i.J$0 = osuspendRun$1;
                                              i.J$1 = l3;
                                              i.label = 4;
                                              c obj5 = PatchProxy.applyTwoRefs(absolutePath, i, osuspendRun$4, suspendInsta, "6");
                                              if (obj5 == patchProxyRe) {
                                                 DvaPluginConfig uDvaPluginCo = a.a(absolutePath);
                                                 if (uDvaPluginCo != null) {
                                                    obj5 = osuspendRun$4.c(uDvaPluginCo.depends, false, i);
                                                    if (obj5 != b.h()) {
                                                       obj5 = l1.a;
                                                    }
                                                 }else {
                                                    obj5 = l1.a;
                                                 }
                                              }
                                              if (obj5 == obj3) {
                                                 return obj3;
                                              }else {
                                                 l4 = l3;
                                                 obj4 = obj1;
                                              label_0314 :
                                                 obj1 = obj4;
                                              label_0315 :
                                                 osuspendRun$6 = osuspendRun$5;
                                                 osuspendRun$5 = osuspendRun$4;
                                                 if (!osuspendRun$5.a.h()) {
                                                    try{
                                                       i.L$0 = osuspendRun$5;
                                                       i.L$1 = osuspendRun$6;
                                                       i.L$2 = 0;
                                                       i.J$0 = osuspendRun$1;
                                                       i.J$1 = l4;
                                                       i.label = 5;
                                                       if (obj1.C(i) == obj3) {
                                                          return obj3;
                                                       }else {
                                                          obj6 = i;
                                                          obj2 = osuspendRun$5;
                                                          osuspendRun$5 = osuspendRun$6;
                                                       label_006b :
                                                          c obj7 = obj3;
                                                          label = osuspendRun$1;
                                                          long l5 = System.currentTimeMillis();
                                                          d.c("..installing "+obj2.b+": tWaitInstallDepends2 cost "+(l5 - l4));
                                                          d.c("\t plugin install finally success");
                                                          objectRef = new Ref$ObjectRef();
                                                          if (b.d) {
                                                             obj5 = SuspendInstallWork.l;
                                                             obj6.L$0 = obj2;
                                                             obj6.L$1 = osuspendRun$5;
                                                             obj6.L$2 = objectRef;
                                                             obj6.L$3 = obj5;
                                                             obj6.J$0 = label;
                                                             obj6.J$1 = l5;
                                                             obj6.label = 6;
                                                             if (obj5.e(null, obj6) == obj7) {
                                                                return obj7;
                                                             }else {
                                                                obj7 = obj5;
                                                                l4 = l5;
                                                             label_039c :
                                                                objectRef.element = obj2.e.d(osuspendRun$5.name).getPluginInfo();
                                                                obj7.f(null);
                                                                l5 = l4;
                                                             label_03c6 :
                                                                obj2.e(obj2.a, 100.00f);
                                                                l4 = System.currentTimeMillis();
                                                                d.c("..installing "+obj2.b+": tInstallPlugin cost "+(l4 - l5));
                                                                obj2.d();
                                                                d.c("..installing "+obj2.b+": tWaitBlockComplete cost "+(System.currentTimeMillis() - l4));
                                                                Ref$ObjectRef element = objectRef.element;
                                                                a.m(element);
                                                                obj2.c.j(element);
                                                                d.c("..installing "+obj2.b+": total cost "+(System.currentTimeMillis() - label));
                                                                obj2.a.r(osuspendRun$5.name);
                                                             label_04a4 :
                                                                return l1.a;
                                                             }
                                                          }else {
                                                             objectRef.element = obj2.e.d(osuspendRun$5.name).getPluginInfo();
                                                             goto label_03c6 ;
                                                          }
                                                       }
                                                    }catch(java.lang.Exception e0){
                                                       osuspendRun$5.a.d(e0);
                                                       return l1.a;
                                                    }
                                                 }else {
                                                    goto label_04a4 ;
                                                 }
                                              }
                                           }catch(java.lang.Exception e0){
                                              d.b(a.C(osuspendRun$5.name, " install Depends Fail"), e0);
                                              osuspendRun$4.a.d(e0);
                                              return l1.a;
                                           }
                                        }else {
                                           l4 = l3;
                                           goto label_0315 ;
                                        }
                                     }
                                  }
                               }
                            }
                            i1 = false;
                            goto label_01de ;
                         }
                      }
                      break;
                    case 1:
                      l2 = i.J$1;
                      osuspendRun$4 = i.J$0;
                      osuspendRun$1 = i.L$2;
                      osuspendRun$6 = i.L$1;
                      osuspendRun$ = i.L$0;
                      j0.n(obj1);
                      goto label_0118 ;
                      break;
                    case 2:
                      osuspendRun$2 = i.L$0;
                      j0.n(obj1);
                      break;
                    case 3:
                      obj4 = i.J$1;
                      osuspendRun$4 = i.J$0;
                      or0 = i.L$2;
                      osuspendRun$6 = i.L$1;
                      osuspendRun$ = i.L$0;
                      j0.n(obj1);
                      goto label_00a0 ;
                      break;
                    case 4:
                      l4 = i.J$1;
                      osuspendRun$1 = i.J$0;
                      obj4 = i.L$2;
                      osuspendRun$5 = i.L$1;
                      osuspendRun$4 = i.L$0;
                      try{
                         j0.n(obj1);
                         goto label_0314 ;
                      }catch(java.lang.Exception e0){
                      }
                      break;
                    case 5:
                      l4 = i.J$1;
                      osuspendRun$1 = i.J$0;
                      obj4 = i.L$1;
                      osuspendRun$5 = i.L$0;
                      try{
                         j0.n(obj1);
                         obj6 = i;
                         obj2 = osuspendRun$5;
                         osuspendRun$5 = obj4;
                         goto label_006b ;
                      }catch(java.lang.Exception e0){
                      }
                      break;
                    case 6:
                      osuspendRun$2 = i.J$1;
                      label = i.J$0;
                      SuspendInstallWork$suspendRun$1 l$3 = i.L$3;
                      objectRef = i.L$2;
                      osuspendRun$5 = i.L$1;
                      obj2 = i.L$0;
                      j0.n(obj1);
                      goto label_039c ;
                      break;
                    default:
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                osuspendRun$2.d();
                osuspendRun$2.c.j(osuspendRun$2.e.c(osuspendRun$2.b).getPluginInfo());
                osuspendRun$2.a.r(osuspendRun$2.b);
                return l1.a;
             }catch(java.lang.Exception e0){
                goto label_0255 ;
             }
          }
       }
       i = new SuspendInstallWork$suspendRun$1(obj, obj1);
       goto label_0029 ;
    }
}

package com.yxcorp.gifshow.biz.monitor.log.BizLogger;
import java.lang.Object;
import com.yxcorp.gifshow.biz.monitor.log.BizLogger$logOption$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.biz.monitor.log.LogLevel;
import oa9.b;
import java.lang.String;
import java.util.Map;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import na9.e;
import java.util.HashMap;
import java.lang.System;
import java.lang.Thread;
import kotlin.jvm.internal.a;
import nsd.u;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.Executor;
import t45.e;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import hkd.b;
import java.util.concurrent.ThreadPoolExecutor$DiscardPolicy;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.RejectedExecutionHandler;
import qrd.l1;
import com.yxcorp.gifshow.biz.monitor.log.BizLogger$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.biz.monitor.log.BizLogger$b;
import com.yxcorp.gifshow.biz.monitor.log.LogOption;
import com.yxcorp.utility.SystemUtil;

public abstract class BizLogger	// class@001c58
{
    public Executor a;
    public BizLogger$b b;
    public final p c;

    public void BizLogger(){
       super();
       this.c = s.c(new BizLogger$logOption$2(this));
    }
    public final void a(LogLevel p0,b p1,String p2,String p3,String p4,String p5,Map p6,Throwable p7){
       Object[] objArray;
       Executor uExecutor = this;
       BizLogger uBizLogger = BizLogger.class;
       if (PatchProxy.isSupport(uBizLogger)) {
          objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6,p7};
          if (PatchProxy.applyVoid(objArray, uExecutor, uBizLogger, "27")) {
             return;
          }
       }
       Map map = (p6 != null)? p6: new HashMap();
       String str = (p2 != null)? p2: "";
       String str1 = (p3 != null)? p3: "";
       Map map1 = null;
       String str2 = String.valueOf(System.currentTimeMillis());
       Thread thread = Thread.currentThread();
       a.o(thread, "Thread.currentThread\(\)");
       String str3 = String.valueOf(thread.getId());
       thread = Thread.currentThread();
       a.o(thread, "Thread.currentThread\(\)");
       String name = thread.getName();
       Throwable throwable = (p7 != null)? p7: new Throwable("find biz custom exception");
       e uoe = new e(p0, p1, p4, p5, map, str, str1, map1, str2, throwable, str3, name, null, null, 0x3080, null);
       BizLogger uBizLogger1 = PatchProxy.apply(null, uExecutor, uBizLogger, "1");
       if (uBizLogger1 != PatchProxyResult.class) {
       }else if(uExecutor.a == null){
          _monitor_enter(uBizLogger);
          uoe = new e(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(64), new b("biz-monitor"), new ThreadPoolExecutor$DiscardPolicy());
          uExecutor.a = uBizLogger1;
          _monitor_exit(uBizLogger);
       }
       uBizLogger1 = uExecutor.a;
       a.m(uBizLogger1);
       uBizLogger1.execute(new BizLogger$a(uExecutor, objArray));
       return;
    }
    public void b(b p0,String p1,String p2){
       LogLevel dEBUG;
       BizLogger uBizLogger = this;
       Object obj = p0;
       Object obj1 = p1;
       Object obj2 = p2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, BizLogger.class, "3")) {
          return;
       }
       String str = "biz";
       a.p(obj, str);
       String str1 = "tag";
       a.p(obj1, str1);
       String str2 = "msg";
       a.p(obj2, str2);
       if (!PatchProxy.applyVoidFourRefs(p0, p1, p2, null, this, BizLogger.class, "4")) {
          a.p(obj, str);
          a.p(obj1, str1);
          a.p(obj2, str2);
          BizLogger uBizLogger1 = BizLogger.class;
          if (PatchProxy.isSupport(uBizLogger1)) {
             Object[] objArray = new Object[]{obj,"","",obj1,obj2,null};
             if (!PatchProxy.applyVoid(objArray, this, uBizLogger1, "5")) {
             }
          }else {
          }
       }
    label_008f :
       return;
    }
    public void c(b p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, BizLogger.class, "16")) {
          return;
       }
       a.p(p0, "biz");
       a.p(p1, "tag");
       if (p2 == null) {
          p2 = "";
       }
       this.d(p0, p1, p2, null);
       return;
    }
    public void d(b p0,String p1,String p2,Throwable p3){
       BizLogger this;
       LogLevel eRROR;
       BizLogger this1;
       Object obj = this;
       Object obj1 = p0;
       Object obj2 = p1;
       Object obj3 = p2;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, BizLogger.class, "17")) {
          return;
       }
       String str = "biz";
       a.p(obj1, str);
       String str1 = "tag";
       a.p(obj2, str1);
       String str2 = "msg";
       a.p(obj3, str2);
       object oobject = null;
       this = BizLogger.class;
       int i = 4;
       int i1 = 3;
       int i2 = 2;
       int i3 = 5;
       if (PatchProxy.isSupport(this)) {
          Object[] objArray = new Object[i3];
          objArray[0] = obj1;
          objArray[1] = obj2;
          objArray[i2] = obj3;
          objArray[i1] = p3;
          objArray[i] = oobject;
          if (!PatchProxy.applyVoid(objArray, obj, this, "25")) {
          label_0050 :
             a.p(obj1, str);
             a.p(obj2, str1);
             a.p(obj3, str2);
             String str3 = "";
             if (PatchProxy.isSupport(this)) {
                Object[] objArray1 = new Object[]{obj1,"",str3,obj2,obj3,null,p3};
                if (!PatchProxy.applyVoid(objArray1, obj, this, "26")) {
                }
             }else {
             }
          }
       }else {
          goto label_0050 ;
       }
       return;
    }
    public abstract LogOption e();
    public final LogOption f(){
       Object obj = PatchProxy.apply(null, this, BizLogger.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public void g(b p0,String p1,String p2){
       LogLevel iNFO;
       BizLogger uBizLogger = this;
       Object obj = p0;
       Object obj1 = p1;
       Object obj2 = p2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, BizLogger.class, "10")) {
          return;
       }
       String str = "biz";
       a.p(obj, str);
       String str1 = "tag";
       a.p(obj1, str1);
       String str2 = "msg";
       a.p(obj2, str2);
       if (!PatchProxy.applyVoidFourRefs(p0, p1, p2, null, this, BizLogger.class, "14")) {
          a.p(obj, str);
          a.p(obj1, str1);
          a.p(obj2, str2);
          BizLogger uBizLogger1 = BizLogger.class;
          if (PatchProxy.isSupport(uBizLogger1)) {
             Object[] objArray = new Object[]{obj,"","",obj1,obj2,null};
             if (!PatchProxy.applyVoid(objArray, this, uBizLogger1, "15")) {
             }
          }else {
          }
       }
    label_008f :
       return;
    }
    public final void h(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BizLogger.class, "29")) {
          return;
       }
       SystemUtil.I();
       return;
    }
}

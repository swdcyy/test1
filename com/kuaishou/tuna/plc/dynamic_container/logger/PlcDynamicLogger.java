package com.kuaishou.tuna.plc.dynamic_container.logger.PlcDynamicLogger;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.lang.Thread;
import com.kuaishou.tuna.plc.dynamic_container.logger.PlcDynamicLogger$a;
import java.lang.Runnable;
import t45.c;
import java.lang.Boolean;
import com.kuaishou.tuna_logger.KsLogTunaCodDynamicLogTag;
import java.util.List;
import com.kuaishou.tuna.plc.dynamic_container.logger.PlcDynamicLogger$log$2;
import msd.a;
import c15.b;
import com.kuaishou.tuna.plc.dynamic_container.logger.PlcDynamicLogger$log$3;
import com.kuaishou.tuna.plc.dynamic_container.logger.PlcDynamicLogger$b;
import java.lang.Throwable;
import com.kuaishou.tuna.plc.dynamic_container.logger.PlcDynamicLogger$loge$2;
import com.kuaishou.tuna.plc.dynamic_container.logger.PlcDynamicLogger$loge$3;
import com.kuaishou.tuna.plc.dynamic_container.exception.PlcDynamicException;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class PlcDynamicLogger	// class@000fe9
{
    public static final PlcDynamicLogger a;

    static {
       PlcDynamicLogger.a = new PlcDynamicLogger();
    }
    public void PlcDynamicLogger(){
       super();
    }
    public static final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, PlcDynamicLogger.class, "5")) {
          return;
       }
       a.p(p0, "msg");
       PlcDynamicLogger.d("PlcDynamicDebug", p0, true);
       return;
    }
    public static final void b(Object p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, PlcDynamicLogger.class, "3")) {
          return;
       }
       a.p(p1, "msg");
       Thread thread = Thread.currentThread();
       a.o(thread, "Thread.currentThread\(\)");
       thread = Thread.currentThread();
       a.o(thread, "Thread.currentThread\(\)");
       c.a(new PlcDynamicLogger$a(p0, thread.getId()+'_'+thread.getName(), p1));
       return;
    }
    public static final void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, PlcDynamicLogger.class, "6")) {
          return;
       }
       a.p(p0, "msg");
       PlcDynamicLogger.e("PlcDynamicLogger", p0, false, 4, null);
       return;
    }
    public static final void d(String p0,String p1,boolean p2){
       KsLogTunaCodDynamicLogTag dYNAMIC;
       KsLogTunaCodDynamicLogTag ksLogTunaCod;
       if (PatchProxy.isSupport(PlcDynamicLogger.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, PlcDynamicLogger.class, "4")) {
          return;
       }
       if (p2) {
          dYNAMIC = KsLogTunaCodDynamicLogTag.DYNAMIC;
          dYNAMIC.appendTag(p0);
          ksLogTunaCod = dYNAMIC;
          b.b(ksLogTunaCod, new PlcDynamicLogger$log$2(p1));
       }else {
          dYNAMIC = KsLogTunaCodDynamicLogTag.DYNAMIC;
          dYNAMIC.appendTag(p0);
          ksLogTunaCod = dYNAMIC;
          b.f(ksLogTunaCod, new PlcDynamicLogger$log$3(p1));
       }
       return;
    }
    public static void e(String p0,String p1,boolean p2,int p3,Object p4){
       if (p3 & 0x04) {
          p2 = false;
       }
       PlcDynamicLogger.d(p0, p1, p2);
       return;
    }
    public static final void f(Object p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, PlcDynamicLogger.class, "9")) {
          return;
       }
       a.p(p1, "msg");
       Thread thread = Thread.currentThread();
       a.o(thread, "Thread.currentThread\(\)");
       thread = Thread.currentThread();
       a.o(thread, "Thread.currentThread\(\)");
       c.a(new PlcDynamicLogger$b(p0, thread.getId()+'_'+thread.getName(), p1));
       return;
    }
    public static final void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, PlcDynamicLogger.class, "8")) {
          return;
       }
       a.p(p0, "msg");
       PlcDynamicLogger.h("PlcDynamicLogger", p0, null);
       return;
    }
    public static final void h(String p0,String p1,Throwable p2){
       KsLogTunaCodDynamicLogTag ksLogTunaCod;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, PlcDynamicLogger.class, "11")) {
          return;
       }
       if (p2 != null) {
          KsLogTunaCodDynamicLogTag dYNAMIC = KsLogTunaCodDynamicLogTag.DYNAMIC;
          dYNAMIC.appendTag(p0);
          ksLogTunaCod = dYNAMIC;
          b.e(ksLogTunaCod, new PlcDynamicLogger$loge$2(p1), p2);
       }else {
          KsLogTunaCodDynamicLogTag dYNAMIC1 = KsLogTunaCodDynamicLogTag.DYNAMIC;
          dYNAMIC1.appendTag(p0);
          ksLogTunaCod = dYNAMIC1;
          b.d(ksLogTunaCod, new PlcDynamicLogger$loge$3(p1));
       }
       return;
    }
    public static final void i(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, PlcDynamicLogger.class, "10")) {
          return;
       }
       a.p(p0, "msg");
       PlcDynamicLogger.h("PlcDynamicLogger", p0, p1);
       return;
    }
    public static final void j(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, PlcDynamicLogger.class, "1")) {
          return;
       }
       a.p(p0, "message");
       PlcDynamicLogger.i(p0, p1);
       if (p1 != null) {
          ExceptionHandler.handleCaughtException(new PlcDynamicException(p0, p1));
       }else {
          ExceptionHandler.handleCaughtException(new PlcDynamicException(p0));
       }
       return;
    }
    public static void k(String p0,Throwable p1,int p2,Object p3){
       PlcDynamicLogger.j(p0, null);
    }
}

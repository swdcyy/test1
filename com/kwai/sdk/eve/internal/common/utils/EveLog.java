package com.kwai.sdk.eve.internal.common.utils.EveLog;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.BlockingQueue;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import sm7.j;
import com.yxcorp.utility.Log;
import java.lang.Throwable;
import java.lang.StringBuilder;
import wm7.a;
import java.lang.reflect.Method;
import com.kwai.robust.PatchProxyResult;
import java.lang.Thread;
import msd.a;
import com.kwai.sdk.eve.internal.common.utils.EveLog$a;
import java.lang.Runnable;
import sm7.e;
import cn.vimfung.luascriptcore.LuaNativeUtil;
import com.kwai.sdk.eve.internal.statistics.EveLogger;

public final class EveLog	// class@0014a3
{
    public static final EveLog INSTANCE;
    public static final ThreadPoolExecutor executors;
    public static boolean mEnable;
    public static j outLogPrinter;

    static {
       EveLog.INSTANCE = new EveLog();
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(1, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue());
       EveLog.executors = v0;
    }
    public void EveLog(){
       super();
    }
    public static final void d(String p0,boolean p1){
       EveLog uEveLog = EveLog.class;
       if (PatchProxy.isSupport(uEveLog) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uEveLog, "4")) {
          return;
       }
       a.p(p0, "msg");
       if (EveLog.mEnable) {
          j outLogPrinte = EveLog.outLogPrinter;
          if (outLogPrinte != null) {
             outLogPrinte.log(3, "EveLog", EveLog.INSTANCE.formatMessage(p0, p1));
          }else {
             Log.b("EveLog", EveLog.INSTANCE.formatMessage(p0, p1));
          }
       }
       return;
    }
    public static void d$default(String p0,boolean p1,int p2,Object p3){
       if (p2 & 0x02) {
          p1 = true;
       }
       EveLog.d(p0, p1);
       return;
    }
    public static final void e(String p0,Throwable p1,boolean p2){
       if (PatchProxy.isSupport(EveLog.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, EveLog.class, "9")) {
          return;
       }
       a.p(p0, "msg");
       a.p(p1, "t");
       if (EveLog.mEnable) {
          j outLogPrinte = EveLog.outLogPrinter;
          outLogPrinte.log(6, "EveLog", EveLog.INSTANCE.formatMessage(p0+" catch Throwable = (outLogPrinte != null)? "+p1, p2)): "+p1, p2), p1);
       }
    label_0068 :
       return;
    }
    public static final void e(String p0,boolean p1){
       EveLog uEveLog = EveLog.class;
       if (PatchProxy.isSupport(uEveLog) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uEveLog, "8")) {
          return;
       }
       a.p(p0, "msg");
       if (EveLog.mEnable) {
          j outLogPrinte = EveLog.outLogPrinter;
          if (outLogPrinte != null) {
             outLogPrinte.log(6, "EveLog", EveLog.INSTANCE.formatMessage(p0, p1));
          }else {
             Log.d("EveLog", EveLog.INSTANCE.formatMessage(p0, p1));
          }
       }
       return;
    }
    public static void e$default(String p0,Throwable p1,boolean p2,int p3,Object p4){
       if (p3 & 0x04) {
          p2 = true;
       }
       EveLog.e(p0, p1, p2);
       return;
    }
    public static void e$default(String p0,boolean p1,int p2,Object p3){
       if (p2 & 0x02) {
          p1 = true;
       }
       EveLog.e(p0, p1);
       return;
    }
    public static final void i(String p0,boolean p1){
       a.p(p0, "msg");
       if (EveLog.mEnable) {
          j outLogPrinte = EveLog.outLogPrinter;
          if (outLogPrinte != null) {
             outLogPrinte.log(4, "EveLog", EveLog.INSTANCE.formatMessage(p0, p1));
          }else {
             Log.g("EveLog", EveLog.INSTANCE.formatMessage(p0, p1));
          }
       }
       return;
    }
    public static void i$default(String p0,boolean p1,int p2,Object p3){
       if (p2 & 0x02) {
          p1 = true;
       }
       EveLog.i(p0, p1);
       return;
    }
    public static final void v(String p0,boolean p1){
       EveLog uEveLog = EveLog.class;
       if (PatchProxy.isSupport(uEveLog) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uEveLog, "3")) {
          return;
       }
       a.p(p0, "msg");
       if (EveLog.mEnable) {
          j outLogPrinte = EveLog.outLogPrinter;
          if (outLogPrinte != null) {
             outLogPrinte.log(2, "EveLog", EveLog.INSTANCE.formatMessage(p0, p1));
          }else {
             Log.l("EveLog", EveLog.INSTANCE.formatMessage(p0, p1));
          }
       }
       return;
    }
    public static void v$default(String p0,boolean p1,int p2,Object p3){
       if (p2 & 0x02) {
          p1 = true;
       }
       EveLog.v(p0, p1);
       return;
    }
    public static final void vscode(String p0,boolean p1){
       EveLog uEveLog = EveLog.class;
       String str = "5";
       if (PatchProxy.isSupport(uEveLog) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uEveLog, str)) {
          return;
       }
       a.p(p0, "msg");
       if (!PatchProxy.applyVoidOneRefs(p0, null, a.class, str)) {
          a.p(p0, "message");
          Class b = a.b;
          if (b != null) {
             Class[] uClassArray = new Class[]{String.class};
             Object[] objArray = new Object[]{"[DebugLog]:"+p0};
             b.getMethod("sendMessageToVSCode", uClassArray).invoke(b, objArray);
          }
       }
       return;
    }
    public static void vscode$default(String p0,boolean p1,int p2,Object p3){
       if (p2 & 0x02) {
          p1 = true;
       }
       EveLog.vscode(p0, p1);
       return;
    }
    public static final void w(String p0,boolean p1){
       EveLog uEveLog = EveLog.class;
       if (PatchProxy.isSupport(uEveLog) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uEveLog, "7")) {
          return;
       }
       a.p(p0, "msg");
       if (EveLog.mEnable) {
          j outLogPrinte = EveLog.outLogPrinter;
          if (outLogPrinte != null) {
             outLogPrinte.log(5, "EveLog", EveLog.INSTANCE.formatMessage(p0, p1));
          }else {
             Log.n("EveLog", EveLog.INSTANCE.formatMessage(p0, p1));
          }
       }
       return;
    }
    public static void w$default(String p0,boolean p1,int p2,Object p3){
       if (p2 & 0x02) {
          p1 = true;
       }
       EveLog.w(p0, p1);
       return;
    }
    public final String formatMessage(String p0,boolean p1){
       Thread obj;
       EveLog uEveLog = EveLog.class;
       if (PatchProxy.isSupport(uEveLog)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uEveLog, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1) {
          obj = Thread.currentThread();
          a.o(obj, "Thread.currentThread\(\)");
          p0 = "Thread["+obj.getName()+"] --> "+p0;
       }else {
          p0 = "--> "+p0;
       }
       return p0;
    }
    public final void i(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveLog.class, "6")) {
          return;
       }
       a.p(p0, "msgBuilder");
       EveLog.executors.execute(new EveLog$a(p0));
       return;
    }
    public final void init$eve_core_release(boolean p0,j p1){
       EveLog.mEnable = p0;
       EveLog.outLogPrinter = p1;
    }
    public final void initNativeLog$eve_core_release(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveLog.class, "1")) {
          return;
       }
       a.p(p0, "config");
       EveLog.i$default("nativeLogConfig: "+p0, false, 2, null);
       LuaNativeUtil.setLogStatus(p0.enableLogI, p0.enableLogW, p0.enableLogE);
       return;
    }
}

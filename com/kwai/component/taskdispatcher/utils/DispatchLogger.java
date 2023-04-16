package com.kwai.component.taskdispatcher.utils.DispatchLogger;
import f66.i;
import com.kwai.component.taskdispatcher.utils.DispatchLogger$enableDispatchDebugLog$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.util.Arrays;
import q87.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.utility.SystemUtil;
import xf6.d;
import xf6.l;
import java.lang.Throwable;

public final class DispatchLogger extends i	// class@000bbe
{
    public static final p c;
    public static final DispatchLogger d;

    static {
       DispatchLogger.d = new DispatchLogger();
       DispatchLogger.c = s.c(DispatchLogger$enableDispatchDebugLog$2.INSTANCE);
    }
    public void DispatchLogger(){
       super("task_dispatcher", false);
    }
    public static final void D(String p0,String p1){
       Object[] objArray;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, DispatchLogger.class, "4")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "content");
       DispatchLogger d = DispatchLogger.d;
       if (d.C()) {
          objArray = new Object[0];
          d.w(p0, p1, objArray);
       }else {
          objArray = new Object[0];
          d.s(p0, p1, objArray);
       }
       return;
    }
    public void A(String p0,String p1,Object[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, DispatchLogger.class, "14")) {
          return;
       }
       a.p(p0, "secondTag");
       a.p(p1, "content");
       a.p(p2, "args");
       super.A("taskDispatcher_"+p0, p1, Arrays.copyOf(p2, p2.length));
       return;
    }
    public final boolean C(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DispatchLogger uDispatchLog = DispatchLogger.class;
       Object obj = PatchProxy.apply(null, this, uDispatchLog, "7");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (!SystemUtil.K()) {
          Boolean uBoolean = PatchProxy.apply(null, this, uDispatchLog, "1");
          if (uBoolean == patchProxyRe) {
             uBoolean = DispatchLogger.c.getValue();
          }
          if (!uBoolean.booleanValue()) {
             b = false;
          label_0035 :
             return b;
          }
       }
       b = true;
       goto label_0035 ;
    }
    public final void E(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DispatchLogger.class, "5")) {
          return;
       }
       a.p(p0, "TAG");
       a.p(p1, "content");
       if (l.c("KEY_ENABLE_ALL_DISPACTH_LOG", false) || this.C()) {
          Object[] objArray = new Object[false];
          this.w(p0, p1, objArray);
       }
       return;
    }
    public void e(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, DispatchLogger.class, "17")) {
          return;
       }
       a.p(p0, "secondTag");
       a.p(p1, "content");
       a.p(p2, "throwable");
       super.e("taskDispatcher_"+p0, p1, p2);
       return;
    }
    public final void h(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DispatchLogger.class, "3")) {
          return;
       }
       a.p(p0, "TAG");
       a.p(p1, "content");
       Object[] objArray = new Object[0];
       this.t(p0, p1, objArray);
       return;
    }
    public final void j(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DispatchLogger.class, "2")) {
          return;
       }
       a.p(p0, "TAG");
       a.p(p1, "content");
       Object[] objArray = new Object[0];
       this.w(p0, p1, objArray);
       return;
    }
    public void r(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, DispatchLogger.class, "11")) {
          return;
       }
       a.p(p0, "secondTag");
       a.p(p1, "content");
       a.p(p2, "throwable");
       super.r("taskDispatcher_"+p0, p1, p2);
       return;
    }
    public void s(String p0,String p1,Object[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, DispatchLogger.class, "10")) {
          return;
       }
       a.p(p0, "secondTag");
       a.p(p1, "content");
       a.p(p2, "args");
       super.s("taskDispatcher_"+p0, p1, Arrays.copyOf(p2, p2.length));
       return;
    }
    public void t(String p0,String p1,Object[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, DispatchLogger.class, "16")) {
          return;
       }
       a.p(p0, "secondTag");
       a.p(p1, "content");
       a.p(p2, "args");
       super.t("taskDispatcher_"+p0, p1, Arrays.copyOf(p2, p2.length));
       return;
    }
    public void u(String p0,Throwable p1,Object[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, DispatchLogger.class, "18")) {
          return;
       }
       a.p(p0, "secondTag");
       a.p(p1, "throwable");
       a.p(p2, "arguments");
       super.u("taskDispatcher_"+p0, p1, Arrays.copyOf(p2, p2.length));
       return;
    }
    public void w(String p0,String p1,Object[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, DispatchLogger.class, "12")) {
          return;
       }
       a.p(p0, "secondTag");
       a.p(p1, "content");
       a.p(p2, "args");
       super.w("taskDispatcher_"+p0, p1, Arrays.copyOf(p2, p2.length));
       return;
    }
    public void y(String p0,String p1,Object[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, DispatchLogger.class, "8")) {
          return;
       }
       a.p(p0, "secondTag");
       a.p(p1, "content");
       a.p(p2, "args");
       super.y("taskDispatcher_"+p0, p1, Arrays.copyOf(p2, p2.length));
       return;
    }
}

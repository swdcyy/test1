package com.kwai.framework.initmodule.c;
import erd.g;
import com.kwai.framework.initmodule.RxJavaErrorHandlerInitModule;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import e66.c;
import java.lang.String;
import q87.c;
import com.google.common.base.b;
import ok.n;
import java.util.ArrayList;
import java.lang.IllegalArgumentException;
import java.util.List;
import java.util.Collections;
import io.reactivex.exceptions.UndeliverableException;
import com.google.common.base.Predicates$InstanceOfPredicate;
import java.lang.Class;
import com.google.common.base.Predicates$a;
import java.lang.Iterable;
import ok.o;
import qk.y;
import o56.c;
import com.yxcorp.utility.SystemUtil;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import ekd.e0;
import xf6.l;
import d76.q;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.robust.PatchProxy;
import java.lang.AssertionError;

public final class c implements g	// class@000b77
{
    public final RxJavaErrorHandlerInitModule b;

    public void c(RxJavaErrorHandlerInitModule p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       int i1;
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (!ExceptionHandler.handleException(a.b(), p0)) {
          int i = 0;
          Object[] objArray = new Object[i];
          c.C().u("rx_error", p0, objArray);
          try{
             i1 = 0;
             n.j(p0);
             ArrayList uArrayList = new ArrayList(4);
             uArrayList.add(p0);
             Throwable throwable = p0;
             Throwable throwable1 = throwable;
             int i2 = 0;
             while (true) {
                throwable = throwable.getCause();
                if (throwable != null) {
                   uArrayList.add(throwable);
                   if (throwable != throwable1) {
                      if (i2) {
                         throwable1 = throwable1.getCause();
                      }
                      i2 = i2 ^ 0x01;
                   }else {
                      throw new IllegalArgumentException("Loop in causal chain detected.", throwable);
                   }
                }else {
                   List list = Collections.unmodifiableList(uArrayList);
                   n.j(list);
                   n.j(UndeliverableException.class);
                   boolean b = (y.r(y.h(list, new Predicates$InstanceOfPredicate(UndeliverableException.class, i1))) > 0)? true: false;
                   if (!b) {
                      Throwable throwable2 = y.l(list, i1);
                   }
                }
             }
          }catch(java.lang.IllegalArgumentException e0){
          }
          if (a.a().c() && !SystemUtil.P()) {
             Activity uActivity = ActivityContext.g().e();
             if (e0.a || uActivity == null) {
                if (!PatchProxy.applyVoidOneRefs(p0, e0, RxJavaErrorHandlerInitModule.class, "2")) {
                   throw new AssertionError("这里不是崩溃的原因，代码执行到这里说明这个错误没有人处理。请找到崩溃栈最下方的Root cause定位原因。有时候经过线程切换Root cause不一定能直接定位到现场，还需要根据其他信息判断哪个业务出问题了\(例如从发生页面、网络请求、所在进程、logcat等找信息）: ", p0);
                }
             }else if(!l.c("enable_exception_enable_dialog", i)){
                k1.o(new q(uActivity, i1));
             }
             if (l.c("enable_exception_report_to_keep", i)) {
                ExceptionHandler.handleCaughtException(p0);
             }
          }else {
             ExceptionHandler.handleCaughtException(p0);
          }
       }
       return;
    }
}

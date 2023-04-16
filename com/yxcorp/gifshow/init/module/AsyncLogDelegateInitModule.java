package com.yxcorp.gifshow.init.module.AsyncLogDelegateInitModule;
import com.kwai.framework.init.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import c76.b;
import java.util.List;
import com.kwai.framework.switchs.SwitchConfigInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.gifshow.init.module.c;
import t45.c;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import com.yxcorp.gifshow.init.module.a;
import com.kwai.sdk.switchconfig.a;
import am8.b;
import com.yxcorp.gifshow.init.module.b;
import em8.a;
import android.app.Application;
import o56.a;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.Lifecycle;
import com.yxcorp.gifshow.init.module.AsyncLogDelegateInitModule$1;
import androidx.lifecycle.LifecycleObserver;

public class AsyncLogDelegateInitModule extends a	// class@001963
{
    public static final int q;

    public void AsyncLogDelegateInitModule(){
       super();
    }
    public boolean H7(){
       Object obj = PatchProxy.applyWithListener(null, this, AsyncLogDelegateInitModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PatchProxy.onMethodExit(AsyncLogDelegateInitModule.class, "2");
       return (b.b() ^ 0x01);
    }
    public int f0(){
       return 19;
    }
    public List g(){
       Class[] obj = PatchProxy.applyWithListener(null, this, AsyncLogDelegateInitModule.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{SwitchConfigInitModule.class};
       PatchProxy.onMethodExit(AsyncLogDelegateInitModule.class, "3");
       return Lists.e(obj);
    }
    public void n(){
       c a;
       if (PatchProxy.applyVoidWithListener(null, this, AsyncLogDelegateInitModule.class, "1")) {
          return;
       }
       boolean b = true;
       if (SystemUtil.I() || SystemUtil.P()) {
          a = c.a;
          c.b().b.setRejectedExecutionHandler(a);
          c.b().c.setRejectedExecutionHandler(a);
          c.l = b;
          c.b().e = a.a;
       }
       c.i = a.t().d("async_enable_elastic", b);
       c.j = a.t().d("enable_elastic_fixed_thread_pool", false);
       boolean b1 = a.t().d("enable_elastic_normal_log", false);
       b.c = b1;
       b.d = a.t().d("enable_elastic_warning_log", b);
       b.f = a.t().d("enable_elastic_stacktrace", false);
       b = a.t().d("enable_elastic_dredge_log", false);
       _monitor_enter(a.class);
       a.a = b.a;
       _monitor_exit(a.class);
       if (b1 && SystemUtil.L(a.b())) {
          ProcessLifecycleOwner.get().getLifecycle().addObserver(new AsyncLogDelegateInitModule$1(this, b));
       }
       PatchProxy.onMethodExit(AsyncLogDelegateInitModule.class, "1");
       return;
    }
}

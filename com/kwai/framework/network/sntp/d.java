package com.kwai.framework.network.sntp.d;
import com.kwai.framework.network.sntp.a;
import java.util.Random;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Collections;
import t45.e;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import hkd.b;
import java.util.concurrent.ThreadPoolExecutor$DiscardOldestPolicy;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.RejectedExecutionHandler;
import yb6.c;
import com.kwai.framework.network.sntp.c;
import javax.inject.Provider;
import tpd.a;
import upd.a;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import com.kwai.framework.network.sntp.a$a;
import com.kwai.framework.network.sntp.b;
import java.lang.Runnable;
import java.util.concurrent.ExecutorService;

public class d implements a	// class@000c54
{
    public final c a;
    public final a b;
    public static final List c;
    public static final Random d;
    public static final ExecutorService e;

    static {
       d.d = new Random();
       String[] stringArray = new String[]{"ntp.nc.gifshow.com","ntp.en.gifshow.com"};
       ArrayList uArrayList = Lists.e(stringArray);
       Collections.shuffle(uArrayList);
       d.c = uArrayList;
       e uoe = new e(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(3), new b("http-sntp-client"), new ThreadPoolExecutor$DiscardOldestPolicy());
       d.e = uArrayList;
    }
    public void d(){
       super();
       this.a = new c();
       this.b = a.a(c.a);
    }
    public Long a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, this, d.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a;
       _monitor_enter(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, c.class, "2");
       if (obj1 != patchProxyRe) {
          objArray = obj1;
          _monitor_exit(obj);
       }else {
          c b = obj.b;
          if (!b - null) {
             _monitor_exit(obj);
          }else {
             objArray = Long.valueOf((b + (SystemClock.elapsedRealtime() - obj.c)));
             _monitor_exit(obj);
          }
       }
       return objArray;
    }
    public Long b(){
       d obj = PatchProxy.apply(null, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       _monitor_enter(obj);
       _monitor_exit(obj);
       return obj.a;
    }
    public void c(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       d.e.execute(new b(this, p0));
       return;
    }
}

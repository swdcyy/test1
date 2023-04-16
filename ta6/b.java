package ta6.b;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.logger.uploader.DebugLoggerInterceptor;
import okhttp3.Interceptor;
import com.kwai.social.config.utils.HoldoutConfigUtilKt;
import lt7.a;
import ta6.j;
import d89.k;
import d89.g;
import java.lang.Runnable;
import t45.c;
import d89.q;
import d89.m;
import ljd.b;
import com.yxcorp.gifshow.apm.OnlineSystraceInterceptor;
import com.yxcorp.gifshow.apm.PerfLaunchHttpLogInterceptor;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.gifshow.growth.test.network.GrowthTestPathRouterInterceptor;
import psb.r;
import psb.q;
import com.yxcorp.login.logger.AccountLoggerInterceptor;
import com.yxcorp.login.userlogin.pluginimpl.LoginPluginImpl;
import com.yxcorp.login.userlogin.pluginimpl.d;
import ia0.h;
import com.yxcorp.login.userlogin.pluginimpl.g;
import com.yxcorp.login.userlogin.pluginimpl.f;
import com.yxcorp.login.userlogin.pluginimpl.h;
import b3d.o0;
import com.yxcorp.login.util.q;
import ok.n;
import java.util.List;
import java.lang.Integer;
import java.util.Map;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;

public class b	// class@002489
{
    public static final List a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final Map f;

    static {
       q a;
       b.a = new CopyOnWriteArrayList();
       b.b = new CopyOnWriteArrayList();
       b.c = new CopyOnWriteArrayList();
       CopyOnWriteArrayList uCopyOnWrite = new CopyOnWriteArrayList();
       b.d = uCopyOnWrite;
       b.e = new CopyOnWriteArrayList();
       b.f = new ConcurrentHashMap();
       b uob = b.class;
       String str = "1";
       if (PatchProxy.applyVoid(null, null, uob, str)) {
       }else if(PatchProxy.applyVoid(null, null, DebugLoggerInterceptor.class, str)){
          b.b(new DebugLoggerInterceptor());
       }
       if (!PatchProxy.applyVoid(null, null, HoldoutConfigUtilKt.class, "2")) {
          b.e(a.a);
       }
       if (!PatchProxy.applyVoid(null, null, k.class, str)) {
          c.a(g.b);
       }
       if (!PatchProxy.applyVoid(null, null, q.class, str)) {
          b.c(m.a);
       }
       if (!PatchProxy.applyVoid(null, null, OnlineSystraceInterceptor.class, str)) {
          b.b(OnlineSystraceInterceptor.a());
       }
       if (!PatchProxy.applyVoid(null, null, PerfLaunchHttpLogInterceptor.class, str) && SystemUtil.P()) {
          b.b(new PerfLaunchHttpLogInterceptor());
       }
       if (!PatchProxy.applyVoid(null, null, GrowthTestPathRouterInterceptor.class, "3")) {
          b.b(new GrowthTestPathRouterInterceptor());
       }
       if (!PatchProxy.applyVoid(null, null, r.class, str)) {
          b.e(q.a);
       }
       if (!PatchProxy.applyVoid(null, null, AccountLoggerInterceptor.class, str)) {
          b.b(new AccountLoggerInterceptor());
       }
       if (!PatchProxy.applyVoid(null, null, LoginPluginImpl.class, str)) {
          b.d(63, d.a);
          b.d(64, g.a);
          b.d(550, f.a);
          b.d(0x4f01, f.a);
          b.c(h.a);
       }
       if (!PatchProxy.applyVoid(null, null, o0.class, str)) {
          a = q.a;
          if (!PatchProxy.applyVoidOneRefs(a, null, uob, "4")) {
             n.j(a);
             uCopyOnWrite.add(a);
          }
       }
    }
    public void b(){
       super();
    }
    public static List a(){
       return b.c;
    }
    public static void b(Interceptor p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "5")) {
          return;
       }
       n.j(p0);
       b.a.add(p0);
       return;
    }
    public static void c(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "6")) {
          return;
       }
       n.j(p0);
       b.e.add(p0);
       return;
    }
    public static void d(int p0,h p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, uob, "7")) {
          return;
       }
       Map f = b.f;
       if (f.containsKey(Integer.valueOf(p0))) {
          throw new IllegalStateException("Multiple result code processor for code: "+p0+"is not allowed.");
       }
       f.put(Integer.valueOf(p0), p1);
       return;
    }
    public static void e(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "3")) {
          return;
       }
       n.j(p0);
       b.c.add(p0);
       return;
    }
}

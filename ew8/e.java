package ew8.e;
import java.lang.Object;
import gda.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.k1;
import ew8.c;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import erd.g;
import io.reactivex.internal.functions.Functions;
import ew8.b;
import crd.b;
import wkd.b;
import ew8.k;
import com.yxcorp.gifshow.action.model.RealActionSignalFeed;
import java.lang.Throwable;
import yv8.b;
import com.yxcorp.gifshow.events.realaction.RealActionUserSignal;
import com.kwai.robust.PatchProxyResult;
import gda.b;
import com.yxcorp.gifshow.action.model.RealActionBaseFeed;
import ew8.d;
import ew8.o;
import com.kwai.sdk.switchconfig.a;
import ew8.e$a;
import java.lang.reflect.Type;
import el.a;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.yxcorp.gifshow.action.startup.UserSignalRealActionsBizConfig;
import java.util.concurrent.ConcurrentHashMap;
import com.yxcorp.gifshow.action.config.UserSignalRealActionsPageConfig;
import com.yxcorp.gifshow.action.startup.FeedRealActionsPageBaseConfig;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Map;

public class e	// class@00223e
{

    public void e(){
       super();
    }
    public static void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, e.class, "4")) {
          return;
       }
       if (k1.g()) {
          t.fromCallable(new c(p0)).subscribeOn(d.c).subscribe(Functions.d(), b.b);
       }else {
          int i = -1842212552;
          try{
             b.a(i).b(e.c(p0));
          }catch(java.lang.Exception e3){
             b.a("RealActionSignalHelper", "addRealAction", e3);
          }
       }
    }
    public static void b(RealActionUserSignal p0){
       Object obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, e.class, "3")) {
          return;
       }
       c uoc = PatchProxy.apply(obj, obj, c.class, "1");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = new c();
          uoc.a = new b();
       }
       uoc.a(p0);
       e.a(uoc);
       return;
    }
    public static RealActionSignalFeed c(c p0){
       RealActionSignalFeed obj = PatchProxy.applyOneRefs(p0, null, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new RealActionSignalFeed();
       if (p0.b() != null) {
          obj.mPage = p0.b().a;
          obj.mSource = p0.b().b;
          obj.mTimestamp = p0.b().c;
       }
       if (p0.c() != null) {
          obj.mActionUserSignal = p0.c();
          obj.mActionTypeStr = p0.c().mSignalType;
          obj.mIsOverAllEventType = p0.c().mIsOverAllEventType;
       }
       return obj;
    }
    public static synchronized void d(){
       _monitor_enter(e.class);
       if (PatchProxy.applyVoid(null, null, e.class, "6")) {
          _monitor_exit(e.class);
          return;
       }else if(k1.g()){
          t.fromCallable(d.b).subscribeOn(d.c).subscribe(o.a, o.c);
       }else {
          e.e();
       }
       _monitor_exit(e.class);
       return;
    }
    public static void e(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, e.class, "7")) {
          return;
       }
       List value = a.t().getValue("userSignalConfig", new e$a().getType(), objArray);
       if (!q.f(value)) {
          b.c("RealActionSignalHelper", "updateRealActionBizConfig", "config", String.valueOf(value.size()));
          k ok = b.a(-1842212552);
          Iterator iterator = value.iterator();
          while (iterator.hasNext()) {
             UserSignalRealActionsBizConfig userSignalRe = iterator.next();
             if (!ok.c(userSignalRe.mKey)) {
                ConcurrentHashMap uConcurrentH = new ConcurrentHashMap();
                if (!q.f(userSignalRe.mSignalConfigs)) {
                   Iterator iterator1 = userSignalRe.mSignalConfigs.iterator();
                   while (iterator1.hasNext()) {
                      UserSignalRealActionsPageConfig userSignalRe1 = iterator1.next();
                      if (!TextUtils.x(userSignalRe1.mPage)) {
                         uConcurrentH.put(userSignalRe1.mPage, userSignalRe1);
                      }else {
                         continue ;
                      }
                   }
                }
                userSignalRe.setRealActionConfigMap(uConcurrentH);
                UserSignalRealActionsBizConfig mKey = userSignalRe.mKey;
                if (!PatchProxy.applyVoidTwoRefs(mKey, userSignalRe, ok, k.class, "2") && !ok.c(mKey)) {
                   ok.a.put(mKey, userSignalRe);
                }
             }
          }
       }
       return;
    }
}

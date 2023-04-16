package b86.b;
import b86.f;
import java.util.concurrent.ConcurrentHashMap;
import b86.b$a;
import android.os.Handler;
import java.lang.Runnable;
import java.lang.String;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.Triple;
import b86.i;
import java.lang.Number;
import r76.a;
import z76.a;
import b86.g;
import java.lang.Long;
import q76.a;
import java.lang.Integer;
import s76.a;
import z76.b;
import java.util.Map;
import u76.a;
import java.util.Objects;
import u76.a$a;
import com.kwai.framework.kgi.sdk.internal.config.KgiChannelConfigItem;
import com.kwai.framework.kgi.sdk.internal.config.KgiConfig;
import y76.c;
import b86.d;
import b86.c;
import b86.h;
import w76.a;
import p76.f$e;
import java.lang.Throwable;
import nsd.u;
import p76.d;
import x76.a;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import p76.f$l;

public final class b extends f	// class@000434
{
    public static final ConcurrentHashMap e;
    public static final ConcurrentHashMap f;
    public static final ConcurrentHashMap g;
    public static final ConcurrentHashMap h;
    public static final b$a i;
    public static final b j;

    static {
       b uob = new b();
       b.j = uob;
       b.e = new ConcurrentHashMap();
       b.f = new ConcurrentHashMap();
       b.g = new ConcurrentHashMap();
       b.h = new ConcurrentHashMap();
       b$a uoa = new b$a();
       b.i = uoa;
       uob.a().postDelayed(uoa, 5000);
    }
    public void b(){
       super("Kgi-thread-control");
    }
    public static final ConcurrentHashMap e(b p0){
       return b.e;
    }
    public void b(Message p0){
       int i;
       a uoa1;
       a$a a;
       boolean b;
       Object obj = this;
       Triple obj1 = p0;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, uob, "1")) {
          return;
       }
       a.p(obj1, "msg");
       Message what = obj1.what;
       Handler obj2 = null;
       if (what != -2) {
          if (what != 5) {
             if (what == 6) {
                obj1 = i.i(p0);
                if (obj1 != null) {
                   i = obj1.component1().intValue();
                   a uoa = obj1.component2();
                   uoa1 = obj1.component3();
                   if (uoa != null) {
                      if (!PatchProxy.applyVoidOneRefs(uoa, obj2, i.class, "8")) {
                         a.p(uoa, "feature");
                         obj2 = g.f;
                         obj2.sendMessage(i.b(obj2, 7, uoa.h(), uoa, null, null, null, null, null, null, 504, null));
                      }
                      uoa.g();
                      if (a.g("trigger_suc", uoa.feedbackType) && (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), uoa1, obj, uob, "2"))) {
                         if (a.d(i) && b.f.containsKey(Integer.valueOf(i))) {
                            b.g.put(Integer.valueOf(i), Long.valueOf(uoa1.a));
                         }
                         ConcurrentHashMap h = b.h;
                         Long longx = h.get(Integer.valueOf(i));
                         if (longx == null) {
                            longx = Long.valueOf(0);
                         }
                         long l = longx.longValue() + 1;
                         h.put(Integer.valueOf(i), Long.valueOf(l));
                         a = a.a;
                         Objects.requireNonNull(a);
                         a$a uoa2 = a$a.class;
                         if (PatchProxy.isSupport(uoa2) && (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Long.valueOf(l), a, uoa2, "4") && l - (long)KgiConfig.a(i).triggerMaxCountEveryLaunch >= 0)) {
                            c.a(i, "NORMAL", "终止通道：业务触发达到频次控制");
                            a.d(i);
                         }
                      }
                   }
                }
                return;
             }
          }else {
             obj1 = i.i(p0);
             if (obj1 != null) {
                int i1 = obj1.component1().intValue();
                uoa1 = obj1.component3();
                if (a.d(i1) && b.e.containsKey(Integer.valueOf(i1))) {
                   uoa1 = uoa1.g;
                   if (uoa1 != null) {
                      b.f.put(Integer.valueOf(i1), Long.valueOf(uoa1.longValue()));
                   }
                }
             }else {
                return;
             }
          }
       }else {
          Triple triple = i.i(p0);
          if (triple != null) {
             i = triple.component1().intValue();
             a uoa3 = triple.component3();
             Message obj3 = obj1.obj;
             if (!a.h(i)) {
                return;
             }else {
                b = g.g(i).c();
                h oh = g.i(i);
                int i2 = 1;
                f$e uoe = (!g.h(i).c() || !oh.b().hasMessages(-1, obj3))? 1: null;
                uoa1 = (!b || !oh.a().hasMessages(-1, obj3))? 1: null;
                if (uoe && uoa1) {
                   a.b.a(new f$e(i, obj2, 2, obj2));
                }
                List list = a.d.a();
                if (!list instanceof Collection || !list.isEmpty()) {
                   Iterator iterator = list.iterator();
                   while (iterator.hasNext()) {
                      if (!a.g(iterator.next().intValue())) {
                         i2 = 0;
                         break ;
                      }
                   }
                }
                if (i2) {
                   a.b.a(new f$l(a.d.a(), obj2, 2, obj2));
                   a.c(false);
                }
             }
          }
       }
    label_01f0 :
       return;
    }
}

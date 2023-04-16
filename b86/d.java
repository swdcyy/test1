package b86.d;
import b86.f;
import nsd.r0;
import java.lang.Object;
import java.lang.Integer;
import java.util.Arrays;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.os.Message;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.Triple;
import b86.i;
import java.lang.Number;
import z76.a;
import s76.a;
import com.kwai.framework.kgi.sdk.internal.feature.KgiDataCenter;
import com.kwai.framework.kgi.sdk.internal.feature.KgiDataCenter$Companion;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.kwai.framework.kgi.sdk.internal.store.b;
import java.lang.StringBuilder;
import y76.b;
import b86.h;
import b86.g;
import android.os.Handler;
import java.lang.Long;
import q76.a;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import b86.d$a;
import java.lang.Runnable;

public final class d extends f	// class@000438
{
    public final int e;

    public void d(int p0){
       Object[] objArray = new Object[]{Integer.valueOf(p0)};
       String str = String.format("Kgi-thread-feature-%s", Arrays.copyOf(objArray, 1));
       a.o(str, "java.lang.String.format\(format, *args\)");
       super(str);
       this.e = p0;
    }
    public void b(Message p0){
       int i;
       a b;
       boolean i2;
       Object obj = this;
       Triple obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, d.class, "1")) {
          return;
       }
       a.p(obj1, "msg");
       Message what = obj1.what;
       i oi = null;
       a uoa = 1;
       if (what != -1) {
          Object[] objArray = null;
          Integer integer = 2;
          if (what != uoa) {
             if (what == integer) {
                obj1 = i.i(p0);
                if (obj1 != null) {
                   i = obj1.component1().intValue();
                   Object obj2 = obj1.component3();
                   if (!a.f(i)) {
                      return;
                   }else {
                      KgiDataCenter kgiDataCente = KgiDataCenter.g.c(i);
                      Objects.requireNonNull(kgiDataCente);
                      ArrayList uArrayList = PatchProxy.apply(objArray, kgiDataCente, KgiDataCenter.class, "3");
                      if (uArrayList != PatchProxyResult.class) {
                      }else {
                         kgiDataCente.b.a(kgiDataCente.a);
                         kgiDataCente.a.c();
                         uArrayList = kgiDataCente.b.d();
                      }
                      b = obj2.b;
                      if (!PatchProxy.isSupport(i.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(i), uArrayList, b, null, i.class, "5")) {
                         a.p(uArrayList, "featureList");
                         Handler handler = g.i(i).a();
                         Message message = i.b(handler, 3, i, uArrayList, b, null, null, null, null, null, 496, null);
                         if (a.f(i)) {
                            handler.sendMessage(message);
                         }
                      }
                   }
                }else {
                   return;
                }
             }
          }else {
             obj1 = i.i(p0);
             if (obj1 != null) {
                i = obj1.component1().intValue();
                uoa = obj1.component2();
                a uoa1 = obj1.component3();
                if (uoa != null) {
                   if (!a.f(i)) {
                      return;
                   }else if(uoa.d(i)){
                      KgiDataCenter.g.c(i).a(uoa);
                   }else {
                      b.b("KgiFeatureThread#handleMessage: MSG_POST_FEATURE "+"the feature is not apply to the channel["+i+"], feature = "+uoa.b(), oi, integer, objArray);
                   }
                }
             }
             return;
          }
       }else {
          Triple triple = i.i(p0);
          if (triple != null) {
             int i1 = triple.component1().intValue();
             a uoa2 = triple.component3();
             if (a.h(i1)) {
                KgiDataCenter.g.c(i1).b();
             }
             List list = g.b(obj.e);
             if (list != null && !list.isEmpty()) {
                Iterator iterator = list.iterator();
                do {
                   if (iterator.hasNext()) {
                      i2 = iterator.next().intValue();
                      i2 = (a.h(i2) || a.g(i2))? true: false;
                   }
                } while (!i2);
                if (oi != null) {
                   this.a().post(new d$a(obj));
                }
                i.c(i1, obj1.obj);
             }
             oi = 1;
             goto label_0184 ;
          }
       }
       return;
    }
}

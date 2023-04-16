package b86.c;
import b86.f;
import nsd.r0;
import java.lang.Object;
import java.lang.Integer;
import java.util.Arrays;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.os.Message;
import com.kwai.framework.kgi.sdk.internal.config.KgiConfig;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.Triple;
import b86.i;
import java.lang.Number;
import p76.a;
import z76.a;
import w76.a;
import p76.d;
import p76.g;
import java.util.ArrayList;
import s76.a;
import o76.c;
import o76.c$a;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import q76.a;
import java.util.Collection;
import java.util.Objects;
import com.kwai.framework.kgi.sdk.internal.config.KgiConfigItem;
import o76.d;
import o76.d$a;
import yb6.d;
import java.lang.StringBuilder;
import y76.b;
import v76.a;
import java.util.List;
import com.kwai.sdk.edge.KwaiInstantSimpleEngineException;
import java.lang.Throwable;
import java.lang.CharSequence;
import zsd.u;
import u76.a;
import u76.a$a;
import java.lang.Long;
import y76.f;
import y76.c;
import w76.e;
import nsd.u;
import b86.g;
import android.os.Handler;
import b86.c$a;
import java.lang.Runnable;

public final class c extends f	// class@000436
{
    public final int e;

    public void c(int p0){
       Object[] objArray = new Object[]{Integer.valueOf(p0)};
       String str = String.format("Kgi-thread-engine-%s", Arrays.copyOf(objArray, 1));
       a.o(str, "java.lang.String.format\(format, *args\)");
       super(str);
       this.e = p0;
    }
    public void b(Message p0){
       a uoa;
       a uoa1;
       int i;
       KgiConfig g;
       String str2;
       Object obj4;
       a$a a;
       d d;
       String str5;
       Object obj = this;
       Triple obj1 = p0;
       String str = "KgiEngineThread#handleMessage : MSG_CALL_ENGINE ===> call KgiEngine.inference :";
       KgiConfig kgiConfig = KgiConfig.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str1 = "1";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, c.class, str1)) {
          return;
       }
       a.p(obj1, "msg");
       Message what = obj1.what;
       if (what != -1) {
          if (what != 3) {
             if (what == 4) {
                obj1 = i.i(p0);
                if (obj1 != null) {
                   obj1.component1().intValue();
                   uoa = obj1.component2();
                   uoa1 = obj1.component3();
                   if (uoa != null) {
                      a.b.a(uoa);
                      i.e(uoa.b, uoa1);
                   }
                }
                return;
             }
          }else {
             obj1 = i.i(p0);
             if (obj1 != null) {
                i = obj1.component1().intValue();
                Object obj2 = obj1.component2();
                uoa1 = obj1.component3();
                if (obj2 != null) {
                   if (!a.f(i)) {
                      return;
                   }else {
                      obj2.add(c.c.a());
                      ArrayList uArrayList = new ArrayList(u.Y(obj2, 10));
                      Iterator iterator = obj2.iterator();
                      while (iterator.hasNext()) {
                         uArrayList.add(iterator.next().b());
                      }
                      g = KgiConfig.g;
                      Objects.requireNonNull(g);
                      KgiConfigItem kgiConfigIte = PatchProxy.apply(null, g, kgiConfig, "9");
                      str2 = "";
                      if (kgiConfigIte != patchProxyRe) {
                      }else {
                         kgiConfigIte = g.d();
                         if (kgiConfigIte != null) {
                            kgiConfigIte = kgiConfigIte.pvId;
                            if (kgiConfigIte == null) {
                            }
                         }else {
                         }
                      }
                      Object obj3 = kgiConfigIte;
                      Objects.requireNonNull(g);
                      kgiConfigIte = PatchProxy.apply(null, g, kgiConfig, "10");
                      if (kgiConfigIte != patchProxyRe) {
                      }else {
                         kgiConfigIte = g.d();
                         if (kgiConfigIte != null) {
                            kgiConfigIte = kgiConfigIte.userFeatures;
                            if (kgiConfigIte == null) {
                            }
                         }else {
                         }
                      }
                      Objects.requireNonNull(g);
                      KgiConfigItem kgiConfigIte1 = PatchProxy.apply(null, g, kgiConfig, "11");
                      if (kgiConfigIte1 != patchProxyRe) {
                      }else {
                         kgiConfigIte1 = g.d();
                         if (kgiConfigIte1 != null) {
                            kgiConfigIte1 = kgiConfigIte1.abParams;
                            if (kgiConfigIte1 == null) {
                            }
                         }else {
                         }
                      }
                      d$a f = d.f;
                      Objects.requireNonNull(f);
                      str1 = PatchProxy.apply(null, f, d$a.class, str1);
                      if (str1 != patchProxyRe) {
                      }else {
                         d = d.d;
                         if (d != null) {
                            String str4 = d.b();
                            if (str4 != null) {
                               str2 = str4;
                            }
                         }
                         str1 = str2;
                      }
                      if (!a.f(i)) {
                         return;
                      }else {
                         a b = uoa1.b;
                         long l = d.a();
                         b.g(str+"\nchannelId = "+i+"\nfeatures = [count : "+obj2.size()+"] = "+uArrayList+"\nhistoryFeatures = "+kgiConfigIte+"\nphotoFeatures = "+str1+"\nabParams = "+kgiConfigIte1, false, 2, null);
                         obj4 = obj2;
                         String str3 = a.d.e(uArrayList, kgiConfigIte, str1, kgiConfigIte1, i);
                         b.g(str+"\n【return】 = "+str3, false, 2, null);
                         Object[] objArray = null;
                         Object[] objArray1 = objArray;
                         long l1 = d.a();
                         f.a(i, b, l, l1, obj3, str3, str1, objArray, objArray1, obj4);
                         if (!a.f(i)) {
                            return;
                         }else if(a.g("finish", str3)){
                            a = a.a;
                            Objects.requireNonNull(a);
                            a$a uoa2 = a$a.class;
                            if (!PatchProxy.isSupport(uoa2) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), a, uoa2, "7")) {
                               a.d(i);
                               c.a(i, "NORMAL", "终止通道：引擎 return finish 主动停止");
                            }
                            return;
                         }else if(str3 != null){
                            a uoa3 = new a(b, Long.valueOf(l), Long.valueOf(l1), null, null, null, 0, 120, null);
                            e.e.c(i, str3, str);
                         }
                      }
                   }
                }
             }
             return;
          }
       }else {
          Triple triple = i.i(p0);
          if (triple != null) {
             int i1 = triple.component1().intValue();
             uoa = triple.component3();
             List list = g.a(obj.e);
             if (list != null && !list.isEmpty()) {
                Iterator iterator1 = list.iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      int i2 = iterator1.next().intValue();
                      str2 = (a.h(i2) || a.g(i2))? 1: 0;
                      if (!str2) {
                         obj4 = 0;
                         break ;
                      }
                   }
                }
                if (obj4) {
                   this.a().post(new c$a(obj));
                }
                i.c(i1, obj1.obj);
             }
             obj4 = 1;
             goto label_02ca ;
          }
       }
       return;
    }
}

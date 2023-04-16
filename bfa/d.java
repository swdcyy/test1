package bfa.d;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import kotlin.jvm.internal.a;
import dfa.a;
import gfa.b;
import gfa.a;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import dfa.b;
import java.io.Serializable;
import ffa.b;
import ffa.a;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import java.lang.reflect.Type;
import brd.t;
import bfa.d$a;
import java.util.concurrent.Callable;
import java.lang.Number;
import java.util.concurrent.TimeUnit;

public final class d	// class@0003a5
{
    public b a;
    public a b;
    public boolean c;
    public final String d;
    public final Class e;

    public void d(String p0,Class p1){
       a.p(p0, "key");
       a.p(p1, "clazz");
       super();
       this.d = p0;
       this.e = p1;
       this.a = new a();
       this.b = new b();
    }
    public final d a(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "delayStrategy");
       this.b = p0;
       return this;
    }
    public final d b(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "filter");
       this.a = p0;
       return this;
    }
    public final Serializable c(){
       String name;
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a a = a.a;
       new b(a.a(this.d), "try_get_cache_syc", this.d).b();
       int i = 0x5f2ddeb4;
       Serializable serializable = b.a(i).g(this.d, this.e);
       if (this.c != null) {
          b.a(i).remove(this.d);
       }
       obj = this.a;
       if (obj != null) {
          objArray = obj.a(serializable);
       }
       b uob = new b(a.a(this.d), "finish_get_cache", this.d);
       d ta = this.a;
       if (ta != null) {
          name = ta.getName();
          if (name != null) {
          label_006a :
             uob = uob.a("filter_name", name);
             ta = this.b;
             if (ta != null) {
                name = ta.getName();
                if (name != null) {
                label_007d :
                   uob.a("strategy_name", name).b();
                   return objArray;
                }
             }
             name = "no-strategy";
             goto label_007d ;
          }
       }
       name = "no-filter";
       goto label_006a ;
    }
    public final t d(){
       String name;
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, uod, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new b(a.a.a(this.d), "try_get_cache", this.d);
       d tb = this.b;
       if (tb != null) {
          name = tb.getName();
          if (name != null) {
          label_002e :
             obj.a("strategy_name", name).b();
             t ot = t.fromCallable(new d$a(this));
             Object obj1 = PatchProxy.apply(objArray, this, uod, "5");
             if (obj1 != patchProxyRe) {
                l = obj1.longValue();
             }else {
                d tb1 = this.b;
                if (tb1 == null) {
                   tb1 = new b();
                }
                l = tb1.a();
             }
             t ot1 = ot.delay(l, TimeUnit.MILLISECONDS);
             a.o(ot1, "Observable.fromCallable бн\), TimeUnit.MILLISECONDS\)");
             return ot1;
          }
       }
       name = "no-strategy";
       goto label_002e ;
    }
}

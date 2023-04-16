package bfa.d$a;
import java.util.concurrent.Callable;
import bfa.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bfa.a;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import java.lang.reflect.Type;
import java.io.Serializable;
import dfa.b;
import ffa.b;
import ffa.a;
import gfa.a;

public final class d$a implements Callable	// class@0003a4
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public Object call(){
       String name;
       Object[] objArray = null;
       a uoa = PatchProxy.apply(objArray, this, d$a.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          int i = 0x5f2ddeb4;
          d$a tb = this.b;
          Serializable serializable = b.a(i).g(tb.d, tb.e);
          if (this.b.c != null) {
             b.a(i).remove(this.b.d);
          }
          d a = this.b.a;
          if (a != null) {
             objArray = a.a(serializable);
          }
          b uob = new b(a.a.a(this.b.d), "finish_get_cache", this.b.d);
          d a1 = this.b.a;
          if (a1 != null) {
             name = a1.getName();
             if (name != null) {
             label_0067 :
                uob = uob.a("filter_name", name);
                a1 = this.b.b;
                if (a1 != null) {
                   name = a1.getName();
                   if (name != null) {
                   label_007c :
                      uob.a("strategy_name", name).b();
                      uoa = new a(objArray);
                   }
                }
                name = "no-strategy";
                goto label_007c ;
             }
          }
          name = "no-filter";
          goto label_0067 ;
       }
       return uoa;
    }
}

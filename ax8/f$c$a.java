package ax8.f$c$a;
import java.lang.Runnable;
import com.kwai.feature.post.api.feature.producer.help.ProducerHelpConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import ax8.f;
import ax8.f$c;
import lnc.a1;
import java.lang.reflect.Type;
import f66.i;
import jq.a;
import java.lang.Throwable;
import q87.c;

public final class f$c$a implements Runnable	// class@000332
{
    public final ProducerHelpConfig b;

    public void f$c$a(ProducerHelpConfig p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, f$c$a.class, "1")) {
          return;
       }
       int i = 0x5f2ddeb4;
       try{
          f$c f = f.f;
          b.a(i).c(f.a(), this.b, ProducerHelpConfig.class, (a1.k() + f.b()));
       }catch(java.util.ConcurrentModificationException e0){
          a.b().e("ShareProducerRepo", "updateShareProducerInfo: ", e0);
       }
       return;
    }
}

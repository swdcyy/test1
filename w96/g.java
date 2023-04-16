package w96.g;
import com.smile.gifshow.annotation.plugin.Factory;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.log.h;
import com.yxcorp.gifshow.log.n;
import o56.a;
import android.content.Context;
import android.app.Application;
import k2b.o0;
import com.kwai.framework.logger.config.b;

public class g extends Factory	// class@00272d
{

    public void g(){
       super();
    }
    public Object newInstance(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       n on = PatchProxy.apply(null, this, og, "1");
       if (on != patchProxyRe) {
       }else {
          Context baseContext = a.B.getBaseContext();
          b uob = PatchProxy.apply(null, this, og, "2");
          if (uob != patchProxyRe) {
          }else {
             uob = new b(a.B);
          }
          on = new n(baseContext, uob, a.B);
       }
       return on;
    }
}

package aj5.a;
import java.lang.reflect.InvocationHandler;
import android.os.IBinder;
import java.lang.Object;
import java.lang.reflect.Method;
import com.kwai.dva.dex2oat.opt.DexOptimizerImpl;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.util.Arrays;

public final class a implements InvocationHandler	// class@0000b4
{
    public final IBinder b;

    public void a(IBinder p0){
       this.b = p0;
    }
    public final Object invoke(Object p0,Method p1,Object[] p2){
       a tb = this.b;
       p0 = PatchProxy.applyFourRefsWithListener(tb, p0, p1, p2, null, DexOptimizerImpl.class, "13");
       if (p0 != PatchProxyResult.class) {
       }else {
          a.p(tb, "$pmsBinderProxy");
          if (a.g("transact", p1.getName())) {
             p2[3] = Integer.valueOf(0);
          }
          p0 = p1.invoke(tb, Arrays.copyOf(p2, p2.length));
          PatchProxy.onMethodExit(DexOptimizerImpl.class, "13");
       }
       return p0;
    }
}

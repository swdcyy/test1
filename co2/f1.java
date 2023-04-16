package co2.f1;
import ok.x;
import co2.i0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import hp2.e;

public final class f1 implements x	// class@000585
{
    public final i0 b;

    public void f1(i0 p0){
       this.b = p0;
       super();
    }
    public Object get(){
       e uoe = PatchProxy.apply(null, this, f1.class, "1");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = this.b.h3();
       }
       return uoe;
    }
}

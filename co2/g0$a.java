package co2.g0$a;
import ok.x;
import co2.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import hp2.e;

public final class g0$a implements x	// class@000588
{
    public final c b;

    public void g0$a(c p0){
       this.b = p0;
       super();
    }
    public Object get(){
       e uoe = PatchProxy.apply(null, this, g0$a.class, "1");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = this.b.h3();
       }
       return uoe;
    }
}

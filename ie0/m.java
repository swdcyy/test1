package ie0.m;
import java.util.concurrent.Callable;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.growth.pendant.core.manager.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.growth.pendant.core.manager.f$a;

public final class m implements Callable	// class@0028ac
{
    public final String b;
    public final String c;

    public void m(String p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       m tb = this.b;
       m tc = this.c;
       f$a uoa = PatchProxy.applyTwoRefs(tb, tc, null, f.class, "9");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = f.d(tb, tc, -1, -1);
       }
       return uoa;
    }
}

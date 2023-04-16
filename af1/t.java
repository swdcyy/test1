package af1.t;
import ok.o;
import af1.x;
import java.lang.Object;
import df1.c;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import af1.k;

public final class t implements o	// class@00007e
{
    public final x b;

    public void t(x p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       boolean b1;
       t tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = true;
       if (p0 != null) {
          Object obj = PatchProxy.applyOneRefs(p0, tb, x.class, "22");
          if (obj != PatchProxyResult.class) {
             b1 = obj.booleanValue();
          }else if(tb.g(p0) && tb.e.b(p0)){
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1) {
          label_0033 :
             return b;
          }
       }
       b = false;
       goto label_0033 ;
    }
}

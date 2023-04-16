package af1.s;
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
import ff1.a;
import af1.k;

public final class s implements o	// class@00007d
{
    public final x b;

    public void s(x p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       boolean b1;
       s tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = true;
       if (p0 != null) {
          Object obj = PatchProxy.applyOneRefs(p0, tb, x.class, "21");
          if (obj != PatchProxyResult.class) {
             b1 = obj.booleanValue();
          }else if(tb.g(p0) && (tb.c.a(p0) && tb.e.b(p0))){
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1) {
          label_003b :
             return b;
          }
       }
       b = false;
       goto label_003b ;
    }
}

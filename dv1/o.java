package dv1.o;
import z1.k;
import dv1.p;
import o63.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class o implements k	// class@00203b
{
    public final a b;
    public final p c;

    public void o(p p0,a p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public Object get(){
       String str = PatchProxy.apply(null, this, o.class, "1");
       if (str != PatchProxyResult.class) {
       }else {
          o tb = this.b;
          str = (tb != null)? tb.getLiveId(): "";
       }
       return str;
    }
}

package kl9.a$b;
import jl9.d$a;
import jl9.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kl9.a;
import kl9.a$a;

public class a$b extends d$a	// class@002cb2
{
    public final float a;
    public final float b;

    public void a$b(float p0,float p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public d a(){
       a uoa = PatchProxy.apply(null, this, a$b.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a(this.a, this.b, null);
       }
       return uoa;
    }
}

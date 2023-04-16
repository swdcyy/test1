package f21.b$b;
import z61.c;
import f21.b;
import java.lang.Object;
import o61.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import f21.d;
import f21.b$b$a;
import z1.a;

public final class b$b implements c	// class@002297
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public final b a(){
       b$b obj = PatchProxy.apply(null, this, b$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       b b = obj.b;
       if (b != null) {
          return b;
       }
       obj.b = new d(new b$b$a(this));
       return this.a.b;
    }
}

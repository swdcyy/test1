package nl9.c$a$a;
import android.content.Context;
import java.lang.Object;
import ll8.c$b;
import ekd.j1;
import android.text.style.ForegroundColorSpan;
import android.content.res.Resources;
import ync.a;
import nl9.c$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class c$a$a	// class@0031a5
{
    public int a;
    public int b;
    public ForegroundColorSpan c;

    public void c$a$a(Context p0){
       super();
       int[] t3 = c$b.T3;
       this.a = j1.a(p0, t3, 14);
       this.c = new ForegroundColorSpan(p0.getResources().getColor(j1.a(p0, t3, 13)));
       this.b = a.c(p0);
    }
    public c$a a(){
       Object obj = PatchProxy.apply(null, this, c$a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c$a(this);
    }
}

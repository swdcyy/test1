package bda.a$b;
import java.lang.Object;
import bda.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import bda.a$a;

public class a$b	// class@000395
{
    public String a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;
    public Map g;

    public void a$b(){
       super();
       this.c = "";
    }
    public a a(){
       Object obj = PatchProxy.apply(null, this, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a uoa = new a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, null);
       return obj;
    }
    public a$b b(String p0){
       this.c = p0;
       return this;
    }
    public a$b c(boolean p0){
       this.f = p0;
       return this;
    }
    public a$b d(boolean p0){
       this.e = p0;
       return this;
    }
    public a$b e(String p0){
       this.b = p0;
       return this;
    }
}

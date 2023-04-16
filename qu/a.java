package qu.a;
import mn.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mn.b$a;
import mn.b;
import on.a;

public abstract class a	// class@002cfb
{
    public final c a;
    public final c b;

    public void a(c p0,c p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public Object a(Object p0){
       b$a obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b$a();
       obj.b(p0);
       p0 = obj.a();
       String str = this.b();
       if (a.a(this.a.a(p0, str))) {
          return this.b.a(p0, str);
       }
       return null;
    }
    public abstract String b();
}

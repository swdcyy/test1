package f43.c$d;
import f43.b$b;
import f43.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import java.util.Set;

public class c$d implements b$b	// class@00286e
{
    public final ClientContent$LiveStreamPackage a;
    public final b$b b;
    public final String c;
    public final c d;

    public void c$d(c p0,ClientContent$LiveStreamPackage p1,b$b p2,String p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c$d.class, "2")) {
          return;
       }
       this.d.d(false, this.a);
       c$d tb = this.b;
       if (tb != null) {
          tb.a();
       }
       this.d.c.remove(this.c);
       this.d.d.remove(this.c);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, c$d.class, "1")) {
          return;
       }
       this.d.d(true, this.a);
       c$d tb = this.b;
       if (tb != null) {
          tb.b();
       }
       this.d.c.remove(this.c);
       this.d.d.remove(this.c);
       return;
    }
}

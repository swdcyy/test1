package a1b.b$a$a;
import androidx.recyclerview.widget.h$b;
import a1b.b$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import a1b.b;
import a9c.e;
import y0b.i;
import java.util.List;
import java.lang.Number;

public class b$a$a extends h$b	// class@000012
{
    public final b$a a;

    public void b$a$a(b$a p0){
       this.a = p0;
       super();
    }
    public boolean a(int p0,int p1){
       b$a$a uoa$a = b$a$a.class;
       if (PatchProxy.isSupport(uoa$a)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa$a, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.a.g.a.B().a(this.a.b.get(p0), this.a.c.get(p1));
    }
    public boolean b(int p0,int p1){
       b$a$a uoa$a = b$a$a.class;
       if (PatchProxy.isSupport(uoa$a)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa$a, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.a.g.a.B().b(this.a.b.get(p0), this.a.c.get(p1));
    }
    public Object c(int p0,int p1){
       b$a$a uoa$a = b$a$a.class;
       if (PatchProxy.isSupport(uoa$a)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa$a, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.g.a.B().c(this.a.b.get(p0), this.a.c.get(p1));
    }
    public int d(){
       Object obj = PatchProxy.apply(null, this, b$a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.c.size();
    }
    public int e(){
       Object obj = PatchProxy.apply(null, this, b$a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.b.size();
    }
}

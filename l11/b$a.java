package l11.b$a;
import l11.j;
import l11.b;
import java.lang.Object;
import l11.j$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;

public class b$a implements j	// class@002e54
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(j$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "2")) {
          return;
       }
       if (!this.a.K.contains(p0)) {
          this.a.K.add(0, p0);
       }
       return;
    }
    public void b(j$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "3")) {
          return;
       }
       this.a.K.remove(p0);
       return;
    }
    public void c(j$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       if (!this.a.K.contains(p0)) {
          this.a.K.add(p0);
       }
       return;
    }
}

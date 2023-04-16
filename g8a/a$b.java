package g8a.a$b;
import jd5.i;
import g8a.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public final class a$b implements i	// class@00240a
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       p0++;
       this.a.R8(p0);
       return;
    }
    public void b(int p0,int p1){
       if (PatchProxy.isSupport(a$b.class)) {
          PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, a$b.class, "2");
       }
       return;
    }
    public void c(){
       PatchProxy.applyVoid(null, this, a$b.class, "3");
    }
}

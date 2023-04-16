package oh3.a;
import java.lang.Object;
import java.util.ArrayList;
import mq1.b;
import ah3.d;
import xz1.f;
import fh3.d;
import eh3.c;
import bh3.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import z1.a;
import java.util.Collection;
import java.lang.Iterable;
import oh3.b;
import ch3.c;

public class a	// class@00380d
{
    public final List a;

    public void a(){
       super();
       this.a = new ArrayList();
    }
    public void B(b p0){
       this.R(p0);
    }
    public void E(d p0){
       this.R(p0);
    }
    public void G(f p0){
       this.R(p0);
    }
    public void H(d p0){
       this.R(p0);
    }
    public void J(c p0){
       this.R(p0);
    }
    public void L(d p0){
       this.R(p0);
    }
    public void N(c p0){
       this.O(p0);
    }
    public void O(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.a.remove(p0);
       this.a.add(p0);
       return;
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.a.clear();
       return;
    }
    public void Q(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       b.a(new ArrayList(this.a), p0);
       return;
    }
    public void R(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.a.remove(p0);
       return;
    }
    public void d1(c p0){
       this.R(p0);
    }
    public void e1(c p0){
       this.O(p0);
    }
    public void h(b p0){
       this.O(p0);
    }
    public void m(d p0){
       this.O(p0);
    }
    public void w(d p0){
       this.O(p0);
    }
    public void x(d p0){
       this.O(p0);
    }
    public void y(f p0){
       this.O(p0);
    }
}

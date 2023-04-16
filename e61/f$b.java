package e61.f$b;
import lnc.cb;
import e61.f;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class f$b extends cb	// class@0020ac
{
    public String c;
    public Object d;
    public long e;

    public void f$b(f p0,String p1,Object p2,long p3){
       super(p0);
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "1")) {
          return;
       }
       f uof = this.b();
       if (uof != null) {
          uof.e(this.c, this.d, this.e);
       }
       return;
    }
}

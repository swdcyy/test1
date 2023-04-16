package k3.g;
import java.lang.Object;
import k3.g$a;
import java.lang.String;
import k3.f;

public abstract class g	// class@002473
{

    public void g(){
       super();
    }
    public static g c(){
       return new g$a();
    }
    public abstract f a(String p0);
    public final f b(String p0){
       f uof = this.a(p0);
       if (uof == null) {
          uof = f.a(p0);
       }
       return uof;
    }
}

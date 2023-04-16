package bp6.a2;
import i85.a;
import com.kwai.imsdk.internal.v;
import java.lang.Object;
import java.lang.String;

public class a2 implements a	// class@000500
{
    public final v a;

    public void a2(v p0){
       this.a = p0;
       super();
    }
    public void f(){
       this.a.G(2);
       v h = this.a.h;
       if (h != null) {
          h.f();
       }
       return;
    }
    public void h(){
       this.a.G(3);
       v h = this.a.h;
       if (h != null) {
          h.h();
       }
       return;
    }
    public void i(int p0,String p1){
       this.a.G(4);
       v h = this.a.h;
       if (h != null) {
          h.i(0x272a, "Service token invalid");
       }
       return;
    }
}

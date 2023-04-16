package e19.c$c;
import sc6.b;
import e19.c;
import java.lang.Object;
import sc6.a;
import android.view.Surface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class c$c implements b	// class@00211f
{
    public final c b;

    public void c$c(c p0){
       this.b = p0;
       super();
    }
    public void a(int p0,int p1){
       a.a(this, p0, p1);
    }
    public void b(Surface p0){
       a.b(this, p0);
    }
    public void c(Surface p0){
       a.c(this, p0);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, c$c.class, "1")) {
          return;
       }
       c$c tb = this.b;
       if (tb.x != null) {
          tb.P8();
       }
       this.b.z = false;
       return;
    }
}

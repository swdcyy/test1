package j7a.i$a;
import sc6.b;
import j7a.i;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import sc6.c;
import android.view.Surface;

public class i$a implements b	// class@00292f
{
    public final i b;

    public void i$a(i p0){
       this.b = p0;
       super();
    }
    public void a(int p0,int p1){
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "4")) {
          return;
       }
       this.b.q.a(p0, p1);
       return;
    }
    public void b(Surface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1")) {
          return;
       }
       this.b.q.b(p0);
       return;
    }
    public void c(Surface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "3")) {
          return;
       }
       this.b.q.c(p0);
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, i$a.class, "2")) {
          return;
       }
       this.b.q.d();
       return;
    }
}

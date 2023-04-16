package ai9.i$a;
import qi9.f;
import ai9.i;
import java.lang.Object;
import qi9.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import n65.g;
import com.kwai.camerasdk.models.RecordingStats;

public class i$a implements f	// class@0000d0
{
    public final i a;

    public void i$a(i p0){
       this.a = p0;
       super();
    }
    public void a(int p0,float p1){
       e.c(this, p0, p1);
    }
    public void b(int p0){
       e.a(this, p0);
    }
    public void c(int p0){
       e.d(this, p0);
    }
    public void d(int p0){
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (g.a(p0)) {
          this.a.p = p0;
       }
       return;
    }
    public void e(int p0,float p1,int p2,long p3){
       e.e(this, p0, p1, p2, p3);
    }
    public void f(int p0,boolean p1,float p2,RecordingStats p3){
       e.b(this, p0, p1, p2, p3);
    }
}

package a7a.n$b;
import jd5.i;
import a7a.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public class n$b implements i	// class@00006e
{
    public final n a;

    public void n$b(n p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       if (PatchProxy.isSupport2(n$b.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, n$b.class, "1")) {
          return;
       }
       this.a.P8(p0);
       PatchProxy.onMethodExit(n$b.class, "1");
       return;
    }
    public void b(int p0,int p1){
    }
    public void c(){
    }
}

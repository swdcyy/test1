package ge0.b;
import tx4.f;
import java.lang.String;
import java.lang.Object;
import tx4.w;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ce0.b;
import java.lang.StringBuilder;
import tx4.e;
import q87.c;

public class b implements f	// class@0024a8
{
    public final String a;
    public final f b;

    public void b(String p0,f p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(w p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "2")) {
          return;
       }
       b.C().e("TkUtils", "asyncCompileBundle onFailed:"+this.a, p1);
       b tb = this.b;
       if (tb != null) {
          tb.a(p0, p1);
       }
       return;
    }
    public void b(boolean p0){
       e.a(this, p0);
    }
    public void c(w p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().s("TkUtils", "asyncCompileBundle onSuccess:"+this.a, objArray);
       b tb = this.b;
       if (tb != null) {
          tb.c(p0);
       }
       return;
    }
}

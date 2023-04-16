package c76.a;
import io7.a;
import java.lang.String;
import java.lang.Object;
import io7.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import c76.b;

public final class a implements a	// class@000666
{
    public final String b;

    public void a(String p0){
       this.b = p0;
       super();
    }
    public final void a(String p0,f p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       b.c.c(this.b, p1.a(false));
       return;
    }
}

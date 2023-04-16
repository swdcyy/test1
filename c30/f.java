package c30.f;
import java.lang.Runnable;
import com.kuaishou.cover.container.loader.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.cover.container.loader.b;
import com.kuaishou.cover.Link;
import d30.c;

public class f implements Runnable	// class@0002e9
{
    public final a b;

    public void f(a p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       if (this.b.h == 2) {
          Link.h().g(this.b.d);
       }else {
          Link.h().e();
       }
       if (this.b.l != null) {
          c.d("UnitLoader: force close tk link");
          this.b.D2(false);
       }
       return;
    }
}

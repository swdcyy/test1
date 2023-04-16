package i91.j$a;
import java.lang.Runnable;
import z1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class j$a implements Runnable	// class@002864
{
    public final a b;
    public final Object c;

    public void j$a(a p0,Object p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, j$a.class, "1")) {
          return;
       }
       this.b.accept(this.c);
       return;
    }
}

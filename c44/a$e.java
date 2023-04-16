package c44.a$e;
import java.lang.Runnable;
import c44.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class a$e implements Runnable	// class@0004a9
{
    public final a b;
    public final String c;

    public void a$e(a p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$e.class, "1")) {
          return;
       }
       this.b.R8(this.c);
       return;
    }
}

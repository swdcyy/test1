package hk9.c$a$d;
import java.lang.Runnable;
import hk9.c$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c$a$d implements Runnable	// class@002698
{
    public final c$a b;

    public void c$a$d(c$a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, c$a$d.class, "1")) {
          return;
       }
       this.b.c9();
       return;
    }
}

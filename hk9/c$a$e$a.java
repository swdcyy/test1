package hk9.c$a$e$a;
import java.lang.Runnable;
import hk9.c$a$e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hk9.c$a;

public final class c$a$e$a implements Runnable	// class@002699
{
    public final c$a$e b;

    public void c$a$e$a(c$a$e p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, c$a$e$a.class, "1")) {
          return;
       }
       this.b.b.c9();
       return;
    }
}

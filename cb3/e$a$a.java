package cb3.e$a$a;
import java.lang.Runnable;
import ws5.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class e$a$a implements Runnable	// class@0004df
{
    public final b b;

    public void e$a$a(b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, e$a$a.class, "1")) {
          return;
       }
       this.b.c();
       return;
    }
}

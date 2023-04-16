package j9a.b$a;
import java.lang.Runnable;
import j9a.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class b$a implements Runnable	// class@002989
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       this.b.a.run();
       return;
    }
}

package b77.l$a;
import java.lang.Runnable;
import b77.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class l$a implements Runnable	// class@0003de
{
    public final l b;

    public void l$a(l p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, l$a.class, "1")) {
          return;
       }
       this.b.a(true);
       return;
    }
}

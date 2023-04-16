package aq1.e;
import java.lang.Runnable;
import aq1.a$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import aq1.a;

public final class e implements Runnable	// class@000282
{
    public final a$c b;

    public void e(a$c p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.b.b.J3();
       return;
    }
}

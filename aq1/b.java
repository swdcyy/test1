package aq1.b;
import java.lang.Runnable;
import aq1.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import aq1.a;

public final class b implements Runnable	// class@00027f
{
    public final c b;

    public void b(c p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.b.b.J3();
       return;
    }
}

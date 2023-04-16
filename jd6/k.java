package jd6.k;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jd6.i;

public final class k implements Runnable	// class@001b50
{
    public static final k b;

    static {
       k.b = new k();
    }
    public void k(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       i.b.c();
       return;
    }
}

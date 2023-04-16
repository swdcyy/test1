package og.i$a;
import java.lang.Runnable;
import og.i;
import java.lang.Object;
import java.io.File;
import og.a$e;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.String;

public final class i$a implements Runnable	// class@0027a9
{
    public final i b;

    public void i$a(i p0){
       this.b = p0;
       super();
    }
    public final void run(){
       new File(this.b.b.c.get()).delete();
    }
}

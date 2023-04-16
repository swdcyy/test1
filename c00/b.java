package c00.b;
import java.lang.Runnable;
import java.io.IOException;
import tx4.i;
import java.lang.Object;
import tx4.v;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.utility.Log;

public final class b implements Runnable	// class@0002dd
{
    public final IOException b;
    public final i c;

    public void b(IOException p0,i p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       v ov = new v();
       ov.c = Log.f(this.b);
       this.c.a(ov);
    }
}

package androidx.room.x$c;
import java.lang.Runnable;
import androidx.room.x;
import java.lang.Object;
import androidx.room.u;
import java.lang.String;
import androidx.room.v;
import androidx.room.w$c;
import androidx.room.w;

public class x$c implements Runnable	// class@00097e
{
    public final x b;

    public void x$c(x p0){
       this.b = p0;
       super();
    }
    public void run(){
       try{
          x$c tb = this.b;
          x f = tb.f;
          if (f != null) {
             tb.c = f.x0(tb.h, tb.b);
             tb = this.b;
             tb.d.a(tb.e);
          }
          return;
       }catch(android.os.RemoteException e0){
       }
    }
}

package androidx.room.x$e;
import androidx.room.w$c;
import androidx.room.x;
import java.lang.String;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import androidx.room.v;

public class x$e extends w$c	// class@000980
{
    public final x b;

    public void x$e(x p0,String[] p1){
       this.b = p0;
       super(p1);
    }
    public void b(Set p0){
       if (this.b.i.get()) {
          return;
       }
       try{
          x$e tb = this.b;
          x f = tb.f;
          if (f != null) {
             String[] stringArray = new String[0];
             f.r1(tb.c, p0.toArray(stringArray));
          }
          return;
       }catch(android.os.RemoteException e0){
       }
    }
}

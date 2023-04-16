package androidx.room.x;
import android.content.Context;
import java.lang.String;
import androidx.room.w;
import java.util.concurrent.Executor;
import java.lang.Object;
import androidx.room.x$a;
import java.util.concurrent.atomic.AtomicBoolean;
import androidx.room.x$b;
import androidx.room.x$c;
import androidx.room.x$d;
import java.util.Set;
import java.util.HashMap;
import androidx.room.x$e;
import android.content.Intent;
import androidx.room.MultiInstanceInvalidationService;
import java.lang.Class;
import android.content.ServiceConnection;
import com.kwai.plugin.dva.feature.core.hook.a;
import androidx.room.w$c;
import androidx.room.u;
import androidx.room.v;

public class x	// class@000981
{
    public final Context a;
    public final String b;
    public int c;
    public final w d;
    public final w$c e;
    public v f;
    public final Executor g;
    public final u h;
    public final AtomicBoolean i;
    public final ServiceConnection j;
    public final Runnable k;
    public final Runnable l;

    public void x(Context p0,String p1,w p2,Executor p3){
       super();
       this.h = new x$a(this);
       this.i = new AtomicBoolean(false);
       x$b uob = new x$b(this);
       this.j = uob;
       this.k = new x$c(this);
       this.l = new x$d(this);
       p0 = p0.getApplicationContext();
       this.a = p0;
       this.b = p1;
       this.d = p2;
       this.g = p3;
       String[] stringArray = new String[false];
       this.e = new x$e(this, p2.a.keySet().toArray(stringArray));
       a.a(p0, new Intent(p0, MultiInstanceInvalidationService.class), uob, 1);
    }
    public void a(){
       if (this.i.compareAndSet(false, true)) {
          x td = this.d;
          x te = this.e;
          try{
             td.k(te);
             td = this.f;
             if (td != null) {
                td.B0(this.h, this.c);
             }
             this.a.unbindService(this.j);
          }catch(android.os.RemoteException e0){
          }
       }
    }
}

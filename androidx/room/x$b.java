package androidx.room.x$b;
import android.content.ServiceConnection;
import androidx.room.x;
import java.lang.Object;
import android.content.ComponentName;
import android.os.IBinder;
import androidx.room.v;
import androidx.room.v$a;
import java.lang.Runnable;
import java.util.concurrent.Executor;

public class x$b implements ServiceConnection	// class@00097d
{
    public final x b;

    public void x$b(x p0){
       this.b = p0;
       super();
    }
    public void onServiceConnected(ComponentName p0,IBinder p1){
       p0.f = v$a.L1(p1);
       x$b tb = this.b;
       tb.g.execute(tb.k);
    }
    public void onServiceDisconnected(ComponentName p0){
       x$b tb = this.b;
       tb.g.execute(tb.l);
       tb.f = null;
    }
}

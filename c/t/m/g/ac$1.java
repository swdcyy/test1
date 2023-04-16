package c.t.m.g.ac$1;
import android.content.ServiceConnection;
import c.t.m.g.ac;
import java.lang.Object;
import android.content.ComponentName;
import android.os.IBinder;
import c.t.m.g.ak;
import c.t.m.g.ak$a;

public class ac$1 implements ServiceConnection	// class@000bb4
{
    public final ac a;

    public void ac$1(ac p0){
       this.a = p0;
       super();
    }
    public void onServiceConnected(ComponentName p0,IBinder p1){
       p0.b = ak$a.a(p1);
    }
    public void onServiceDisconnected(ComponentName p0){
       p0.b = null;
    }
}

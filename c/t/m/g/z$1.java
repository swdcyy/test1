package c.t.m.g.z$1;
import android.content.ServiceConnection;
import c.t.m.g.z;
import java.lang.Object;
import android.content.ComponentName;
import android.os.IBinder;
import c.t.m.g.aj$a$a;

public class z$1 implements ServiceConnection	// class@000cb7
{
    public final z a;

    public void z$1(z p0){
       this.a = p0;
       super();
    }
    public void onServiceConnected(ComponentName p0,IBinder p1){
       p0.a = new aj$a$a(p1);
    }
    public void onServiceDisconnected(ComponentName p0){
    }
}

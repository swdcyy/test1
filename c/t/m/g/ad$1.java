package c.t.m.g.ad$1;
import android.content.ServiceConnection;
import c.t.m.g.ad;
import java.lang.Object;
import android.content.ComponentName;
import android.os.IBinder;
import c.t.m.g.al;
import c.t.m.g.al$a;

public class ad$1 implements ServiceConnection	// class@000bb6
{
    public final ad a;

    public void ad$1(ad p0){
       this.a = p0;
       super();
    }
    public void onServiceConnected(ComponentName p0,IBinder p1){
       p0.b = al$a.a(p1);
    }
    public void onServiceDisconnected(ComponentName p0){
       p0.b = null;
    }
}

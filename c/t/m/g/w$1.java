package c.t.m.g.w$1;
import android.content.ServiceConnection;
import c.t.m.g.w;
import java.lang.Object;
import android.content.ComponentName;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.lang.String;
import java.lang.Throwable;
import c.t.m.g.bt;

public class w$1 implements ServiceConnection	// class@000cb0
{
    public final w a;

    public void w$1(w p0){
       this.a = p0;
       super();
    }
    public void onServiceConnected(ComponentName p0,IBinder p1){
       try{
          this.a.a.put(p1);
       }catch(java.lang.Exception e2){
          bt.a("ASUSDeviceIDHelper", "onServiceConnected", e2);
       }
       return;
    }
    public void onServiceDisconnected(ComponentName p0){
    }
}

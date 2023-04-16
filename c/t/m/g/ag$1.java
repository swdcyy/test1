package c.t.m.g.ag$1;
import android.content.ServiceConnection;
import c.t.m.g.ag;
import java.lang.Object;
import android.content.ComponentName;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.lang.String;
import java.lang.Throwable;
import c.t.m.g.bt;

public class ag$1 implements ServiceConnection	// class@000bba
{
    public final ag a;

    public void ag$1(ag p0){
       this.a = p0;
       super();
    }
    public void onServiceConnected(ComponentName p0,IBinder p1){
       try{
          this.a.c.put(p1);
       }catch(java.lang.Exception e2){
          bt.a("ZTEDeviceIDHelper", "onServiceConnected", e2);
       }
       return;
    }
    public void onServiceDisconnected(ComponentName p0){
    }
}

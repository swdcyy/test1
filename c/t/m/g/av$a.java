package c.t.m.g.av$a;
import android.os.Handler;
import c.t.m.g.av;
import android.os.Looper;
import android.os.Message;
import c.t.m.g.bt;
import java.lang.String;
import c.t.m.g.ay;
import java.lang.StringBuilder;
import java.lang.Throwable;

public class av$a extends Handler	// class@000bd6
{
    public final av a;

    public void av$a(av p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       this.a.a(p0);
       return;
    }
}

package com.vivo.push.n;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.vivo.push.l;
import java.lang.Object;
import java.lang.String;
import com.vivo.push.util.p;

public final class n extends Handler	// class@00108e
{

    public void n(Looper p0){
       super(p0);
    }
    public final void handleMessage(Message p0){
       p0 = p0.obj;
       if (p0 instanceof l) {
          p.c("PushClientThread", ("PushClientThread-handleMessage, task = ").concat(String.valueOf(p0)));
          p0.run();
       }
       return;
    }
}

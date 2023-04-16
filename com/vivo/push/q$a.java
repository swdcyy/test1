package com.vivo.push.q$a;
import android.os.Handler;
import com.vivo.push.q;
import android.os.Looper;
import android.os.Message;

public final class q$a extends Handler	// class@001091
{
    public final q a;

    public void q$a(q p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public final void handleMessage(Message p0){
       this.a.b(p0);
    }
}

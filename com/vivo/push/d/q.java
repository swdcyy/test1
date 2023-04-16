package com.vivo.push.d.q;
import java.lang.Runnable;
import com.vivo.push.d.p;
import com.vivo.push.model.UnvarnishedMessage;
import java.lang.Object;
import com.vivo.push.d.z;
import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;

public final class q implements Runnable	// class@001070
{
    public final UnvarnishedMessage a;
    public final p b;

    public void q(p p0,UnvarnishedMessage p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public final void run(){
       q tb = this.b;
       tb.b.onTransmissionMessage(p.a(tb), this.a);
    }
}

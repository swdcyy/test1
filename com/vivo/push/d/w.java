package com.vivo.push.d.w;
import java.lang.Runnable;
import com.vivo.push.d.u;
import com.vivo.push.model.UPSNotificationMessage;
import java.lang.Object;
import com.vivo.push.d.z;
import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;

public final class w implements Runnable	// class@001077
{
    public final UPSNotificationMessage a;
    public final u b;

    public void w(u p0,UPSNotificationMessage p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public final void run(){
       w tb = this.b;
       tb.b.onNotificationMessageClicked(u.a(tb), this.a);
    }
}

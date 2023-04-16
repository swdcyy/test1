package com.vivo.push.d.o;
import java.lang.Runnable;
import com.vivo.push.d.n;
import com.vivo.push.b.n;
import java.lang.Object;
import com.vivo.push.d.z;
import android.content.Context;
import java.lang.String;
import com.vivo.push.sdk.PushMessageCallback;

public final class o implements Runnable	// class@00106e
{
    public final n a;
    public final n b;

    public void o(n p0,n p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public final void run(){
       o tb = this.b;
       tb.b.onLog(n.a(tb), this.a.d(), this.a.e(), this.a.f());
    }
}

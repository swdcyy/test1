package com.vivo.push.d.ae;
import java.lang.Runnable;
import com.vivo.push.d.ad;
import com.vivo.push.b.i;
import java.lang.Object;
import com.vivo.push.d.z;
import android.content.Context;
import com.vivo.push.b.s;
import java.lang.String;
import com.vivo.push.sdk.PushMessageCallback;

public final class ae implements Runnable	// class@00105c
{
    public final i a;
    public final ad b;

    public void ae(ad p0,i p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public final void run(){
       ae tb = this.b;
       tb.b.onUnBind(ad.a(tb), this.a.h(), this.a.d());
    }
}

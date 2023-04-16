package com.vivo.push.d.y;
import java.lang.Runnable;
import com.vivo.push.d.x;
import com.vivo.push.b.r;
import java.lang.Object;
import com.vivo.push.d.z;
import android.content.Context;
import com.vivo.push.b.s;
import java.lang.String;
import com.vivo.push.sdk.PushMessageCallback;

public final class y implements Runnable	// class@001079
{
    public final r a;
    public final x b;

    public void y(x p0,r p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public final void run(){
       y tb = this.b;
       tb.b.onPublish(x.a(tb), this.a.h(), this.a.g());
    }
}

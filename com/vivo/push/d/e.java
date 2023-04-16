package com.vivo.push.d.e;
import java.lang.Runnable;
import com.vivo.push.d.d;
import java.lang.String;
import com.vivo.push.b.i;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.vivo.push.d.z;
import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;
import com.vivo.push.b.s;

public final class e implements Runnable	// class@001064
{
    public final String a;
    public final i b;
    public final d c;

    public void e(d p0,String p1,i p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public final void run(){
       e tc;
       if (!TextUtils.isEmpty(this.a)) {
          tc = this.c;
          tc.b.onReceiveRegId(d.a(tc), this.a);
       }
       tc = this.c;
       tc.b.onBind(d.b(tc), this.b.h(), this.b.d());
       return;
    }
}

package com.vivo.push.util.l;
import java.lang.Runnable;
import com.vivo.push.util.k;
import java.util.List;
import java.lang.Object;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.util.w;
import java.lang.String;
import com.vivo.push.util.b;
import android.content.Context;
import com.vivo.push.d.r$a;
import com.vivo.push.util.NotifyAdapterUtil;

public final class l implements Runnable	// class@0010ba
{
    public final List a;
    public final k b;

    public void l(k p0,List p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public final void run(){
       if (k.a(this.b) != null) {
          w.b().a("com.vivo.push.notify_key", k.b(this.b));
          NotifyAdapterUtil.pushNotification(k.c(this.b), this.a, k.a(this.b), k.b(this.b), k.d(this.b), k.e(this.b));
       }
       return;
    }
}

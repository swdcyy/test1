package com.xiaomi.push.service.bg$b$c;
import android.os.IBinder$DeathRecipient;
import com.xiaomi.push.service.bg$b;
import android.os.Messenger;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import rs8.c;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.q;
import com.xiaomi.push.service.XMPushService$j;
import android.app.Service;
import com.xiaomi.push.service.r;

public class bg$b$c implements IBinder$DeathRecipient	// class@001161
{
    public final bg$b a;
    public final Messenger b;
    public final bg$b c;

    public void bg$b$c(bg$b p0,bg$b p1,Messenger p2){
       this.c = p0;
       super();
       this.a = p1;
       this.b = p2;
    }
    public void binderDied(){
       c.s("peer died, chid = "+this.a.h);
       int i = 0;
       bg$b.c(this.c).a(new q(this, i), 0);
       if (("9").equals(this.a.h) && ("com.xiaomi.xmsf").equals(bg$b.c(this.c).getPackageName())) {
          bg$b.c(this.c).a(new r(this, i), 0xea60);
       }
       return;
    }
}

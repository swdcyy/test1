package com.xiaomi.push.service.c0;
import android.database.ContentObserver;
import com.xiaomi.push.service.XMPushService;
import android.os.Handler;
import java.lang.StringBuilder;
import java.lang.String;
import rs8.c;
import com.xiaomi.push.service.XMPushService$g;
import java.lang.Exception;
import com.xiaomi.push.service.XMPushService$j;

public class c0 extends ContentObserver	// class@001165
{
    public final XMPushService a;

    public void c0(XMPushService p0,Handler p1){
       this.a = p0;
       super(p1);
    }
    public void onChange(boolean p0){
       super.onChange(p0);
       p0 = XMPushService.a(this.a);
       c.l("SuperPowerMode:"+p0);
       XMPushService.a(this.a);
       if (p0) {
          c0 ta = this.a;
          ta.a(new XMPushService$g(ta, 24, null));
       }else {
          this.a.a(true);
       }
       return;
    }
}

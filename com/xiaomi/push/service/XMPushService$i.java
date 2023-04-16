package com.xiaomi.push.service.XMPushService$i;
import com.xiaomi.push.service.XMPushService$j;
import com.xiaomi.push.service.XMPushService;
import android.content.Intent;
import java.lang.String;
import java.lang.StringBuilder;

public class XMPushService$i extends XMPushService$j	// class@00114d
{
    public Intent c;
    public final XMPushService d;

    public void XMPushService$i(XMPushService p0,Intent p1){
       this.d = p0;
       super(15);
       this.c = null;
       this.c = p1;
    }
    public String a(){
       return "Handle intent action = "+this.c.getAction();
    }
    public void b(){
       XMPushService.a(this.d, this.c);
    }
    public Intent c(){
       return this.c;
    }
}

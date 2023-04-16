package com.xiaomi.push.service.XMPushService$l;
import com.xiaomi.push.service.XMPushService$j;
import com.xiaomi.push.service.XMPushService;
import java.lang.String;
import com.xiaomi.push.service.i0;

public class XMPushService$l extends XMPushService$j	// class@001150
{
    public final XMPushService c;

    public void XMPushService$l(XMPushService p0){
       this.c = p0;
       super(5);
    }
    public String a(){
       return "ask the job queue to quit";
    }
    public void b(){
       XMPushService.a(this.c).b();
    }
}

package com.xiaomi.push.service.XMPushService$h;
import com.xiaomi.push.service.XMPushService$j;
import com.xiaomi.push.service.XMPushService;
import java.lang.String;

public class XMPushService$h extends XMPushService$j	// class@00114c
{
    public final XMPushService c;

    public void XMPushService$h(XMPushService p0){
       this.c = p0;
       super(0xffff);
    }
    public String a(){
       return "Init Job";
    }
    public void b(){
       XMPushService.b(this.c);
    }
}

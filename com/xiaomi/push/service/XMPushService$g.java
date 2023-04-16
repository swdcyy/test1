package com.xiaomi.push.service.XMPushService$g;
import com.xiaomi.push.service.XMPushService$j;
import com.xiaomi.push.service.XMPushService;
import java.lang.Exception;
import java.lang.String;

public class XMPushService$g extends XMPushService$j	// class@00114b
{
    public int c;
    public Exception d;
    public final XMPushService e;

    public void XMPushService$g(XMPushService p0,int p1,Exception p2){
       this.e = p0;
       super(2);
       this.c = p1;
       this.d = null;
    }
    public String a(){
       return "disconnect the connection.";
    }
    public void b(){
       this.e.a(this.c, this.d);
    }
}

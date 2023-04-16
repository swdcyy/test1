package com.xiaomi.push.service.n0;
import com.xiaomi.push.service.XMPushService$j;
import com.xiaomi.push.service.XMPushService;
import java.lang.String;
import android.content.Context;
import com.xiaomi.push.service.l0;
import com.xiaomi.push.service.m0;
import java.lang.StringBuilder;
import java.lang.Object;
import rs8.c;
import ys8.e1;
import com.xiaomi.push.service.bg;
import java.util.Collection;
import com.xiaomi.push.service.bg$b;
import com.xiaomi.push.service.g;
import java.util.Iterator;
import com.xiaomi.push.service.bg$c;
import com.xiaomi.push.service.XMPushService$b;
import java.util.Objects;
import java.lang.Exception;

public class n0 extends XMPushService$j	// class@001187
{
    public XMPushService c;
    public byte[] d;
    public String e;
    public String f;
    public String g;

    public void n0(XMPushService p0,String p1,String p2,String p3,byte[] p4){
       super(9);
       this.c = p0;
       this.e = p1;
       this.d = p4;
       this.f = p2;
       this.g = p3;
    }
    public String a(){
       return "register app";
    }
    public void b(){
       Collection uCollection;
       bg$b uob;
       bg$b m;
       n0 tc;
       l0 ol0 = m0.b(this.c);
       if (ol0 == null) {
          try{
             ol0 = m0.c(this.c, this.e, this.f, this.g);
          }catch(java.lang.Exception e1){
             c.u("fail to register push account. "+e1);
          }
       }
    }
}

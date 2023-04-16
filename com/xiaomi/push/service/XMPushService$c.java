package com.xiaomi.push.service.XMPushService$c;
import com.xiaomi.push.service.XMPushService$j;
import com.xiaomi.push.service.bg$b;
import java.lang.String;
import java.lang.StringBuilder;
import com.xiaomi.push.service.bg$c;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;

public class XMPushService$c extends XMPushService$j	// class@001147
{
    public final bg$b c;

    public void XMPushService$c(bg$b p0){
       this.c = p0;
    }
    public String a(){
       return "bind time out. chid="+this.c.h;
    }
    public void b(){
       this.c.k(bg$c.a, 1, 21, null, null);
    }
    public boolean equals(Object p0){
       if (!p0 instanceof XMPushService$c) {
          return false;
       }
       return TextUtils.equals(p0.c.h, this.c.h);
    }
    public int hashCode(){
       return (this.c.h).hashCode();
    }
}

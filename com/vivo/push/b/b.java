package com.vivo.push.b.b;
import com.vivo.push.b.c;
import java.lang.String;
import com.vivo.push.a;
import java.lang.StringBuilder;
import com.vivo.push.o;

public final class b extends c	// class@001031
{
    public String a;
    public String b;
    public String c;
    public String d;
    public boolean e;

    public void b(boolean p0,String p1){
       int i = (p0)? 2006: 2007;
       super(i, p1);
       this.e = false;
       return;
    }
    public final void c(a p0){
       super.c(p0);
       p0.a("sdk_clients", this.a);
       p0.a("sdk_version", 323);
       p0.a("BaseAppCommand.EXTRA_APPID", this.c);
       p0.a("BaseAppCommand.EXTRA_APPKEY", this.b);
       p0.a("PUSH_REGID", this.d);
    }
    public final void d(){
       this.c = null;
    }
    public final void d(a p0){
       super.d(p0);
       this.a = p0.a("sdk_clients");
       this.c = p0.a("BaseAppCommand.EXTRA_APPID");
       this.b = p0.a("BaseAppCommand.EXTRA_APPKEY");
       this.d = p0.a("PUSH_REGID");
    }
    public final void e(){
       this.b = null;
    }
    public final String toString(){
       return "AppCommand:"+this.b();
    }
}

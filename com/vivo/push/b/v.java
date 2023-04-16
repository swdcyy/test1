package com.vivo.push.b.v;
import com.vivo.push.b.s;
import com.vivo.push.a;
import java.lang.String;

public abstract class v extends s	// class@001045
{
    public String a;
    public long b;

    public void v(int p0){
       super(p0);
    }
    public void c(a p0){
       super.c(p0);
       p0.a("OnVerifyCallBackCommand.EXTRA_SECURITY_CONTENT", this.a);
       p0.a("notify_id", this.b);
    }
    public void d(a p0){
       super.d(p0);
       this.a = p0.a("OnVerifyCallBackCommand.EXTRA_SECURITY_CONTENT");
       this.b = p0.b("notify_id", -1);
    }
    public final long f(){
       return this.b;
    }
    public final String i(){
       return this.a;
    }
}

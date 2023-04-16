package com.vivo.push.b.w;
import com.vivo.push.o;
import com.vivo.push.a;
import java.lang.String;

public final class w extends o	// class@001046
{
    public int a;

    public void w(){
       super(2011);
       this.a = 0;
    }
    public final void c(a p0){
       p0.a("com.bbk.push.ikey.MODE_TYPE", this.a);
    }
    public final boolean c(){
       return true;
    }
    public final int d(){
       return this.a;
    }
    public final void d(a p0){
       this.a = p0.b("com.bbk.push.ikey.MODE_TYPE", 0);
    }
    public final String toString(){
       return "PushModeCommand";
    }
}

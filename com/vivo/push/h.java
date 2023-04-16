package com.vivo.push.h;
import java.lang.Runnable;
import com.vivo.push.e;
import com.vivo.push.b.b;
import java.lang.String;
import java.lang.Object;
import com.vivo.push.o;

public final class h implements Runnable	// class@001082
{
    public final b a;
    public final String b;
    public final e c;

    public void h(e p0,b p1,String p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public final void run(){
       this.c.a(this.a);
       e.b(this.c, this.b);
    }
}

package com.vivo.push.b.l;
import com.vivo.push.b.s;
import com.vivo.push.a;
import java.lang.String;

public final class l extends s	// class@00103b
{
    public int a;
    public int b;

    public void l(){
       super(2016);
       this.a = -1;
       this.b = -1;
    }
    public final void c(a p0){
       super.c(p0);
       p0.a("key_dispatch_environment", this.a);
       p0.a("key_dispatch_area", this.b);
    }
    public final int d(){
       return this.a;
    }
    public final void d(a p0){
       super.d(p0);
       this.a = p0.b("key_dispatch_environment", 1);
       this.b = p0.b("key_dispatch_area", 1);
    }
    public final int e(){
       return this.b;
    }
}

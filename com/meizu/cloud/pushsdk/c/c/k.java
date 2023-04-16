package com.meizu.cloud.pushsdk.c.c.k;
import com.meizu.cloud.pushsdk.c.c.k$a;
import java.lang.Object;
import com.meizu.cloud.pushsdk.c.c.i;
import java.lang.String;
import com.meizu.cloud.pushsdk.c.c.c$a;
import com.meizu.cloud.pushsdk.c.c.c;
import com.meizu.cloud.pushsdk.c.c.l;
import com.meizu.cloud.pushsdk.c.c.k$1;
import java.lang.StringBuilder;
import com.meizu.cloud.pushsdk.c.c.f;

public class k	// class@0014df
{
    public final i a;
    public final int b;
    public final String c;
    public final c d;
    public final l e;
    public final k f;
    public final k g;
    public final k h;

    public void k(k$a p0){
       super();
       this.a = k$a.a(p0);
       this.b = k$a.b(p0);
       this.c = k$a.c(p0);
       this.d = k$a.d(p0).a();
       this.e = k$a.e(p0);
       this.f = k$a.f(p0);
       this.g = k$a.g(p0);
       this.h = k$a.h(p0);
    }
    public void k(k$a p0,k$1 p1){
       super(p0);
    }
    public int a(){
       return this.b;
    }
    public l b(){
       return this.e;
    }
    public String toString(){
       return "Response{protocol=, code="+this.b+", message="+this.c+", url="+this.a.a()+'}';
    }
}

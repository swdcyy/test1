package com.meizu.cloud.pushsdk.c.c.j$1;
import com.meizu.cloud.pushsdk.c.c.j;
import com.meizu.cloud.pushsdk.c.c.g;
import com.meizu.cloud.pushsdk.c.g.c;

public final class j$1 extends j	// class@0014da
{
    public final g a;
    public final int b;
    public final byte[] c;
    public final int d;

    public void j$1(g p0,int p1,byte[] p2,int p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public g a(){
       return this.a;
    }
    public void a(c p0){
       p0.c(this.c, this.d, this.b);
    }
    public long b(){
       return (long)this.b;
    }
}

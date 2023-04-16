package com.meizu.cloud.pushsdk.c.c.j$2;
import com.meizu.cloud.pushsdk.c.c.j;
import com.meizu.cloud.pushsdk.c.c.g;
import java.io.File;
import com.meizu.cloud.pushsdk.c.g.c;
import com.meizu.cloud.pushsdk.c.g.m;
import com.meizu.cloud.pushsdk.c.g.g;
import java.io.Closeable;
import com.meizu.cloud.pushsdk.c.c.m;

public final class j$2 extends j	// class@0014db
{
    public final g a;
    public final File b;

    public void j$2(g p0,File p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public g a(){
       return this.a;
    }
    public void a(c p0){
       m om = g.a(this.b);
       p0.a(om);
       m.a(om);
    }
    public long b(){
       return this.b.length();
    }
}

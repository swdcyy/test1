package com.kuaishou.tachikoma.api.d$a;
import com.tachikoma.core.bridge.a$b;
import com.tkruntime.v8.V8;
import tx4.w;
import tx4.f;
import java.lang.Object;
import java.util.concurrent.Executor;
import com.tachikoma.core.bridge.a;

public class d$a	// class@000f7d
{
    public final a$b a;
    public final V8 b;
    public final w c;
    public final boolean d;
    public final f e;
    public final Executor f;

    public void d$a(a$b p0,V8 p1,boolean p2,w p3,f p4){
       super();
       this.a = p0;
       this.b = p1;
       this.d = p2;
       this.c = p3;
       this.e = p4;
       this.f = a.b(true, p0);
    }
}

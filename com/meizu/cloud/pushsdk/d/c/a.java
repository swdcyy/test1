package com.meizu.cloud.pushsdk.d.c.a;
import com.meizu.cloud.pushsdk.d.c.a$a;
import java.lang.Object;
import java.util.List;
import com.meizu.cloud.pushsdk.d.f.d;
import java.lang.String;
import com.meizu.cloud.pushsdk.d.a.c;
import java.lang.Long;
import java.util.ArrayList;
import java.util.Collection;

public class a	// class@001514
{
    public final List a;
    public final long b;
    public final String c;

    public void a(a$a p0){
       super();
       d.a(a$a.a(p0));
       d.a(a$a.b(p0));
       d.a(((a$a.b(p0)).isEmpty() ^ 0x01), "eventId cannot be empty");
       this.a = a$a.a(p0);
       this.b = a$a.c(p0);
       this.c = a$a.b(p0);
    }
    public c a(c p0){
       p0.a("ei", this.c());
       p0.a("ts", Long.toString(this.b()));
       return p0;
    }
    public List a(){
       return new ArrayList(this.a);
    }
    public long b(){
       return this.b;
    }
    public String c(){
       return this.c;
    }
}

package com.meizu.cloud.pushsdk.c.c.h$a;
import java.util.UUID;
import java.lang.String;
import java.lang.Object;
import com.meizu.cloud.pushsdk.c.c.h;
import java.util.ArrayList;
import com.meizu.cloud.pushsdk.c.g.e;
import com.meizu.cloud.pushsdk.c.c.c;
import com.meizu.cloud.pushsdk.c.c.j;
import com.meizu.cloud.pushsdk.c.c.h$b;
import com.meizu.cloud.pushsdk.c.c.g;
import java.util.Objects;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.util.List;
import java.lang.IllegalStateException;

public final class h$a	// class@0014d4
{
    public final e a;
    public g b;
    public final List c;

    public void h$a(){
       super(UUID.randomUUID().toString());
    }
    public void h$a(String p0){
       super();
       this.b = h.a;
       this.c = new ArrayList();
       this.a = e.a(p0);
    }
    public h$a a(c p0,j p1){
       return this.a(h$b.a(p0, p1));
    }
    public h$a a(g p0){
       Objects.requireNonNull(p0, "type == null");
       if (!("multipart").equals(p0.a())) {
          throw new IllegalArgumentException("multipart != "+p0);
       }
       this.b = p0;
       return this;
    }
    public h$a a(h$b p0){
       Objects.requireNonNull(p0, "part == null");
       this.c.add(p0);
       return this;
    }
    public h a(){
       if (!this.c.isEmpty()) {
          return new h(this.a, this.b, this.c);
       }
       throw new IllegalStateException("Multipart body must have at least one part.");
    }
}

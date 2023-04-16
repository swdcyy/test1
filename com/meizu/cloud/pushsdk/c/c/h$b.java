package com.meizu.cloud.pushsdk.c.c.h$b;
import com.meizu.cloud.pushsdk.c.c.c;
import com.meizu.cloud.pushsdk.c.c.j;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.IllegalArgumentException;

public final class h$b	// class@0014d5
{
    public final c a;
    public final j b;

    public void h$b(c p0,j p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static c a(h$b p0){
       return p0.a;
    }
    public static h$b a(c p0,j p1){
       Objects.requireNonNull(p1, "body == null");
       if (p0 != null && p0.a("Content-Type") != null) {
          throw new IllegalArgumentException("Unexpected header: Content-Type");
       }
       if (p0 == null || p0.a("Content-Length") == null) {
          return new h$b(p0, p1);
       }
       throw new IllegalArgumentException("Unexpected header: Content-Length");
    }
    public static j b(h$b p0){
       return p0.b;
    }
}

package com.meizu.cloud.pushsdk.c.g.k;
import java.lang.Object;
import com.meizu.cloud.pushsdk.c.g.j;
import java.lang.IllegalArgumentException;

public final class k	// class@0014f7
{
    public static j a;
    public static long b;

    public void k(){
       super();
    }
    public static j a(){
       k ok = k.class;
       _monitor_enter(ok);
       j a = k.a;
       if (a != null) {
          k.a = a.f;
          a.f = null;
          k.b = k.b - 2048;
          _monitor_exit(ok);
          return a;
       }else {
          _monitor_exit(ok);
          return new j();
       }
    }
    public static void a(j p0){
       if (p0.f != null || p0.g != null) {
          throw new IllegalArgumentException();
       }
       if (p0.d != null) {
          return;
       }
       _monitor_enter(k.class);
       long b = k.b;
       if ((b + 2048) - 0x10000 > 0) {
          _monitor_exit(k.class);
          return;
       }else {
          k.b = b + 2048;
          p0.f = k.a;
          p0.c = 0;
          p0.b = 0;
          k.a = p0;
          _monitor_exit(k.class);
          return;
       }
    }
}

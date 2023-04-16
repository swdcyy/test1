package io.netty.channel.y$a;
import io.netty.channel.b0$a;
import java.lang.Object;
import io.netty.buffer.d;
import kqd.f;
import io.netty.channel.a0;

public final class y$a implements b0$a	// class@0010d1
{
    public final int a;

    public void y$a(int p0){
       super();
       this.a = p0;
    }
    public int a(Object p0){
       if (p0 instanceof d) {
          return p0.L5();
       }
       if (p0 instanceof f) {
          return p0.m().L5();
       }
       if (p0 instanceof a0) {
          return 0;
       }
       return this.a;
    }
}

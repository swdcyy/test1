package io.netty.channel.y;
import io.netty.channel.b0;
import java.lang.Object;
import io.netty.channel.y$a;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import io.netty.channel.b0$a;

public final class y implements b0	// class@0010d2
{
    public final b0$a a;
    public static final b0 b;

    static {
       y.b = new y(8);
    }
    public void y(int p0){
       super();
       if (p0 < 0) {
          throw new IllegalArgumentException("unknownSize: "+p0+" \(expected: >= 0\)");
       }
       this.a = new y$a(p0);
       return;
    }
    public b0$a a(){
       return this.a;
    }
}

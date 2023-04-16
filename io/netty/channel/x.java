package io.netty.channel.x;
import lqd.p;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public abstract class x implements p	// class@0010d0
{
    public int a;

    public void x(){
       super(1);
    }
    public void x(int p0){
       super();
       this.c(p0);
    }
    public p c(int p0){
       if (p0 <= 0) {
          throw new IllegalArgumentException("maxMessagesPerRead: "+p0+" \(expected: > 0\)");
       }
       this.a = p0;
       return this;
    }
    public int e(){
       return this.a;
    }
}

package lqd.l;
import io.netty.channel.b;
import io.netty.channel.u;
import lqd.f;
import java.lang.String;
import io.netty.channel.g;
import io.netty.channel.j;
import io.netty.channel.n;
import java.lang.Object;
import java.util.Objects;

public final class l extends b	// class@001ca0
{
    public final g o;

    public void l(u p0,f p1,String p2,g p3){
       super(p0, p1, p2, p3 instanceof j, p3 instanceof n);
       Objects.requireNonNull(p3, "handler");
       this.o = p3;
    }
    public g n0(){
       return this.o;
    }
}

package lqd.q;
import lqd.c;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import io.netty.channel.d;
import io.netty.channel.ChannelException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import zqd.w;

public class q implements c	// class@001ca5
{
    public final Class a;

    public void q(Class p0){
       super();
       Objects.requireNonNull(p0, "clazz");
       this.a = p0;
    }
    public d a(){
       return this.a.newInstance();
    }
    public String toString(){
       return w.a(this.a)+".class";
    }
}

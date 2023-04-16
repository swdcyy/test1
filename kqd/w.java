package kqd.w;
import kqd.a;
import io.netty.util.internal.PlatformDependent;
import io.netty.buffer.d;
import io.netty.buffer.r;
import kqd.e;
import io.netty.buffer.p;
import kqd.x;
import io.netty.buffer.q;

public final class w extends a	// class@001b68
{
    public static final w d;

    static {
       w.d = new w(PlatformDependent.e());
    }
    public void w(boolean p0){
       super(p0);
    }
    public boolean e(){
       return false;
    }
    public d t(int p0,int p1){
       r or = (PlatformDependent.q())? new r(this, p0, p1): new p(this, p0, p1);
       return a.v(or);
    }
    public d u(int p0,int p1){
       x ox = (PlatformDependent.q())? new x(this, p0, p1): new q(this, p0, p1);
       return ox;
    }
}

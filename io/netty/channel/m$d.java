package io.netty.channel.m$d;
import io.netty.channel.m$d$a;
import io.netty.util.Recycler$e;
import java.lang.Object;
import io.netty.util.Recycler;

public final class m$d	// class@0010a7
{
    public final Recycler$e a;
    public m$d b;
    public Object c;
    public ByteBuffer[] d;
    public ByteBuffer e;
    public r f;
    public long g;
    public long h;
    public int i;
    public int j;
    public boolean k;
    public static final Recycler l;

    static {
       m$d.l = new m$d$a();
    }
    public void m$d(Recycler$e p0){
       super();
       this.j = -1;
       this.a = p0;
    }
    public void a(){
       this.b = null;
       this.d = null;
       this.e = null;
       this.c = null;
       this.f = null;
       this.g = 0;
       this.h = 0;
       this.i = 0;
       this.j = -1;
       this.k = false;
       m$d.l.c(this, this.a);
    }
}

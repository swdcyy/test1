package io.netty.util.Recycler$f;
import io.netty.util.Recycler;
import java.lang.Thread;
import java.lang.Object;
import java.lang.Math;
import io.netty.util.Recycler$d;

public final class Recycler$f	// class@0010e7
{
    public final Recycler a;
    public final Thread b;
    public Recycler$d[] c;
    public final int d;
    public int e;
    public Recycler$WeakOrderQueue f;
    public Recycler$WeakOrderQueue g;
    public Recycler$WeakOrderQueue h;

    public void Recycler$f(Recycler p0,Thread p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.d = p2;
       Recycler$d[] uodArray = new Recycler$d[Math.min(Recycler.h, p2)];
       this.c = uodArray;
    }
}

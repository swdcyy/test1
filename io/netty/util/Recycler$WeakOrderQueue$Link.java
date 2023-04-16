package io.netty.util.Recycler$WeakOrderQueue$Link;
import java.util.concurrent.atomic.AtomicInteger;
import io.netty.util.Recycler$d;
import io.netty.util.Recycler$a;

public final class Recycler$WeakOrderQueue$Link extends AtomicInteger	// class@0010e0
{
    public final Recycler$d[] elements;
    public Recycler$WeakOrderQueue$Link next;
    public int readIndex;

    public void Recycler$WeakOrderQueue$Link(){
       super();
       Recycler$d[] uodArray = new Recycler$d[16];
       this.elements = uodArray;
    }
    public void Recycler$WeakOrderQueue$Link(Recycler$a p0){
       super();
    }
}

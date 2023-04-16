package com.google.common.collect.StandardTable$g$a;
import java.util.Iterator;
import com.google.common.collect.StandardTable$g;
import java.lang.Object;
import java.util.Map$Entry;
import java.util.Objects;
import com.google.common.collect.r;

public class StandardTable$g$a implements Iterator	// class@00188c
{
    public final Iterator b;
    public final StandardTable$g c;

    public void StandardTable$g$a(StandardTable$g p0,Iterator p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public boolean hasNext(){
       return this.b.hasNext();
    }
    public Object next(){
       StandardTable$g$a tc = this.c;
       Objects.requireNonNull(tc);
       return new r(tc, this.b.next());
    }
    public void remove(){
       this.b.remove();
       this.c.e();
    }
}

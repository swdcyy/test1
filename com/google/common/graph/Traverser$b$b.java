package com.google.common.graph.Traverser$b$b;
import java.lang.Iterable;
import com.google.common.graph.Traverser$b;
import java.lang.Object;
import java.util.Iterator;
import com.google.common.graph.Traverser$b$e;
import com.google.common.graph.Traverser$Order;

public class Traverser$b$b implements Iterable	// class@0018db
{
    public final Object b;
    public final Traverser$b c;

    public void Traverser$b$b(Traverser$b p0,Object p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public Iterator iterator(){
       return new Traverser$b$e(this.c, this.b, Traverser$Order.PREORDER);
    }
}

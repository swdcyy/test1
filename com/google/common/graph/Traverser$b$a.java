package com.google.common.graph.Traverser$b$a;
import java.lang.Iterable;
import com.google.common.graph.Traverser$b;
import java.lang.Object;
import java.util.Iterator;
import com.google.common.graph.Traverser$b$d;

public class Traverser$b$a implements Iterable	// class@0018da
{
    public final Object b;
    public final Traverser$b c;

    public void Traverser$b$a(Traverser$b p0,Object p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public Iterator iterator(){
       return new Traverser$b$d(this.c, this.b);
    }
}

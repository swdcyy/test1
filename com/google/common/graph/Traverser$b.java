package com.google.common.graph.Traverser$b;
import com.google.common.graph.Traverser;
import rk.f0;
import com.google.common.graph.Traverser$a;
import java.lang.Object;
import ok.n;
import java.lang.Iterable;
import com.google.common.graph.Traverser$b$a;
import com.google.common.graph.Traverser$b$c;
import com.google.common.graph.Traverser$b$b;

public final class Traverser$b extends Traverser	// class@0018e0
{
    public final f0 a;

    public void Traverser$b(f0 p0){
       super(null);
       n.j(p0);
       this.a = p0;
    }
    public Iterable a(Object p0){
       n.j(p0);
       this.d(p0);
       return new Traverser$b$a(this, p0);
    }
    public Iterable b(Object p0){
       n.j(p0);
       this.d(p0);
       return new Traverser$b$c(this, p0);
    }
    public Iterable c(Object p0){
       n.j(p0);
       this.d(p0);
       return new Traverser$b$b(this, p0);
    }
    public final void d(Object p0){
       this.a.b(p0);
    }
}

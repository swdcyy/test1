package com.google.common.collect.e$b;
import java.util.AbstractCollection;
import java.util.Collection;
import ok.h;
import java.lang.Object;
import ok.n;
import java.util.Iterator;
import com.google.common.collect.Iterators;

public class e$b extends AbstractCollection	// class@0018b4
{
    public final Collection b;
    public final h c;

    public void e$b(Collection p0,h p1){
       super();
       n.j(p0);
       this.b = p0;
       n.j(p1);
       this.c = p1;
    }
    public void clear(){
       this.b.clear();
    }
    public boolean isEmpty(){
       return this.b.isEmpty();
    }
    public Iterator iterator(){
       return Iterators.s(this.b.iterator(), this.c);
    }
    public int size(){
       return this.b.size();
    }
}

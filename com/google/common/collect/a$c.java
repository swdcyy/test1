package com.google.common.collect.a$c;
import java.util.AbstractCollection;
import com.google.common.collect.a;
import qk.g0;
import java.lang.Object;
import java.util.Iterator;

public class a$c extends AbstractCollection	// class@0018a8
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void clear(){
       this.b.clear();
    }
    public boolean contains(Object p0){
       return this.b.containsValue(p0);
    }
    public Iterator iterator(){
       return this.b.valueIterator();
    }
    public int size(){
       return this.b.size();
    }
}

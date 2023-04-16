package com.google.common.collect.d$c;
import java.util.AbstractCollection;
import com.google.common.collect.d;
import java.lang.Object;
import java.util.Iterator;
import com.google.common.collect.s;

public class d$c extends AbstractCollection	// class@0018b1
{
    public final d b;

    public void d$c(d p0){
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
       return this.b.valuesIterator();
    }
    public int size(){
       return this.b.size();
    }
}

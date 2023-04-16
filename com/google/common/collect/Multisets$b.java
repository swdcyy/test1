package com.google.common.collect.Multisets$b;
import com.google.common.collect.o$e;
import com.google.common.collect.k;
import java.util.Collection;
import java.lang.Object;
import java.util.Iterator;
import java.util.Set;

public abstract class Multisets$b extends o$e	// class@00185f
{

    public void Multisets$b(){
       super();
    }
    public abstract k b();
    public void clear(){
       this.b().clear();
    }
    public boolean contains(Object p0){
       return this.b().contains(p0);
    }
    public boolean containsAll(Collection p0){
       return this.b().containsAll(p0);
    }
    public boolean isEmpty(){
       return this.b().isEmpty();
    }
    public abstract Iterator iterator();
    public boolean remove(Object p0){
       boolean b = (this.b().remove(p0, Integer.MAX_VALUE) > 0)? true: false;
       return b;
    }
    public int size(){
       return this.b().entrySet().size();
    }
}

package com.google.common.collect.Lists$TransformingRandomAccessList;
import java.util.RandomAccess;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.List;
import ok.h;
import java.lang.Object;
import ok.n;
import java.util.Iterator;
import java.util.ListIterator;
import com.google.common.collect.Lists$TransformingRandomAccessList$a;

public class Lists$TransformingRandomAccessList extends AbstractList implements RandomAccess, Serializable	// class@00181e
{
    public final List fromList;
    public final h function;
    public static final long serialVersionUID;

    public void Lists$TransformingRandomAccessList(List p0,h p1){
       super();
       n.j(p0);
       this.fromList = p0;
       n.j(p1);
       this.function = p1;
    }
    public void clear(){
       this.fromList.clear();
    }
    public Object get(int p0){
       return this.function.apply(this.fromList.get(p0));
    }
    public boolean isEmpty(){
       return this.fromList.isEmpty();
    }
    public Iterator iterator(){
       return this.listIterator();
    }
    public ListIterator listIterator(int p0){
       return new Lists$TransformingRandomAccessList$a(this, this.fromList.listIterator(p0));
    }
    public Object remove(int p0){
       return this.function.apply(this.fromList.remove(p0));
    }
    public int size(){
       return this.fromList.size();
    }
}

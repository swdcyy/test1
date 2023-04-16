package com.google.common.collect.ImmutableCollection;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.util.Collection;
import com.google.common.collect.ImmutableList;
import qk.t0;
import java.util.Iterator;
import ok.n;
import qk.h0;

public abstract class ImmutableCollection extends AbstractCollection implements Serializable	// class@0004d4
{
    public static final Object[] b;

    static {
       Object[] objArray = new Object[0];
       ImmutableCollection.b = objArray;
    }
    public void ImmutableCollection(){
       super();
    }
    public final boolean add(Object p0){
       throw new UnsupportedOperationException();
    }
    public final boolean addAll(Collection p0){
       throw new UnsupportedOperationException();
    }
    public ImmutableList asList(){
       ImmutableList immutableLis = (this.isEmpty())? ImmutableList.of(): ImmutableList.asImmutableList(this.toArray());
       return immutableLis;
    }
    public final void clear(){
       throw new UnsupportedOperationException();
    }
    public abstract boolean contains(Object p0);
    public int copyIntoArray(Object[] p0,int p1){
       t0 ot0 = this.iterator();
       while (ot0.hasNext()) {
          int i = p1 + 1;
          p0[p1] = ot0.next();
          p1 = i;
       }
       return p1;
    }
    public abstract boolean isPartialView();
    public Iterator iterator(){
       return this.iterator();
    }
    public abstract t0 iterator();
    public final boolean remove(Object p0){
       throw new UnsupportedOperationException();
    }
    public final boolean removeAll(Collection p0){
       throw new UnsupportedOperationException();
    }
    public final boolean retainAll(Collection p0){
       throw new UnsupportedOperationException();
    }
    public final Object[] toArray(){
       int i = this.size();
       if (!i) {
          return ImmutableCollection.b;
       }
       Object[] objArray = new Object[i];
       this.copyIntoArray(objArray, 0);
       return objArray;
    }
    public final Object[] toArray(Object[] p0){
       n.j(p0);
       int i = this.size();
       if (p0.length < i) {
          p0 = h0.d(p0, i);
       }else if(p0.length > i){
          p0[i] = null;
       }
       this.copyIntoArray(p0, 0);
       return p0;
    }
}

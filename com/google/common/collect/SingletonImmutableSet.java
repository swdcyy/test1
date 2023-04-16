package com.google.common.collect.SingletonImmutableSet;
import com.google.common.collect.ImmutableSet;
import java.lang.Object;
import ok.n;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import qk.t0;
import qk.b0;
import java.lang.String;
import java.lang.StringBuilder;

public final class SingletonImmutableSet extends ImmutableSet	// class@000518
{
    public int d;
    public final Object element;

    public void SingletonImmutableSet(Object p0){
       super();
       n.j(p0);
       this.element = p0;
    }
    public void SingletonImmutableSet(Object p0,int p1){
       super();
       this.element = p0;
       this.d = p1;
    }
    public boolean contains(Object p0){
       return this.element.equals(p0);
    }
    public int copyIntoArray(Object[] p0,int p1){
       p0[p1] = this.element;
       p1++;
       return p1;
    }
    public ImmutableList createAsList(){
       return ImmutableList.of(this.element);
    }
    public final int hashCode(){
       SingletonImmutableSet td = this.d;
       if (td == null) {
          td = this.element.hashCode();
          this.d = td;
       }
       return td;
    }
    public boolean isHashCodeFast(){
       boolean b = (this.d != null)? true: false;
       return b;
    }
    public boolean isPartialView(){
       return false;
    }
    public Iterator iterator(){
       return this.iterator();
    }
    public t0 iterator(){
       return new b0(this.element);
    }
    public int size(){
       return 1;
    }
    public String toString(){
       return '['+this.element.toString()+']';
    }
}

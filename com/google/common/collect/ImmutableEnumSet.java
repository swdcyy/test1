package com.google.common.collect.ImmutableEnumSet;
import com.google.common.collect.ImmutableSet;
import java.util.EnumSet;
import com.google.common.collect.ImmutableEnumSet$a;
import java.lang.Iterable;
import java.lang.Object;
import qk.y;
import java.util.Collection;
import java.util.Iterator;
import qk.t0;
import com.google.common.collect.Iterators;
import java.lang.String;

public final class ImmutableEnumSet extends ImmutableSet	// class@0017db
{
    public final EnumSet d;
    public int e;

    public void ImmutableEnumSet(EnumSet p0){
       super();
       this.d = p0;
    }
    public void ImmutableEnumSet(EnumSet p0,ImmutableEnumSet$a p1){
       super(p0);
    }
    public static ImmutableSet asImmutable(EnumSet p0){
       int i = p0.size();
       if (!i) {
          return ImmutableSet.of();
       }
       if (i != 1) {
          return new ImmutableEnumSet(p0);
       }
       return ImmutableSet.of(y.n(p0));
    }
    public boolean contains(Object p0){
       return this.d.contains(p0);
    }
    public boolean containsAll(Collection p0){
       ImmutableEnumSet d;
       if (p0 instanceof ImmutableEnumSet) {
          d = p0.d;
       }
       return this.d.containsAll(d);
    }
    public boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (p0 instanceof ImmutableEnumSet) {
          p0 = p0.d;
       }
       return this.d.equals(p0);
    }
    public int hashCode(){
       ImmutableEnumSet te = this.e;
       if (te == null) {
          te = this.d.hashCode();
          this.e = te;
       }
       return te;
    }
    public boolean isEmpty(){
       return this.d.isEmpty();
    }
    public boolean isHashCodeFast(){
       return true;
    }
    public boolean isPartialView(){
       return false;
    }
    public Iterator iterator(){
       return this.iterator();
    }
    public t0 iterator(){
       return Iterators.u(this.d.iterator());
    }
    public int size(){
       return this.d.size();
    }
    public String toString(){
       return this.d.toString();
    }
}

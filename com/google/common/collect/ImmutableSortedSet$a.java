package com.google.common.collect.ImmutableSortedSet$a;
import com.google.common.collect.ImmutableSet$a;
import java.util.Comparator;
import java.lang.Object;
import ok.n;
import com.google.common.collect.ImmutableCollection$b;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableCollection$a;
import java.util.Iterator;
import com.google.common.collect.ImmutableSet;
import java.util.AbstractCollection;

public final class ImmutableSortedSet$a extends ImmutableSet$a	// class@001807
{
    public final Comparator f;

    public void ImmutableSortedSet$a(Comparator p0){
       super();
       n.j(p0);
       this.f = p0;
    }
    public ImmutableCollection$b a(Object p0){
       this.l(p0);
       return this;
    }
    public ImmutableCollection d(){
       return this.n();
    }
    public ImmutableCollection$a f(Object p0){
       this.l(p0);
       return this;
    }
    public ImmutableSet$a h(Object p0){
       this.l(p0);
       return this;
    }
    public ImmutableSet$a i(Object[] p0){
       super.i(p0);
       return this;
    }
    public ImmutableSet$a j(Iterator p0){
       this.m(p0);
       return this;
    }
    public ImmutableSet k(){
       return this.n();
    }
    public ImmutableSortedSet$a l(Object p0){
       super.h(p0);
       return this;
    }
    public ImmutableSortedSet$a m(Iterator p0){
       super.j(p0);
       return this;
    }
    public ImmutableSortedSet n(){
       ImmutableSortedSet immutableSor = ImmutableSortedSet.construct(this.f, this.b, this.a);
       this.b = immutableSor.size();
       this.c = true;
       return immutableSor;
    }
}

package com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.k;
import com.google.common.collect.ImmutableMultisetGwtSerializationDependencies;
import java.lang.Object;
import com.google.common.collect.ImmutableMultiset$b;
import java.util.Collection;
import java.util.Iterator;
import com.google.common.collect.k$a;
import java.lang.Iterable;
import com.google.common.collect.ImmutableCollection;
import java.util.Set;
import com.google.common.collect.Multisets;
import com.google.common.collect.RegularImmutableMultiset;
import com.google.common.collect.AbstractMapBasedMultiset;
import com.google.common.collect.l;
import java.lang.Math;
import com.google.common.collect.ImmutableCollection$b;
import java.lang.UnsupportedOperationException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import qk.t0;
import java.util.Arrays;
import java.util.AbstractCollection;
import com.google.common.collect.ImmutableMultiset$EntrySet;
import com.google.common.collect.ImmutableMultiset$a;
import com.google.common.collect.o;
import java.lang.String;

public abstract class ImmutableMultiset extends ImmutableMultisetGwtSerializationDependencies implements k	// class@0017f6
{
    public ImmutableList c;
    public ImmutableSet d;

    public void ImmutableMultiset(){
       super();
    }
    public static ImmutableMultiset b(Object[] p0){
       ImmutableMultiset$b uob = new ImmutableMultiset$b();
       uob.g(p0);
       return uob.i();
    }
    public static ImmutableMultiset$b builder(){
       return new ImmutableMultiset$b();
    }
    public static ImmutableMultiset copyFromEntries(Collection p0){
       ImmutableMultiset$b uob = new ImmutableMultiset$b(p0.size());
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          k$a uoa = iterator.next();
          Object element = uoa.getElement();
          uob.h(element, uoa.getCount());
       }
       return uob.i();
    }
    public static ImmutableMultiset copyOf(Iterable p0){
       RegularImmutableMultiset contents;
       if (p0 instanceof ImmutableMultiset) {
          ImmutableCollection immutableCol = p0;
          if (!immutableCol.isPartialView()) {
             return immutableCol;
          }
       }
       int i = (v1 = p0 instanceof k)? p0.elementSet().size(): 11;
       ImmutableMultiset$b uob = new ImmutableMultiset$b(i);
       if (v1) {
          k ok = Multisets.a(p0);
          if (ok instanceof RegularImmutableMultiset) {
             contents = ok.contents;
          }else if(ok instanceof AbstractMapBasedMultiset){
             contents = ok.backingMap;
          }else {
             contents = null;
          }
          if (contents != null) {
             ImmutableMultiset$b a = uob.a;
             a.a(Math.max(a.t(), contents.t()));
             for (int i1 = contents.b(); i1 >= 0; i1 = contents.m(i1)) {
                uob.h(contents.f(i1), contents.h(i1));
             }
          }else {
             ImmutableMultiset$b a1 = uob.a;
             a1.a(Math.max(a1.t(), ok.entrySet().size()));
             Iterator iterator = ok.entrySet().iterator();
             while (iterator.hasNext()) {
                k$a uoa = iterator.next();
                Object element = uoa.getElement();
                uob.h(element, uoa.getCount());
             }
          }
       }else {
          uob.b(p0);
       }
       return uob.i();
    }
    public static ImmutableMultiset copyOf(Iterator p0){
       ImmutableMultiset$b uob = new ImmutableMultiset$b();
       uob.c(p0);
       return uob.i();
    }
    public static ImmutableMultiset copyOf(Object[] p0){
       return ImmutableMultiset.b(p0);
    }
    public static ImmutableMultiset of(){
       return RegularImmutableMultiset.EMPTY;
    }
    public static ImmutableMultiset of(Object p0){
       Object[] objArray = new Object[]{p0};
       return ImmutableMultiset.b(objArray);
    }
    public static ImmutableMultiset of(Object p0,Object p1){
       Object[] objArray = new Object[]{p0,p1};
       return ImmutableMultiset.b(objArray);
    }
    public static ImmutableMultiset of(Object p0,Object p1,Object p2){
       Object[] objArray = new Object[]{p0,p1,p2};
       return ImmutableMultiset.b(objArray);
    }
    public static ImmutableMultiset of(Object p0,Object p1,Object p2,Object p3){
       Object[] objArray = new Object[]{p0,p1,p2,p3};
       return ImmutableMultiset.b(objArray);
    }
    public static ImmutableMultiset of(Object p0,Object p1,Object p2,Object p3,Object p4){
       Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
       return ImmutableMultiset.b(objArray);
    }
    public static ImmutableMultiset of(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object[] p6){
       ImmutableMultiset$b uob = new ImmutableMultiset$b();
       uob.f(p0);
       uob.f(p1);
       uob.f(p2);
       uob.f(p3);
       uob.f(p4);
       uob.f(p5);
       uob.g(p6);
       return uob.i();
    }
    public final int add(Object p0,int p1){
       throw new UnsupportedOperationException();
    }
    public ImmutableList asList(){
       ImmutableMultiset tc = this.c;
       if (tc == null) {
          tc = super.asList();
          this.c = tc;
       }
       return tc;
    }
    public boolean contains(Object p0){
       boolean b = (this.count(p0) > 0)? true: false;
       return b;
    }
    public int copyIntoArray(Object[] p0,int p1){
       t0 ot0 = this.entrySet().iterator();
       while (ot0.hasNext()) {
          k$a uoa = ot0.next();
          int i = uoa.getCount() + p1;
          Arrays.fill(p0, p1, i, uoa.getElement());
          p1 = p1 + uoa.getCount();
       }
       return p1;
    }
    public abstract ImmutableSet elementSet();
    public Set elementSet(){
       return this.elementSet();
    }
    public ImmutableSet entrySet(){
       ImmutableMultiset td = this.d;
       if (td == null) {
          td = (this.isEmpty())? ImmutableSet.of(): new ImmutableMultiset$EntrySet(this, null);
          this.d = td;
       }
       return td;
    }
    public Set entrySet(){
       return this.entrySet();
    }
    public boolean equals(Object p0){
       return Multisets.b(this, p0);
    }
    public abstract k$a getEntry(int p0);
    public int hashCode(){
       return o.d(this.entrySet());
    }
    public Iterator iterator(){
       return this.iterator();
    }
    public t0 iterator(){
       return new ImmutableMultiset$a(this, this.entrySet().iterator());
    }
    public final int remove(Object p0,int p1){
       throw new UnsupportedOperationException();
    }
    public final int setCount(Object p0,int p1){
       throw new UnsupportedOperationException();
    }
    public final boolean setCount(Object p0,int p1,int p2){
       throw new UnsupportedOperationException();
    }
    public String toString(){
       return this.entrySet().toString();
    }
}

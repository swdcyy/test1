package com.google.common.collect.ImmutableSetMultimap;
import qk.m0;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMap;
import java.util.Comparator;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap$a;
import com.google.common.collect.RegularImmutableSortedSet;
import com.google.common.collect.ImmutableSortedSet;
import java.lang.Iterable;
import java.util.Iterator;
import java.lang.Object;
import java.util.Map$Entry;
import com.google.common.collect.ImmutableMultimap$c;
import qk.g0;
import ok.n;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import com.google.common.collect.ImmutableMap$b;
import java.util.AbstractCollection;
import com.google.common.collect.EmptyImmutableSetMultimap;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableSetMultimap$EntrySet;
import ok.j;
import qk.t0;
import java.io.ObjectInputStream;
import com.google.common.collect.ImmutableSet$a;
import com.google.common.collect.ImmutableSortedSet$a;
import java.io.InvalidObjectException;
import java.lang.StringBuilder;
import java.lang.String;
import com.google.common.collect.ImmutableMultimap$d;
import com.google.common.collect.m$a;
import java.util.Objects;
import java.lang.Integer;
import java.lang.reflect.Field;
import com.google.common.collect.ImmutableSetMultimap$b;
import java.lang.AssertionError;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import java.lang.UnsupportedOperationException;
import java.io.ObjectOutputStream;
import com.google.common.collect.m;

public class ImmutableSetMultimap extends ImmutableMultimap implements m0	// class@0017ff
{
    public final ImmutableSet g;
    public ImmutableSetMultimap h;
    public ImmutableSet i;
    public static final long serialVersionUID;

    public void ImmutableSetMultimap(ImmutableMap p0,int p1,Comparator p2){
       super(p0, p1);
       this.g = ImmutableSetMultimap.c(p2);
    }
    public static ImmutableSetMultimap$a builder(){
       return new ImmutableSetMultimap$a();
    }
    public static ImmutableSet c(Comparator p0){
       ImmutableSet immutableSet = (p0 == null)? ImmutableSet.of(): ImmutableSortedSet.emptySet(p0);
       return immutableSet;
    }
    public static ImmutableSetMultimap copyOf(Iterable p0){
       ImmutableSetMultimap$a uoa = new ImmutableSetMultimap$a();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uoa.c(iterator.next());
       }
       return uoa.d();
    }
    public static ImmutableSetMultimap copyOf(g0 p0){
       ImmutableSetMultimap immutableSet;
       n.j(p0);
       if (p0.isEmpty()) {
          immutableSet = ImmutableSetMultimap.of();
       }else if(p0 instanceof ImmutableSetMultimap){
          ImmutableMultimap immutableMul = p0;
          if (!immutableMul.isPartialView()) {
             immutableSet = immutableMul;
          }
       }
       immutableSet = ImmutableSetMultimap.fromMapEntries(p0.asMap().entrySet(), null);
       return immutableSet;
    }
    public static ImmutableSetMultimap fromMapEntries(Collection p0,Comparator p1){
       if (p0.isEmpty()) {
          return ImmutableSetMultimap.of();
       }
       ImmutableMap$b uob = new ImmutableMap$b(p0.size());
       int i = 0;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Object key = uEntry.getKey();
          Collection value = uEntry.getValue();
          ImmutableSet immutableSet = (p1 == null)? ImmutableSet.copyOf(value): ImmutableSortedSet.copyOf(p1, value);
          if (!immutableSet.isEmpty()) {
             uob.c(key, immutableSet);
             i = i + immutableSet.size();
          }
       }
       return new ImmutableSetMultimap(uob.a(), i, p1);
    }
    public static ImmutableSetMultimap of(){
       return EmptyImmutableSetMultimap.INSTANCE;
    }
    public static ImmutableSetMultimap of(Object p0,Object p1){
       ImmutableSetMultimap$a uoa = ImmutableSetMultimap.builder();
       uoa.e(p0, p1);
       return uoa.d();
    }
    public static ImmutableSetMultimap of(Object p0,Object p1,Object p2,Object p3){
       ImmutableSetMultimap$a uoa = ImmutableSetMultimap.builder();
       uoa.e(p0, p1);
       uoa.e(p2, p3);
       return uoa.d();
    }
    public static ImmutableSetMultimap of(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5){
       ImmutableSetMultimap$a uoa = ImmutableSetMultimap.builder();
       uoa.e(p0, p1);
       uoa.e(p2, p3);
       uoa.e(p4, p5);
       return uoa.d();
    }
    public static ImmutableSetMultimap of(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,Object p7){
       ImmutableSetMultimap$a uoa = ImmutableSetMultimap.builder();
       uoa.e(p0, p1);
       uoa.e(p2, p3);
       uoa.e(p4, p5);
       uoa.e(p6, p7);
       return uoa.d();
    }
    public static ImmutableSetMultimap of(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,Object p7,Object p8,Object p9){
       ImmutableSetMultimap$a uoa = ImmutableSetMultimap.builder();
       uoa.e(p0, p1);
       uoa.e(p2, p3);
       uoa.e(p4, p5);
       uoa.e(p6, p7);
       uoa.e(p8, p9);
       return uoa.d();
    }
    public ImmutableCollection entries(){
       return this.entries();
    }
    public ImmutableSet entries(){
       ImmutableSetMultimap ti = this.i;
       if (ti == null) {
          ti = new ImmutableSetMultimap$EntrySet(this);
          this.i = ti;
       }
       return ti;
    }
    public Collection entries(){
       return this.entries();
    }
    public Set entries(){
       return this.entries();
    }
    public ImmutableCollection get(Object p0){
       return this.get(p0);
    }
    public ImmutableSet get(Object p0){
       return j.a(this.map.get(p0), this.g);
    }
    public Collection get(Object p0){
       return this.get(p0);
    }
    public Set get(Object p0){
       return this.get(p0);
    }
    public ImmutableMultimap inverse(){
       return this.inverse();
    }
    public ImmutableSetMultimap inverse(){
       ImmutableSetMultimap th = this.h;
       if (th == null) {
          ImmutableSetMultimap$a uoa = ImmutableSetMultimap.builder();
          t0 ot0 = this.entries().iterator();
          while (ot0.hasNext()) {
             Map$Entry uEntry = ot0.next();
             Object value = uEntry.getValue();
             uoa.e(value, uEntry.getKey());
          }
          th = uoa.d();
          th.h = this;
          this.h = th;
       }
       return th;
    }
    public final void readObject(ObjectInputStream p0){
       Object obj;
       p0.defaultReadObject();
       Comparator uComparator = p0.readObject();
       int i = p0.readInt();
       if (i < 0) {
          throw new InvalidObjectException("Invalid key count "+i);
       }
       ImmutableMap$b uob = ImmutableMap.builder();
       int i1 = 0;
       int i2 = 0;
       while (true) {
          if (i1 < i) {
             obj = p0.readObject();
             int i3 = p0.readInt();
             if (i3 <= 0) {
                throw new InvalidObjectException("Invalid value count "+i3);
             }
             ImmutableSet$a uoa = (uComparator == null)? new ImmutableSet$a(): new ImmutableSortedSet$a(uComparator);
             for (int i4 = 0; i4 < i3; i4 = i4 + 1) {
                uoa.h(p0.readObject());
             }
             ImmutableSet immutableSet = uoa.k();
             if (immutableSet.size() == i3) {
                uob.c(obj, immutableSet);
                i2 = i2 + i3;
                i1 = i1 + 1;
             }else {
             }
          }else {
             try{
                ImmutableMultimap$d.a.a(this, uob.a());
                m$a b = ImmutableMultimap$d.b;
                try{
                   Objects.requireNonNull(b);
                   b.a.set(this, Integer.valueOf(i2));
                   ImmutableSetMultimap$b.a.a(this, ImmutableSetMultimap.c(uComparator));
                   return;
                }catch(java.lang.IllegalAccessException e12){
                   throw new AssertionError(e12);
                }
             }catch(java.lang.IllegalArgumentException e12){
                throw new InvalidObjectException(e12.getMessage()).initCause(e12);
             }
          }
       }
       throw new InvalidObjectException("Duplicate key-value pairs exist for key "+obj);
    }
    public ImmutableCollection removeAll(Object p0){
       return this.removeAll(p0);
    }
    public ImmutableSet removeAll(Object p0){
       throw new UnsupportedOperationException();
    }
    public Collection removeAll(Object p0){
       return this.removeAll(p0);
    }
    public Set removeAll(Object p0){
       return this.removeAll(p0);
    }
    public ImmutableCollection replaceValues(Object p0,Iterable p1){
       return this.replaceValues(p0, p1);
    }
    public ImmutableSet replaceValues(Object p0,Iterable p1){
       throw new UnsupportedOperationException();
    }
    public Collection replaceValues(Object p0,Iterable p1){
       return this.replaceValues(p0, p1);
    }
    public Set replaceValues(Object p0,Iterable p1){
       return this.replaceValues(p0, p1);
    }
    public Comparator valueComparator(){
       ImmutableSetMultimap tg = this.g;
       Comparator uComparator = (tg instanceof ImmutableSortedSet)? tg.comparator(): null;
       return uComparator;
    }
    public final void writeObject(ObjectOutputStream p0){
       p0.defaultWriteObject();
       p0.writeObject(this.valueComparator());
       m.d(this, p0);
    }
}

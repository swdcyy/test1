package com.google.common.reflect.TypeToken$f;
import com.google.common.reflect.TypeToken$f$a;
import com.google.common.reflect.TypeToken$f$b;
import java.lang.Object;
import com.google.common.reflect.TypeToken$a;
import java.util.Map;
import java.lang.Integer;
import java.lang.Class;
import java.lang.Iterable;
import java.util.Iterator;
import java.lang.Math;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.google.common.reflect.f;
import java.util.Comparator;
import java.util.Set;

public abstract class TypeToken$f	// class@0018fd
{
    public static final TypeToken$f a;
    public static final TypeToken$f b;

    static {
       TypeToken$f.a = new TypeToken$f$a();
       TypeToken$f.b = new TypeToken$f$b();
    }
    public void TypeToken$f(){
       super();
    }
    public void TypeToken$f(TypeToken$a p0){
       super();
    }
    public final int a(Object p0,Map p1){
       Integer integer = p1.get(p0);
       if (integer != null) {
          return integer.intValue();
       }
       int b = this.d(p0).isInterface();
       Iterator iterator = this.c(p0).iterator();
       while (iterator.hasNext()) {
          b = Math.max(b, this.a(iterator.next(), p1));
       }
       Object obj = this.e(p0);
       if (obj != null) {
          b = Math.max(b, this.a(obj, p1));
       }
       b = b + 1;
       p1.put(p0, Integer.valueOf(b));
       return b;
    }
    public ImmutableList b(Iterable p0){
       HashMap hashMap = Maps.s();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          this.a(iterator.next(), hashMap);
       }
       return new f(Ordering.natural().reverse(), hashMap).immutableSortedCopy(hashMap.keySet());
    }
    public abstract Iterable c(Object p0);
    public abstract Class d(Object p0);
    public abstract Object e(Object p0);
}

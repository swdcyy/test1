package com.google.common.reflect.Types$WildcardTypeImpl;
import java.lang.reflect.WildcardType;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.Object;
import java.lang.String;
import com.google.common.reflect.Types;
import com.google.common.reflect.Types$JavaVersion;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.lang.StringBuilder;
import qk.t0;
import java.util.Iterator;
import ok.o;
import com.google.common.base.Predicates;
import java.lang.Iterable;
import qk.y;
import qk.y$a;

public final class Types$WildcardTypeImpl implements WildcardType, Serializable	// class@00190d
{
    public final ImmutableList lowerBounds;
    public final ImmutableList upperBounds;
    public static final long serialVersionUID;

    public void Types$WildcardTypeImpl(Type[] p0,Type[] p1){
       super();
       Types.a(p0, "lower bound for wildcard");
       Types.a(p1, "upper bound for wildcard");
       Types$JavaVersion cURRENT = Types$JavaVersion.CURRENT;
       this.lowerBounds = cURRENT.usedInGenericType(p0);
       this.upperBounds = cURRENT.usedInGenericType(p1);
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof WildcardType && (this.lowerBounds.equals(Arrays.asList(p0.getLowerBounds())) && this.upperBounds.equals(Arrays.asList(p0.getUpperBounds())))) {
          b = true;
       }
    label_0028 :
       return b;
    }
    public Type[] getLowerBounds(){
       return Types.j(this.lowerBounds);
    }
    public Type[] getUpperBounds(){
       return Types.j(this.upperBounds);
    }
    public int hashCode(){
       return (this.lowerBounds.hashCode() ^ this.upperBounds.hashCode());
    }
    public String toString(){
       String str = "?";
       t0 ot0 = this.lowerBounds.iterator();
       while (ot0.hasNext()) {
          str = str+" super "+Types$JavaVersion.CURRENT.typeName(ot0.next());
       }
       Iterator iterator = y.h(this.upperBounds, Predicates.g(Predicates.d(Object.class))).iterator();
       while (iterator.hasNext()) {
          str = str+" extends "+Types$JavaVersion.CURRENT.typeName(iterator.next());
       }
       return str;
    }
}

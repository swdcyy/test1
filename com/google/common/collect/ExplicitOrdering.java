package com.google.common.collect.ExplicitOrdering;
import java.io.Serializable;
import com.google.common.collect.Ordering;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Collection;
import com.google.common.collect.Maps;
import java.lang.Object;
import java.lang.Integer;
import com.google.common.collect.Ordering$IncomparableValueException;
import java.lang.String;
import java.lang.StringBuilder;
import com.google.common.collect.ImmutableSet;

public final class ExplicitOrdering extends Ordering implements Serializable	// class@0017c7
{
    public final ImmutableMap rankMap;
    public static final long serialVersionUID;

    public void ExplicitOrdering(ImmutableMap p0){
       super();
       this.rankMap = p0;
    }
    public void ExplicitOrdering(List p0){
       super(Maps.l(p0));
    }
    public final int a(Object p0){
       Integer integer = this.rankMap.get(p0);
       if (integer != null) {
          return integer.intValue();
       }
       throw new Ordering$IncomparableValueException(p0);
    }
    public int compare(Object p0,Object p1){
       return (this.a(p0) - this.a(p1));
    }
    public boolean equals(Object p0){
       if (p0 instanceof ExplicitOrdering) {
          return this.rankMap.equals(p0.rankMap);
       }
       return false;
    }
    public int hashCode(){
       return this.rankMap.hashCode();
    }
    public String toString(){
       return "Ordering.explicit\("+this.rankMap.keySet()+"\)";
    }
}

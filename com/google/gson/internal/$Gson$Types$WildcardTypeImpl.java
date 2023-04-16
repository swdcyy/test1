package com.google.gson.internal.$Gson$Types$WildcardTypeImpl;
import java.lang.reflect.WildcardType;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.Object;
import bl.a;
import com.google.gson.internal.$Gson$Types;
import java.lang.String;
import java.lang.StringBuilder;

public final class $Gson$Types$WildcardTypeImpl implements WildcardType, Serializable	// class@000564
{
    public final Type lowerBound;
    public final Type upperBound;
    public static final long serialVersionUID;

    public void $Gson$Types$WildcardTypeImpl(Type[] p0,Type[] p1){
       super();
       boolean b = true;
       boolean b1 = (p1.length <= b)? true: false;
       a.a(b1);
       b1 = (p0.length == b)? true: false;
       a.a(b1);
       if (p1.length == b) {
          a.b(p1[0]);
          $Gson$Types.c(p1[0]);
          if (p0[0] != Object.class) {
             b = false;
          }
          a.a(b);
          this.lowerBound = $Gson$Types.b(p1[0]);
          this.upperBound = Object.class;
       }else {
          a.b(p0[0]);
          $Gson$Types.c(p0[0]);
          this.lowerBound = null;
          this.upperBound = $Gson$Types.b(p0[0]);
       }
       return;
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof WildcardType && $Gson$Types.d(this, p0))? true: false;
       return b;
    }
    public Type[] getLowerBounds(){
       $Gson$Types$WildcardTypeImpl tlowerBound = this.lowerBound;
       Type[] typeArray = (tlowerBound != null)? new Type[]{tlowerBound}: $Gson$Types.a;
       return typeArray;
    }
    public Type[] getUpperBounds(){
       Type[] typeArray = new Type[]{this.upperBound};
       return typeArray;
    }
    public int hashCode(){
       $Gson$Types$WildcardTypeImpl tlowerBound = this.lowerBound;
       int i = (tlowerBound != null)? tlowerBound.hashCode() + 31: 1;
       return (i ^ (this.upperBound.hashCode() + 31));
    }
    public String toString(){
       if (this.lowerBound != null) {
          return "? super "+$Gson$Types.l(this.lowerBound);
       }
       if (this.upperBound == Object.class) {
          return "?";
       }
       return "? extends "+$Gson$Types.l(this.upperBound);
    }
}

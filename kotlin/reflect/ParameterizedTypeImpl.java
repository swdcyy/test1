package kotlin.reflect.ParameterizedTypeImpl;
import java.lang.reflect.ParameterizedType;
import vsd.v;
import java.lang.Class;
import java.lang.reflect.Type;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Collection;
import java.util.Objects;
import java.util.Arrays;
import java.lang.StringBuilder;
import kotlin.reflect.TypesJVMKt;
import kotlin.reflect.ParameterizedTypeImpl$getTypeName$1$1;
import java.lang.Appendable;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.ArraysKt___ArraysKt;

public final class ParameterizedTypeImpl implements ParameterizedType, v	// class@0018b7
{
    public final Type[] b;
    public final Class c;
    public final Type d;

    public void ParameterizedTypeImpl(Class p0,Type p1,List p2){
       a.p(p0, "rawType");
       a.p(p2, "typeArguments");
       super();
       this.c = p0;
       this.d = p1;
       Type[] typeArray = new Type[0];
       Object[] objArray = p2.toArray(typeArray);
       Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
       this.b = objArray;
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof ParameterizedType && (a.g(this.c, p0.getRawType()) && (a.g(this.d, p0.getOwnerType()) && Arrays.equals(this.getActualTypeArguments(), p0.getActualTypeArguments()))))? true: false;
       return b;
    }
    public Type[] getActualTypeArguments(){
       return this.b;
    }
    public Type getOwnerType(){
       return this.d;
    }
    public Type getRawType(){
       return this.c;
    }
    public String getTypeName(){
       StringBuilder str = "";
       ParameterizedTypeImpl td = this.d;
       str = (td != null)? str+TypesJVMKt.h(td)+"$"+this.c.getSimpleName(): str+TypesJVMKt.h(this.c);
       td = this.b;
       int i = 1;
       int i1 = (!td.length)? 1: 0;
       if (i1 ^ i) {
          ArraysKt___ArraysKt.og(td, str, null, "<", ">", 0, null, ParameterizedTypeImpl$getTypeName$1$1.INSTANCE, 50, null);
       }
       String str1 = str;
       a.o(str1, "StringBuilder\(\).apply\(builderAction\).toString\(\)");
       return str1;
    }
    public int hashCode(){
       int i = this.c.hashCode();
       ParameterizedTypeImpl td = this.d;
       int i1 = (td != null)? td.hashCode(): 0;
       return ((i ^ i1) ^ Arrays.hashCode(this.getActualTypeArguments()));
    }
    public String toString(){
       return this.getTypeName();
    }
}

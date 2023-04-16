package kotlin.jvm.internal.TypeReference;
import vsd.r;
import vsd.g;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import vsd.d;
import java.lang.Class;
import lsd.a;
import kotlin.jvm.internal.TypeReference$asString$args$1;
import java.lang.Iterable;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.StringBuilder;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Boolean;
import vsd.t;
import kotlin.reflect.KVariance;
import nsd.v0;
import java.lang.Enum;
import kotlin.NoWhenBranchMatchedException;

public final class TypeReference implements r	// class@0018ad
{
    public final g b;
    public final List c;
    public final boolean d;

    public void TypeReference(g p0,List p1,boolean p2){
       a.p(p0, "classifier");
       a.p(p1, "arguments");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final String d(){
       String str;
       g og = this.s();
       Class uClass = null;
       if (!og instanceof d) {
          og = uClass;
       }
       if (og != null) {
          uClass = a.c(og);
       }
       if (uClass == null) {
          str = this.s().toString();
       }else if(uClass.isArray()){
          str = this.m(uClass);
       }else {
          str = uClass.getName();
       }
       String str1 = "";
       String str2 = (this.z0().isEmpty())? str1: CollectionsKt___CollectionsKt.V2(this.z0(), ", ", "<", ">", 0, null, new TypeReference$asString$args$1(this), 24, null);
       if (this.h()) {
          str1 = "?";
       }
       return str+str2+str1;
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof TypeReference && (a.g(this.s(), p0.s()) && (a.g(this.z0(), p0.z0()) && this.h() == p0.h())))? true: false;
       return b;
    }
    public List getAnnotations(){
       return CollectionsKt__CollectionsKt.E();
    }
    public boolean h(){
       return this.d;
    }
    public int hashCode(){
       return ((((this.s().hashCode() * 31) + this.z0().hashCode()) * 31) + Boolean.valueOf(this.h()).hashCode());
    }
    public final String j(t p0){
       String str;
       if (p0.h() == null) {
          return "*";
       }
       r or = p0.g();
       if (!or instanceof TypeReference) {
          or = null;
       }
       if (or != null) {
          str = or.d();
          if (str != null) {
          label_0025 :
             KVariance kVariance = p0.h();
             if (kVariance != null) {
                int i = str.a[kVariance.ordinal()];
                if (i != 1) {
                   if (i != 2) {
                      if (i == 3) {
                         str = "out "+str;
                      }
                   }else {
                      str = "in "+str;
                   }
                }
                return str;
             }
             throw new NoWhenBranchMatchedException();
          }
       }
       str = String.valueOf(p0.g());
       goto label_0025 ;
    }
    public final String m(Class p0){
       String str;
       if (a.g(p0, boolean[].class)) {
          str = "kotlin.BooleanArray";
       }else if(a.g(p0, char[].class)){
          str = "kotlin.CharArray";
       }else if(a.g(p0, byte[].class)){
          str = "kotlin.ByteArray";
       }else if(a.g(p0, short[].class)){
          str = "kotlin.ShortArray";
       }else if(a.g(p0, int[].class)){
          str = "kotlin.IntArray";
       }else if(a.g(p0, float[].class)){
          str = "kotlin.FloatArray";
       }else if(a.g(p0, long[].class)){
          str = "kotlin.LongArray";
       }else if(a.g(p0, double[].class)){
          str = "kotlin.DoubleArray";
       }else {
          str = "kotlin.Array";
       }
       return str;
    }
    public g s(){
       return this.b;
    }
    public String toString(){
       return this.d()+" \(Kotlin reflection is not available\)";
    }
    public List z0(){
       return this.c;
    }
}

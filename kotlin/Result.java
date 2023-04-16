package kotlin.Result;
import java.io.Serializable;
import kotlin.Result$a;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import kotlin.Result$Failure;
import java.lang.String;
import java.lang.StringBuilder;

public final class Result implements Serializable	// class@001c3c
{
    public final Object value;
    public static final Result$a Companion;

    static {
       Result.Companion = new Result$a(null);
    }
    public void Result(Object p0){
       super();
       this.value = p0;
    }
    public static final Object a(Object p0){
       if (Result.isFailure-impl(p0)) {
          p0 = null;
       }
       return p0;
    }
    public static final Result box-impl(Object p0){
       return new Result(p0);
    }
    public static Object constructor-impl(Object p0){
       return p0;
    }
    public static boolean equals-impl(Object p0,Object p1){
       if (p1 instanceof Result && a.g(p0, p1.unbox-impl())) {
          return true;
       }
       return false;
    }
    public static final boolean equals-impl0(Object p0,Object p1){
       return a.g(p0, p1);
    }
    public static final Throwable exceptionOrNull-impl(Object p0){
       p0 = (p0 instanceof Result$Failure)? p0.exception: null;
       return p0;
    }
    public static void getValue$annotations(){
    }
    public static int hashCode-impl(Object p0){
       int i = (p0 != null)? p0.hashCode(): 0;
       return i;
    }
    public static final boolean isFailure-impl(Object p0){
       return p0 instanceof Result$Failure;
    }
    public static final boolean isSuccess-impl(Object p0){
       return (p0 instanceof Result$Failure ^ 0x01);
    }
    public static String toString-impl(Object p0){
       p0 = (p0 instanceof Result$Failure)? p0.toString(): "Success\("+p0+')';
       return p0;
    }
    public boolean equals(Object p0){
       return Result.equals-impl(this.value, p0);
    }
    public int hashCode(){
       return Result.hashCode-impl(this.value);
    }
    public String toString(){
       return Result.toString-impl(this.value);
    }
    public final Object unbox-impl(){
       return this.value;
    }
}

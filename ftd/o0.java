package ftd.o0;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import java.lang.System;
import java.lang.Integer;
import asd.c;
import ftd.t0;
import kotlin.Result;
import java.lang.StringBuilder;
import java.lang.Throwable;
import qrd.j0;

public final class o0	// class@001662
{

    public static final String a(Object p0){
       return p0.getClass().getSimpleName();
    }
    public static final String b(Object p0){
       return Integer.toHexString(System.identityHashCode(p0));
    }
    public static final String c(c p0){
       String str;
       if (p0 instanceof t0) {
          str = p0.toString();
       }else {
          String str1 = Result.constructor-impl(p0+'@'+o0.b(p0));
          if (Result.exceptionOrNull-impl(str1) != null) {
             str1 = p0.getClass().getName()+'@'+o0.b(p0);
          }
          str = str1;
       }
       return str;
    }
}

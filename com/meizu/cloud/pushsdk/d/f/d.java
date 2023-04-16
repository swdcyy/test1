package com.meizu.cloud.pushsdk.d.f.d;
import java.lang.Object;
import java.util.Objects;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.IllegalArgumentException;

public final class d	// class@001529
{

    public static Object a(Object p0){
       Objects.requireNonNull(p0);
       return p0;
    }
    public static Object a(Object p0,Object p1){
       if (p0 != null) {
          return p0;
       }
       throw new NullPointerException(String.valueOf(p1));
    }
    public static void a(boolean p0,Object p1){
       if (p0) {
          return;
       }
       throw new IllegalArgumentException(String.valueOf(p1));
    }
}

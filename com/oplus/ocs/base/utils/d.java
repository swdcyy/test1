package com.oplus.ocs.base.utils.d;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.NullPointerException;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;
import com.oplus.ocs.base.utils.b;

public final class d	// class@000b23
{

    public static Object a(Object p0){
       Objects.requireNonNull(p0, "null reference");
       return p0;
    }
    public static Object a(Object p0,Object p1){
       if (p0 != null) {
          return p0;
       }
       throw new NullPointerException(String.valueOf(p1));
    }
    public static String a(String p0){
       if (!TextUtils.isEmpty(p0)) {
          return p0;
       }
       throw new IllegalArgumentException("Given String is empty or null");
    }
    public static void a(boolean p0,Object p1){
       if (p0) {
          return;
       }
       throw new IllegalStateException(String.valueOf(p1));
    }
    public static void b(String p0){
       if (!b.a()) {
          return;
       }
       throw new IllegalStateException(p0);
    }
}

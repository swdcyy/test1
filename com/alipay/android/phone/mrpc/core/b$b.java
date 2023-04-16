package com.alipay.android.phone.mrpc.core.b$b;
import java.lang.String;
import android.util.Log;

public final class b$b	// class@000e46
{
    public final String a;
    public final int b;

    public static void a(b$b p0,String p1){
       Log.println(p0.b, p0.a, p1);
    }
    public static boolean a(b$b p0){
       return Log.isLoggable(p0.a, p0.b);
    }
}

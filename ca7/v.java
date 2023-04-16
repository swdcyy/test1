package ca7.v;
import android.os.Handler;
import android.os.Looper;
import java.util.Random;
import java.lang.System;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Map;
import com.google.gson.JsonObject;
import java.util.Set;
import java.lang.NullPointerException;
import java.lang.Runnable;
import android.os.Message;

public class v	// class@0003aa
{
    public static final Handler a;
    public static final Random b;

    static {
       v.a = new Handler(Looper.getMainLooper());
       v.b = new Random(System.currentTimeMillis());
    }
    public static void a(Object[] p0){
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          v.d(p0[i], "");
       }
       return;
    }
    public static Object b(Object p0){
       v.c(p0, "");
       return p0;
    }
    public static Object c(Object p0,String p1){
       Objects.requireNonNull(p0, p1);
       return p0;
    }
    public static Object d(Object p0,String p1){
       if (p0 != null && (!p0 instanceof CharSequence || (!TextUtils.isEmpty(p0) && (!p0 instanceof Collection || (!p0.isEmpty() && (!p0 instanceof Map || (!p0.isEmpty() && (!p0 instanceof JsonObject || !p0.entrySet().isEmpty())))))))) {
          return p0;
       }
       throw new NullPointerException(p1);
    }
    public static void e(Runnable p0){
       if (Looper.getMainLooper() == Looper.myLooper()) {
          p0.run();
       }else {
          v.a.post(p0);
       }
       return;
    }
    public static void f(Runnable p0,long p1){
       v.a.postDelayed(p0, p1);
    }
    public static void g(Runnable p0,Object p1,long p2){
       Handler a = v.a;
       Message message = Message.obtain(a, p0);
       message.obj = p1;
       a.sendMessageDelayed(message, p2);
    }
}

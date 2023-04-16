package io.reactivex.android.schedulers.a;
import io.reactivex.android.schedulers.a$a;
import java.util.concurrent.Callable;
import brd.z;
import io.reactivex.android.plugins.a;
import android.os.Looper;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import android.os.Build$VERSION;
import android.os.Message;
import io.reactivex.android.schedulers.b;
import android.os.Handler;

public final class a	// class@001813
{
    public static final z a;

    static {
       a.a = a.d(new a$a());
    }
    public static z a(Looper p0){
       return a.b(p0, false);
    }
    public static z b(Looper p0,boolean p1){
       Objects.requireNonNull(p0, "looper == null");
       int sDK_INT = Build$VERSION.SDK_INT;
       if (p1 && sDK_INT < 22) {
          Message message = Message.obtain();
          try{
             int i = 1;
             message.setAsynchronous(i);
          }catch(java.lang.NoSuchMethodError e0){
             p1 = false;
          }
          e0.recycle();
       }
       return new b(new Handler(p0), p1);
    }
    public static z c(){
       return a.e(a.a);
    }
}

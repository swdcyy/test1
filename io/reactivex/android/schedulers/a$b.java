package io.reactivex.android.schedulers.a$b;
import io.reactivex.android.schedulers.b;
import android.os.Handler;
import android.os.Looper;

public final class a$b	// class@001812
{
    public static final z a;

    static {
       a$b.a = new b(new Handler(Looper.getMainLooper()), false);
    }
}

package com.kwai.plugin.dva.feature.core.receiver.a$a;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.lang.Object;

public final class a$a	// class@001321
{
    public static final a$a a;
    public static final Handler b;
    public static final HashMap c;
    public static final HashMap d;

    static {
       a$a.a = new a$a();
       a$a.b = new Handler(Looper.getMainLooper());
       a$a.c = new HashMap();
       a$a.d = new HashMap();
    }
    public void a$a(){
       super();
    }
    public final Handler a(){
       return a$a.b;
    }
}

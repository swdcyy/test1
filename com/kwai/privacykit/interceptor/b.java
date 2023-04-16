package com.kwai.privacykit.interceptor.b;
import tk7.a;
import java.lang.Object;
import com.kwai.privacykit.interceptor.ClipboardInterceptor;
import java.lang.StringBuilder;
import java.lang.String;
import wk7.f;

public final class b implements a	// class@0013cc
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final void a(boolean p0){
       f.a("ClipboardInterceptor", "registerAppLifeEventListener: isForeground = "+p0);
       boolean b = (!ClipboardInterceptor.b && p0)? true: false;
       ClipboardInterceptor.c = b;
       ClipboardInterceptor.b = p0;
       return;
    }
}

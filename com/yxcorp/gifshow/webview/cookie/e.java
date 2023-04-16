package com.yxcorp.gifshow.webview.cookie.e;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.webview.cookie.CookieInitModule;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.webview.cookie.CookieInitModule$b;
import com.yxcorp.gifshow.webview.cookie.CookieInitModule$a;

public final class e implements g	// class@00174e
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void accept(Object p0){
       RxBus.f.b(new CookieInitModule$b(null));
    }
}

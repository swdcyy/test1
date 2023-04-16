package com.yxcorp.gifshow.webview.cookie.d;
import erd.g;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.webview.cookie.CookieInitModule;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.webview.cookie.CookieInitModule$b;
import com.yxcorp.gifshow.webview.cookie.CookieInitModule$a;

public final class d implements g	// class@00174d
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void accept(Object p0){
       RxBus.f.b(new CookieInitModule$b(null));
    }
}

package com.yxcorp.gifshow.homepage.functions.b;
import erd.g;
import java.lang.Object;
import zca.s;
import com.yxcorp.gifshow.homepage.functions.e;
import yo5.c;
import com.kwai.yoda.event.d;
import java.lang.String;
import yz7.e;
import com.kwai.yoda.bridge.YodaBaseWebView;

public final class b implements g	// class@0016d5
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       p0.status = (p0.a != null)? 1: 0;
       d.f().c(null, "app-menu-status-changed", e.f(e.g));
       return;
    }
}

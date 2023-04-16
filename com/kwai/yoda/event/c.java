package com.kwai.yoda.event.c;
import erd.r;
import java.lang.Object;
import com.kwai.yoda.event.EventListenerParameter;
import com.kwai.yoda.event.d;
import com.kwai.yoda.bridge.YodaBaseWebView;

public final class c implements r	// class@0011c6
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final boolean test(Object p0){
       boolean b = (p0.getYodaBaseWebView() == null)? true: false;
       return b;
    }
}

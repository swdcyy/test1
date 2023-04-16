package com.kwai.yoda.event.b;
import erd.g;
import java.lang.Object;
import com.kwai.yoda.event.EventListenerParameter;
import com.kwai.yoda.event.d;
import java.lang.String;
import yz7.k;
import yz7.r;

public final class b implements g	// class@0011c5
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       Object[] objArray = new Object[]{p0.getHybridId(),p0.getType()};
       r.h("WebViewEventCommunication", k.a("removeEventListener: HybridId = %s , type = %s", objArray));
    }
}

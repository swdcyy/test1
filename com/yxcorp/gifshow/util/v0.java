package com.yxcorp.gifshow.util.v0;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.util.ViewPreDrawMonitor;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class v0 implements x	// class@001fb4
{
    public static final v0 b;

    static {
       v0 ov0 = new v0();
       ov0.b = ov0;
    }
    public void v0(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(a.t().d("enableViewPreDrawMonitor", false));
    }
}

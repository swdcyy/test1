package com.yxcorp.gifshow.util.u;
import ok.x;
import java.lang.Object;
import lnc.k4;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class u implements x	// class@001fb3
{
    public static final u b;

    static {
       u.b = new u();
    }
    public void u(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(a.t().d("disableRealTime", false));
    }
}

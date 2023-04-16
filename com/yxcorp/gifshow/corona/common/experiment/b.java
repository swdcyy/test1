package com.yxcorp.gifshow.corona.common.experiment.b;
import ok.x;
import java.lang.Object;
import gq9.a;
import java.lang.String;
import xf6.b;
import com.kwai.sdk.switchconfig.a;
import java.lang.Boolean;

public final class b implements x	// class@0011eb
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final Object get(){
       Boolean uBoolean;
       String str = "coronaDetailRecoVideoPreloadKw";
       int i = b.b(str);
       if (i != 1) {
          uBoolean = (i != 2)? Boolean.valueOf(a.t().d(str, false)): Boolean.FALSE;
       }else {
          uBoolean = Boolean.TRUE;
       }
       return uBoolean;
    }
}

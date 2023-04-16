package com.yxcorp.gifshow.corona.common.experiment.d;
import ok.x;
import java.lang.Object;
import gq9.a;
import java.lang.String;
import xf6.b;
import com.kwai.sdk.switchconfig.a;
import java.lang.Boolean;

public final class d implements x	// class@0011ed
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final Object get(){
       Boolean uBoolean;
       String str = "enableBigCardMute";
       int i = b.b(str);
       if (i != 1) {
          uBoolean = (i != 2)? Boolean.valueOf(a.t().d(str, true)): Boolean.FALSE;
       }else {
          uBoolean = Boolean.TRUE;
       }
       return uBoolean;
    }
}

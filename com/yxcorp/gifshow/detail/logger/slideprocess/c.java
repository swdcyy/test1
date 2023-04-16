package com.yxcorp.gifshow.detail.logger.slideprocess.c;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.detail.logger.slideprocess.e;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class c implements x	// class@001579
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(a.t().d("enableVideoPlayV2", false));
    }
}

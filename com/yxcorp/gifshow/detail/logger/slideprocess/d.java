package com.yxcorp.gifshow.detail.logger.slideprocess.d;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.detail.logger.slideprocess.e;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class d implements x	// class@00157a
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(a.t().d("enableVideoPlayStart", false));
    }
}

package com.yxcorp.gifshow.action.e;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.action.i;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class e implements x	// class@00131e
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(a.t().d("enableReportFeaturedLiveRealActions", true));
    }
}

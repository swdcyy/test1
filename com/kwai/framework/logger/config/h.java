package com.kwai.framework.logger.config.h;
import ok.x;
import java.lang.Object;
import y96.k;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class h implements x	// class@001666
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(a.t().d("enableStatsNetworkLog", false));
    }
}

package com.kwai.framework.logger.config.i;
import ok.x;
import java.lang.Object;
import y96.k;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class i implements x	// class@001667
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(a.t().d("enableSendDBErrorLog", false));
    }
}

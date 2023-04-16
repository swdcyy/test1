package com.kwai.framework.deviceid.b;
import com.kuaishou.dfp.hostproxy.DfpDidProxy;
import java.lang.Object;
import java.lang.String;
import com.kwai.framework.deviceid.i;

public final class b implements DfpDidProxy	// class@001523
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final String getNewDid(){
       return i.c();
    }
}

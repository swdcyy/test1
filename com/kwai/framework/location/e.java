package com.kwai.framework.location.e;
import ok.x;
import java.lang.Object;
import com.kwai.framework.location.j;
import com.yxcorp.utility.SystemUtil;
import java.lang.String;
import xf6.i;
import java.lang.Boolean;

public final class e implements x	// class@000b80
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final Object get(){
       boolean b = (SystemUtil.K() && i.c("KEY_ENABLE_CHECK_LOCATION_GPS_PERMISSON"))? true: false;
       return Boolean.valueOf(b);
    }
}

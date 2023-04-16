package com.kwai.framework.deviceid.l;
import com.kwai.framework.deviceid.DeviceIdWrapper$f;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.regex.Pattern;
import com.kwai.framework.deviceid.DeviceIdWrapper;
import java.util.regex.Matcher;

public final class l implements DeviceIdWrapper$f	// class@000b41
{
    public static final l a;

    static {
       l.a = new l();
    }
    public void l(){
       super();
    }
    public final boolean a(String p0){
       boolean b = (!TextUtils.x(p0) && DeviceIdWrapper.a().matcher(p0).find())? true: false;
       return b;
    }
}

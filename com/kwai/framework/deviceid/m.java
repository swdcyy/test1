package com.kwai.framework.deviceid.m;
import com.kwai.framework.deviceid.DeviceIdWrapper$f;
import java.lang.Object;
import java.lang.String;
import java.util.regex.Pattern;
import com.kwai.framework.deviceid.DeviceIdWrapper;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import java.util.regex.Matcher;

public final class m implements DeviceIdWrapper$f	// class@001531
{
    public static final m a;

    static {
       m.a = new m();
    }
    public void m(){
       super();
    }
    public final boolean a(String p0){
       Pattern pattern = DeviceIdWrapper.a();
       String str = PatchProxy.applyOneRefs(p0, null, DeviceIdWrapper.class, "8");
       if (str != PatchProxyResult.class) {
       }else {
          str = "ANDROID_";
          if (p0.startsWith(str)) {
             p0 = p0.replace(str, "");
          }
          str = p0;
       }
       return pattern.matcher(str).find();
    }
}

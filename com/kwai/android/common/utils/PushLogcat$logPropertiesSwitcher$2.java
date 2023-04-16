package com.kwai.android.common.utils.PushLogcat$logPropertiesSwitcher$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Method;
import kotlin.jvm.internal.a;

public final class PushLogcat$logPropertiesSwitcher$2 extends Lambda implements a	// class@0009a2
{
    public static final PushLogcat$logPropertiesSwitcher$2 INSTANCE;

    static {
       PushLogcat$logPropertiesSwitcher$2.INSTANCE = new PushLogcat$logPropertiesSwitcher$2();
    }
    public void PushLogcat$logPropertiesSwitcher$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       String str = "false";
       Class[] uClassArray = new Class[]{String.class,String.class};
       Object[] objArray = new Object[]{"debug.kwai.push.log",str};
       Object obj = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", uClassArray).invoke(null, objArray);
       if (obj != null) {
          if (a.g(obj, str)) {
             return 0;
          }else if(a.g(obj, "true")){
             return 1;
          }
       }
       return 0;
    }
}

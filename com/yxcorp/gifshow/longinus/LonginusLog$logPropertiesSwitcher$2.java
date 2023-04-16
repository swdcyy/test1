package com.yxcorp.gifshow.longinus.LonginusLog$logPropertiesSwitcher$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.reflect.Method;
import kotlin.jvm.internal.a;

public final class LonginusLog$logPropertiesSwitcher$2 extends Lambda implements a	// class@001b72
{
    public static final LonginusLog$logPropertiesSwitcher$2 INSTANCE;

    static {
       LonginusLog$logPropertiesSwitcher$2.INSTANCE = new LonginusLog$logPropertiesSwitcher$2();
    }
    public void LonginusLog$logPropertiesSwitcher$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       String str = "false";
       String str1 = String.class;
       Object obj = PatchProxy.apply(null, this, LonginusLog$logPropertiesSwitcher$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Class[] uClassArray = new Class[]{str1,str1};
       Object[] objArray = new Object[]{"debug.kwai.longinus.log",str};
       Object obj1 = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", uClassArray).invoke(null, objArray);
       if (obj1 != null) {
          if (a.g(obj1, str)) {
             return 0;
          }else if(a.g(obj1, "true")){
             return 1;
          }
       }
       return 0;
    }
}

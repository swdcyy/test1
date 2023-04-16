package com.meizu.cloud.pushsdk.b.i;
import java.lang.String;
import com.meizu.cloud.pushsdk.b.b.a;
import java.lang.Class;
import com.meizu.cloud.pushsdk.b.b.c;
import java.lang.Object;
import com.meizu.cloud.pushsdk.b.b.d;

public class i	// class@0014b4
{

    public static String a(String p0){
       Class[] uClassArray = new Class[]{String.class};
       Object[] objArray = new Object[]{p0};
       d uod = a.a("android.os.SystemProperties").a("get", uClassArray).a(objArray);
       if (uod.a != null) {
          return uod.b;
       }
       return null;
    }
}

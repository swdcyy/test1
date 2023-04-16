package com.ta.utdid2.device.UTDevice;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import com.ta.utdid2.device.a;
import com.ta.utdid2.device.b;
import com.ta.utdid2.a.a.g;
import com.ta.utdid2.device.c;

public class UTDevice	// class@000cd1
{

    public void UTDevice(){
       super();
    }
    public static String d(Context p0){
       a uoa = b.b(p0);
       String str = (uoa == null || g.a(uoa.f()))? "ffffffffffffffffffffffff": uoa.f();
       return str;
    }
    public static String e(Context p0){
       String str = c.a(p0).h();
       if (str == null || g.a(str)) {
          str = "ffffffffffffffffffffffff";
       }
       return str;
    }
    public static String getUtdid(Context p0){
       return UTDevice.d(p0);
    }
    public static String getUtdidForUpdate(Context p0){
       return UTDevice.e(p0);
    }
}

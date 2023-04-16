package com.kuaishou.dfp.c.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.SystemProperties;

public class b	// class@0016e6
{

    public void b(){
       super();
    }
    public static String a(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SystemProperties.get(p0, p1);
    }
}

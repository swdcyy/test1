package com.kuaishou.webkit.adapter.SystemApiVersionChecker;
import java.lang.Object;
import java.lang.String;
import android.os.Build$VERSION;
import java.lang.StringBuilder;
import com.kuaishou.webkit.internal.Logger;

public class SystemApiVersionChecker	// class@0012b1
{

    public void SystemApiVersionChecker(){
       super();
    }
    public static boolean check(int p0,String p1,String p2){
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= p0) {
          return true;
       }
       Logger.w(p1, "The expected call version of "+p2+" is "+p0+", but the actual version is "+sDK_INT);
       return false;
    }
}

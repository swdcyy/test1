package com.hpplay.sdk.source.permission.d;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.os.Process;
import java.lang.IllegalArgumentException;

public class d	// class@000683
{

    public void d(){
       super();
    }
    public static int a(Context p0,String p1){
       if (p1 != null) {
          return p0.checkPermission(p1, Process.myPid(), Process.myUid());
       }
       throw new IllegalArgumentException("permission is null");
    }
}

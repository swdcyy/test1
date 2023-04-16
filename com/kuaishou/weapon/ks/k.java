package com.kuaishou.weapon.ks.k;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.os.Process;

public class k	// class@001213
{

    public void k(){
       super();
    }
    public static int a(Context p0,String p1){
       if (p0 == null || p1 == null) {
          return -1;
       }
       return p0.checkPermission(p1, Process.myPid(), Process.myUid());
    }
}

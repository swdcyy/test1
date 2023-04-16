package com.hpplay.sdk.source.permission.c;
import java.lang.Object;
import com.hpplay.sdk.source.permission.c$c;
import android.app.SharedElementCallback;
import com.hpplay.sdk.source.permission.c$d;
import android.app.Activity;
import java.lang.String;
import com.hpplay.sdk.source.permission.c$b;

public class c	// class@000682
{

    public void c(){
       super();
    }
    public static SharedElementCallback a(c$c p0){
       c$d uod = (p0 != null)? new c$d(p0): null;
       return uod;
    }
    public static void a(Activity p0,c$c p1){
       p0.setEnterSharedElementCallback(c.a(p1));
    }
    public static void a(Activity p0,String[] p1,int p2){
       if (p0 instanceof c$b) {
          p0.validateRequestPermissionsRequestCode(p2);
       }
       p0.requestPermissions(p1, p2);
       return;
    }
    public static boolean a(Activity p0,String p1){
       return p0.shouldShowRequestPermissionRationale(p1);
    }
    public static void b(Activity p0,c$c p1){
       p0.setExitSharedElementCallback(c.a(p1));
    }
}

package com.cmic.sso.sdk.e.g;
import android.content.Context;
import java.lang.String;
import android.content.pm.PackageManager;

public class g	// class@000f5f
{

    public static boolean a(Context p0,String p1){
       boolean b = (!p0.getPackageManager().checkPermission(p1, p0.getPackageName()))? true: false;
       return b;
    }
}

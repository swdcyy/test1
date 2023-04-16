package com.alipay.android.phone.mrpc.core.s;
import android.content.Context;
import java.lang.Boolean;
import android.content.pm.PackageManager;
import java.lang.String;
import android.content.pm.ApplicationInfo;

public final class s	// class@000e59
{
    public static Boolean a;

    public static final boolean a(Context p0){
       Boolean a = s.a;
       if (a != null) {
          return a.booleanValue();
       }
       int i = 0;
       try{
          boolean b = (p0.getPackageManager().getApplicationInfo(p0.getPackageName(), i).flags & 0x02)? true: false;
          Boolean uBoolean = Boolean.valueOf(b);
          s.a = uBoolean;
          return uBoolean.booleanValue();
       }catch(java.lang.Exception e0){
          return e0;
       }
    }
}

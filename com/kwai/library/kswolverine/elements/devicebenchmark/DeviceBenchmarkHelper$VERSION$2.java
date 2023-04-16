package com.kwai.library.kswolverine.elements.devicebenchmark.DeviceBenchmarkHelper$VERSION$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import v27.a;
import v27.c;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import v27.d;
import java.lang.Throwable;

public final class DeviceBenchmarkHelper$VERSION$2 extends Lambda implements a	// class@000845
{
    public static final DeviceBenchmarkHelper$VERSION$2 INSTANCE;

    static {
       DeviceBenchmarkHelper$VERSION$2.INSTANCE = new DeviceBenchmarkHelper$VERSION$2();
    }
    public void DeviceBenchmarkHelper$VERSION$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       PackageInfo versionName;
       PackageManager packageManag = c.b().a().getPackageManager();
       try{
          versionName = packageManag.getPackageInfo(c.b().a().getPackageName(), 0).versionName;
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
          c.a().b(e0);
          versionName = "";
       }
       return versionName;
    }
}

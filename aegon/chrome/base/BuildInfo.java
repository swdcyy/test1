package aegon.chrome.base.BuildInfo;
import java.lang.Object;
import h0.a;
import android.content.Context;
import a0.f;
import java.lang.String;
import android.os.Build;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Math;
import aegon.chrome.base.BuildInfo$a;
import aegon.chrome.base.BuildInfo$b;
import android.os.Build$VERSION;
import android.content.pm.ApplicationInfo;

public class BuildInfo	// class@00005a
{
    public final String a;
    public final long b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final boolean l;
    public static PackageInfo m;
    public static boolean n;
    public static String o;
    public static final boolean p;

    public void BuildInfo(){
       super();
       BuildInfo.n = true;
       this.b = 0;
       this.d = 0;
       this.e = "";
       this.c = "";
       this.a = "";
       this.f = "";
       this.g = "gms versionCode not available.";
       this.j = "false";
       boolean b = false;
       this.l = b;
       String str = (a.e)? f.a().getString(a.e): "Not Enabled";
    }
    public void BuildInfo(BuildInfo$a p0){
       super();
       BuildInfo.n = true;
       this.b = 0;
       this.d = 0;
       this.e = "";
       this.c = "";
       this.a = "";
       this.f = "";
       this.g = "gms versionCode not available.";
       this.j = "false";
       boolean b = false;
       this.l = b;
       String str = (a.e)? f.a().getString(a.e): "Not Enabled";
    }
    public static BuildInfo a(){
       return BuildInfo$b.a;
    }
    public static boolean b(){
       String tYPE = Build.TYPE;
       boolean b = (("eng").equals(tYPE) || ("userdebug").equals(tYPE))? true: false;
       return b;
    }
    public static String[] getAll(){
       BuildInfo uBuildInfo = BuildInfo.a();
       String[] stringArray = new String[25];
       stringArray[0] = Build.BRAND;
       stringArray[1] = Build.DEVICE;
       stringArray[2] = Build.ID;
       stringArray[3] = Build.MANUFACTURER;
       stringArray[4] = Build.MODEL;
       stringArray[5] = String.valueOf(Build$VERSION.SDK_INT);
       stringArray[6] = Build.TYPE;
       stringArray[7] = Build.BOARD;
       stringArray[8] = "";
       stringArray[9] = String.valueOf(uBuildInfo.b);
       stringArray[10] = uBuildInfo.a;
       stringArray[11] = uBuildInfo.c;
       stringArray[12] = String.valueOf(uBuildInfo.d);
       stringArray[13] = uBuildInfo.e;
       stringArray[14] = uBuildInfo.i;
       stringArray[15] = uBuildInfo.g;
       stringArray[16] = uBuildInfo.f;
       stringArray[17] = uBuildInfo.h;
       stringArray[18] = BuildInfo.o;
       stringArray[19] = uBuildInfo.j;
       stringArray[20] = uBuildInfo.k;
       stringArray[21] = String.valueOf(f.a().getApplicationInfo().targetSdkVersion);
       String str = "1";
       String str1 = (BuildInfo.b())? str: "0";
       stringArray[22] = str1;
       int i = 23;
       if (uBuildInfo.l == null) {
          str = "0";
       }
       stringArray[i] = str;
       stringArray[24] = Build$VERSION.INCREMENTAL;
       return stringArray;
    }
}

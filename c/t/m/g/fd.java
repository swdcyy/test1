package c.t.m.g.fd;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import c.t.m.g.ex;
import java.lang.StringBuilder;
import c.t.m.g.ff;
import android.os.Build$VERSION;
import android.os.Build;
import java.lang.Throwable;
import java.lang.Integer;
import android.os.Process;
import java.lang.CharSequence;
import java.lang.Exception;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;
import java.lang.reflect.Field;
import java.lang.Class;

public class fd	// class@000c8a
{
    public String c;
    public static String a = "armeabi";
    public static int b = 4;
    public static Context d;
    public static fd e;

    public void fd(Context p0){
       super();
       this.c = "JudeCpuAbiHandler";
       fd.d = p0;
       this.b();
       String str = this.b(p0);
       fd.a = str;
       fd.b = this.a(str);
    }
    public static fd a(Context p0){
       if (fd.e == null) {
          _monitor_enter(fd.class);
          if (fd.e == null) {
             fd.e = new fd(p0);
          }
          _monitor_exit(fd.class);
       }
       return fd.e;
    }
    public int a(){
       if (ex.a) {
          ex.a(this.c, "current process cpuabiID get is "+fd.b);
       }
       String[] i = ff.i;
       int i1 = 3;
       if ((i[i1]).equals(fd.a) && !ff.k[i1]) {
          i1 = 4;
          fd.a = i[i1];
          fd.b = i1;
          if (ex.a) {
             ex.a(this.c, "current is armv7a,but not in assets,so use armeabi replace "+fd.a+" id="+fd.b);
          }
       }
       return fd.b;
    }
    public final int a(String p0){
       if (p0 == null) {
          return 4;
       }
       int i = 0;
       while (true) {
          String[] i1 = ff.i;
          if (i >= i1.length) {
             return 4;
          }
          if (p0.equals(i1[i])) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i;
    }
    public final String b(Context p0){
       String str = this.d(p0);
       if (str != null && !("getError").equals(str)) {
          if (ex.a) {
             ex.b(this.c, "getPrimaryCpuAbi="+str);
          }
          return str;
       }else {
          String str1 = 23;
          if (this.c(p0) && Build$VERSION.SDK_INT >= str1) {
             str = Build.SUPPORTED_64_BIT_ABIS[0];
          }else if(Build$VERSION.SDK_INT >= str1){
             if (ex.a) {
                ex.b(this.c, "Build.CPUABI="+Build.CPU_ABI);
                int i = 0;
                String[] sUPPORTED_AB = Build.SUPPORTED_ABIS;
                while (i < sUPPORTED_AB.length) {
                   ex.b(this.c, "support abis "+i+" "+sUPPORTED_AB[i]);
                   i++;
                }
             }
             str = Build.SUPPORTED_32_BIT_ABIS[0];
          }
          return str;
       }
    }
    public final void b(){
       boolean i1;
       try{
          String[] stringArray = ("72,0,TMLSDK,0,0,;82,0,liblocationbeaconid,0,0,;90,0,libtencentloc,0,0,;84,0,liblocationbeaconid,0,0,;92,0,libtencentloc,0,0,;83,0,liblocationbeaconid,0,0,;91,0,libtencentloc,0,0,;").split(";");
          int len = stringArray.length;
          int i = 0;
          while (i < len) {
             String[] stringArray1 = (stringArray[i]).split(",");
             if (stringArray1.length >= 5) {
                i1 = Integer.valueOf(stringArray1[0]).intValue() % ff.j;
                ff.k[i1] = 1;
             }
             i = i + 1;
          }
          if (ex.a) {
             for (int i2 = 0; i2 < ff.k.length; i2 = i2 + 1) {
                fd tc = this.c;
                StringBuilder str = "assets comp "+ff.i[i2]+" is valid ";
                i1 = (ff.k[i2] == 1)? true: false;
                ex.b(tc, str+i1);
             }
          }
       }catch(java.lang.Exception e0){
          if (ex.a) {
             ex.a(this.c, e0);
          }
       }
       return;
    }
    public final boolean b(String p0){
       if (p0 == null) {
          return false;
       }
       int i = 0;
       while (true) {
          String[] i1 = ff.i;
          if (i >= i1.length) {
             return false;
          }
          if (p0.equals(i1[i])) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public final boolean c(Context p0){
       if (Build$VERSION.SDK_INT >= 23) {
          if (ex.a) {
             ex.a(this.c, "Android API more than or equal 23,android.os.Process.is64Bit="+Process.is64Bit());
          }
          return Process.is64Bit();
       }else if(ex.a){
          ex.a(this.c, "Android API more or equal 21,maye 64 bit.");
       }
       String[] sUPPORTED_AB = Build.SUPPORTED_ABIS;
       int len = sUPPORTED_AB.length;
       String str = "";
       for (int i = 0; i < len; i = i + 1) {
          str = str+sUPPORTED_AB[i]+",";
       }
       if (ex.a) {
          ex.a(this.c, "Android support abis is "+str);
       }
       String str1 = "64";
       if (str.contains(str1)) {
          String str2 = this.d(p0);
          if (str2 == null) {
             if (ex.a) {
                ex.a(this.c, "primaryAbi is null,app has no other so,process run in default,support abis contains 64,so is 64 bit");
             }
             return true;
          }else if(str2.equals("getError")){
             if (ex.a) {
                ex.a(this.c, "primaryCpuAbi getError, may be reflect error");
             }
             throw new Exception("getError");
          }else if(str2.contains(str1)){
             if (ex.a) {
                ex.a(this.c, "primaryCpuAbi contains 64,so process is 64bit");
             }
             return true;
          }else if(ex.a){
             ex.a(this.c, "primaryCpuAbi no contains 64,so process is 32bit");
          }
          return false;
       }else if(ex.a){
          ex.a(this.c, "support abis is :"+str+",must be 32 bit");
       }
       return false;
    }
    public final String d(Context p0){
       Field declaredFiel = ApplicationInfo.class.getDeclaredField("primaryCpuAbi");
       declaredFiel.setAccessible(true);
       String str = declaredFiel.get(p0.getApplicationContext().getPackageManager().getApplicationInfo(p0.getApplicationContext().getPackageName(), 0));
       if (ex.a) {
          ex.a(this.c, "primaryCpuAbi : "+str);
       }
       return str;
    }
}

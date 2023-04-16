package com.kuaishou.weapon.ks.aa;
import java.lang.Object;
import android.content.pm.PackageInfo;
import java.lang.String;
import java.lang.Class;
import java.lang.StringBuilder;
import java.util.Arrays;

public class aa	// class@0011bc
{
    public boolean A;
    public int a;
    public int b;
    public String c;
    public String d;
    public String e;
    public Context f;
    public ClassLoader g;
    public String h;
    public String i;
    public String j;
    public String k;
    public ActivityInfo[] l;
    public String m;
    public String n;
    public String o;
    public int p;
    public int q;
    public List r;
    public PackageInfo s;
    public long t;
    public int u;
    public int v;
    public boolean w;
    public int x;
    public int y;
    public boolean z;

    public void aa(){
       this.y = -1;
    }
    public void aa(PackageInfo p0,int p1,String p2,String p3,String p4,String p5){
       super();
       this.y = -1;
       this.s = p0;
       this.a = p1;
       this.c = p2;
       this.d = p3;
       this.i = p4;
       this.j = p5;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null) {
          return false;
       }
       if (this.getClass() != p0.getClass()) {
          return false;
       }
       aa tc = this.c;
       p0 = p0.c;
       if (tc == null) {
          if (p0 != null) {
             return false;
          }
       }else if(!tc.equals(p0)){
          return false;
       }
       return true;
    }
    public int hashCode(){
       aa tc = this.c;
       int i = (tc == null)? 0: tc.hashCode();
       return (31 + i);
    }
    public String toString(){
       return "WeaponApkInfo [key="+this.a+", apkInitStatus="+this.b+", apkPackageName="+this.c+", apkVersionName="+this.d+", apkPkgPath="+this.e+", apkHostContext="+this.f+", classLoader="+this.g+", apkLibPath="+this.h+", apkDownloadURL="+this.i+", apkMD5="+this.j+", apkSignMD5="+this.k+", activities="+Arrays.toString(this.l)+", dataDir="+this.m+", apkDexPath="+this.n+", apkClassName="+this.o+", apkParseSuc="+this.p+", apkApplicationTheme="+this.q+", apkIntentFilters="+this.r+", apkCloudPkgInfo="+this.s+", apkStartTime="+this.t+", duration="+this.u+", network="+this.v+", apkIsOnce="+this.w+", apkRunStatus="+this.x+"]";
    }
}

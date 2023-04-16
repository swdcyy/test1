package com.hpplay.sdk.source.permission.a$1;
import java.lang.Runnable;
import java.lang.String;
import android.app.Activity;
import java.lang.Object;
import android.content.pm.PackageManager;
import com.hpplay.sdk.source.permission.a$a;

public final class a$1 implements Runnable	// class@000677
{
    public final String[] a;
    public final Activity b;
    public final int c;

    public void a$1(String[] p0,Activity p1,int p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       int[] ointArray = new int[this.a.length];
       PackageManager packageManag = this.b.getPackageManager();
       String packageName = this.b.getPackageName();
       int len = this.a.length;
       for (int i = 0; i < len; i = i + 1) {
          ointArray[i] = packageManag.checkPermission(this.a[i], packageName);
       }
       this.b.onRequestPermissionsResult(this.c, this.a, ointArray);
       return;
    }
}

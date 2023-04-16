package com.meizu.cloud.pushsdk.b.g;
import com.meizu.cloud.pushsdk.b.f;
import com.meizu.cloud.pushsdk.b.h;
import java.lang.Object;
import com.meizu.cloud.pushsdk.b.b;
import android.content.Context;
import java.lang.String;
import android.content.pm.ApplicationInfo;
import android.os.Build$VERSION;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import java.lang.StringBuilder;
import java.io.File;
import android.os.Environment;
import java.lang.Throwable;

public class g extends h implements f	// class@0014b2
{
    public boolean b;
    public static g a;

    public void g(f p0){
       this.b = false;
    }
    public static g b(){
       if (g.a == null) {
          g og = g.class;
          _monitor_enter(og);
          if (g.a == null) {
             g.a = new g(new b());
          }
          _monitor_exit(og);
       }
       return g.a;
    }
    public void a(Context p0){
       this.a(p0, null);
    }
    public void a(Context p0,String p1){
       if (this.b != null) {
          return;
       }
       boolean b = true;
       this.b = b;
       if (!(p0.getApplicationInfo().flags & 0x02)) {
          b = false;
       }
       this.b(b);
       if (p1 == null) {
          p1 = (Build$VERSION.SDK_INT >= 29)? MzSystemUtils.getDocumentsPath(p0)+"/pushSdk/"+p0.getPackageName(): Environment.getExternalStorageDirectory().getAbsolutePath()+"/Android/data/pushSdk/"+p0.getPackageName();
       }
    label_005c :
       this.a(p1);
       return;
    }
    public void a(String p0){
       this.c().a(p0);
    }
    public void a(String p0,String p1){
       this.c().a(p0, p1);
    }
    public void a(String p0,String p1,Throwable p2){
       this.c().a(p0, p1, p2);
    }
    public void a(boolean p0){
       this.c().a(p0);
    }
    public boolean a(){
       return this.c().a();
    }
    public void b(String p0,String p1){
       this.c().b(p0, p1);
    }
    public void b(boolean p0){
       this.c().b(p0);
    }
    public void c(String p0,String p1){
       this.c().c(p0, p1);
    }
    public void d(String p0,String p1){
       this.c().d(p0, p1);
    }
}

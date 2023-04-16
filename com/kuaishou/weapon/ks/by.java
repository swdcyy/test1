package com.kuaishou.weapon.ks.by;
import java.lang.Object;
import java.lang.ClassLoader;
import java.io.File;
import android.os.Build$VERSION;
import com.kuaishou.weapon.ks.by$d;
import com.kuaishou.weapon.ks.by$b;
import com.kuaishou.weapon.ks.by$c;
import com.kuaishou.weapon.ks.by$a;

public class by	// class@001200
{

    public void by(){
       super();
    }
    public static synchronized void a(ClassLoader p0,File p1){
       _monitor_enter(by.class);
       if (p1 == null || !p1.exists()) {
          _monitor_exit(by.class);
          return;
       }else {
          int sDK_INT = Build$VERSION.SDK_INT;
          int i = 25;
          if (sDK_INT != i || (Build$VERSION.PREVIEW_SDK_INT || sDK_INT > i)) {
             by$d.a(p0, p1);
          }else if(sDK_INT == 24){
             by$c.a(p0, p1);
          }else if(sDK_INT >= 23){
             by$b.a(p0, p1);
          }else {
             by$a.a(p0, p1);
          }
          _monitor_exit(by.class);
          return;
       }
    }
}

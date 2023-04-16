package com.kuaishou.weapon.ks.b;
import java.util.HashMap;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import java.util.Map;
import com.kuaishou.weapon.ks.c;
import android.os.FileObserver;
import com.kuaishou.weapon.ks.bs;

public class b	// class@0011da
{
    public static Map a;

    static {
       b.a = new HashMap();
    }
    public void b(){
       super();
    }
    public static void a(File p0){
       if (p0 == null) {
          return;
       }
       c uoc = b.a.get(p0.getAbsolutePath());
       if (uoc != null) {
          uoc.stopWatching();
          b.a.remove(p0.getAbsolutePath());
          uoc.a();
       }
       return;
    }
    public static void a(File p0,File p1){
       if (p0 == null || (!bs.a(p0) || (p1 != null && bs.a(p1)))) {
          if (b.a.containsKey(p0.getAbsolutePath())) {
             return;
          }else {
             c uoc = new c(p0.getAbsolutePath(), p1.getAbsolutePath());
             uoc.startWatching();
             b.a.put(p0.getAbsolutePath(), uoc);
          }
       }
       return;
    }
}

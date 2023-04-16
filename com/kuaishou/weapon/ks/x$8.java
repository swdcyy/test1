package com.kuaishou.weapon.ks.x$8;
import java.lang.Runnable;
import com.kuaishou.weapon.ks.x;
import java.lang.String;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.Context;
import com.kuaishou.weapon.ks.z;
import com.kuaishou.weapon.ks.aa;
import com.kuaishou.weapon.ks.ah;
import java.lang.StringBuilder;
import com.kuaishou.weapon.ks.y;
import java.lang.Class;
import java.lang.reflect.Method;
import java.util.HashMap;
import com.kuaishou.weapon.ks.ba;
import com.kuaishou.weapon.ks.d;
import java.util.Map;
import com.kuaishou.weapon.ks.bs;
import java.util.Timer;
import com.kuaishou.weapon.ks.x$8$1;
import java.util.TimerTask;
import java.io.File;
import com.kuaishou.weapon.ks.b;
import java.lang.Throwable;

public class x$8 implements Runnable	// class@001239
{
    public final String a;
    public final x b;

    public void x$8(x p0,String p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (TextUtils.isEmpty(this.a)) {
          return;
       }
       boolean b = true;
       z oz = z.a(x.c(this.b).getApplicationContext(), b);
       if (oz == null) {
          return;
       }
       aa uoaa = oz.d(this.a);
       if (uoaa == null) {
          aa uoaa1 = x.m(this.b).b(this.a);
          if (uoaa1 != null) {
             this.b.a(this.a, uoaa1);
          }
          return;
       }else {
          Class uClass = uoaa.g.a(uoaa.c+".WeaponEngineImpl");
          Class[] uClassArray = new Class[b];
          uClassArray[0] = Context.class;
          Object[] objArray = new Object[b];
          objArray[0] = x.c(this.b);
          String obj = uClass.getDeclaredMethod("getInstance", uClassArray).invoke(uClass, objArray);
          if (obj == null) {
             HashMap hashMap = new HashMap();
             hashMap.put("e", ba.p);
             hashMap.put("l", "CBH");
             hashMap.put("pkg", this.a);
             obj = "n";
             String str = (d.a(x.c(this.b)).f("a1_p_s_p_s"))? "0": "1";
             hashMap.put(obj, str);
             bs.a(x.c(this.b), "1002001", hashMap);
             return;
          }else {
             new Timer().schedule(new x$8$1(this, oz, uoaa), 0x927c0);
             Object[] objArray1 = new Object[0];
             bs.a(obj, "unload", null, objArray1);
             oz.b(this.a);
             x.m(this.b).a(this.a);
             File uFile = new File(uoaa.e);
             if (uFile.exists()) {
                b.a(uFile);
                uFile.delete();
             }
             return;
          }
       }
    }
}

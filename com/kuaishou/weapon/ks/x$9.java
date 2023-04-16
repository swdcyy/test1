package com.kuaishou.weapon.ks.x$9;
import java.lang.Runnable;
import com.kuaishou.weapon.ks.x;
import com.kuaishou.weapon.i.WeaponCB;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import com.kuaishou.weapon.ks.ah;
import java.lang.System;
import android.os.SystemClock;
import android.content.Context;
import com.kuaishou.weapon.ks.z;
import com.kuaishou.weapon.ks.aa;
import java.lang.Integer;
import com.kuaishou.weapon.ks.y;
import java.lang.StringBuilder;
import java.lang.reflect.Method;
import com.kuaishou.weapon.ks.bs;

public class x$9 implements Runnable	// class@00123a
{
    public final int a;
    public final WeaponCB b;
    public final String c;
    public final Class[] d;
    public final Object[] e;
    public final x f;

    public void x$9(x p0,int p1,WeaponCB p2,String p3,Class[] p4,Object[] p5){
       this.f = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       super();
    }
    public void run(){
       StringBuilder str;
       Object[] objArray;
       if (x.m(this.f).d(this.a)) {
          long l = System.currentTimeMillis();
          while (x.m(this.f).d(this.a)) {
             long l1 = System.currentTimeMillis() - l;
             if (l1 - 5000 < 0) {
                SystemClock.sleep(500);
             }
          }
       }
       if (!x.n(this.f)) {
          x.b(2);
          this.f.b();
       }
       boolean b = true;
       z oz = z.a(x.c(this.f).getApplicationContext(), b);
       x$9 u9 = null;
       long l2 = System.currentTimeMillis();
       while (true) {
          long l3 = System.currentTimeMillis() - l2;
          if (l3 - 0x30d40 <= 0) {
             u9 = x.m(this.f).a(this.a);
             if (u9 != null) {
                if (oz.d(u9.c) != null) {
                   str = 1;
                   break ;
                }else if(u9.b == -1){
                label_0087 :
                   str = null;
                   break ;
                }
             }
             SystemClock.sleep(2000);
          }else {
             goto label_0087 ;
          }
       }
       if (!str) {
          x$9 tb = this.b;
          if (tb != null) {
             objArray = new Object[b];
             objArray[0] = Integer.valueOf(4);
             tb.onHappenError(objArray);
          }
          return;
       }else {
          aa uoaa = oz.d(u9.c);
          Class[] uClassArray = new Class[b];
          uClassArray[0] = Context.class;
          Object[] objArray1 = new Object[b];
          objArray1[0] = x.c(this.f);
          Object obj = bs.a(uoaa.g.a(uoaa.c+".WeaponEngineImpl").getDeclaredMethod("getInstance", uClassArray).invoke(this.b, objArray1), this.c, this.d, this.e);
          u9 = this.b;
          if (u9 != null) {
             objArray = new Object[b];
             objArray[0] = obj;
             u9.onEndTask(objArray);
          }
          return;
       }
    }
}

package com.kuaishou.weapon.WeaponRECE$1;
import java.lang.Runnable;
import com.kuaishou.weapon.WeaponRECE;
import android.content.Intent;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import android.telephony.TelephonyManager;
import com.kuaishou.weapon.ks.l;
import java.lang.Throwable;
import com.kuaishou.weapon.ks.bh;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.weapon.ks.z;
import java.util.List;
import com.kuaishou.weapon.ks.aa;
import com.kuaishou.weapon.ks.ac;
import android.net.Uri;
import java.util.Set;
import android.content.IntentFilter;
import java.lang.Class;
import java.lang.ClassLoader;
import java.lang.reflect.Method;

public class WeaponRECE$1 implements Runnable	// class@0011a0
{
    public final Intent a;
    public final Context b;
    public final WeaponRECE c;

    public void WeaponRECE$1(WeaponRECE p0,Intent p1,Context p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       String str = "wp_ks_l_si";
       if ((this.a.getAction()).equals("android.intent.action.SIM_STATE_CHANGED")) {
          int simState = this.b.getSystemService("phone").getSimState();
          l ol = l.a(this.b, "re_po_rt");
          if (ol.c(str) != -1) {
             if (ol.c(str) != simState) {
                ol.c("wp_ks_sim", "1");
             }
          }
          ol.d(str, simState);
       }
    label_0043 :
       if (TextUtils.isEmpty(this.a.getStringExtra("from_plugin_apk"))) {
          z oz = z.a();
          if (oz == null) {
             return;
          }else {
             List list = oz.b();
             if (list == null && !list.size()) {
                return;
             }else {
                int i = 0;
                while (i < list.size()) {
                   aa uoaa = list.get(i);
                   if (uoaa != null && uoaa.r != null) {
                      int i1 = 0;
                      while (i1 < uoaa.r.size()) {
                         ac uoac = uoaa.r.get(i1);
                         if (uoac != null && uoac.d.match(this.a.getAction(), this.a.getType(), this.a.getScheme(), this.a.getData(), this.a.getCategories(), "WR") >= 0) {
                            Class uClass = uoaa.g.loadClass(uoac.b);
                            Object obj = uClass.newInstance();
                            Class[] uClassArray = new Class[2];
                            uClassArray[0] = Context.class;
                            int i2 = 1;
                            uClassArray[i2] = Intent.class;
                            Method declaredMeth = uClass.getDeclaredMethod(uoac.c, uClassArray);
                            Object[] objArray = new Object[2];
                            objArray[0] = this.b.getApplicationContext();
                            objArray[i2] = this.a;
                            declaredMeth.invoke(obj, objArray);
                         }
                         i1 = i1 + 1;
                      }
                   }
                   i = i + 1;
                }
             }
          }
       }
       return;
    }
}

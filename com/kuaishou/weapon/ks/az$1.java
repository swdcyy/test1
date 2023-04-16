package com.kuaishou.weapon.ks.az$1;
import java.lang.Runnable;
import com.kuaishou.weapon.ks.az;
import java.lang.Object;
import android.content.Context;
import com.kuaishou.weapon.ks.d;
import java.lang.String;
import com.kuaishou.weapon.ks.bs;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.weapon.ks.bn;
import com.kuaishou.weapon.ks.ba;
import org.json.JSONObject;
import com.kuaishou.weapon.ks.bq;
import com.kuaishou.weapon.ks.bv;

public class az$1 implements Runnable	// class@0011d8
{
    public final int a;
    public final az b;

    public void az$1(az p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       JSONObject a;
       d uod = d.a(az.a(this.b));
       String str = bs.f();
       if (!TextUtils.isEmpty(str) && uod != null) {
          uod.d(str);
       }
       int i = 1;
       if (uod.b("plc001_pd_u_ps", i) == i) {
          JSONObject jSONObject = new bn(ba.c, ba.e).a(az.a(this.b));
          if (jSONObject == null) {
             return;
          }else {
             boolean b = uod.f("a1_p_s_p_s");
             if (!b) {
                a = az.a;
                if (a != null && (a.length() > 0 && this.a == 999)) {
                   a = az.a;
                }else {
                label_0053 :
                   a = this.b.a();
                   if (!b) {
                      az.a = a;
                   }
                }
             }else {
                goto label_0053 ;
             }
             a.put("20000", this.a);
             jSONObject.put("module_section", a);
             bv.a(az.a(this.b), b, bq.a(jSONObject.toString(), az.a(this.b)));
          }
       }
       return;
    }
}

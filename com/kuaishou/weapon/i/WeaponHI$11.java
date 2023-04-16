package com.kuaishou.weapon.i.WeaponHI$11;
import java.lang.Runnable;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import com.kuaishou.weapon.ks.bs;
import com.kuaishou.weapon.i.WeaponHI;
import com.kuaishou.weapon.ks.d;
import java.lang.Boolean;
import com.kuaishou.weapon.ks.x;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class WeaponHI$11 implements Runnable	// class@0011aa
{
    public final Context a;
    public final boolean b;
    public final int[] c;
    public final String d;
    public final String e;

    public void WeaponHI$11(Context p0,boolean p1,int[] p2,String p3,String p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void run(){
       String str = "a1_n_d_v_s";
       WeaponHI$11 ta = this.a;
       if (ta == null) {
          HashMap hashMap = new HashMap();
          hashMap.put("e", "context is null");
          bs.a(this.a, "1002001", hashMap);
          return;
       }else {
          WeaponHI.mContext = ta;
          d uod = d.a(ta);
          uod.a("a1_p_s_p_s", Boolean.valueOf(this.b), true);
          int i = 0;
          if (!uod.a(str, i)) {
             uod.a(str, true, true);
          }else {
             uod.a(str, 2, true);
          }
          uod.a(this.c);
          x ox = x.a(this.a);
          if (ox == null) {
             return;
          }else {
             ox.c();
             if (TextUtils.isEmpty(this.d) || TextUtils.isEmpty(this.e)) {
                String[] stringArray = bs.a(this.a);
                if (stringArray != null && (stringArray.length == 2 && (stringArray[i] != null && stringArray[1] != null))) {
                   ox.a(stringArray[i], stringArray[1]);
                }
             }else {
                ox.a(this.d, this.e);
             }
             x.b(true);
             ox.b();
             return;
          }
       }
    }
}

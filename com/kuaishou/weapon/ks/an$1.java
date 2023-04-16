package com.kuaishou.weapon.ks.an$1;
import java.lang.Runnable;
import com.kuaishou.weapon.ks.an;
import java.lang.Object;
import android.content.Context;
import com.kuaishou.weapon.ks.d;
import java.lang.String;
import java.lang.System;
import java.lang.Math;
import com.kuaishou.weapon.ks.o;
import java.lang.Long;
import com.kuaishou.weapon.u.WeaponAlarmUtil;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.weapon.ks.bs;

public class an$1 implements Runnable	// class@0011ca
{
    public final int a;
    public final an b;

    public void an$1(an p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       Context uContext;
       Long longx;
       d uod = d.a(an.a(this.b));
       int i = 1;
       if (uod.b("plc001_e_s_s", i) == i) {
          long l = uod.i();
          long l1 = System.currentTimeMillis();
          long l2 = (long)uod.b("plc001_e_i_s", 6) * 0x36ee80;
          if (l2 < 0) {
             l2 = Math.abs(l2) * 1000;
          }
          l1 = l1 - l;
          if (l1 - l2 < 0) {
             an$1 ta = this.a;
             int i1 = 115;
             if (ta <= null || (ta != 104 && (ta == i1 && (ta != 104 && (ta == i1 && (o.a <= 0 && ta != 103)))))) {
                uContext = an.a(this.b);
                longx = Long.valueOf((l2 - l1));
             label_0061 :
                WeaponAlarmUtil.setRTCAlarm(uContext, "doenvre", longx);
             }
          }
          an.a(this.b, this.a);
          if (TextUtils.isEmpty(uod.c("plc001_lss_oa_d"))) {
             String str = bs.g();
             if (!TextUtils.isEmpty(str)) {
                uod.e(str);
             }
          }
          uContext = an.a(this.b);
          longx = Long.valueOf(l2);
          goto label_0061 ;
       }
       return;
    }
}

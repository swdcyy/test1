package com.kuaishou.weapon.ks.bd$1;
import java.lang.Runnable;
import com.kuaishou.weapon.ks.bd;
import java.lang.Object;
import android.content.Context;
import com.kuaishou.weapon.ks.d;
import java.lang.String;
import java.lang.System;
import com.kuaishou.weapon.ks.o;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.weapon.ks.bs;

public class bd$1 implements Runnable	// class@0011de
{
    public final int a;
    public final bd b;

    public void bd$1(bd p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       d uod = d.a(bd.a(this.b));
       int i = 1;
       if (uod.b("plc001_b_s_s", i) == i) {
          if ((System.currentTimeMillis() - uod.f()) - ((long)uod.b("plc001_b_i_s", 6) * 0x36ee80) < 0) {
             bd$1 ta = this.a;
             i = 115;
             if (ta <= null || (ta != 104 && (ta == i && (ta != 104 && (ta == i && (o.a <= 0 && ta != 103)))))) {
             label_0065 :
                return;
             }
          }
          bd.a(this.b, this.a);
          if (TextUtils.isEmpty(uod.c("plc001_lss_oa_d"))) {
             String str = bs.g();
             if (!TextUtils.isEmpty(str)) {
                uod.e(str);
                goto label_0065 ;
             }else {
                goto label_0065 ;
             }
          }else {
             goto label_0065 ;
          }
       }else {
          goto label_0065 ;
       }
    }
}

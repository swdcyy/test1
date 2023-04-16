package com.kuaishou.weapon.i.WeaponHI$13;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.weapon.i.WeaponHI;
import android.content.Context;
import com.kuaishou.weapon.ks.d;
import java.lang.String;

public final class WeaponHI$13 implements Runnable	// class@0011ac
{
    public final float a;
    public final float b;

    public void WeaponHI$13(float p0,float p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void run(){
       d uod;
       String str;
       int t = WeaponHI.t;
       if (!t) {
          return;
       }
       if (t > 0 && WeaponHI.c >= t) {
          return;
       }
       WeaponHI.c = WeaponHI.c + 1;
       if (WeaponHI.t == -1) {
          int i = 0;
          WeaponHI.t = d.a(WeaponHI.mContext).a("plc001_pd_ac_pc", i);
          WeaponHI.cs = i;
          WeaponHI.cp = i;
       }
       if (!WeaponHI.t) {
          return;
       }else {
          float ls = WeaponHI.ls;
          int i1 = 0xbf800000;
          if (ls - i1 && !ls - this.a) {
             WeaponHI.cs = WeaponHI.cs + 1;
          }
          WeaponHI.ls = this.a;
          ls = WeaponHI.lp;
          if (ls - i1 && !ls - this.b) {
             WeaponHI.cp = WeaponHI.cp + 1;
          }
          WeaponHI.lp = this.b;
          i1 = 8;
          if (WeaponHI.cs > i1 && WeaponHI.cp > i1) {
             t = WeaponHI.type;
             if (t == 6) {
                uod = d.a(WeaponHI.mContext);
                str = "ps_pd_l_d";
             }else if(t == 3){
                uod = d.a(WeaponHI.mContext);
                str = "ps_pd_c_d";
             }else {
                uod = d.a(WeaponHI.mContext);
                str = "ps_pd_s_d";
             }
             uod.a(str, 1, 1);
          }
          return;
       }
    }
}

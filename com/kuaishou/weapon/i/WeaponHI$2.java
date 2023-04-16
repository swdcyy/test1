package com.kuaishou.weapon.i.WeaponHI$2;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.weapon.i.WeaponHI;
import android.content.Context;
import com.kuaishou.weapon.ks.d;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.System;

public final class WeaponHI$2 implements Runnable	// class@0011ae
{
    public final boolean a;
    public final int b;
    public final int c;

    public void WeaponHI$2(boolean p0,int p1,int p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       long l1;
       String str = "a1_p_l_m_m";
       String str1 = "a1_p_s_m_m";
       String str2 = "|";
       String str3 = "a1_p_c_m_m";
       int i = 0;
       if (this.a != null) {
          WeaponHI$2 tb = this.b;
          if (tb == 3) {
             d.a(WeaponHI.mContext).a(str3, (d.a(WeaponHI.mContext).a(str3, i) + 1), i);
          }else if(tb == 2){
             d.a(WeaponHI.mContext).a(str1, (d.a(WeaponHI.mContext).a(str1, i) + 1), i);
          }else if(tb == 6){
             d.a(WeaponHI.mContext).a(str, (d.a(WeaponHI.mContext).a(str, i) + 1), i);
          }
       }
       str = this.c+str2+WeaponHI.num+str2+WeaponHI.count;
       long l = 0;
       if (WeaponHI.type == this.b && WeaponHI.ts - l > 0) {
          l1 = System.currentTimeMillis() - WeaponHI.ts;
          WeaponHI.ts = l;
          WeaponHI.count = i;
          WeaponHI.num = i;
          WeaponHI.type = i;
       }else {
          l1 = l;
       }
       str3 = this.b;
       String str4 = (this.a != null)? "1": "0";
       str1 = (l1 - l > 0)? l1: null;
       WeaponHI.b(str3, null, str4, str1, str);
       return;
    }
}

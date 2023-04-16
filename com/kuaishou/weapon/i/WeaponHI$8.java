package com.kuaishou.weapon.i.WeaponHI$8;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.weapon.i.WeaponHI;
import android.content.Context;
import com.kuaishou.weapon.ks.x;
import com.kuaishou.weapon.ks.d;
import java.lang.String;

public final class WeaponHI$8 implements Runnable	// class@0011b4
{
    public final int a;
    public final boolean b;

    public void WeaponHI$8(int p0,boolean p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void run(){
       x ox = x.a(WeaponHI.mContext);
       if (ox == null) {
          return;
       }
       WeaponHI$8 ta = this.a;
       String str = 7;
       if (ta == str || ta == 8) {
          d uod = d.a(WeaponHI.mContext);
          str = (this.a == str)? "plc001_s_fa_s": "plc001_s_fa_e";
          uod.a(str, this.b, true);
       }
       ox.c(this.a);
       return;
    }
}

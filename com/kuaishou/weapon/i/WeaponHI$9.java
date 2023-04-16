package com.kuaishou.weapon.i.WeaponHI$9;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.weapon.i.WeaponHI;
import com.kuaishou.weapon.ks.an;
import android.content.Context;
import com.kuaishou.weapon.ks.bd;
import com.kuaishou.weapon.ks.x;

public final class WeaponHI$9 implements Runnable	// class@0011b5
{
    public final int a;

    public void WeaponHI$9(int p0){
       this.a = p0;
       super();
    }
    public void run(){
       if (this.a == 115) {
          WeaponHI.pl = 0;
          WeaponHI.pt = null;
       }
       if (!WeaponHI.ps) {
          new an(WeaponHI.mContext).a(this.a);
          new bd(WeaponHI.mContext).a(this.a);
       }
       x ox = x.a(WeaponHI.mContext);
       if (ox == null) {
          return;
       }else {
          ox.c(this.a);
          return;
       }
    }
}

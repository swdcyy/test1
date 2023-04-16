package com.kuaishou.weapon.i.WeaponHI$1;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.weapon.i.WeaponHI;
import android.content.Context;
import com.kuaishou.weapon.ks.d;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.weapon.ks.x;

public final class WeaponHI$1 implements Runnable	// class@0011ad
{
    public final boolean a;

    public void WeaponHI$1(boolean p0){
       this.a = p0;
       super();
    }
    public void run(){
       x ox;
       Context mContext = WeaponHI.mContext;
       if (mContext != null) {
          d uod = d.a(mContext);
          WeaponHI$1 ta = this.a;
          if (ta == null) {
             uod.a("a1_p_s_p_s_c_b", Boolean.valueOf(ta), true);
             ox = x.a(WeaponHI.mContext);
             if (ox != null) {
                ox.i();
             }
             return;
          }else if(!uod.f("a1_p_s_p_s_c_b")){
             uod.a("a1_p_s_p_s_c_b", Boolean.valueOf(this.a), true);
             ox = x.a(WeaponHI.mContext);
             if (ox != null) {
                ox.i();
             }
          }
       }
       return;
    }
}

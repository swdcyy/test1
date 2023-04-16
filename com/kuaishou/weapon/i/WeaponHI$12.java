package com.kuaishou.weapon.i.WeaponHI$12;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.weapon.i.WeaponHI;
import android.content.Context;
import com.kuaishou.weapon.ks.d;
import java.lang.String;

public final class WeaponHI$12 implements Runnable	// class@0011ab
{
    public final int a;

    public void WeaponHI$12(int p0){
       this.a = p0;
       super();
    }
    public void run(){
       d.a(WeaponHI.mContext).a("a1_p_c_n_m", this.a, false);
    }
}

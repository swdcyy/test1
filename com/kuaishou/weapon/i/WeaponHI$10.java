package com.kuaishou.weapon.i.WeaponHI$10;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.weapon.i.WeaponHI;
import android.content.Context;
import com.kuaishou.weapon.ks.d;

public final class WeaponHI$10 implements Runnable	// class@0011a9
{
    public final String a;

    public void WeaponHI$10(String p0){
       this.a = p0;
       super();
    }
    public void run(){
       if (!TextUtils.isEmpty(this.a)) {
          d.a(WeaponHI.mContext).a(true, "w_t_u_a", this.a);
       }
       return;
    }
}

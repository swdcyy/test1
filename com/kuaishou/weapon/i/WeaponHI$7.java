package com.kuaishou.weapon.i.WeaponHI$7;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.weapon.i.WeaponHI;
import android.content.Context;
import com.kuaishou.weapon.ks.x;
import com.kuaishou.weapon.ks.d;
import java.lang.String;
import com.kuaishou.weapon.ks.bs;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.weapon.ks.r;
import java.util.concurrent.ThreadPoolExecutor;
import com.kuaishou.weapon.ks.an;
import com.kuaishou.weapon.ks.bd;

public final class WeaponHI$7 implements Runnable	// class@0011b3
{

    public void WeaponHI$7(){
       super();
    }
    public void run(){
       x ox = x.a(WeaponHI.mContext);
       if (ox == null) {
          return;
       }
       d.a(WeaponHI.mContext).a("a1_n_d_i", bs.e(WeaponHI.mContext), true);
       if (!TextUtils.isEmpty(ox.h) && !(ox.h).equals(bs.e(WeaponHI.mContext))) {
          r.a().b().setCorePoolSize(3);
       }
       new an(WeaponHI.mContext).a(0x1869f);
       new bd(WeaponHI.mContext).a(0x1869f);
       ox.c(0x1869f);
       return;
    }
}

package com.kuaishou.weapon.ks.bv$1;
import java.util.TimerTask;
import android.content.Context;
import com.kuaishou.weapon.ks.d;
import java.lang.String;
import com.kuaishou.weapon.ks.bv;
import com.kuaishou.weapon.i.WeaponHI;
import com.kuaishou.weapon.i.WeaponN;
import com.kuaishou.weapon.ks.ah;
import java.util.List;
import com.kuaishou.weapon.ks.o;
import com.kuaishou.weapon.ks.x;
import com.kuaishou.weapon.i.WeaponCB;
import com.kuaishou.weapon.ks.an;
import com.kuaishou.weapon.ks.az;

public final class bv$1 extends TimerTask	// class@0011f6
{
    public final Context a;

    public void bv$1(Context p0){
       this.a = p0;
       super();
    }
    public void run(){
       if (!d.a(this.a).b("plc001_pd_l_i", 5)) {
          bv.a();
          return;
       }else {
          WeaponN mWeaponN = WeaponHI.mWeaponN;
          if (mWeaponN != null && (mWeaponN.c() && (ah.a(this.a).b() != null && (!ah.a(this.a).b().size() || o.b > 0)))) {
             x.a(this.a).a(false, null);
          }
       label_0048 :
          new an(this.a).a(999);
          new az(this.a).a(999);
          return;
       }
    }
}

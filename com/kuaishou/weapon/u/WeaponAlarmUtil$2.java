package com.kuaishou.weapon.u.WeaponAlarmUtil$2;
import java.lang.Runnable;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.weapon.ks.r;
import com.kuaishou.weapon.u.WeaponAlarmUtil$2$1;

public final class WeaponAlarmUtil$2 implements Runnable	// class@001241
{
    public final Context a;
    public final String b;

    public void WeaponAlarmUtil$2(Context p0,String p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void run(){
       r.a().a(new WeaponAlarmUtil$2$1(this));
    }
}

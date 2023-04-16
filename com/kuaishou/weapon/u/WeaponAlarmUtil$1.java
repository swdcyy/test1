package com.kuaishou.weapon.u.WeaponAlarmUtil$1;
import java.lang.Runnable;
import android.content.Context;
import java.lang.String;
import java.lang.Long;
import java.lang.Object;
import com.kuaishou.weapon.ks.r;
import com.kuaishou.weapon.u.WeaponAlarmUtil$1$1;

public final class WeaponAlarmUtil$1 implements Runnable	// class@00123f
{
    public final Context a;
    public final String b;
    public final Long c;

    public void WeaponAlarmUtil$1(Context p0,String p1,Long p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       r.a().a(new WeaponAlarmUtil$1$1(this));
    }
}

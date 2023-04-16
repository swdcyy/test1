package com.kuaishou.weapon.u.WeaponAlarmUtil;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.os.Handler;
import android.os.Looper;
import com.kuaishou.weapon.u.WeaponAlarmUtil$2;
import java.lang.Runnable;
import java.lang.Throwable;
import com.kuaishou.weapon.ks.bh;
import java.lang.Long;
import com.kuaishou.weapon.u.WeaponAlarmUtil$1;

public class WeaponAlarmUtil	// class@001242
{

    public void WeaponAlarmUtil(){
       super();
    }
    public static void cancelRTCAlarm(Context p0,String p1){
       new Handler(Looper.getMainLooper()).postDelayed(new WeaponAlarmUtil$2(p0, p1), 0xea60);
       return;
    }
    public static void setRTCAlarm(Context p0,String p1,Long p2){
       new Handler(Looper.getMainLooper()).postDelayed(new WeaponAlarmUtil$1(p0, p1, p2), 0xea60);
       return;
    }
}

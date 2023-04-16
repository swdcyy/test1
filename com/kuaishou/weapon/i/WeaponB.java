package com.kuaishou.weapon.i.WeaponB;
import com.kuaishou.weapon.i.WeaponBI;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.weapon.i.WeaponHI;
import android.content.Context;
import com.kuaishou.weapon.ks.bq;
import com.kuaishou.weapon.ks.cc;

public class WeaponB implements WeaponBI	// class@0011a5
{
    public static WeaponB sInstance;

    public void WeaponB(){
       super();
    }
    public static synchronized WeaponB getInstance(){
       _monitor_enter(WeaponB.class);
       if (WeaponB.sInstance == null) {
          WeaponB.sInstance = new WeaponB();
       }
       _monitor_exit(WeaponB.class);
       return WeaponB.sInstance;
    }
    public String n(String p0){
       try{
          return bq.a(p0, WeaponHI.mContext);
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public void t(String p0){
       try{
          cc uocc = cc.a();
          if (uocc != null) {
             uocc.a(p0);
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
}

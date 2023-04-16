package com.kuaishou.weapon.ks.bv;
import java.lang.Object;
import java.util.Timer;
import android.content.Context;
import com.kuaishou.weapon.ks.d;
import java.lang.String;
import com.kuaishou.weapon.ks.bv$1;
import java.util.TimerTask;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.weapon.i.WeaponHI;
import com.kuaishou.weapon.i.WeaponN;
import com.kuaishou.weapon.ks.o;

public class bv	// class@0011f7
{
    public static Timer a;
    public static TimerTask b;
    public static boolean c;

    public void bv(){
       super();
    }
    public static void a(){
       Timer a = bv.a;
       if (a != null) {
          a.cancel();
       }
       bv.a = null;
       if (bv.b != null) {
          bv.b = null;
       }
       return;
    }
    public static void a(Context p0){
       if (bv.c) {
          return;
       }
       bv.c = true;
       int i = d.a(p0).b("plc001_pd_h_i", 5);
       if (!i) {
          return;
       }
       bv.a();
       bv.a = new Timer();
       bv$1 u1 = new bv$1(p0);
       bv.b = u1;
       bv.a.schedule(u1, 5000, (long)(i * 1000));
       return;
    }
    public static void a(Context p0,boolean p1,String p2){
       if (!TextUtils.isEmpty(p2) && p2.contains("result\":1,")) {
          bv.a();
          WeaponN mWeaponN = WeaponHI.mWeaponN;
          if (mWeaponN != null) {
             mWeaponN.u();
          }
          if (p1) {
             WeaponHI.mWeaponN = null;
          }
       }else if(!p1 && (o.a > 0 || o.b > 0)){
          WeaponN mWeaponN1 = WeaponHI.mWeaponN;
          if (mWeaponN1 != null) {
             mWeaponN1.r();
          }
          bv.a(p0);
       }
       return;
    }
}

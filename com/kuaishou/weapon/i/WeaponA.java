package com.kuaishou.weapon.i.WeaponA;
import com.kuaishou.weapon.i.WeaponAI;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.weapon.i.WeaponCB;
import java.lang.Class;
import com.kuaishou.weapon.ks.z;
import android.content.IntentFilter;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.weapon.ks.ac;
import com.kuaishou.weapon.ks.ah;
import com.kuaishou.weapon.ks.x;

public class WeaponA implements WeaponAI	// class@0011a3
{
    public static WeaponA sInstance;

    public void WeaponA(){
       super();
    }
    public static synchronized WeaponA getInstance(){
       _monitor_enter(WeaponA.class);
       if (WeaponA.sInstance == null) {
          WeaponA.sInstance = new WeaponA();
       }
       _monitor_exit(WeaponA.class);
       return WeaponA.sInstance;
    }
    public void cm(String p0,String p1,String p2,WeaponCB p3,Class[] p4,Object[] p5){
    }
    public String p(String p0){
       z oz = z.a();
       if (oz != null) {
          return oz.e(p0);
       }
       return null;
    }
    public void r(String p0,IntentFilter p1,String p2,String p3){
       if (TextUtils.isEmpty(p0) || (p1 == null || (!TextUtils.isEmpty(p2) && !TextUtils.isEmpty(p2)))) {
          z oz = z.a();
          if (oz == null) {
             return;
          }else {
             oz.a(new ac(p0, p2, p3, p1));
          }
       }
       return;
    }
    public void sp(String p0,boolean p1){
       ah uoah = ah.a();
       if (uoah == null) {
          return;
       }
       uoah.a(p0, p1);
       return;
    }
    public void ssb(int p0,boolean p1){
       ah uoah = ah.a();
       if (uoah == null) {
          return;
       }
       uoah.a(p0, p1);
       return;
    }
    public void u(String p0){
       x ox = x.a();
       if (ox != null) {
          ox.a(p0);
       }
       return;
    }
    public void ur(String p0,IntentFilter p1,String p2,String p3){
       if (TextUtils.isEmpty(p0) || (p1 == null || (!TextUtils.isEmpty(p2) && !TextUtils.isEmpty(p2)))) {
          z oz = z.a();
          if (oz == null) {
             return;
          }else {
             oz.b(new ac(p0, p2, p3, p1));
          }
       }
       return;
    }
}

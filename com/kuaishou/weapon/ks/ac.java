package com.kuaishou.weapon.ks.ac;
import java.lang.String;
import android.content.IntentFilter;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;

public class ac	// class@0011be
{
    public String a;
    public String b;
    public String c;
    public IntentFilter d;

    public void ac(String p0,String p1,String p2,IntentFilter p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public boolean a(ac p0){
       boolean b = false;
       if (p0 != null && (!TextUtils.isEmpty(p0.a) && (TextUtils.isEmpty(p0.b) || (!TextUtils.isEmpty(p0.c) && ((p0.a).equals(this.a) && (!(p0.b).equals(this.b) || !(p0.c).equals(this.c))))))) {
          return b;
       }
       p0 = p0.d;
       if (p0 != null) {
          ac td = this.d;
          if (td != null) {
             if (td == p0) {
                b = true;
             }
             return b;
          }
       }
       return true;
    }
    public String toString(){
       return "WeaponSDKIntentFilter:"+this.a+"-"+this.b+"-"+this.c+"-"+this.d;
    }
}

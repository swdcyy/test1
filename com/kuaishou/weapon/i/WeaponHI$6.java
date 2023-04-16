package com.kuaishou.weapon.i.WeaponHI$6;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.weapon.i.WeaponHI;
import android.content.Context;
import com.kuaishou.weapon.ks.x;

public final class WeaponHI$6 implements Runnable	// class@0011b2
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public void WeaponHI$6(String p0,String p1,String p2,String p3,String p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void run(){
       x ox = x.a(WeaponHI.mContext);
       if (ox == null) {
          return;
       }
       ox.a(this.a, this.b, this.c, this.d, this.e);
       return;
    }
}

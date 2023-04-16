package com.kuaishou.weapon.i.WeaponHI$5;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.weapon.i.WeaponHI;

public final class WeaponHI$5 implements Runnable	// class@0011b1
{
    public final String a;

    public void WeaponHI$5(String p0){
       this.a = p0;
       super();
    }
    public void run(){
       WeaponHI.b("1006", null, this.a, "", null);
    }
}

package com.kuaishou.weapon.i.WeaponHI$4;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.weapon.i.WeaponHI;

public final class WeaponHI$4 implements Runnable	// class@0011b0
{
    public final String a;

    public void WeaponHI$4(String p0){
       this.a = p0;
       super();
    }
    public void run(){
       WeaponHI.b("1005", null, this.a, "", null);
    }
}

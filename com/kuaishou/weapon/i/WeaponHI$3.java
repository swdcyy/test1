package com.kuaishou.weapon.i.WeaponHI$3;
import java.lang.Runnable;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.weapon.i.WeaponHI;

public final class WeaponHI$3 implements Runnable	// class@0011af
{
    public final Context a;

    public void WeaponHI$3(Context p0){
       this.a = p0;
       super();
    }
    public void run(){
       WeaponHI.ip(this.a);
    }
}

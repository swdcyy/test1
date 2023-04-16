package com.kuaishou.weapon.ks.x$4;
import java.lang.Runnable;
import com.kuaishou.weapon.ks.x;
import com.kuaishou.weapon.i.WeaponCB;
import java.lang.Object;

public class x$4 implements Runnable	// class@001234
{
    public final WeaponCB a;
    public final x b;

    public void x$4(x p0,WeaponCB p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       this.b.a(true, this.a);
    }
}

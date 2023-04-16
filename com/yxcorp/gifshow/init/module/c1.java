package com.yxcorp.gifshow.init.module.c1;
import com.yxcorp.utility.NetworkUtilsCached$a;
import java.lang.Object;
import com.yxcorp.utility.NetworkUtilsCached;
import com.kuaishou.weapon.i.WeaponHI;

public final class c1 implements NetworkUtilsCached$a	// class@0019b6
{
    public static final c1 b;

    static {
       c1.b = new c1();
    }
    public void c1(){
       super();
    }
    public final void onNetworkChanged(){
       if (NetworkUtilsCached.k()) {
          WeaponHI.t(999);
       }
       return;
    }
}

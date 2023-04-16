package com.yxcorp.gifshow.init.module.WeaponSdkInitModule;
import com.kwai.framework.init.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.weapon.i.WeaponHI;
import qe6.b;
import android.app.Application;
import o56.a;
import android.content.Context;
import sxa.o0;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import com.yxcorp.gifshow.init.module.WeaponSdkInitModule$1;
import com.kuaishou.weapon.i.WeaponN;

public class WeaponSdkInitModule extends a	// class@0011d3
{
    public NetworkUtilsCached$a q;
    public static long r;
    public static long s;
    public static final int t;

    public void WeaponSdkInitModule(){
       super();
    }
    public boolean C(){
       return true;
    }
    public int f0(){
       return 25;
    }
    public void h0(){
       if (PatchProxy.applyVoidWithListener(null, this, WeaponSdkInitModule.class, "3")) {
          return;
       }
       WeaponHI.t(115);
       PatchProxy.onMethodExit(WeaponSdkInitModule.class, "3");
       return;
    }
    public void i0(){
       if (PatchProxy.applyVoidWithListener(null, this, WeaponSdkInitModule.class, "2")) {
          return;
       }
       WeaponHI.t(104);
       PatchProxy.onMethodExit(WeaponSdkInitModule.class, "2");
       return;
    }
    public void n(){
       if (PatchProxy.applyVoidWithListener(null, this, WeaponSdkInitModule.class, "1")) {
          return;
       }
       int[] ointArray = new int[]{0};
       WeaponHI.init(a.b().getApplicationContext(), "20000", "62ebf25b56db70709d007a06099792f1", b.a(), WeaponSdkInitModule.r, WeaponSdkInitModule.s, ointArray);
       e.h(new o0("20000", "62ebf25b56db70709d007a06099792f1"), "WeaponInitModule", 1);
       WeaponHI.rc(new WeaponSdkInitModule$1(this));
       PatchProxy.onMethodExit(WeaponSdkInitModule.class, "1");
       return;
    }
}

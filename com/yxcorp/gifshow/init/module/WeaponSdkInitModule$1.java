package com.yxcorp.gifshow.init.module.WeaponSdkInitModule$1;
import com.kuaishou.weapon.i.WeaponN;
import com.yxcorp.gifshow.init.module.WeaponSdkInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.utility.NetworkUtilsCached;
import com.yxcorp.gifshow.init.module.c1;
import com.yxcorp.utility.NetworkUtilsCached$a;

public class WeaponSdkInitModule$1 implements WeaponN	// class@0019ac
{
    public final WeaponSdkInitModule a;

    public void WeaponSdkInitModule$1(WeaponSdkInitModule p0){
       this.a = p0;
       super();
    }
    public boolean c(){
       WeaponSdkInitModule$1 u1 = WeaponSdkInitModule$1.class;
       Object obj = PatchProxy.applyWithListener(null, this, u1, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PatchProxy.onMethodExit(u1, "2");
       return NetworkUtilsCached.k();
    }
    public void r(){
       if (PatchProxy.applyVoidWithListener(null, this, WeaponSdkInitModule$1.class, "1")) {
          return;
       }
       WeaponSdkInitModule$1 ta = this.a;
       if (ta.q == null) {
          c1 b = c1.b;
          ta.q = b;
          NetworkUtilsCached.m(b);
       }
       PatchProxy.onMethodExit(WeaponSdkInitModule$1.class, "1");
       return;
    }
    public void u(){
       if (PatchProxy.applyVoidWithListener(null, this, WeaponSdkInitModule$1.class, "3")) {
          return;
       }
       WeaponSdkInitModule q = this.a.q;
       if (q != null) {
          NetworkUtilsCached.n(q);
          this.a.q = null;
       }
       PatchProxy.onMethodExit(WeaponSdkInitModule$1.class, "3");
       return;
    }
}

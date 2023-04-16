package pxa.c;
import com.kuaishou.android.security.base.log.KSecuritySdkILog;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import com.yxcorp.gifshow.init.module.WeaponSdkInitModule;
import com.kwai.framework.security.a;
import com.kuaishou.android.security.base.exception.KSException;
import java.lang.Exception;

public class c implements KSecuritySdkILog	// class@002210
{

    public void c(){
       super();
    }
    public void onSecuriySuccess(){
       if (PatchProxy.applyVoidWithListener(null, this, c.class, "2")) {
          return;
       }
       WeaponSdkInitModule.s = System.currentTimeMillis();
       a.g(true);
       a.b = System.currentTimeMillis();
       PatchProxy.onMethodExit(c.class, "2");
       return;
    }
    public void onSeucrityError(KSException p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c.class, "1")) {
          return;
       }
       p0.printStackTrace();
       a.g(false);
       a.a(p0);
       PatchProxy.onMethodExit(c.class, "1");
       return;
    }
    public void report(String p0,String p1){
    }
}

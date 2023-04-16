package com.yxcorp.gifshow.init.module.RobustInitModule2$1;
import com.yxcorp.gifshow.w$b;
import com.yxcorp.gifshow.init.module.RobustInitModule2;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import com.kwai.robust2.patchmanager.c;
import uv8.o1;

public class RobustInitModule2$1 implements w$b	// class@00199c
{
    public final RobustInitModule2 a;

    public void RobustInitModule2$1(RobustInitModule2 p0){
       this.a = p0;
       super();
    }
    public void a(Activity p0){
    }
    public void b(){
       if (PatchProxy.applyVoidWithListener(null, this, RobustInitModule2$1.class, "1")) {
          return;
       }
       if (!this.a.n0("/rest/zt/appsupport/android/hotfix/multiplepatch/check", RequestTiming.COLD_START)) {
          c.a().j(null);
       }
       PatchProxy.onMethodExit(RobustInitModule2$1.class, "1");
       return;
    }
    public void c(int p0,String p1){
       o1.d(this, p0, p1);
    }
    public void d(Activity p0){
       o1.c(this, p0);
    }
    public void e(Activity p0){
       o1.b(this, p0);
    }
}

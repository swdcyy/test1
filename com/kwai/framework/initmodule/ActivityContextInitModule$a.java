package com.kwai.framework.initmodule.ActivityContextInitModule$a;
import com.kwai.framework.activitycontext.ActivityContext$b;
import com.kwai.framework.initmodule.ActivityContextInitModule;
import java.lang.Object;
import android.app.Activity;
import m56.a;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.os.Build;
import java.lang.CharSequence;
import e66.c;
import q87.c;
import com.huawei.emui.hiexperience.hwperf.prelaunch.HwPerfPrelaunch;
import p56.b;
import com.kwai.framework.app.huaweisuperapp.HuaweiSuperAppPrelaunchStage;
import org.greenrobot.eventbus.a;
import p56.a;
import wkd.b;
import com.yxcorp.gifshow.w;
import com.yxcorp.gifshow.log.h;
import java.lang.StringBuilder;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import android.os.Process;
import f3b.h;

public class ActivityContextInitModule$a implements ActivityContext$b	// class@001570
{
    public final ActivityContextInitModule b;

    public void ActivityContextInitModule$a(ActivityContextInitModule p0){
       this.b = p0;
       super();
    }
    public void a(Activity p0){
       a.b(this, p0);
    }
    public void d(Activity p0){
       a.d(this, p0);
    }
    public void e(Activity p0){
       a.c(this, p0);
    }
    public void f(Activity p0,Bundle p1){
       Object[] objArray;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ActivityContextInitModule$a.class, "3")) {
          return;
       }
       ActivityContextInitModule$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, ActivityContextInitModule.class, "2")) {
          int i = 0;
          if (!((Build.BRAND).toLowerCase()).contains("huawei")) {
             objArray = new Object[i];
             c.C().s("KS_HW", "非华为手机 跳过超级 App 流程", objArray);
          }else if(b.a() == null){
             objArray = new Object[i];
             c.C().s("KS_HW", "HWPerf 初始化失败 跳过超级 App 流程", objArray);
          }else if(b.c() == HuaweiSuperAppPrelaunchStage.PRELAUNCHING){
             b.a().finishPrelaunch();
             a.d().n(new a());
             objArray = new Object[i];
             c.C().s("KS_HW", "华为超级 App 预启动完成", objArray);
             b.a(-1343064608).m0();
             b.d(HuaweiSuperAppPrelaunchStage.PRELAUNCH_FINISH);
          }
       }
       return;
    }
    public void onBackground(){
       if (PatchProxy.applyVoid(null, this, ActivityContextInitModule$a.class, "2")) {
          return;
       }
       b.a(0x4b316083).v0(false);
       Object[] objArray = new Object[false];
       c.C().w("ActivityContextInitModule", "onBackground: "+SystemUtil.r(a.b())+"  "+Process.myPid()+" "+h.b(true), objArray);
       return;
    }
    public void onForeground(){
       if (PatchProxy.applyVoid(null, this, ActivityContextInitModule$a.class, "1")) {
          return;
       }
       b.a(0x4b316083).v0(true);
       Object[] objArray = new Object[0];
       c.C().w("ActivityContextInitModule", "onForeground: "+SystemUtil.r(a.b())+"  "+Process.myPid()+" "+h.b(true), objArray);
       return;
    }
}

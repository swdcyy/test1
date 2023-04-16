package com.kwai.component.upgrade.f$a;
import zjd.d;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Application;
import o56.c;
import o56.a;

public class f$a implements d	// class@000c01
{

    public void f$a(){
       super();
    }
    public Activity c(){
       Object obj = PatchProxy.apply(null, this, f$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ActivityContext.g().e();
    }
    public Application getApplication(){
       Object obj = PatchProxy.apply(null, this, f$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a().a();
    }
}

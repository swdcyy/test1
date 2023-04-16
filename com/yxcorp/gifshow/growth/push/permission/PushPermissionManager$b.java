package com.yxcorp.gifshow.growth.push.permission.PushPermissionManager$b;
import com.kwai.framework.activitycontext.ActivityContext$b;
import com.yxcorp.gifshow.growth.push.permission.PushPermissionManager;
import java.lang.Object;
import android.app.Activity;
import m56.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.activitycontext.ActivityContext;
import android.os.Bundle;

public final class PushPermissionManager$b implements ActivityContext$b	// class@0014ab
{
    public final PushPermissionManager b;

    public void PushPermissionManager$b(PushPermissionManager p0){
       this.b = p0;
       super();
    }
    public void a(Activity p0){
       a.b(this, p0);
    }
    public void d(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PushPermissionManager$b.class, "1")) {
          return;
       }
       this.b.a(p0);
       ActivityContext.k(this);
       return;
    }
    public void e(Activity p0){
       a.c(this, p0);
    }
    public void f(Activity p0,Bundle p1){
       a.a(this, p0, p1);
    }
    public void onBackground(){
       a.e(this);
    }
    public void onForeground(){
       a.f(this);
    }
}

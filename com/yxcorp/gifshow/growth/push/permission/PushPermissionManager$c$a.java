package com.yxcorp.gifshow.growth.push.permission.PushPermissionManager$c$a;
import com.kwai.framework.activitycontext.ActivityContext$b;
import com.yxcorp.gifshow.growth.push.permission.PushPermissionManager$c;
import java.lang.Object;
import android.app.Activity;
import m56.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.growth.push.permission.PushPermissionManager;
import com.kwai.framework.activitycontext.ActivityContext;
import android.os.Bundle;

public final class PushPermissionManager$c$a implements ActivityContext$b	// class@0014ac
{
    public final PushPermissionManager$c b;

    public void PushPermissionManager$c$a(PushPermissionManager$c p0){
       this.b = p0;
       super();
    }
    public void a(Activity p0){
       a.b(this, p0);
    }
    public void d(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PushPermissionManager$c$a.class, "1")) {
          return;
       }
       this.b.b.a(p0);
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

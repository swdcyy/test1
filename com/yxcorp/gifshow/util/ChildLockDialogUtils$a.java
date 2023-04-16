package com.yxcorp.gifshow.util.ChildLockDialogUtils$a;
import com.kwai.framework.activitycontext.ActivityContext$b;
import java.lang.Object;
import android.app.Activity;
import m56.a;
import com.yxcorp.gifshow.util.ChildLockDialogUtils;
import com.kwai.component.uiconfig.childlock.model.TeenageModeConfig;
import uj9.n;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import android.os.Bundle;

public class ChildLockDialogUtils$a implements ActivityContext$b	// class@001ed5
{

    public void ChildLockDialogUtils$a(){
       super();
    }
    public void a(Activity p0){
       a.b(this, p0);
    }
    public void d(Activity p0){
       ChildLockDialogUtils.a(p0);
       if (ChildLockDialogUtils.f) {
          ChildLockDialogUtils.k(ChildLockDialogUtils.c, p0);
          Object[] objArray = new Object[0];
          n.C().w("TeenageMode", "onActivityResume, currentActivity="+p0, objArray);
       }
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

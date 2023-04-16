package com.yxcorp.gifshow.lelink.floatbutton.FloatButtonManager$b;
import com.kwai.framework.activitycontext.ActivityContext$b;
import com.yxcorp.gifshow.lelink.floatbutton.FloatButtonManager;
import java.lang.Object;
import android.app.Activity;
import m56.a;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class FloatButtonManager$b implements ActivityContext$b	// class@001a3f
{
    public final FloatButtonManager b;

    public void FloatButtonManager$b(FloatButtonManager p0){
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
       a.a(this, p0, p1);
    }
    public void onBackground(){
       if (PatchProxy.applyVoid(null, this, FloatButtonManager$b.class, "1")) {
          return;
       }
       a.e(this);
       this.b.d("page onBackground");
       this.b.hide();
       return;
    }
    public void onForeground(){
       if (PatchProxy.applyVoid(null, this, FloatButtonManager$b.class, "2")) {
          return;
       }
       a.f(this);
       this.b.d("page onForeground");
       FloatButtonManager$b tb = this.b;
       if (tb.b != null) {
          tb.show();
       }
       return;
    }
}

package com.kwai.component.photo.detail.core.log.vse.opt.b$b;
import com.kwai.framework.activitycontext.ActivityContext$b;
import com.kwai.component.photo.detail.core.log.vse.opt.b;
import java.lang.Object;
import java.lang.ref.WeakReference;
import android.app.Activity;
import m56.a;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class b$b implements ActivityContext$b	// class@000a2e
{
    public WeakReference b;

    public void b$b(b p0){
       super();
       this.b = new WeakReference(p0);
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
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b$b.class, "1")) {
          return;
       }
       b uob = this.b.get();
       if (uob != null) {
          if (!PatchProxy.applyVoid(objArray, uob, b.class, "5")) {
             uob.a();
          }
          uob.e("background");
       }
       return;
    }
    public void onForeground(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b$b.class, "2")) {
          return;
       }
       b uob = this.b.get();
       if (uob != null && !PatchProxy.applyVoid(objArray, uob, b.class, "6")) {
          uob.d();
       }
       return;
    }
}

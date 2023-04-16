package j89.i;
import com.kwai.framework.activitycontext.ActivityContext$b;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j89.j;
import wkd.b;
import com.yxcorp.gifshow.w;
import j89.g;
import m56.a;
import android.os.Bundle;
import hn5.n;
import hn5.m;
import android.content.Context;
import android.content.Intent;

public class i implements ActivityContext$b	// class@0019c6
{

    public void i(){
       super();
    }
    public void a(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "3")) {
          return;
       }
       if (j.z0(p0)) {
          b.a(-1343064608).onActivityDestroyed(p0);
       }
       return;
    }
    public void d(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       if (j.z0(p0)) {
          b.a(-1343064608).d(p0);
          if (b.a(-1343064608).isColdStart()) {
             g.a("frame_first");
          }
       }
       return;
    }
    public void e(Activity p0){
       a.c(this, p0);
    }
    public void f(Activity p0,Bundle p1){
       int i;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "1")) {
          return;
       }
       if (!m.a().U3(p0) && j.z0(p0)) {
          i = -1343064608;
          if (b.a(i) != null) {
             b.a(i).J(p0, p0.getIntent(), p1);
          }
       }
       return;
    }
    public void onBackground(){
       if (PatchProxy.applyVoid(null, this, i.class, "4")) {
          return;
       }
       b.a(-1343064608).onBackground();
       return;
    }
    public void onForeground(){
       a.f(this);
    }
}

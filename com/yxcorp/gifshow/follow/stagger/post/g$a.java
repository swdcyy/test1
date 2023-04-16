package com.yxcorp.gifshow.follow.stagger.post.g$a;
import com.kwai.framework.activitycontext.ActivityContext$b;
import com.yxcorp.gifshow.follow.stagger.post.g;
import java.lang.Object;
import android.app.Activity;
import m56.a;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.ComponentName;
import java.lang.CharSequence;
import h8c.a;
import q87.c;

public class g$a implements ActivityContext$b	// class@0011e4
{
    public final g b;

    public void g$a(g p0){
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g$a.class, "2")) {
          return;
       }
       String str = "WXEntryActivity";
       if ((p0.getComponentName().getClassName()).contains(str)) {
          Object[] objArray = new Object[]{str,"disposeShare"};
          a.C().w("MockFeedRepoImp", "onActivityCreate", objArray);
          this.b.b();
       }
       return;
    }
    public void onBackground(){
       if (PatchProxy.applyVoid(null, this, g$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("MockFeedRepoImp", "disposeShare", objArray);
       this.b.b();
       return;
    }
    public void onForeground(){
       a.f(this);
    }
}

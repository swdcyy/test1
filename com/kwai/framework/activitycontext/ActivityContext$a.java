package com.kwai.framework.activitycontext.ActivityContext$a;
import android.app.Activity;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class ActivityContext$a	// class@0014d2
{
    public final WeakReference a;
    public int b;

    public void ActivityContext$a(Activity p0,int p1){
       super();
       this.a = new WeakReference(p0);
       this.b = p1;
    }
    public Activity a(){
       Object obj = PatchProxy.apply(null, this, ActivityContext$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.get();
    }
}

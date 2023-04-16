package com.facebook.react.a$f$c;
import java.lang.Runnable;
import com.facebook.react.a$f;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.a;
import rd.x;
import com.facebook.react.bridge.UiThreadUtil;
import java.lang.Throwable;

public class a$f$c implements Runnable	// class@001177
{
    public final ReactApplicationContext b;
    public final a$f c;

    public void a$f$c(a$f p0,ReactApplicationContext p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$f$c.class, "1")) {
          return;
       }
       this.c.c.Q(this.b);
       UiThreadUtil.runOnUiThread(new x(this));
       return;
    }
}

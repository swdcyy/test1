package com.facebook.react.a$f$a;
import java.lang.Runnable;
import com.facebook.react.a$f;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.a;
import java.lang.Throwable;

public class a$f$a implements Runnable	// class@001175
{
    public final ReactApplicationContext b;
    public final a$f c;

    public void a$f$a(a$f p0,ReactApplicationContext p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$f$a.class, "1")) {
          return;
       }
       this.c.c.c(this.b);
       this.c.c.P(this.b);
       return;
    }
}

package com.facebook.react.a$g;
import java.lang.Runnable;
import com.facebook.react.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Thread;

public class a$g implements Runnable	// class@001179
{
    public final a b;

    public void a$g(a p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$g.class, "1")) {
          return;
       }
       if (this.b.d != null) {
          this.b.d.start();
       }
       return;
    }
}

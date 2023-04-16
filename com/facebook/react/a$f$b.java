package com.facebook.react.a$f$b;
import java.lang.Runnable;
import com.facebook.react.a$f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.a;
import com.facebook.react.a$j;

public class a$f$b implements Runnable	// class@001176
{
    public final a$f b;

    public void a$f$b(a$f p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$f$b.class, "1")) {
          return;
       }
       a$f c = this.b.c;
       a c1 = c.c;
       if (c1 != null) {
          c.O(c1);
          this.b.c.c = null;
       }
       return;
    }
}

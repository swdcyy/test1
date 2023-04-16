package com.facebook.react.a$h;
import java.lang.Runnable;
import com.facebook.react.a;
import com.facebook.react.a$k;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.ReactContext;

public class a$h implements Runnable	// class@00117a
{
    public final a$k[] b;
    public final ReactApplicationContext c;
    public final a d;

    public void a$h(a p0,a$k[] p1,ReactApplicationContext p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$h.class, "1")) {
          return;
       }
       a$h tb = this.b;
       int len = tb.length;
       int i = 0;
       while (i < len) {
          object oobject = tb[i];
          if (oobject != null) {
             oobject.a(this.c);
          }
          i = i + 1;
       }
       return;
    }
}

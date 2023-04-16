package com.facebook.react.a$b;
import java.lang.Runnable;
import com.facebook.react.a;
import ze.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class a$b implements Runnable	// class@001170
{
    public final int b;
    public final v c;
    public final a d;

    public void a$b(a p0,int p1,v p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       this.c.b(101);
       return;
    }
}

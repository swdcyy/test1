package com.kwai.yoda.slide.a$b;
import java.lang.Runnable;
import com.kwai.yoda.slide.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class a$b implements Runnable	// class@0012e8
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       this.b.p(0);
       return;
    }
}

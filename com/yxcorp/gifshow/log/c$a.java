package com.yxcorp.gifshow.log.c$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.log.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class c$a implements Runnable	// class@001af6
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "1")) {
          return;
       }
       this.b.d();
       return;
    }
}

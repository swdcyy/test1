package com.yxcorp.gifshow.prettify.makeup.i$c;
import l16.b;
import t16.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f1c.r;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import f1c.s;

public class i$c implements b	// class@001183
{
    public final a a;

    public void i$c(a p0){
       this.a = p0;
       super();
    }
    public void onComplete(){
       if (PatchProxy.applyVoid(null, this, i$c.class, "1")) {
          return;
       }
       c.k(new r(this.a));
       return;
    }
    public void onError(){
       if (PatchProxy.applyVoid(null, this, i$c.class, "2")) {
          return;
       }
       c.k(new s(this.a));
       return;
    }
    public void onProgress(float p0){
    }
}

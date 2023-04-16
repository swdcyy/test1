package com.gifshow.kanim.d;
import java.util.concurrent.Callable;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bh.e;
import com.gifshow.kanim.network.f;
import bh.a;
import dh.a;
import bh.i;

public final class d implements Callable	// class@0015bc
{
    public final Context b;
    public final String c;
    public final String d;

    public void d(Context p0,String p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object call(){
       e uoe = PatchProxy.apply(null, this, d.class, "1");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = a.b(this.b).a(this.c, this.d);
          if (this.d != null && uoe.b() != null) {
             a.b().c(this.d, uoe.b());
          }
       }
       return uoe;
    }
}

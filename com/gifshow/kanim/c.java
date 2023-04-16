package com.gifshow.kanim.c;
import java.util.concurrent.Callable;
import bh.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bh.e;

public final class c implements Callable	// class@0015bb
{
    public final i b;

    public void c(i p0){
       this.b = p0;
       super();
    }
    public Object call(){
       e uoe = PatchProxy.apply(null, this, c.class, "1");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e(this.b);
       }
       return uoe;
    }
}

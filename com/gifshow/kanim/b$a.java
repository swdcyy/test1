package com.gifshow.kanim.b$a;
import java.util.concurrent.Callable;
import bh.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bh.e;

public final class b$a implements Callable	// class@0015b5
{
    public final i b;

    public void b$a(i p0){
       this.b = p0;
       super();
    }
    public Object call(){
       e uoe = PatchProxy.apply(null, this, b$a.class, "1");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e(this.b);
       }
       return uoe;
    }
}

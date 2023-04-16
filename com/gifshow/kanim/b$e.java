package com.gifshow.kanim.b$e;
import java.util.concurrent.Callable;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bh.e;
import com.gifshow.kanim.b;

public final class b$e implements Callable	// class@0015b9
{
    public final Context b;
    public final String c;
    public final String d;

    public void b$e(Context p0,String p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object call(){
       e uoe = PatchProxy.apply(null, this, b$e.class, "1");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = b.c(this.b, this.c, this.d);
       }
       return uoe;
    }
}

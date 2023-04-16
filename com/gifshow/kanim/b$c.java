package com.gifshow.kanim.b$c;
import bh.n;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.gifshow.kanim.b;
import java.util.Map;

public final class b$c implements n	// class@0015b7
{
    public final String a;

    public void b$c(String p0){
       this.a = p0;
       super();
    }
    public void onResult(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
       }else {
          b.a.remove(this.a);
       }
       return;
    }
}

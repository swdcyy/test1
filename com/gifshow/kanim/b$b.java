package com.gifshow.kanim.b$b;
import bh.n;
import java.lang.String;
import java.lang.Object;
import bh.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.gifshow.kanim.b;
import java.util.Map;

public final class b$b implements n	// class@0015b6
{
    public final String a;

    public void b$b(String p0){
       this.a = p0;
       super();
    }
    public void onResult(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
       }else {
          b.a.remove(this.a);
       }
       return;
    }
}

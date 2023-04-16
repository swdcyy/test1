package com.kwai.framework.kxb.KxbInitModule$c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e96.e;
import q87.c;

public final class KxbInitModule$c implements g	// class@00161e
{
    public static final KxbInitModule$c b;

    static {
       KxbInitModule$c.b = new KxbInitModule$c();
    }
    public void KxbInitModule$c(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KxbInitModule$c.class, "1")) {
       }else {
          e.c.z("kxb", "network connect preload failed", p0);
       }
       return;
    }
}

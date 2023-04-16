package com.kwai.framework.kxb.KxbInitModule$e;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xu6.i;
import com.kwai.kxb.PlatformType;
import e96.e;
import q87.c;

public final class KxbInitModule$e implements Runnable	// class@001620
{
    public static final KxbInitModule$e b;

    static {
       KxbInitModule$e.b = new KxbInitModule$e();
    }
    public void KxbInitModule$e(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, KxbInitModule$e.class, "1")) {
          return;
       }
       PlatformType[] platformType = new PlatformType[]{PlatformType.KDS_REACT,PlatformType.KDS_VUE,PlatformType.KDS_NATIVE};
       i.b.a(platformType);
       Object[] objArray = new Object[0];
       e.c.w("kxb", "reportLocalBundleInfo", objArray);
       return;
    }
}

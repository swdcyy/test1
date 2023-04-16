package com.yxcorp.gifshow.growth.test.GrowthTestLayoutPartImpl$inflate$1$1$1$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpManager;
import y76.b;
import java.util.concurrent.ConcurrentHashMap;
import vma.a;
import java.lang.CharSequence;
import e17.i;
import e17.s;

public final class GrowthTestLayoutPartImpl$inflate$1$1$1$2 extends Lambda implements a	// class@0014fb
{
    public static final GrowthTestLayoutPartImpl$inflate$1$1$1$2 INSTANCE;

    static {
       GrowthTestLayoutPartImpl$inflate$1$1$1$2.INSTANCE = new GrowthTestLayoutPartImpl$inflate$1$1$1$2();
    }
    public void GrowthTestLayoutPartImpl$inflate$1$1$1$2(){
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, GrowthTestLayoutPartImpl$inflate$1$1$1$2.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, null, KgiCloudRpManager.class, "5")) {
          b.e("KgiCloudRp#clearShowMap : ===>", 0, 2, null);
          KgiCloudRpManager.d.clear();
          a.r("");
       }
       s.n("清除数据成功", 0);
       return;
    }
}

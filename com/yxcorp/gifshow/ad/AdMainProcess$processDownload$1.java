package com.yxcorp.gifshow.ad.AdMainProcess$processDownload$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.AdMainProcess;
import java.lang.Object;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.ad.AdProcess$c;
import com.yxcorp.gifshow.ad.AdProcess;
import nx8.q;

public final class AdMainProcess$processDownload$1 extends Lambda implements l	// class@0014ce
{
    public final AdMainProcess this$0;

    public void AdMainProcess$processDownload$1(AdMainProcess p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.intValue());
       return l1.a;
    }
    public final void invoke(int p0){
       if (PatchProxy.isSupport(AdMainProcess$processDownload$1.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AdMainProcess$processDownload$1.class, "1")) {
          return;
       }
       AdProcess$c uoc = this.this$0.f();
       if (uoc != null) {
          uoc.a(new q(p0));
       }
       return;
    }
}

package com.kuaishou.activity.kwaibubble.krn.KwaiPopKrn$bundleInfo$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.activity.kwaibubble.krn.KwaiPopKrn;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import vn.d;

public final class KwaiPopKrn$bundleInfo$2 extends Lambda implements a	// class@000779
{
    public final KwaiPopKrn this$0;

    public void KwaiPopKrn$bundleInfo$2(KwaiPopKrn p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, KwaiPopKrn$bundleInfo$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "bundleId="+this.this$0.a().l()+", componentName="+this.this$0.a().m();
    }
}

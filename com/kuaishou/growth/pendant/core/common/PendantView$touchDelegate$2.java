package com.kuaishou.growth.pendant.core.common.PendantView$touchDelegate$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.growth.pendant.core.common.PendantView;
import de0.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PendantView$touchDelegate$2 extends Lambda implements a	// class@000638
{
    public final PendantView this$0;

    public void PendantView$touchDelegate$2(PendantView p0){
       this.this$0 = p0;
       super(0);
    }
    public final c invoke(){
       Object obj = PatchProxy.apply(null, this, PendantView$touchDelegate$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.d();
    }
    public Object invoke(){
       return this.invoke();
    }
}

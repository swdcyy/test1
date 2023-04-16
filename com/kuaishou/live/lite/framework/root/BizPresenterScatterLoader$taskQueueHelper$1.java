package com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$taskQueueHelper$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mrd.a;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader;

public final class BizPresenterScatterLoader$taskQueueHelper$1 extends Lambda implements a	// class@00096b
{
    public final BizPresenterScatterLoader this$0;

    public void BizPresenterScatterLoader$taskQueueHelper$1(BizPresenterScatterLoader p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, BizPresenterScatterLoader$taskQueueHelper$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.this$0.q().i() == null)? true: false;
       return b;
    }
}

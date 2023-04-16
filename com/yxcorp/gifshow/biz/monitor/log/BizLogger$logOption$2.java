package com.yxcorp.gifshow.biz.monitor.log.BizLogger$logOption$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.biz.monitor.log.BizLogger;
import com.yxcorp.gifshow.biz.monitor.log.LogOption;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BizLogger$logOption$2 extends Lambda implements a	// class@001c57
{
    public final BizLogger this$0;

    public void BizLogger$logOption$2(BizLogger p0){
       this.this$0 = p0;
       super(0);
    }
    public final LogOption invoke(){
       Object obj = PatchProxy.apply(null, this, BizLogger$logOption$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.e();
    }
    public Object invoke(){
       return this.invoke();
    }
}

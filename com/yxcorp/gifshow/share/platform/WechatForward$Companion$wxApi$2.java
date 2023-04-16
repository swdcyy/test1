package com.yxcorp.gifshow.share.platform.WechatForward$Companion$wxApi$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.share.platform.WechatForward$Companion;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.share.KwaiOperator;
import android.content.Context;
import com.yxcorp.gifshow.share.KwaiOperator$a;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

public final class WechatForward$Companion$wxApi$2 extends Lambda implements a	// class@001c17
{
    public final WechatForward$Companion this$0;

    public void WechatForward$Companion$wxApi$2(WechatForward$Companion p0){
       this.this$0 = p0;
       super(0);
    }
    public final IWXAPI invoke(){
       Object obj = PatchProxy.apply(null, this, WechatForward$Companion$wxApi$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return WXAPIFactory.createWXAPI(KwaiOperator.q.b(), this.this$0.b(), true);
    }
    public Object invoke(){
       return this.invoke();
    }
}

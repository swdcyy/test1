package com.yxcorp.gifshow.share.wechat.WechatLocalImageForward$1;
import msd.p;
import kotlin.jvm.internal.FunctionReferenceImpl;
import mhc.u1;
import java.lang.Class;
import java.lang.String;
import com.yxcorp.gifshow.share.KwaiOperator;
import mhc.x;
import brd.x;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class WechatLocalImageForward$1 extends FunctionReferenceImpl implements p	// class@001c9c
{
    public static final WechatLocalImageForward$1 INSTANCE;

    static {
       WechatLocalImageForward$1.INSTANCE = new WechatLocalImageForward$1();
    }
    public void WechatLocalImageForward$1(){
       super(2, u1.class, "createForwardTransformer", "createForwardTransformer\(Lcom/yxcorp/gifshow/share/KwaiOperator;Lcom/yxcorp/gifshow/share/ForwardPlatform;\)Lio/reactivex/ObservableTransformer;", 1);
    }
    public final x invoke(KwaiOperator p0,x p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, WechatLocalImageForward$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "p1");
       a.p(p1, "p2");
       return u1.a(p0, p1);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}
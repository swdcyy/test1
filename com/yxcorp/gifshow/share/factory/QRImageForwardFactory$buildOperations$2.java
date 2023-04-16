package com.yxcorp.gifshow.share.factory.QRImageForwardFactory$buildOperations$2;
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

public final class QRImageForwardFactory$buildOperations$2 extends FunctionReferenceImpl implements p	// class@001b84
{
    public static final QRImageForwardFactory$buildOperations$2 INSTANCE;

    static {
       QRImageForwardFactory$buildOperations$2.INSTANCE = new QRImageForwardFactory$buildOperations$2();
    }
    public void QRImageForwardFactory$buildOperations$2(){
       super(2, u1.class, "createForwardTransformer", "createForwardTransformer\(Lcom/yxcorp/gifshow/share/KwaiOperator;Lcom/yxcorp/gifshow/share/ForwardPlatform;\)Lio/reactivex/ObservableTransformer;", 1);
    }
    public final x invoke(KwaiOperator p0,x p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, QRImageForwardFactory$buildOperations$2.class, "1");
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

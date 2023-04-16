package com.yxcorp.gifshow.share.wechat.WXMiniLivePushForward$execute$1;
import msd.p;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.share.wechat.WXMiniLivePushForward;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.yxcorp.gifshow.share.OperationModel;
import android.graphics.Bitmap;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;

public final class WXMiniLivePushForward$execute$1 extends FunctionReferenceImpl implements p	// class@001c9a
{

    public void WXMiniLivePushForward$execute$1(WXMiniLivePushForward p0){
       super(2, p0, WXMiniLivePushForward.class, "photoBitmapHandler", "photoBitmapHandler\(Lcom/yxcorp/gifshow/share/OperationModel;Landroid/graphics/Bitmap;\)Landroid/graphics/Bitmap;", 0);
    }
    public final Bitmap invoke(OperationModel p0,Bitmap p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, WXMiniLivePushForward$execute$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "p1");
       a.p(p1, "p2");
       return this.receiver.T0(p0, p1);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}

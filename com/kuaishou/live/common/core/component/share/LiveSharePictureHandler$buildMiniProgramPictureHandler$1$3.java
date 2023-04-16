package com.kuaishou.live.common.core.component.share.LiveSharePictureHandler$buildMiniProgramPictureHandler$1$3;
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

public final class LiveSharePictureHandler$buildMiniProgramPictureHandler$1$3 extends FunctionReferenceImpl implements p	// class@001771
{

    public void LiveSharePictureHandler$buildMiniProgramPictureHandler$1$3(WXMiniLivePushForward p0){
       super(2, p0, WXMiniLivePushForward.class, "photoBitmapHandler", "photoBitmapHandler\(Lcom/yxcorp/gifshow/share/OperationModel;Landroid/graphics/Bitmap;\)Landroid/graphics/Bitmap;", 0);
    }
    public final Bitmap invoke(OperationModel p0,Bitmap p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveSharePictureHandler$buildMiniProgramPictureHandler$1$3.class, "1");
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

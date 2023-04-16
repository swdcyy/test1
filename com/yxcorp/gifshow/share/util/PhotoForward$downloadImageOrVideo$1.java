package com.yxcorp.gifshow.share.util.PhotoForward$downloadImageOrVideo$1;
import msd.p;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.share.util.PhotoForward;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.yxcorp.gifshow.share.OperationModel;
import android.graphics.Bitmap;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;

public final class PhotoForward$downloadImageOrVideo$1 extends FunctionReferenceImpl implements p	// class@001c8e
{

    public void PhotoForward$downloadImageOrVideo$1(PhotoForward p0){
       super(2, p0, PhotoForward.class, "defaultHandler", "defaultHandler\(Lcom/yxcorp/gifshow/share/OperationModel;Landroid/graphics/Bitmap;\)Landroid/graphics/Bitmap;", 0);
    }
    public final Bitmap invoke(OperationModel p0,Bitmap p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PhotoForward$downloadImageOrVideo$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "p1");
       a.p(p1, "p2");
       return this.receiver.S(p0, p1);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}

package com.yxcorp.gifshow.share.wechat.WechatLocalPhotoForward$execute$1;
import msd.p;
import kotlin.jvm.internal.FunctionReferenceImpl;
import yic.o;
import java.lang.Class;
import java.lang.String;
import com.yxcorp.gifshow.share.OperationModel;
import android.graphics.Bitmap;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class WechatLocalPhotoForward$execute$1 extends FunctionReferenceImpl implements p	// class@001c9e
{
    public static final WechatLocalPhotoForward$execute$1 INSTANCE;

    static {
       WechatLocalPhotoForward$execute$1.INSTANCE = new WechatLocalPhotoForward$execute$1();
    }
    public void WechatLocalPhotoForward$execute$1(){
       super(2, o.class, "addIconBitmapHandler", "addIconBitmapHandler\(Lcom/yxcorp/gifshow/share/OperationModel;Landroid/graphics/Bitmap;\)Landroid/graphics/Bitmap;", 1);
    }
    public final Bitmap invoke(OperationModel p0,Bitmap p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, WechatLocalPhotoForward$execute$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "p1");
       a.p(p1, "p2");
       return o.a(p0, p1);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}

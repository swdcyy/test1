package com.yxcorp.gifshow.share.util.PhotoForward$DefaultImpls$d;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.share.util.PhotoForward;
import com.yxcorp.gifshow.share.OperationModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Bitmap;
import com.kwai.framework.model.feed.BaseFeed;
import jp.a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.util.PhotoForward$DefaultImpls;
import java.lang.IllegalArgumentException;

public final class PhotoForward$DefaultImpls$d implements Callable	// class@001c86
{
    public final PhotoForward b;
    public final OperationModel c;

    public void PhotoForward$DefaultImpls$d(PhotoForward p0,OperationModel p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object call(){
       Bitmap uBitmap = PatchProxy.apply(null, this, PhotoForward$DefaultImpls$d.class, "1");
       if (uBitmap != PatchProxyResult.class) {
       }else {
          BaseFeed uBaseFeed = this.c.i();
          if (uBaseFeed != null) {
             a c = a.c;
             a.o(c, "PhotoImageSize.MIDDLE");
             uBitmap = PhotoForward$DefaultImpls.h(this.b, uBaseFeed, c, 0);
          }else {
             throw new IllegalArgumentException("photo is null");
          }
       }
       return uBitmap;
    }
}

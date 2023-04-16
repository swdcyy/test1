package com.yxcorp.gifshow.share.util.PhotoForward$DefaultImpls$h;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.share.util.PhotoForward;
import com.yxcorp.gifshow.share.OperationModel;
import msd.p;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.Pair;
import com.kwai.framework.model.feed.BaseFeed;
import java.io.File;
import wkd.b;
import j80.c;
import java.lang.StringBuilder;
import jp.a;
import kotlin.jvm.internal.a;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.share.util.PhotoForward$DefaultImpls;
import android.graphics.drawable.Drawable;
import lnc.a1;
import java.util.Objects;
import android.graphics.drawable.BitmapDrawable;
import com.yxcorp.gifshow.util.BitmapUtil;
import qrd.r0;
import java.lang.IllegalArgumentException;

public final class PhotoForward$DefaultImpls$h implements Callable	// class@001c8a
{
    public final PhotoForward b;
    public final OperationModel c;
    public final p d;

    public void PhotoForward$DefaultImpls$h(PhotoForward p0,OperationModel p1,p p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object call(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "1";
       Pair pair = PatchProxy.apply(objArray, this, PhotoForward$DefaultImpls$h.class, str);
       if (pair != patchProxyRe) {
       }else {
          BaseFeed uBaseFeed = this.c.i();
          if (uBaseFeed != null) {
             File uFile = new File(b.a(-1504323719).o(), uBaseFeed.getId()+"share.jpg");
             a c = a.c;
             a.o(c, "PhotoImageSize.MIDDLE");
             Bitmap uBitmap = PhotoForward$DefaultImpls.h(this.b, uBaseFeed, c, 0);
             if (uBitmap == null) {
                Object obj = PatchProxy.applyOneRefs(this.b, objArray, PhotoForward$DefaultImpls.class, str);
                if (obj != patchProxyRe) {
                   uBitmap = obj;
                }else {
                   Drawable uDrawable = a1.f(R.drawable.arg_RES_7f08105b);
                   Objects.requireNonNull(uDrawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                   uBitmap = uDrawable.getBitmap();
                   a.o(uBitmap, "\(CommonUtil.drawable\(R.d¡­as BitmapDrawable\).bitmap");
                }
             }
             BitmapUtil.Q(this.d.invoke(this.c, uBitmap), uFile.getAbsolutePath(), 100);
             this.c.y(uFile);
             pair = r0.a(uBaseFeed, uFile);
          }else {
             throw new IllegalArgumentException("photo is null");
          }
       }
       return pair;
    }
}

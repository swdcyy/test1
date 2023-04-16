package com.yxcorp.gifshow.share.util.PhotoForward$DefaultImpls$f;
import erd.o;
import msd.p;
import com.yxcorp.gifshow.share.OperationModel;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import kotlin.jvm.internal.a;
import wkd.b;
import j80.c;
import java.lang.StringBuilder;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.util.BitmapUtil;

public final class PhotoForward$DefaultImpls$f implements o	// class@001c88
{
    public final p b;
    public final OperationModel c;

    public void PhotoForward$DefaultImpls$f(p p0,OperationModel p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       File uFile = PatchProxy.applyOneRefs(p0, this, PhotoForward$DefaultImpls$f.class, "1");
       if (uFile != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          Bitmap uBitmap = this.b.invoke(this.c, p0);
          File uFile1 = b.a(-1504323719).o();
          StringBuilder str = "";
          BaseFeed uBaseFeed = this.c.i();
          String id = (uBaseFeed != null)? uBaseFeed.getId(): null;
          File uFile2 = new File(uFile1, str+id+"share.jpg");
          BitmapUtil.Q(uBitmap, uFile2.getAbsolutePath(), 100);
          p0.recycle();
          uBitmap.recycle();
          uFile = uFile2;
       }
       return uFile;
    }
}

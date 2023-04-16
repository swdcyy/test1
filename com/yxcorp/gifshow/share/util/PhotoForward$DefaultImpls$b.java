package com.yxcorp.gifshow.share.util.PhotoForward$DefaultImpls$b;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import msd.p;
import com.yxcorp.gifshow.share.OperationModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.Pair;
import android.graphics.Bitmap;
import yic.n0;
import java.lang.Boolean;
import qrd.r0;

public final class PhotoForward$DefaultImpls$b implements Callable	// class@001c84
{
    public final SharePlatformData$ShareConfig b;
    public final p c;
    public final OperationModel d;

    public void PhotoForward$DefaultImpls$b(SharePlatformData$ShareConfig p0,p p1,OperationModel p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object call(){
       Pair pair = PatchProxy.apply(null, this, PhotoForward$DefaultImpls$b.class, "1");
       if (pair != PatchProxyResult.class) {
       }else {
          Bitmap uBitmap = n0.d(this.b);
          if (uBitmap == null) {
             uBitmap = n0.a(this.b);
             if (uBitmap != null) {
                uBitmap = this.c.invoke(this.d, uBitmap);
             }
          }
          boolean b = (uBitmap != null)? true: false;
          pair = r0.a(Boolean.valueOf(b), uBitmap);
       }
       return pair;
    }
}

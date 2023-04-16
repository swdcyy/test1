package com.kuaishou.merchant.basic.util.k;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import brd.v;
import android.widget.RatingBar;
import java.util.Map$Entry;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import m0d.l;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.basic.util.MerchantRatingHelper$MerchantRatingInternalException;
import java.lang.Throwable;
import brd.g;
import android.graphics.Bitmap$Config;
import com.kuaishou.merchant.basic.util.MerchantRatingHelper;
import android.util.Pair;
import java.lang.Integer;
import android.content.res.Resources;
import com.yxcorp.gifshow.util.BitmapUtil;

public class k implements ImageCallback	// class@0015e0
{
    public final v b;
    public final RatingBar c;
    public final int d;
    public final Map$Entry e;

    public void k(v p0,RatingBar p1,int p2,Map$Entry p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void onCompleted(Drawable p0){
       l.a(this, p0);
    }
    public void onCompletedBitmap(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       if (this.b.isDisposed()) {
          return;
       }
       if (p0 == null) {
          this.b.onError(new MerchantRatingHelper$MerchantRatingInternalException("createDrawableObservables, bitmap is null"));
       }else if(p0.isRecycled()){
          this.b.onError(new MerchantRatingHelper$MerchantRatingInternalException("createDrawableObservables, bitmap is recycled"));
       }else {
          boolean b = false;
          p0 = p0.copy(Bitmap$Config.ARGB_8888, b);
          k td = (MerchantRatingHelper.c(this.c) <= 0)? this.d: MerchantRatingHelper.c(this.c);
          Integer key = this.e.getKey();
          Resources resources = this.c.getResources();
          p0 = BitmapUtil.U(p0, td, ((p0.getHeight() * td) / p0.getWidth()), p0.getConfig(), b);
          if (this.e.getKey().intValue() == 3) {
             b = true;
          }
          this.b.onNext(new Pair(key, MerchantRatingHelper.a(resources, p0, b)));
       }
       this.b.onComplete();
       return;
    }
    public void onProgress(float p0){
       l.c(this, p0);
    }
}

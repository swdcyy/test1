package com.kuaishou.live.basic.widget.GreyscaleImageView$a;
import jd.a;
import java.lang.String;
import com.facebook.cache.common.CacheKey;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ta.d;
import java.lang.StringBuilder;
import android.graphics.Bitmap;
import sc.d;
import com.facebook.common.references.a;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.ColorFilter;

public class GreyscaleImageView$a extends a	// class@000d2c
{
    public String c;

    public void GreyscaleImageView$a(String p0){
       super();
       this.c = p0;
    }
    public CacheKey a(){
       Object obj = PatchProxy.apply(null, this, GreyscaleImageView$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d("gray_"+this.c);
    }
    public a b(Bitmap p0,d p1){
       Paint obj = PatchProxy.applyTwoRefs(p0, p1, this, GreyscaleImageView$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a uoa = p1.b(p0.getWidth(), p0.getHeight());
       obj = new Paint();
       ColorMatrix uColorMatrix = new ColorMatrix();
       uColorMatrix.setSaturation(0);
       obj.setColorFilter(new ColorMatrixColorFilter(uColorMatrix));
       new Canvas(uoa.j()).drawBitmap(p0, 0, 0, obj);
       a.f(uoa);
       return a.d(uoa);
    }
}

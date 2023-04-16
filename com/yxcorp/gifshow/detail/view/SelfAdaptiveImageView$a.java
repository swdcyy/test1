package com.yxcorp.gifshow.detail.view.SelfAdaptiveImageView$a;
import jd.a;
import com.facebook.cache.common.CacheKey;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ta.d;
import java.lang.StringBuilder;
import android.graphics.Bitmap;
import sc.d;
import com.facebook.common.references.a;
import kotlin.jvm.internal.a;

public final class SelfAdaptiveImageView$a extends a	// class@001a5a
{
    public final float c;

    public void SelfAdaptiveImageView$a(float p0){
       super();
       this.c = p0;
    }
    public CacheKey a(){
       Object obj = PatchProxy.apply(null, this, SelfAdaptiveImageView$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d("Adaptation_"+this.c);
    }
    public a b(Bitmap p0,d p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, SelfAdaptiveImageView$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "sourceBitmap");
       a.p(p1, "bitmapFactory");
       float f = this.c / (float)3;
       a uoa = p1.j(p0, (int)((float)p0.getWidth() * f), (int)((float)p0.getHeight() * f), true);
       a.o(uoa, "bitmapFactory.createScal¡­map, width, height, true\)");
       a uoa1 = a.d(uoa);
       a.m(uoa1);
       a.o(uoa1, "CloseableReference.cloneOrNull\(destBitmapRef\)!!");
       a.f(uoa);
       return uoa1;
    }
    public String getName(){
       return "AdaptationImage";
    }
}

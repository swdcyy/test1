package com.facebook.fresco.animation.bitmap.wrapper.AnimatedDrawableBackendFrameRenderer$a;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$b;
import com.facebook.fresco.animation.bitmap.wrapper.AnimatedDrawableBackendFrameRenderer;
import java.lang.Object;
import android.graphics.Bitmap;
import com.facebook.common.references.a;
import ec.a;

public class AnimatedDrawableBackendFrameRenderer$a implements AnimatedImageCompositor$b	// class@0010d9
{
    public final AnimatedDrawableBackendFrameRenderer a;

    public void AnimatedDrawableBackendFrameRenderer$a(AnimatedDrawableBackendFrameRenderer p0){
       this.a = p0;
       super();
    }
    public void a(int p0,Bitmap p1){
    }
    public a b(int p0){
       return this.a.mBitmapFrameCache.f(p0);
    }
}

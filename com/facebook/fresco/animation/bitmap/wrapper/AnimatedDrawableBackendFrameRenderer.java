package com.facebook.fresco.animation.bitmap.wrapper.AnimatedDrawableBackendFrameRenderer;
import ec.b;
import ec.a;
import oc.a;
import java.lang.Object;
import com.facebook.fresco.animation.bitmap.wrapper.AnimatedDrawableBackendFrameRenderer$a;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$b;
import android.graphics.Bitmap;
import java.lang.Integer;
import java.lang.Class;
import java.lang.Throwable;
import java.lang.String;
import cb.a;
import android.graphics.Rect;

public class AnimatedDrawableBackendFrameRenderer implements b	// class@0010da
{
    public a mAnimatedDrawableBackend;
    public AnimatedImageCompositor mAnimatedImageCompositor;
    public final a mBitmapFrameCache;
    public final AnimatedImageCompositor$b mCallback;
    public static final Class TAG;

    static {
       AnimatedDrawableBackendFrameRenderer.TAG = AnimatedDrawableBackendFrameRenderer.class;
    }
    public void AnimatedDrawableBackendFrameRenderer(a p0,a p1){
       super();
       AnimatedDrawableBackendFrameRenderer$a uoa = new AnimatedDrawableBackendFrameRenderer$a(this);
       this.mCallback = uoa;
       this.mBitmapFrameCache = p0;
       this.mAnimatedDrawableBackend = p1;
       this.mAnimatedImageCompositor = new AnimatedImageCompositor(p1, uoa);
    }
    public int getIntrinsicHeight(){
       return this.mAnimatedDrawableBackend.getHeight();
    }
    public int getIntrinsicWidth(){
       return this.mAnimatedDrawableBackend.getWidth();
    }
    public boolean renderFrame(int p0,Bitmap p1){
       boolean b = true;
       try{
          this.mAnimatedImageCompositor.d(p0, p1);
          return b;
       }catch(java.lang.IllegalStateException e5){
          Object[] objArray = new Object[b];
          objArray[0] = Integer.valueOf(p0);
          a.f(AnimatedDrawableBackendFrameRenderer.TAG, e5, "Rendering of frame unsuccessful. Frame number: %d", objArray);
          return 0;
       }
    }
    public void setBounds(Rect p0){
       a uoa = this.mAnimatedDrawableBackend.k(p0);
       if (uoa != this.mAnimatedDrawableBackend) {
          this.mAnimatedDrawableBackend = uoa;
          this.mAnimatedImageCompositor = new AnimatedImageCompositor(uoa, this.mCallback);
       }
       return;
    }
}

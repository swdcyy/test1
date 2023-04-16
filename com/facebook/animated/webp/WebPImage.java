package com.facebook.animated.webp.WebPImage;
import oc.b;
import pc.c;
import java.lang.Object;
import fd.d;
import java.lang.Boolean;
import ab.e;
import java.nio.ByteBuffer;
import com.facebook.animated.webp.WebPFrame;
import uc.b;
import java.nio.Buffer;
import oc.c;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo$BlendOperation;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo$DisposalMethod;

public class WebPImage implements b, c	// class@001035
{
    public long mNativeContext;

    public void WebPImage(){
       super();
    }
    public void WebPImage(long p0){
       super();
       this.mNativeContext = p0;
    }
    public static WebPImage a(long p0,int p1){
       d.a();
       boolean b = (p0)? true: false;
       e.a(Boolean.valueOf(b));
       return WebPImage.nativeCreateFromNativeMemory(p0, p1);
    }
    public static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer p0);
    public static native WebPImage nativeCreateFromNativeMemory(long p0,int p1);
    public WebPFrame b(int p0){
       return this.nativeGetFrame(p0);
    }
    public b decodeFromByteBuffer(ByteBuffer p0,b p1){
       d.a();
       p0.rewind();
       return WebPImage.nativeCreateFromDirectByteBuffer(p0);
    }
    public b decodeFromNativeMemory(long p0,int p1,b p2){
       return WebPImage.a(p0, p1);
    }
    public void dispose(){
       this.nativeDispose();
    }
    public boolean doesRenderSupportScaling(){
       return true;
    }
    public void finalize(){
       this.nativeFinalize();
    }
    public int getDuration(){
       return this.nativeGetDuration();
    }
    public c getFrame(int p0){
       return this.b(p0);
    }
    public int getFrameCount(){
       return this.nativeGetFrameCount();
    }
    public int[] getFrameDurations(){
       return this.nativeGetFrameDurations();
    }
    public AnimatedDrawableFrameInfo getFrameInfo(int p0){
       WebPFrame webPFrame = this.b(p0);
       int xOffset = webPFrame.getXOffset();
       int yOffset = webPFrame.getYOffset();
       int width = webPFrame.getWidth();
       int height = webPFrame.getHeight();
       AnimatedDrawableFrameInfo$BlendOperation bLEND_WITH_P = (webPFrame.nativeIsBlendWithPreviousFrame())? AnimatedDrawableFrameInfo$BlendOperation.BLEND_WITH_PREVIOUS: AnimatedDrawableFrameInfo$BlendOperation.NO_BLEND;
       AnimatedDrawableFrameInfo$BlendOperation uBlendOperat = bLEND_WITH_P;
       AnimatedDrawableFrameInfo$DisposalMethod dISPOSE_TO_B = (webPFrame.nativeShouldDisposeToBackgroundColor())? AnimatedDrawableFrameInfo$DisposalMethod.DISPOSE_TO_BACKGROUND: AnimatedDrawableFrameInfo$DisposalMethod.DISPOSE_DO_NOT;
       AnimatedDrawableFrameInfo uAnimatedDra = new AnimatedDrawableFrameInfo(p0, xOffset, yOffset, width, height, uBlendOperat, dISPOSE_TO_B);
       webPFrame.dispose();
       return v9;
    }
    public int getHeight(){
       return this.nativeGetHeight();
    }
    public int getLoopCount(){
       return this.nativeGetLoopCount();
    }
    public int getSizeInBytes(){
       return this.nativeGetSizeInBytes();
    }
    public int getWidth(){
       return this.nativeGetWidth();
    }
    public native final void nativeDispose();
    public native final void nativeFinalize();
    public native final int nativeGetDuration();
    public native final WebPFrame nativeGetFrame(int p0);
    public native final int nativeGetFrameCount();
    public native final int[] nativeGetFrameDurations();
    public native final int nativeGetHeight();
    public native final int nativeGetLoopCount();
    public native final int nativeGetSizeInBytes();
    public native final int nativeGetWidth();
}

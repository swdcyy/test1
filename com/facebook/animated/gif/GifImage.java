package com.facebook.animated.gif.GifImage;
import oc.b;
import pc.c;
import java.lang.Object;
import ab.e;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import uc.b;
import java.lang.Boolean;
import java.lang.String;
import gg.a;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo$DisposalMethod;
import com.facebook.animated.gif.GifFrame;
import oc.c;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo$BlendOperation;

public class GifImage implements b, c	// class@001033
{
    public long mNativeContext;
    public static boolean sInitialized;

    public void GifImage(){
       super();
    }
    public void GifImage(long p0){
       super();
       this.mNativeContext = p0;
    }
    public static GifImage createFromByteArray(byte[] p0){
       e.d(p0);
       ByteBuffer uByteBuffer = ByteBuffer.allocateDirect(p0.length);
       uByteBuffer.put(p0);
       uByteBuffer.rewind();
       return GifImage.createFromByteBuffer(uByteBuffer, b.a());
    }
    public static GifImage createFromByteBuffer(ByteBuffer p0){
       return GifImage.createFromByteBuffer(p0, b.a());
    }
    public static GifImage createFromByteBuffer(ByteBuffer p0,b p1){
       GifImage.ensure();
       p0.rewind();
       return GifImage.nativeCreateFromDirectByteBuffer(p0, p1.b, p1.f);
    }
    public static GifImage createFromFileDescriptor(int p0,b p1){
       GifImage.ensure();
       return GifImage.nativeCreateFromFileDescriptor(p0, p1.b, p1.f);
    }
    public static GifImage createFromNativeMemory(long p0,int p1,b p2){
       GifImage.ensure();
       boolean b = (p0)? true: false;
       e.a(Boolean.valueOf(b));
       return GifImage.nativeCreateFromNativeMemory(p0, p1, p2.b, p2.f);
    }
    public static synchronized void ensure(){
       _monitor_enter(GifImage.class);
       if (!GifImage.sInitialized) {
          GifImage.sInitialized = true;
          a.c("gifimage");
       }
       _monitor_exit(GifImage.class);
       return;
    }
    public static AnimatedDrawableFrameInfo$DisposalMethod fromGifDisposalMethod(int p0){
       if (!p0) {
          return AnimatedDrawableFrameInfo$DisposalMethod.DISPOSE_DO_NOT;
       }
       if (p0 == 1) {
          return AnimatedDrawableFrameInfo$DisposalMethod.DISPOSE_DO_NOT;
       }
       if (p0 == 2) {
          return AnimatedDrawableFrameInfo$DisposalMethod.DISPOSE_TO_BACKGROUND;
       }
       if (p0 == 3) {
          return AnimatedDrawableFrameInfo$DisposalMethod.DISPOSE_TO_PREVIOUS;
       }
       return AnimatedDrawableFrameInfo$DisposalMethod.DISPOSE_DO_NOT;
    }
    public static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer p0,int p1,boolean p2);
    public static native GifImage nativeCreateFromFileDescriptor(int p0,int p1,boolean p2);
    public static native GifImage nativeCreateFromNativeMemory(long p0,int p1,int p2,boolean p3);
    public b decodeFromByteBuffer(ByteBuffer p0,b p1){
       return GifImage.createFromByteBuffer(p0, p1);
    }
    public b decodeFromNativeMemory(long p0,int p1,b p2){
       return GifImage.createFromNativeMemory(p0, p1, p2);
    }
    public void dispose(){
       this.nativeDispose();
    }
    public boolean doesRenderSupportScaling(){
       return false;
    }
    public void finalize(){
       this.nativeFinalize();
    }
    public int getDuration(){
       return this.nativeGetDuration();
    }
    public GifFrame getFrame(int p0){
       return this.nativeGetFrame(p0);
    }
    public c getFrame(int p0){
       return this.getFrame(p0);
    }
    public int getFrameCount(){
       return this.nativeGetFrameCount();
    }
    public int[] getFrameDurations(){
       return this.nativeGetFrameDurations();
    }
    public AnimatedDrawableFrameInfo getFrameInfo(int p0){
       GifFrame frame = this.getFrame(p0);
       AnimatedDrawableFrameInfo uAnimatedDra = new AnimatedDrawableFrameInfo(p0, frame.getXOffset(), frame.getYOffset(), frame.getWidth(), frame.getHeight(), AnimatedDrawableFrameInfo$BlendOperation.BLEND_WITH_PREVIOUS, GifImage.fromGifDisposalMethod(frame.getDisposalMode()));
       frame.dispose();
       return v9;
    }
    public int getHeight(){
       return this.nativeGetHeight();
    }
    public int getLoopCount(){
       int i = this.nativeGetLoopCount();
       if (i == -1) {
          return 1;
       }
       if (i) {
          return (i + 1);
       }
       return 0;
    }
    public int getSizeInBytes(){
       return this.nativeGetSizeInBytes();
    }
    public int getWidth(){
       return this.nativeGetWidth();
    }
    public boolean isAnimated(){
       return this.nativeIsAnimated();
    }
    public native final void nativeDispose();
    public native final void nativeFinalize();
    public native final int nativeGetDuration();
    public native final GifFrame nativeGetFrame(int p0);
    public native final int nativeGetFrameCount();
    public native final int[] nativeGetFrameDurations();
    public native final int nativeGetHeight();
    public native final int nativeGetLoopCount();
    public native final int nativeGetSizeInBytes();
    public native final int nativeGetWidth();
    public native final boolean nativeIsAnimated();
}

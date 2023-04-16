package com.facebook.animated.webp.WebPFrame;
import oc.c;
import java.lang.Object;
import android.graphics.Bitmap;

public class WebPFrame implements c	// class@001034
{
    public long mNativeContext;

    public void WebPFrame(long p0){
       super();
       this.mNativeContext = p0;
    }
    public void dispose(){
       this.nativeDispose();
    }
    public void finalize(){
       this.nativeFinalize();
    }
    public int getDurationMs(){
       return this.nativeGetDurationMs();
    }
    public int getHeight(){
       return this.nativeGetHeight();
    }
    public int getWidth(){
       return this.nativeGetWidth();
    }
    public int getXOffset(){
       return this.nativeGetXOffset();
    }
    public int getYOffset(){
       return this.nativeGetYOffset();
    }
    public native final void nativeDispose();
    public native final void nativeFinalize();
    public native final int nativeGetDurationMs();
    public native final int nativeGetHeight();
    public native final int nativeGetWidth();
    public native final int nativeGetXOffset();
    public native final int nativeGetYOffset();
    public native final boolean nativeIsBlendWithPreviousFrame();
    public native final void nativeRenderFrame(int p0,int p1,Bitmap p2);
    public native final boolean nativeShouldDisposeToBackgroundColor();
    public void renderFrame(int p0,int p1,Bitmap p2){
       this.nativeRenderFrame(p0, p1, p2);
    }
}

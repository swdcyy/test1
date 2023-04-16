package com.facebook.animated.gif.GifFrame;
import oc.c;
import java.lang.Object;
import android.graphics.Bitmap;

public class GifFrame implements c	// class@001032
{
    public long mNativeContext;

    public void GifFrame(long p0){
       super();
       this.mNativeContext = p0;
    }
    public void dispose(){
       this.nativeDispose();
    }
    public void finalize(){
       this.nativeFinalize();
    }
    public int getDisposalMode(){
       return this.nativeGetDisposalMode();
    }
    public int getDurationMs(){
       return this.nativeGetDurationMs();
    }
    public int getHeight(){
       return this.nativeGetHeight();
    }
    public int getTransparentPixelColor(){
       return this.nativeGetTransparentPixelColor();
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
    public boolean hasTransparency(){
       return this.nativeHasTransparency();
    }
    public native final void nativeDispose();
    public native final void nativeFinalize();
    public native final int nativeGetDisposalMode();
    public native final int nativeGetDurationMs();
    public native final int nativeGetHeight();
    public native final int nativeGetTransparentPixelColor();
    public native final int nativeGetWidth();
    public native final int nativeGetXOffset();
    public native final int nativeGetYOffset();
    public native final boolean nativeHasTransparency();
    public native final void nativeRenderFrame(int p0,int p1,Bitmap p2);
    public void renderFrame(int p0,int p1,Bitmap p2){
       this.nativeRenderFrame(p0, p1, p2);
    }
}

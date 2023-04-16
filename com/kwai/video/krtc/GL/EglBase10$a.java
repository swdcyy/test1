package com.kwai.video.krtc.GL.EglBase10$a;
import android.view.SurfaceHolder;
import com.kwai.video.krtc.GL.EglBase10;
import android.view.Surface;
import java.lang.Object;
import android.view.SurfaceHolder$Callback;
import android.graphics.Rect;
import android.graphics.Canvas;

public class EglBase10$a implements SurfaceHolder	// class@000742
{
    public final EglBase10 a;
    public final Surface b;

    public void EglBase10$a(EglBase10 p0,Surface p1){
       this.a = p0;
       super();
       this.b = p1;
    }
    public void addCallback(SurfaceHolder$Callback p0){
    }
    public Surface getSurface(){
       return this.b;
    }
    public Rect getSurfaceFrame(){
       return null;
    }
    public boolean isCreating(){
       return false;
    }
    public Canvas lockCanvas(){
       return null;
    }
    public Canvas lockCanvas(Rect p0){
       return null;
    }
    public void removeCallback(SurfaceHolder$Callback p0){
    }
    public void setFixedSize(int p0,int p1){
    }
    public void setFormat(int p0){
    }
    public void setKeepScreenOn(boolean p0){
    }
    public void setSizeFromLayout(){
    }
    public void setType(int p0){
    }
    public void unlockCanvasAndPost(Canvas p0){
    }
}

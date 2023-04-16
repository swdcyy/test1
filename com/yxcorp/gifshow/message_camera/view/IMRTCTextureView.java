package com.yxcorp.gifshow.message_camera.view.IMRTCTextureView;
import mw5.d;
import com.kwai.camerasdk.render.VideoTextureView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m65.b;
import m65.g;
import mw5.c;
import com.kwai.camerasdk.video.VideoFrame;
import com.kwai.camerasdk.videoCapture.FrameBuffer;
import java.nio.ByteBuffer;

public class IMRTCTextureView extends VideoTextureView implements d	// class@001dd6
{

    public void IMRTCTextureView(Context p0){
       super(p0);
       this.h();
    }
    public void IMRTCTextureView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.h();
    }
    public void IMRTCTextureView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.h();
    }
    private void h(){
       if (PatchProxy.applyVoid(null, this, IMRTCTextureView.class, "1")) {
          return;
       }
       this.setRenderThread(new b());
       return;
    }
    public void f(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMRTCTextureView.class, "2")) {
          return;
       }
       VideoFrame videoFrame = (p0.c())? VideoFrame.fromTexture(p0.getTextureId(), p0.b(), p0.getWidth(), p0.getHeight(), p0.getTimestamp()): VideoFrame.fromCpuFrame(new FrameBuffer(p0.n()), p0.getWidth(), p0.getHeight(), p0.a(), p0.getTimestamp());
       this.c(videoFrame);
       return;
    }
    public d getVideoView(){
       return this;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, IMRTCTextureView.class, "3")) {
          return;
       }
       super.release();
       return;
    }
}

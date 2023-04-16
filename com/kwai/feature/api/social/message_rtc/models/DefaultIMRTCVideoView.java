package com.kwai.feature.api.social.message_rtc.models.DefaultIMRTCVideoView;
import mw5.d;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import mw5.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dc5.c;
import android.graphics.Bitmap;
import com.kwai.robust.PatchProxyResult;

public class DefaultIMRTCVideoView extends View implements d	// class@00117a
{
    public final String b;

    public void DefaultIMRTCVideoView(Context p0){
       super(p0);
       this.b = "DefaultIMRTCVideoView";
    }
    public void DefaultIMRTCVideoView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = "DefaultIMRTCVideoView";
    }
    public void DefaultIMRTCVideoView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = "DefaultIMRTCVideoView";
    }
    public void f(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultIMRTCVideoView.class, "5")) {
          return;
       }
       c.c("DefaultIMRTCVideoView", "render");
       return;
    }
    public Bitmap getBitmap(){
       Object obj = PatchProxy.apply(null, this, DefaultIMRTCVideoView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c.c("DefaultIMRTCVideoView", "getBitmap");
       return null;
    }
    public d getVideoView(){
       Object obj = PatchProxy.apply(null, this, DefaultIMRTCVideoView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c.c("DefaultIMRTCVideoView", "getVideoView");
       return this;
    }
    public void pause(){
       if (PatchProxy.applyVoid(null, this, DefaultIMRTCVideoView.class, "4")) {
          return;
       }
       c.c("DefaultIMRTCVideoView", "pause");
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, DefaultIMRTCVideoView.class, "6")) {
          return;
       }
       c.c("DefaultIMRTCVideoView", "release");
       return;
    }
    public void resume(){
       if (PatchProxy.applyVoid(null, this, DefaultIMRTCVideoView.class, "3")) {
          return;
       }
       c.c("DefaultIMRTCVideoView", "resume");
       return;
    }
}

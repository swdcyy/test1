package com.kwai.video.krtc.rtcengine.camera.KVideoCanvas;
import android.view.View;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class KVideoCanvas	// class@00084e
{
    public String channelId;
    public View remoteRenderView;
    public int renderMode;
    public int sourceType;
    public String userId;

    public void KVideoCanvas(View p0,int p1,String p2,int p3){
       super();
       this.renderMode = 0;
       this.sourceType = 0;
       this.remoteRenderView = p0;
       this.renderMode = p1;
       this.userId = p2;
       this.sourceType = p3;
    }
    public void KVideoCanvas(View p0,int p1,String p2,String p3,int p4){
       super();
       this.renderMode = 0;
       this.sourceType = 0;
       this.remoteRenderView = p0;
       this.renderMode = p1;
       this.userId = p2;
       this.channelId = p3;
       this.sourceType = p4;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KVideoCanvas.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       return this.remoteRenderView.equals(p0.remoteRenderView);
    }
}

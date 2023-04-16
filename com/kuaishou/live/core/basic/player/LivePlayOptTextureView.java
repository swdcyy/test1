package com.kuaishou.live.core.basic.player.LivePlayOptTextureView;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.SurfaceTexture;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.core.basic.player.LivePlayOptTextureView$a;

public class LivePlayOptTextureView extends LivePlayTextureView	// class@0008c1
{
    public LivePlayOptTextureView$a g;

    public void LivePlayOptTextureView(Context p0){
       super(p0);
       this.g = null;
    }
    public void LivePlayOptTextureView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.g = null;
    }
    public void LivePlayOptTextureView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.g = null;
    }
    public void onSurfaceTextureAvailable(SurfaceTexture p0,int p1,int p2){
       if (PatchProxy.isSupport(LivePlayOptTextureView.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LivePlayOptTextureView.class, "1")) {
          return;
       }
       super.onSurfaceTextureAvailable(p0, p1, p2);
       LivePlayOptTextureView tg = this.g;
       if (tg != null) {
          tg.a();
       }
       return;
    }
    public void setTextureAvailableListener(LivePlayOptTextureView$a p0){
       this.g = p0;
    }
}

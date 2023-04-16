package com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$SurfaceViewShowListener;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView$c;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer;
import java.lang.Object;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class WayneLivePlayer$SurfaceViewShowListener implements LivePlayTextureView$c	// class@000e4d
{
    public final WayneLivePlayer this$0;

    public void WayneLivePlayer$SurfaceViewShowListener(WayneLivePlayer p0){
       this.this$0 = p0;
       super();
    }
    public void WayneLivePlayer$SurfaceViewShowListener(WayneLivePlayer p0,WayneLivePlayer$1 p1){
       super(p0);
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, WayneLivePlayer$SurfaceViewShowListener.class, "1")) {
          return;
       }
       WayneLivePlayer$SurfaceViewShowListener tthis$0 = this.this$0;
       tthis$0.mIsSurfaceViewShow = true;
       tthis$0.tryCallOnLivePlayViewShow();
       return;
    }
}

package com.kuaishou.live.core.show.highlight.audience.preview.widget.LiveAudienceHighlightPlayTextureView;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import android.widget.FrameLayout;
import vy1.a;
import lnc.a1;
import android.view.ViewOutlineProvider;

public class LiveAudienceHighlightPlayTextureView extends LivePlayTextureView	// class@000be7
{
    public int g;

    public void LiveAudienceHighlightPlayTextureView(Context p0){
       super(p0, null);
    }
    public void LiveAudienceHighlightPlayTextureView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveAudienceHighlightPlayTextureView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveAudienceHighlightPlayTextureView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveAudienceHighlightPlayTextureView.class, "2")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.setTextureViewRoundCorner(this.g);
       return;
    }
    public void setRoundCorner(int p0){
       if (PatchProxy.isSupport(LiveAudienceHighlightPlayTextureView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveAudienceHighlightPlayTextureView.class, "1")) {
          return;
       }
       this.g = p0;
       this.invalidate();
       return;
    }
    public final void setTextureViewRoundCorner(int p0){
       if (PatchProxy.isSupport(LiveAudienceHighlightPlayTextureView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveAudienceHighlightPlayTextureView.class, "3")) {
          return;
       }
       a uoa = new a((float)a1.e((float)p0), 0, 0, this.getWidth(), this.getHeight());
       this.setOutlineProvider(v0);
       this.setClipToOutline(true);
       return;
    }
}

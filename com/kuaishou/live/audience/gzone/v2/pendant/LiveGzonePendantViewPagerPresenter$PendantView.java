package com.kuaishou.live.audience.gzone.v2.pendant.LiveGzonePendantViewPagerPresenter$PendantView;
import z31.c;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.live.audience.gzone.v2.pendant.LiveGzonePendantViewPagerPresenter$PendantView$a;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.kuaishou.live.common.gzone.pendant.LiveGzonePendant;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z31.b;

public class LiveGzonePendantViewPagerPresenter$PendantView extends KwaiImageView implements c	// class@000c35
{
    public b x;

    public void LiveGzonePendantViewPagerPresenter$PendantView(Context p0){
       super(p0, null);
    }
    public void LiveGzonePendantViewPagerPresenter$PendantView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveGzonePendantViewPagerPresenter$PendantView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.setOnClickListener(new LiveGzonePendantViewPagerPresenter$PendantView$a(this));
    }
    public void a(LiveGzonePendant p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzonePendantViewPagerPresenter$PendantView.class, "1")) {
          return;
       }
       LiveGzonePendantViewPagerPresenter$PendantView tx = this.x;
       if (tx != null) {
          tx.b();
       }
       return;
    }
    public void setLiveGzoneActivityPendantViewListener(b p0){
       this.x = p0;
    }
}

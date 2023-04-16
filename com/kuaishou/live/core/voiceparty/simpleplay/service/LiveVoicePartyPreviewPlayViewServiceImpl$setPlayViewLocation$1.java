package com.kuaishou.live.core.voiceparty.simpleplay.service.LiveVoicePartyPreviewPlayViewServiceImpl$setPlayViewLocation$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.simpleplay.service.LiveVoicePartyPreviewPlayViewServiceImpl;
import android.graphics.Point;
import android.graphics.Rect;
import com.kwai.feature.api.live.service.voiceparty.LiveVoicePartyPlayViewService$ScaleType;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.view.ViewGroup$LayoutParams;
import ot5.a;
import android.view.ViewGroup$MarginLayoutParams;
import fu2.h;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import com.kuaishou.live.core.voiceparty.simpleplay.service.LiveVoicePartyPreviewPlayViewServiceImpl$setPlayViewLocation$1$$special$$inlined$let$lambda$1;

public final class LiveVoicePartyPreviewPlayViewServiceImpl$setPlayViewLocation$1 extends Lambda implements a	// class@001913
{
    public final LiveVoicePartyPlayViewService$ScaleType $scaleType;
    public final Point $videoSize;
    public final Rect $viewHolderRect;
    public final LiveVoicePartyPreviewPlayViewServiceImpl this$0;

    public void LiveVoicePartyPreviewPlayViewServiceImpl$setPlayViewLocation$1(LiveVoicePartyPreviewPlayViewServiceImpl p0,Point p1,Rect p2,LiveVoicePartyPlayViewService$ScaleType p3){
       this.this$0 = p0;
       this.$videoSize = p1;
       this.$viewHolderRect = p2;
       this.$scaleType = p3;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveVoicePartyPreviewPlayViewServiceImpl$setPlayViewLocation$1.class, "1")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.LIVE_PREVIEW, "updateLivePlayViewSize "+this.$videoSize+' '+this.$viewHolderRect);
       if (this.$viewHolderRect.width() > 0 && this.$viewHolderRect.height() > 0) {
          ViewGroup$LayoutParams layoutParams = this.this$0.d.k();
          if (layoutParams != null) {
             LiveVoicePartyPreviewPlayViewServiceImpl$setPlayViewLocation$1 t$viewHolder = this.$viewHolderRect;
             ViewGroup$MarginLayoutParams marginLayout = h.d(this.this$0.d.g(), this.$viewHolderRect.width(), this.$viewHolderRect.height(), t$viewHolder.left, t$viewHolder.top, 0, 0);
             marginLayout.topMargin = marginLayout.topMargin - (int)this.this$0.d.j();
             if (marginLayout instanceof ConstraintLayout$LayoutParams) {
                objArray = marginLayout;
             }
             if (objArray != null) {
                int i = 0;
                objArray.h = i;
                objArray.d = i;
             }
             this.this$0.d.i(marginLayout, new LiveVoicePartyPreviewPlayViewServiceImpl$setPlayViewLocation$1$$special$$inlined$let$lambda$1(layoutParams, this));
          }
       }
       return;
    }
}

package com.kuaishou.live.livestage.videopipe.renderarea.ui.VideoContainerLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import se3.o;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import oe3.e;
import java.lang.StringBuilder;
import java.lang.Throwable;

public final class VideoContainerLayout extends ConstraintLayout	// class@000c18
{
    public o B;

    public void VideoContainerLayout(Context p0){
       a.p(p0, "context");
       super(p0, null, 0);
    }
    public void VideoContainerLayout(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void VideoContainerLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public final o getVideoContainerPlayerViewVisibilityDelegate$centaur_release(){
       return this.B;
    }
    public void onViewAdded(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoContainerLayout.class, "1")) {
          return;
       }
       super.onViewAdded(p0);
       e.d(e.d, "LiveStage", "[Render] "+"videoContainer addView: "+p0, null, 4, null);
       if (p0 == null) {
          return;
       }
       VideoContainerLayout tB = this.B;
       if (tB != null) {
          tB.d(p0);
       }
       return;
    }
    public void onViewRemoved(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoContainerLayout.class, "2")) {
          return;
       }
       super.onViewRemoved(p0);
       e.d(e.d, "LiveStage", "[Render] "+"videoContainer removeView: "+p0, null, 4, null);
       if (p0 == null) {
          return;
       }
       VideoContainerLayout tB = this.B;
       if (tB != null) {
          tB.a(p0);
       }
       return;
    }
    public final void setVideoContainerPlayerViewVisibilityDelegate$centaur_release(o p0){
       this.B = p0;
    }
}

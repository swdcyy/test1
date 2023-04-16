package com.kuaishou.live.common.core.component.notification.LiveOperationNotificationShimmerView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.drawee.view.DraweeView;
import android.animation.ObjectAnimator;

public class LiveOperationNotificationShimmerView extends KwaiImageView	// class@0016e1
{
    public ObjectAnimator x;

    public void LiveOperationNotificationShimmerView(Context p0){
       super(p0, null);
    }
    public void LiveOperationNotificationShimmerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveOperationNotificationShimmerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveOperationNotificationShimmerView.class, "1")) {
          return;
       }
       super.onDetachedFromWindow();
       this.p0();
       return;
    }
    public final void p0(){
       if (PatchProxy.applyVoid(null, this, LiveOperationNotificationShimmerView.class, "3")) {
          return;
       }
       LiveOperationNotificationShimmerView tx = this.x;
       if (tx != null && tx.isRunning()) {
          this.x.end();
       }
       return;
    }
}

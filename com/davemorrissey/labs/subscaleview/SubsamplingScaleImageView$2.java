package com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$2;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import android.content.Context;
import android.view.MotionEvent;
import android.graphics.PointF;
import java.lang.Math;
import android.view.View;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$AnimationBuilder;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$1;

public class SubsamplingScaleImageView$2 extends GestureDetector$SimpleOnGestureListener	// class@000fac
{
    public final SubsamplingScaleImageView this$0;
    public final Context val$context;

    public void SubsamplingScaleImageView$2(SubsamplingScaleImageView p0,Context p1){
       this.this$0 = p0;
       this.val$context = p1;
       super();
    }
    public boolean onDoubleTap(MotionEvent p0){
       SubsamplingScaleImageView$2 tthis$0 = this.this$0;
       if (tthis$0.zoomEnabled == null || (tthis$0.readySent == null || tthis$0.vTranslate == null)) {
          return super.onDoubleTapEvent(p0);
       }
       tthis$0.setGestureDetector(this.val$context);
       tthis$0 = this.this$0;
       boolean b = true;
       if (tthis$0.quickScaleEnabled != null) {
          tthis$0.vCenterStart = new PointF(p0.getX(), p0.getY());
          SubsamplingScaleImageView vTranslate = this.this$0.vTranslate;
          this.this$0.vTranslateStart = new PointF(vTranslate.x, vTranslate.y);
          tthis$0 = this.this$0;
          tthis$0.scaleStart = tthis$0.scale;
          tthis$0.isQuickScaling = b;
          tthis$0.isZooming = b;
          tthis$0.quickScaleLastDistance = 0xbf800000;
          tthis$0.quickScaleSCenter = tthis$0.viewToSourceCoord(tthis$0.vCenterStart);
          this.this$0.quickScaleVStart = new PointF(p0.getX(), p0.getY());
          SubsamplingScaleImageView quickScaleSC = this.this$0.quickScaleSCenter;
          p0.quickScaleVLastPoint = new PointF(quickScaleSC.x, quickScaleSC.y);
          p0.quickScaleMoved = false;
          return false;
       }else {
          tthis$0.doubleTapZoom(tthis$0.viewToSourceCoord(new PointF(p0.getX(), p0.getY())), new PointF(p0.getX(), p0.getY()));
          return b;
       }
    }
    public boolean onFling(MotionEvent p0,MotionEvent p1,float p2,float p3){
       SubsamplingScaleImageView$2 tthis$0 = this.this$0;
       if (tthis$0.panEnabled != null && (tthis$0.readySent != null && (tthis$0.vTranslate != null && (p0 != null && p1 != null)))) {
          int i = 0x42480000;
          if (Math.abs((p0.getX() - p1.getX())) - i > 0 || Math.abs((p0.getY() - p1.getY())) - i > 0) {
             i = 0x43fa0000;
             if (Math.abs(p2) - i > 0 || (Math.abs(p3) - i > 0 && this.this$0.isZooming == null)) {
                SubsamplingScaleImageView vTranslate = this.this$0.vTranslate;
                PointF pointF = new PointF((vTranslate.x + (p2 * 0.25f)), (vTranslate.y + (p3 * 0.25f)));
                SubsamplingScaleImageView$2 tthis$01 = this.this$0;
                SubsamplingScaleImageView$2 tthis$02 = this.this$0;
                SubsamplingScaleImageView$AnimationBuilder uAnimationBu = new SubsamplingScaleImageView$AnimationBuilder(tthis$02, new PointF((((float)(this.this$0.getWidth() / 2) - pointF.x) / tthis$01.scale), (((float)(tthis$01.getHeight() / 2) - pointF.y) / tthis$02.scale)), null);
                uAnimationBu.withEasing(1).withPanLimited(false).withOrigin(3).start();
                return 1;
             }
          }
       }
    label_00a1 :
       return super.onFling(p0, p1, p2, p3);
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       this.this$0.performClick();
       return true;
    }
}

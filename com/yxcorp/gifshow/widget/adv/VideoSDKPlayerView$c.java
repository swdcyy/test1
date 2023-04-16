package com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView$c;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import android.content.Context;
import android.widget.RelativeLayout;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Map;
import java.lang.Math;
import java.util.Collection;
import java.util.Iterator;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView$d;
import java.util.Objects;

public class VideoSDKPlayerView$c extends GestureDetector$SimpleOnGestureListener	// class@001914
{
    public final int b;
    public final int c;
    public final VideoSDKPlayerView d;

    public void VideoSDKPlayerView$c(VideoSDKPlayerView p0){
       this.d = p0;
       super();
       this.b = (int)((60.00f / c.c(p0.getContext().getResources()).density) + 0x3f000000);
       this.c = 200;
    }
    public boolean onFling(MotionEvent p0,MotionEvent p1,float p2,float p3){
       Iterator iterator;
       if (PatchProxy.isSupport(VideoSDKPlayerView$c.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, VideoSDKPlayerView$c.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (!this.d.mSimpleGestureListeners.size() || (p0 == null || (p1 != null && this.d.mIsEnableFling != null))) {
          if (Math.abs((p0.getY() - p1.getY())) - Math.abs((p0.getX() - p1.getX())) > 0) {
             return false;
          }else if(Math.abs((p0.getY() - p1.getY())) - Math.abs((p0.getX() - p1.getX())) > 0){
             return false;
          }else if((p0.getX() - p1.getX()) - (float)this.b > 0 && Math.abs(p2) - 0x43480000 > 0){
             iterator = this.d.mSimpleGestureListeners.values().iterator();
             while (iterator.hasNext()) {
                Objects.requireNonNull(iterator.next());
             }
             return false;
          }else if((p1.getX() - p0.getX()) - (float)this.b > 0 && Math.abs(p2) - 0x43480000 > 0){
             iterator = this.d.mSimpleGestureListeners.values().iterator();
             while (iterator.hasNext()) {
                Objects.requireNonNull(iterator.next());
             }
          }
       }
       return false;
    }
    public boolean onSingleTapUp(MotionEvent p0){
       p0 = PatchProxy.applyOneRefs(p0, this, VideoSDKPlayerView$c.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       Iterator iterator = this.d.mSimpleGestureListeners.values().iterator();
       int i = 0;
       while (iterator.hasNext()) {
          int i1 = iterator.next().a() | 0;
          i = i | i1;
       }
       return i;
    }
}

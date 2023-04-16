package com.kwai.library.widget.recyclerview.RecommendUserRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Math;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;

public class RecommendUserRecyclerView extends RecyclerView	// class@0009b8
{
    public final PointF b;

    public void RecommendUserRecyclerView(Context p0){
       super(p0);
       this.b = new PointF();
    }
    public void RecommendUserRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new PointF();
    }
    public void RecommendUserRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new PointF();
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       int actionMasked = p0.getActionMasked();
       boolean b = true;
       if (actionMasked) {
          if (actionMasked == 2) {
             if (Math.abs((p0.getX() - this.b.x)) - Math.abs((p0.getY() - this.b.y)) > 0) {
                this.getParent().requestDisallowInterceptTouchEvent(b);
             }else if((Math.abs((p0.getY() - this.b.y)) - Math.abs((p0.getX() - this.b.x))) - (float)(int)((0x3f800000 * c.c(this.getResources()).density) + 0x3f000000) > 0){
                this.getParent().requestDisallowInterceptTouchEvent(false);
             }
          }
       }else {
          this.b.x = p0.getX();
          this.b.y = p0.getY();
          this.getParent().requestDisallowInterceptTouchEvent(b);
       }
       return super.dispatchTouchEvent(p0);
    }
}

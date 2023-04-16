package com.kwai.video_clip.widget.CustomHorizontalScroller;
import android.widget.HorizontalScrollView;
import android.content.Context;
import com.kwai.video_clip.widget.CustomHorizontalScroller$a;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kwai.video_clip.widget.CustomHorizontalScroller$b;
import java.lang.Integer;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.Handler;
import java.lang.Runnable;

public class CustomHorizontalScroller extends HorizontalScrollView	// class@00110a
{
    public Runnable b;
    public CustomHorizontalScroller$b c;
    public int d;

    public void CustomHorizontalScroller(Context p0){
       super(p0);
       this.b = new CustomHorizontalScroller$a(this);
       this.d = -1;
    }
    public void CustomHorizontalScroller(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new CustomHorizontalScroller$a(this);
       this.d = -1;
    }
    public void CustomHorizontalScroller(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new CustomHorizontalScroller$a(this);
       this.d = -1;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CustomHorizontalScroller.class, "1")) {
          return;
       }
       super.onDraw(p0);
       CustomHorizontalScroller tc = this.c;
       if (tc != null) {
          tc.c(p0);
       }
       return;
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(CustomHorizontalScroller.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, CustomHorizontalScroller.class, "2")) {
          return;
       }
       super.onScrollChanged(p0, p1, p2, p3);
       CustomHorizontalScroller tc = this.c;
       if (tc != null) {
          tc.a(p0, p2);
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CustomHorizontalScroller.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int action = p0.getAction();
       if (action) {
          if (action == 1 || (action != 2 && action == 3)) {
             this.getHandler().postDelayed(this.b, 30);
          }
       }else {
          this.d = this.getScrollX();
          this.getHandler().removeCallbacks(this.b);
       }
       return super.onTouchEvent(p0);
    }
    public void setOnScrollListener(CustomHorizontalScroller$b p0){
       this.c = p0;
    }
}

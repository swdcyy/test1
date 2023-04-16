package com.kuaishou.live.core.show.closepage.audience.widget.LivePlayClosedFeedRecyclerView;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import f12.d;

public class LivePlayClosedFeedRecyclerView extends CustomRecyclerView	// class@000a4b
{
    public float q;
    public d r;

    public void LivePlayClosedFeedRecyclerView(Context p0){
       super(p0, null);
    }
    public void LivePlayClosedFeedRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LivePlayClosedFeedRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       LivePlayClosedFeedRecyclerView obj = PatchProxy.applyOneRefs(p0, this, LivePlayClosedFeedRecyclerView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int action = p0.getAction();
       if (action) {
          float f = 0;
          if (action != 1) {
             if (action == 2) {
                if ((p0.getRawY() - this.q) - f > 0) {
                   obj = this.r;
                   if (obj != null) {
                      obj.w(false);
                   }
                }else {
                   obj = this.r;
                   if (obj != null) {
                      obj.w(true);
                   }
                }
             }
          }else {
             this.q = f;
             obj = this.r;
             if (obj != null) {
                obj.w(true);
             }
          }
       }else {
          this.q = p0.getRawY();
       }
       return super.dispatchTouchEvent(p0);
    }
    public void setLiveSlideContainer(d p0){
       this.r = p0;
    }
}

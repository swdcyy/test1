package com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer$b;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.HorizontalScrollView;
import com.yxcorp.gifshow.widget.trimvideo.RangeSeekerV2;
import com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer$j;

public class VideoTrimmer$b implements View$OnTouchListener	// class@0019e4
{
    public final VideoTrimmer b;

    public void VideoTrimmer$b(VideoTrimmer p0){
       this.b = p0;
       super();
    }
    public boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, VideoTrimmer$b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       int action = p1.getAction();
       if (action) {
          if (action == 1 || action == 3) {
             VideoTrimmer$b tb = this.b;
             float f = tb.d(tb.d.getScrollX(), this.b.e.getStart());
             tb = this.b;
             float f1 = tb.d(tb.d.getScrollX(), this.b.e.getEnd());
             tb = this.b;
             tb.j = tb.c(tb.d.getScrollX(), this.b.e.getStart());
             tb = this.b;
             tb.k = tb.c(tb.d.getScrollX(), this.b.e.getEnd());
             tb = this.b;
             VideoTrimmer o = tb.o;
             if (o != null) {
                o.b(f, f1, tb.j, tb.k, tb.u, false, false);
                this.b.o.e();
             }
          }
       }else {
          VideoTrimmer o1 = this.b.o;
          if (o1 != null) {
             o1.a();
          }
       }
       return false;
    }
}

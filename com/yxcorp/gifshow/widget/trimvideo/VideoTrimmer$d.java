package com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer$d;
import com.yxcorp.gifshow.widget.CustomHorizontalScroller$b;
import com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.widget.trimvideo.RangeSeekerV2;
import android.widget.HorizontalScrollView;
import com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer$j;
import android.widget.RelativeLayout;
import android.graphics.Canvas;
import com.yxcorp.gifshow.widget.trimvideo.LinearBitmapContainer;
import android.widget.LinearLayout;

public class VideoTrimmer$d implements CustomHorizontalScroller$b	// class@0019e6
{
    public final VideoTrimmer a;

    public void VideoTrimmer$d(VideoTrimmer p0){
       this.a = p0;
       super();
    }
    public void a(int p0,int p1){
       VideoTrimmer$d uod = VideoTrimmer$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uod, "2")) {
          return;
       }
       uod = this.a;
       VideoTrimmer j = uod.j;
       uod.j = uod.c(p0, uod.e.getStart());
       uod = this.a;
       VideoTrimmer k = uod.k;
       uod.k = uod.c(p0, uod.e.getEnd());
       uod = this.a;
       if (j != uod.j || (k != uod.k && uod.o != null)) {
          VideoTrimmer$d ta = this.a;
          VideoTrimmer$d ta1 = this.a;
          ta1.o.d(ta1.j, ta1.k, uod.d(uod.d.getScrollX(), this.a.e.getStart()), ta.d(ta.d.getScrollX(), this.a.e.getEnd()));
       }
       if (p0 <= (this.a.e.getPaddingLeft() + this.a.e.getHandlerWidth()) || p1 <= (this.a.e.getPaddingLeft() + this.a.e.getHandlerWidth())) {
          this.a.f();
       }
       this.a.g();
       p0.u = true;
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, VideoTrimmer$d.class, "3")) {
          return;
       }
       VideoTrimmer$d ta = this.a;
       ta.u = false;
       ta.j = ta.c(ta.d.getScrollX(), this.a.e.getStart());
       ta = this.a;
       ta.k = ta.c(ta.d.getScrollX(), this.a.e.getEnd());
       ta = this.a;
       float f = ta.d(ta.d.getScrollX(), this.a.e.getStart());
       ta = this.a;
       float f1 = ta.d(ta.d.getScrollX(), this.a.e.getEnd());
       ta = this.a;
       VideoTrimmer o = ta.o;
       if (o != null) {
          o.b(f, f1, ta.j, ta.k, ta.u, false, false);
       }
       return;
    }
    public void c(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoTrimmer$d.class, "1")) {
          return;
       }
       VideoTrimmer g = this.a.g;
       if (g.d == null) {
          g.requestLayout();
       }
       this.a.g.invalidate();
       return;
    }
}

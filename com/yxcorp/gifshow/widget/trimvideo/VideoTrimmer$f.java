package com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer$f;
import com.yxcorp.gifshow.widget.trimvideo.RangeSeekerV2$b;
import com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer$j;
import java.lang.Integer;
import android.widget.HorizontalScrollView;
import com.yxcorp.gifshow.widget.trimvideo.RangeSeekerV2;

public class VideoTrimmer$f implements RangeSeekerV2$b	// class@0019e8
{
    public final VideoTrimmer a;

    public void VideoTrimmer$f(VideoTrimmer p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, VideoTrimmer$f.class, "1")) {
          return;
       }
       VideoTrimmer o = this.a.o;
       if (o != null) {
          o.a();
       }
       return;
    }
    public void b(int p0){
       VideoTrimmer$f uof = VideoTrimmer$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof, "4")) {
          return;
       }
       uof = this.a;
       VideoTrimmer j = uof.j;
       uof.j = uof.c(uof.d.getScrollX(), p0);
       VideoTrimmer$f ta = this.a;
       VideoTrimmer j1 = ta.j;
       if (j != j1) {
          VideoTrimmer o = ta.o;
          if (o != null) {
             o.f(j1);
          }
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, VideoTrimmer$f.class, "2")) {
          return;
       }
       VideoTrimmer$f ta = this.a;
       float f = ta.d(ta.d.getScrollX(), this.a.e.getStart());
       ta = this.a;
       float f1 = ta.d(ta.d.getScrollX(), this.a.e.getEnd());
       ta = this.a;
       ta.j = ta.c(ta.d.getScrollX(), this.a.e.getStart());
       ta = this.a;
       ta.k = ta.c(ta.d.getScrollX(), this.a.e.getEnd());
       ta = this.a;
       VideoTrimmer o = ta.o;
       if (o != null) {
          o.b(f, f1, ta.j, ta.k, ta.u, false, true);
          this.a.o.e();
       }
       return;
    }
    public void d(int p0){
       VideoTrimmer$f uof = VideoTrimmer$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof, "5")) {
          return;
       }
       uof = this.a;
       VideoTrimmer k = uof.k;
       uof.k = uof.c(uof.d.getScrollX(), p0);
       VideoTrimmer$f ta = this.a;
       VideoTrimmer k1 = ta.k;
       if (k != k1) {
          VideoTrimmer o = ta.o;
          if (o != null) {
             o.c(k1);
          }
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, VideoTrimmer$f.class, "3")) {
          return;
       }
       VideoTrimmer$f ta = this.a;
       float f = ta.d(ta.d.getScrollX(), this.a.e.getStart());
       ta = this.a;
       float f1 = ta.d(ta.d.getScrollX(), this.a.e.getEnd());
       ta = this.a;
       ta.j = ta.c(ta.d.getScrollX(), this.a.e.getStart());
       ta = this.a;
       ta.k = ta.c(ta.d.getScrollX(), this.a.e.getEnd());
       ta = this.a;
       VideoTrimmer o = ta.o;
       if (o != null) {
          o.b(f, f1, ta.j, ta.k, ta.u, true, true);
          this.a.o.e();
       }
       return;
    }
}

package com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer$c;
import com.yxcorp.gifshow.widget.trimvideo.RangeSeekerV2$a;
import com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer$i;
import java.lang.Integer;
import android.widget.HorizontalScrollView;
import com.yxcorp.gifshow.widget.trimvideo.GraduationRulerView;

public class VideoTrimmer$c implements RangeSeekerV2$a	// class@0019e5
{
    public final VideoTrimmer a;

    public void VideoTrimmer$c(VideoTrimmer p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, VideoTrimmer$c.class, "3")) {
          return;
       }
       VideoTrimmer p = this.a.p;
       if (p != null) {
          p.a();
       }
       return;
    }
    public void b(int p0){
       VideoTrimmer$c uoc = VideoTrimmer$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       uoc = this.a;
       VideoTrimmer p = uoc.p;
       if (p != null) {
          p.b(uoc.f.b((p0 + uoc.d.getScrollX())));
       }
       return;
    }
    public void onSeekStart(){
       if (PatchProxy.applyVoid(null, this, VideoTrimmer$c.class, "2")) {
          return;
       }
       VideoTrimmer p = this.a.p;
       if (p != null) {
          p.onSeekStart();
       }
       return;
    }
}

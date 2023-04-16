package com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer$a;
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
import com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer$j;

public class VideoTrimmer$a implements View$OnTouchListener	// class@0019e3
{
    public final VideoTrimmer b;

    public void VideoTrimmer$a(VideoTrimmer p0){
       this.b = p0;
       super();
    }
    public boolean onTouch(View p0,MotionEvent p1){
       VideoTrimmer o;
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, VideoTrimmer$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       int action = p1.getAction();
       if (action) {
          if (action == 1 || action == 3) {
             o = this.b.o;
             if (o != null) {
                o.e();
             }
          }
       }else {
          o = this.b.o;
          if (o != null) {
             o.a();
          }
       }
       return false;
    }
}

package com.kwai.live.gzone.widget.LiveGzoneProgressBallView$a;
import java.lang.Runnable;
import com.kwai.live.gzone.widget.LiveGzoneProgressBallView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.lang.Math;

public class LiveGzoneProgressBallView$a implements Runnable	// class@000e7d
{
    public final LiveGzoneProgressBallView b;

    public void LiveGzoneProgressBallView$a(LiveGzoneProgressBallView p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneProgressBallView$a.class, "1")) {
          return;
       }
       LiveGzoneProgressBallView$a tb = this.b;
       tb.removeCallbacks(tb.l);
       tb = this.b;
       float f = tb.e + 0x3f800000;
       tb.e = f;
       if (f - (float)tb.h > 0) {
          tb.e = 0;
       }
       LiveGzoneProgressBallView d = tb.d;
       LiveGzoneProgressBallView c = tb.c;
       if (d - c) {
          float f1 = Math.max(0x3b03126f, (Math.abs((d - c)) * 0.02f));
          LiveGzoneProgressBallView$a tb1 = this.b;
          LiveGzoneProgressBallView c1 = tb1.c;
          LiveGzoneProgressBallView d1 = tb1.d;
          tb1.d = (c1 - d1 > 0)? d1 + f1: d1 - f1;
          if (Math.abs((tb1.d - c1)) - f1 < 0) {
             tb = this.b;
             tb.d = tb.c;
          }
       }
       this.b.postInvalidate();
       return;
    }
}

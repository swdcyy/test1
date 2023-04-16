package com.kwai.video_clip.widget.CustomHorizontalScroller$a;
import java.lang.Runnable;
import com.kwai.video_clip.widget.CustomHorizontalScroller;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.HorizontalScrollView;
import com.kwai.video_clip.widget.CustomHorizontalScroller$b;
import android.os.Handler;

public class CustomHorizontalScroller$a implements Runnable	// class@001108
{
    public final CustomHorizontalScroller b;

    public void CustomHorizontalScroller$a(CustomHorizontalScroller p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, CustomHorizontalScroller$a.class, "1")) {
          return;
       }
       CustomHorizontalScroller$a tb = this.b;
       CustomHorizontalScroller d = tb.d;
       tb.d = tb.getScrollX();
       tb = this.b;
       if (d == tb.d) {
          CustomHorizontalScroller c = tb.c;
          if (c != null) {
             c.b();
          }
       }else {
          Handler handler = tb.getHandler();
          if (handler != null) {
             handler.postDelayed(this, 30);
          }
       }
       return;
    }
}

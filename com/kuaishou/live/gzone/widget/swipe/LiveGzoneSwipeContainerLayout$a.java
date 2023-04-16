package com.kuaishou.live.gzone.widget.swipe.LiveGzoneSwipeContainerLayout$a;
import androidx.customview.widget.ViewDragHelper$c;
import com.kuaishou.live.gzone.widget.swipe.LiveGzoneSwipeContainerLayout;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import androidx.customview.widget.ViewDragHelper;
import android.widget.FrameLayout;
import com.kuaishou.live.gzone.widget.swipe.LiveGzoneSwipeContainerLayout$b;

public class LiveGzoneSwipeContainerLayout$a extends ViewDragHelper$c	// class@001d00
{
    public final LiveGzoneSwipeContainerLayout a;

    public void LiveGzoneSwipeContainerLayout$a(LiveGzoneSwipeContainerLayout p0){
       this.a = p0;
       super();
    }
    public int b(View p0,int p1,int p2){
       LiveGzoneSwipeContainerLayout$a ta = this.a;
       if (p0 == ta.c) {
          if (p1 < 0) {
             p1 = 0;
          }else {
             LiveGzoneSwipeContainerLayout d = ta.d;
             if (p1 > d) {
                LiveGzoneSwipeContainerLayout liveGzoneSwi = d;
             }
          }
       }
       return p1;
    }
    public int e(View p0){
       return this.a.d;
    }
    public void l(View p0,float p1,float p2){
       if (PatchProxy.isSupport(LiveGzoneSwipeContainerLayout$a.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, LiveGzoneSwipeContainerLayout$a.class, "1")) {
          return;
       }
       int i = 300;
       LiveGzoneSwipeContainerLayout$a ta = this.a;
       if (p0 == ta.c) {
          if (p2 - (float)i > 0) {
             ta.a();
          }else {
             LiveGzoneSwipeContainerLayout$a ta1 = this.a;
             if ((p0.getTop() * 2) > ta1.d) {
                ta1.a();
             }else {
                Objects.requireNonNull(ta1);
                if (!PatchProxy.applyVoid(null, ta1, LiveGzoneSwipeContainerLayout.class, "7")) {
                   ta1.b.smoothSlideViewTo(ta1.c, 0, 0);
                   ta1.invalidate();
                   LiveGzoneSwipeContainerLayout g = ta1.g;
                   if (g != null) {
                      g.a();
                   }
                }
             }
          }
       }
       return;
    }
    public boolean m(View p0,int p1){
       return true;
    }
}

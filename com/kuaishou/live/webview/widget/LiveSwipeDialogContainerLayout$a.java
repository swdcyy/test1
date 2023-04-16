package com.kuaishou.live.webview.widget.LiveSwipeDialogContainerLayout$a;
import androidx.customview.widget.ViewDragHelper$c;
import com.kuaishou.live.webview.widget.LiveSwipeDialogContainerLayout;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import androidx.customview.widget.ViewDragHelper;
import android.widget.FrameLayout;
import com.kuaishou.live.webview.widget.LiveSwipeDialogContainerLayout$b;

public class LiveSwipeDialogContainerLayout$a extends ViewDragHelper$c	// class@001013
{
    public final LiveSwipeDialogContainerLayout a;

    public void LiveSwipeDialogContainerLayout$a(LiveSwipeDialogContainerLayout p0){
       this.a = p0;
       super();
    }
    public int b(View p0,int p1,int p2){
       LiveSwipeDialogContainerLayout$a ta = this.a;
       if (p0 == ta.c) {
          if (p1 < 0) {
             p1 = 0;
          }else {
             LiveSwipeDialogContainerLayout d = ta.d;
             if (p1 > d) {
                LiveSwipeDialogContainerLayout liveSwipeDia = d;
             }
          }
       }
       return p1;
    }
    public int e(View p0){
       return this.a.d;
    }
    public void l(View p0,float p1,float p2){
       if (PatchProxy.isSupport(LiveSwipeDialogContainerLayout$a.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, LiveSwipeDialogContainerLayout$a.class, "1")) {
          return;
       }
       int i = 300;
       LiveSwipeDialogContainerLayout$a ta = this.a;
       if (p0 == ta.c) {
          if (p2 - (float)i > 0) {
             ta.a();
          }else {
             LiveSwipeDialogContainerLayout$a ta1 = this.a;
             if ((p0.getTop() * 2) > ta1.d) {
                ta1.a();
             }else {
                Objects.requireNonNull(ta1);
                if (!PatchProxy.applyVoid(null, ta1, LiveSwipeDialogContainerLayout.class, "7")) {
                   ta1.b.smoothSlideViewTo(ta1.c, 0, 0);
                   ta1.invalidate();
                   LiveSwipeDialogContainerLayout g = ta1.g;
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

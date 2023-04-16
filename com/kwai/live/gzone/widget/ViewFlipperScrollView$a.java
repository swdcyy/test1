package com.kwai.live.gzone.widget.ViewFlipperScrollView$a;
import java.lang.Runnable;
import com.kwai.live.gzone.widget.ViewFlipperScrollView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.widget.FrameLayout;

public class ViewFlipperScrollView$a implements Runnable	// class@000e86
{
    public final ViewFlipperScrollView b;

    public void ViewFlipperScrollView$a(ViewFlipperScrollView p0){
       this.b = p0;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ViewFlipperScrollView$a.class, "1")) {
          return;
       }
       ViewFlipperScrollView$a tb = this.b;
       tb.j = objArray;
       ViewFlipperScrollView i = tb.i;
       if (i != null) {
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(i, tb, ViewFlipperScrollView.class, "7")) {
             if (tb.j == null) {
                tb.j = i;
                tb.d(i);
                tb.postDelayed(tb.k, 2000);
             }else {
                tb.i = i;
             }
          }
       }
       return;
    }
}

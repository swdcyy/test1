package com.yxcorp.gifshow.camera.record.followshoot.d$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.camera.record.followshoot.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import a2.i0;
import android.view.ViewTreeObserver;
import android.graphics.Point;
import com.yxcorp.gifshow.camera.record.widget.AdjustableCameraView;
import com.yxcorp.gifshow.camera.record.widget.SampleVideoView;

public class d$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@000dc9
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "1")) {
          return;
       }
       if (!i0.Y(this.b.o)) {
          return;
       }
       this.b.o.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       Point point = new Point(this.b.o.getWidth(), this.b.o.getHeight());
       this.b.p.setPreviewSize(point);
       d q = this.b.q;
       if (q != null) {
          q.setPreviewSize(point);
       }
       q = this.b.r;
       if (q != null) {
          q.setPreviewSize(point);
       }
       return;
    }
}

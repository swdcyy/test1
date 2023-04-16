package com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverCropView$e;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverCropView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tpc.t;
import android.graphics.Paint;
import android.view.View;

public final class VideoCoverCropView$e implements Runnable	// class@000e9d
{
    public final VideoCoverCropView b;

    public void VideoCoverCropView$e(VideoCoverCropView p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, VideoCoverCropView$e.class, "1")) {
          return;
       }
       VideoCoverCropView$e tb = this.b;
       int c = t.c;
       tb.d = c;
       tb.b.setColor(c);
       this.b.invalidate();
       return;
    }
}

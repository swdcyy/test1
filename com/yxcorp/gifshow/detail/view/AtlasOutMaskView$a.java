package com.yxcorp.gifshow.detail.view.AtlasOutMaskView$a;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.yxcorp.gifshow.detail.view.AtlasOutMaskView;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView$c;

public class AtlasOutMaskView$a extends GestureDetector$SimpleOnGestureListener	// class@001a38
{
    public final AtlasOutMaskView b;

    public void AtlasOutMaskView$a(AtlasOutMaskView p0){
       this.b = p0;
       super();
    }
    public boolean onDoubleTap(MotionEvent p0){
       AtlasOutMaskView obj = PatchProxy.applyOneRefs(p0, this, AtlasOutMaskView$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.c;
       if (obj != null) {
          obj.onDoubleTap(p0);
       }
       return true;
    }
    public boolean onDown(MotionEvent p0){
       return true;
    }
    public void onLongPress(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AtlasOutMaskView$a.class, "2")) {
          return;
       }
       AtlasOutMaskView c = this.b.c;
       if (c != null) {
          c.onLongPress(p0);
       }
       return;
    }
}

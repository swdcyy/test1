package com.yxcorp.gifshow.detail.view.AtlasOutMaskView$b;
import tyc.g0;
import com.yxcorp.gifshow.detail.view.AtlasOutMaskView;
import android.content.Context;
import android.view.GestureDetector$OnGestureListener;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView$c;

public class AtlasOutMaskView$b extends g0	// class@001a39
{
    public final AtlasOutMaskView D;

    public void AtlasOutMaskView$b(AtlasOutMaskView p0,Context p1,GestureDetector$OnGestureListener p2){
       this.D = p0;
       super(p1, p2);
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AtlasOutMaskView$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.D.c.onTouchEvent(p0) || super.onTouchEvent(p0))? true: false;
       return b;
    }
}

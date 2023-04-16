package com.yxcorp.gifshow.detail.view.AtlasOutMaskView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.view.AtlasOutMaskView$b;
import com.yxcorp.gifshow.detail.view.AtlasOutMaskView$a;
import android.view.GestureDetector$OnGestureListener;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.GestureDetector;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView$c;

public class AtlasOutMaskView extends View	// class@001a3a
{
    public GestureDetector b;
    public PhotosScaleHelpView$c c;

    public void AtlasOutMaskView(Context p0){
       super(p0);
       this.a(p0);
    }
    public void AtlasOutMaskView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a(p0);
    }
    public final void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AtlasOutMaskView.class, "1")) {
          return;
       }
       this.b = new AtlasOutMaskView$b(this, p0, new AtlasOutMaskView$a(this));
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AtlasOutMaskView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.b.onTouchEvent(p0) || super.onTouchEvent(p0))? true: false;
       return b;
    }
    public void setPhotosScaleHelper(PhotosScaleHelpView$c p0){
       this.c = p0;
    }
}

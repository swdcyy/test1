package com.yxcorp.gifshow.camera.record.widget.RecordInnerAnimView$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.camera.record.widget.RecordInnerAnimView;
import android.widget.ImageView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import android.view.ViewTreeObserver;

public final class RecordInnerAnimView$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@000fd4
{
    public final RecordInnerAnimView b;
    public final ImageView c;

    public void RecordInnerAnimView$b(RecordInnerAnimView p0,ImageView p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, RecordInnerAnimView$b.class, "1")) {
          return;
       }
       if (this.b.getHeight() > 0) {
          this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
          this.c.setTranslationY(((float)(- this.b.getHeight()) / 2.00f));
       }
       return;
    }
}

package com.yxcorp.gifshow.camera.record.photo.i$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.camera.record.photo.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import a2.i0;
import android.view.ViewTreeObserver;

public class i$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@000eaf
{
    public final i b;

    public void i$a(i p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, i$a.class, "1")) {
          return;
       }
       if (!i0.Y(this.b.r)) {
          return;
       }
       this.b.r.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       i$a tb = this.b;
       tb.o = (int)tb.r.getTranslationY();
       return;
    }
}

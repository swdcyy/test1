package com.yxcorp.gifshow.v3.widget.PictureSelectView$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.widget.PictureSelectView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;

public class PictureSelectView$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@001657
{
    public final PictureSelectView b;

    public void PictureSelectView$a(PictureSelectView p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, PictureSelectView$a.class, "1")) {
          return;
       }
       this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       this.b.O(false);
       return;
    }
}

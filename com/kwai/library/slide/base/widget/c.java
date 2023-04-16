package com.kwai.library.slide.base.widget.c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kwai.library.slide.base.widget.d$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewTreeObserver;

public class c implements ViewTreeObserver$OnGlobalLayoutListener	// class@0008fa
{
    public final d$a b;

    public void c(d$a p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       c tb = this.b;
       tb.d = tb.getView().getMeasuredHeight();
       this.b.getView().setTranslationY((float)this.b.d);
       this.b.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
       return;
    }
}

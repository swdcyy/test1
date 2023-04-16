package com.yxcorp.gifshow.v3.editor.segment.b0$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.editor.segment.b0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

public class b0$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@0011c6
{
    public final int b;
    public final b0 c;

    public void b0$b(b0 p0,int p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, b0$b.class, "1")) {
          return;
       }
       if (this.c.p.getWidth() && this.c.p.getChildCount()) {
          this.c.p.getViewTreeObserver().removeOnGlobalLayoutListener(this);
          this.c.V8(this.b);
       }
       return;
    }
}

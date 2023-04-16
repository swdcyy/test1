package com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.vb.b$c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.vb.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

public class b$c implements ViewTreeObserver$OnGlobalLayoutListener	// class@000e0d
{
    public final int b;
    public final b c;

    public void b$c(b p0,int p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, b$c.class, "1")) {
          return;
       }
       if (this.c.d.getWidth() && this.c.d.getChildCount()) {
          this.c.d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
          this.c.D(this.b);
       }
       return;
    }
}

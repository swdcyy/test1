package com.yxcorp.gifshow.camera.record.tab.c$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.camera.record.tab.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import a2.i0;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

public class c$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@000f48
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "1")) {
          return;
       }
       if (!i0.Y(this.b.h)) {
          return;
       }
       this.b.h.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       c$a tb = this.b;
       tb.p = (int)tb.h.getTranslationY();
       return;
    }
}

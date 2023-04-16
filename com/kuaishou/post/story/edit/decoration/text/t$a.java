package com.kuaishou.post.story.edit.decoration.text.t$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kuaishou.post.story.edit.decoration.text.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import a2.i0;
import android.widget.LinearLayout;
import android.view.ViewTreeObserver;

public class t$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@000b18
{
    public final t b;

    public void t$a(t p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, t$a.class, "1")) {
          return;
       }
       if (!i0.Y(this.b.q) && !this.b.q.getVisibility()) {
          return;
       }
       this.b.q.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       t$a tb = this.b;
       tb.q.getLocationOnScreen(tb.t);
       tb = this.b;
       tb.q.getLocationInWindow(tb.u);
       this.b.P8();
       return;
    }
}

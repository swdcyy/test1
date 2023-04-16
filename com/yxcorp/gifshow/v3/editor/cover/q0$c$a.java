package com.yxcorp.gifshow.v3.editor.cover.q0$c$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.editor.cover.q0$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.cover.q0;
import android.widget.AbsoluteLayout;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;

public class q0$c$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@000ebc
{
    public final q0$c b;

    public void q0$c$a(q0$c p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, q0$c$a.class, "1")) {
          return;
       }
       if (this.b.b.Y.getWidth() > 0 && this.b.b.Y.getHeight() > 0) {
          this.b.b.Y.getViewTreeObserver().removeOnGlobalLayoutListener(this);
          this.b.b.Z.t0(true);
       }
       return;
    }
}

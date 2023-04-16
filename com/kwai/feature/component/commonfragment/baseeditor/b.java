package com.kwai.feature.component.commonfragment.baseeditor.b;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.kwai.feature.component.commonfragment.baseeditor.FloatEditorFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import java.util.Objects;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import com.kwai.feature.component.commonfragment.baseeditor.b$a;
import android.view.View$OnLayoutChangeListener;
import android.widget.EditText;

public class b implements ViewTreeObserver$OnPreDrawListener	// class@0011fb
{
    public boolean b;
    public final View c;
    public final FloatEditorFragment d;

    public void b(FloatEditorFragment p0,View p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public boolean onPreDraw(){
       b obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.d.b1.getViewTreeObserver().removeOnPreDrawListener(this);
       int i = 1;
       if (this.d.qi()) {
          obj = this.d;
          obj.V0[i] = (int)obj.g1.getY();
       }else {
          obj = this.d;
          obj.V0[i] = (int)obj.b1.getY();
       }
       if (this.b == null) {
          obj = this.d;
          if (obj.c1 != null) {
             this.b = i;
             b tc = this.c;
             Objects.requireNonNull(obj);
             if (!PatchProxy.applyVoidOneRefs(tc, obj, FloatEditorFragment.class, "18")) {
                tc.setTranslationY((float)obj.b1.getMeasuredHeight());
                tc.animate().alpha(0x3f800000).translationY(0).setInterpolator(new DecelerateInterpolator()).setStartDelay(150).setDuration(200).start();
             }
          }
       }
       this.d.W0.addOnLayoutChangeListener(new b$a(this));
       return false;
    }
}

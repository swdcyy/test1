package i6a.q$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import i6a.q;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.view.ViewTreeObserver;
import jl5.c;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.NullPointerException;

public final class q$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@0027aa
{
    public final q b;

    public void q$b(q p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoidWithListener(null, this, q$b.class, "1")) {
          return;
       }
       q.R8(this.b).getViewTreeObserver().removeOnGlobalLayoutListener(this);
       int i = 0x7f070271;
       if ((q.R8(this.b).getTop() - q.P8(this.b).getBottom()) < c.c(i)) {
          int i1 = (c.c(i) - (q.R8(this.b).getTop() - q.P8(this.b).getBottom())) * 2;
          q p = this.b.p;
          if (p == null) {
             a.S("cardsContainer");
          }
          ViewGroup$LayoutParams layoutParams = p.getLayoutParams();
          if (layoutParams != null) {
             float f = (float)i1;
             layoutParams.topMargin = (int)((float)c.c(0x7f07030d) - (0x3f169697 * f));
             layoutParams.bottomMargin = (int)((float)c.c(0x7f0702df) - (f * 0.41f));
             this.b.m8().requestLayout();
          }else {
             PatchProxy.onMethodExit(q$b.class, "1");
             throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          }
       }
       PatchProxy.onMethodExit(q$b.class, "1");
       return;
    }
}

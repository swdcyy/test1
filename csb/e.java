package csb.e;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.nearby.common.view.TipRefreshView;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import android.widget.ImageView;
import com.kwai.library.widget.refresh.RefreshLayout;

public class e implements ValueAnimator$AnimatorUpdateListener	// class@0023aa
{
    public int a;
    public final int b;
    public final ViewGroup$MarginLayoutParams c;
    public final ViewGroup$MarginLayoutParams d;
    public final TipRefreshView e;

    public void e(TipRefreshView p0,int p1,ViewGroup$MarginLayoutParams p2,ViewGroup$MarginLayoutParams p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
       this.a = p1;
    }
    public void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       int i = p0.getAnimatedValue().intValue();
       e tb = this.b;
       if (i == tb) {
          this.a = tb;
       }
       int i1 = this.a - i;
       e tc = this.c;
       tc.topMargin = tc.topMargin + i1;
       e td = this.d;
       td.topMargin = td.topMargin + i1;
       this.a = i;
       this.e.f.setLayoutParams(tc);
       this.e.g.setLayoutParams(this.d);
       this.e.b.setTargetOrRefreshViewOffsetY((- i1));
       return;
    }
}

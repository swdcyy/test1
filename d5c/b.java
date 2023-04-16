package d5c.b;
import erd.g;
import d5c.c;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import lnc.d2;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import z5c.o2;
import android.widget.LinearLayout$LayoutParams;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import android.widget.LinearLayout;
import android.view.View;
import android.view.ViewGroup$LayoutParams;

public final class b implements g	// class@0020e8
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       int b = p0.booleanValue();
       Objects.requireNonNull(tb);
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, uoc, "4") && tb.q != null)) {
          b = (d2.g())? d2.b(tb.getActivity()): o2.a(tb.getActivity());
          tb.p = (int)((float)b * c.t);
          b = new LinearLayout$LayoutParams(0, -1, 0x3f800000);
          tb.r = b;
          b.width = tb.p;
          tb.q.setTabLayoutParams(b);
          b = tb.q.getTabsContainer().getChildCount();
          int i = 0;
          while (i < b) {
             View childAt = tb.q.getTabsContainer().getChildAt(i);
             if (!i) {
                c r = tb.r;
                LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(r.width, r.height);
                r = tb.r;
                layoutParams.gravity = r.gravity;
                layoutParams.weight = r.weight;
                layoutParams.rightMargin = r.rightMargin;
                layoutParams.bottomMargin = r.bottomMargin;
                layoutParams.topMargin = r.topMargin;
                layoutParams.leftMargin = 0;
                childAt.setLayoutParams(layoutParams);
             }else {
                childAt.setLayoutParams(tb.r);
             }
             i = i + 1;
          }
       }
       return;
    }
}

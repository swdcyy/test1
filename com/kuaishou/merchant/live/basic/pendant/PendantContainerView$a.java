package com.kuaishou.merchant.live.basic.pendant.PendantContainerView$a;
import androidx.core.widget.NestedScrollView$b;
import com.kuaishou.merchant.live.basic.pendant.PendantContainerView;
import java.lang.Object;
import androidx.core.widget.NestedScrollView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.lang.Runnable;

public final class PendantContainerView$a implements NestedScrollView$b	// class@00189f
{
    public final PendantContainerView b;

    public void PendantContainerView$a(PendantContainerView p0){
       this.b = p0;
       super();
    }
    public final void d5(NestedScrollView p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(PendantContainerView$a.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, PendantContainerView$a.class, "1")) {
             return;
          }
       }
       PendantContainerView$a tb = this.b;
       PendantContainerView c = tb.c;
       if (c > null && (c != p2 && (!p2 || tb.getMeasuredHeight() == this.b.l().getBottom()))) {
          PendantContainerView d = this.b.d;
          if (d != null) {
             d.run();
          }
          tb = this.b;
          tb.d = null;
          tb.c = 0;
       }
       return;
    }
}

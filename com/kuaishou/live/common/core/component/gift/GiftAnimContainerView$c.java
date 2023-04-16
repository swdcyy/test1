package com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$c;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.LinearLayout;
import android.view.ViewParent;

public class GiftAnimContainerView$c implements Runnable	// class@00111a
{
    public final GiftAnimContainerView b;

    public void GiftAnimContainerView$c(GiftAnimContainerView p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, GiftAnimContainerView$c.class, "1")) {
          return;
       }
       GiftAnimContainerView$c tb = this.b;
       tb.z = false;
       tb.forceLayout();
       if (this.b.getParent() != null && !this.b.getParent().isLayoutRequested()) {
          tb = this.b;
          tb.measure(tb.A, tb.B);
          tb = this.b;
          tb.layout(tb.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
       }
       return;
    }
}

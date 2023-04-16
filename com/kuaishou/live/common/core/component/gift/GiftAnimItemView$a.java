package com.kuaishou.live.common.core.component.gift.GiftAnimItemView$a;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.gift.GiftAnimItemView;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.gift.GiftMessage;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$n;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$o;

public class GiftAnimItemView$a implements View$OnClickListener	// class@001129
{
    public final GiftAnimItemView b;

    public void GiftAnimItemView$a(GiftAnimItemView p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GiftAnimItemView$a.class, "1")) {
          return;
       }
       GiftAnimItemView$a tb = this.b;
       GiftAnimItemView h = tb.H;
       if (h != null) {
          GiftAnimItemView e = tb.E;
          if (e != null) {
             h.a(e);
             tb = this.b;
             h = tb.K;
             if (h != null) {
                GiftAnimItemView e1 = tb.E;
                h.a(e1, true, tb.n(e1));
             }
          }
       }
       return;
    }
}

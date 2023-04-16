package com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftBoxPopupView$c;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftBoxPopupView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftBoxPopupView$d;

public class LiveGiftBoxPopupView$c implements Runnable	// class@001212
{
    public final LiveGiftBoxPopupView b;

    public void LiveGiftBoxPopupView$c(LiveGiftBoxPopupView p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, LiveGiftBoxPopupView$c.class, "1")) {
          return;
       }
       this.b.getAttachTargetView().removeView(this.b);
       LiveGiftBoxPopupView$c tb = this.b;
       tb.D = false;
       LiveGiftBoxPopupView f = tb.f;
       if (f != null) {
          f.b();
       }
       return;
    }
}

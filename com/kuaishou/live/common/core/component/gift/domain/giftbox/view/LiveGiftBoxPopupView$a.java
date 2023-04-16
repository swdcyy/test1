package com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftBoxPopupView$a;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftBoxPopupView;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveGiftBoxPopupView$a implements View$OnClickListener	// class@001210
{
    public final LiveGiftBoxPopupView b;

    public void LiveGiftBoxPopupView$a(LiveGiftBoxPopupView p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftBoxPopupView$a.class, "1")) {
          return;
       }
       this.b.i();
       return;
    }
}

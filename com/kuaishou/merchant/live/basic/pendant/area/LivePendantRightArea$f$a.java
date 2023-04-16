package com.kuaishou.merchant.live.basic.pendant.area.LivePendantRightArea$f$a;
import com.kuaishou.merchant.live.basic.pendantgroup.view.MerchantViewFlipper$a;
import com.kuaishou.merchant.live.basic.pendant.area.LivePendantRightArea$f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.merchant.live.basic.pendant.area.LivePendantRightArea;
import com.kwai.library.widget.pageindicator.HorizontalPageIndicator;

public final class LivePendantRightArea$f$a implements MerchantViewFlipper$a	// class@0018a8
{
    public final LivePendantRightArea$f a;

    public void LivePendantRightArea$f$a(LivePendantRightArea$f p0){
       this.a = p0;
       super();
    }
    public final void a(int p0){
       if (PatchProxy.isSupport2(LivePendantRightArea$f$a.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, LivePendantRightArea$f$a.class, "1")) {
          return;
       }
       LivePendantRightArea v = this.a.h.v;
       if (v != null) {
          v.setPageIndex(p0);
       }
       PatchProxy.onMethodExit(LivePendantRightArea$f$a.class, "1");
       return;
    }
}

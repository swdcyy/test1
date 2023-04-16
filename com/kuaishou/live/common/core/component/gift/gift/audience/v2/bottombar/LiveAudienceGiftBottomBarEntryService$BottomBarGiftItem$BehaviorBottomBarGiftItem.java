package com.kuaishou.live.common.core.component.gift.gift.audience.v2.bottombar.LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.bottombar.LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem;
import java.lang.Object;
import java.util.LinkedHashMap;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.bottombar.LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token;
import z1.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import java.lang.Float;
import nk1.a;
import java.lang.Integer;
import nk1.c;
import nk1.b;
import java.lang.Boolean;
import nk1.e;
import ac.a;
import nk1.d;

public class LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem implements LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem	// class@00128f
{
    public final Map b;

    public void LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem(){
       super();
       this.b = new LinkedHashMap();
    }
    public final void a(LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem.class, "2")) {
          return;
       }
       this.b.put(p0, p1);
       return;
    }
    public void b(float p0){
       LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem uBottomBarGi = LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem.class;
       if (PatchProxy.isSupport(uBottomBarGi) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uBottomBarGi, "4")) {
          return;
       }
       this.a(LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token.Alpha, new a(p0));
       return;
    }
    public void m(int p0){
       LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem uBottomBarGi = LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem.class;
       if (PatchProxy.isSupport(uBottomBarGi) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uBottomBarGi, "7")) {
          return;
       }
       this.a(LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token.Background, new c(p0));
       return;
    }
    public void o(int p0){
       LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem uBottomBarGi = LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem.class;
       if (PatchProxy.isSupport(uBottomBarGi) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uBottomBarGi, "5")) {
          return;
       }
       this.a(LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token.ResId, new b(p0));
       return;
    }
    public void setEnabled(boolean p0){
       LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem uBottomBarGi = LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem.class;
       if (PatchProxy.isSupport(uBottomBarGi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uBottomBarGi, "3")) {
          return;
       }
       this.a(LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token.Enabled, new e(p0));
       return;
    }
    public void x(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem.class, "6")) {
          return;
       }
       this.a(LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem$Token.Controller, new d(p0));
       return;
    }
}

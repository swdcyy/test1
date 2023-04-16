package com.kuaishou.live.common.core.component.gift.gift.audience.v2.bottombar.LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$b;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.bottombar.LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem;
import androidx.lifecycle.MutableLiveData;
import ok1.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Boolean;
import ac.a;

public class LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$b implements LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem	// class@001291
{
    public final MutableLiveData b;
    public final c c;

    public void LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$b(MutableLiveData p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$b.class, "1")) {
          return;
       }
       this.b.setValue(this.c);
       return;
    }
    public void b(float p0){
       LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$b uBottomBarGi = LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$b.class;
       if (PatchProxy.isSupport(uBottomBarGi) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uBottomBarGi, "3")) {
          return;
       }
       this.c.b(p0);
       this.a();
       return;
    }
    public void m(int p0){
       LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$b uBottomBarGi = LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$b.class;
       if (PatchProxy.isSupport(uBottomBarGi) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uBottomBarGi, "6")) {
          return;
       }
       this.c.m(p0);
       this.a();
       return;
    }
    public void o(int p0){
       LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$b uBottomBarGi = LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$b.class;
       if (PatchProxy.isSupport(uBottomBarGi) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uBottomBarGi, "4")) {
          return;
       }
       this.c.o(p0);
       this.a();
       return;
    }
    public void setEnabled(boolean p0){
       LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$b uBottomBarGi = LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$b.class;
       if (PatchProxy.isSupport(uBottomBarGi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uBottomBarGi, "2")) {
          return;
       }
       this.c.setEnabled(p0);
       this.a();
       return;
    }
    public void x(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$b.class, "5")) {
          return;
       }
       this.c.x(p0);
       this.a();
       return;
    }
}

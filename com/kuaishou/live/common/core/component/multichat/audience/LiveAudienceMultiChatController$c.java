package com.kuaishou.live.common.core.component.multichat.audience.LiveAudienceMultiChatController$c;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multichat.audience.LiveAudienceMultiChatController;
import java.lang.Object;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lp1.b;

public final class LiveAudienceMultiChatController$c implements Observer	// class@0014b8
{
    public final LiveAudienceMultiChatController b;

    public void LiveAudienceMultiChatController$c(LiveAudienceMultiChatController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiChatController$c.class, "1")) {
       }else if(p0 != null){
          this.b.w.M(p0);
          this.b.w.z0(p0.c());
          this.b.w.c();
       }
       return;
    }
}

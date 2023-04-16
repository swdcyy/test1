package com.kuaishou.live.common.multiinteract.presenter.audience.LiveAudienceMultiInteractManagerImpl$a;
import com.kwai.video.waynelive.listeners.LivePlayerTypeChangeListener;
import com.kuaishou.live.common.multiinteract.presenter.audience.LiveAudienceMultiInteractManagerImpl;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import sz1.m;
import com.kuaishou.live.common.multiinteract.biz.adapter.a;

public final class LiveAudienceMultiInteractManagerImpl$a implements LivePlayerTypeChangeListener	// class@0017ef
{
    public final LiveAudienceMultiInteractManagerImpl b;

    public void LiveAudienceMultiInteractManagerImpl$a(LiveAudienceMultiInteractManagerImpl p0){
       this.b = p0;
       super();
    }
    public final void onLiveTypeChange(int p0){
       LiveAudienceMultiInteractManagerImpl$a uoa = LiveAudienceMultiInteractManagerImpl$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       m h = this.b.h;
       if (h != null) {
          h.V(p0);
       }
       return;
    }
}

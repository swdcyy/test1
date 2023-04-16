package com.kuaishou.live.lite.adapter.component.multiinteract.LiveLiteMultiInteractManagerImpl$b;
import com.kwai.video.waynelive.listeners.LivePlayerTypeChangeListener;
import com.kuaishou.live.lite.adapter.component.multiinteract.LiveLiteMultiInteractManagerImpl;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import sz1.m;
import com.kuaishou.live.common.multiinteract.biz.adapter.a;

public final class LiveLiteMultiInteractManagerImpl$b implements LivePlayerTypeChangeListener	// class@001df9
{
    public final LiveLiteMultiInteractManagerImpl b;

    public void LiveLiteMultiInteractManagerImpl$b(LiveLiteMultiInteractManagerImpl p0){
       this.b = p0;
       super();
    }
    public final void onLiveTypeChange(int p0){
       LiveLiteMultiInteractManagerImpl$b uob = LiveLiteMultiInteractManagerImpl$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       m h = this.b.h;
       if (h != null) {
          h.V(p0);
       }
       return;
    }
}

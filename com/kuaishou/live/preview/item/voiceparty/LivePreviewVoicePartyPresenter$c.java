package com.kuaishou.live.preview.item.voiceparty.LivePreviewVoicePartyPresenter$c;
import erd.g;
import com.kuaishou.live.preview.item.voiceparty.LivePreviewVoicePartyPresenter;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import brd.y;
import qrd.l1;

public final class LivePreviewVoicePartyPresenter$c implements g	// class@000e5b
{
    public final LivePreviewVoicePartyPresenter b;

    public void LivePreviewVoicePartyPresenter$c(LivePreviewVoicePartyPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePreviewVoicePartyPresenter$c.class, "1")) {
       }else {
          Boolean uBoolean = 1;
          if (p0 != null && p0.intValue() == uBoolean) {
             this.b.D.onNext(Boolean.TRUE);
             this.b.E.onNext(l1.a);
          }
       }
       return;
    }
}

package com.kuaishou.live.preview.item.voiceparty.LivePreviewVoicePartyPresenter$b;
import d6a.a;
import com.kuaishou.live.preview.item.voiceparty.LivePreviewVoicePartyPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import brd.y;

public final class LivePreviewVoicePartyPresenter$b extends a	// class@000e5a
{
    public final LivePreviewVoicePartyPresenter b;

    public void LivePreviewVoicePartyPresenter$b(LivePreviewVoicePartyPresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, LivePreviewVoicePartyPresenter$b.class, "2")) {
          return;
       }
       this.b.D.onNext(Boolean.TRUE);
       this.b.W8();
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, LivePreviewVoicePartyPresenter$b.class, "1")) {
          return;
       }
       this.b.V8();
       this.b.D.onNext(Boolean.FALSE);
       return;
    }
}

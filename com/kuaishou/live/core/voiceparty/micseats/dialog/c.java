package com.kuaishou.live.core.voiceparty.micseats.dialog.c;
import ox2.d;
import com.kuaishou.live.core.voiceparty.micseats.dialog.LiveVoicePartyActionPanelFragment;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import ys2.d;
import erd.g;
import crd.b;

public class c implements d	// class@00159f
{
    public final d a;
    public final LiveVoicePartyActionPanelFragment b;

    public void c(LiveVoicePartyActionPanelFragment p0,d p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       t.timer(100, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new d(this));
       this.a.a(p0);
       return;
    }
}

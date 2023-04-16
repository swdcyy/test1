package com.kwai.video.krtc.a$1;
import com.kwai.video.stannis.observers.StannisLogObserver;
import com.kwai.video.krtc.observers.AryaLogObserver;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;

public final class a$1 implements StannisLogObserver	// class@00076d
{
    public final AryaLogObserver a;

    public void a$1(AryaLogObserver p0){
       this.a = p0;
       super();
    }
    public void onLog(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$1.class, "1")) {
          return;
       }
       a$1 ta = this.a;
       if (ta != null) {
          ta.onLog("[Stannis]"+p0);
       }
       return;
    }
}

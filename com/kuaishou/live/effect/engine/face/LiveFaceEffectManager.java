package com.kuaishou.live.effect.engine.face.LiveFaceEffectManager;
import com.kuaishou.live.effect.base.Manager;
import androidx.lifecycle.LifecycleOwner;
import qr5.b;
import vy2.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import sy2.c;
import com.kuaishou.live.effect.engine.face.LiveFaceEffectManager$faceObserver$1;
import ky2.a$a;
import ky2.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qr5.b$a;
import java.util.Objects;
import e93.f;

public final class LiveFaceEffectManager extends Manager	// class@001aff
{
    public final c c;
    public final LiveFaceEffectManager$faceObserver$1 d;
    public final b e;
    public final a f;

    public void LiveFaceEffectManager(LifecycleOwner p0,b p1,a p2){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "streamInfoReader");
       a.p(p2, "dependency");
       super(p0);
       this.e = p1;
       this.f = p2;
       c uoc = new c(p1);
       this.c = uoc;
       LiveFaceEffectManager$faceObserver$1 uofaceObserv = new LiveFaceEffectManager$faceObserver$1(this);
       this.d = uofaceObserv;
       uoc.a(p0, uofaceObserv);
       if (PatchProxy.applyVoid(null, uoc, c.class, "1")) {
       }else {
          uoc.h.oi(uoc);
       }
       return;
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFaceEffectManager.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       super.onDestroy(p0);
       LiveFaceEffectManager tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, c.class, "2")) {
          tc.h.j8(tc);
          f.g(tc);
       }
       return;
    }
}

package com.kuaishou.live.effect.engine.face.LiveFaceEffectManager$faceObserver$1;
import ky2.a$a;
import com.kuaishou.live.effect.engine.face.LiveFaceEffectManager;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvStreamMessage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFaceTransDataMessage;
import vy2.a;
import ky2.a$a$a;

public final class LiveFaceEffectManager$faceObserver$1 implements a$a	// class@001afe
{
    public final LiveFaceEffectManager b;

    public void LiveFaceEffectManager$faceObserver$1(LiveFaceEffectManager p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveFaceEffectManager$faceObserver$1.class, "1")) {
       }else {
          a.p(p0, "source");
          if (p2 != null) {
             p1 = p2.facePointInfo;
             a.o(p1, "newValue.facePointInfo");
             this.b.f.a(p1);
          }
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveFaceEffectManager$faceObserver$1.class, "2")) {
       }else {
          a.p(p0, "source");
          a$a$a.a(this, p0, p1, p2);
       }
       return;
    }
}

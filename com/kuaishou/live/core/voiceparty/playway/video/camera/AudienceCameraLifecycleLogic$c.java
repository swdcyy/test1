package com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceCameraLifecycleLogic$c;
import erd.g;
import com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceCameraLifecycleLogic;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import ts2.f;
import java.util.Collection;
import ts2.d;
import ts2.e;

public final class AudienceCameraLifecycleLogic$c implements g	// class@0018bc
{
    public final AudienceCameraLifecycleLogic b;

    public void AudienceCameraLifecycleLogic$c(AudienceCameraLifecycleLogic p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b1;
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceCameraLifecycleLogic$c.class, "1")) {
       }else {
          AudienceCameraLifecycleLogic$c tb = this.b;
          QCurrentUser qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, "QCurrentUser.me\(\)");
          String id = qCurrentUser.getId();
          a.o(id, "QCurrentUser.me\(\).id");
          Objects.requireNonNull(tb);
          Object obj = PatchProxy.applyOneRefs(id, tb, AudienceCameraLifecycleLogic.class, "5");
          boolean b = false;
          if (obj != PatchProxyResult.class) {
             b1 = obj.booleanValue();
          }else if(e.a(tb.e.b(), id) != null){
             b1 = true;
          }else {
             b1 = false;
          }
          AudienceCameraLifecycleLogic$c tb1 = this.b;
          a.o(p0, "it");
          if (p0.booleanValue() && b1) {
             b = true;
          }
          tb1.c = b;
       }
       return;
    }
}

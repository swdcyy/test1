package com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceVideoCameraControlViewController$a;
import erd.g;
import com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceVideoCameraControlViewController;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import ev2.n;

public final class AudienceVideoCameraControlViewController$a implements g	// class@0018c0
{
    public final AudienceVideoCameraControlViewController b;

    public void AudienceVideoCameraControlViewController$a(AudienceVideoCameraControlViewController p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceVideoCameraControlViewController$a.class, "1")) {
       }else {
          QCurrentUser qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, "QCurrentUser.me\(\)");
          String id = qCurrentUser.getId();
          a.o(id, "QCurrentUser.me\(\).id");
          boolean b = this.b.X2(id);
          AudienceVideoCameraControlViewController$a tb = this.b;
          a.o(p0, "it");
          boolean b1 = (p0.booleanValue() && b)? true: false;
          tb.m = b1;
          if (!b) {
             b1 = this.b.n;
             if (b1 != null) {
                b1.a();
             }
             b1.n = null;
          }
       }
       return;
    }
}

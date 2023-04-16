package com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceVideoCameraControlViewController$videoOpenInviteListener$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceVideoCameraControlViewController$b;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceVideoCameraControlViewController;
import iv2.b;
import com.kwai.framework.model.user.QCurrentUser;

public final class AudienceVideoCameraControlViewController$videoOpenInviteListener$1$1 extends Lambda implements l	// class@0018c9
{
    public final AudienceVideoCameraControlViewController$b this$0;

    public void AudienceVideoCameraControlViewController$videoOpenInviteListener$1$1(AudienceVideoCameraControlViewController$b p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(l1 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceVideoCameraControlViewController$videoOpenInviteListener$1$1.class, "1")) {
          return;
       }
       a.p(p0, "ignore");
       this.this$0.b.A.l(true);
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       String id = qCurrentUser.getId();
       a.o(id, "QCurrentUser.me\(\).id");
       this.this$0.b.Y2(id, true);
       return;
    }
}

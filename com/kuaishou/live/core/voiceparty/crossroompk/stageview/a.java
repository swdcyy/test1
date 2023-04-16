package com.kuaishou.live.core.voiceparty.crossroompk.stageview.a;
import com.kuaishou.live.core.voiceparty.crossroompk.stageview.anchor.VoicePartyCrossRoomPkAnchorAndTopContributorView$c;
import com.kuaishou.live.core.voiceparty.crossroompk.stageview.VoicePartyCrossRoomPkStageView;
import java.lang.Object;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.crossroompk.stageview.VoicePartyCrossRoomPkStageView$b;

public class a implements VoicePartyCrossRoomPkAnchorAndTopContributorView$c	// class@001484
{
    public final VoicePartyCrossRoomPkStageView a;

    public void a(VoicePartyCrossRoomPkStageView p0){
       this.a = p0;
       super();
    }
    public void a(UserInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       VoicePartyCrossRoomPkStageView l = this.a.L;
       if (l != null) {
          l.a(p0);
       }
       return;
    }
    public void b(UserInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       VoicePartyCrossRoomPkStageView l = this.a.L;
       if (l != null) {
          l.b(p0);
       }
       return;
    }
}

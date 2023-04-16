package com.kuaishou.live.core.voiceparty.crossroompk.stageview.anchor.VoicePartyCrossRoomPkAnchorAndTopContributorView$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.voiceparty.crossroompk.stageview.anchor.VoicePartyCrossRoomPkAnchorAndTopContributorView;
import com.kwai.framework.model.user.UserInfo;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.crossroompk.stageview.anchor.VoicePartyCrossRoomPkAnchorAndTopContributorView$c;

public class VoicePartyCrossRoomPkAnchorAndTopContributorView$a extends m	// class@001485
{
    public final UserInfo c;
    public final VoicePartyCrossRoomPkAnchorAndTopContributorView d;

    public void VoicePartyCrossRoomPkAnchorAndTopContributorView$a(VoicePartyCrossRoomPkAnchorAndTopContributorView p0,UserInfo p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyCrossRoomPkAnchorAndTopContributorView$a.class, "1")) {
          return;
       }
       VoicePartyCrossRoomPkAnchorAndTopContributorView k = this.d.k;
       if (k != null) {
          VoicePartyCrossRoomPkAnchorAndTopContributorView$a tc = this.c;
          if (tc != null) {
             k.a(tc);
          }
       }
       return;
    }
}

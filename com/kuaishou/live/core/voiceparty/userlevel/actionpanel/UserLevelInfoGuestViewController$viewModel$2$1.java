package com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoGuestViewController$viewModel$2$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoGuestViewController$viewModel$2;
import com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoGuestViewController;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger;

public final class UserLevelInfoGuestViewController$viewModel$2$1 extends Lambda implements a	// class@001a55
{
    public final UserLevelInfoGuestViewController$viewModel$2 this$0;

    public void UserLevelInfoGuestViewController$viewModel$2$1(UserLevelInfoGuestViewController$viewModel$2 p0){
       this.this$0 = p0;
       super(0);
    }
    public final UserLevelInfoViewModel invoke(){
       Object obj = PatchProxy.apply(null, this, UserLevelInfoGuestViewController$viewModel$2$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       UserLevelInfoGuestViewController$viewModel$2 this$0 = this.this$0.this$0;
       return new UserLevelInfoViewModel(true, this$0.k, this$0.l);
    }
    public Object invoke(){
       return this.invoke();
    }
}

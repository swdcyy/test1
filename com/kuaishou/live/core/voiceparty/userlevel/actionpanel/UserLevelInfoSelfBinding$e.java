package com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoSelfBinding$e;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoViewModel;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoViewModel$c$a;
import com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoViewModel$ClickSource;
import com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoViewModel$c;

public final class UserLevelInfoSelfBinding$e implements View$OnClickListener	// class@001a5f
{
    public final UserLevelInfoViewModel b;

    public void UserLevelInfoSelfBinding$e(UserLevelInfoViewModel p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserLevelInfoSelfBinding$e.class, "1")) {
          return;
       }
       this.b.v0(new UserLevelInfoViewModel$c$a(UserLevelInfoViewModel$ClickSource.CLICK_BUTTON));
       return;
    }
}

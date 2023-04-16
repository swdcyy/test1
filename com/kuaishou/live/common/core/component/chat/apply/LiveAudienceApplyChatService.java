package com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService;
import lp3.c;
import android.app.Activity;
import xp5.i;
import java.lang.String;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService$b;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService$a;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService$State;
import android.view.View;

public interface abstract LiveAudienceApplyChatService implements c	// class@00102f
{

    boolean Ai();
    void Ec(Activity p0,i p1,boolean p2,String p3);
    String G3(String p0);
    void Jb(boolean p0);
    void Od(LiveAudienceApplyChatService$b p0);
    void ai(LiveAudienceApplyChatService$a p0);
    void c9(boolean p0);
    void eb(LiveAudienceApplyChatService$b p0);
    void gk(String p0,String p1);
    boolean isEnabled();
    LiveAudienceApplyChatService$State jh();
    void t8(int p0,String p1);
    void uj(View p0);
    int xb();
}

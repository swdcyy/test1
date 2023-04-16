package com.kwai.social.startup.reminder.model.IMVideoTalkConfig;
import java.io.Serializable;
import com.kwai.social.startup.reminder.model.IMVideoTalkConfig$a;
import nsd.u;
import java.lang.Object;

public final class IMVideoTalkConfig implements Serializable	// class@0018d1
{
    public final boolean canUseVideoTalk;
    public final int videoTalkABResult;
    public static final IMVideoTalkConfig$a Companion;
    public static final long serialVersionUID;

    static {
       IMVideoTalkConfig.Companion = new IMVideoTalkConfig$a(null);
    }
    public void IMVideoTalkConfig(boolean p0,int p1){
       super();
       this.canUseVideoTalk = p0;
       this.videoTalkABResult = p1;
    }
    public final boolean getCanUseVideoTalk(){
       return this.canUseVideoTalk;
    }
    public final int getVideoTalkABResult(){
       return this.videoTalkABResult;
    }
}

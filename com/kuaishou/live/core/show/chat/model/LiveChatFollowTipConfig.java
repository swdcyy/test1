package com.kuaishou.live.core.show.chat.model.LiveChatFollowTipConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;

public class LiveChatFollowTipConfig implements Serializable	// class@000a1a
{
    public String mAudienceChatBubbleTipContent;
    public long[] mAudienceChatBubbleTipDelayTimeGaps;
    public static final long serialVersionUID = 0x25f20b02c6feace8;

    public void LiveChatFollowTipConfig(){
       super();
    }
    public boolean isValid(){
       LiveChatFollowTipConfig obj = PatchProxy.apply(null, this, LiveChatFollowTipConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mAudienceChatBubbleTipDelayTimeGaps;
       boolean b = (obj != null && (obj.length > 0 && !TextUtils.isEmpty(this.mAudienceChatBubbleTipContent)))? true: false;
       return b;
    }
}

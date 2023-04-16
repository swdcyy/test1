package com.kuaishou.live.core.show.chat.model.LiveAudienceChatStatConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveAudienceChatStatConfig implements Serializable	// class@000a15
{
    public boolean mIsFriend;
    public static final long serialVersionUID = 0x5395f2abc0f9a4fb;

    public void LiveAudienceChatStatConfig(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceChatStatConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveAudienceChatStatConfig{mIsFriend="+this.mIsFriend+'}';
    }
}

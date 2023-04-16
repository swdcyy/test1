package com.kuaishou.live.core.voiceparty.channel.feed.VoicePartyChannelFeedResponse;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class VoicePartyChannelFeedResponse implements Serializable, b	// class@00136e
{
    public String mCursor;
    public List mItems;
    public String mLlsid;
    public static final long serialVersionUID = 0x5a358016b4a926ac;

    public void VoicePartyChannelFeedResponse(){
       super();
    }
    public List getItems(){
       return this.mItems;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, VoicePartyChannelFeedResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}

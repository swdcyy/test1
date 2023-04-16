package com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainConfig;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainResource;

public class LiveRedPackRainConfig implements Serializable, a	// class@000f01
{
    public int mDisplayIntervalMillis;
    public String mGroupId;
    public String mRedPackRainId;
    public LiveRedPackRainResource mRedPackRainResource;
    public String mResourceId;
    public long mResourceMaxDelayMillis;
    public static final long serialVersionUID = 0x5ef95ad5de86d42e;

    public void LiveRedPackRainConfig(){
       super();
    }
    public void afterDeserialize(){
       LiveRedPackRainConfig tmRedPackRai = this.mRedPackRainResource;
       if (tmRedPackRai != null) {
          tmRedPackRai.mResourceId = this.mResourceId;
       }
       return;
    }
}

package com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarRollUserResponse;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarRollUserResponse$RollUserV2PanelResources;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.Collection;
import com.kuaishou.live.core.show.luckystar.util.b;

public class LiveLuckyStarRollUserResponse implements Serializable	// class@000cde
{
    public List mBackgroundUrls;
    public boolean mHideOpenResult;
    public LiveLuckyStarRollUserResponse$RollUserV2PanelResources mRollUserV2PanelResources;
    public List mRollUsers;
    public String mSubTitle;
    public static final long serialVersionUID = 0x82838d3ed65b46fe;

    public void LiveLuckyStarRollUserResponse(){
       super();
    }
    public LiveLuckyStarRollUserResponse$RollUserV2PanelResources getRollUserV2PanelResources(){
       LiveLuckyStarRollUserResponse obj = PatchProxy.apply(null, this, LiveLuckyStarRollUserResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mRollUserV2PanelResources;
       if (obj == null) {
          LiveLuckyStarRollUserResponse$RollUserV2PanelResources rollUserV2Pa = new LiveLuckyStarRollUserResponse$RollUserV2PanelResources();
       }
       return obj;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveLuckyStarRollUserResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveLuckyStarRollUserResponse{mRollUsers="+b.d(this.mRollUsers)+", mBackgroundUrls="+b.d(this.mBackgroundUrls)+", mHideOpenResult="+this.mHideOpenResult+'}';
    }
}

package com.kuaishou.live.common.core.component.authority.LiveAnchorSwitchAuthority;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class LiveAnchorSwitchAuthority implements Serializable	// class@000f6f
{
    public boolean mDisableStopPushGuide;
    public boolean mEnableLiveBulletin;
    public boolean mEnableLiveEntryToolBarShowSubscribe;
    public LiveAnchorLocationConfig mLocationInfoPopupConfig;
    public static final long serialVersionUID = 0xc065527544745d22;

    public void LiveAnchorSwitchAuthority(){
       super();
    }
    public static LiveAnchorSwitchAuthority createDefault(){
       Object obj = PatchProxy.apply(null, null, LiveAnchorSwitchAuthority.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveAnchorSwitchAuthority();
    }
}

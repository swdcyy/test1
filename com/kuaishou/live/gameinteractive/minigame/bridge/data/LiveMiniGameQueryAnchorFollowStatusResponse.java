package com.kuaishou.live.gameinteractive.minigame.bridge.data.LiveMiniGameQueryAnchorFollowStatusResponse;
import com.kuaishou.live.gameinteractive.minigame.bridge.data.LiveMiniGameBridgeCommonResponse;
import com.kuaishou.live.external.invoke.gzone.model.GameAnchorFollowInfo;

public class LiveMiniGameQueryAnchorFollowStatusResponse extends LiveMiniGameBridgeCommonResponse	// class@001be2
{
    public GameAnchorFollowInfo info;
    public static final long serialVersionUID = 0x2361c8aaf5d339f;

    public void LiveMiniGameQueryAnchorFollowStatusResponse(GameAnchorFollowInfo p0){
       super();
       this.info = p0;
    }
}

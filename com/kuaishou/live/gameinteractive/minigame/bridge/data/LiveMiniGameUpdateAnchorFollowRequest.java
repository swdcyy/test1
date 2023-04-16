package com.kuaishou.live.gameinteractive.minigame.bridge.data.LiveMiniGameUpdateAnchorFollowRequest;
import java.io.Serializable;
import java.lang.Object;

public class LiveMiniGameUpdateAnchorFollowRequest implements Serializable	// class@001be6
{
    public int follow;
    public static final long serialVersionUID = 0xc82a7322b10392d2;

    public void LiveMiniGameUpdateAnchorFollowRequest(){
       super();
    }
    public boolean isFollow(){
       boolean b = true;
       if (this.follow == b) {
       }else {
          b = false;
       }
       return b;
    }
}

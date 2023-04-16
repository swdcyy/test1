package com.kuaishou.live.gameinteractive.minigame.bridge.data.LiveMiniGameBridgeCommonResponse;
import java.io.Serializable;
import java.lang.Object;

public class LiveMiniGameBridgeCommonResponse implements Serializable	// class@001bde
{
    public int code;
    public String msg;
    public static final long serialVersionUID = 0xf9e9b5f63add9e8;

    public void LiveMiniGameBridgeCommonResponse(){
       super();
       this.code = 1;
    }
}

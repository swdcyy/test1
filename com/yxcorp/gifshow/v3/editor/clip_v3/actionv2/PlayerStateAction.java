package com.yxcorp.gifshow.v3.editor.clip_v3.actionv2.PlayerStateAction;
import xvc.b;
import nsd.u;

public final class PlayerStateAction extends b	// class@000db4
{
    public final boolean playerState;

    public void PlayerStateAction(){
       super(false, 1, null);
    }
    public void PlayerStateAction(boolean p0){
       super();
       this.playerState = p0;
    }
    public void PlayerStateAction(boolean p0,int p1,u p2){
       if (p1 & 1) {
          p0 = true;
       }
       super(p0);
       return;
    }
    public final boolean getPlayerState(){
       return this.playerState;
    }
}

package com.yxcorp.gifshow.v3.editor.effectv2.action.EffectPlayerStateAction;
import xvc.b;
import nsd.u;

public final class EffectPlayerStateAction extends b	// class@000f32
{
    public final boolean playerState;
    public final double totalTime;

    public void EffectPlayerStateAction(boolean p0,double p1){
       super();
       this.playerState = p0;
       this.totalTime = p1;
    }
    public void EffectPlayerStateAction(boolean p0,double p1,int p2,u p3){
       if (p2 & 1) {
          p0 = true;
       }
       super(p0, p1);
       return;
    }
    public final boolean getPlayerState(){
       return this.playerState;
    }
    public final double getTotalTime(){
       return this.totalTime;
    }
}

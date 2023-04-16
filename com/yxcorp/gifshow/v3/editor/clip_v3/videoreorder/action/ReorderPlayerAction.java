package com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.action.ReorderPlayerAction;
import xvc.b;
import nsd.u;

public final class ReorderPlayerAction extends b	// class@000e05
{
    public final int currentPosition;
    public final boolean holdOnCurrentState;
    public final boolean play;

    public void ReorderPlayerAction(boolean p0,boolean p1,int p2){
       super();
       this.play = p0;
       this.holdOnCurrentState = p1;
       this.currentPosition = p2;
    }
    public void ReorderPlayerAction(boolean p0,boolean p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = false;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final int getCurrentPosition(){
       return this.currentPosition;
    }
    public final boolean getHoldOnCurrentState(){
       return this.holdOnCurrentState;
    }
    public final boolean getPlay(){
       return this.play;
    }
}

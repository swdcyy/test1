package com.yxcorp.gifshow.v3.editor.music_v2.action.RapListResultAction;
import xvc.b;
import trc.t0;

public final class RapListResultAction extends b	// class@001085
{
    public final t0 nextRapStyle;
    public final boolean supportSwitch;

    public void RapListResultAction(boolean p0,t0 p1){
       super();
       this.supportSwitch = p0;
       this.nextRapStyle = p1;
    }
    public final t0 getNextRapStyle(){
       return this.nextRapStyle;
    }
    public final boolean getSupportSwitch(){
       return this.supportSwitch;
    }
}
